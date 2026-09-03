package vh;

import android.text.Editable;
import android.text.TextWatcher;
public final class p implements TextWatcher {
    public final String[] f46127a;
    public final gg.k0 f46128b;

    public p(String[] strArr, gg.k0 k0Var) {
        this.f46127a = strArr;
        this.f46128b = k0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f46127a[0] = editable.toString();
        this.f46128b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
