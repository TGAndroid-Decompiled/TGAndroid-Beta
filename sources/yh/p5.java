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
public final class p5 {
    public final org.telegram.ui.ActionBar.n2 f47858a;
    public final long f47859b;
    public final qc f47860c;
    public final kc d;
    public final oc e;
    public final jc f47861f;
    public int f47862g;
    public long h;
    public ai.i3 f47863i;
    public final ArrayList f47864j = new ArrayList();
    public final HashSet f47865k = new HashSet();
    public final long f47866l = System.currentTimeMillis();
    public boolean f47867m = true;
    public boolean f47868n;
    public boolean f47869o;
    public final o5 f47870p;

    public p5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final p5 f47817b;

            {
                this.f47817b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47817b.a();
                        return;
                    default:
                        p5 p5Var = this.f47817b;
                        if (!p5Var.f47868n && !p5Var.f47869o && p5Var.f47867m) {
                            p5Var.f47868n = true;
                            ai.i3 i3Var = p5Var.f47863i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47865k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47860c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47870p = r22;
        this.f47858a = n2Var;
        this.f47859b = j3;
        Context t10 = t5.t(n2Var);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, n2Var.getResourceProvider());
        this.f47861f = jcVar;
        jcVar.f25289b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, n2Var.getResourceProvider()));
        oc ocVar = new oc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f26906a = new Runnable(this) {
            public final p5 f47817b;

            {
                this.f47817b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47817b.a();
                        return;
                    default:
                        p5 p5Var = this.f47817b;
                        if (!p5Var.f47868n && !p5Var.f47869o && p5Var.f47867m) {
                            p5Var.f47868n = true;
                            ai.i3 i3Var = p5Var.f47863i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47865k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47860c.b();
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
        qc b10 = xc.a0(n2Var).b(kcVar, -1);
        this.f47860c = b10;
        b10.f27558r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final p5 f47817b;

            {
                this.f47817b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47817b.a();
                        return;
                    default:
                        p5 p5Var = this.f47817b;
                        if (!p5Var.f47868n && !p5Var.f47869o && p5Var.f47867m) {
                            p5Var.f47868n = true;
                            ai.i3 i3Var = p5Var.f47863i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.f47865k);
                            }
                            if (p5Var.e != null) {
                                p5Var.f47860c.b();
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
        if (!this.f47868n && !this.f47869o) {
            this.f47869o = true;
            ArrayList arrayList = this.f47864j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47860c.b();
            }
        }
    }
}
