package yh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class a2 implements TextWatcher {
    public boolean f50201a;
    public final y1 f50202b;

    public a2(y1 y1Var) {
        this.f50202b = y1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f50201a && editable.length() > 12) {
            this.f50201a = true;
            editable.delete(12, editable.length());
            y1 y1Var = this.f50202b;
            AndroidUtilities.shakeView(y1Var);
            try {
                y1Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f50201a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
