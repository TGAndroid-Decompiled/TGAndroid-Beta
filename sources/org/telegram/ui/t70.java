package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t70 extends org.telegram.ui.Components.lm0 {
    public final Context f43689c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f43690f;
    public boolean h;
    public final w70 f43691n;

    public t70(w70 w70Var, Context context) {
        this.f43691n = w70Var;
        this.f43689c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        if (view instanceof org.telegram.ui.Cells.t4) {
            ((org.telegram.ui.Cells.t4) view).f25442a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f43690f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            l();
            return;
        }
        Timer timer2 = new Timer();
        this.f43690f = timer2;
        timer2.schedule(new s70(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f43691n.v.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (!this.h) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        super.l();
        w70 w70Var = this.f43691n;
        t70 t70Var = w70Var.f44996s;
        if (t70Var != null && !w70Var.f44998x) {
            int h = t70Var.h();
            org.telegram.ui.Components.ey0 ey0Var = w70Var.f44995r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ey0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (e1Var.f47738f == 0) {
            org.telegram.ui.Cells.t4 t4Var = (org.telegram.ui.Cells.t4) e1Var.f47735a;
            boolean z10 = this.h;
            w70 w70Var = this.f43691n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) w70Var.v.get(i10 - 2);
                charSequence = null;
            }
            t4Var.a(contact, charSequence);
            boolean containsKey = w70Var.f44999y.containsKey(contact.key);
            org.telegram.ui.Components.zp zpVar = t4Var.e;
            if (zpVar != null) {
                zpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v8 v8Var;
        Context context = this.f43689c;
        if (i10 == 1) {
            org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(context);
            int i11 = org.telegram.ui.ActionBar.y6.G6;
            v8Var2.g(i11, i11);
            v8Var2.u(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            v8Var = v8Var2;
        } else if (i10 == 2) {
            v8Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        } else {
            v8Var = new org.telegram.ui.Cells.t4(context, true);
        }
        return new s4.e1(v8Var);
    }
}
