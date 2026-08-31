package qh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class y7 implements TextWatcher {
    public final a8 f46361a;

    public y7(a8 a8Var) {
        this.f46361a = a8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        a8 a8Var = this.f46361a;
        if (!a8Var.h && (callback = a8Var.f44922n) != null && editable != null) {
            callback.run(editable.toString());
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
