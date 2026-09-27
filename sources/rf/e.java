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
    public pf.f f42561f;
    public View f42562g;
    public cf.c h;
    public View f42563i;
    public final pf.e f42564j;
    public float f42565k;
    public boolean f42568n;
    public float f42569o;
    public int f42558a = 0;
    public final Rect f42559b = new Rect();
    public final Rect f42560c = new Rect();
    public final RectF f42566l = new RectF();
    public final Path f42567m = new Path();

    public e(pf.e eVar) {
        this.f42564j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f42564j;
        if (eVar != null && (f0Var = eVar.f41066l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42568n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f42564j;
        if (eVar != null && (f0Var = eVar.f41066l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42568n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42559b;
        pf.e eVar = this.f42564j;
        if (this.f42558a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42558a);
            return;
        }
        rect.set(eVar.h.f43237a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f41058a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f41058a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f41062g.e();
        final a aVar = eVar.f41062g;
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
        final a aVar2 = eVar.f41062g;
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
        this.f42563i = eVar.f41062g.h();
        this.f42562g = new View((LaunchActivity) eVar.f41058a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f41058a.d, this);
        this.f42561f = fVar;
        fVar.addView(this.f42562g);
        this.f42561f.addView(this.f42563i);
        View view = this.f42562g;
        View view2 = eVar.f41065k;
        ?? obj = new Object();
        obj.f4254a = view;
        obj.f4255b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f41058a.q().addView(this.f42561f);
        this.f42558a = 1;
        this.f42561f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42563i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42558a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42558a);
            return;
        }
        this.h.y(this.f42564j.f41062g.c());
        this.f42558a = 3;
        this.f42561f.removeView(this.f42563i);
        this.f42561f.invalidate();
        this.f42563i = null;
        AndroidUtilities.doOnPreDraw(this.f42561f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
