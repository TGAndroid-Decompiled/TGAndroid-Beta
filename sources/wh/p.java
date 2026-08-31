package wh;

import android.text.Editable;
import android.text.TextWatcher;
public final class p implements TextWatcher {
    public final String[] f49917a;
    public final hg.k0 f49918b;

    public p(String[] strArr, hg.k0 k0Var) {
        this.f49917a = strArr;
        this.f49918b = k0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f49917a[0] = editable.toString();
        this.f49918b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
