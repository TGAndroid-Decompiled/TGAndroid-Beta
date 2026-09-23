package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ci.h2;
import org.telegram.ui.ActionBar.f5;
public final class g0 implements TextWatcher {
    public final f5 f46774a;
    public final EditText f46775b;
    public String f46776c;
    public boolean d;
    public boolean e;

    public g0(h2 h2Var, f5 f5Var) {
        this.f46774a = f5Var;
        this.f46775b = h2Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f46776c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f46776c = obj;
        this.f46774a.q(this.f46775b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            f5 f5Var = this.f46774a;
            if (!f5Var.c()) {
                return;
            }
            if (z10) {
                f5Var.n();
            } else {
                f5Var.m();
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
