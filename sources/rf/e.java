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
    public pf.f f42183f;
    public View f42184g;
    public cf.c h;
    public View f42185i;
    public final pf.e f42186j;
    public float f42187k;
    public boolean f42190n;
    public float f42191o;
    public int f42180a = 0;
    public final Rect f42181b = new Rect();
    public final Rect f42182c = new Rect();
    public final RectF f42188l = new RectF();
    public final Path f42189m = new Path();

    public e(pf.e eVar) {
        this.f42186j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f42186j;
        if (eVar != null && (f0Var = eVar.f40752l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42190n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f42186j;
        if (eVar != null && (f0Var = eVar.f40752l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42190n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42181b;
        pf.e eVar = this.f42186j;
        if (this.f42180a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42180a);
            return;
        }
        rect.set(eVar.h.f42856a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f40744a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f40744a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f40748g.e();
        final a aVar = eVar.f40748g;
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
        final a aVar2 = eVar.f40748g;
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
        this.f42185i = eVar.f40748g.h();
        this.f42184g = new View((LaunchActivity) eVar.f40744a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f40744a.d, this);
        this.f42183f = fVar;
        fVar.addView(this.f42184g);
        this.f42183f.addView(this.f42185i);
        View view = this.f42184g;
        View view2 = eVar.f40751k;
        ?? obj = new Object();
        obj.f4252a = view;
        obj.f4253b = view2;
        this.h = obj;
        obj.x(e);
        eVar.f40744a.q().addView(this.f42183f);
        this.f42180a = 1;
        this.f42183f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42185i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42180a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42180a);
            return;
        }
        this.h.x(this.f42186j.f40748g.c());
        this.f42180a = 3;
        this.f42183f.removeView(this.f42185i);
        this.f42183f.invalidate();
        this.f42185i = null;
        AndroidUtilities.doOnPreDraw(this.f42183f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
