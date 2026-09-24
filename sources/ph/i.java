package ph;

import android.view.View;
import ii.q1;
import le.n;
import le.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.o1;
import r0.i1;
import r0.l1;
public final class i implements g, f, d {
    public View E;
    public int F;
    public int G;
    public final le.f f41325a;
    public final Runnable h;
    public boolean f41329n;
    public l1 f41330r;
    public int v;
    public int f41332w;
    public e f41334y;
    public final n f41326b = new n(0.0f);
    public final o f41327c = new o();
    public final o d = new o();
    public final AnimationNotificationsLocker e = new AnimationNotificationsLocker();
    public final c f41328f = new c(new q1(this, 7));
    public int f41331s = 1;
    public final h f41333x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f41325a = new le.f(0, new o0.a(this, runnable, false, 11), o1.f19654w, 250L);
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
        boolean z10 = this.f41325a.f14194g;
        boolean z11 = this.f41329n;
        AnimationNotificationsLocker animationNotificationsLocker = this.e;
        if (!z11 && z10) {
            this.f41329n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f41329n && !z10) {
            this.f41329n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float b() {
        e eVar = this.f41334y;
        o oVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, oVar.d.f14209a);
        }
        return oVar.d.f14209a;
    }

    public final float c() {
        e eVar = this.f41334y;
        o oVar = this.f41327c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, oVar.d.f14209a);
        }
        return oVar.d.f14209a;
    }

    public final int d() {
        if (this.f41334y != null && this.G > 0) {
            return Math.max(this.F, Math.max(e(527).d, this.v));
        }
        return Math.max(e(527).d, this.v);
    }

    public final i0.b e(int i10) {
        l1 l1Var = this.f41330r;
        if (l1Var != null) {
            return l1Var.f42126a.f(i10);
        }
        return i0.b.e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.f41331s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f41333x);
        this.f41332w = Math.max(this.v, i10);
        this.v = i10;
        this.f41331s = 0;
        i(this.f41330r);
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
            h hVar = this.f41333x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f41331s = i10;
            i(this.f41330r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void i(l1 l1Var) {
        boolean z10;
        if (this.f41330r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(l1Var, z10);
    }

    @Override
    public final void j(l1 l1Var) {
        this.F = l1Var.f42126a.f(8).d;
        this.h.run();
    }

    public final void k(l1 l1Var, boolean z10) {
        i0.b bVar;
        boolean z11;
        b bVar2;
        float f7;
        int i10;
        le.f fVar;
        float f10;
        this.f41330r = l1Var;
        i0.b bVar3 = i0.b.e;
        if (l1Var != null) {
            i1 i1Var = l1Var.f42126a;
            bVar = i0.b.a(i1Var.f(647), i1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (l1Var != null) {
            bVar3 = l1Var.f42126a.f(8);
        }
        c cVar = this.f41328f;
        b bVar4 = cVar.f41319c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f41314a;
            }
        } else if (z11) {
            bVar2 = b.f41316c;
        } else {
            bVar2 = b.f41315b;
        }
        if (bVar4 != bVar2) {
            cVar.a(bVar2, false);
        }
        int i11 = this.f41331s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.f10578c;
        int i13 = a2.f10577b;
        int i14 = a2.f10576a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.f10578c;
        int i18 = a10.f10577b;
        int i19 = a10.f10576a;
        Runnable runnable = this.h;
        le.f fVar2 = this.f41325a;
        o oVar = this.d;
        o oVar2 = this.f41327c;
        n nVar = this.f41326b;
        if (z10) {
            if (i15 > 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!nVar.b(f7)) {
                fVar = fVar2;
                i10 = i17;
                if (!oVar2.b(i19, i18, i17, i16) && !oVar.b(i14, i13, i12, i15)) {
                    if (bVar4 != bVar2) {
                        runnable.run();
                    }
                }
            } else {
                i10 = i17;
                fVar = fVar2;
            }
            fVar.b();
            nVar.c(false);
            oVar2.c(false);
            oVar.c(false);
            if (i15 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            nVar.f14211c = f10;
            oVar2.e(i19, i18, i10, i16);
            oVar.e(i14, i13, i12, i15);
            le.f fVar3 = fVar;
            fVar3.c(0.0f);
            fVar3.a(1.0f);
        } else {
            float f11 = 0.0f;
            fVar2.b();
            if (i15 > 0) {
                f11 = 1.0f;
            }
            nVar.d(f11);
            oVar2.d(i19, i18, i17, i16);
            oVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override
    public final void s() {
        this.G++;
    }
}
