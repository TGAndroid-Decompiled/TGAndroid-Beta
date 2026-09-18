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
    public pf.f f42486f;
    public View f42487g;
    public cf.c h;
    public View f42488i;
    public final pf.e f42489j;
    public float f42490k;
    public boolean f42493n;
    public float f42494o;
    public int f42483a = 0;
    public final Rect f42484b = new Rect();
    public final Rect f42485c = new Rect();
    public final RectF f42491l = new RectF();
    public final Path f42492m = new Path();

    public e(pf.e eVar) {
        this.f42489j = eVar;
    }

    @Override
    public final void a() {
        e0 e0Var;
        pf.e eVar = this.f42489j;
        if (eVar != null && (e0Var = eVar.f41056l) != null) {
            e0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42493n = false;
        h();
    }

    @Override
    public final void c() {
        e0 e0Var;
        pf.e eVar = this.f42489j;
        if (eVar != null && (e0Var = eVar.f41056l) != null) {
            e0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42493n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42484b;
        pf.e eVar = this.f42489j;
        if (this.f42483a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42483a);
            return;
        }
        rect.set(eVar.h.f43162a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f41048a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f41048a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f41052g.e();
        final a aVar = eVar.f41052g;
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
        final a aVar2 = eVar.f41052g;
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
        this.f42488i = eVar.f41052g.h();
        this.f42487g = new View((LaunchActivity) eVar.f41048a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f41048a.d, this);
        this.f42486f = fVar;
        fVar.addView(this.f42487g);
        this.f42486f.addView(this.f42488i);
        View view = this.f42487g;
        View view2 = eVar.f41055k;
        ?? obj = new Object();
        obj.f4260a = view;
        obj.f4261b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f41048a.q().addView(this.f42486f);
        this.f42483a = 1;
        this.f42486f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42488i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42483a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42483a);
            return;
        }
        this.h.y(this.f42489j.f41052g.c());
        this.f42483a = 3;
        this.f42486f.removeView(this.f42488i);
        this.f42486f.invalidate();
        this.f42488i = null;
        AndroidUtilities.doOnPreDraw(this.f42486f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
