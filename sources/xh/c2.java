package xh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class c2 implements TextWatcher {
    public boolean f46087a;
    public final a2 f46088b;

    public c2(a2 a2Var) {
        this.f46088b = a2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f46087a && editable.length() > 12) {
            this.f46087a = true;
            editable.delete(12, editable.length());
            a2 a2Var = this.f46088b;
            AndroidUtilities.shakeView(a2Var);
            try {
                a2Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f46087a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
