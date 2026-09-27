package yh;

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
import org.telegram.ui.Components.xc;
public final class o5 {
    public final org.telegram.ui.ActionBar.o2 f47883a;
    public final long f47884b;
    public final qc f47885c;
    public final kc d;
    public final oc e;
    public final jc f47886f;
    public int f47887g;
    public long h;
    public ai.i3 f47888i;
    public final ArrayList f47889j = new ArrayList();
    public final HashSet f47890k = new HashSet();
    public final long f47891l = System.currentTimeMillis();
    public boolean f47892m = true;
    public boolean f47893n;
    public boolean f47894o;
    public final n5 f47895p;

    public o5(org.telegram.ui.ActionBar.o2 o2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final o5 f47823b;

            {
                this.f47823b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47823b.a();
                        return;
                    default:
                        o5 o5Var = this.f47823b;
                        if (!o5Var.f47893n && !o5Var.f47894o && o5Var.f47892m) {
                            o5Var.f47893n = true;
                            ai.i3 i3Var = o5Var.f47888i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47890k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47885c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47895p = r22;
        this.f47883a = o2Var;
        this.f47884b = j3;
        Context t10 = s5.t(o2Var);
        kc kcVar = new kc(t10, o2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, o2Var.getResourceProvider());
        this.f47886f = jcVar;
        jcVar.f25444b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, o2Var.getResourceProvider()));
        oc ocVar = new oc(t10, o2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f27063a = new Runnable(this) {
            public final o5 f47823b;

            {
                this.f47823b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47823b.a();
                        return;
                    default:
                        o5 o5Var = this.f47823b;
                        if (!o5Var.f47893n && !o5Var.f47894o && o5Var.f47892m) {
                            o5Var.f47893n = true;
                            ai.i3 i3Var = o5Var.f47888i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47890k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47885c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ocVar.addView(jcVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = xc.a0(o2Var).b(kcVar, -1);
        this.f47885c = b10;
        b10.f27699r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final o5 f47823b;

            {
                this.f47823b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47823b.a();
                        return;
                    default:
                        o5 o5Var = this.f47823b;
                        if (!o5Var.f47893n && !o5Var.f47894o && o5Var.f47892m) {
                            o5Var.f47893n = true;
                            ai.i3 i3Var = o5Var.f47888i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47890k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47885c.b();
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
        if (!this.f47893n && !this.f47894o) {
            this.f47894o = true;
            ArrayList arrayList = this.f47889j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47885c.b();
            }
        }
    }
}
