package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
public final class q5 {
    public final org.telegram.ui.ActionBar.n2 f47620a;
    public final long f47621b;
    public final oc f47622c;
    public final ic d;
    public final mc e;
    public final hc f47623f;
    public int f47624g;
    public long h;
    public ai.i3 f47625i;
    public final ArrayList f47626j = new ArrayList();
    public final HashSet f47627k = new HashSet();
    public final long f47628l = System.currentTimeMillis();
    public boolean f47629m = true;
    public boolean f47630n;
    public boolean f47631o;
    public final p5 f47632p;

    public q5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final q5 f47567b;

            {
                this.f47567b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47567b.a();
                        return;
                    default:
                        q5 q5Var = this.f47567b;
                        if (!q5Var.f47630n && !q5Var.f47631o && q5Var.f47629m) {
                            q5Var.f47630n = true;
                            ai.i3 i3Var = q5Var.f47625i;
                            if (i3Var != null) {
                                i3Var.run(q5Var.f47627k);
                            }
                            if (q5Var.e != null) {
                                q5Var.f47622c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47632p = r22;
        this.f47620a = n2Var;
        this.f47621b = j3;
        Context t10 = u5.t(n2Var);
        ic icVar = new ic(t10, n2Var.getResourceProvider());
        this.d = icVar;
        icVar.c(R.raw.stars_topup, new String[0]);
        hc hcVar = new hc(t10, n2Var.getResourceProvider());
        this.f47623f = hcVar;
        hcVar.f24662b = 3000L;
        hcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        mc mcVar = new mc(t10, n2Var.getResourceProvider(), true, false);
        this.e = mcVar;
        mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        mcVar.f26136a = new Runnable(this) {
            public final q5 f47567b;

            {
                this.f47567b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47567b.a();
                        return;
                    default:
                        q5 q5Var = this.f47567b;
                        if (!q5Var.f47630n && !q5Var.f47631o && q5Var.f47629m) {
                            q5Var.f47630n = true;
                            ai.i3 i3Var = q5Var.f47625i;
                            if (i3Var != null) {
                                i3Var.run(q5Var.f47627k);
                            }
                            if (q5Var.e != null) {
                                q5Var.f47622c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        mcVar.addView(hcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        mcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        icVar.setButton(mcVar);
        oc b10 = vc.a0(n2Var).b(icVar, -1);
        this.f47622c = b10;
        b10.f26759r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final q5 f47567b;

            {
                this.f47567b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47567b.a();
                        return;
                    default:
                        q5 q5Var = this.f47567b;
                        if (!q5Var.f47630n && !q5Var.f47631o && q5Var.f47629m) {
                            q5Var.f47630n = true;
                            ai.i3 i3Var = q5Var.f47625i;
                            if (i3Var != null) {
                                i3Var.run(q5Var.f47627k);
                            }
                            if (q5Var.e != null) {
                                q5Var.f47622c.b();
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
        if (!this.f47630n && !this.f47631o) {
            this.f47631o = true;
            ArrayList arrayList = this.f47626j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47622c.b();
            }
        }
    }
}
