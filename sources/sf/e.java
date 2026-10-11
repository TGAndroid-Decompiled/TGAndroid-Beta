package sf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import ci.u5;
import com.google.android.gms.internal.cast.p;
import i2.f0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class e implements rf.c, rf.b {
    public f d;
    public f f48073e;
    public qf.f f48074f;
    public View f48075g;
    public u5 h;
    public View f48076i;
    public final qf.e f48077j;
    public float f48078k;
    public boolean f48081n;
    public float f48082o;
    public int f48070a = 0;
    public final Rect f48071b = new Rect();
    public final Rect f48072c = new Rect();
    public final RectF f48079l = new RectF();
    public final Path f48080m = new Path();

    public e(qf.e eVar) {
        this.f48077j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f48077j;
        if (eVar != null && (f0Var = eVar.f46249l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f48081n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f48077j;
        if (eVar != null && (f0Var = eVar.f46249l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f48081n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f48071b;
        qf.e eVar = this.f48077j;
        if (this.f48070a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f48070a);
            return;
        }
        rect.set(eVar.h.f48348a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f46240a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f46240a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f46245g.e();
        final a aVar = eVar.f46245g;
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
        final a aVar2 = eVar.f46245g;
        Objects.requireNonNull(aVar2);
        this.f48073e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f48076i = eVar.f46245g.h();
        this.f48075g = new View((LaunchActivity) eVar.f46240a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f46240a.d, this);
        this.f48074f = fVar;
        fVar.addView(this.f48075g);
        this.f48074f.addView(this.f48076i);
        View view = this.f48075g;
        View view2 = eVar.f46248k;
        ?? obj = new Object();
        obj.f6064a = view;
        obj.f6065b = view2;
        this.h = obj;
        obj.z(e7);
        eVar.f46240a.q().addView(this.f48074f);
        this.f48070a = 1;
        this.f48074f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f48076i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f48070a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f48070a);
            return;
        }
        this.h.z(this.f48077j.f46245g.c());
        this.f48070a = 3;
        this.f48074f.removeView(this.f48076i);
        this.f48074f.invalidate();
        this.f48076i = null;
        AndroidUtilities.doOnPreDraw(this.f48074f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
