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
    public f f46021e;
    public pf.f f46022f;
    public View f46023g;
    public cf.c h;
    public View f46024i;
    public final pf.e f46025j;
    public float f46026k;
    public boolean f46029n;
    public float f46030o;
    public int f46018a = 0;
    public final Rect f46019b = new Rect();
    public final Rect f46020c = new Rect();
    public final RectF f46027l = new RectF();
    public final Path f46028m = new Path();

    public e(pf.e eVar) {
        this.f46025j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f46025j;
        if (eVar != null && (f0Var = eVar.f44418l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f46029n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f46025j;
        if (eVar != null && (f0Var = eVar.f44418l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f46029n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f46019b;
        pf.e eVar = this.f46025j;
        if (this.f46018a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f46018a);
            return;
        }
        rect.set(eVar.h.f46778a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f44409a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f44409a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f44414g.e();
        final a aVar = eVar.f44414g;
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
        final a aVar2 = eVar.f44414g;
        Objects.requireNonNull(aVar2);
        this.f46021e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f46024i = eVar.f44414g.h();
        this.f46023g = new View((LaunchActivity) eVar.f44409a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f44409a.d, this);
        this.f46022f = fVar;
        fVar.addView(this.f46023g);
        this.f46022f.addView(this.f46024i);
        View view = this.f46023g;
        View view2 = eVar.f44417k;
        ?? obj = new Object();
        obj.f4602a = view;
        obj.f4603b = view2;
        this.h = obj;
        obj.w(e7);
        eVar.f44409a.q().addView(this.f46022f);
        this.f46018a = 1;
        this.f46022f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f46024i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f46018a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f46018a);
            return;
        }
        this.h.w(this.f46025j.f44414g.c());
        this.f46018a = 3;
        this.f46022f.removeView(this.f46024i);
        this.f46022f.invalidate();
        this.f46024i = null;
        AndroidUtilities.doOnPreDraw(this.f46022f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
