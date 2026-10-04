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
    public final le.e f44713a;
    public final Runnable h;
    public boolean f44718n;
    public l1 f44719r;
    public int v;
    public int f44721w;
    public e f44723y;
    public final m f44714b = new m(0.0f);
    public final n f44715c = new n();
    public final n d = new n();
    public final AnimationNotificationsLocker f44716e = new AnimationNotificationsLocker();
    public final c f44717f = new c(new q1(this, 7));
    public int f44720s = 1;
    public final h f44722x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f44713a = new le.e(0, new o0.a(this, runnable, false, 11), p1.f21443w, 250L);
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
        boolean z10 = this.f44713a.f15444g;
        boolean z11 = this.f44718n;
        AnimationNotificationsLocker animationNotificationsLocker = this.f44716e;
        if (!z11 && z10) {
            this.f44718n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f44718n && !z10) {
            this.f44718n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float b() {
        e eVar = this.f44723y;
        n nVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f15462a);
        }
        return nVar.d.f15462a;
    }

    public final float c() {
        e eVar = this.f44723y;
        n nVar = this.f44715c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f15462a);
        }
        return nVar.d.f15462a;
    }

    public final int d() {
        if (this.f44723y != null && this.G > 0) {
            return Math.max(this.F, Math.max(e(527).d, this.v));
        }
        return Math.max(e(527).d, this.v);
    }

    public final i0.b e(int i10) {
        l1 l1Var = this.f44719r;
        if (l1Var != null) {
            return l1Var.f45609a.f(i10);
        }
        return i0.b.f11524e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.f44720s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f44722x);
        this.f44721w = Math.max(this.v, i10);
        this.v = i10;
        this.f44720s = 0;
        i(this.f44719r);
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
            h hVar = this.f44722x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f44720s = i10;
            i(this.f44719r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void i(l1 l1Var) {
        boolean z10;
        if (this.f44719r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(l1Var, z10);
    }

    @Override
    public final void j(l1 l1Var) {
        this.F = l1Var.f45609a.f(8).d;
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
        this.f44719r = l1Var;
        i0.b bVar3 = i0.b.f11524e;
        if (l1Var != null) {
            i1 i1Var = l1Var.f45609a;
            bVar = i0.b.a(i1Var.f(647), i1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (l1Var != null) {
            bVar3 = l1Var.f45609a.f(8);
        }
        c cVar = this.f44717f;
        b bVar4 = cVar.f44706c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f44700a;
            }
        } else if (z11) {
            bVar2 = b.f44702c;
        } else {
            bVar2 = b.f44701b;
        }
        if (bVar4 != bVar2) {
            cVar.a(bVar2, false);
        }
        int i11 = this.f44720s;
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
        le.e eVar2 = this.f44713a;
        n nVar = this.d;
        n nVar2 = this.f44715c;
        m mVar = this.f44714b;
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
            mVar.f15464c = f10;
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
