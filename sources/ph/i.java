package ph;

import android.view.View;
import le.m;
import le.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.web.b1;
import r0.i1;
import r0.l1;
public final class i implements g, f, d {
    public View E;
    public int F;
    public int G;
    public final le.e f41366a;
    public final Runnable h;
    public boolean f41370n;
    public l1 f41371r;
    public int v;
    public int f41373w;
    public e f41375y;
    public final m f41367b = new m(0.0f);
    public final n f41368c = new n();
    public final n d = new n();
    public final AnimationNotificationsLocker e = new AnimationNotificationsLocker();
    public final c f41369f = new c(new b1(this, 4));
    public int f41372s = 1;
    public final h f41374x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f41366a = new le.e(0, new m5.e(this, runnable, false, 15), p1.f19699w, 250L);
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
        boolean z10 = this.f41366a.f14178g;
        boolean z11 = this.f41370n;
        AnimationNotificationsLocker animationNotificationsLocker = this.e;
        if (!z11 && z10) {
            this.f41370n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f41370n && !z10) {
            this.f41370n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float b() {
        e eVar = this.f41375y;
        n nVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f14193a);
        }
        return nVar.d.f14193a;
    }

    public final float c() {
        e eVar = this.f41375y;
        n nVar = this.f41368c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f14193a);
        }
        return nVar.d.f14193a;
    }

    public final int d() {
        if (this.f41375y != null && this.G > 0) {
            return Math.max(this.F, Math.max(e(527).d, this.v));
        }
        return Math.max(e(527).d, this.v);
    }

    public final i0.b e(int i10) {
        l1 l1Var = this.f41371r;
        if (l1Var != null) {
            return l1Var.f42154a.f(i10);
        }
        return i0.b.e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.f41372s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f41374x);
        this.f41373w = Math.max(this.v, i10);
        this.v = i10;
        this.f41372s = 0;
        i(this.f41371r);
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
            h hVar = this.f41374x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f41372s = i10;
            i(this.f41371r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void i(l1 l1Var) {
        boolean z10;
        if (this.f41371r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(l1Var, z10);
    }

    @Override
    public final void j(l1 l1Var) {
        this.F = l1Var.f42154a.f(8).d;
        this.h.run();
    }

    public final void k(l1 l1Var, boolean z10) {
        i0.b bVar;
        boolean z11;
        b bVar2;
        float f7;
        int i10;
        le.e eVar;
        float f10;
        this.f41371r = l1Var;
        i0.b bVar3 = i0.b.e;
        if (l1Var != null) {
            i1 i1Var = l1Var.f42154a;
            bVar = i0.b.a(i1Var.f(647), i1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (l1Var != null) {
            bVar3 = l1Var.f42154a.f(8);
        }
        c cVar = this.f41369f;
        b bVar4 = cVar.f41360c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f41355a;
            }
        } else if (z11) {
            bVar2 = b.f41357c;
        } else {
            bVar2 = b.f41356b;
        }
        if (bVar4 != bVar2) {
            cVar.a(bVar2, false);
        }
        int i11 = this.f41372s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.f10594c;
        int i13 = a2.f10593b;
        int i14 = a2.f10592a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.f10594c;
        int i18 = a10.f10593b;
        int i19 = a10.f10592a;
        Runnable runnable = this.h;
        le.e eVar2 = this.f41366a;
        n nVar = this.d;
        n nVar2 = this.f41368c;
        m mVar = this.f41367b;
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
                    if (bVar4 != bVar2) {
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
            mVar.f14195c = f10;
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
