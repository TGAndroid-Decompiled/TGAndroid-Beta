package sh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
public final class m1 implements TextWatcher {
    public boolean f47524a;
    public final EditTextBoldCursor f47525b;
    public final int f47526c;
    public final cd0 d;

    public m1(EditTextBoldCursor editTextBoldCursor, int i10, cd0 cd0Var) {
        this.f47525b = editTextBoldCursor;
        this.f47526c = i10;
        this.d = cd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f47525b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f47524a) {
            int length = text.length();
            int i10 = this.f47526c;
            if (length > i10) {
                this.f47524a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f47524a = false;
            }
        }
        this.d.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(text));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
