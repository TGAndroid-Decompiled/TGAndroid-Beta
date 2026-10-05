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
public final class p5 {
    public final org.telegram.ui.ActionBar.n2 f51805a;
    public final long f51806b;
    public final rc f51807c;
    public final lc d;
    public final pc f51808e;
    public final kc f51809f;
    public int f51810g;
    public long h;
    public ai.i3 f51811i;
    public final ArrayList f51812j = new ArrayList();
    public final HashSet f51813k = new HashSet();
    public final long f51814l = System.currentTimeMillis();
    public boolean f51815m = true;
    public boolean f51816n;
    public boolean f51817o;
    public final o5 f51818p;

    public p5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final p5 f51737b;

            {
                this.f51737b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51737b.a();
                        return;
                    default:
                        p5 p5Var = this.f51737b;
                        if (!p5Var.f51816n && !p5Var.f51817o && p5Var.f51815m) {
                            p5Var.f51816n = true;
                            ai.i3 i3Var = p5Var.f51811i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f51813k);
                            }
                            if (p5Var.f51808e != null) {
                                p5Var.f51807c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f51818p = r22;
        this.f51805a = n2Var;
        this.f51806b = j3;
        Context t10 = u5.t(n2Var);
        lc lcVar = new lc(t10, n2Var.getResourceProvider());
        this.d = lcVar;
        lcVar.c(R.raw.stars_topup, new String[0]);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.f51809f = kcVar;
        kcVar.f28155b = 3000L;
        kcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        pc pcVar = new pc(t10, n2Var.getResourceProvider(), true, false);
        this.f51808e = pcVar;
        pcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        pcVar.f29693a = new Runnable(this) {
            public final p5 f51737b;

            {
                this.f51737b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51737b.a();
                        return;
                    default:
                        p5 p5Var = this.f51737b;
                        if (!p5Var.f51816n && !p5Var.f51817o && p5Var.f51815m) {
                            p5Var.f51816n = true;
                            ai.i3 i3Var = p5Var.f51811i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f51813k);
                            }
                            if (p5Var.f51808e != null) {
                                p5Var.f51807c.b();
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
        this.f51807c = b10;
        b10.f30435r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final p5 f51737b;

            {
                this.f51737b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f51737b.a();
                        return;
                    default:
                        p5 p5Var = this.f51737b;
                        if (!p5Var.f51816n && !p5Var.f51817o && p5Var.f51815m) {
                            p5Var.f51816n = true;
                            ai.i3 i3Var = p5Var.f51811i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f51813k);
                            }
                            if (p5Var.f51808e != null) {
                                p5Var.f51807c.b();
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
        if (!this.f51816n && !this.f51817o) {
            this.f51817o = true;
            ArrayList arrayList = this.f51812j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f51808e != null) {
                this.f51807c.b();
            }
        }
    }
}
