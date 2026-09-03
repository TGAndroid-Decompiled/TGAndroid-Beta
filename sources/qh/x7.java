package qh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class x7 implements TextWatcher {
    public final z7 f46317a;

    public x7(z7 z7Var) {
        this.f46317a = z7Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        z7 z7Var = this.f46317a;
        if (!z7Var.h && (callback = z7Var.f46417n) != null && editable != null) {
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
