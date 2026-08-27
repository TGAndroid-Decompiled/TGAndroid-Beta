package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class ts implements TextWatcher {

    public final EditTextBoldCursor f43001a;

    public ts(EditTextBoldCursor editTextBoldCursor) {
        this.f43001a = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        try {
            String string = editable.toString();
            if (string.isEmpty()) {
                return;
            }
            int iIntValue = Utilities.parseInt((CharSequence) string).intValue();
            EditTextBoldCursor editTextBoldCursor = this.f43001a;
            if (iIntValue < 0) {
                editTextBoldCursor.setText("0");
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            }
            if (iIntValue > 300) {
                editTextBoldCursor.setText("300");
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            }
            if (string.equals("" + iIntValue)) {
                return;
            }
            editTextBoldCursor.setText("" + iIntValue);
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
