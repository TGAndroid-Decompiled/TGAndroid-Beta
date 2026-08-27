package q1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.l;

public final class i implements TextWatcher {

    public final EditText f46075a;

    public h f46076b;

    public boolean f46077c = true;

    public i(EditText editText) {
        this.f46075a = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l lVarA = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                lVarA.getClass();
                length = editableText.length();
            }
            lVarA.e(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f46075a;
        if (editText.isInEditMode() || !this.f46077c || l.f1358j == null || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = l.a().b();
        if (iB != 0) {
            if (iB == 1) {
                l.a().e(i10, i12 + i10, (Spannable) charSequence);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        l lVarA = l.a();
        if (this.f46076b == null) {
            this.f46076b = new h(editText);
        }
        lVarA.f(this.f46076b);
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
