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
    public static final AtomicReference f55413n = new AtomicReference(null);
    public final Context f55414a;
    public final e2.c1 f55415b;
    public String f55416c;
    public final w7.s d;
    public final Bundle f55417e;
    public final Bundle f55418f;
    public h2.d f55419g;
    public final boolean h;
    public final t1 f55420i;
    public final t1 f55421j;
    public final t1 f55422k;
    public final boolean f55423l;
    public boolean f55424m;

    public r(LaunchActivity launchActivity, e2.c1 c1Var) {
        w7.s sVar = new w7.s(20);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.f55414a = applicationContext;
        this.f55415b = c1Var;
        la.f(c1Var.P());
        this.f55416c = "";
        this.d = sVar;
        this.f55417e = new Bundle();
        this.f55418f = new Bundle();
        h9.g0 g0Var = h9.i0.f14006b;
        t1 t1Var = t1.f14074e;
        this.f55420i = t1Var;
        this.f55421j = t1Var;
        this.h = true;
        this.f55423l = true;
        this.f55422k = t1Var;
    }

    public final x a() {
        la.p(!this.f55424m);
        this.f55424m = true;
        Object obj = x.f55451b;
        int intValue = ((Integer) d0.C.get()).intValue();
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f55414a;
        if (i7 < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        h2.d dVar = this.f55419g;
        if (dVar == null) {
            ?? obj2 = new Object();
            obj2.f3355c = context;
            obj2.f3354b = -1;
            obj2.f3354b = intValue;
            obj2.f3353a = true;
            this.f55419g = new j2.i(obj2);
        } else {
            this.f55419g = new b3.j(dVar, intValue, 10);
        }
        if (i7 == 29) {
            h2.d dVar2 = this.f55419g;
            AtomicReference atomicReference = f55413n;
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
            this.f55419g = new ji.j(20, dVar2, aVar);
        }
        this.f55419g = new k8.a(this.f55419g);
        return new x(this.f55414a, this.f55416c, this.f55415b, this.f55420i, this.f55421j, this.f55422k, this.d, this.f55417e, this.f55418f, this.f55419g, this.h, this.f55423l);
    }
}
