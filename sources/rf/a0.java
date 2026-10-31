package rf;

import ag.l3;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.n0;
public final class a0 implements TextWatcher {
    public final l3 f46491a;
    public final EditText f46492b;
    public String f46493c;
    public boolean d;
    public boolean e;

    public a0(n0 n0Var, l3 l3Var) {
        this.f46491a = l3Var;
        this.f46492b = n0Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f46493c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f46493c = obj;
        this.f46491a.l(this.f46492b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            l3 l3Var = this.f46491a;
            if (!l3Var.c()) {
                return;
            }
            if (z10) {
                l3Var.i();
            } else {
                l3Var.h();
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
