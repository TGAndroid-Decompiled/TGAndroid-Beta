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
    public final org.telegram.ui.ActionBar.n2 f47901a;
    public final long f47902b;
    public final pc f47903c;
    public final jc d;
    public final nc e;
    public final ic f47904f;
    public int f47905g;
    public long h;
    public ai.i3 f47906i;
    public final ArrayList f47907j = new ArrayList();
    public final HashSet f47908k = new HashSet();
    public final long f47909l = System.currentTimeMillis();
    public boolean f47910m = true;
    public boolean f47911n;
    public boolean f47912o;
    public final o5 f47913p;

    public p5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final p5 f47856b;

            {
                this.f47856b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47856b.a();
                        return;
                    default:
                        p5 p5Var = this.f47856b;
                        if (!p5Var.f47911n && !p5Var.f47912o && p5Var.f47910m) {
                            p5Var.f47911n = true;
                            ai.i3 i3Var = p5Var.f47906i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47908k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47903c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47913p = r22;
        this.f47901a = n2Var;
        this.f47902b = j3;
        Context t10 = u5.t(n2Var);
        jc jcVar = new jc(t10, n2Var.getResourceProvider());
        this.d = jcVar;
        jcVar.c(R.raw.stars_topup, new String[0]);
        ic icVar = new ic(t10, n2Var.getResourceProvider());
        this.f47904f = icVar;
        icVar.f24988b = 3000L;
        icVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, n2Var.getResourceProvider()));
        nc ncVar = new nc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ncVar;
        ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ncVar.f26616a = new Runnable(this) {
            public final p5 f47856b;

            {
                this.f47856b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47856b.a();
                        return;
                    default:
                        p5 p5Var = this.f47856b;
                        if (!p5Var.f47911n && !p5Var.f47912o && p5Var.f47910m) {
                            p5Var.f47911n = true;
                            ai.i3 i3Var = p5Var.f47906i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47908k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47903c.b();
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
        this.f47903c = b10;
        b10.f27260r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final p5 f47856b;

            {
                this.f47856b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47856b.a();
                        return;
                    default:
                        p5 p5Var = this.f47856b;
                        if (!p5Var.f47911n && !p5Var.f47912o && p5Var.f47910m) {
                            p5Var.f47911n = true;
                            ai.i3 i3Var = p5Var.f47906i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47908k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47903c.b();
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
        if (!this.f47911n && !this.f47912o) {
            this.f47912o = true;
            ArrayList arrayList = this.f47907j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47903c.b();
            }
        }
    }
}
