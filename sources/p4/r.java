package p4;

import a8.la;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import h9.t1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.LaunchActivity;
public final class r {
    public static final AtomicReference f55458n = new AtomicReference(null);
    public final Context f55459a;
    public final e2.c1 f55460b;
    public String f55461c;
    public final w7.s d;
    public final Bundle f55462e;
    public final Bundle f55463f;
    public h2.d f55464g;
    public final boolean h;
    public final t1 f55465i;
    public final t1 f55466j;
    public final t1 f55467k;
    public final boolean f55468l;
    public boolean f55469m;

    public r(LaunchActivity launchActivity, e2.c1 c1Var) {
        w7.s sVar = new w7.s(20);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.f55459a = applicationContext;
        this.f55460b = c1Var;
        la.f(c1Var.P());
        this.f55461c = "";
        this.d = sVar;
        this.f55462e = new Bundle();
        this.f55463f = new Bundle();
        h9.g0 g0Var = h9.i0.f14035b;
        t1 t1Var = t1.f14103e;
        this.f55465i = t1Var;
        this.f55466j = t1Var;
        this.h = true;
        this.f55468l = true;
        this.f55467k = t1Var;
    }

    public final x a() {
        la.p(!this.f55469m);
        this.f55469m = true;
        Object obj = x.f55496b;
        int intValue = ((Integer) e0.C.get()).intValue();
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f55459a;
        if (i7 < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        h2.d dVar = this.f55464g;
        if (dVar == null) {
            ?? obj2 = new Object();
            obj2.f3375c = context;
            obj2.f3374b = -1;
            obj2.f3374b = intValue;
            obj2.f3373a = true;
            this.f55464g = new j2.i(obj2);
        } else {
            this.f55464g = new b3.j(dVar, intValue, 10);
        }
        if (i7 == 29) {
            h2.d dVar2 = this.f55464g;
            AtomicReference atomicReference = f55458n;
            l9.a aVar = (l9.a) atomicReference.get();
            if (aVar == null) {
                Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                int i10 = point2.y;
                int i11 = point2.x;
                Point point3 = new Point(i10 - (i11 - point.x), i11 - (i10 - point.y));
                l9.a aVar2 = new l9.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                atomicReference.set(aVar2);
                aVar = aVar2;
            }
            this.f55464g = new ji.l(20, dVar2, aVar);
        }
        this.f55464g = new k8.a(this.f55464g);
        return new x(this.f55459a, this.f55461c, this.f55460b, this.f55465i, this.f55466j, this.f55467k, this.d, this.f55462e, this.f55463f, this.f55464g, this.h, this.f55468l);
    }
}
