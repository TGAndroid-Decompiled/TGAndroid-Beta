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
    public rf.e f47020f;
    public View f47021g;
    public z5 h;
    public View f47022i;
    public final rf.d f47023j;
    public float f47024k;
    public boolean f47027n;
    public float f47028o;
    public int f47017a = 0;
    public final Rect f47018b = new Rect();
    public final Rect f47019c = new Rect();
    public final RectF f47025l = new RectF();
    public final Path f47026m = new Path();

    public e(rf.d dVar) {
        this.f47023j = dVar;
    }

    @Override
    public final void a() {
        i0 i0Var;
        rf.d dVar = this.f47023j;
        if (dVar != null && (i0Var = dVar.f45282l) != null) {
            i0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f47027n = false;
        h();
    }

    @Override
    public final void c() {
        i0 i0Var;
        rf.d dVar = this.f47023j;
        if (dVar != null && (i0Var = dVar.f45282l) != null) {
            i0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f47027n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f47018b;
        rf.d dVar = this.f47023j;
        if (this.f47017a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f47017a);
            return;
        }
        rect.set((Rect) dVar.h.f14764a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f45274a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f45274a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f45278g.e();
        final a aVar = dVar.f45278g;
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
        final a aVar2 = dVar.f45278g;
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
        this.f47022i = dVar.f45278g.h();
        this.f47021g = new View((LaunchActivity) dVar.f45274a.d);
        rf.e eVar = new rf.e((LaunchActivity) dVar.f45274a.d, this);
        this.f47020f = eVar;
        eVar.addView(this.f47021g);
        this.f47020f.addView(this.f47022i);
        View view = this.f47021g;
        View view2 = dVar.f45281k;
        ?? obj = new Object();
        obj.f6881b = view;
        obj.f6882c = view2;
        this.h = obj;
        obj.z(e);
        dVar.f45274a.u().addView(this.f47020f);
        this.f47017a = 1;
        this.f47020f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f47022i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f47017a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f47017a);
            return;
        }
        this.h.z(this.f47023j.f45278g.c());
        this.f47017a = 3;
        this.f47020f.removeView(this.f47022i);
        this.f47020f.invalidate();
        this.f47022i = null;
        AndroidUtilities.doOnPreDraw(this.f47020f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
