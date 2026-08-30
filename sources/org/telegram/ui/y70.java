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
public final class y70 extends org.telegram.ui.Components.rl0 {
    public final Context f40440c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f40441f;
    public boolean h;
    public final c80 f40442n;

    public y70(c80 c80Var, Context context) {
        this.f40442n = c80Var;
        this.f40440c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).f21546a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f40441f;
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
        this.f40441f = timer2;
        timer2.schedule(new x70(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f40442n.f33223w.size() + 2;
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
        c80 c80Var = this.f40442n;
        y70 y70Var = c80Var.f33222s;
        if (y70Var != null && !c80Var.B) {
            int h = y70Var.h();
            org.telegram.ui.Components.zw0 zw0Var = c80Var.f33221r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            zw0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (l1Var.f5788f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) l1Var.f5785a;
            boolean z4 = this.h;
            c80 c80Var = this.f40442n;
            if (z4) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) c80Var.f33223w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f21549f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = c80Var.C.containsKey(contact.key);
            org.telegram.ui.Components.lp lpVar = p4Var.e;
            if (lpVar != null) {
                lpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        Context context = this.f40440c;
        if (i10 == 1) {
            org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(context);
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            o8Var2.e(i11, i11);
            o8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            o8Var = o8Var2;
        } else if (i10 == 2) {
            o8Var = new org.telegram.ui.Cells.z6(context, (b) null);
        } else {
            o8Var = new org.telegram.ui.Cells.p4(context, true);
        }
        return new f2.l1(o8Var);
    }
}
