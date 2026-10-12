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
    public f f48214e;
    public qf.f f48215f;
    public View f48216g;
    public u5 h;
    public View f48217i;
    public final qf.e f48218j;
    public float f48219k;
    public boolean f48222n;
    public float f48223o;
    public int f48211a = 0;
    public final Rect f48212b = new Rect();
    public final Rect f48213c = new Rect();
    public final RectF f48220l = new RectF();
    public final Path f48221m = new Path();

    public e(qf.e eVar) {
        this.f48218j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f48218j;
        if (eVar != null && (f0Var = eVar.f46108l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f48222n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f48218j;
        if (eVar != null && (f0Var = eVar.f46108l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f48222n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f48212b;
        qf.e eVar = this.f48218j;
        if (this.f48211a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f48211a);
            return;
        }
        rect.set(eVar.h.f48489a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f46099a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f46099a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f46104g.e();
        final a aVar = eVar.f46104g;
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
        final a aVar2 = eVar.f46104g;
        Objects.requireNonNull(aVar2);
        this.f48214e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f48217i = eVar.f46104g.h();
        this.f48216g = new View((LaunchActivity) eVar.f46099a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f46099a.d, this);
        this.f48215f = fVar;
        fVar.addView(this.f48216g);
        this.f48215f.addView(this.f48217i);
        View view = this.f48216g;
        View view2 = eVar.f46107k;
        ?? obj = new Object();
        obj.f6063a = view;
        obj.f6064b = view2;
        this.h = obj;
        obj.y(e7);
        eVar.f46099a.q().addView(this.f48215f);
        this.f48211a = 1;
        this.f48215f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f48217i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f48211a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f48211a);
            return;
        }
        this.h.y(this.f48218j.f46104g.c());
        this.f48211a = 3;
        this.f48215f.removeView(this.f48217i);
        this.f48215f.invalidate();
        this.f48217i = null;
        AndroidUtilities.doOnPreDraw(this.f48215f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
