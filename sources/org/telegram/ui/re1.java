package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class re1 extends org.telegram.ui.ActionBar.i5 {
    public boolean f36350f = false;
    public final xe1 h;

    public re1(xe1 xe1Var) {
        this.h = xe1Var;
    }

    @Override
    public final void m() {
        xe1 xe1Var = this.h;
        if (xe1Var.f38694a.getVisibility() != 0) {
            xe1Var.f38694a.setVisibility(0);
            xe1Var.f38694a.setAlpha(0.0f);
        }
        xe1Var.f38699r.setVisibility(8);
        xe1Var.d.l();
        xe1Var.f38694a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        xe1Var.f38700s.animate().alpha(0.0f).setDuration(150L).setListener(new qe1(this, 0)).start();
        this.f36350f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        we1 we1Var = this.h.e;
        if (we1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(we1Var.e);
            we1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            we1Var.f37842c.clear();
            we1Var.d.clear();
            we1Var.l();
            we1Var.h.f38699r.setVisibility(8);
        } else {
            int i10 = we1Var.f37843f + 1;
            we1Var.f37843f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ve1 ve1Var = new ve1(we1Var, obj, i10, 0);
            we1Var.e = ve1Var;
            dispatchQueue.postRunnable(ve1Var, 300L);
        }
        if (!this.f36350f && !TextUtils.isEmpty(obj)) {
            if (this.h.f38700s.getVisibility() != 0) {
                this.h.f38700s.setVisibility(0);
                this.h.f38700s.setAlpha(0.0f);
            }
            this.h.f38694a.animate().alpha(0.0f).setDuration(150L).setListener(new qe1(this, 1)).start();
            this.h.e.d.clear();
            this.h.e.f37842c.clear();
            this.h.e.l();
            this.h.f38700s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f36350f = true;
        } else if (this.f36350f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
