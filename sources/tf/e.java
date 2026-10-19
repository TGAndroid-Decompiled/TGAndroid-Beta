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
import i2.i0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class e implements sf.c, sf.b {
    public f d;
    public f e;
    public rf.e f47010f;
    public View f47011g;
    public z5 h;
    public View f47012i;
    public final rf.d f47013j;
    public float f47014k;
    public boolean f47017n;
    public float f47018o;
    public int f47007a = 0;
    public final Rect f47008b = new Rect();
    public final Rect f47009c = new Rect();
    public final RectF f47015l = new RectF();
    public final Path f47016m = new Path();

    public e(rf.d dVar) {
        this.f47013j = dVar;
    }

    @Override
    public final void a() {
        i0 i0Var;
        rf.d dVar = this.f47013j;
        if (dVar != null && (i0Var = dVar.f45269l) != null) {
            i0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f47017n = false;
        h();
    }

    @Override
    public final void c() {
        i0 i0Var;
        rf.d dVar = this.f47013j;
        if (dVar != null && (i0Var = dVar.f45269l) != null) {
            i0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f47017n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f47008b;
        rf.d dVar = this.f47013j;
        if (this.f47007a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f47007a);
            return;
        }
        rect.set((Rect) dVar.h.f14766a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f45261a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f45261a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f45265g.e();
        final a aVar = dVar.f45265g;
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
        final a aVar2 = dVar.f45265g;
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
        this.f47012i = dVar.f45265g.h();
        this.f47011g = new View((LaunchActivity) dVar.f45261a.d);
        rf.e eVar = new rf.e((LaunchActivity) dVar.f45261a.d, this);
        this.f47010f = eVar;
        eVar.addView(this.f47011g);
        this.f47010f.addView(this.f47012i);
        View view = this.f47011g;
        View view2 = dVar.f45268k;
        ?? obj = new Object();
        obj.f6883b = view;
        obj.f6884c = view2;
        this.h = obj;
        obj.z(e);
        dVar.f45261a.u().addView(this.f47010f);
        this.f47007a = 1;
        this.f47010f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f47012i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f47007a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f47007a);
            return;
        }
        this.h.z(this.f47013j.f45265g.c());
        this.f47007a = 3;
        this.f47010f.removeView(this.f47012i);
        this.f47010f.invalidate();
        this.f47012i = null;
        AndroidUtilities.doOnPreDraw(this.f47010f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
