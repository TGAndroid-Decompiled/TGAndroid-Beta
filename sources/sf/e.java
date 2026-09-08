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
    public f f46027e;
    public qf.f f46028f;
    public View f46029g;
    public cf.c h;
    public View f46030i;
    public final qf.e f46031j;
    public float f46032k;
    public boolean f46035n;
    public float f46036o;
    public int f46024a = 0;
    public final Rect f46025b = new Rect();
    public final Rect f46026c = new Rect();
    public final RectF f46033l = new RectF();
    public final Path f46034m = new Path();

    public e(qf.e eVar) {
        this.f46031j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f46031j;
        if (eVar != null && (f0Var = eVar.f44390l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f46035n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f46031j;
        if (eVar != null && (f0Var = eVar.f44390l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f46035n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f46025b;
        qf.e eVar = this.f46031j;
        if (this.f46024a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f46024a);
            return;
        }
        rect.set(eVar.h.f46513a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f44381a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f44381a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f44386g.e();
        final a aVar = eVar.f44386g;
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
        final a aVar2 = eVar.f44386g;
        Objects.requireNonNull(aVar2);
        this.f46027e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f46030i = eVar.f44386g.h();
        this.f46029g = new View((LaunchActivity) eVar.f44381a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f44381a.d, this);
        this.f46028f = fVar;
        fVar.addView(this.f46029g);
        this.f46028f.addView(this.f46030i);
        View view = this.f46029g;
        View view2 = eVar.f44389k;
        ?? obj = new Object();
        obj.f4823a = view;
        obj.f4824b = view2;
        this.h = obj;
        obj.u(e7);
        eVar.f44381a.q().addView(this.f46028f);
        this.f46024a = 1;
        this.f46028f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f46030i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f46024a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f46024a);
            return;
        }
        this.h.u(this.f46031j.f44386g.c());
        this.f46024a = 3;
        this.f46028f.removeView(this.f46030i);
        this.f46028f.invalidate();
        this.f46030i = null;
        AndroidUtilities.doOnPreDraw(this.f46028f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
