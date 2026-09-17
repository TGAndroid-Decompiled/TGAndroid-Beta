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
    public pf.f f42254f;
    public View f42255g;
    public cf.c h;
    public View f42256i;
    public final pf.e f42257j;
    public float f42258k;
    public boolean f42261n;
    public float f42262o;
    public int f42251a = 0;
    public final Rect f42252b = new Rect();
    public final Rect f42253c = new Rect();
    public final RectF f42259l = new RectF();
    public final Path f42260m = new Path();

    public e(pf.e eVar) {
        this.f42257j = eVar;
    }

    @Override
    public final void a() {
        e0 e0Var;
        pf.e eVar = this.f42257j;
        if (eVar != null && (e0Var = eVar.f40823l) != null) {
            e0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42261n = false;
        h();
    }

    @Override
    public final void c() {
        e0 e0Var;
        pf.e eVar = this.f42257j;
        if (eVar != null && (e0Var = eVar.f40823l) != null) {
            e0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42261n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42252b;
        pf.e eVar = this.f42257j;
        if (this.f42251a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42251a);
            return;
        }
        rect.set(eVar.h.f42926a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f40815a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f40815a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f40819g.e();
        final a aVar = eVar.f40819g;
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
        final a aVar2 = eVar.f40819g;
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
        this.f42256i = eVar.f40819g.h();
        this.f42255g = new View((LaunchActivity) eVar.f40815a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f40815a.d, this);
        this.f42254f = fVar;
        fVar.addView(this.f42255g);
        this.f42254f.addView(this.f42256i);
        View view = this.f42255g;
        View view2 = eVar.f40822k;
        ?? obj = new Object();
        obj.f4260a = view;
        obj.f4261b = view2;
        this.h = obj;
        obj.x(e);
        eVar.f40815a.q().addView(this.f42254f);
        this.f42251a = 1;
        this.f42254f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42256i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42251a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42251a);
            return;
        }
        this.h.x(this.f42257j.f40819g.c());
        this.f42251a = 3;
        this.f42254f.removeView(this.f42256i);
        this.f42254f.invalidate();
        this.f42256i = null;
        AndroidUtilities.doOnPreDraw(this.f42254f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
