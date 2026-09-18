package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ci.h2;
import org.telegram.ui.ActionBar.h5;
public final class g0 implements TextWatcher {
    public final h5 f46848a;
    public final EditText f46849b;
    public String f46850c;
    public boolean d;
    public boolean e;

    public g0(h2 h2Var, h5 h5Var) {
        this.f46848a = h5Var;
        this.f46849b = h2Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f46850c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f46850c = obj;
        this.f46848a.q(this.f46849b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            h5 h5Var = this.f46848a;
            if (!h5Var.c()) {
                return;
            }
            if (z10) {
                h5Var.n();
            } else {
                h5Var.m();
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
