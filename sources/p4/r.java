package p4;

import a8.ia;
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
    public static final AtomicReference f53333n = new AtomicReference(null);
    public final Context f53334a;
    public final e2.c1 f53335b;
    public String f53336c;
    public final pb.b d;
    public final Bundle f53337e;
    public final Bundle f53338f;
    public h2.d f53339g;
    public final boolean h;
    public final t1 f53340i;
    public final t1 f53341j;
    public final t1 f53342k;
    public final boolean f53343l;
    public boolean f53344m;

    public r(LaunchActivity launchActivity, e2.c1 c1Var) {
        pb.b bVar = new pb.b(20);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.f53334a = applicationContext;
        this.f53335b = c1Var;
        ia.f(c1Var.P());
        this.f53336c = "";
        this.d = bVar;
        this.f53337e = new Bundle();
        this.f53338f = new Bundle();
        h9.g0 g0Var = h9.i0.f14329b;
        t1 t1Var = t1.f14397e;
        this.f53340i = t1Var;
        this.f53341j = t1Var;
        this.h = true;
        this.f53343l = true;
        this.f53342k = t1Var;
    }

    public final x a() {
        ia.p(!this.f53344m);
        this.f53344m = true;
        Object obj = x.f53368b;
        int intValue = ((Integer) d0.C.get()).intValue();
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f53334a;
        if (i7 < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        h2.d dVar = this.f53339g;
        if (dVar == null) {
            ?? obj2 = new Object();
            obj2.f3394c = context;
            obj2.f3393b = -1;
            obj2.f3393b = intValue;
            obj2.f3392a = true;
            this.f53339g = new j2.i(obj2);
        } else {
            this.f53339g = new f5.u(dVar, intValue, 11);
        }
        if (i7 == 29) {
            h2.d dVar2 = this.f53339g;
            AtomicReference atomicReference = f53333n;
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
            this.f53339g = new j2.n(dVar2, aVar, false, 22);
        }
        this.f53339g = new m4.d0((Object) this.f53339g, false);
        return new x(this.f53334a, this.f53336c, this.f53335b, this.f53340i, this.f53341j, this.f53342k, this.d, this.f53337e, this.f53338f, this.f53339g, this.h, this.f53343l);
    }
}
