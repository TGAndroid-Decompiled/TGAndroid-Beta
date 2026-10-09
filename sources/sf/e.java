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
    public f f47981e;
    public qf.f f47982f;
    public View f47983g;
    public u5 h;
    public View f47984i;
    public final qf.e f47985j;
    public float f47986k;
    public boolean f47989n;
    public float f47990o;
    public int f47978a = 0;
    public final Rect f47979b = new Rect();
    public final Rect f47980c = new Rect();
    public final RectF f47987l = new RectF();
    public final Path f47988m = new Path();

    public e(qf.e eVar) {
        this.f47985j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        qf.e eVar = this.f47985j;
        if (eVar != null && (f0Var = eVar.f46169l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f47989n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        qf.e eVar = this.f47985j;
        if (eVar != null && (f0Var = eVar.f46169l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f47989n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f47979b;
        qf.e eVar = this.f47985j;
        if (this.f47978a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f47978a);
            return;
        }
        rect.set(eVar.h.f48256a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f46160a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f46160a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f46165g.e();
        final a aVar = eVar.f46165g;
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
        final a aVar2 = eVar.f46165g;
        Objects.requireNonNull(aVar2);
        this.f47981e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f47984i = eVar.f46165g.h();
        this.f47983g = new View((LaunchActivity) eVar.f46160a.d);
        qf.f fVar = new qf.f((LaunchActivity) eVar.f46160a.d, this);
        this.f47982f = fVar;
        fVar.addView(this.f47983g);
        this.f47982f.addView(this.f47984i);
        View view = this.f47983g;
        View view2 = eVar.f46168k;
        ?? obj = new Object();
        obj.f6065a = view;
        obj.f6066b = view2;
        this.h = obj;
        obj.z(e7);
        eVar.f46160a.q().addView(this.f47982f);
        this.f47978a = 1;
        this.f47982f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f47984i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f47978a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f47978a);
            return;
        }
        this.h.z(this.f47985j.f46165g.c());
        this.f47978a = 3;
        this.f47982f.removeView(this.f47984i);
        this.f47982f.invalidate();
        this.f47984i = null;
        AndroidUtilities.doOnPreDraw(this.f47982f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
