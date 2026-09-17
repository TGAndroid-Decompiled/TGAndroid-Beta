package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import di.h2;
import org.telegram.ui.ActionBar.g5;
public final class h0 implements TextWatcher {
    public final g5 f50133a;
    public final EditText f50134b;
    public String f50135c;
    public boolean d;
    public boolean f50136e;

    public h0(h2 h2Var, g5 g5Var) {
        this.f50133a = g5Var;
        this.f50134b = h2Var;
    }

    public final void a() {
        this.f50136e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f50135c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f50135c = obj;
        this.f50133a.q(this.f50134b);
        if (!isEmpty && isEmpty2 && !this.f50136e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            g5 g5Var = this.f50133a;
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
