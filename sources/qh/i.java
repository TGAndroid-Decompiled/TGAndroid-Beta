package qh;

import android.view.View;
import le.m;
import le.n;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.web.b1;
import r0.l1;
public final class i implements g, f, d {
    public View E;
    public int F;
    public int G;
    public final le.e f44677a;
    public final Runnable h;
    public boolean f44682n;
    public l1 f44683r;
    public int v;
    public int f44685w;
    public e f44687y;
    public final m f44678b = new m(0.0f);
    public final n f44679c = new n();
    public final n d = new n();
    public final AnimationNotificationsLocker f44680e = new AnimationNotificationsLocker();
    public final c f44681f = new c(new b1(this, 4));
    public int f44684s = 1;
    public final h f44686x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f44677a = new le.e(0, new z0(this, runnable, false, 13), p1.f21302w, 250L);
    }

    @Override
    public final void J() {
        View view = this.E;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override
    public final View N() {
        return this.E;
    }

    public final void a() {
        boolean z10 = this.f44677a.f15405g;
        boolean z11 = this.f44682n;
        AnimationNotificationsLocker animationNotificationsLocker = this.f44680e;
        if (!z11 && z10) {
            this.f44682n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f44682n && !z10) {
            this.f44682n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float b() {
        e eVar = this.f44687y;
        n nVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f15423a);
        }
        return nVar.d.f15423a;
    }

    public final float c() {
        e eVar = this.f44687y;
        n nVar = this.f44679c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f15423a);
        }
        return nVar.d.f15423a;
    }

    public final int d() {
        if (this.f44687y != null && this.G > 0) {
            return Math.max(this.F, Math.max(e(527).d, this.v));
        }
        return Math.max(e(527).d, this.v);
    }

    public final i0.c e(int i10) {
        l1 l1Var = this.f44683r;
        if (l1Var != null) {
            return l1Var.f44739a.f(i10);
        }
        return i0.c.f11450e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.f44684s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f44686x);
        this.f44685w = Math.max(this.v, i10);
        this.v = i10;
        this.f44684s = 0;
        i(this.f44683r);
    }

    public final void g(int i10) {
        if (i10 > 0) {
            f(i10 + AndroidUtilities.navigationBarHeight);
        } else {
            h(true);
        }
    }

    public final void h(boolean z10) {
        int i10;
        if (this.v != 0) {
            h hVar = this.f44686x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f44684s = i10;
            i(this.f44683r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void i(l1 l1Var) {
        boolean z10;
        if (this.f44683r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(l1Var, z10);
    }

    @Override
    public final void j(l1 l1Var) {
        this.F = l1Var.f44739a.f(8).d;
        this.h.run();
    }

    public final void k(l1 l1Var, boolean z10) {
        i0.c cVar;
        boolean z11;
        b bVar;
        float f7;
        int i10;
        le.e eVar;
        float f10;
        this.f44683r = l1Var;
        i0.c cVar2 = i0.c.f11450e;
        if (l1Var != null) {
            cVar = l1Var.f44739a.g(647);
        } else {
            cVar = cVar2;
        }
        if (l1Var != null) {
            cVar2 = l1Var.f44739a.f(8);
        }
        c cVar3 = this.f44681f;
        b bVar2 = cVar3.f44670c;
        if (cVar2.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar = b.d;
            } else {
                bVar = b.f44664a;
            }
        } else if (z11) {
            bVar = b.f44666c;
        } else {
            bVar = b.f44665b;
        }
        if (bVar2 != bVar) {
            cVar3.a(bVar, false);
        }
        int i11 = this.f44684s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && cVar2.d > 0) {
            this.v = 0;
        }
        i0.c a2 = i0.c.a(cVar2, i0.c.b(0, 0, 0, this.v));
        int i12 = a2.f11453c;
        int i13 = a2.f11452b;
        int i14 = a2.f11451a;
        int i15 = a2.d;
        i0.c a10 = i0.c.a(cVar, a2);
        int i16 = a10.d;
        int i17 = a10.f11453c;
        int i18 = a10.f11452b;
        int i19 = a10.f11451a;
        Runnable runnable = this.h;
        le.e eVar2 = this.f44677a;
        n nVar = this.d;
        n nVar2 = this.f44679c;
        m mVar = this.f44678b;
        if (z10) {
            if (i15 > 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!mVar.b(f7)) {
                eVar = eVar2;
                i10 = i17;
                if (!nVar2.b(i19, i18, i17, i16) && !nVar.b(i14, i13, i12, i15)) {
                    if (bVar2 != bVar) {
                        runnable.run();
                    }
                }
            } else {
                i10 = i17;
                eVar = eVar2;
            }
            eVar.b();
            mVar.c(false);
            nVar2.c(false);
            nVar.c(false);
            if (i15 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            mVar.f15425c = f10;
            nVar2.e(i19, i18, i10, i16);
            nVar.e(i14, i13, i12, i15);
            le.e eVar3 = eVar;
            eVar3.c(0.0f);
            eVar3.a(1.0f);
        } else {
            float f11 = 0.0f;
            eVar2.b();
            if (i15 > 0) {
                f11 = 1.0f;
            }
            mVar.d(f11);
            nVar2.d(i19, i18, i17, i16);
            nVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override
    public final void s() {
        this.G++;
    }
}
