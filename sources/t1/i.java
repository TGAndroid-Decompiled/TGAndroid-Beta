package t1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.l;
public final class i implements TextWatcher {
    public final EditText f55379a;
    public h f55380b;
    public boolean f55381c = true;

    public i(EditText editText) {
        this.f55379a = editText;
    }

    public static void a(EditText editText, int i7) {
        int length;
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l a10 = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.e(0, length, editableText);
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
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        EditText editText = this.f55379a;
        if (!editText.isInEditMode() && this.f55381c && l.f2309j != null && i10 <= i11 && (charSequence instanceof Spannable)) {
            int b10 = l.a().b();
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 3) {
                        return;
                    }
                } else {
                    l.a().e(i7, i11 + i7, (Spannable) charSequence);
                    return;
                }
            }
            l a10 = l.a();
            if (this.f55380b == null) {
                this.f55380b = new h(editText);
            }
            a10.f(this.f55380b);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
