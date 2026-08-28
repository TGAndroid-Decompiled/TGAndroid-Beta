package q1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.k;
public final class i implements TextWatcher {
    public final EditText f45911a;
    public h f45912b;
    public boolean f45913c = true;

    public i(EditText editText) {
        this.f45911a = editText;
    }

    public static void a(EditText editText, int i9) {
        int length;
        if (i9 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            k a2 = k.a();
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
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        EditText editText = this.f45911a;
        if (!editText.isInEditMode() && this.f45913c && k.f856j != null && i10 <= i11 && (charSequence instanceof Spannable)) {
            int b10 = k.a().b();
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 3) {
                        return;
                    }
                } else {
                    k.a().e(i9, i11 + i9, (Spannable) charSequence);
                    return;
                }
            }
            k a2 = k.a();
            if (this.f45912b == null) {
                this.f45912b = new h(editText);
            }
            a2.f(this.f45912b);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
