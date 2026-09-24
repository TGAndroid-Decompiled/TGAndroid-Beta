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
    public pf.f f42502f;
    public View f42503g;
    public cf.c h;
    public View f42504i;
    public final pf.e f42505j;
    public float f42506k;
    public boolean f42509n;
    public float f42510o;
    public int f42499a = 0;
    public final Rect f42500b = new Rect();
    public final Rect f42501c = new Rect();
    public final RectF f42507l = new RectF();
    public final Path f42508m = new Path();

    public e(pf.e eVar) {
        this.f42505j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f42505j;
        if (eVar != null && (f0Var = eVar.f41054l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42509n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f42505j;
        if (eVar != null && (f0Var = eVar.f41054l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42509n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42500b;
        pf.e eVar = this.f42505j;
        if (this.f42499a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42499a);
            return;
        }
        rect.set(eVar.h.f43178a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f41046a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f41046a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f41050g.e();
        final a aVar = eVar.f41050g;
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
        final a aVar2 = eVar.f41050g;
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
        this.f42504i = eVar.f41050g.h();
        this.f42503g = new View((LaunchActivity) eVar.f41046a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f41046a.d, this);
        this.f42502f = fVar;
        fVar.addView(this.f42503g);
        this.f42502f.addView(this.f42504i);
        View view = this.f42503g;
        View view2 = eVar.f41053k;
        ?? obj = new Object();
        obj.f4252a = view;
        obj.f4253b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f41046a.q().addView(this.f42502f);
        this.f42499a = 1;
        this.f42502f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42504i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42499a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42499a);
            return;
        }
        this.h.y(this.f42505j.f41050g.c());
        this.f42499a = 3;
        this.f42502f.removeView(this.f42504i);
        this.f42502f.invalidate();
        this.f42504i = null;
        AndroidUtilities.doOnPreDraw(this.f42502f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
