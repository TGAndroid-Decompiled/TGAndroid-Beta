package ph;

import android.view.View;
import ii.q1;
import le.m;
import le.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.p1;
import r0.i1;
import r0.l1;
public final class i implements g, f, d {
    public View E;
    public int F;
    public int G;
    public final le.e f44714a;
    public final Runnable h;
    public boolean f44719n;
    public l1 f44720r;
    public int v;
    public int f44722w;
    public e f44724y;
    public final m f44715b = new m(0.0f);
    public final n f44716c = new n();
    public final n d = new n();
    public final AnimationNotificationsLocker f44717e = new AnimationNotificationsLocker();
    public final c f44718f = new c(new q1(this, 7));
    public int f44721s = 1;
    public final h f44723x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f44714a = new le.e(0, new o0.a(this, runnable, false, 11), p1.f21444w, 250L);
    }

    @Override
    public final void J() {
        View view = this.E;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override
    public final View L() {
        return this.E;
    }

    public final void a() {
        boolean z10 = this.f44714a.f15445g;
        boolean z11 = this.f44719n;
        AnimationNotificationsLocker animationNotificationsLocker = this.f44717e;
        if (!z11 && z10) {
            this.f44719n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f44719n && !z10) {
            this.f44719n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float b() {
        e eVar = this.f44724y;
        n nVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f15463a);
        }
        return nVar.d.f15463a;
    }

    public final float c() {
        e eVar = this.f44724y;
        n nVar = this.f44716c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f15463a);
        }
        return nVar.d.f15463a;
    }

    public final int d() {
        if (this.f44724y != null && this.G > 0) {
            return Math.max(this.F, Math.max(e(527).d, this.v));
        }
        return Math.max(e(527).d, this.v);
    }

    public final i0.b e(int i10) {
        l1 l1Var = this.f44720r;
        if (l1Var != null) {
            return l1Var.f45610a.f(i10);
        }
        return i0.b.f11524e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.f44721s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f44723x);
        this.f44722w = Math.max(this.v, i10);
        this.v = i10;
        this.f44721s = 0;
        i(this.f44720r);
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
            h hVar = this.f44723x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f44721s = i10;
            i(this.f44720r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void i(l1 l1Var) {
        boolean z10;
        if (this.f44720r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(l1Var, z10);
    }

    @Override
    public final void j(l1 l1Var) {
        this.F = l1Var.f45610a.f(8).d;
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
        this.f44720r = l1Var;
        i0.b bVar3 = i0.b.f11524e;
        if (l1Var != null) {
            i1 i1Var = l1Var.f45610a;
            bVar = i0.b.a(i1Var.f(647), i1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (l1Var != null) {
            bVar3 = l1Var.f45610a.f(8);
        }
        c cVar = this.f44718f;
        b bVar4 = cVar.f44707c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f44701a;
            }
        } else if (z11) {
            bVar2 = b.f44703c;
        } else {
            bVar2 = b.f44702b;
        }
        if (bVar4 != bVar2) {
            cVar.a(bVar2, false);
        }
        int i11 = this.f44721s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.f11527c;
        int i13 = a2.f11526b;
        int i14 = a2.f11525a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.f11527c;
        int i18 = a10.f11526b;
        int i19 = a10.f11525a;
        Runnable runnable = this.h;
        le.e eVar2 = this.f44714a;
        n nVar = this.d;
        n nVar2 = this.f44716c;
        m mVar = this.f44715b;
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
            mVar.f15465c = f10;
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
