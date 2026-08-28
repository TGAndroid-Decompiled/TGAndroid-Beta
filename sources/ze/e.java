package ze;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import h3.k0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class e implements ye.c, ye.b {
    public f d;
    public f f50442e;
    public xe.e f50443f;
    public View f50444g;
    public b3.b h;
    public View f50445i;
    public final xe.d f50446j;
    public float f50447k;
    public boolean f50450n;
    public float f50451o;
    public int f50439a = 0;
    public final Rect f50440b = new Rect();
    public final Rect f50441c = new Rect();
    public final RectF f50448l = new RectF();
    public final Path f50449m = new Path();

    public e(xe.d dVar) {
        this.f50446j = dVar;
    }

    @Override
    public final void a() {
        k0 k0Var;
        xe.d dVar = this.f50446j;
        if (dVar != null && (k0Var = dVar.f49153l) != null) {
            k0Var.o(false);
        }
    }

    @Override
    public final void b() {
        this.f50450n = false;
        h();
    }

    @Override
    public final void c() {
        k0 k0Var;
        xe.d dVar = this.f50446j;
        if (dVar != null && (k0Var = dVar.f49153l) != null) {
            k0Var.o(true);
        }
    }

    @Override
    public final void e() {
        this.f50450n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f50440b;
        xe.d dVar = this.f50446j;
        if (this.f50439a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f50439a);
            return;
        }
        rect.set(dVar.h.f153a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f49144a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f49144a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap c10 = dVar.f49149g.c();
        final a aVar = dVar.f49149g;
        Objects.requireNonNull(aVar);
        this.d = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        aVar.b((Canvas) obj);
                        return;
                    default:
                        aVar.d((Canvas) obj);
                        return;
                }
            }
        });
        final a aVar2 = dVar.f49149g;
        Objects.requireNonNull(aVar2);
        this.f50442e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        aVar2.b((Canvas) obj);
                        return;
                    default:
                        aVar2.d((Canvas) obj);
                        return;
                }
            }
        });
        this.f50445i = dVar.f49149g.h();
        this.f50444g = new View((LaunchActivity) dVar.f49144a.d);
        xe.e eVar = new xe.e((LaunchActivity) dVar.f49144a.d, this);
        this.f50443f = eVar;
        eVar.addView(this.f50444g);
        this.f50443f.addView(this.f50445i);
        View view = this.f50444g;
        View view2 = dVar.f49152k;
        ?? obj = new Object();
        obj.f1413a = view;
        obj.f1414b = view2;
        this.h = obj;
        obj.y(c10);
        dVar.f49144a.b().addView(this.f50443f);
        this.f50439a = 1;
        this.f50443f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f50445i, new af.f(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f50439a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f50439a);
            return;
        }
        this.h.y(this.f50446j.f49149g.a());
        this.f50439a = 3;
        this.f50443f.removeView(this.f50445i);
        this.f50443f.invalidate();
        this.f50445i = null;
        AndroidUtilities.doOnPreDraw(this.f50443f, new af.f(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
