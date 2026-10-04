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
    public final org.telegram.ui.ActionBar.n2 f51753a;
    public final long f51754b;
    public final rc f51755c;
    public final lc d;
    public final pc f51756e;
    public final kc f51757f;
    public int f51758g;
    public long h;
    public ai.i3 f51759i;
    public final ArrayList f51760j = new ArrayList();
    public final HashSet f51761k = new HashSet();
    public final long f51762l = System.currentTimeMillis();
    public boolean f51763m = true;
    public boolean f51764n;
    public boolean f51765o;
    public final n5 f51766p;

    public o5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final o5 f51690b;

            {
                this.f51690b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51690b.a();
                        return;
                    default:
                        o5 o5Var = this.f51690b;
                        if (!o5Var.f51764n && !o5Var.f51765o && o5Var.f51763m) {
                            o5Var.f51764n = true;
                            ai.i3 i3Var = o5Var.f51759i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f51761k);
                            }
                            if (o5Var.f51756e != null) {
                                o5Var.f51755c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f51766p = r22;
        this.f51753a = n2Var;
        this.f51754b = j3;
        Context t10 = t5.t(n2Var);
        lc lcVar = new lc(t10, n2Var.getResourceProvider());
        this.d = lcVar;
        lcVar.c(R.raw.stars_topup, new String[0]);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.f51757f = kcVar;
        kcVar.f28069b = 3000L;
        kcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        pc pcVar = new pc(t10, n2Var.getResourceProvider(), true, false);
        this.f51756e = pcVar;
        pcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        pcVar.f29600a = new Runnable(this) {
            public final o5 f51690b;

            {
                this.f51690b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51690b.a();
                        return;
                    default:
                        o5 o5Var = this.f51690b;
                        if (!o5Var.f51764n && !o5Var.f51765o && o5Var.f51763m) {
                            o5Var.f51764n = true;
                            ai.i3 i3Var = o5Var.f51759i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f51761k);
                            }
                            if (o5Var.f51756e != null) {
                                o5Var.f51755c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        pcVar.addView(kcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        pcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        lcVar.setButton(pcVar);
        rc b10 = yc.a0(n2Var).b(lcVar, -1);
        this.f51755c = b10;
        b10.f30353r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final o5 f51690b;

            {
                this.f51690b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51690b.a();
                        return;
                    default:
                        o5 o5Var = this.f51690b;
                        if (!o5Var.f51764n && !o5Var.f51765o && o5Var.f51763m) {
                            o5Var.f51764n = true;
                            ai.i3 i3Var = o5Var.f51759i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f51761k);
                            }
                            if (o5Var.f51756e != null) {
                                o5Var.f51755c.b();
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
        if (!this.f51764n && !this.f51765o) {
            this.f51765o = true;
            ArrayList arrayList = this.f51760j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f51756e != null) {
                this.f51755c.b();
            }
        }
    }
}
