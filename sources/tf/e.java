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
    public rf.e f47021f;
    public View f47022g;
    public z5 h;
    public View f47023i;
    public final rf.d f47024j;
    public float f47025k;
    public boolean f47028n;
    public float f47029o;
    public int f47018a = 0;
    public final Rect f47019b = new Rect();
    public final Rect f47020c = new Rect();
    public final RectF f47026l = new RectF();
    public final Path f47027m = new Path();

    public e(rf.d dVar) {
        this.f47024j = dVar;
    }

    @Override
    public final void a() {
        i0 i0Var;
        rf.d dVar = this.f47024j;
        if (dVar != null && (i0Var = dVar.f45283l) != null) {
            i0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f47028n = false;
        h();
    }

    @Override
    public final void c() {
        i0 i0Var;
        rf.d dVar = this.f47024j;
        if (dVar != null && (i0Var = dVar.f45283l) != null) {
            i0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f47028n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f47019b;
        rf.d dVar = this.f47024j;
        if (this.f47018a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f47018a);
            return;
        }
        rect.set((Rect) dVar.h.f14764a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f45275a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f45275a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f45279g.e();
        final a aVar = dVar.f45279g;
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
        final a aVar2 = dVar.f45279g;
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
        this.f47023i = dVar.f45279g.h();
        this.f47022g = new View((LaunchActivity) dVar.f45275a.d);
        rf.e eVar = new rf.e((LaunchActivity) dVar.f45275a.d, this);
        this.f47021f = eVar;
        eVar.addView(this.f47022g);
        this.f47021f.addView(this.f47023i);
        View view = this.f47022g;
        View view2 = dVar.f45282k;
        ?? obj = new Object();
        obj.f6881b = view;
        obj.f6882c = view2;
        this.h = obj;
        obj.z(e);
        dVar.f45275a.u().addView(this.f47021f);
        this.f47018a = 1;
        this.f47021f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f47023i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f47018a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f47018a);
            return;
        }
        this.h.z(this.f47024j.f45279g.c());
        this.f47018a = 3;
        this.f47021f.removeView(this.f47023i);
        this.f47021f.invalidate();
        this.f47023i = null;
        AndroidUtilities.doOnPreDraw(this.f47021f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
