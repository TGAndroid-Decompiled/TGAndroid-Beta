package wf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import b8.cg;
import b8.ke;
import j$.util.Objects;
import k2.i0;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.messenger.u10;
import org.telegram.ui.LaunchActivity;
public final class e implements vf.b {
    public f d;
    public f f57573e;
    public org.telegram.ui.e f57574f;
    public View f57575g;
    public ke h;
    public View f57576i;
    public final uf.d f57577j;
    public float f57578k;
    public boolean f57581n;
    public float f57582o;
    public int f57570a = 0;
    public final Rect f57571b = new Rect();
    public final Rect f57572c = new Rect();
    public final RectF f57579l = new RectF();
    public final Path f57580m = new Path();

    public e(uf.d dVar) {
        this.f57577j = dVar;
    }

    @Override
    public final void a() {
        i0 i0Var;
        uf.d dVar = this.f57577j;
        if (dVar != null && (i0Var = dVar.f55858l) != null) {
            i0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f57581n = false;
        h();
    }

    @Override
    public final void c() {
        i0 i0Var;
        uf.d dVar = this.f57577j;
        if (dVar != null && (i0Var = dVar.f55858l) != null) {
            i0Var.j();
        }
    }

    @Override
    public final void e() {
        this.f57581n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f57571b;
        uf.d dVar = this.f57577j;
        if (this.f57570a != 0) {
            a8.d("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f57570a);
            return;
        }
        rect.set((Rect) dVar.h.f18942a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f55849a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f55849a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap l10 = dVar.f55854g.l();
        final a aVar = dVar.f55854g;
        Objects.requireNonNull(aVar);
        this.d = new f(measuredWidth, measuredHeight, new u10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        aVar.i((Canvas) obj);
                        return;
                    default:
                        aVar.m((Canvas) obj);
                        return;
                }
            }
        });
        final a aVar2 = dVar.f55854g;
        Objects.requireNonNull(aVar2);
        this.f57573e = new f(measuredWidth, measuredHeight, new u10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        aVar2.i((Canvas) obj);
                        return;
                    default:
                        aVar2.m((Canvas) obj);
                        return;
                }
            }
        });
        this.f57576i = dVar.f55854g.q();
        this.f57575g = new View((LaunchActivity) dVar.f55849a.d);
        org.telegram.ui.e eVar = new org.telegram.ui.e((LaunchActivity) dVar.f55849a.d, this);
        this.f57574f = eVar;
        eVar.addView(this.f57575g);
        this.f57574f.addView(this.f57576i);
        ke keVar = new ke(this.f57575g, dVar.f55857k);
        this.h = keVar;
        keVar.K(l10);
        dVar.f55849a.h().addView(this.f57574f);
        this.f57570a = 1;
        this.f57574f.invalidate();
        g0.K(this.f57576i, new cg(t0.d, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f57570a != 2) {
            a8.d("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f57570a);
            return;
        }
        this.h.K(this.f57577j.f55854g.g());
        this.f57570a = 3;
        this.f57574f.removeView(this.f57576i);
        this.f57574f.invalidate();
        this.f57576i = null;
        g0.K(this.f57574f, new cg(t0.d, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
