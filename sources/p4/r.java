package p4;

import a8.ma;
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
    public static final AtomicReference f55423n = new AtomicReference(null);
    public final Context f55424a;
    public final e2.c1 f55425b;
    public String f55426c;
    public final w7.s d;
    public final Bundle f55427e;
    public final Bundle f55428f;
    public h2.d f55429g;
    public final boolean h;
    public final t1 f55430i;
    public final t1 f55431j;
    public final t1 f55432k;
    public final boolean f55433l;
    public boolean f55434m;

    public r(LaunchActivity launchActivity, e2.c1 c1Var) {
        w7.s sVar = new w7.s(20);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.f55424a = applicationContext;
        this.f55425b = c1Var;
        ma.f(c1Var.P());
        this.f55426c = "";
        this.d = sVar;
        this.f55427e = new Bundle();
        this.f55428f = new Bundle();
        h9.g0 g0Var = h9.i0.f13998b;
        t1 t1Var = t1.f14066e;
        this.f55430i = t1Var;
        this.f55431j = t1Var;
        this.h = true;
        this.f55433l = true;
        this.f55432k = t1Var;
    }

    public final x a() {
        ma.p(!this.f55434m);
        this.f55434m = true;
        Object obj = x.f55461b;
        int intValue = ((Integer) d0.C.get()).intValue();
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f55424a;
        if (i7 < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        h2.d dVar = this.f55429g;
        if (dVar == null) {
            ?? obj2 = new Object();
            obj2.f3326c = context;
            obj2.f3325b = -1;
            obj2.f3325b = intValue;
            obj2.f3324a = true;
            this.f55429g = new j2.i(obj2);
        } else {
            this.f55429g = new b3.j(dVar, intValue, 10);
        }
        if (i7 == 29) {
            h2.d dVar2 = this.f55429g;
            AtomicReference atomicReference = f55423n;
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
            this.f55429g = new ji.k(20, dVar2, aVar);
        }
        this.f55429g = new k8.a(this.f55429g);
        return new x(this.f55424a, this.f55426c, this.f55425b, this.f55430i, this.f55431j, this.f55432k, this.d, this.f55427e, this.f55428f, this.f55429g, this.h, this.f55433l);
    }
}
