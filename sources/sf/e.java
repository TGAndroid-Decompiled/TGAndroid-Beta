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
    public f f47983e;
    public qf.f f47984f;
    public View f47985g;
    public u5 h;
    public View f47986i;
    public final qf.e f47987j;
    public float f47988k;
    public boolean f47991n;
    public float f47992o;
    public int f47980a = 0;
    public final Rect f47981b = new Rect();
    public final Rect f47982c = new Rect();
    public final RectF f47989l = new RectF();
    public final Path f47990m = new Path();

    public e(qf.e eVar) {
        this.f47987j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f47987j;
        if (eVar != null && (f0Var = eVar.f46171l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f47991n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f47987j;
        if (eVar != null && (f0Var = eVar.f46171l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f47991n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f47981b;
        qf.e eVar = this.f47987j;
        if (this.f47980a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f47980a);
            return;
        }
        rect.set(eVar.h.f48258a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f46162a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f46162a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f46167g.e();
        final a aVar = eVar.f46167g;
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
        final a aVar2 = eVar.f46167g;
        Objects.requireNonNull(aVar2);
        this.f47983e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f47986i = eVar.f46167g.h();
        this.f47985g = new View((LaunchActivity) eVar.f46162a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f46162a.d, this);
        this.f47984f = fVar;
        fVar.addView(this.f47985g);
        this.f47984f.addView(this.f47986i);
        View view = this.f47985g;
        View view2 = eVar.f46170k;
        ?? obj = new Object();
        obj.f6065a = view;
        obj.f6066b = view2;
        this.h = obj;
        obj.z(e7);
        eVar.f46162a.q().addView(this.f47984f);
        this.f47980a = 1;
        this.f47984f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f47986i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f47980a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f47980a);
            return;
        }
        this.h.z(this.f47987j.f46167g.c());
        this.f47980a = 3;
        this.f47984f.removeView(this.f47986i);
        this.f47984f.invalidate();
        this.f47986i = null;
        AndroidUtilities.doOnPreDraw(this.f47984f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
