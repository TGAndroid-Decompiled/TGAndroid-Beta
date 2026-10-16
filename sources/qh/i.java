package qh;

import android.view.View;
import ji.p1;
import ne.m;
import ne.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.o1;
import r0.i1;
import r0.l1;
public class i implements g, f, d {
    public View E;
    public int F;
    public int G;
    public final ne.e f43380a;
    public final Runnable h;
    public boolean f43384n;
    public l1 f43385r;
    public int v;
    public int f43387w;
    public e f43389y;
    public final m f43381b = new m(0.0f);
    public final n f43382c = new n();
    public final n d = new n();
    public final AnimationNotificationsLocker e = new AnimationNotificationsLocker();
    public final c f43383f = new c(new p1(this, 7));
    public int f43386s = 1;
    public final h f43388x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f43380a = new ne.e(0, new n3.b(this, runnable, false, 14), o1.f20254w, 250L);
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
        boolean z10 = this.f43380a.f16012g;
        boolean z11 = this.f43384n;
        AnimationNotificationsLocker animationNotificationsLocker = this.e;
        if (!z11 && z10) {
            this.f43384n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f43384n && !z10) {
            this.f43384n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float c() {
        e eVar = this.f43389y;
        n nVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f16027a);
        }
        return nVar.d.f16027a;
    }

    public final float d() {
        e eVar = this.f43389y;
        n nVar = this.f43382c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, nVar.d.f16027a);
        }
        return nVar.d.f16027a;
    }

    public final int e() {
        if (this.f43389y != null && this.G > 0) {
            return Math.max(this.F, Math.max(f(527).d, this.v));
        }
        return Math.max(f(527).d, this.v);
    }

    public final i0.b f(int i10) {
        l1 l1Var = this.f43385r;
        if (l1Var != null) {
            return l1Var.f43497a.f(i10);
        }
        return i0.b.e;
    }

    public final void g(int i10) {
        if (this.v == i10 && this.f43386s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f43388x);
        this.f43387w = Math.max(this.v, i10);
        this.v = i10;
        this.f43386s = 0;
        j(this.f43385r);
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
            h hVar = this.f43388x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f43386s = i10;
            j(this.f43385r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void j(l1 l1Var) {
        boolean z10;
        if (this.f43385r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l(l1Var, z10);
    }

    @Override
    public final void k(l1 l1Var) {
        int i10;
        l1 b10 = b(l1Var);
        if (b10 != null) {
            i10 = b10.f43497a.f(8).d;
        } else {
            i10 = 0;
        }
        this.F = i10;
        this.h.run();
    }

    public final void l(l1 l1Var, boolean z10) {
        i0.b bVar;
        boolean z11;
        b bVar2;
        float f7;
        int i10;
        ne.e eVar;
        float f10;
        l1 b10 = b(l1Var);
        this.f43385r = b10;
        i0.b bVar3 = i0.b.e;
        if (b10 != null) {
            i1 i1Var = b10.f43497a;
            bVar = i0.b.a(i1Var.f(647), i1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (b10 != null) {
            bVar3 = b10.f43497a.f(8);
        }
        c cVar = this.f43383f;
        b bVar4 = cVar.f43374c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f43369a;
            }
        } else if (z11) {
            bVar2 = b.f43371c;
        } else {
            bVar2 = b.f43370b;
        }
        if (bVar4 != bVar2) {
            cVar.a(bVar2, false);
        }
        int i11 = this.f43386s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.f10894c;
        int i13 = a2.f10893b;
        int i14 = a2.f10892a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.f10894c;
        int i18 = a10.f10893b;
        int i19 = a10.f10892a;
        Runnable runnable = this.h;
        ne.e eVar2 = this.f43380a;
        n nVar = this.d;
        n nVar2 = this.f43382c;
        m mVar = this.f43381b;
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
            mVar.f16029c = f10;
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

    public l1 b(l1 l1Var) {
        return l1Var;
    }
}
