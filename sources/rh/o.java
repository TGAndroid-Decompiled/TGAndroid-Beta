package rh;

import android.text.Editable;
import android.text.TextWatcher;

public final class o implements TextWatcher {

    public final String[] f47301a;

    public final cg.l0 f47302b;

    public o(String[] strArr, cg.l0 l0Var) {
        this.f47301a = strArr;
        this.f47302b = l0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f47301a[0] = editable.toString();
        this.f47302b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
