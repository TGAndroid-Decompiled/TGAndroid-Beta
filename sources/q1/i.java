package q1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.l;
public final class i implements TextWatcher {
    public final EditText f46212a;
    public h f46213b;
    public boolean f46214c = true;

    public i(EditText editText) {
        this.f46212a = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l a2 = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                a2.getClass();
                length = editableText.length();
            }
            a2.e(0, length, editableText);
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
        EditText editText = this.f46212a;
        if (!editText.isInEditMode() && this.f46214c && l.f1353j != null && i11 <= i12 && (charSequence instanceof Spannable)) {
            int b10 = l.a().b();
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 3) {
                        return;
                    }
                } else {
                    l.a().e(i10, i12 + i10, (Spannable) charSequence);
                    return;
                }
            }
            l a2 = l.a();
            if (this.f46213b == null) {
                this.f46213b = new h(editText);
            }
            a2.f(this.f46213b);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
