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
    public f f46022e;
    public pf.f f46023f;
    public View f46024g;
    public cf.c h;
    public View f46025i;
    public final pf.e f46026j;
    public float f46027k;
    public boolean f46030n;
    public float f46031o;
    public int f46019a = 0;
    public final Rect f46020b = new Rect();
    public final Rect f46021c = new Rect();
    public final RectF f46028l = new RectF();
    public final Path f46029m = new Path();

    public e(pf.e eVar) {
        this.f46026j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f46026j;
        if (eVar != null && (f0Var = eVar.f44419l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f46030n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f46026j;
        if (eVar != null && (f0Var = eVar.f44419l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f46030n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f46020b;
        pf.e eVar = this.f46026j;
        if (this.f46019a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f46019a);
            return;
        }
        rect.set(eVar.h.f46779a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f44410a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f44410a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f44415g.e();
        final a aVar = eVar.f44415g;
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
        final a aVar2 = eVar.f44415g;
        Objects.requireNonNull(aVar2);
        this.f46022e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f46025i = eVar.f44415g.h();
        this.f46024g = new View((LaunchActivity) eVar.f44410a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f44410a.d, this);
        this.f46023f = fVar;
        fVar.addView(this.f46024g);
        this.f46023f.addView(this.f46025i);
        View view = this.f46024g;
        View view2 = eVar.f44418k;
        ?? obj = new Object();
        obj.f4602a = view;
        obj.f4603b = view2;
        this.h = obj;
        obj.w(e7);
        eVar.f44410a.q().addView(this.f46023f);
        this.f46019a = 1;
        this.f46023f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f46025i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f46019a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f46019a);
            return;
        }
        this.h.w(this.f46026j.f44415g.c());
        this.f46019a = 3;
        this.f46023f.removeView(this.f46025i);
        this.f46023f.invalidate();
        this.f46025i = null;
        AndroidUtilities.doOnPreDraw(this.f46023f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
