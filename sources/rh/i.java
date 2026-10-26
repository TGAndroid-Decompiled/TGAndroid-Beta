package rh;

import android.view.View;
import ig.o;
import oe.m;
import oe.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.q1;
import r0.h1;
import r0.k1;
public class i implements g, f, d {
    public View E;
    public int F;
    public int G;
    public final oe.e f47619a;
    public final Runnable h;
    public boolean f47623n;
    public k1 f47624r;
    public int v;
    public int f47626w;
    public e f47628y;
    public final m f47620b = new m(0.0f);
    public final n f47621c = new n();
    public final n d = new n();
    public final AnimationNotificationsLocker e = new AnimationNotificationsLocker();
    public final c f47622f = new c(new o(this, 17));
    public int f47625s = 1;
    public final h f47627x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f47619a = new oe.e(0, new m4.c(this, runnable, false, 17), q1.f22963w, 250L);
    }

    @Override
    public final void M() {
        View view = this.E;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override
    public final View O() {
        return this.E;
    }

    public final void a() {
        boolean z10 = this.f47619a.h;
        boolean z11 = this.f47623n;
        AnimationNotificationsLocker animationNotificationsLocker = this.e;
        if (!z11 && z10) {
            this.f47623n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f47623n && !z10) {
            this.f47623n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float c() {
        e eVar = this.f47628y;
        n nVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f19351a);
        }
        return nVar.d.f19351a;
    }

    public final float d() {
        e eVar = this.f47628y;
        n nVar = this.f47621c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f19351a);
        }
        return nVar.d.f19351a;
    }

    public final int e() {
        if (this.f47628y != null && this.G > 0) {
            return Math.max(this.F, Math.max(f(527).d, this.v));
        }
        return Math.max(f(527).d, this.v);
    }

    public final i0.b f(int i10) {
        k1 k1Var = this.f47624r;
        if (k1Var != null) {
            return k1Var.f47118a.f(i10);
        }
        return i0.b.e;
    }

    public final void g(int i10) {
        if (this.v == i10 && this.f47625s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f47627x);
        this.f47626w = Math.max(this.v, i10);
        this.v = i10;
        this.f47625s = 0;
        j(this.f47624r);
    }

    public final void h(int i10) {
        if (i10 > 0) {
            g(i10 + AndroidUtilities.navigationBarHeight);
        } else {
            i(true);
        }
    }

    public final void i(boolean z10) {
        int i10;
        if (this.v != 0) {
            h hVar = this.f47627x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f47625s = i10;
            j(this.f47624r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void j(k1 k1Var) {
        boolean z10;
        if (this.f47624r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l(k1Var, z10);
    }

    @Override
    public final void k(k1 k1Var) {
        int i10;
        k1 b10 = b(k1Var);
        if (b10 != null) {
            i10 = b10.f47118a.f(8).d;
        } else {
            i10 = 0;
        }
        this.F = i10;
        this.h.run();
    }

    public final void l(k1 k1Var, boolean z10) {
        i0.b bVar;
        boolean z11;
        b bVar2;
        float f7;
        int i10;
        oe.e eVar;
        float f10;
        k1 b10 = b(k1Var);
        this.f47624r = b10;
        i0.b bVar3 = i0.b.e;
        if (b10 != null) {
            h1 h1Var = b10.f47118a;
            bVar = i0.b.a(h1Var.f(647), h1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (b10 != null) {
            bVar3 = b10.f47118a.f(8);
        }
        c cVar = this.f47622f;
        b bVar4 = cVar.f47613c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f47608a;
            }
        } else if (z11) {
            bVar2 = b.f47610c;
        } else {
            bVar2 = b.f47609b;
        }
        if (bVar4 != bVar2) {
            cVar.a(bVar2, false);
        }
        int i11 = this.f47625s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.f13452c;
        int i13 = a2.f13451b;
        int i14 = a2.f13450a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.f13452c;
        int i18 = a10.f13451b;
        int i19 = a10.f13450a;
        Runnable runnable = this.h;
        oe.e eVar2 = this.f47619a;
        n nVar = this.d;
        n nVar2 = this.f47621c;
        m mVar = this.f47620b;
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
            mVar.f19353c = f10;
            nVar2.e(i19, i18, i10, i16);
            nVar.e(i14, i13, i12, i15);
            oe.e eVar3 = eVar;
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
    public final void t() {
        this.G++;
    }

    public k1 b(k1 k1Var) {
        return k1Var;
    }
}
