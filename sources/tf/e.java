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
import i2.g0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class e implements sf.c, sf.b {
    public f d;
    public f e;
    public rf.e f47036f;
    public View f47037g;
    public z5 h;
    public View f47038i;
    public final rf.d f47039j;
    public float f47040k;
    public boolean f47043n;
    public float f47044o;
    public int f47033a = 0;
    public final Rect f47034b = new Rect();
    public final Rect f47035c = new Rect();
    public final RectF f47041l = new RectF();
    public final Path f47042m = new Path();

    public e(rf.d dVar) {
        this.f47039j = dVar;
    }

    @Override
    public final void a() {
        g0 g0Var;
        rf.d dVar = this.f47039j;
        if (dVar != null && (g0Var = dVar.f45297l) != null) {
            g0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f47043n = false;
        h();
    }

    @Override
    public final void c() {
        g0 g0Var;
        rf.d dVar = this.f47039j;
        if (dVar != null && (g0Var = dVar.f45297l) != null) {
            g0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f47043n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f47034b;
        rf.d dVar = this.f47039j;
        if (this.f47033a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f47033a);
            return;
        }
        rect.set((Rect) dVar.h.f14759a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f45289a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f45289a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f45293g.e();
        final a aVar = dVar.f45293g;
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
        final a aVar2 = dVar.f45293g;
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
        this.f47038i = dVar.f45293g.h();
        this.f47037g = new View((LaunchActivity) dVar.f45289a.d);
        rf.e eVar = new rf.e((LaunchActivity) dVar.f45289a.d, this);
        this.f47036f = eVar;
        eVar.addView(this.f47037g);
        this.f47036f.addView(this.f47038i);
        View view = this.f47037g;
        View view2 = dVar.f45296k;
        ?? obj = new Object();
        obj.f6883b = view;
        obj.f6884c = view2;
        this.h = obj;
        obj.z(e);
        dVar.f45289a.v().addView(this.f47036f);
        this.f47033a = 1;
        this.f47036f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f47038i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f47033a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f47033a);
            return;
        }
        this.h.z(this.f47039j.f45293g.c());
        this.f47033a = 3;
        this.f47036f.removeView(this.f47038i);
        this.f47036f.invalidate();
        this.f47038i = null;
        AndroidUtilities.doOnPreDraw(this.f47036f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
