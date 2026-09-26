package rf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.p;
import i2.f0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class e implements qf.c, qf.b {
    public f d;
    public f e;
    public pf.f f42515f;
    public View f42516g;
    public cf.c h;
    public View f42517i;
    public final pf.e f42518j;
    public float f42519k;
    public boolean f42522n;
    public float f42523o;
    public int f42512a = 0;
    public final Rect f42513b = new Rect();
    public final Rect f42514c = new Rect();
    public final RectF f42520l = new RectF();
    public final Path f42521m = new Path();

    public e(pf.e eVar) {
        this.f42518j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f42518j;
        if (eVar != null && (f0Var = eVar.f41067l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42522n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f42518j;
        if (eVar != null && (f0Var = eVar.f41067l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42522n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42513b;
        pf.e eVar = this.f42518j;
        if (this.f42512a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42512a);
            return;
        }
        rect.set(eVar.h.f43191a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f41059a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f41059a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f41063g.e();
        final a aVar = eVar.f41063g;
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
        final a aVar2 = eVar.f41063g;
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
        this.f42517i = eVar.f41063g.h();
        this.f42516g = new View((LaunchActivity) eVar.f41059a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f41059a.d, this);
        this.f42515f = fVar;
        fVar.addView(this.f42516g);
        this.f42515f.addView(this.f42517i);
        View view = this.f42516g;
        View view2 = eVar.f41066k;
        ?? obj = new Object();
        obj.f4252a = view;
        obj.f4253b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f41059a.q().addView(this.f42515f);
        this.f42512a = 1;
        this.f42515f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42517i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42512a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42512a);
            return;
        }
        this.h.y(this.f42518j.f41063g.c());
        this.f42512a = 3;
        this.f42515f.removeView(this.f42517i);
        this.f42515f.invalidate();
        this.f42517i = null;
        AndroidUtilities.doOnPreDraw(this.f42515f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
