package zf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ei.e2;
import org.telegram.ui.ActionBar.g5;
public final class h0 implements TextWatcher {
    public final g5 f51573a;
    public final EditText f51574b;
    public String f51575c;
    public boolean d;
    public boolean e;

    public h0(e2 e2Var, g5 g5Var) {
        this.f51573a = g5Var;
        this.f51574b = e2Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f51575c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f51575c = obj;
        this.f51573a.q(this.f51574b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            g5 g5Var = this.f51573a;
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
