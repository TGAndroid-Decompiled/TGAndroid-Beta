package vh;

import android.text.Editable;
import android.text.TextWatcher;
public final class o implements TextWatcher {
    public final String[] f46030a;
    public final gg.k0 f46031b;

    public o(String[] strArr, gg.k0 k0Var) {
        this.f46030a = strArr;
        this.f46031b = k0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f46030a[0] = editable.toString();
        this.f46031b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
