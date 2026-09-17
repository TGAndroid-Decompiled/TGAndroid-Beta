package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import di.h2;
import org.telegram.ui.ActionBar.g5;
public final class h0 implements TextWatcher {
    public final g5 f50104a;
    public final EditText f50105b;
    public String f50106c;
    public boolean d;
    public boolean f50107e;

    public h0(h2 h2Var, g5 g5Var) {
        this.f50104a = g5Var;
        this.f50105b = h2Var;
    }

    public final void a() {
        this.f50107e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f50106c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f50106c = obj;
        this.f50104a.q(this.f50105b);
        if (!isEmpty && isEmpty2 && !this.f50107e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            g5 g5Var = this.f50104a;
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
