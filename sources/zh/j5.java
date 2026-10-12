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
    public final org.telegram.ui.ActionBar.m2 f50708a;
    public final long f50709b;
    public final sc f50710c;
    public final mc d;
    public final qc e;
    public final lc f50711f;
    public int f50712g;
    public long h;
    public bi.y2 f50713i;
    public final ArrayList f50714j = new ArrayList();
    public final HashSet f50715k = new HashSet();
    public final long f50716l = System.currentTimeMillis();
    public boolean f50717m = true;
    public boolean f50718n;
    public boolean f50719o;
    public final i5 f50720p;

    public j5(org.telegram.ui.ActionBar.m2 m2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final j5 f50672b;

            {
                this.f50672b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f50672b.a();
                        return;
                    default:
                        j5 j5Var = this.f50672b;
                        if (!j5Var.f50718n && !j5Var.f50719o && j5Var.f50717m) {
                            j5Var.f50718n = true;
                            bi.y2 y2Var = j5Var.f50713i;
                            if (y2Var != null) {
                                y2Var.run(j5Var.f50715k);
                            }
                            if (j5Var.e != null) {
                                j5Var.f50710c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f50720p = r22;
        this.f50708a = m2Var;
        this.f50709b = j10;
        Context t10 = n5.t(m2Var);
        mc mcVar = new mc(t10, m2Var.getResourceProvider());
        this.d = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        lc lcVar = new lc(t10, m2Var.getResourceProvider());
        this.f50711f = lcVar;
        lcVar.f27019b = 3000L;
        lcVar.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, m2Var.getResourceProvider()));
        qc qcVar = new qc(t10, m2Var.getResourceProvider(), true, false);
        this.e = qcVar;
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        qcVar.f28576a = new Runnable(this) {
            public final j5 f50672b;

            {
                this.f50672b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f50672b.a();
                        return;
                    default:
                        j5 j5Var = this.f50672b;
                        if (!j5Var.f50718n && !j5Var.f50719o && j5Var.f50717m) {
                            j5Var.f50718n = true;
                            bi.y2 y2Var = j5Var.f50713i;
                            if (y2Var != null) {
                                y2Var.run(j5Var.f50715k);
                            }
                            if (j5Var.e != null) {
                                j5Var.f50710c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        qcVar.addView(lcVar, w7.a6.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        qcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        mcVar.setButton(qcVar);
        sc b10 = zc.a0(m2Var).b(mcVar, -1);
        this.f50710c = b10;
        b10.f29110r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final j5 f50672b;

            {
                this.f50672b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f50672b.a();
                        return;
                    default:
                        j5 j5Var = this.f50672b;
                        if (!j5Var.f50718n && !j5Var.f50719o && j5Var.f50717m) {
                            j5Var.f50718n = true;
                            bi.y2 y2Var = j5Var.f50713i;
                            if (y2Var != null) {
                                y2Var.run(j5Var.f50715k);
                            }
                            if (j5Var.e != null) {
                                j5Var.f50710c.b();
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
        if (!this.f50718n && !this.f50719o) {
            this.f50719o = true;
            ArrayList arrayList = this.f50714j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f50710c.b();
            }
        }
    }
}
