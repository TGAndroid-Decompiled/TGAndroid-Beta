package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ci.h2;
import org.telegram.ui.ActionBar.f5;
public final class c0 implements TextWatcher {
    public final f5 f50947a;
    public final EditText f50948b;
    public String f50949c;
    public boolean d;
    public boolean f50950e;

    public c0(h2 h2Var, f5 f5Var) {
        this.f50947a = f5Var;
        this.f50948b = h2Var;
    }

    public final void a() {
        this.f50950e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f50949c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f50949c = obj;
        this.f50947a.q(this.f50948b);
        if (!isEmpty && isEmpty2 && !this.f50950e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            f5 f5Var = this.f50947a;
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
