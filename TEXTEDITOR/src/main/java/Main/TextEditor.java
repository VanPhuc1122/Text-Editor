/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.TextEditorController;
import Model.TextModel;
import View.TextView;

/**
 *
 * @author Admin
 */
public class TextEditor {
    public static void main(String[] args) {
        TextModel model = new TextModel();
        TextView view = new TextView();
        TextEditorController controller = new TextEditorController(model, view);
    }
}
