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
    public sf.e f49760f;
    public View f49761g;
    public me h;
    public View f49762i;
    public final sf.d f49763j;
    public float f49764k;
    public boolean f49767n;
    public float f49768o;
    public int f49757a = 0;
    public final Rect f49758b = new Rect();
    public final Rect f49759c = new Rect();
    public final RectF f49765l = new RectF();
    public final Path f49766m = new Path();

    public e(sf.d dVar) {
        this.f49763j = dVar;
    }

    @Override
    public final void a() {
        j0 j0Var;
        sf.d dVar = this.f49763j;
        if (dVar != null && (j0Var = dVar.f48174l) != null) {
            j0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f49767n = false;
        h();
    }

    @Override
    public final void c() {
        j0 j0Var;
        sf.d dVar = this.f49763j;
        if (dVar != null && (j0Var = dVar.f48174l) != null) {
            j0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f49767n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f49758b;
        sf.d dVar = this.f49763j;
        if (this.f49757a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f49757a);
            return;
        }
        rect.set((Rect) dVar.h.f16246a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f48166a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f48166a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f48170g.e();
        final a aVar = dVar.f48170g;
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
        final a aVar2 = dVar.f48170g;
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
        this.f49762i = dVar.f48170g.h();
        this.f49761g = new View((LaunchActivity) dVar.f48166a.d);
        sf.e eVar = new sf.e((LaunchActivity) dVar.f48166a.d, this);
        this.f49760f = eVar;
        eVar.addView(this.f49761g);
        this.f49760f.addView(this.f49762i);
        View view = this.f49761g;
        View view2 = dVar.f48173k;
        ?? obj = new Object();
        obj.f614a = view;
        obj.f615b = view2;
        this.h = obj;
        obj.y(e);
        dVar.f48166a.o().addView(this.f49760f);
        this.f49757a = 1;
        this.f49760f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f49762i, new fg(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f49757a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f49757a);
            return;
        }
        this.h.y(this.f49763j.f48170g.c());
        this.f49757a = 3;
        this.f49760f.removeView(this.f49762i);
        this.f49760f.invalidate();
        this.f49762i = null;
        AndroidUtilities.doOnPreDraw(this.f49760f, new fg(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
