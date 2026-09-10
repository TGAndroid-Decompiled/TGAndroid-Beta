package xh;

import android.content.Context;
import bi.ve;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
public final class r5 {
    public final org.telegram.ui.ActionBar.p2 f45964a;
    public final long f45965b;
    public final pc f45966c;
    public final jc d;
    public final nc e;
    public final ic f45967f;
    public int f45968g;
    public long h;
    public ve f45969i;
    public final ArrayList f45970j = new ArrayList();
    public final HashSet f45971k = new HashSet();
    public final long f45972l = System.currentTimeMillis();
    public boolean f45973m = true;
    public boolean f45974n;
    public boolean f45975o;
    public final q5 f45976p;

    public r5(org.telegram.ui.ActionBar.p2 p2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final r5 f45932b;

            {
                this.f45932b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f45932b.a();
                        return;
                    default:
                        r5 r5Var = this.f45932b;
                        if (!r5Var.f45974n && !r5Var.f45975o && r5Var.f45973m) {
                            r5Var.f45974n = true;
                            ve veVar = r5Var.f45969i;
                            if (veVar != null) {
                                veVar.run(r5Var.f45971k);
                            }
                            if (r5Var.e != null) {
                                r5Var.f45966c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f45976p = r22;
        this.f45964a = p2Var;
        this.f45965b = j3;
        Context t10 = v5.t(p2Var);
        jc jcVar = new jc(t10, p2Var.getResourceProvider());
        this.d = jcVar;
        jcVar.c(R.raw.stars_topup, new String[0]);
        ic icVar = new ic(t10, p2Var.getResourceProvider());
        this.f45967f = icVar;
        icVar.f23985b = 3000L;
        icVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, p2Var.getResourceProvider()));
        nc ncVar = new nc(t10, p2Var.getResourceProvider(), true, false);
        this.e = ncVar;
        ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ncVar.f25483a = new Runnable(this) {
            public final r5 f45932b;

            {
                this.f45932b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f45932b.a();
                        return;
                    default:
                        r5 r5Var = this.f45932b;
                        if (!r5Var.f45974n && !r5Var.f45975o && r5Var.f45973m) {
                            r5Var.f45974n = true;
                            ve veVar = r5Var.f45969i;
                            if (veVar != null) {
                                veVar.run(r5Var.f45971k);
                            }
                            if (r5Var.e != null) {
                                r5Var.f45966c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ncVar.addView(icVar, w7.a6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ncVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        jcVar.setButton(ncVar);
        pc b10 = wc.a0(p2Var).b(jcVar, -1);
        this.f45966c = b10;
        b10.f26089r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final r5 f45932b;

            {
                this.f45932b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f45932b.a();
                        return;
                    default:
                        r5 r5Var = this.f45932b;
                        if (!r5Var.f45974n && !r5Var.f45975o && r5Var.f45973m) {
                            r5Var.f45974n = true;
                            ve veVar = r5Var.f45969i;
                            if (veVar != null) {
                                veVar.run(r5Var.f45971k);
                            }
                            if (r5Var.e != null) {
                                r5Var.f45966c.b();
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
        if (!this.f45974n && !this.f45975o) {
            this.f45975o = true;
            ArrayList arrayList = this.f45970j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f45966c.b();
            }
        }
    }
}
