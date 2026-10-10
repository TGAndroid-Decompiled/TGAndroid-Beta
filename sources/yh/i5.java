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
    public final org.telegram.ui.ActionBar.n2 f52734a;
    public final long f52735b;
    public final tc f52736c;
    public final nc d;
    public final rc f52737e;
    public final mc f52738f;
    public int f52739g;
    public long h;
    public ai.j3 f52740i;
    public final ArrayList f52741j = new ArrayList();
    public final HashSet f52742k = new HashSet();
    public final long f52743l = System.currentTimeMillis();
    public boolean f52744m = true;
    public boolean f52745n;
    public boolean f52746o;
    public final h5 f52747p;

    public i5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final i5 f52680b;

            {
                this.f52680b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52680b.a();
                        return;
                    default:
                        i5 i5Var = this.f52680b;
                        if (!i5Var.f52745n && !i5Var.f52746o && i5Var.f52744m) {
                            i5Var.f52745n = true;
                            ai.j3 j3Var = i5Var.f52740i;
                            if (j3Var != null) {
                                j3Var.run(i5Var.f52742k);
                            }
                            if (i5Var.f52737e != null) {
                                i5Var.f52736c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f52747p = r22;
        this.f52734a = n2Var;
        this.f52735b = j3;
        Context t10 = m5.t(n2Var);
        nc ncVar = new nc(t10, n2Var.getResourceProvider());
        this.d = ncVar;
        ncVar.c(R.raw.stars_topup, new String[0]);
        mc mcVar = new mc(t10, n2Var.getResourceProvider());
        this.f52738f = mcVar;
        mcVar.f28759b = 3000L;
        mcVar.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        rc rcVar = new rc(t10, n2Var.getResourceProvider(), true, false);
        this.f52737e = rcVar;
        rcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        rcVar.f30443a = new Runnable(this) {
            public final i5 f52680b;

            {
                this.f52680b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52680b.a();
                        return;
                    default:
                        i5 i5Var = this.f52680b;
                        if (!i5Var.f52745n && !i5Var.f52746o && i5Var.f52744m) {
                            i5Var.f52745n = true;
                            ai.j3 j3Var = i5Var.f52740i;
                            if (j3Var != null) {
                                j3Var.run(i5Var.f52742k);
                            }
                            if (i5Var.f52737e != null) {
                                i5Var.f52736c.b();
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
        this.f52736c = b10;
        b10.f31104r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final i5 f52680b;

            {
                this.f52680b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52680b.a();
                        return;
                    default:
                        i5 i5Var = this.f52680b;
                        if (!i5Var.f52745n && !i5Var.f52746o && i5Var.f52744m) {
                            i5Var.f52745n = true;
                            ai.j3 j3Var = i5Var.f52740i;
                            if (j3Var != null) {
                                j3Var.run(i5Var.f52742k);
                            }
                            if (i5Var.f52737e != null) {
                                i5Var.f52736c.b();
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
        if (!this.f52745n && !this.f52746o) {
            this.f52746o = true;
            ArrayList arrayList = this.f52741j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f52737e != null) {
                this.f52736c.b();
            }
        }
    }
}
