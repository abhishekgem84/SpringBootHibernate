package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Note generated by hbm2java
 */
@Entity
@Table(name = "note", schema = "public")
public class Note implements java.io.Serializable {

	private int id;
	private RegisteredUser registeredUser;
	private int profileId;
	private String note;
	private Date entryDate;
	private int noteStatus;
	private Set<NoteMedia> noteMedias = new HashSet<NoteMedia>(0);

	public Note() {
	}

	public Note(int id, RegisteredUser registeredUser, int profileId, String note, Date entryDate, int noteStatus) {
		this.id = id;
		this.registeredUser = registeredUser;
		this.profileId = profileId;
		this.note = note;
		this.entryDate = entryDate;
		this.noteStatus = noteStatus;
	}

	public Note(int id, RegisteredUser registeredUser, int profileId, String note, Date entryDate, int noteStatus,
			Set<NoteMedia> noteMedias) {
		this.id = id;
		this.registeredUser = registeredUser;
		this.profileId = profileId;
		this.note = note;
		this.entryDate = entryDate;
		this.noteStatus = noteStatus;
		this.noteMedias = noteMedias;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id", nullable = false)
	public RegisteredUser getRegisteredUser() {
		return this.registeredUser;
	}

	public void setRegisteredUser(RegisteredUser registeredUser) {
		this.registeredUser = registeredUser;
	}

	@Column(name = "profile_id", nullable = false)
	public int getProfileId() {
		return this.profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	@Column(name = "note", nullable = false, length = 1000)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "entry_date", nullable = false, length = 29)
	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	@Column(name = "note_status", nullable = false)
	public int getNoteStatus() {
		return this.noteStatus;
	}

	public void setNoteStatus(int noteStatus) {
		this.noteStatus = noteStatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "note")
	public Set<NoteMedia> getNoteMedias() {
		return this.noteMedias;
	}

	public void setNoteMedias(Set<NoteMedia> noteMedias) {
		this.noteMedias = noteMedias;
	}

}
