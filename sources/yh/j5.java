package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class j5 {
    public final org.telegram.ui.ActionBar.m2 f52955a;
    public final long f52956b;
    public final sc f52957c;
    public final mc d;
    public final qc f52958e;
    public final lc f52959f;
    public int f52960g;
    public long h;
    public ai.j3 f52961i;
    public final ArrayList f52962j = new ArrayList();
    public final HashSet f52963k = new HashSet();
    public final long f52964l = System.currentTimeMillis();
    public boolean f52965m = true;
    public boolean f52966n;
    public boolean f52967o;
    public final i5 f52968p;

    public j5(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final j5 f52916b;

            {
                this.f52916b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52916b.a();
                        return;
                    default:
                        j5 j5Var = this.f52916b;
                        if (!j5Var.f52966n && !j5Var.f52967o && j5Var.f52965m) {
                            j5Var.f52966n = true;
                            ai.j3 j3Var = j5Var.f52961i;
                            if (j3Var != null) {
                                j3Var.run(j5Var.f52963k);
                            }
                            if (j5Var.f52958e != null) {
                                j5Var.f52957c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f52968p = r22;
        this.f52955a = m2Var;
        this.f52956b = j3;
        Context t10 = n5.t(m2Var);
        mc mcVar = new mc(t10, m2Var.getResourceProvider());
        this.d = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        lc lcVar = new lc(t10, m2Var.getResourceProvider());
        this.f52959f = lcVar;
        lcVar.f28153b = 3000L;
        lcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, m2Var.getResourceProvider()));
        qc qcVar = new qc(t10, m2Var.getResourceProvider(), true, false);
        this.f52958e = qcVar;
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        qcVar.f29816a = new Runnable(this) {
            public final j5 f52916b;

            {
                this.f52916b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52916b.a();
                        return;
                    default:
                        j5 j5Var = this.f52916b;
                        if (!j5Var.f52966n && !j5Var.f52967o && j5Var.f52965m) {
                            j5Var.f52966n = true;
                            ai.j3 j3Var = j5Var.f52961i;
                            if (j3Var != null) {
                                j3Var.run(j5Var.f52963k);
                            }
                            if (j5Var.f52958e != null) {
                                j5Var.f52957c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        qcVar.addView(lcVar, w7.w5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        qcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        mcVar.setButton(qcVar);
        sc b10 = zc.a0(m2Var).b(mcVar, -1);
        this.f52957c = b10;
        b10.f30548r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final j5 f52916b;

            {
                this.f52916b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52916b.a();
                        return;
                    default:
                        j5 j5Var = this.f52916b;
                        if (!j5Var.f52966n && !j5Var.f52967o && j5Var.f52965m) {
                            j5Var.f52966n = true;
                            ai.j3 j3Var = j5Var.f52961i;
                            if (j3Var != null) {
                                j3Var.run(j5Var.f52963k);
                            }
                            if (j5Var.f52958e != null) {
                                j5Var.f52957c.b();
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
        if (!this.f52966n && !this.f52967o) {
            this.f52967o = true;
            ArrayList arrayList = this.f52962j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f52958e != null) {
                this.f52957c.b();
            }
        }
    }
}
