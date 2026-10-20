package yh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class z1 implements TextWatcher {
    public boolean f50622a;
    public final x1 f50623b;

    public z1(x1 x1Var) {
        this.f50623b = x1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f50622a && editable.length() > 12) {
            this.f50622a = true;
            editable.delete(12, editable.length());
            x1 x1Var = this.f50623b;
            AndroidUtilities.shakeView(x1Var);
            try {
                x1Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f50622a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
