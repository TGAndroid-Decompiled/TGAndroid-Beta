package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class z91 extends org.telegram.ui.ActionBar.p0 {
    public boolean f44055a = false;
    public final ea1 f44056b;

    public z91(ea1 ea1Var) {
        this.f44056b = ea1Var;
    }

    @Override
    public final void h() {
        ea1 ea1Var = this.f44056b;
        if (ea1Var.f36999a.getVisibility() != 0) {
            ea1Var.f36999a.setVisibility(0);
            ea1Var.f36999a.setAlpha(0.0f);
        }
        ea1Var.f37004r.setVisibility(8);
        ea1Var.d.f();
        ea1Var.f36999a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ea1Var.f37005s.animate().alpha(0.0f).setDuration(150L).setListener(new y91(this, 0)).start();
        this.f44055a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        da1 da1Var = this.f44056b.e;
        if (da1Var.e != null) {
            Utilities.f14522g.a(da1Var.e);
            da1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            da1Var.f36724c.clear();
            da1Var.d.clear();
            da1Var.f();
            da1Var.h.f37004r.setVisibility(8);
        } else {
            int i10 = da1Var.f36725f + 1;
            da1Var.f36725f = i10;
            org.telegram.messenger.r5 r5Var = Utilities.f14522g;
            ca1 ca1Var = new ca1(da1Var, obj, i10, 0);
            da1Var.e = ca1Var;
            r5Var.d(ca1Var, 300L);
        }
        if (!this.f44055a && !TextUtils.isEmpty(obj)) {
            if (this.f44056b.f37005s.getVisibility() != 0) {
                this.f44056b.f37005s.setVisibility(0);
                this.f44056b.f37005s.setAlpha(0.0f);
            }
            this.f44056b.f36999a.animate().alpha(0.0f).setDuration(150L).setListener(new y91(this, 1)).start();
            this.f44056b.e.d.clear();
            this.f44056b.e.f36724c.clear();
            this.f44056b.e.f();
            this.f44056b.f37005s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f44055a = true;
        } else if (this.f44055a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
