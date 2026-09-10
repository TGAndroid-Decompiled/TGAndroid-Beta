package rf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import bi.u6;
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
    public pf.f f41442f;
    public View f41443g;
    public u6 h;
    public View f41444i;
    public final pf.e f41445j;
    public float f41446k;
    public boolean f41449n;
    public float f41450o;
    public int f41439a = 0;
    public final Rect f41440b = new Rect();
    public final Rect f41441c = new Rect();
    public final RectF f41447l = new RectF();
    public final Path f41448m = new Path();

    public e(pf.e eVar) {
        this.f41445j = eVar;
    }

    @Override
    public final void a() {
        e0 e0Var;
        pf.e eVar = this.f41445j;
        if (eVar != null && (e0Var = eVar.f39927l) != null) {
            e0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f41449n = false;
        h();
    }

    @Override
    public final void c() {
        e0 e0Var;
        pf.e eVar = this.f41445j;
        if (eVar != null && (e0Var = eVar.f39927l) != null) {
            e0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f41449n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f41440b;
        pf.e eVar = this.f41445j;
        if (this.f41439a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f41439a);
            return;
        }
        rect.set(eVar.h.f41839a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f39919a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f39919a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f39923g.e();
        final a aVar = eVar.f39923g;
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
        final a aVar2 = eVar.f39923g;
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
        this.f41444i = eVar.f39923g.h();
        this.f41443g = new View((LaunchActivity) eVar.f39919a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f39919a.d, this);
        this.f41442f = fVar;
        fVar.addView(this.f41443g);
        this.f41442f.addView(this.f41444i);
        View view = this.f41443g;
        View view2 = eVar.f39926k;
        ?? obj = new Object();
        obj.f3719a = view;
        obj.f3720b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f39919a.q().addView(this.f41442f);
        this.f41439a = 1;
        this.f41442f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f41444i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f41439a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f41439a);
            return;
        }
        this.h.y(this.f41445j.f39923g.c());
        this.f41439a = 3;
        this.f41442f.removeView(this.f41444i);
        this.f41442f.invalidate();
        this.f41444i = null;
        AndroidUtilities.doOnPreDraw(this.f41442f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
