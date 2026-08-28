package xg;

import android.view.View;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.q1;
import r0.m1;
import td.k;
import td.l;
public final class i implements g, f, d {
    public View A;
    public int B;
    public int C;
    public final td.c f49441a;
    public final Runnable h;
    public boolean f49446n;
    public m1 f49447r;
    public int v;
    public int f49449w;
    public e f49451y;
    public final k f49442b = new k(0.0f);
    public final l f49443c = new l();
    public final l d = new l();
    public final AnimationNotificationsLocker f49444e = new AnimationNotificationsLocker();
    public final c f49445f = new c(new i9(this, 21));
    public int f49448s = 1;
    public final h f49450x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f49441a = new td.c(0, new w4.e(this, runnable), q1.f23713w, 250L);
    }

    @Override
    public final void K() {
        View view = this.A;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override
    public final View M() {
        return this.A;
    }

    public final void a() {
        boolean z10 = this.f49441a.f47782g;
        boolean z11 = this.f49446n;
        AnimationNotificationsLocker animationNotificationsLocker = this.f49444e;
        if (!z11 && z10) {
            this.f49446n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f49446n && !z10) {
            this.f49446n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float b() {
        e eVar = this.f49451y;
        l lVar = this.d;
        if (eVar != null && this.C > 0) {
            return Math.max(this.B, lVar.d.f47800a);
        }
        return lVar.d.f47800a;
    }

    public final float c() {
        e eVar = this.f49451y;
        l lVar = this.f49443c;
        if (eVar != null && this.C > 0) {
            return Math.max(this.B, lVar.d.f47800a);
        }
        return lVar.d.f47800a;
    }

    public final int d() {
        if (this.f49451y != null && this.C > 0) {
            return Math.max(this.B, Math.max(e(527).d, this.v));
        }
        return Math.max(e(527).d, this.v);
    }

    public final i0.b e(int i9) {
        m1 m1Var = this.f49447r;
        if (m1Var != null) {
            return m1Var.f46929a.f(i9);
        }
        return i0.b.f10847e;
    }

    public final void f(int i9) {
        if (this.v == i9 && this.f49448s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f49450x);
        this.f49449w = Math.max(this.v, i9);
        this.v = i9;
        this.f49448s = 0;
        i(this.f49447r);
    }

    public final void g(int i9) {
        if (i9 > 0) {
            f(i9 + AndroidUtilities.navigationBarHeight);
        } else {
            h(true);
        }
    }

    public final void h(boolean z10) {
        int i9;
        if (this.v != 0) {
            h hVar = this.f49450x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i9 = 3;
            } else {
                i9 = 2;
            }
            this.f49448s = i9;
            i(this.f49447r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void i(m1 m1Var) {
        boolean z10;
        if (this.f49447r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        j(m1Var, z10);
    }

    public final void j(m1 m1Var, boolean z10) {
        i0.b bVar;
        boolean z11;
        b bVar2;
        float f10;
        int i9;
        td.c cVar;
        float f11;
        this.f49447r = m1Var;
        i0.b bVar3 = i0.b.f10847e;
        if (m1Var != null) {
            bVar = m1Var.f46929a.g(647);
        } else {
            bVar = bVar3;
        }
        if (m1Var != null) {
            bVar3 = m1Var.f46929a.f(8);
        }
        c cVar2 = this.f49445f;
        b bVar4 = cVar2.f49434c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f49428a;
            }
        } else if (z11) {
            bVar2 = b.f49430c;
        } else {
            bVar2 = b.f49429b;
        }
        if (bVar4 != bVar2) {
            cVar2.a(bVar2, false);
        }
        int i10 = this.f49448s;
        if (i10 == 2) {
            this.v = 0;
        }
        if (i10 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i11 = a2.f10850c;
        int i12 = a2.f10849b;
        int i13 = a2.f10848a;
        int i14 = a2.d;
        i0.b a3 = i0.b.a(bVar, a2);
        int i15 = a3.d;
        int i16 = a3.f10850c;
        int i17 = a3.f10849b;
        int i18 = a3.f10848a;
        Runnable runnable = this.h;
        td.c cVar3 = this.f49441a;
        l lVar = this.d;
        l lVar2 = this.f49443c;
        k kVar = this.f49442b;
        if (z10) {
            if (i14 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!kVar.b(f10)) {
                cVar = cVar3;
                i9 = i16;
                if (!lVar2.b(i18, i17, i16, i15) && !lVar.b(i13, i12, i11, i14)) {
                    if (bVar4 != bVar2) {
                        runnable.run();
                    }
                }
            } else {
                i9 = i16;
                cVar = cVar3;
            }
            cVar.b();
            kVar.c(false);
            lVar2.c(false);
            lVar.c(false);
            if (i14 > 0) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            kVar.f47802c = f11;
            lVar2.e(i18, i17, i9, i15);
            lVar.e(i13, i12, i11, i14);
            td.c cVar4 = cVar;
            cVar4.c(0.0f);
            cVar4.a(1.0f);
        } else {
            float f12 = 0.0f;
            cVar3.b();
            if (i14 > 0) {
                f12 = 1.0f;
            }
            kVar.d(f12);
            lVar2.d(i18, i17, i16, i15);
            lVar.d(i13, i12, i11, i14);
            runnable.run();
        }
        a();
    }

    @Override
    public final void k(m1 m1Var) {
        this.B = m1Var.f46929a.f(8).d;
        this.h.run();
    }

    @Override
    public final void t() {
        this.C++;
    }
}
