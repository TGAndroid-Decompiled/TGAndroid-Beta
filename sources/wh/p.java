package wh;

import android.text.Editable;
import android.text.TextWatcher;
public final class p implements TextWatcher {
    public final String[] f49918a;
    public final hg.k0 f49919b;

    public p(String[] strArr, hg.k0 k0Var) {
        this.f49918a = strArr;
        this.f49919b = k0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f49918a[0] = editable.toString();
        this.f49919b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
