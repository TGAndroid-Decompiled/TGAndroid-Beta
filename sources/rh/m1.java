package rh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bd0;
public final class m1 implements TextWatcher {
    public boolean f43676a;
    public final EditTextBoldCursor f43677b;
    public final int f43678c;
    public final bd0 d;

    public m1(EditTextBoldCursor editTextBoldCursor, int i10, bd0 bd0Var) {
        this.f43677b = editTextBoldCursor;
        this.f43678c = i10;
        this.d = bd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f43677b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f43676a) {
            int length = text.length();
            int i10 = this.f43678c;
            if (length > i10) {
                this.f43676a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f43676a = false;
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
