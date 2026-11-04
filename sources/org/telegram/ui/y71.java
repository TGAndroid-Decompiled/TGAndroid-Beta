package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class y71 extends org.telegram.ui.ActionBar.m0 {
    public boolean f52221a = false;
    public final d81 f52222b;

    public y71(d81 d81Var) {
        this.f52222b = d81Var;
    }

    @Override
    public final void h() {
        d81 d81Var = this.f52222b;
        if (d81Var.f44593a.getVisibility() != 0) {
            d81Var.f44593a.setVisibility(0);
            d81Var.f44593a.setAlpha(0.0f);
        }
        d81Var.f44599r.setVisibility(8);
        d81Var.d.f();
        d81Var.f44593a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        d81Var.f44600s.animate().alpha(0.0f).setDuration(150L).setListener(new x71(this, 0)).start();
        this.f52221a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        c81 c81Var = this.f52222b.f44596e;
        if (c81Var.f44276e != null) {
            Utilities.f21389g.a(c81Var.f44276e);
            c81Var.f44276e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            c81Var.f44275c.clear();
            c81Var.d.clear();
            c81Var.f();
            c81Var.h.f44599r.setVisibility(8);
        } else {
            int i3 = c81Var.f44277f + 1;
            c81Var.f44277f = i3;
            org.telegram.messenger.p5 p5Var = Utilities.f21389g;
            b81 b81Var = new b81(c81Var, obj, i3, 0);
            c81Var.f44276e = b81Var;
            p5Var.e(b81Var, 300L);
        }
        if (!this.f52221a && !TextUtils.isEmpty(obj)) {
            if (this.f52222b.f44600s.getVisibility() != 0) {
                this.f52222b.f44600s.setVisibility(0);
                this.f52222b.f44600s.setAlpha(0.0f);
            }
            this.f52222b.f44593a.animate().alpha(0.0f).setDuration(150L).setListener(new x71(this, 1)).start();
            this.f52222b.f44596e.d.clear();
            this.f52222b.f44596e.f44275c.clear();
            this.f52222b.f44596e.f();
            this.f52222b.f44600s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f52221a = true;
        } else if (this.f52221a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
