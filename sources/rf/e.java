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
    public pf.f f42228f;
    public View f42229g;
    public cf.c h;
    public View f42230i;
    public final pf.e f42231j;
    public float f42232k;
    public boolean f42235n;
    public float f42236o;
    public int f42225a = 0;
    public final Rect f42226b = new Rect();
    public final Rect f42227c = new Rect();
    public final RectF f42233l = new RectF();
    public final Path f42234m = new Path();

    public e(pf.e eVar) {
        this.f42231j = eVar;
    }

    @Override
    public final void a() {
        e0 e0Var;
        pf.e eVar = this.f42231j;
        if (eVar != null && (e0Var = eVar.f40797l) != null) {
            e0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42235n = false;
        h();
    }

    @Override
    public final void c() {
        e0 e0Var;
        pf.e eVar = this.f42231j;
        if (eVar != null && (e0Var = eVar.f40797l) != null) {
            e0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42235n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42226b;
        pf.e eVar = this.f42231j;
        if (this.f42225a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42225a);
            return;
        }
        rect.set(eVar.h.f42900a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f40789a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f40789a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f40793g.e();
        final a aVar = eVar.f40793g;
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
        final a aVar2 = eVar.f40793g;
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
        this.f42230i = eVar.f40793g.h();
        this.f42229g = new View((LaunchActivity) eVar.f40789a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f40789a.d, this);
        this.f42228f = fVar;
        fVar.addView(this.f42229g);
        this.f42228f.addView(this.f42230i);
        View view = this.f42229g;
        View view2 = eVar.f40796k;
        ?? obj = new Object();
        obj.f4257a = view;
        obj.f4258b = view2;
        this.h = obj;
        obj.x(e);
        eVar.f40789a.q().addView(this.f42228f);
        this.f42225a = 1;
        this.f42228f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42230i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42225a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42225a);
            return;
        }
        this.h.x(this.f42231j.f40793g.c());
        this.f42225a = 3;
        this.f42228f.removeView(this.f42230i);
        this.f42228f.invalidate();
        this.f42230i = null;
        AndroidUtilities.doOnPreDraw(this.f42228f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
