package wh;

import android.text.Editable;
import android.text.TextWatcher;
public final class p implements TextWatcher {
    public final String[] f49954a;
    public final hg.k0 f49955b;

    public p(String[] strArr, hg.k0 k0Var) {
        this.f49954a = strArr;
        this.f49955b = k0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f49954a[0] = editable.toString();
        this.f49955b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
