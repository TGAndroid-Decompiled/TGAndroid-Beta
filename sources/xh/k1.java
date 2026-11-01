package xh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ec0;
public final class k1 implements TextWatcher {
    public boolean f53860a;
    public final EditTextBoldCursor f53861b;
    public final int f53862c;
    public final ec0 d;

    public k1(EditTextBoldCursor editTextBoldCursor, int i10, ec0 ec0Var) {
        this.f53861b = editTextBoldCursor;
        this.f53862c = i10;
        this.d = ec0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f53861b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f53860a) {
            int length = text.length();
            int i10 = this.f53862c;
            if (length > i10) {
                this.f53860a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f53860a = false;
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
