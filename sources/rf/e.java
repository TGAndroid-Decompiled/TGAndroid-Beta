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
    public pf.f f42516f;
    public View f42517g;
    public cf.c h;
    public View f42518i;
    public final pf.e f42519j;
    public float f42520k;
    public boolean f42523n;
    public float f42524o;
    public int f42513a = 0;
    public final Rect f42514b = new Rect();
    public final Rect f42515c = new Rect();
    public final RectF f42521l = new RectF();
    public final Path f42522m = new Path();

    public e(pf.e eVar) {
        this.f42519j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f42519j;
        if (eVar != null && (f0Var = eVar.f41068l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42523n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f42519j;
        if (eVar != null && (f0Var = eVar.f41068l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42523n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42514b;
        pf.e eVar = this.f42519j;
        if (this.f42513a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42513a);
            return;
        }
        rect.set(eVar.h.f43192a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f41060a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f41060a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f41064g.e();
        final a aVar = eVar.f41064g;
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
        final a aVar2 = eVar.f41064g;
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
        this.f42518i = eVar.f41064g.h();
        this.f42517g = new View((LaunchActivity) eVar.f41060a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f41060a.d, this);
        this.f42516f = fVar;
        fVar.addView(this.f42517g);
        this.f42516f.addView(this.f42518i);
        View view = this.f42517g;
        View view2 = eVar.f41067k;
        ?? obj = new Object();
        obj.f4252a = view;
        obj.f4253b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f41060a.q().addView(this.f42516f);
        this.f42513a = 1;
        this.f42516f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42518i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42513a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42513a);
            return;
        }
        this.h.y(this.f42519j.f41064g.c());
        this.f42513a = 3;
        this.f42516f.removeView(this.f42518i);
        this.f42516f.invalidate();
        this.f42518i = null;
        AndroidUtilities.doOnPreDraw(this.f42516f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
