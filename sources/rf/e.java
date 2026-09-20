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
    public pf.f f42530f;
    public View f42531g;
    public cf.c h;
    public View f42532i;
    public final pf.e f42533j;
    public float f42534k;
    public boolean f42537n;
    public float f42538o;
    public int f42527a = 0;
    public final Rect f42528b = new Rect();
    public final Rect f42529c = new Rect();
    public final RectF f42535l = new RectF();
    public final Path f42536m = new Path();

    public e(pf.e eVar) {
        this.f42533j = eVar;
    }

    @Override
    public final void a() {
        e0 e0Var;
        pf.e eVar = this.f42533j;
        if (eVar != null && (e0Var = eVar.f41097l) != null) {
            e0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f42537n = false;
        h();
    }

    @Override
    public final void c() {
        e0 e0Var;
        pf.e eVar = this.f42533j;
        if (eVar != null && (e0Var = eVar.f41097l) != null) {
            e0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f42537n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f42528b;
        pf.e eVar = this.f42533j;
        if (this.f42527a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f42527a);
            return;
        }
        rect.set(eVar.h.f43206a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) eVar.f41089a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) eVar.f41089a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = eVar.f41093g.e();
        final a aVar = eVar.f41093g;
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
        final a aVar2 = eVar.f41093g;
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
        this.f42532i = eVar.f41093g.h();
        this.f42531g = new View((LaunchActivity) eVar.f41089a.d);
        pf.f fVar = new pf.f((LaunchActivity) eVar.f41089a.d, this);
        this.f42530f = fVar;
        fVar.addView(this.f42531g);
        this.f42530f.addView(this.f42532i);
        View view = this.f42531g;
        View view2 = eVar.f41096k;
        ?? obj = new Object();
        obj.f4261a = view;
        obj.f4262b = view2;
        this.h = obj;
        obj.y(e);
        eVar.f41089a.q().addView(this.f42530f);
        this.f42527a = 1;
        this.f42530f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f42532i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f42527a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f42527a);
            return;
        }
        this.h.y(this.f42533j.f41093g.c());
        this.f42527a = 3;
        this.f42530f.removeView(this.f42532i);
        this.f42530f.invalidate();
        this.f42532i = null;
        AndroidUtilities.doOnPreDraw(this.f42530f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
