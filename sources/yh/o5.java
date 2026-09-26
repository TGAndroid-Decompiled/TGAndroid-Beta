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
    public final org.telegram.ui.ActionBar.m2 f47820a;
    public final long f47821b;
    public final qc f47822c;
    public final kc d;
    public final oc e;
    public final jc f47823f;
    public int f47824g;
    public long h;
    public ai.i3 f47825i;
    public final ArrayList f47826j = new ArrayList();
    public final HashSet f47827k = new HashSet();
    public final long f47828l = System.currentTimeMillis();
    public boolean f47829m = true;
    public boolean f47830n;
    public boolean f47831o;
    public final n5 f47832p;

    public o5(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final o5 f47771b;

            {
                this.f47771b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47771b.a();
                        return;
                    default:
                        o5 o5Var = this.f47771b;
                        if (!o5Var.f47830n && !o5Var.f47831o && o5Var.f47829m) {
                            o5Var.f47830n = true;
                            ai.i3 i3Var = o5Var.f47825i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47827k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47822c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47832p = r22;
        this.f47820a = m2Var;
        this.f47821b = j3;
        Context t10 = s5.t(m2Var);
        kc kcVar = new kc(t10, m2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, m2Var.getResourceProvider());
        this.f47823f = jcVar;
        jcVar.f25384b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, m2Var.getResourceProvider()));
        oc ocVar = new oc(t10, m2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f27021a = new Runnable(this) {
            public final o5 f47771b;

            {
                this.f47771b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47771b.a();
                        return;
                    default:
                        o5 o5Var = this.f47771b;
                        if (!o5Var.f47830n && !o5Var.f47831o && o5Var.f47829m) {
                            o5Var.f47830n = true;
                            ai.i3 i3Var = o5Var.f47825i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47827k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47822c.b();
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
        qc b10 = xc.a0(m2Var).b(kcVar, -1);
        this.f47822c = b10;
        b10.f27585r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final o5 f47771b;

            {
                this.f47771b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47771b.a();
                        return;
                    default:
                        o5 o5Var = this.f47771b;
                        if (!o5Var.f47830n && !o5Var.f47831o && o5Var.f47829m) {
                            o5Var.f47830n = true;
                            ai.i3 i3Var = o5Var.f47825i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47827k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47822c.b();
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
