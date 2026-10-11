package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ci.g2;
import org.telegram.ui.ActionBar.e5;
public final class g0 implements TextWatcher {
    public final e5 f52244a;
    public final EditText f52245b;
    public String f52246c;
    public boolean d;
    public boolean f52247e;

    public g0(g2 g2Var, e5 e5Var) {
        this.f52244a = e5Var;
        this.f52245b = g2Var;
    }

    public final void a() {
        this.f52247e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f52246c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f52246c = obj;
        this.f52244a.q(this.f52245b);
        if (!isEmpty && isEmpty2 && !this.f52247e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            e5 e5Var = this.f52244a;
            if (!e5Var.c()) {
                return;
            }
            if (z10) {
                e5Var.n();
            } else {
                e5Var.m();
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
