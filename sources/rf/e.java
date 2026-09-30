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
    public pf.f f42518f;
    public View f42519g;
    public cf.c h;
    public View f42520i;
    public final pf.e f42521j;
    public float f42522k;
    public boolean f42525n;
    public float f42526o;
    public int f42515a = 0;
    public final Rect f42516b = new Rect();
    public final Rect f42517c = new Rect();
    public final RectF f42523l = new RectF();
    public final Path f42524m = new Path();

    public e(pf.e eVar) {
        this.f42521j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f42521j;
        if (eVar != null && (f0Var = eVar.f41070l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42525n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f42521j;
        if (eVar != null && (f0Var = eVar.f41070l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42525n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42516b;
        pf.e eVar = this.f42521j;
        if (this.f42515a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42515a);
            return;
        }
        rect.set(eVar.h.f43194a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f41062a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f41062a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f41066g.e();
        final a aVar = eVar.f41066g;
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
        final a aVar2 = eVar.f41066g;
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
        this.f42520i = eVar.f41066g.h();
        this.f42519g = new View((LaunchActivity) eVar.f41062a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f41062a.d, this);
        this.f42518f = fVar;
        fVar.addView(this.f42519g);
        this.f42518f.addView(this.f42520i);
        View view = this.f42519g;
        View view2 = eVar.f41069k;
        ?? obj = new Object();
        obj.f4252a = view;
        obj.f4253b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f41062a.q().addView(this.f42518f);
        this.f42515a = 1;
        this.f42518f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42520i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42515a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42515a);
            return;
        }
        this.h.y(this.f42521j.f41066g.c());
        this.f42515a = 3;
        this.f42518f.removeView(this.f42520i);
        this.f42518f.invalidate();
        this.f42520i = null;
        AndroidUtilities.doOnPreDraw(this.f42518f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
