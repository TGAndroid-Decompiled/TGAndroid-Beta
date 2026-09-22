package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
public final class p5 {
    public final org.telegram.ui.ActionBar.n2 f47922a;
    public final long f47923b;
    public final pc f47924c;
    public final jc d;
    public final nc e;
    public final ic f47925f;
    public int f47926g;
    public long h;
    public ai.i3 f47927i;
    public final ArrayList f47928j = new ArrayList();
    public final HashSet f47929k = new HashSet();
    public final long f47930l = System.currentTimeMillis();
    public boolean f47931m = true;
    public boolean f47932n;
    public boolean f47933o;
    public final o5 f47934p;

    public p5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final p5 f47877b;

            {
                this.f47877b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47877b.a();
                        return;
                    default:
                        p5 p5Var = this.f47877b;
                        if (!p5Var.f47932n && !p5Var.f47933o && p5Var.f47931m) {
                            p5Var.f47932n = true;
                            ai.i3 i3Var = p5Var.f47927i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47929k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47924c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47934p = r22;
        this.f47922a = n2Var;
        this.f47923b = j3;
        Context t10 = u5.t(n2Var);
        jc jcVar = new jc(t10, n2Var.getResourceProvider());
        this.d = jcVar;
        jcVar.c(R.raw.stars_topup, new String[0]);
        ic icVar = new ic(t10, n2Var.getResourceProvider());
        this.f47925f = icVar;
        icVar.f25078b = 3000L;
        icVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, n2Var.getResourceProvider()));
        nc ncVar = new nc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ncVar;
        ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ncVar.f26720a = new Runnable(this) {
            public final p5 f47877b;

            {
                this.f47877b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47877b.a();
                        return;
                    default:
                        p5 p5Var = this.f47877b;
                        if (!p5Var.f47932n && !p5Var.f47933o && p5Var.f47931m) {
                            p5Var.f47932n = true;
                            ai.i3 i3Var = p5Var.f47927i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47929k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47924c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ncVar.addView(icVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ncVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        jcVar.setButton(ncVar);
        pc b10 = xc.a0(n2Var).b(jcVar, -1);
        this.f47924c = b10;
        b10.f27319r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final p5 f47877b;

            {
                this.f47877b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47877b.a();
                        return;
                    default:
                        p5 p5Var = this.f47877b;
                        if (!p5Var.f47932n && !p5Var.f47933o && p5Var.f47931m) {
                            p5Var.f47932n = true;
                            ai.i3 i3Var = p5Var.f47927i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47929k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47924c.b();
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
        if (!this.f47932n && !this.f47933o) {
            this.f47933o = true;
            ArrayList arrayList = this.f47928j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47924c.b();
            }
        }
    }
}
