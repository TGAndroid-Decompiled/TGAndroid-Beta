package zf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import di.g2;
import org.telegram.ui.ActionBar.e5;
public final class h0 implements TextWatcher {
    public final e5 f50179a;
    public final EditText f50180b;
    public String f50181c;
    public boolean d;
    public boolean e;

    public h0(g2 g2Var, e5 e5Var) {
        this.f50179a = e5Var;
        this.f50180b = g2Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f50181c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f50181c = obj;
        this.f50179a.q(this.f50180b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            e5 e5Var = this.f50179a;
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
