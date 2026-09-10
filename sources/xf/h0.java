package xf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import bi.t2;
import org.telegram.ui.ActionBar.i5;
public final class h0 implements TextWatcher {
    public final i5 f45144a;
    public final EditText f45145b;
    public String f45146c;
    public boolean d;
    public boolean e;

    public h0(t2 t2Var, i5 i5Var) {
        this.f45144a = i5Var;
        this.f45145b = t2Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f45146c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f45146c = obj;
        this.f45144a.q(this.f45145b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            i5 i5Var = this.f45144a;
            if (!i5Var.c()) {
                return;
            }
            if (z10) {
                i5Var.n();
            } else {
                i5Var.m();
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
