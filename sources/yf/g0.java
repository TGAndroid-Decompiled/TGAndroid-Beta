package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ci.g2;
import org.telegram.ui.ActionBar.g5;
public final class g0 implements TextWatcher {
    public final g5 f52201a;
    public final EditText f52202b;
    public String f52203c;
    public boolean d;
    public boolean f52204e;

    public g0(g2 g2Var, g5 g5Var) {
        this.f52201a = g5Var;
        this.f52202b = g2Var;
    }

    public final void a() {
        this.f52204e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f52203c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f52203c = obj;
        this.f52201a.q(this.f52202b);
        if (!isEmpty && isEmpty2 && !this.f52204e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            g5 g5Var = this.f52201a;
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
