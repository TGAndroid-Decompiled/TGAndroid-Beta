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
    public f f48107e;
    public qf.f f48108f;
    public View f48109g;
    public u5 h;
    public View f48110i;
    public final qf.e f48111j;
    public float f48112k;
    public boolean f48115n;
    public float f48116o;
    public int f48104a = 0;
    public final Rect f48105b = new Rect();
    public final Rect f48106c = new Rect();
    public final RectF f48113l = new RectF();
    public final Path f48114m = new Path();

    public e(qf.e eVar) {
        this.f48111j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f48111j;
        if (eVar != null && (f0Var = eVar.f46283l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f48115n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f48111j;
        if (eVar != null && (f0Var = eVar.f46283l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f48115n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f48105b;
        qf.e eVar = this.f48111j;
        if (this.f48104a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f48104a);
            return;
        }
        rect.set(eVar.h.f48382a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f46274a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f46274a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f46279g.e();
        final a aVar = eVar.f46279g;
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
        final a aVar2 = eVar.f46279g;
        Objects.requireNonNull(aVar2);
        this.f48107e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f48110i = eVar.f46279g.h();
        this.f48109g = new View((LaunchActivity) eVar.f46274a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f46274a.d, this);
        this.f48108f = fVar;
        fVar.addView(this.f48109g);
        this.f48108f.addView(this.f48110i);
        View view = this.f48109g;
        View view2 = eVar.f46282k;
        ?? obj = new Object();
        obj.f6064a = view;
        obj.f6065b = view2;
        this.h = obj;
        obj.z(e7);
        eVar.f46274a.q().addView(this.f48108f);
        this.f48104a = 1;
        this.f48108f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f48110i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f48104a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f48104a);
            return;
        }
        this.h.z(this.f48111j.f46279g.c());
        this.f48104a = 3;
        this.f48108f.removeView(this.f48110i);
        this.f48108f.invalidate();
        this.f48110i = null;
        AndroidUtilities.doOnPreDraw(this.f48108f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
