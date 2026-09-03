package ph;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class z7 implements TextWatcher {
    public final b8 f42700a;

    public z7(b8 b8Var) {
        this.f42700a = b8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        b8 b8Var = this.f42700a;
        if (!b8Var.h && (callback = b8Var.f41336n) != null && editable != null) {
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
