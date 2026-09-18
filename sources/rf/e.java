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
    public pf.f f42259f;
    public View f42260g;
    public cf.c h;
    public View f42261i;
    public final pf.e f42262j;
    public float f42263k;
    public boolean f42266n;
    public float f42267o;
    public int f42256a = 0;
    public final Rect f42257b = new Rect();
    public final Rect f42258c = new Rect();
    public final RectF f42264l = new RectF();
    public final Path f42265m = new Path();

    public e(pf.e eVar) {
        this.f42262j = eVar;
    }

    @Override
    public final void a() {
        e0 e0Var;
        pf.e eVar = this.f42262j;
        if (eVar != null && (e0Var = eVar.f40828l) != null) {
            e0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42266n = false;
        h();
    }

    @Override
    public final void c() {
        e0 e0Var;
        pf.e eVar = this.f42262j;
        if (eVar != null && (e0Var = eVar.f40828l) != null) {
            e0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42266n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42257b;
        pf.e eVar = this.f42262j;
        if (this.f42256a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42256a);
            return;
        }
        rect.set(eVar.h.f42931a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f40820a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f40820a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f40824g.e();
        final a aVar = eVar.f40824g;
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
        final a aVar2 = eVar.f40824g;
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
        this.f42261i = eVar.f40824g.h();
        this.f42260g = new View((LaunchActivity) eVar.f40820a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f40820a.d, this);
        this.f42259f = fVar;
        fVar.addView(this.f42260g);
        this.f42259f.addView(this.f42261i);
        View view = this.f42260g;
        View view2 = eVar.f40827k;
        ?? obj = new Object();
        obj.f4260a = view;
        obj.f4261b = view2;
        this.h = obj;
        obj.x(e);
        eVar.f40820a.q().addView(this.f42259f);
        this.f42256a = 1;
        this.f42259f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42261i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42256a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42256a);
            return;
        }
        this.h.x(this.f42262j.f40824g.c());
        this.f42256a = 3;
        this.f42259f.removeView(this.f42261i);
        this.f42259f.invalidate();
        this.f42261i = null;
        AndroidUtilities.doOnPreDraw(this.f42259f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
