package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tc;
public final class i5 {
    public final org.telegram.ui.ActionBar.n2 f52688a;
    public final long f52689b;
    public final tc f52690c;
    public final nc d;
    public final rc f52691e;
    public final mc f52692f;
    public int f52693g;
    public long h;
    public ai.j3 f52694i;
    public final ArrayList f52695j = new ArrayList();
    public final HashSet f52696k = new HashSet();
    public final long f52697l = System.currentTimeMillis();
    public boolean f52698m = true;
    public boolean f52699n;
    public boolean f52700o;
    public final h5 f52701p;

    public i5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final i5 f52634b;

            {
                this.f52634b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52634b.a();
                        return;
                    default:
                        i5 i5Var = this.f52634b;
                        if (!i5Var.f52699n && !i5Var.f52700o && i5Var.f52698m) {
                            i5Var.f52699n = true;
                            ai.j3 j3Var = i5Var.f52694i;
                            if (j3Var != null) {
                                j3Var.run(i5Var.f52696k);
                            }
                            if (i5Var.f52691e != null) {
                                i5Var.f52690c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f52701p = r22;
        this.f52688a = n2Var;
        this.f52689b = j3;
        Context t10 = m5.t(n2Var);
        nc ncVar = new nc(t10, n2Var.getResourceProvider());
        this.d = ncVar;
        ncVar.c(R.raw.stars_topup, new String[0]);
        mc mcVar = new mc(t10, n2Var.getResourceProvider());
        this.f52692f = mcVar;
        mcVar.f28806b = 3000L;
        mcVar.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        rc rcVar = new rc(t10, n2Var.getResourceProvider(), true, false);
        this.f52691e = rcVar;
        rcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        rcVar.f30421a = new Runnable(this) {
            public final i5 f52634b;

            {
                this.f52634b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52634b.a();
                        return;
                    default:
                        i5 i5Var = this.f52634b;
                        if (!i5Var.f52699n && !i5Var.f52700o && i5Var.f52698m) {
                            i5Var.f52699n = true;
                            ai.j3 j3Var = i5Var.f52694i;
                            if (j3Var != null) {
                                j3Var.run(i5Var.f52696k);
                            }
                            if (i5Var.f52691e != null) {
                                i5Var.f52690c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        rcVar.addView(mcVar, w7.x5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        rcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ncVar.setButton(rcVar);
        tc b10 = ad.a0(n2Var).b(ncVar, -1);
        this.f52690c = b10;
        b10.f31138r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final i5 f52634b;

            {
                this.f52634b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52634b.a();
                        return;
                    default:
                        i5 i5Var = this.f52634b;
                        if (!i5Var.f52699n && !i5Var.f52700o && i5Var.f52698m) {
                            i5Var.f52699n = true;
                            ai.j3 j3Var = i5Var.f52694i;
                            if (j3Var != null) {
                                j3Var.run(i5Var.f52696k);
                            }
                            if (i5Var.f52691e != null) {
                                i5Var.f52690c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        AndroidUtilities.cancelRunOnUIThread(r22);
        AndroidUtilities.runOnUIThread(r22, 3000L);
    }

    public final void a() {
        if (!this.f52699n && !this.f52700o) {
            this.f52700o = true;
            ArrayList arrayList = this.f52695j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f52691e != null) {
                this.f52690c.b();
            }
        }
    }
}
