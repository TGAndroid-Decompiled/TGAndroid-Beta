package th;

import android.text.Editable;
import android.text.TextWatcher;
public final class o implements TextWatcher {
    public final String[] f48595a;
    public final eg.l0 f48596b;

    public o(String[] strArr, eg.l0 l0Var) {
        this.f48595a = strArr;
        this.f48596b = l0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f48595a[0] = editable.toString();
        this.f48596b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
