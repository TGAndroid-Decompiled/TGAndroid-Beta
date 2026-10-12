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
    public f f48222e;
    public qf.f f48223f;
    public View f48224g;
    public u5 h;
    public View f48225i;
    public final qf.e f48226j;
    public float f48227k;
    public boolean f48230n;
    public float f48231o;
    public int f48219a = 0;
    public final Rect f48220b = new Rect();
    public final Rect f48221c = new Rect();
    public final RectF f48228l = new RectF();
    public final Path f48229m = new Path();

    public e(qf.e eVar) {
        this.f48226j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f48226j;
        if (eVar != null && (f0Var = eVar.f46116l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f48230n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f48226j;
        if (eVar != null && (f0Var = eVar.f46116l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f48230n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f48220b;
        qf.e eVar = this.f48226j;
        if (this.f48219a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f48219a);
            return;
        }
        rect.set(eVar.h.f48497a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f46107a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f46107a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f46112g.e();
        final a aVar = eVar.f46112g;
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
        final a aVar2 = eVar.f46112g;
        Objects.requireNonNull(aVar2);
        this.f48222e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f48225i = eVar.f46112g.h();
        this.f48224g = new View((LaunchActivity) eVar.f46107a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f46107a.d, this);
        this.f48223f = fVar;
        fVar.addView(this.f48224g);
        this.f48223f.addView(this.f48225i);
        View view = this.f48224g;
        View view2 = eVar.f46115k;
        ?? obj = new Object();
        obj.f6063a = view;
        obj.f6064b = view2;
        this.h = obj;
        obj.y(e7);
        eVar.f46107a.q().addView(this.f48223f);
        this.f48219a = 1;
        this.f48223f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f48225i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f48219a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f48219a);
            return;
        }
        this.h.y(this.f48226j.f46112g.c());
        this.f48219a = 3;
        this.f48223f.removeView(this.f48225i);
        this.f48223f.invalidate();
        this.f48225i = null;
        AndroidUtilities.doOnPreDraw(this.f48223f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
