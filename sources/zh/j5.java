package zh;

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
    public final org.telegram.ui.ActionBar.m2 f50709a;
    public final long f50710b;
    public final sc f50711c;
    public final mc d;
    public final qc e;
    public final lc f50712f;
    public int f50713g;
    public long h;
    public bi.y2 f50714i;
    public final ArrayList f50715j = new ArrayList();
    public final HashSet f50716k = new HashSet();
    public final long f50717l = System.currentTimeMillis();
    public boolean f50718m = true;
    public boolean f50719n;
    public boolean f50720o;
    public final i5 f50721p;

    public j5(org.telegram.ui.ActionBar.m2 m2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final j5 f50673b;

            {
                this.f50673b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f50673b.a();
                        return;
                    default:
                        j5 j5Var = this.f50673b;
                        if (!j5Var.f50719n && !j5Var.f50720o && j5Var.f50718m) {
                            j5Var.f50719n = true;
                            bi.y2 y2Var = j5Var.f50714i;
                            if (y2Var != null) {
                                y2Var.run(j5Var.f50716k);
                            }
                            if (j5Var.e != null) {
                                j5Var.f50711c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f50721p = r22;
        this.f50709a = m2Var;
        this.f50710b = j10;
        Context t10 = n5.t(m2Var);
        mc mcVar = new mc(t10, m2Var.getResourceProvider());
        this.d = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        lc lcVar = new lc(t10, m2Var.getResourceProvider());
        this.f50712f = lcVar;
        lcVar.f26719b = 3000L;
        lcVar.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, m2Var.getResourceProvider()));
        qc qcVar = new qc(t10, m2Var.getResourceProvider(), true, false);
        this.e = qcVar;
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        qcVar.f28266a = new Runnable(this) {
            public final j5 f50673b;

            {
                this.f50673b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f50673b.a();
                        return;
                    default:
                        j5 j5Var = this.f50673b;
                        if (!j5Var.f50719n && !j5Var.f50720o && j5Var.f50718m) {
                            j5Var.f50719n = true;
                            bi.y2 y2Var = j5Var.f50714i;
                            if (y2Var != null) {
                                y2Var.run(j5Var.f50716k);
                            }
                            if (j5Var.e != null) {
                                j5Var.f50711c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        qcVar.addView(lcVar, w7.z5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        qcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        mcVar.setButton(qcVar);
        sc b10 = zc.a0(m2Var).b(mcVar, -1);
        this.f50711c = b10;
        b10.f28813r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final j5 f50673b;

            {
                this.f50673b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f50673b.a();
                        return;
                    default:
                        j5 j5Var = this.f50673b;
                        if (!j5Var.f50719n && !j5Var.f50720o && j5Var.f50718m) {
                            j5Var.f50719n = true;
                            bi.y2 y2Var = j5Var.f50714i;
                            if (y2Var != null) {
                                y2Var.run(j5Var.f50716k);
                            }
                            if (j5Var.e != null) {
                                j5Var.f50711c.b();
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
        if (!this.f50719n && !this.f50720o) {
            this.f50720o = true;
            ArrayList arrayList = this.f50715j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f50711c.b();
            }
        }
    }
}
