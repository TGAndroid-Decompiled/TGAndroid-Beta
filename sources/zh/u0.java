package zh;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lg0;
public final class u0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        x0 x0Var = x0.Z;
        WindowManager.LayoutParams layoutParams = x0Var.f49027c;
        int n10 = (int) (x0Var.n() * x0Var.M);
        layoutParams.width = n10;
        x0Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = x0Var.f49027c;
        int m10 = (int) (x0Var.m() * x0Var.M);
        layoutParams2.height = m10;
        x0Var.K = m10;
        AndroidUtilities.updateViewLayout(x0Var.f49026b, x0Var.d, x0Var.f49027c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        x0 x0Var = x0.Z;
        x0Var.M = w7.q.a(scaleGestureDetector.getScaleFactor() * x0Var.M, 0.6f, x0Var.f49025a);
        x0Var.J = (int) (x0Var.n() * x0Var.M);
        x0Var.K = (int) (x0Var.m() * x0Var.M);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(this, 18));
        o1.k kVar = x0Var.P;
        kVar.f14125b = x0Var.N;
        kVar.f14126c = true;
        o1.l lVar = kVar.f14134u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - x0Var.J) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f14140i = dp;
        o1.k kVar2 = x0Var.P;
        if (!kVar2.f14127f) {
            kVar2.f();
        }
        o1.k kVar3 = x0Var.Q;
        kVar3.f14125b = x0Var.O;
        kVar3.f14126c = true;
        kVar3.f14134u.f14140i = w7.q.a(scaleGestureDetector.getFocusY() - (x0Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - x0Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = x0Var.Q;
        if (!kVar4.f14127f) {
            kVar4.f();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        x0 x0Var = x0.Z;
        if (x0Var.E) {
            x0Var.E = false;
        }
        x0Var.F = true;
        x0Var.f49027c.width = (int) (x0Var.n() * x0Var.f49025a);
        x0Var.f49027c.height = (int) (x0Var.m() * x0Var.f49025a);
        AndroidUtilities.updateViewLayout(x0Var.f49026b, x0Var.d, x0Var.f49027c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        x0 x0Var = x0.Z;
        if (!x0Var.P.f14127f && !x0Var.Q.f14127f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        lg0 lg0Var = new lg0(this, arrayList, 2);
        o1.k kVar = x0Var.P;
        if (!kVar.f14127f) {
            arrayList.add(kVar);
        } else {
            kVar.a(lg0Var);
        }
        o1.k kVar2 = x0Var.Q;
        if (!kVar2.f14127f) {
            arrayList.add(kVar2);
        } else {
            kVar2.a(lg0Var);
        }
    }
}
