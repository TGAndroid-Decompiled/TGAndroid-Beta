package uf;

import a8.fg;
import a8.me;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import i2.j0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class e implements tf.c, tf.b {
    public f d;
    public f e;
    public sf.e f49722f;
    public View f49723g;
    public me h;
    public View f49724i;
    public final sf.d f49725j;
    public float f49726k;
    public boolean f49729n;
    public float f49730o;
    public int f49719a = 0;
    public final Rect f49720b = new Rect();
    public final Rect f49721c = new Rect();
    public final RectF f49727l = new RectF();
    public final Path f49728m = new Path();

    public e(sf.d dVar) {
        this.f49725j = dVar;
    }

    @Override
    public final void a() {
        j0 j0Var;
        sf.d dVar = this.f49725j;
        if (dVar != null && (j0Var = dVar.f48133l) != null) {
            j0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f49729n = false;
        h();
    }

    @Override
    public final void c() {
        j0 j0Var;
        sf.d dVar = this.f49725j;
        if (dVar != null && (j0Var = dVar.f48133l) != null) {
            j0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f49729n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f49720b;
        sf.d dVar = this.f49725j;
        if (this.f49719a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f49719a);
            return;
        }
        rect.set((Rect) dVar.h.f16247a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f48125a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f48125a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f48129g.e();
        final a aVar = dVar.f48129g;
        Objects.requireNonNull(aVar);
        this.d = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        aVar.d((Canvas) obj);
                        return;
                    default:
                        aVar.f((Canvas) obj);
                        return;
                }
            }
        });
        final a aVar2 = dVar.f48129g;
        Objects.requireNonNull(aVar2);
        this.e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        aVar2.d((Canvas) obj);
                        return;
                    default:
                        aVar2.f((Canvas) obj);
                        return;
                }
            }
        });
        this.f49724i = dVar.f48129g.h();
        this.f49723g = new View((LaunchActivity) dVar.f48125a.d);
        sf.e eVar = new sf.e((LaunchActivity) dVar.f48125a.d, this);
        this.f49722f = eVar;
        eVar.addView(this.f49723g);
        this.f49722f.addView(this.f49724i);
        View view = this.f49723g;
        View view2 = dVar.f48132k;
        ?? obj = new Object();
        obj.f614a = view;
        obj.f615b = view2;
        this.h = obj;
        obj.y(e);
        dVar.f48125a.o().addView(this.f49722f);
        this.f49719a = 1;
        this.f49722f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f49724i, new fg(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f49719a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f49719a);
            return;
        }
        this.h.y(this.f49725j.f48129g.c());
        this.f49719a = 3;
        this.f49722f.removeView(this.f49724i);
        this.f49722f.invalidate();
        this.f49724i = null;
        AndroidUtilities.doOnPreDraw(this.f49722f, new fg(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
