package xh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class c2 implements TextWatcher {
    public boolean f46074a;
    public final a2 f46075b;

    public c2(a2 a2Var) {
        this.f46075b = a2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f46074a && editable.length() > 12) {
            this.f46074a = true;
            editable.delete(12, editable.length());
            a2 a2Var = this.f46075b;
            AndroidUtilities.shakeView(a2Var);
            try {
                a2Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f46074a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
