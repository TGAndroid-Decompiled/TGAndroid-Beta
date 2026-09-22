package xh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class b2 implements TextWatcher {
    public boolean f45803a;
    public final z1 f45804b;

    public b2(z1 z1Var) {
        this.f45804b = z1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f45803a && editable.length() > 12) {
            this.f45803a = true;
            editable.delete(12, editable.length());
            z1 z1Var = this.f45804b;
            AndroidUtilities.shakeView(z1Var);
            try {
                z1Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f45803a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
