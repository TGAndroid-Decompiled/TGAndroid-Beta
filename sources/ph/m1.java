package ph;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.uc0;
public final class m1 implements TextWatcher {
    public boolean f45899a;
    public final EditTextBoldCursor f45900b;
    public final int f45901c;
    public final uc0 d;

    public m1(EditTextBoldCursor editTextBoldCursor, int i10, uc0 uc0Var) {
        this.f45900b = editTextBoldCursor;
        this.f45901c = i10;
        this.d = uc0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f45900b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f45899a) {
            int length = text.length();
            int i10 = this.f45901c;
            if (length > i10) {
                this.f45899a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f45899a = false;
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
