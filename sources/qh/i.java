package qh;

import android.view.View;
import ig.l0;
import ne.m;
import ne.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.o1;
import r0.h1;
import r0.k1;
public class i implements g, f, d {
    public View E;
    public int F;
    public int G;
    public final ne.e f44740a;
    public final Runnable h;
    public boolean f44744n;
    public k1 f44745r;
    public int v;
    public int f44747w;
    public e f44749y;
    public final m f44741b = new m(0.0f);
    public final n f44742c = new n();
    public final n d = new n();
    public final AnimationNotificationsLocker e = new AnimationNotificationsLocker();
    public final c f44743f = new c(new l0(this, 13));
    public int f44746s = 1;
    public final h f44748x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f44740a = new ne.e(0, new n2.e(this, runnable, false, 15), o1.f21636w, 250L);
    }

    @Override
    public final void L() {
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
        boolean z10 = this.f44740a.f17392g;
        boolean z11 = this.f44744n;
        AnimationNotificationsLocker animationNotificationsLocker = this.e;
        if (!z11 && z10) {
            this.f44744n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f44744n && !z10) {
            this.f44744n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float c() {
        e eVar = this.f44749y;
        n nVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f17407a);
        }
        return nVar.d.f17407a;
    }

    public final float d() {
        e eVar = this.f44749y;
        n nVar = this.f44742c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f17407a);
        }
        return nVar.d.f17407a;
    }

    public final int e() {
        if (this.f44749y != null && this.G > 0) {
            return Math.max(this.F, Math.max(f(527).d, this.v));
        }
        return Math.max(f(527).d, this.v);
    }

    public final i0.b f(int i10) {
        k1 k1Var = this.f44745r;
        if (k1Var != null) {
            return k1Var.f44839a.f(i10);
        }
        return i0.b.e;
    }

    public final void g(int i10) {
        if (this.v == i10 && this.f44746s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f44748x);
        this.f44747w = Math.max(this.v, i10);
        this.v = i10;
        this.f44746s = 0;
        j(this.f44745r);
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
            h hVar = this.f44748x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f44746s = i10;
            j(this.f44745r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void j(k1 k1Var) {
        boolean z10;
        if (this.f44745r != null) {
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
            i10 = b10.f44839a.f(8).d;
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
        ne.e eVar;
        float f10;
        k1 b10 = b(k1Var);
        this.f44745r = b10;
        i0.b bVar3 = i0.b.e;
        if (b10 != null) {
            h1 h1Var = b10.f44839a;
            bVar = i0.b.a(h1Var.f(647), h1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (b10 != null) {
            bVar3 = b10.f44839a.f(8);
        }
        c cVar = this.f44743f;
        b bVar4 = cVar.f44734c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f44729a;
            }
        } else if (z11) {
            bVar2 = b.f44731c;
        } else {
            bVar2 = b.f44730b;
        }
        if (bVar4 != bVar2) {
            cVar.a(bVar2, false);
        }
        int i11 = this.f44746s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.f12285c;
        int i13 = a2.f12284b;
        int i14 = a2.f12283a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.f12285c;
        int i18 = a10.f12284b;
        int i19 = a10.f12283a;
        Runnable runnable = this.h;
        ne.e eVar2 = this.f44740a;
        n nVar = this.d;
        n nVar2 = this.f44742c;
        m mVar = this.f44741b;
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
            mVar.f17409c = f10;
            nVar2.e(i19, i18, i10, i16);
            nVar.e(i14, i13, i12, i15);
            ne.e eVar3 = eVar;
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
    public final void u() {
        this.G++;
    }

    public k1 b(k1 k1Var) {
        return k1Var;
    }
}
