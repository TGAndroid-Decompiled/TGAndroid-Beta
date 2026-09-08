package zh;

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
import org.telegram.ui.Components.yc;
public final class n5 {
    public final org.telegram.ui.ActionBar.n2 f52339a;
    public final long f52340b;
    public final qc f52341c;
    public final kc d;
    public final oc f52342e;
    public final jc f52343f;
    public int f52344g;
    public long h;
    public bi.v2 f52345i;
    public final ArrayList f52346j = new ArrayList();
    public final HashSet f52347k = new HashSet();
    public final long f52348l = System.currentTimeMillis();
    public boolean f52349m = true;
    public boolean f52350n;
    public boolean f52351o;
    public final m5 f52352p;

    public n5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final n5 f52304b;

            {
                this.f52304b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52304b.a();
                        return;
                    default:
                        n5 n5Var = this.f52304b;
                        if (!n5Var.f52350n && !n5Var.f52351o && n5Var.f52349m) {
                            n5Var.f52350n = true;
                            bi.v2 v2Var = n5Var.f52345i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.f52347k);
                            }
                            if (n5Var.f52342e != null) {
                                n5Var.f52341c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f52352p = r22;
        this.f52339a = n2Var;
        this.f52340b = j3;
        Context t10 = s5.t(n2Var);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, n2Var.getResourceProvider());
        this.f52343f = jcVar;
        jcVar.f27455b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, n2Var.getResourceProvider()));
        oc ocVar = new oc(t10, n2Var.getResourceProvider(), true, false);
        this.f52342e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f29056a = new Runnable(this) {
            public final n5 f52304b;

            {
                this.f52304b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52304b.a();
                        return;
                    default:
                        n5 n5Var = this.f52304b;
                        if (!n5Var.f52350n && !n5Var.f52351o && n5Var.f52349m) {
                            n5Var.f52350n = true;
                            bi.v2 v2Var = n5Var.f52345i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.f52347k);
                            }
                            if (n5Var.f52342e != null) {
                                n5Var.f52341c.b();
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
        qc b10 = yc.a0(n2Var).b(kcVar, -1);
        this.f52341c = b10;
        b10.f29714r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final n5 f52304b;

            {
                this.f52304b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52304b.a();
                        return;
                    default:
                        n5 n5Var = this.f52304b;
                        if (!n5Var.f52350n && !n5Var.f52351o && n5Var.f52349m) {
                            n5Var.f52350n = true;
                            bi.v2 v2Var = n5Var.f52345i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.f52347k);
                            }
                            if (n5Var.f52342e != null) {
                                n5Var.f52341c.b();
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
        if (!this.f52350n && !this.f52351o) {
            this.f52351o = true;
            ArrayList arrayList = this.f52346j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f52342e != null) {
                this.f52341c.b();
            }
        }
    }
}
