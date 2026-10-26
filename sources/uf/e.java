package uf;

import a8.fg;
import a8.me;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import i2.j0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class e implements tf.c, tf.b {
    public f d;
    public f e;
    public sf.e f49725f;
    public View f49726g;
    public me h;
    public View f49727i;
    public final sf.d f49728j;
    public float f49729k;
    public boolean f49732n;
    public float f49733o;
    public int f49722a = 0;
    public final Rect f49723b = new Rect();
    public final Rect f49724c = new Rect();
    public final RectF f49730l = new RectF();
    public final Path f49731m = new Path();

    public e(sf.d dVar) {
        this.f49728j = dVar;
    }

    @Override
    public final void a() {
        j0 j0Var;
        sf.d dVar = this.f49728j;
        if (dVar != null && (j0Var = dVar.f48136l) != null) {
            j0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f49732n = false;
        h();
    }

    @Override
    public final void c() {
        j0 j0Var;
        sf.d dVar = this.f49728j;
        if (dVar != null && (j0Var = dVar.f48136l) != null) {
            j0Var.i();
        }
    }

    @Override
    public final void e() {
        this.f49732n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f49723b;
        sf.d dVar = this.f49728j;
        if (this.f49722a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f49722a);
            return;
        }
        rect.set((Rect) dVar.h.f16247a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f48128a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f48128a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap e = dVar.f48132g.e();
        final a aVar = dVar.f48132g;
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
        final a aVar2 = dVar.f48132g;
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
        this.f49727i = dVar.f48132g.h();
        this.f49726g = new View((LaunchActivity) dVar.f48128a.d);
        sf.e eVar = new sf.e((LaunchActivity) dVar.f48128a.d, this);
        this.f49725f = eVar;
        eVar.addView(this.f49726g);
        this.f49725f.addView(this.f49727i);
        View view = this.f49726g;
        View view2 = dVar.f48135k;
        ?? obj = new Object();
        obj.f614a = view;
        obj.f615b = view2;
        this.h = obj;
        obj.y(e);
        dVar.f48128a.o().addView(this.f49725f);
        this.f49722a = 1;
        this.f49725f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f49727i, new fg(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f49722a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f49722a);
            return;
        }
        this.h.y(this.f49728j.f48132g.c());
        this.f49722a = 3;
        this.f49725f.removeView(this.f49727i);
        this.f49725f.invalidate();
        this.f49727i = null;
        AndroidUtilities.doOnPreDraw(this.f49725f, new fg(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
