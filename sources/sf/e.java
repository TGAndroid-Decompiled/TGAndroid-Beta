package sf;

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
public final class e implements rf.c, rf.b {
    public f d;
    public f f45999e;
    public qf.f f46000f;
    public View f46001g;
    public cf.c h;
    public View f46002i;
    public final qf.e f46003j;
    public float f46004k;
    public boolean f46007n;
    public float f46008o;
    public int f45996a = 0;
    public final Rect f45997b = new Rect();
    public final Rect f45998c = new Rect();
    public final RectF f46005l = new RectF();
    public final Path f46006m = new Path();

    public e(qf.e eVar) {
        this.f46003j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f46003j;
        if (eVar != null && (f0Var = eVar.f44362l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f46007n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f46003j;
        if (eVar != null && (f0Var = eVar.f44362l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f46007n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f45997b;
        qf.e eVar = this.f46003j;
        if (this.f45996a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f45996a);
            return;
        }
        rect.set(eVar.h.f46485a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f44353a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f44353a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f44358g.e();
        final a aVar = eVar.f44358g;
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
        final a aVar2 = eVar.f44358g;
        Objects.requireNonNull(aVar2);
        this.f45999e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f46002i = eVar.f44358g.h();
        this.f46001g = new View((LaunchActivity) eVar.f44353a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f44353a.d, this);
        this.f46000f = fVar;
        fVar.addView(this.f46001g);
        this.f46000f.addView(this.f46002i);
        View view = this.f46001g;
        View view2 = eVar.f44361k;
        ?? obj = new Object();
        obj.f4796a = view;
        obj.f4797b = view2;
        this.h = obj;
        obj.u(e7);
        eVar.f44353a.q().addView(this.f46000f);
        this.f45996a = 1;
        this.f46000f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f46002i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f45996a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f45996a);
            return;
        }
        this.h.u(this.f46003j.f44358g.c());
        this.f45996a = 3;
        this.f46000f.removeView(this.f46002i);
        this.f46000f.invalidate();
        this.f46002i = null;
        AndroidUtilities.doOnPreDraw(this.f46000f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
