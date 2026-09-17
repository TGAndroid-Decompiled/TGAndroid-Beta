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
    public final org.telegram.ui.ActionBar.n2 f52309a;
    public final long f52310b;
    public final qc f52311c;
    public final kc d;
    public final oc f52312e;
    public final jc f52313f;
    public int f52314g;
    public long h;
    public bi.v2 f52315i;
    public final ArrayList f52316j = new ArrayList();
    public final HashSet f52317k = new HashSet();
    public final long f52318l = System.currentTimeMillis();
    public boolean f52319m = true;
    public boolean f52320n;
    public boolean f52321o;
    public final m5 f52322p;

    public n5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final n5 f52274b;

            {
                this.f52274b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52274b.a();
                        return;
                    default:
                        n5 n5Var = this.f52274b;
                        if (!n5Var.f52320n && !n5Var.f52321o && n5Var.f52319m) {
                            n5Var.f52320n = true;
                            bi.v2 v2Var = n5Var.f52315i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.f52317k);
                            }
                            if (n5Var.f52312e != null) {
                                n5Var.f52311c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f52322p = r22;
        this.f52309a = n2Var;
        this.f52310b = j3;
        Context t10 = s5.t(n2Var);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, n2Var.getResourceProvider());
        this.f52313f = jcVar;
        jcVar.f27429b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, n2Var.getResourceProvider()));
        oc ocVar = new oc(t10, n2Var.getResourceProvider(), true, false);
        this.f52312e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f29030a = new Runnable(this) {
            public final n5 f52274b;

            {
                this.f52274b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52274b.a();
                        return;
                    default:
                        n5 n5Var = this.f52274b;
                        if (!n5Var.f52320n && !n5Var.f52321o && n5Var.f52319m) {
                            n5Var.f52320n = true;
                            bi.v2 v2Var = n5Var.f52315i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.f52317k);
                            }
                            if (n5Var.f52312e != null) {
                                n5Var.f52311c.b();
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
        this.f52311c = b10;
        b10.f29688r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final n5 f52274b;

            {
                this.f52274b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52274b.a();
                        return;
                    default:
                        n5 n5Var = this.f52274b;
                        if (!n5Var.f52320n && !n5Var.f52321o && n5Var.f52319m) {
                            n5Var.f52320n = true;
                            bi.v2 v2Var = n5Var.f52315i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.f52317k);
                            }
                            if (n5Var.f52312e != null) {
                                n5Var.f52311c.b();
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
        if (!this.f52320n && !this.f52321o) {
            this.f52321o = true;
            ArrayList arrayList = this.f52316j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f52312e != null) {
                this.f52311c.b();
            }
        }
    }
}
