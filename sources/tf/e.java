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
    public rf.e f47058f;
    public View f47059g;
    public z5 h;
    public View f47060i;
    public final rf.d f47061j;
    public float f47062k;
    public boolean f47065n;
    public float f47066o;
    public int f47055a = 0;
    public final Rect f47056b = new Rect();
    public final Rect f47057c = new Rect();
    public final RectF f47063l = new RectF();
    public final Path f47064m = new Path();

    public e(rf.d dVar) {
        this.f47061j = dVar;
    }

    @Override
    public final void a() {
        h0 h0Var;
        rf.d dVar = this.f47061j;
        if (dVar != null && (h0Var = dVar.f45317l) != null) {
            h0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f47065n = false;
        h();
    }

    @Override
    public final void c() {
        h0 h0Var;
        rf.d dVar = this.f47061j;
        if (dVar != null && (h0Var = dVar.f45317l) != null) {
            h0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f47065n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f47056b;
        rf.d dVar = this.f47061j;
        if (this.f47055a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f47055a);
            return;
        }
        rect.set((Rect) dVar.h.f14766a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f45309a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f45309a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f45313g.e();
        final a aVar = dVar.f45313g;
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
        final a aVar2 = dVar.f45313g;
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
        this.f47060i = dVar.f45313g.h();
        this.f47059g = new View((LaunchActivity) dVar.f45309a.d);
        rf.e eVar = new rf.e((LaunchActivity) dVar.f45309a.d, this);
        this.f47058f = eVar;
        eVar.addView(this.f47059g);
        this.f47058f.addView(this.f47060i);
        View view = this.f47059g;
        View view2 = dVar.f45316k;
        ?? obj = new Object();
        obj.f6884b = view;
        obj.f6885c = view2;
        this.h = obj;
        obj.z(e);
        dVar.f45309a.v().addView(this.f47058f);
        this.f47055a = 1;
        this.f47058f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f47060i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f47055a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f47055a);
            return;
        }
        this.h.z(this.f47061j.f45313g.c());
        this.f47055a = 3;
        this.f47058f.removeView(this.f47060i);
        this.f47058f.invalidate();
        this.f47060i = null;
        AndroidUtilities.doOnPreDraw(this.f47058f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
