package rh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wb;
import org.telegram.ui.nc;
public final class z5 {
    public final org.telegram.ui.ActionBar.k2 f47820a;
    public final long f47821b;
    public final wb f47822c;
    public final qb d;
    public final ub e;
    public final d6 f47823f;
    public int f47824g;
    public long h;
    public nc f47825i;
    public final ArrayList f47826j = new ArrayList();
    public final HashSet f47827k = new HashSet();
    public final long f47828l = System.currentTimeMillis();
    public boolean f47829m = true;
    public boolean f47830n;
    public boolean f47831o;
    public final y5 f47832p;

    public z5(org.telegram.ui.ActionBar.k2 k2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final z5 f47772b;

            {
                this.f47772b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47772b.a();
                        return;
                    default:
                        z5 z5Var = this.f47772b;
                        if (!z5Var.f47830n && !z5Var.f47831o && z5Var.f47829m) {
                            z5Var.f47830n = true;
                            nc ncVar = z5Var.f47825i;
                            if (ncVar != null) {
                                ncVar.a(z5Var.f47827k);
                            }
                            if (z5Var.e != null) {
                                z5Var.f47822c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47832p = r22;
        this.f47820a = k2Var;
        this.f47821b = j10;
        Context t10 = e6.t(k2Var);
        qb qbVar = new qb(t10, k2Var.getResourceProvider());
        this.d = qbVar;
        qbVar.c(2131624224, new String[0]);
        ?? pbVar = new pb(t10, k2Var.getResourceProvider());
        this.f47823f = pbVar;
        pbVar.f29396b = 3000L;
        int i10 = org.telegram.ui.ActionBar.t6.uj;
        org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
        org.telegram.utils.twidget.t tVar = new org.telegram.utils.twidget.t(28);
        org.telegram.utils.twidget.t tVar2 = new org.telegram.utils.twidget.t(29);
        int Q = org.telegram.ui.ActionBar.a7.Q(i10, -1, 0, 0.0f, resourceProvider);
        tVar2.d(Q, pbVar);
        org.telegram.ui.ActionBar.u6 x10 = org.telegram.ui.ActionBar.a7.x(101, pbVar);
        x10.c(i10, -1, 0, 0.0f, resourceProvider);
        x10.f21397n = tVar;
        x10.f21398o = tVar2;
        x10.f21396m = false;
        x10.f21391g = Q;
        ub ubVar = new ub(t10, k2Var.getResourceProvider(), true, false);
        this.e = ubVar;
        ubVar.e(dd.L0(2131745041, null));
        ubVar.f30924b = new Runnable(this) {
            public final z5 f47772b;

            {
                this.f47772b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47772b.a();
                        return;
                    default:
                        z5 z5Var = this.f47772b;
                        if (!z5Var.f47830n && !z5Var.f47831o && z5Var.f47829m) {
                            z5Var.f47830n = true;
                            nc ncVar = z5Var.f47825i;
                            if (ncVar != null) {
                                ncVar.a(z5Var.f47827k);
                            }
                            if (z5Var.e != null) {
                                z5Var.f47822c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ubVar.addView((View) pbVar, w7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ubVar.e.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(8.0f));
        qbVar.setButton(ubVar);
        wb b10 = cc.a0(k2Var).b(qbVar, -1);
        this.f47822c = b10;
        b10.f32209r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final z5 f47772b;

            {
                this.f47772b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47772b.a();
                        return;
                    default:
                        z5 z5Var = this.f47772b;
                        if (!z5Var.f47830n && !z5Var.f47831o && z5Var.f47829m) {
                            z5Var.f47830n = true;
                            nc ncVar = z5Var.f47825i;
                            if (ncVar != null) {
                                ncVar.a(z5Var.f47827k);
                            }
                            if (z5Var.e != null) {
                                z5Var.f47822c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        org.telegram.messenger.i0.r(r22);
        org.telegram.messenger.i0.h3(r22, 3000L);
    }

    public final void a() {
        if (!this.f47830n && !this.f47831o) {
            this.f47831o = true;
            ArrayList arrayList = this.f47826j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47822c.b();
            }
        }
    }
}
