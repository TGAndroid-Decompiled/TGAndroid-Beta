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
    public final org.telegram.ui.ActionBar.m2 f47819a;
    public final long f47820b;
    public final qc f47821c;
    public final kc d;
    public final oc e;
    public final jc f47822f;
    public int f47823g;
    public long h;
    public ai.i3 f47824i;
    public final ArrayList f47825j = new ArrayList();
    public final HashSet f47826k = new HashSet();
    public final long f47827l = System.currentTimeMillis();
    public boolean f47828m = true;
    public boolean f47829n;
    public boolean f47830o;
    public final n5 f47831p;

    public o5(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final o5 f47770b;

            {
                this.f47770b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47770b.a();
                        return;
                    default:
                        o5 o5Var = this.f47770b;
                        if (!o5Var.f47829n && !o5Var.f47830o && o5Var.f47828m) {
                            o5Var.f47829n = true;
                            ai.i3 i3Var = o5Var.f47824i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47826k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47821c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47831p = r22;
        this.f47819a = m2Var;
        this.f47820b = j3;
        Context t10 = s5.t(m2Var);
        kc kcVar = new kc(t10, m2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, m2Var.getResourceProvider());
        this.f47822f = jcVar;
        jcVar.f25374b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, m2Var.getResourceProvider()));
        oc ocVar = new oc(t10, m2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f27028a = new Runnable(this) {
            public final o5 f47770b;

            {
                this.f47770b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47770b.a();
                        return;
                    default:
                        o5 o5Var = this.f47770b;
                        if (!o5Var.f47829n && !o5Var.f47830o && o5Var.f47828m) {
                            o5Var.f47829n = true;
                            ai.i3 i3Var = o5Var.f47824i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47826k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47821c.b();
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
        this.f47821c = b10;
        b10.f27643r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final o5 f47770b;

            {
                this.f47770b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47770b.a();
                        return;
                    default:
                        o5 o5Var = this.f47770b;
                        if (!o5Var.f47829n && !o5Var.f47830o && o5Var.f47828m) {
                            o5Var.f47829n = true;
                            ai.i3 i3Var = o5Var.f47824i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47826k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47821c.b();
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
        if (!this.f47829n && !this.f47830o) {
            this.f47830o = true;
            ArrayList arrayList = this.f47825j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47821c.b();
            }
        }
    }
}
