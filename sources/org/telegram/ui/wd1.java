package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class wd1 extends org.telegram.ui.ActionBar.i5 {
    public boolean f42448f = false;
    public final be1 h;

    public wd1(be1 be1Var) {
        this.h = be1Var;
    }

    @Override
    public final void m() {
        be1 be1Var = this.h;
        if (be1Var.f35491a.getVisibility() != 0) {
            be1Var.f35491a.setVisibility(0);
            be1Var.f35491a.setAlpha(0.0f);
        }
        be1Var.f35497r.setVisibility(8);
        be1Var.d.l();
        be1Var.f35491a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        be1Var.f35498s.animate().alpha(0.0f).setDuration(150L).setListener(new vd1(this, 0)).start();
        this.f42448f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ae1 ae1Var = this.h.f35494e;
        if (ae1Var.f35145e != null) {
            Utilities.searchQueue.cancelRunnable(ae1Var.f35145e);
            ae1Var.f35145e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ae1Var.f35144c.clear();
            ae1Var.d.clear();
            ae1Var.l();
            ae1Var.h.f35497r.setVisibility(8);
        } else {
            int i10 = ae1Var.f35146f + 1;
            ae1Var.f35146f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            zd1 zd1Var = new zd1(ae1Var, obj, i10, 0);
            ae1Var.f35145e = zd1Var;
            dispatchQueue.postRunnable(zd1Var, 300L);
        }
        if (!this.f42448f && !TextUtils.isEmpty(obj)) {
            if (this.h.f35498s.getVisibility() != 0) {
                this.h.f35498s.setVisibility(0);
                this.h.f35498s.setAlpha(0.0f);
            }
            this.h.f35491a.animate().alpha(0.0f).setDuration(150L).setListener(new vd1(this, 1)).start();
            this.h.f35494e.d.clear();
            this.h.f35494e.f35144c.clear();
            this.h.f35494e.l();
            this.h.f35498s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f42448f = true;
        } else if (this.f42448f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
