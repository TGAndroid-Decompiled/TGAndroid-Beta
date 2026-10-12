package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ue1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f40666f = false;
    public final af1 h;

    public ue1(af1 af1Var) {
        this.h = af1Var;
    }

    @Override
    public final void m() {
        af1 af1Var = this.h;
        if (af1Var.f34199a.getVisibility() != 0) {
            af1Var.f34199a.setVisibility(0);
            af1Var.f34199a.setAlpha(0.0f);
        }
        af1Var.f34204r.setVisibility(8);
        af1Var.d.l();
        af1Var.f34199a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        af1Var.f34205s.animate().alpha(0.0f).setDuration(150L).setListener(new te1(this, 0)).start();
        this.f40666f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ze1 ze1Var = this.h.e;
        if (ze1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(ze1Var.e);
            ze1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ze1Var.f42606c.clear();
            ze1Var.d.clear();
            ze1Var.l();
            ze1Var.h.f34204r.setVisibility(8);
        } else {
            int i10 = ze1Var.f42607f + 1;
            ze1Var.f42607f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ye1 ye1Var = new ye1(ze1Var, obj, i10, 0);
            ze1Var.e = ye1Var;
            dispatchQueue.postRunnable(ye1Var, 300L);
        }
        if (!this.f40666f && !TextUtils.isEmpty(obj)) {
            if (this.h.f34205s.getVisibility() != 0) {
                this.h.f34205s.setVisibility(0);
                this.h.f34205s.setAlpha(0.0f);
            }
            this.h.f34199a.animate().alpha(0.0f).setDuration(150L).setListener(new te1(this, 1)).start();
            this.h.e.d.clear();
            this.h.e.f42606c.clear();
            this.h.e.l();
            this.h.f34205s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f40666f = true;
        } else if (this.f40666f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
