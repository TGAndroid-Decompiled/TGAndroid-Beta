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
    public pf.f f42232f;
    public View f42233g;
    public cf.c h;
    public View f42234i;
    public final pf.e f42235j;
    public float f42236k;
    public boolean f42239n;
    public float f42240o;
    public int f42229a = 0;
    public final Rect f42230b = new Rect();
    public final Rect f42231c = new Rect();
    public final RectF f42237l = new RectF();
    public final Path f42238m = new Path();

    public e(pf.e eVar) {
        this.f42235j = eVar;
    }

    @Override
    public final void a() {
        e0 e0Var;
        pf.e eVar = this.f42235j;
        if (eVar != null && (e0Var = eVar.f40801l) != null) {
            e0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42239n = false;
        h();
    }

    @Override
    public final void c() {
        e0 e0Var;
        pf.e eVar = this.f42235j;
        if (eVar != null && (e0Var = eVar.f40801l) != null) {
            e0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42239n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42230b;
        pf.e eVar = this.f42235j;
        if (this.f42229a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42229a);
            return;
        }
        rect.set(eVar.h.f42904a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f40793a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f40793a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f40797g.e();
        final a aVar = eVar.f40797g;
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
        final a aVar2 = eVar.f40797g;
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
        this.f42234i = eVar.f40797g.h();
        this.f42233g = new View((LaunchActivity) eVar.f40793a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f40793a.d, this);
        this.f42232f = fVar;
        fVar.addView(this.f42233g);
        this.f42232f.addView(this.f42234i);
        View view = this.f42233g;
        View view2 = eVar.f40800k;
        ?? obj = new Object();
        obj.f4255a = view;
        obj.f4256b = view2;
        this.h = obj;
        obj.x(e);
        eVar.f40793a.q().addView(this.f42232f);
        this.f42229a = 1;
        this.f42232f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42234i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42229a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42229a);
            return;
        }
        this.h.x(this.f42235j.f40797g.c());
        this.f42229a = 3;
        this.f42232f.removeView(this.f42234i);
        this.f42232f.invalidate();
        this.f42234i = null;
        AndroidUtilities.doOnPreDraw(this.f42232f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
