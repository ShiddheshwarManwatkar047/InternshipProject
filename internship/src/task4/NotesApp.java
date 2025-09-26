package com.task4;

import java.io.*;
import java.util.Scanner;

public class NotesApp {
    private static final String FILE_NAME = "notes.txt";

    // Add a new note (append in file)
    public static void addNote(String note) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(note + System.lineSeparator());
            System.out.println("✅ Note saved.");
        } catch (IOException e) {
            System.out.println("❌ Error saving note: " + e.getMessage());
        }
    }

    // View all notes
    public static void viewNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n📒 Saved Notes:");
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("❌ No notes found. Please add some first.");
        } catch (IOException e) {
            System.out.println("❌ Error reading notes: " + e.getMessage());
        }
    }

    // Clear all notes (overwrite with empty text)
    public static void clearNotes() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write("");
            System.out.println("🧹 All notes cleared.");
        } catch (IOException e) {
            System.out.println("❌ Error clearing notes: " + e.getMessage());
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Notes App =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Clear Notes");
            System.out.println("4. Exit");
            System.out.print("👉 Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Write your note: ");
                    String note = sc.nextLine();
                    addNote(note);
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    clearNotes();
                    break;
                case 4:
                    System.out.println("👋 Exiting Notes App...");
                    break;
                default:
                    System.out.println("❌ Invalid choice, try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
