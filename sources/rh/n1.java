package rh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad0;
public final class n1 implements TextWatcher {
    public boolean f43624a;
    public final EditTextBoldCursor f43625b;
    public final int f43626c;
    public final ad0 d;

    public n1(EditTextBoldCursor editTextBoldCursor, int i10, ad0 ad0Var) {
        this.f43625b = editTextBoldCursor;
        this.f43626c = i10;
        this.d = ad0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f43625b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f43624a) {
            int length = text.length();
            int i10 = this.f43626c;
            if (length > i10) {
                this.f43624a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f43624a = false;
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
