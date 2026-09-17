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
    public f f46028e;
    public qf.f f46029f;
    public View f46030g;
    public cf.c h;
    public View f46031i;
    public final qf.e f46032j;
    public float f46033k;
    public boolean f46036n;
    public float f46037o;
    public int f46025a = 0;
    public final Rect f46026b = new Rect();
    public final Rect f46027c = new Rect();
    public final RectF f46034l = new RectF();
    public final Path f46035m = new Path();

    public e(qf.e eVar) {
        this.f46032j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f46032j;
        if (eVar != null && (f0Var = eVar.f44391l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f46036n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f46032j;
        if (eVar != null && (f0Var = eVar.f44391l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f46036n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f46026b;
        qf.e eVar = this.f46032j;
        if (this.f46025a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f46025a);
            return;
        }
        rect.set(eVar.h.f46514a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f44382a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f44382a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f44387g.e();
        final a aVar = eVar.f44387g;
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
        final a aVar2 = eVar.f44387g;
        Objects.requireNonNull(aVar2);
        this.f46028e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f46031i = eVar.f44387g.h();
        this.f46030g = new View((LaunchActivity) eVar.f44382a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f44382a.d, this);
        this.f46029f = fVar;
        fVar.addView(this.f46030g);
        this.f46029f.addView(this.f46031i);
        View view = this.f46030g;
        View view2 = eVar.f44390k;
        ?? obj = new Object();
        obj.f4823a = view;
        obj.f4824b = view2;
        this.h = obj;
        obj.u(e7);
        eVar.f44382a.q().addView(this.f46029f);
        this.f46025a = 1;
        this.f46029f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f46031i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f46025a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f46025a);
            return;
        }
        this.h.u(this.f46032j.f44387g.c());
        this.f46025a = 3;
        this.f46029f.removeView(this.f46031i);
        this.f46029f.invalidate();
        this.f46031i = null;
        AndroidUtilities.doOnPreDraw(this.f46029f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
