package qh;

import android.text.Editable;
import android.text.TextWatcher;
public final class o implements TextWatcher {
    public final String[] f46549a;
    public final bg.p0 f46550b;

    public o(String[] strArr, bg.p0 p0Var) {
        this.f46549a = strArr;
        this.f46550b = p0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f46549a[0] = editable.toString();
        this.f46550b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
