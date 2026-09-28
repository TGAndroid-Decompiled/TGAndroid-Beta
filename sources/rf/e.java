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
    public pf.f f42517f;
    public View f42518g;
    public cf.c h;
    public View f42519i;
    public final pf.e f42520j;
    public float f42521k;
    public boolean f42524n;
    public float f42525o;
    public int f42514a = 0;
    public final Rect f42515b = new Rect();
    public final Rect f42516c = new Rect();
    public final RectF f42522l = new RectF();
    public final Path f42523m = new Path();

    public e(pf.e eVar) {
        this.f42520j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f42520j;
        if (eVar != null && (f0Var = eVar.f41069l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42524n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f42520j;
        if (eVar != null && (f0Var = eVar.f41069l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42524n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42515b;
        pf.e eVar = this.f42520j;
        if (this.f42514a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42514a);
            return;
        }
        rect.set(eVar.h.f43193a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f41061a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f41061a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f41065g.e();
        final a aVar = eVar.f41065g;
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
        final a aVar2 = eVar.f41065g;
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
        this.f42519i = eVar.f41065g.h();
        this.f42518g = new View((LaunchActivity) eVar.f41061a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f41061a.d, this);
        this.f42517f = fVar;
        fVar.addView(this.f42518g);
        this.f42517f.addView(this.f42519i);
        View view = this.f42518g;
        View view2 = eVar.f41068k;
        ?? obj = new Object();
        obj.f4252a = view;
        obj.f4253b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f41061a.q().addView(this.f42517f);
        this.f42514a = 1;
        this.f42517f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42519i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42514a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42514a);
            return;
        }
        this.h.y(this.f42520j.f41065g.c());
        this.f42514a = 3;
        this.f42517f.removeView(this.f42519i);
        this.f42517f.invalidate();
        this.f42519i = null;
        AndroidUtilities.doOnPreDraw(this.f42517f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
