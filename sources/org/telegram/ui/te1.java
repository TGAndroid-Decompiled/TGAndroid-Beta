package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class te1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f40096f = false;
    public final ze1 h;

    public te1(ze1 ze1Var) {
        this.h = ze1Var;
    }

    @Override
    public final void m() {
        ze1 ze1Var = this.h;
        if (ze1Var.f42292a.getVisibility() != 0) {
            ze1Var.f42292a.setVisibility(0);
            ze1Var.f42292a.setAlpha(0.0f);
        }
        ze1Var.f42297r.setVisibility(8);
        ze1Var.d.l();
        ze1Var.f42292a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ze1Var.f42298s.animate().alpha(0.0f).setDuration(150L).setListener(new se1(this, 0)).start();
        this.f40096f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ye1 ye1Var = this.h.e;
        if (ye1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(ye1Var.e);
            ye1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ye1Var.f41815c.clear();
            ye1Var.d.clear();
            ye1Var.l();
            ye1Var.h.f42297r.setVisibility(8);
        } else {
            int i10 = ye1Var.f41816f + 1;
            ye1Var.f41816f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            xe1 xe1Var = new xe1(ye1Var, obj, i10, 0);
            ye1Var.e = xe1Var;
            dispatchQueue.postRunnable(xe1Var, 300L);
        }
        if (!this.f40096f && !TextUtils.isEmpty(obj)) {
            if (this.h.f42298s.getVisibility() != 0) {
                this.h.f42298s.setVisibility(0);
                this.h.f42298s.setAlpha(0.0f);
            }
            this.h.f42292a.animate().alpha(0.0f).setDuration(150L).setListener(new se1(this, 1)).start();
            this.h.e.d.clear();
            this.h.e.f41815c.clear();
            this.h.e.l();
            this.h.f42298s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f40096f = true;
        } else if (this.f40096f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
