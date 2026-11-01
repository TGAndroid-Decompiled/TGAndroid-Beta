package rf;

import ag.l3;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.n0;
public final class a0 implements TextWatcher {
    public final l3 f46502a;
    public final EditText f46503b;
    public String f46504c;
    public boolean d;
    public boolean e;

    public a0(n0 n0Var, l3 l3Var) {
        this.f46502a = l3Var;
        this.f46503b = n0Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f46504c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f46504c = obj;
        this.f46502a.l(this.f46503b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            l3 l3Var = this.f46502a;
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
