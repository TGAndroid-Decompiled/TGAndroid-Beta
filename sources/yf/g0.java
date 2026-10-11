package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ci.g2;
import org.telegram.ui.ActionBar.e5;
public final class g0 implements TextWatcher {
    public final e5 f52278a;
    public final EditText f52279b;
    public String f52280c;
    public boolean d;
    public boolean f52281e;

    public g0(g2 g2Var, e5 e5Var) {
        this.f52278a = e5Var;
        this.f52279b = g2Var;
    }

    public final void a() {
        this.f52281e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f52280c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f52280c = obj;
        this.f52278a.q(this.f52279b);
        if (!isEmpty && isEmpty2 && !this.f52281e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            e5 e5Var = this.f52278a;
            if (!e5Var.c()) {
                return;
            }
            if (z10) {
                e5Var.n();
            } else {
                e5Var.m();
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
