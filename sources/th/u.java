package th;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class u implements TextWatcher {
    public final i0 f48232a;

    public u(i0 i0Var) {
        this.f48232a = i0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        i0 i0Var = this.f48232a;
        boolean isEmpty = TextUtils.isEmpty(i0Var.O);
        i0Var.O = obj;
        i0Var.C.h(0L, i0Var.f48170e, 0L, 0L, null, false, obj, isEmpty);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
