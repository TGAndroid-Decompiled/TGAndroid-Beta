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
public final class z70 extends org.telegram.ui.Components.sl0 {
    public final Context f43859c;
    public ArrayList d = new ArrayList();
    public ArrayList f43860e = new ArrayList();
    public Timer f43861f;
    public boolean h;
    public final d80 f43862n;

    public z70(d80 d80Var, Context context) {
        this.f43862n = d80Var;
        this.f43859c = context;
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).f23330a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f43861f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (str == null) {
            this.d.clear();
            this.f43860e.clear();
            l();
            return;
        }
        Timer timer2 = new Timer();
        this.f43861f = timer2;
        timer2.schedule(new y70(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f43862n.f36140w.size() + 2;
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
        d80 d80Var = this.f43862n;
        z70 z70Var = d80Var.f36139s;
        if (z70Var != null && !d80Var.B) {
            int h = z70Var.h();
            org.telegram.ui.Components.ax0 ax0Var = d80Var.f36138r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ax0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (m1Var.f5879f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) m1Var.f5875a;
            boolean z4 = this.h;
            d80 d80Var = this.f43862n;
            if (z4) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.f43860e.get(i10);
            } else {
                contact = (ContactsController.Contact) d80Var.f36140w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f23334f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = d80Var.C.containsKey(contact.key);
            org.telegram.ui.Components.np npVar = p4Var.f23333e;
            if (npVar != null) {
                npVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        Context context = this.f43859c;
        if (i10 == 1) {
            org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(context);
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            o8Var2.e(i11, i11);
            o8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            o8Var = o8Var2;
        } else if (i10 == 2) {
            o8Var = new org.telegram.ui.Cells.z6(context, (b) null);
        } else {
            o8Var = new org.telegram.ui.Cells.p4(context, true);
        }
        return new f2.m1(o8Var);
    }
}
