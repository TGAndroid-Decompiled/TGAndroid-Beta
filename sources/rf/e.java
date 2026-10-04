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
    public f f46029e;
    public pf.f f46030f;
    public View f46031g;
    public cf.c h;
    public View f46032i;
    public final pf.e f46033j;
    public float f46034k;
    public boolean f46037n;
    public float f46038o;
    public int f46026a = 0;
    public final Rect f46027b = new Rect();
    public final Rect f46028c = new Rect();
    public final RectF f46035l = new RectF();
    public final Path f46036m = new Path();

    public e(pf.e eVar) {
        this.f46033j = eVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        pf.e eVar = this.f46033j;
        if (eVar != null && (f0Var = eVar.f44426l) != null) {
            f0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f46037n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        pf.e eVar = this.f46033j;
        if (eVar != null && (f0Var = eVar.f44426l) != null) {
            f0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f46037n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f46027b;
        pf.e eVar = this.f46033j;
        if (this.f46026a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f46026a);
            return;
        }
        rect.set(eVar.h.f46786a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f44417a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f44417a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e7 = eVar.f44422g.e();
        final a aVar = eVar.f44422g;
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
        final a aVar2 = eVar.f44422g;
        Objects.requireNonNull(aVar2);
        this.f46029e = new f(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f46032i = eVar.f44422g.h();
        this.f46031g = new View((LaunchActivity) eVar.f44417a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f44417a.d, this);
        this.f46030f = fVar;
        fVar.addView(this.f46031g);
        this.f46030f.addView(this.f46032i);
        View view = this.f46031g;
        View view2 = eVar.f44425k;
        ?? obj = new Object();
        obj.f4603a = view;
        obj.f4604b = view2;
        this.h = obj;
        obj.w(e7);
        eVar.f44417a.q().addView(this.f46030f);
        this.f46026a = 1;
        this.f46030f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f46032i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f46026a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f46026a);
            return;
        }
        this.h.w(this.f46033j.f44422g.c());
        this.f46026a = 3;
        this.f46030f.removeView(this.f46032i);
        this.f46030f.invalidate();
        this.f46032i = null;
        AndroidUtilities.doOnPreDraw(this.f46030f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
