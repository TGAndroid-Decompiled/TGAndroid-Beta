package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
public final class r5 {
    public final org.telegram.ui.ActionBar.o2 f47744a;
    public final long f47745b;
    public final oc f47746c;
    public final ic d;
    public final mc e;
    public final hc f47747f;
    public int f47748g;
    public long h;
    public ai.i3 f47749i;
    public final ArrayList f47750j = new ArrayList();
    public final HashSet f47751k = new HashSet();
    public final long f47752l = System.currentTimeMillis();
    public boolean f47753m = true;
    public boolean f47754n;
    public boolean f47755o;
    public final q5 f47756p;

    public r5(org.telegram.ui.ActionBar.o2 o2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final r5 f47692b;

            {
                this.f47692b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47692b.a();
                        return;
                    default:
                        r5 r5Var = this.f47692b;
                        if (!r5Var.f47754n && !r5Var.f47755o && r5Var.f47753m) {
                            r5Var.f47754n = true;
                            ai.i3 i3Var = r5Var.f47749i;
                            if (i3Var != null) {
                                i3Var.run(r5Var.f47751k);
                            }
                            if (r5Var.e != null) {
                                r5Var.f47746c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f47756p = r22;
        this.f47744a = o2Var;
        this.f47745b = j3;
        Context t10 = v5.t(o2Var);
        ic icVar = new ic(t10, o2Var.getResourceProvider());
        this.d = icVar;
        icVar.c(R.raw.stars_topup, new String[0]);
        hc hcVar = new hc(t10, o2Var.getResourceProvider());
        this.f47747f = hcVar;
        hcVar.f24626b = 3000L;
        hcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, o2Var.getResourceProvider()));
        mc mcVar = new mc(t10, o2Var.getResourceProvider(), true, false);
        this.e = mcVar;
        mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        mcVar.f26125a = new Runnable(this) {
            public final r5 f47692b;

            {
                this.f47692b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47692b.a();
                        return;
                    default:
                        r5 r5Var = this.f47692b;
                        if (!r5Var.f47754n && !r5Var.f47755o && r5Var.f47753m) {
                            r5Var.f47754n = true;
                            ai.i3 i3Var = r5Var.f47749i;
                            if (i3Var != null) {
                                i3Var.run(r5Var.f47751k);
                            }
                            if (r5Var.e != null) {
                                r5Var.f47746c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        mcVar.addView(hcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        mcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        icVar.setButton(mcVar);
        oc b10 = vc.a0(o2Var).b(icVar, -1);
        this.f47746c = b10;
        b10.f26713r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final r5 f47692b;

            {
                this.f47692b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47692b.a();
                        return;
                    default:
                        r5 r5Var = this.f47692b;
                        if (!r5Var.f47754n && !r5Var.f47755o && r5Var.f47753m) {
                            r5Var.f47754n = true;
                            ai.i3 i3Var = r5Var.f47749i;
                            if (i3Var != null) {
                                i3Var.run(r5Var.f47751k);
                            }
                            if (r5Var.e != null) {
                                r5Var.f47746c.b();
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
        if (!this.f47754n && !this.f47755o) {
            this.f47755o = true;
            ArrayList arrayList = this.f47750j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f47746c.b();
            }
        }
    }
}
