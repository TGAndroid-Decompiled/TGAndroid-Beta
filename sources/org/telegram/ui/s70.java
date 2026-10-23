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
public final class s70 extends org.telegram.ui.Components.lm0 {
    public final Context f41315c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f41316f;
    public boolean h;
    public final x70 f41317n;

    public s70(x70 x70Var, Context context) {
        this.f41317n = x70Var;
        this.f41315c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46343a;
        if (view instanceof org.telegram.ui.Cells.o4) {
            ((org.telegram.ui.Cells.o4) view).f22838a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f41316f;
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
        this.f41316f = timer2;
        timer2.schedule(new r70(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f41317n.f43528w.size() + 2;
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
        x70 x70Var = this.f41317n;
        s70 s70Var = x70Var.f43527s;
        if (s70Var != null && !x70Var.E) {
            int h = s70Var.h();
            org.telegram.ui.Components.wx0 wx0Var = x70Var.f43526r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            wx0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (b1Var.f46346f == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) b1Var.f46343a;
            boolean z10 = this.h;
            x70 x70Var = this.f41317n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) x70Var.f43528w.get(i10 - 2);
                charSequence = null;
            }
            o4Var.a(contact, charSequence);
            boolean containsKey = x70Var.F.containsKey(contact.key);
            org.telegram.ui.Components.xp xpVar = o4Var.e;
            if (xpVar != null) {
                xpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        Context context = this.f41315c;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            r8Var2.g(i11, i11);
            r8Var2.u(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            r8Var = r8Var2;
        } else if (i10 == 2) {
            r8Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        } else {
            r8Var = new org.telegram.ui.Cells.o4(context, true);
        }
        return new s4.b1(r8Var);
    }
}
