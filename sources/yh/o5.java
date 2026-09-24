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
import org.telegram.ui.Components.yc;
public final class o5 {
    public final org.telegram.ui.ActionBar.m2 f47809a;
    public final long f47810b;
    public final qc f47811c;
    public final kc d;
    public final oc e;
    public final jc f47812f;
    public int f47813g;
    public long h;
    public ai.i3 f47814i;
    public final ArrayList f47815j = new ArrayList();
    public final HashSet f47816k = new HashSet();
    public final long f47817l = System.currentTimeMillis();
    public boolean f47818m = true;
    public boolean f47819n;
    public boolean f47820o;
    public final n5 f47821p;

    public o5(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final o5 f47760b;

            {
                this.f47760b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47760b.a();
                        return;
                    default:
                        o5 o5Var = this.f47760b;
                        if (!o5Var.f47819n && !o5Var.f47820o && o5Var.f47818m) {
                            o5Var.f47819n = true;
                            ai.i3 i3Var = o5Var.f47814i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47816k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47811c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47821p = r22;
        this.f47809a = m2Var;
        this.f47810b = j3;
        Context t10 = t5.t(m2Var);
        kc kcVar = new kc(t10, m2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, m2Var.getResourceProvider());
        this.f47812f = jcVar;
        jcVar.f25359b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, m2Var.getResourceProvider()));
        oc ocVar = new oc(t10, m2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f27017a = new Runnable(this) {
            public final o5 f47760b;

            {
                this.f47760b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47760b.a();
                        return;
                    default:
                        o5 o5Var = this.f47760b;
                        if (!o5Var.f47819n && !o5Var.f47820o && o5Var.f47818m) {
                            o5Var.f47819n = true;
                            ai.i3 i3Var = o5Var.f47814i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47816k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47811c.b();
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
        qc b10 = yc.a0(m2Var).b(kcVar, -1);
        this.f47811c = b10;
        b10.f27579r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final o5 f47760b;

            {
                this.f47760b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47760b.a();
                        return;
                    default:
                        o5 o5Var = this.f47760b;
                        if (!o5Var.f47819n && !o5Var.f47820o && o5Var.f47818m) {
                            o5Var.f47819n = true;
                            ai.i3 i3Var = o5Var.f47814i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.f47816k);
                            }
                            if (o5Var.e != null) {
                                o5Var.f47811c.b();
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
        if (!this.f47819n && !this.f47820o) {
            this.f47820o = true;
            ArrayList arrayList = this.f47815j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47811c.b();
            }
        }
    }
}
