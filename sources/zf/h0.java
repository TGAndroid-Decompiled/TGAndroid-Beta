package zf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import di.g2;
import org.telegram.ui.ActionBar.e5;
public final class h0 implements TextWatcher {
    public final e5 f50180a;
    public final EditText f50181b;
    public String f50182c;
    public boolean d;
    public boolean e;

    public h0(g2 g2Var, e5 e5Var) {
        this.f50180a = e5Var;
        this.f50181b = g2Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f50182c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f50182c = obj;
        this.f50180a.q(this.f50181b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            e5 e5Var = this.f50180a;
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
