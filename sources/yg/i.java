package yg;

import android.view.View;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.p1;
import r0.m1;
import ud.k;
import ud.l;
import w3.b0;

public final class i implements g, f, d {
    public View A;
    public int B;
    public int C;

    public final ud.c f50154a;
    public final Runnable h;

    public boolean f50159n;

    public m1 f50160r;
    public int v;

    public int f50162w;

    public e f50164y;

    public final k f50155b = new k(0.0f);

    public final l f50156c = new l();
    public final l d = new l();

    public final AnimationNotificationsLocker f50157e = new AnimationNotificationsLocker();

    public final c f50158f = new c(new n6(this, 23));

    public int f50161s = 1;

    public final h f50163x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f50154a = new ud.c(0, new b0(this, runnable), p1.f23706w, 250L);
    }

    @Override
    public final void L() {
        View view = this.A;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override
    public final View N() {
        return this.A;
    }

    public final void a() {
        boolean z10 = this.f50154a.f48504g;
        boolean z11 = this.f50159n;
        AnimationNotificationsLocker animationNotificationsLocker = this.f50157e;
        if (!z11 && z10) {
            this.f50159n = true;
            animationNotificationsLocker.lock();
        }
        if (!this.f50159n || z10) {
            return;
        }
        this.f50159n = false;
        animationNotificationsLocker.unlock();
    }

    public final float b() {
        e eVar = this.f50164y;
        l lVar = this.d;
        return (eVar == null || this.C <= 0) ? lVar.d.f48522a : Math.max(this.B, lVar.d.f48522a);
    }

    public final float c() {
        e eVar = this.f50164y;
        l lVar = this.f50156c;
        return (eVar == null || this.C <= 0) ? lVar.d.f48522a : Math.max(this.B, lVar.d.f48522a);
    }

    public final int d() {
        return (this.f50164y == null || this.C <= 0) ? Math.max(e(527).d, this.v) : Math.max(this.B, Math.max(e(527).d, this.v));
    }

    public final i0.c e(int i10) {
        m1 m1Var = this.f50160r;
        return m1Var != null ? m1Var.f46619a.f(i10) : i0.c.f10488e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.f50161s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f50163x);
        this.f50162w = Math.max(this.v, i10);
        this.v = i10;
        this.f50161s = 0;
        i(this.f50160r);
    }

    public final void g(int i10) {
        if (i10 > 0) {
            f(i10 + AndroidUtilities.navigationBarHeight);
        } else {
            h(true);
        }
    }

    public final void h(boolean z10) {
        if (this.v == 0) {
            return;
        }
        h hVar = this.f50163x;
        AndroidUtilities.cancelRunOnUIThread(hVar);
        this.f50161s = z10 ? 3 : 2;
        i(this.f50160r);
        if (z10) {
            AndroidUtilities.runOnUIThread(hVar, 1000L);
        }
    }

    public final void i(m1 m1Var) {
        j(m1Var, this.f50160r != null);
    }

    public final void j(m1 m1Var, boolean z10) {
        b bVar;
        int i10;
        ud.c cVar;
        this.f50160r = m1Var;
        i0.c cVarF = i0.c.f10488e;
        i0.c cVarG = m1Var != null ? m1Var.f46619a.g(647) : cVarF;
        if (m1Var != null) {
            cVarF = m1Var.f46619a.f(8);
        }
        c cVar2 = this.f50158f;
        b bVar2 = cVar2.f50147c;
        boolean z11 = cVarF.d > 0;
        if (z10) {
            bVar = z11 ? b.f50143c : b.f50142b;
        } else {
            bVar = z11 ? b.d : b.f50141a;
        }
        if (bVar2 != bVar) {
            cVar2.a(bVar, false);
        }
        int i11 = this.f50161s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && cVarF.d > 0) {
            this.v = 0;
        }
        i0.c cVarA = i0.c.a(cVarF, i0.c.b(0, 0, 0, this.v));
        int i12 = cVarA.f10491c;
        int i13 = cVarA.f10490b;
        int i14 = cVarA.f10489a;
        int i15 = cVarA.d;
        i0.c cVarA2 = i0.c.a(cVarG, cVarA);
        int i16 = cVarA2.d;
        int i17 = cVarA2.f10491c;
        int i18 = cVarA2.f10490b;
        int i19 = cVarA2.f10489a;
        Runnable runnable = this.h;
        ud.c cVar3 = this.f50154a;
        l lVar = this.d;
        l lVar2 = this.f50156c;
        k kVar = this.f50155b;
        if (z10) {
            if (kVar.b(i15 > 0 ? 1.0f : 0.0f)) {
                i10 = i17;
                cVar = cVar3;
            } else {
                cVar = cVar3;
                i10 = i17;
                if (!lVar2.b(i19, i18, i17, i16) && !lVar.b(i14, i13, i12, i15)) {
                    if (bVar2 != bVar) {
                        runnable.run();
                    }
                }
            }
            cVar.b();
            kVar.c(false);
            lVar2.c(false);
            lVar.c(false);
            kVar.f48524c = i15 > 0 ? 1.0f : 0.0f;
            lVar2.e(i19, i18, i10, i16);
            lVar.e(i14, i13, i12, i15);
            ud.c cVar4 = cVar;
            cVar4.c(0.0f);
            cVar4.a(1.0f);
        } else {
            cVar3.b();
            kVar.d(i15 > 0 ? 1.0f : 0.0f);
            lVar2.d(i19, i18, i17, i16);
            lVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override
    public final void k(m1 m1Var) {
        this.B = m1Var.f46619a.f(8).d;
        this.h.run();
    }

    @Override
    public final void u() {
        this.C++;
    }
}
