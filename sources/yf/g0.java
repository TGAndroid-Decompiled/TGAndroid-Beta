package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ci.h2;
import org.telegram.ui.ActionBar.h5;
public final class g0 implements TextWatcher {
    public final h5 f46843a;
    public final EditText f46844b;
    public String f46845c;
    public boolean d;
    public boolean e;

    public g0(h2 h2Var, h5 h5Var) {
        this.f46843a = h5Var;
        this.f46844b = h2Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f46845c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f46845c = obj;
        this.f46843a.q(this.f46844b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            h5 h5Var = this.f46843a;
            if (!h5Var.c()) {
                return;
            }
            if (z10) {
                h5Var.n();
            } else {
                h5Var.m();
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
