package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
public final class r5 {
    public final org.telegram.ui.ActionBar.n2 f47716a;
    public final long f47717b;
    public final oc f47718c;
    public final ic d;
    public final mc e;
    public final hc f47719f;
    public int f47720g;
    public long h;
    public ai.i3 f47721i;
    public final ArrayList f47722j = new ArrayList();
    public final HashSet f47723k = new HashSet();
    public final long f47724l = System.currentTimeMillis();
    public boolean f47725m = true;
    public boolean f47726n;
    public boolean f47727o;
    public final q5 f47728p;

    public r5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final r5 f47664b;

            {
                this.f47664b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47664b.a();
                        return;
                    default:
                        r5 r5Var = this.f47664b;
                        if (!r5Var.f47726n && !r5Var.f47727o && r5Var.f47725m) {
                            r5Var.f47726n = true;
                            ai.i3 i3Var = r5Var.f47721i;
                            if (i3Var != null) {
                                i3Var.run(r5Var.f47723k);
                            }
                            if (r5Var.e != null) {
                                r5Var.f47718c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47728p = r22;
        this.f47716a = n2Var;
        this.f47717b = j3;
        Context t10 = v5.t(n2Var);
        ic icVar = new ic(t10, n2Var.getResourceProvider());
        this.d = icVar;
        icVar.c(R.raw.stars_topup, new String[0]);
        hc hcVar = new hc(t10, n2Var.getResourceProvider());
        this.f47719f = hcVar;
        hcVar.f24659b = 3000L;
        hcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        mc mcVar = new mc(t10, n2Var.getResourceProvider(), true, false);
        this.e = mcVar;
        mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        mcVar.f26137a = new Runnable(this) {
            public final r5 f47664b;

            {
                this.f47664b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47664b.a();
                        return;
                    default:
                        r5 r5Var = this.f47664b;
                        if (!r5Var.f47726n && !r5Var.f47727o && r5Var.f47725m) {
                            r5Var.f47726n = true;
                            ai.i3 i3Var = r5Var.f47721i;
                            if (i3Var != null) {
                                i3Var.run(r5Var.f47723k);
                            }
                            if (r5Var.e != null) {
                                r5Var.f47718c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        mcVar.addView(hcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        mcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        icVar.setButton(mcVar);
        oc b10 = vc.a0(n2Var).b(icVar, -1);
        this.f47718c = b10;
        b10.f26762r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final r5 f47664b;

            {
                this.f47664b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47664b.a();
                        return;
                    default:
                        r5 r5Var = this.f47664b;
                        if (!r5Var.f47726n && !r5Var.f47727o && r5Var.f47725m) {
                            r5Var.f47726n = true;
                            ai.i3 i3Var = r5Var.f47721i;
                            if (i3Var != null) {
                                i3Var.run(r5Var.f47723k);
                            }
                            if (r5Var.e != null) {
                                r5Var.f47718c.b();
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
        if (!this.f47726n && !this.f47727o) {
            this.f47727o = true;
            ArrayList arrayList = this.f47722j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47718c.b();
            }
        }
    }
}
