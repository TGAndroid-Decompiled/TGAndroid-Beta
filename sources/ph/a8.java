package ph;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class a8 implements TextWatcher {
    public final c8 f41280a;

    public a8(c8 c8Var) {
        this.f41280a = c8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        c8 c8Var = this.f41280a;
        if (!c8Var.h && (callback = c8Var.f41385n) != null && editable != null) {
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
