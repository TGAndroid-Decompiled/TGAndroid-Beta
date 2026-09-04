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
    public final org.telegram.ui.ActionBar.n2 f52308a;
    public final long f52309b;
    public final qc f52310c;
    public final kc d;
    public final oc f52311e;
    public final jc f52312f;
    public int f52313g;
    public long h;
    public bi.v2 f52314i;
    public final ArrayList f52315j = new ArrayList();
    public final HashSet f52316k = new HashSet();
    public final long f52317l = System.currentTimeMillis();
    public boolean f52318m = true;
    public boolean f52319n;
    public boolean f52320o;
    public final m5 f52321p;

    public n5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final n5 f52273b;

            {
                this.f52273b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52273b.a();
                        return;
                    default:
                        n5 n5Var = this.f52273b;
                        if (!n5Var.f52319n && !n5Var.f52320o && n5Var.f52318m) {
                            n5Var.f52319n = true;
                            bi.v2 v2Var = n5Var.f52314i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.f52316k);
                            }
                            if (n5Var.f52311e != null) {
                                n5Var.f52310c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f52321p = r22;
        this.f52308a = n2Var;
        this.f52309b = j3;
        Context t10 = s5.t(n2Var);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, n2Var.getResourceProvider());
        this.f52312f = jcVar;
        jcVar.f27428b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, n2Var.getResourceProvider()));
        oc ocVar = new oc(t10, n2Var.getResourceProvider(), true, false);
        this.f52311e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f29029a = new Runnable(this) {
            public final n5 f52273b;

            {
                this.f52273b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52273b.a();
                        return;
                    default:
                        n5 n5Var = this.f52273b;
                        if (!n5Var.f52319n && !n5Var.f52320o && n5Var.f52318m) {
                            n5Var.f52319n = true;
                            bi.v2 v2Var = n5Var.f52314i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.f52316k);
                            }
                            if (n5Var.f52311e != null) {
                                n5Var.f52310c.b();
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
        this.f52310c = b10;
        b10.f29687r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final n5 f52273b;

            {
                this.f52273b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52273b.a();
                        return;
                    default:
                        n5 n5Var = this.f52273b;
                        if (!n5Var.f52319n && !n5Var.f52320o && n5Var.f52318m) {
                            n5Var.f52319n = true;
                            bi.v2 v2Var = n5Var.f52314i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.f52316k);
                            }
                            if (n5Var.f52311e != null) {
                                n5Var.f52310c.b();
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
        if (!this.f52319n && !this.f52320o) {
            this.f52320o = true;
            ArrayList arrayList = this.f52315j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f52311e != null) {
                this.f52310c.b();
            }
        }
    }
}
