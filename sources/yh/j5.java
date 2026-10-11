package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
public final class j5 {
    public final org.telegram.ui.ActionBar.m2 f52852a;
    public final long f52853b;
    public final sc f52854c;
    public final mc d;
    public final qc f52855e;
    public final lc f52856f;
    public int f52857g;
    public long h;
    public ai.j3 f52858i;
    public final ArrayList f52859j = new ArrayList();
    public final HashSet f52860k = new HashSet();
    public final long f52861l = System.currentTimeMillis();
    public boolean f52862m = true;
    public boolean f52863n;
    public boolean f52864o;
    public final i5 f52865p;

    public j5(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final j5 f52813b;

            {
                this.f52813b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52813b.a();
                        return;
                    default:
                        j5 j5Var = this.f52813b;
                        if (!j5Var.f52863n && !j5Var.f52864o && j5Var.f52862m) {
                            j5Var.f52863n = true;
                            ai.j3 j3Var = j5Var.f52858i;
                            if (j3Var != null) {
                                j3Var.run(j5Var.f52860k);
                            }
                            if (j5Var.f52855e != null) {
                                j5Var.f52854c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f52865p = r22;
        this.f52852a = m2Var;
        this.f52853b = j3;
        Context t10 = n5.t(m2Var);
        mc mcVar = new mc(t10, m2Var.getResourceProvider());
        this.d = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        lc lcVar = new lc(t10, m2Var.getResourceProvider());
        this.f52856f = lcVar;
        lcVar.f28339b = 3000L;
        lcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, m2Var.getResourceProvider()));
        qc qcVar = new qc(t10, m2Var.getResourceProvider(), true, false);
        this.f52855e = qcVar;
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        qcVar.f30224a = new Runnable(this) {
            public final j5 f52813b;

            {
                this.f52813b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52813b.a();
                        return;
                    default:
                        j5 j5Var = this.f52813b;
                        if (!j5Var.f52863n && !j5Var.f52864o && j5Var.f52862m) {
                            j5Var.f52863n = true;
                            ai.j3 j3Var = j5Var.f52858i;
                            if (j3Var != null) {
                                j3Var.run(j5Var.f52860k);
                            }
                            if (j5Var.f52855e != null) {
                                j5Var.f52854c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        qcVar.addView(lcVar, w7.x5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        qcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        mcVar.setButton(qcVar);
        sc b10 = ad.a0(m2Var).b(mcVar, -1);
        this.f52854c = b10;
        b10.f30841r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final j5 f52813b;

            {
                this.f52813b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52813b.a();
                        return;
                    default:
                        j5 j5Var = this.f52813b;
                        if (!j5Var.f52863n && !j5Var.f52864o && j5Var.f52862m) {
                            j5Var.f52863n = true;
                            ai.j3 j3Var = j5Var.f52858i;
                            if (j3Var != null) {
                                j3Var.run(j5Var.f52860k);
                            }
                            if (j5Var.f52855e != null) {
                                j5Var.f52854c.b();
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
        if (!this.f52863n && !this.f52864o) {
            this.f52864o = true;
            ArrayList arrayList = this.f52859j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f52855e != null) {
                this.f52854c.b();
            }
        }
    }
}
