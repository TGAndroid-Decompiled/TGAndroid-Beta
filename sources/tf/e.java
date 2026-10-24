package tf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.z5;
import i2.h0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class e implements sf.c, sf.b {
    public f d;
    public f e;
    public rf.e f47455f;
    public View f47456g;
    public z5 h;
    public View f47457i;
    public final rf.d f47458j;
    public float f47459k;
    public boolean f47462n;
    public float f47463o;
    public int f47452a = 0;
    public final Rect f47453b = new Rect();
    public final Rect f47454c = new Rect();
    public final RectF f47460l = new RectF();
    public final Path f47461m = new Path();

    public e(rf.d dVar) {
        this.f47458j = dVar;
    }

    @Override
    public final void a() {
        h0 h0Var;
        rf.d dVar = this.f47458j;
        if (dVar != null && (h0Var = dVar.f45694l) != null) {
            h0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f47462n = false;
        h();
    }

    @Override
    public final void c() {
        h0 h0Var;
        rf.d dVar = this.f47458j;
        if (dVar != null && (h0Var = dVar.f45694l) != null) {
            h0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f47462n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f47453b;
        rf.d dVar = this.f47458j;
        if (this.f47452a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f47452a);
            return;
        }
        rect.set((Rect) dVar.h.f14802a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f45686a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f45686a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f45690g.e();
        final a aVar = dVar.f45690g;
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
        final a aVar2 = dVar.f45690g;
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
        this.f47457i = dVar.f45690g.h();
        this.f47456g = new View((LaunchActivity) dVar.f45686a.d);
        rf.e eVar = new rf.e((LaunchActivity) dVar.f45686a.d, this);
        this.f47455f = eVar;
        eVar.addView(this.f47456g);
        this.f47455f.addView(this.f47457i);
        View view = this.f47456g;
        View view2 = dVar.f45693k;
        ?? obj = new Object();
        obj.f6893b = view;
        obj.f6894c = view2;
        this.h = obj;
        obj.z(e);
        dVar.f45686a.o().addView(this.f47455f);
        this.f47452a = 1;
        this.f47455f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f47457i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f47452a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f47452a);
            return;
        }
        this.h.z(this.f47458j.f45690g.c());
        this.f47452a = 3;
        this.f47455f.removeView(this.f47457i);
        this.f47455f.invalidate();
        this.f47457i = null;
        AndroidUtilities.doOnPreDraw(this.f47455f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
