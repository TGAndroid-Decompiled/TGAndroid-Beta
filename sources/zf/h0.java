package zf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ei.e2;
import org.telegram.ui.ActionBar.k5;
public final class h0 implements TextWatcher {
    public final k5 f52038a;
    public final EditText f52039b;
    public String f52040c;
    public boolean d;
    public boolean e;

    public h0(e2 e2Var, k5 k5Var) {
        this.f52038a = k5Var;
        this.f52039b = e2Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f52040c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f52040c = obj;
        this.f52038a.q(this.f52039b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            k5 k5Var = this.f52038a;
            if (!k5Var.c()) {
                return;
            }
            if (z10) {
                k5Var.n();
            } else {
                k5Var.m();
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
