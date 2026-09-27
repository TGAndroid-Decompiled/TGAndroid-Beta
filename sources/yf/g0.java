package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ci.h2;
import org.telegram.ui.ActionBar.g5;
public final class g0 implements TextWatcher {
    public final g5 f47144a;
    public final EditText f47145b;
    public String f47146c;
    public boolean d;
    public boolean e;

    public g0(h2 h2Var, g5 g5Var) {
        this.f47144a = g5Var;
        this.f47145b = h2Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f47146c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f47146c = obj;
        this.f47144a.q(this.f47145b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            g5 g5Var = this.f47144a;
            if (!g5Var.c()) {
                return;
            }
            if (z10) {
                g5Var.n();
            } else {
                g5Var.m();
            }
            this.d = z10;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
