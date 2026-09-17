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
    public f f46000e;
    public qf.f f46001f;
    public View f46002g;
    public cf.c h;
    public View f46003i;
    public final qf.e f46004j;
    public float f46005k;
    public boolean f46008n;
    public float f46009o;
    public int f45997a = 0;
    public final Rect f45998b = new Rect();
    public final Rect f45999c = new Rect();
    public final RectF f46006l = new RectF();
    public final Path f46007m = new Path();

    public e(qf.e eVar) {
        this.f46004j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f46004j;
        if (eVar != null && (f0Var = eVar.f44363l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f46008n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f46004j;
        if (eVar != null && (f0Var = eVar.f44363l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f46008n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f45998b;
        qf.e eVar = this.f46004j;
        if (this.f45997a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f45997a);
            return;
        }
        rect.set(eVar.h.f46486a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f44354a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f44354a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f44359g.e();
        final a aVar = eVar.f44359g;
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
        final a aVar2 = eVar.f44359g;
        Objects.requireNonNull(aVar2);
        this.f46000e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f46003i = eVar.f44359g.h();
        this.f46002g = new View((LaunchActivity) eVar.f44354a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f44354a.d, this);
        this.f46001f = fVar;
        fVar.addView(this.f46002g);
        this.f46001f.addView(this.f46003i);
        View view = this.f46002g;
        View view2 = eVar.f44362k;
        ?? obj = new Object();
        obj.f4796a = view;
        obj.f4797b = view2;
        this.h = obj;
        obj.u(e7);
        eVar.f44354a.q().addView(this.f46001f);
        this.f45997a = 1;
        this.f46001f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f46003i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f45997a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f45997a);
            return;
        }
        this.h.u(this.f46004j.f44359g.c());
        this.f45997a = 3;
        this.f46001f.removeView(this.f46003i);
        this.f46001f.invalidate();
        this.f46003i = null;
        AndroidUtilities.doOnPreDraw(this.f46001f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
