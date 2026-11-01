package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class x91 extends org.telegram.ui.ActionBar.p0 {
    public boolean f43291a = false;
    public final ca1 f43292b;

    public x91(ca1 ca1Var) {
        this.f43292b = ca1Var;
    }

    @Override
    public final void h() {
        ca1 ca1Var = this.f43292b;
        if (ca1Var.f36270a.getVisibility() != 0) {
            ca1Var.f36270a.setVisibility(0);
            ca1Var.f36270a.setAlpha(0.0f);
        }
        ca1Var.f36275r.setVisibility(8);
        ca1Var.d.f();
        ca1Var.f36270a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ca1Var.f36276s.animate().alpha(0.0f).setDuration(150L).setListener(new w91(this, 0)).start();
        this.f43291a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        ba1 ba1Var = this.f43292b.e;
        if (ba1Var.e != null) {
            Utilities.f14523g.a(ba1Var.e);
            ba1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ba1Var.f36017c.clear();
            ba1Var.d.clear();
            ba1Var.f();
            ba1Var.h.f36275r.setVisibility(8);
        } else {
            int i10 = ba1Var.f36018f + 1;
            ba1Var.f36018f = i10;
            org.telegram.messenger.r5 r5Var = Utilities.f14523g;
            aa1 aa1Var = new aa1(ba1Var, obj, i10, 0);
            ba1Var.e = aa1Var;
            r5Var.d(aa1Var, 300L);
        }
        if (!this.f43291a && !TextUtils.isEmpty(obj)) {
            if (this.f43292b.f36276s.getVisibility() != 0) {
                this.f43292b.f36276s.setVisibility(0);
                this.f43292b.f36276s.setAlpha(0.0f);
            }
            this.f43292b.f36270a.animate().alpha(0.0f).setDuration(150L).setListener(new w91(this, 1)).start();
            this.f43292b.e.d.clear();
            this.f43292b.e.f36017c.clear();
            this.f43292b.e.f();
            this.f43292b.f36276s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f43291a = true;
        } else if (this.f43291a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
