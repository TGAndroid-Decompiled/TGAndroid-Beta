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
    public final le.e f44721a;
    public final Runnable h;
    public boolean f44726n;
    public l1 f44727r;
    public int v;
    public int f44729w;
    public e f44731y;
    public final m f44722b = new m(0.0f);
    public final n f44723c = new n();
    public final n d = new n();
    public final AnimationNotificationsLocker f44724e = new AnimationNotificationsLocker();
    public final c f44725f = new c(new q1(this, 7));
    public int f44728s = 1;
    public final h f44730x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f44721a = new le.e(0, new o0.a(this, runnable, false, 11), p1.f21448w, 250L);
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
        boolean z10 = this.f44721a.f15446g;
        boolean z11 = this.f44726n;
        AnimationNotificationsLocker animationNotificationsLocker = this.f44724e;
        if (!z11 && z10) {
            this.f44726n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f44726n && !z10) {
            this.f44726n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float b() {
        e eVar = this.f44731y;
        n nVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f15464a);
        }
        return nVar.d.f15464a;
    }

    public final float c() {
        e eVar = this.f44731y;
        n nVar = this.f44723c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f15464a);
        }
        return nVar.d.f15464a;
    }

    public final int d() {
        if (this.f44731y != null && this.G > 0) {
            return Math.max(this.F, Math.max(e(527).d, this.v));
        }
        return Math.max(e(527).d, this.v);
    }

    public final i0.b e(int i10) {
        l1 l1Var = this.f44727r;
        if (l1Var != null) {
            return l1Var.f45617a.f(i10);
        }
        return i0.b.f11525e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.f44728s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f44730x);
        this.f44729w = Math.max(this.v, i10);
        this.v = i10;
        this.f44728s = 0;
        i(this.f44727r);
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
            h hVar = this.f44730x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f44728s = i10;
            i(this.f44727r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void i(l1 l1Var) {
        boolean z10;
        if (this.f44727r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(l1Var, z10);
    }

    @Override
    public final void j(l1 l1Var) {
        this.F = l1Var.f45617a.f(8).d;
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
        this.f44727r = l1Var;
        i0.b bVar3 = i0.b.f11525e;
        if (l1Var != null) {
            i1 i1Var = l1Var.f45617a;
            bVar = i0.b.a(i1Var.f(647), i1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (l1Var != null) {
            bVar3 = l1Var.f45617a.f(8);
        }
        c cVar = this.f44725f;
        b bVar4 = cVar.f44714c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f44708a;
            }
        } else if (z11) {
            bVar2 = b.f44710c;
        } else {
            bVar2 = b.f44709b;
        }
        if (bVar4 != bVar2) {
            cVar.a(bVar2, false);
        }
        int i11 = this.f44728s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.f11528c;
        int i13 = a2.f11527b;
        int i14 = a2.f11526a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.f11528c;
        int i18 = a10.f11527b;
        int i19 = a10.f11526a;
        Runnable runnable = this.h;
        le.e eVar2 = this.f44721a;
        n nVar = this.d;
        n nVar2 = this.f44723c;
        m mVar = this.f44722b;
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
            mVar.f15466c = f10;
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
