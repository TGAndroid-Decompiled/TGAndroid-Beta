package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
public final class p5 {
    public final org.telegram.ui.ActionBar.n2 f47550a;
    public final long f47551b;
    public final qc f47552c;
    public final kc d;
    public final oc e;
    public final jc f47553f;
    public int f47554g;
    public long h;
    public ai.i3 f47555i;
    public final ArrayList f47556j = new ArrayList();
    public final HashSet f47557k = new HashSet();
    public final long f47558l = System.currentTimeMillis();
    public boolean f47559m = true;
    public boolean f47560n;
    public boolean f47561o;
    public final o5 f47562p;

    public p5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final p5 f47503b;

            {
                this.f47503b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47503b.a();
                        return;
                    default:
                        p5 p5Var = this.f47503b;
                        if (!p5Var.f47560n && !p5Var.f47561o && p5Var.f47559m) {
                            p5Var.f47560n = true;
                            ai.i3 i3Var = p5Var.f47555i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47557k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47552c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47562p = r22;
        this.f47550a = n2Var;
        this.f47551b = j3;
        Context t10 = t5.t(n2Var);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, n2Var.getResourceProvider());
        this.f47553f = jcVar;
        jcVar.f25246b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, n2Var.getResourceProvider()));
        oc ocVar = new oc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f26716a = new Runnable(this) {
            public final p5 f47503b;

            {
                this.f47503b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47503b.a();
                        return;
                    default:
                        p5 p5Var = this.f47503b;
                        if (!p5Var.f47560n && !p5Var.f47561o && p5Var.f47559m) {
                            p5Var.f47560n = true;
                            ai.i3 i3Var = p5Var.f47555i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47557k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47552c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ocVar.addView(jcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = xc.a0(n2Var).b(kcVar, -1);
        this.f47552c = b10;
        b10.f27314r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final p5 f47503b;

            {
                this.f47503b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47503b.a();
                        return;
                    default:
                        p5 p5Var = this.f47503b;
                        if (!p5Var.f47560n && !p5Var.f47561o && p5Var.f47559m) {
                            p5Var.f47560n = true;
                            ai.i3 i3Var = p5Var.f47555i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47557k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47552c.b();
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
        if (!this.f47560n && !this.f47561o) {
            this.f47561o = true;
            ArrayList arrayList = this.f47556j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47552c.b();
            }
        }
    }
}
