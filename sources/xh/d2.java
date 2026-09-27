package xh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class d2 implements TextWatcher {
    public boolean f46179a;
    public final b2 f46180b;

    public d2(b2 b2Var) {
        this.f46180b = b2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f46179a && editable.length() > 12) {
            this.f46179a = true;
            editable.delete(12, editable.length());
            b2 b2Var = this.f46180b;
            AndroidUtilities.shakeView(b2Var);
            try {
                b2Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f46179a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
