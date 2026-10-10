package ph;

import android.view.View;
import ii.q1;
import me.m;
import me.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.p1;
import r0.h1;
import r0.k1;
public class i implements g, f, d {
    public View E;
    public int F;
    public int G;
    public final me.e f45916a;
    public final Runnable h;
    public boolean f45921n;
    public k1 f45922r;
    public int v;
    public int f45924w;
    public e f45926y;
    public final m f45917b = new m(0.0f);
    public final n f45918c = new n();
    public final n d = new n();
    public final AnimationNotificationsLocker f45919e = new AnimationNotificationsLocker();
    public final c f45920f = new c(new q1(this, 7));
    public int f45923s = 1;
    public final h f45925x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f45916a = new me.e(0, new b5(10, this, runnable), p1.f21459w, 250L);
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
        boolean z10 = this.f45916a.f16351g;
        boolean z11 = this.f45921n;
        AnimationNotificationsLocker animationNotificationsLocker = this.f45919e;
        if (!z11 && z10) {
            this.f45921n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f45921n && !z10) {
            this.f45921n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float c() {
        e eVar = this.f45926y;
        n nVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f16369a);
        }
        return nVar.d.f16369a;
    }

    public final float d() {
        e eVar = this.f45926y;
        n nVar = this.f45918c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f16369a);
        }
        return nVar.d.f16369a;
    }

    public final int e() {
        if (this.f45926y != null && this.G > 0) {
            return Math.max(this.F, Math.max(f(527).d, this.v));
        }
        return Math.max(f(527).d, this.v);
    }

    public final i0.b f(int i10) {
        k1 k1Var = this.f45922r;
        if (k1Var != null) {
            return k1Var.f46821a.f(i10);
        }
        return i0.b.f11575e;
    }

    public final void g(int i10) {
        if (this.v == i10 && this.f45923s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f45925x);
        this.f45924w = Math.max(this.v, i10);
        this.v = i10;
        this.f45923s = 0;
        k(this.f45922r);
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
            h hVar = this.f45925x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f45923s = i10;
            k(this.f45922r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    @Override
    public final void j(k1 k1Var) {
        int i10;
        k1 b10 = b(k1Var);
        if (b10 != null) {
            i10 = b10.f46821a.f(8).d;
        } else {
            i10 = 0;
        }
        this.F = i10;
        this.h.run();
    }

    public final void k(k1 k1Var) {
        boolean z10;
        if (this.f45922r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l(k1Var, z10);
    }

    public final void l(k1 k1Var, boolean z10) {
        i0.b bVar;
        boolean z11;
        b bVar2;
        float f7;
        int i10;
        me.e eVar;
        float f10;
        k1 b10 = b(k1Var);
        this.f45922r = b10;
        i0.b bVar3 = i0.b.f11575e;
        if (b10 != null) {
            h1 h1Var = b10.f46821a;
            bVar = i0.b.a(h1Var.f(647), h1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (b10 != null) {
            bVar3 = b10.f46821a.f(8);
        }
        c cVar = this.f45920f;
        b bVar4 = cVar.f45909c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f45903a;
            }
        } else if (z11) {
            bVar2 = b.f45905c;
        } else {
            bVar2 = b.f45904b;
        }
        if (bVar4 != bVar2) {
            cVar.a(bVar2, false);
        }
        int i11 = this.f45923s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.f11578c;
        int i13 = a2.f11577b;
        int i14 = a2.f11576a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.f11578c;
        int i18 = a10.f11577b;
        int i19 = a10.f11576a;
        Runnable runnable = this.h;
        me.e eVar2 = this.f45916a;
        n nVar = this.d;
        n nVar2 = this.f45918c;
        m mVar = this.f45917b;
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
            mVar.f16371c = f10;
            nVar2.e(i19, i18, i10, i16);
            nVar.e(i14, i13, i12, i15);
            me.e eVar3 = eVar;
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
