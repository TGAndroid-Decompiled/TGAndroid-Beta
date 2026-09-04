package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import di.h2;
import org.telegram.ui.ActionBar.g5;
public final class h0 implements TextWatcher {
    public final g5 f50103a;
    public final EditText f50104b;
    public String f50105c;
    public boolean d;
    public boolean f50106e;

    public h0(h2 h2Var, g5 g5Var) {
        this.f50103a = g5Var;
        this.f50104b = h2Var;
    }

    public final void a() {
        this.f50106e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f50105c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f50105c = obj;
        this.f50103a.q(this.f50104b);
        if (!isEmpty && isEmpty2 && !this.f50106e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            g5 g5Var = this.f50103a;
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
