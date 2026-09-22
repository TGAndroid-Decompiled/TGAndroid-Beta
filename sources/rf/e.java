package rf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.p;
import i2.e0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class e implements qf.c, qf.b {
    public f d;
    public f e;
    public pf.f f42551f;
    public View f42552g;
    public cf.c h;
    public View f42553i;
    public final pf.e f42554j;
    public float f42555k;
    public boolean f42558n;
    public float f42559o;
    public int f42548a = 0;
    public final Rect f42549b = new Rect();
    public final Rect f42550c = new Rect();
    public final RectF f42556l = new RectF();
    public final Path f42557m = new Path();

    public e(pf.e eVar) {
        this.f42554j = eVar;
    }

    @Override
    public final void a() {
        e0 e0Var;
        pf.e eVar = this.f42554j;
        if (eVar != null && (e0Var = eVar.f41117l) != null) {
            e0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42558n = false;
        h();
    }

    @Override
    public final void c() {
        e0 e0Var;
        pf.e eVar = this.f42554j;
        if (eVar != null && (e0Var = eVar.f41117l) != null) {
            e0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42558n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42549b;
        pf.e eVar = this.f42554j;
        if (this.f42548a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42548a);
            return;
        }
        rect.set(eVar.h.f43227a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f41109a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f41109a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f41113g.e();
        final a aVar = eVar.f41113g;
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
        final a aVar2 = eVar.f41113g;
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
        this.f42553i = eVar.f41113g.h();
        this.f42552g = new View((LaunchActivity) eVar.f41109a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f41109a.d, this);
        this.f42551f = fVar;
        fVar.addView(this.f42552g);
        this.f42551f.addView(this.f42553i);
        View view = this.f42552g;
        View view2 = eVar.f41116k;
        ?? obj = new Object();
        obj.f4259a = view;
        obj.f4260b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f41109a.q().addView(this.f42551f);
        this.f42548a = 1;
        this.f42551f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42553i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42548a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42548a);
            return;
        }
        this.h.y(this.f42554j.f41113g.c());
        this.f42548a = 3;
        this.f42551f.removeView(this.f42553i);
        this.f42551f.invalidate();
        this.f42553i = null;
        AndroidUtilities.doOnPreDraw(this.f42551f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
