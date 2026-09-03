package sh;

import android.text.Editable;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final i0 f44477a;

    public v(i0 i0Var) {
        this.f44477a = i0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        i0 i0Var = this.f44477a;
        i0Var.P = obj;
        i0Var.D.V2.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
