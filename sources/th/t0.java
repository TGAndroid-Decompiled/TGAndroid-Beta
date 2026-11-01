package th;

import android.graphics.Point;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.ui.Components.ff0;
public final class t0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        w0 w0Var = w0.Z;
        WindowManager.LayoutParams layoutParams = w0Var.f49565c;
        int h = (int) (w0Var.h() * w0Var.M);
        layoutParams.width = h;
        w0Var.J = h;
        WindowManager.LayoutParams layoutParams2 = w0Var.f49565c;
        int f7 = (int) (w0Var.f() * w0Var.M);
        layoutParams2.height = f7;
        w0Var.K = f7;
        org.telegram.messenger.i0.S3(w0Var.f49564b, w0Var.d, w0Var.f49565c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        Point point;
        float L;
        w0 w0Var = w0.Z;
        w0Var.M = w7.u.a(scaleGestureDetector.getScaleFactor() * w0Var.M, 0.6f, w0Var.f49563a);
        w0Var.J = (int) (w0Var.h() * w0Var.M);
        w0Var.K = (int) (w0Var.f() * w0Var.M);
        org.telegram.messenger.i0.g3(new r5.a(this, 10));
        o1.j jVar = w0Var.P;
        jVar.f13950b = w0Var.N;
        jVar.f13951c = true;
        o1.k kVar = jVar.f13958m;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = org.telegram.messenger.i0.f16172q.x;
        if (focusX >= i10 / 2.0f) {
            L = (i10 - w0Var.J) - org.telegram.messenger.i0.L(16.0f);
        } else {
            L = org.telegram.messenger.i0.L(16.0f);
        }
        kVar.f13965i = L;
        o1.j jVar2 = w0Var.P;
        if (!jVar2.f13952f) {
            jVar2.h();
        }
        o1.j jVar3 = w0Var.Q;
        jVar3.f13950b = w0Var.O;
        jVar3.f13951c = true;
        jVar3.f13958m.f13965i = w7.u.a(scaleGestureDetector.getFocusY() - (w0Var.K / 2.0f), org.telegram.messenger.i0.L(16.0f), (point.y - w0Var.K) - org.telegram.messenger.i0.L(16.0f));
        o1.j jVar4 = w0Var.Q;
        if (!jVar4.f13952f) {
            jVar4.h();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        w0 w0Var = w0.Z;
        if (w0Var.E) {
            w0Var.E = false;
        }
        w0Var.F = true;
        w0Var.f49565c.width = (int) (w0Var.h() * w0Var.f49563a);
        w0Var.f49565c.height = (int) (w0Var.f() * w0Var.f49563a);
        org.telegram.messenger.i0.S3(w0Var.f49564b, w0Var.d, w0Var.f49565c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        w0 w0Var = w0.Z;
        if (!w0Var.P.f13952f && !w0Var.Q.f13952f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ff0 ff0Var = new ff0(this, arrayList, 2);
        o1.j jVar = w0Var.P;
        if (!jVar.f13952f) {
            arrayList.add(jVar);
        } else {
            jVar.a(ff0Var);
        }
        o1.j jVar2 = w0Var.Q;
        if (!jVar2.f13952f) {
            arrayList.add(jVar2);
        } else {
            jVar2.a(ff0Var);
        }
    }
}
