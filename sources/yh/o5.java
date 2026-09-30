package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
public final class o5 {
    public final org.telegram.ui.ActionBar.m2 f47928a;
    public final long f47929b;
    public final rc f47930c;
    public final lc d;
    public final pc e;
    public final kc f47931f;
    public int f47932g;
    public long h;
    public ai.i3 f47933i;
    public final ArrayList f47934j = new ArrayList();
    public final HashSet f47935k = new HashSet();
    public final long f47936l = System.currentTimeMillis();
    public boolean f47937m = true;
    public boolean f47938n;
    public boolean f47939o;
    public final n5 f47940p;

    public o5(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final o5 f47879b;

            {
                this.f47879b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47879b.a();
                        return;
                    default:
                        o5 o5Var = this.f47879b;
                        if (!o5Var.f47938n && !o5Var.f47939o && o5Var.f47937m) {
                            o5Var.f47938n = true;
                            ai.i3 i3Var = o5Var.f47933i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47935k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47930c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47940p = r22;
        this.f47928a = m2Var;
        this.f47929b = j3;
        Context t10 = s5.t(m2Var);
        lc lcVar = new lc(t10, m2Var.getResourceProvider());
        this.d = lcVar;
        lcVar.c(R.raw.stars_topup, new String[0]);
        kc kcVar = new kc(t10, m2Var.getResourceProvider());
        this.f47931f = kcVar;
        kcVar.f25738b = 3000L;
        kcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, m2Var.getResourceProvider()));
        pc pcVar = new pc(t10, m2Var.getResourceProvider(), true, false);
        this.e = pcVar;
        pcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        pcVar.f27306a = new Runnable(this) {
            public final o5 f47879b;

            {
                this.f47879b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47879b.a();
                        return;
                    default:
                        o5 o5Var = this.f47879b;
                        if (!o5Var.f47938n && !o5Var.f47939o && o5Var.f47937m) {
                            o5Var.f47938n = true;
                            ai.i3 i3Var = o5Var.f47933i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47935k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47930c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        pcVar.addView(kcVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        pcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        lcVar.setButton(pcVar);
        rc b10 = yc.a0(m2Var).b(lcVar, -1);
        this.f47930c = b10;
        b10.f27954r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final o5 f47879b;

            {
                this.f47879b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47879b.a();
                        return;
                    default:
                        o5 o5Var = this.f47879b;
                        if (!o5Var.f47938n && !o5Var.f47939o && o5Var.f47937m) {
                            o5Var.f47938n = true;
                            ai.i3 i3Var = o5Var.f47933i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47935k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47930c.b();
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
        if (!this.f47938n && !this.f47939o) {
            this.f47939o = true;
            ArrayList arrayList = this.f47934j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47930c.b();
            }
        }
    }
}
