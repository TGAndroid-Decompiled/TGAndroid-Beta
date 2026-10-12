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
    public rf.e f45649f;
    public View f45650g;
    public z5 h;
    public View f45651i;
    public final rf.d f45652j;
    public float f45653k;
    public boolean f45656n;
    public float f45657o;
    public int f45646a = 0;
    public final Rect f45647b = new Rect();
    public final Rect f45648c = new Rect();
    public final RectF f45654l = new RectF();
    public final Path f45655m = new Path();

    public e(rf.d dVar) {
        this.f45652j = dVar;
    }

    @Override
    public final void a() {
        h0 h0Var;
        rf.d dVar = this.f45652j;
        if (dVar != null && (h0Var = dVar.f44182l) != null) {
            h0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f45656n = false;
        h();
    }

    @Override
    public final void c() {
        h0 h0Var;
        rf.d dVar = this.f45652j;
        if (dVar != null && (h0Var = dVar.f44182l) != null) {
            h0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f45656n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f45647b;
        rf.d dVar = this.f45652j;
        if (this.f45646a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f45646a);
            return;
        }
        rect.set((Rect) dVar.h.f13952a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f44174a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f44174a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f44178g.e();
        final a aVar = dVar.f44178g;
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
        final a aVar2 = dVar.f44178g;
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
        this.f45651i = dVar.f44178g.h();
        this.f45650g = new View((LaunchActivity) dVar.f44174a.d);
        rf.e eVar = new rf.e((LaunchActivity) dVar.f44174a.d, this);
        this.f45649f = eVar;
        eVar.addView(this.f45650g);
        this.f45649f.addView(this.f45651i);
        View view = this.f45650g;
        View view2 = dVar.f44181k;
        ?? obj = new Object();
        obj.f5426b = view;
        obj.f5427c = view2;
        this.h = obj;
        obj.x(e);
        dVar.f44174a.q().addView(this.f45649f);
        this.f45646a = 1;
        this.f45649f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f45651i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f45646a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f45646a);
            return;
        }
        this.h.x(this.f45652j.f44178g.c());
        this.f45646a = 3;
        this.f45649f.removeView(this.f45651i);
        this.f45649f.invalidate();
        this.f45651i = null;
        AndroidUtilities.doOnPreDraw(this.f45649f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
