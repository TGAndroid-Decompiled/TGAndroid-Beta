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
    public final org.telegram.ui.ActionBar.n2 f51755a;
    public final long f51756b;
    public final rc f51757c;
    public final lc d;
    public final pc f51758e;
    public final kc f51759f;
    public int f51760g;
    public long h;
    public ai.i3 f51761i;
    public final ArrayList f51762j = new ArrayList();
    public final HashSet f51763k = new HashSet();
    public final long f51764l = System.currentTimeMillis();
    public boolean f51765m = true;
    public boolean f51766n;
    public boolean f51767o;
    public final n5 f51768p;

    public o5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final o5 f51688b;

            {
                this.f51688b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51688b.a();
                        return;
                    default:
                        o5 o5Var = this.f51688b;
                        if (!o5Var.f51766n && !o5Var.f51767o && o5Var.f51765m) {
                            o5Var.f51766n = true;
                            ai.i3 i3Var = o5Var.f51761i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f51763k);
                            }
                            if (o5Var.f51758e != null) {
                                o5Var.f51757c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f51768p = r22;
        this.f51755a = n2Var;
        this.f51756b = j3;
        Context t10 = t5.t(n2Var);
        lc lcVar = new lc(t10, n2Var.getResourceProvider());
        this.d = lcVar;
        lcVar.c(R.raw.stars_topup, new String[0]);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.f51759f = kcVar;
        kcVar.f28063b = 3000L;
        kcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        pc pcVar = new pc(t10, n2Var.getResourceProvider(), true, false);
        this.f51758e = pcVar;
        pcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        pcVar.f29594a = new Runnable(this) {
            public final o5 f51688b;

            {
                this.f51688b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51688b.a();
                        return;
                    default:
                        o5 o5Var = this.f51688b;
                        if (!o5Var.f51766n && !o5Var.f51767o && o5Var.f51765m) {
                            o5Var.f51766n = true;
                            ai.i3 i3Var = o5Var.f51761i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f51763k);
                            }
                            if (o5Var.f51758e != null) {
                                o5Var.f51757c.b();
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
        this.f51757c = b10;
        b10.f30346r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final o5 f51688b;

            {
                this.f51688b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51688b.a();
                        return;
                    default:
                        o5 o5Var = this.f51688b;
                        if (!o5Var.f51766n && !o5Var.f51767o && o5Var.f51765m) {
                            o5Var.f51766n = true;
                            ai.i3 i3Var = o5Var.f51761i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f51763k);
                            }
                            if (o5Var.f51758e != null) {
                                o5Var.f51757c.b();
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
        if (!this.f51766n && !this.f51767o) {
            this.f51767o = true;
            ArrayList arrayList = this.f51762j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f51758e != null) {
                this.f51757c.b();
            }
        }
    }
}
