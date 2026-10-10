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
    public f f48027e;
    public qf.f f48028f;
    public View f48029g;
    public u5 h;
    public View f48030i;
    public final qf.e f48031j;
    public float f48032k;
    public boolean f48035n;
    public float f48036o;
    public int f48024a = 0;
    public final Rect f48025b = new Rect();
    public final Rect f48026c = new Rect();
    public final RectF f48033l = new RectF();
    public final Path f48034m = new Path();

    public e(qf.e eVar) {
        this.f48031j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f48031j;
        if (eVar != null && (f0Var = eVar.f46215l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f48035n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f48031j;
        if (eVar != null && (f0Var = eVar.f46215l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f48035n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f48025b;
        qf.e eVar = this.f48031j;
        if (this.f48024a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f48024a);
            return;
        }
        rect.set(eVar.h.f48302a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f46206a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f46206a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f46211g.e();
        final a aVar = eVar.f46211g;
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
        final a aVar2 = eVar.f46211g;
        Objects.requireNonNull(aVar2);
        this.f48027e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f48030i = eVar.f46211g.h();
        this.f48029g = new View((LaunchActivity) eVar.f46206a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f46206a.d, this);
        this.f48028f = fVar;
        fVar.addView(this.f48029g);
        this.f48028f.addView(this.f48030i);
        View view = this.f48029g;
        View view2 = eVar.f46214k;
        ?? obj = new Object();
        obj.f6065a = view;
        obj.f6066b = view2;
        this.h = obj;
        obj.z(e7);
        eVar.f46206a.q().addView(this.f48028f);
        this.f48024a = 1;
        this.f48028f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f48030i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f48024a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f48024a);
            return;
        }
        this.h.z(this.f48031j.f46211g.c());
        this.f48024a = 3;
        this.f48028f.removeView(this.f48030i);
        this.f48028f.invalidate();
        this.f48030i = null;
        AndroidUtilities.doOnPreDraw(this.f48028f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
