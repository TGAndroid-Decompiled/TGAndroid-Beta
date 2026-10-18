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
    public rf.e f47008f;
    public View f47009g;
    public z5 h;
    public View f47010i;
    public final rf.d f47011j;
    public float f47012k;
    public boolean f47015n;
    public float f47016o;
    public int f47005a = 0;
    public final Rect f47006b = new Rect();
    public final Rect f47007c = new Rect();
    public final RectF f47013l = new RectF();
    public final Path f47014m = new Path();

    public e(rf.d dVar) {
        this.f47011j = dVar;
    }

    @Override
    public final void a() {
        h0 h0Var;
        rf.d dVar = this.f47011j;
        if (dVar != null && (h0Var = dVar.f45271l) != null) {
            h0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f47015n = false;
        h();
    }

    @Override
    public final void c() {
        h0 h0Var;
        rf.d dVar = this.f47011j;
        if (dVar != null && (h0Var = dVar.f45271l) != null) {
            h0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f47015n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f47006b;
        rf.d dVar = this.f47011j;
        if (this.f47005a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f47005a);
            return;
        }
        rect.set((Rect) dVar.h.f14764a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f45263a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f45263a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f45267g.e();
        final a aVar = dVar.f45267g;
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
        final a aVar2 = dVar.f45267g;
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
        this.f47010i = dVar.f45267g.h();
        this.f47009g = new View((LaunchActivity) dVar.f45263a.d);
        rf.e eVar = new rf.e((LaunchActivity) dVar.f45263a.d, this);
        this.f47008f = eVar;
        eVar.addView(this.f47009g);
        this.f47008f.addView(this.f47010i);
        View view = this.f47009g;
        View view2 = dVar.f45270k;
        ?? obj = new Object();
        obj.f6882b = view;
        obj.f6883c = view2;
        this.h = obj;
        obj.z(e);
        dVar.f45263a.v().addView(this.f47008f);
        this.f47005a = 1;
        this.f47008f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f47010i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f47005a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f47005a);
            return;
        }
        this.h.z(this.f47011j.f45267g.c());
        this.f47005a = 3;
        this.f47008f.removeView(this.f47010i);
        this.f47008f.invalidate();
        this.f47010i = null;
        AndroidUtilities.doOnPreDraw(this.f47008f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
