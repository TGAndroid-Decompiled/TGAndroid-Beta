package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class u implements TextWatcher {
    public final int f54531a;
    public final a0 f54532b;

    public u(a0 a0Var, int i10) {
        this.f54531a = i10;
        this.f54532b = a0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f54531a) {
            case 0:
                String obj = editable.toString();
                a0 a0Var = this.f54532b;
                boolean isEmpty = TextUtils.isEmpty(a0Var.I1);
                a0Var.I1 = obj;
                a0Var.f54454w1.h(0L, a0Var.l1, 0L, 0L, null, false, obj, isEmpty);
                return;
            default:
                String obj2 = editable.toString();
                a0 a0Var2 = this.f54532b;
                a0Var2.J1 = obj2;
                a0Var2.f54455x1.f30819f3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f54531a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f54531a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
