package phase2Services;

import phase1.Note;
import phase1.Etudiant;
import phase1.Filiere;
import java.util.ArrayList;
public class NoteServices {
    public static Note addNote(float note, Etudiant etudiant, Filiere filiere) {
        Note newNote = new Note(note, etudiant, filiere);
        DB.notes.add(newNote);
        return newNote;
    }
    public static Note updateNote(int noteId, float newNote) {
        for (Note note : DB.notes) {
            if (note.getId() == noteId) {
                note.setNote(newNote);
                return note;
            }
        }
        return null;
    }
    public static void deleteNoteById(int noteId) {
        Note noteToRemove = getNoteById(noteId);
        if (noteToRemove != null) {
            DB.notes.remove(noteToRemove);
        }
    }
    public static Note getNoteById(int noteId) {
        for (Note note : DB.notes) {
            if (note.getId() == noteId) {
                return note;
            }
        }
        return null;
    }
    public static ArrayList<Note> getAllNotes() {
        return DB.notes;
    }
}