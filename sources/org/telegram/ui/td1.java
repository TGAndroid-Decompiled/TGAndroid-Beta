package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class td1 extends org.telegram.ui.ActionBar.h5 {
    public boolean f38641f = false;
    public final yd1 h;

    public td1(yd1 yd1Var) {
        this.h = yd1Var;
    }

    @Override
    public final void m() {
        yd1 yd1Var = this.h;
        if (yd1Var.f40492a.getVisibility() != 0) {
            yd1Var.f40492a.setVisibility(0);
            yd1Var.f40492a.setAlpha(0.0f);
        }
        yd1Var.f40497r.setVisibility(8);
        yd1Var.d.l();
        yd1Var.f40492a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        yd1Var.f40498s.animate().alpha(0.0f).setDuration(150L).setListener(new sd1(this, 0)).start();
        this.f38641f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        xd1 xd1Var = this.h.e;
        if (xd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(xd1Var.e);
            xd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            xd1Var.f39901c.clear();
            xd1Var.d.clear();
            xd1Var.l();
            xd1Var.h.f40497r.setVisibility(8);
        } else {
            int i10 = xd1Var.f39902f + 1;
            xd1Var.f39902f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            wd1 wd1Var = new wd1(xd1Var, obj, i10, 0);
            xd1Var.e = wd1Var;
            dispatchQueue.postRunnable(wd1Var, 300L);
        }
        if (!this.f38641f && !TextUtils.isEmpty(obj)) {
            if (this.h.f40498s.getVisibility() != 0) {
                this.h.f40498s.setVisibility(0);
                this.h.f40498s.setAlpha(0.0f);
            }
            this.h.f40492a.animate().alpha(0.0f).setDuration(150L).setListener(new sd1(this, 1)).start();
            this.h.e.d.clear();
            this.h.e.f39901c.clear();
            this.h.e.l();
            this.h.f40498s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f38641f = true;
        } else if (this.f38641f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
