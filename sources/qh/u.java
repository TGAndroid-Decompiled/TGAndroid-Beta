package qh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class u implements TextWatcher {
    public final i0 f46780a;

    public u(i0 i0Var) {
        this.f46780a = i0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        i0 i0Var = this.f46780a;
        boolean isEmpty = TextUtils.isEmpty(i0Var.N);
        i0Var.N = obj;
        i0Var.B.h(0L, i0Var.f46715e, 0L, 0L, null, false, obj, isEmpty);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
