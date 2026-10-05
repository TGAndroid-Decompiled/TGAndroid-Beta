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
    public f f46036e;
    public pf.f f46037f;
    public View f46038g;
    public cf.c h;
    public View f46039i;
    public final pf.e f46040j;
    public float f46041k;
    public boolean f46044n;
    public float f46045o;
    public int f46033a = 0;
    public final Rect f46034b = new Rect();
    public final Rect f46035c = new Rect();
    public final RectF f46042l = new RectF();
    public final Path f46043m = new Path();

    public e(pf.e eVar) {
        this.f46040j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f46040j;
        if (eVar != null && (f0Var = eVar.f44433l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f46044n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f46040j;
        if (eVar != null && (f0Var = eVar.f44433l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f46044n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f46034b;
        pf.e eVar = this.f46040j;
        if (this.f46033a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f46033a);
            return;
        }
        rect.set(eVar.h.f46793a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f44424a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f44424a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f44429g.e();
        final a aVar = eVar.f44429g;
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
        final a aVar2 = eVar.f44429g;
        Objects.requireNonNull(aVar2);
        this.f46036e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f46039i = eVar.f44429g.h();
        this.f46038g = new View((LaunchActivity) eVar.f44424a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f44424a.d, this);
        this.f46037f = fVar;
        fVar.addView(this.f46038g);
        this.f46037f.addView(this.f46039i);
        View view = this.f46038g;
        View view2 = eVar.f44432k;
        ?? obj = new Object();
        obj.f4603a = view;
        obj.f4604b = view2;
        this.h = obj;
        obj.r(e7);
        eVar.f44424a.q().addView(this.f46037f);
        this.f46033a = 1;
        this.f46037f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f46039i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f46033a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f46033a);
            return;
        }
        this.h.r(this.f46040j.f44429g.c());
        this.f46033a = 3;
        this.f46037f.removeView(this.f46039i);
        this.f46037f.invalidate();
        this.f46039i = null;
        AndroidUtilities.doOnPreDraw(this.f46037f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
