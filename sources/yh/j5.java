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
    public final org.telegram.ui.ActionBar.m2 f52967a;
    public final long f52968b;
    public final sc f52969c;
    public final mc d;
    public final qc f52970e;
    public final lc f52971f;
    public int f52972g;
    public long h;
    public ai.j3 f52973i;
    public final ArrayList f52974j = new ArrayList();
    public final HashSet f52975k = new HashSet();
    public final long f52976l = System.currentTimeMillis();
    public boolean f52977m = true;
    public boolean f52978n;
    public boolean f52979o;
    public final i5 f52980p;

    public j5(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final j5 f52928b;

            {
                this.f52928b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52928b.a();
                        return;
                    default:
                        j5 j5Var = this.f52928b;
                        if (!j5Var.f52978n && !j5Var.f52979o && j5Var.f52977m) {
                            j5Var.f52978n = true;
                            ai.j3 j3Var = j5Var.f52973i;
                            if (j3Var != null) {
                                j3Var.run(j5Var.f52975k);
                            }
                            if (j5Var.f52970e != null) {
                                j5Var.f52969c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f52980p = r22;
        this.f52967a = m2Var;
        this.f52968b = j3;
        Context t10 = n5.t(m2Var);
        mc mcVar = new mc(t10, m2Var.getResourceProvider());
        this.d = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        lc lcVar = new lc(t10, m2Var.getResourceProvider());
        this.f52971f = lcVar;
        lcVar.f28138b = 3000L;
        lcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, m2Var.getResourceProvider()));
        qc qcVar = new qc(t10, m2Var.getResourceProvider(), true, false);
        this.f52970e = qcVar;
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        qcVar.f29794a = new Runnable(this) {
            public final j5 f52928b;

            {
                this.f52928b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52928b.a();
                        return;
                    default:
                        j5 j5Var = this.f52928b;
                        if (!j5Var.f52978n && !j5Var.f52979o && j5Var.f52977m) {
                            j5Var.f52978n = true;
                            ai.j3 j3Var = j5Var.f52973i;
                            if (j3Var != null) {
                                j3Var.run(j5Var.f52975k);
                            }
                            if (j5Var.f52970e != null) {
                                j5Var.f52969c.b();
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
        this.f52969c = b10;
        b10.f30544r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final j5 f52928b;

            {
                this.f52928b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f52928b.a();
                        return;
                    default:
                        j5 j5Var = this.f52928b;
                        if (!j5Var.f52978n && !j5Var.f52979o && j5Var.f52977m) {
                            j5Var.f52978n = true;
                            ai.j3 j3Var = j5Var.f52973i;
                            if (j3Var != null) {
                                j3Var.run(j5Var.f52975k);
                            }
                            if (j5Var.f52970e != null) {
                                j5Var.f52969c.b();
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
        if (!this.f52978n && !this.f52979o) {
            this.f52979o = true;
            ArrayList arrayList = this.f52974j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f52970e != null) {
                this.f52969c.b();
            }
        }
    }
}
