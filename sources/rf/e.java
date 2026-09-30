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
    public pf.f f42621f;
    public View f42622g;
    public cf.c h;
    public View f42623i;
    public final pf.e f42624j;
    public float f42625k;
    public boolean f42628n;
    public float f42629o;
    public int f42618a = 0;
    public final Rect f42619b = new Rect();
    public final Rect f42620c = new Rect();
    public final RectF f42626l = new RectF();
    public final Path f42627m = new Path();

    public e(pf.e eVar) {
        this.f42624j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f42624j;
        if (eVar != null && (f0Var = eVar.f41167l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42628n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f42624j;
        if (eVar != null && (f0Var = eVar.f41167l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42628n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42619b;
        pf.e eVar = this.f42624j;
        if (this.f42618a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42618a);
            return;
        }
        rect.set(eVar.h.f43300a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f41159a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f41159a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f41163g.e();
        final a aVar = eVar.f41163g;
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
        final a aVar2 = eVar.f41163g;
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
        this.f42623i = eVar.f41163g.h();
        this.f42622g = new View((LaunchActivity) eVar.f41159a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f41159a.d, this);
        this.f42621f = fVar;
        fVar.addView(this.f42622g);
        this.f42621f.addView(this.f42623i);
        View view = this.f42622g;
        View view2 = eVar.f41166k;
        ?? obj = new Object();
        obj.f4259a = view;
        obj.f4260b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f41159a.q().addView(this.f42621f);
        this.f42618a = 1;
        this.f42621f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42623i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42618a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42618a);
            return;
        }
        this.h.y(this.f42624j.f41163g.c());
        this.f42618a = 3;
        this.f42621f.removeView(this.f42623i);
        this.f42621f.invalidate();
        this.f42623i = null;
        AndroidUtilities.doOnPreDraw(this.f42621f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
