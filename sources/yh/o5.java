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
    public final org.telegram.ui.ActionBar.n2 f51756a;
    public final long f51757b;
    public final rc f51758c;
    public final lc d;
    public final pc f51759e;
    public final kc f51760f;
    public int f51761g;
    public long h;
    public ai.i3 f51762i;
    public final ArrayList f51763j = new ArrayList();
    public final HashSet f51764k = new HashSet();
    public final long f51765l = System.currentTimeMillis();
    public boolean f51766m = true;
    public boolean f51767n;
    public boolean f51768o;
    public final n5 f51769p;

    public o5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final o5 f51689b;

            {
                this.f51689b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51689b.a();
                        return;
                    default:
                        o5 o5Var = this.f51689b;
                        if (!o5Var.f51767n && !o5Var.f51768o && o5Var.f51766m) {
                            o5Var.f51767n = true;
                            ai.i3 i3Var = o5Var.f51762i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f51764k);
                            }
                            if (o5Var.f51759e != null) {
                                o5Var.f51758c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f51769p = r22;
        this.f51756a = n2Var;
        this.f51757b = j3;
        Context t10 = t5.t(n2Var);
        lc lcVar = new lc(t10, n2Var.getResourceProvider());
        this.d = lcVar;
        lcVar.c(R.raw.stars_topup, new String[0]);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.f51760f = kcVar;
        kcVar.f28064b = 3000L;
        kcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        pc pcVar = new pc(t10, n2Var.getResourceProvider(), true, false);
        this.f51759e = pcVar;
        pcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        pcVar.f29595a = new Runnable(this) {
            public final o5 f51689b;

            {
                this.f51689b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51689b.a();
                        return;
                    default:
                        o5 o5Var = this.f51689b;
                        if (!o5Var.f51767n && !o5Var.f51768o && o5Var.f51766m) {
                            o5Var.f51767n = true;
                            ai.i3 i3Var = o5Var.f51762i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f51764k);
                            }
                            if (o5Var.f51759e != null) {
                                o5Var.f51758c.b();
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
        this.f51758c = b10;
        b10.f30347r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final o5 f51689b;

            {
                this.f51689b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51689b.a();
                        return;
                    default:
                        o5 o5Var = this.f51689b;
                        if (!o5Var.f51767n && !o5Var.f51768o && o5Var.f51766m) {
                            o5Var.f51767n = true;
                            ai.i3 i3Var = o5Var.f51762i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f51764k);
                            }
                            if (o5Var.f51759e != null) {
                                o5Var.f51758c.b();
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
        if (!this.f51767n && !this.f51768o) {
            this.f51768o = true;
            ArrayList arrayList = this.f51763j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f51759e != null) {
                this.f51758c.b();
            }
        }
    }
}
