package p4;

import a8.ma;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import h9.s1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.LaunchActivity;
public final class r {
    public static final AtomicReference f55540n = new AtomicReference(null);
    public final Context f55541a;
    public final e2.c1 f55542b;
    public String f55543c;
    public final w7.s d;
    public final Bundle f55544e;
    public final Bundle f55545f;
    public h2.d f55546g;
    public final boolean h;
    public final s1 f55547i;
    public final s1 f55548j;
    public final s1 f55549k;
    public final boolean f55550l;
    public boolean f55551m;

    public r(LaunchActivity launchActivity, e2.c1 c1Var) {
        w7.s sVar = new w7.s(20);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.f55541a = applicationContext;
        this.f55542b = c1Var;
        ma.f(c1Var.Q());
        this.f55543c = "";
        this.d = sVar;
        this.f55544e = new Bundle();
        this.f55545f = new Bundle();
        h9.g0 g0Var = h9.i0.f13995b;
        s1 s1Var = s1.f14058e;
        this.f55547i = s1Var;
        this.f55548j = s1Var;
        this.h = true;
        this.f55550l = true;
        this.f55549k = s1Var;
    }

    public final x a() {
        ma.p(!this.f55551m);
        this.f55551m = true;
        Object obj = x.f55577b;
        int intValue = ((Integer) d0.C.get()).intValue();
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f55541a;
        if (i7 < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        h2.d dVar = this.f55546g;
        if (dVar == null) {
            ?? obj2 = new Object();
            obj2.f3326c = context;
            obj2.f3325b = -1;
            obj2.f3325b = intValue;
            obj2.f3324a = true;
            this.f55546g = new j2.i(obj2);
        } else {
            this.f55546g = new b3.j(dVar, intValue, 10);
        }
        if (i7 == 29) {
            h2.d dVar2 = this.f55546g;
            AtomicReference atomicReference = f55540n;
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
            this.f55546g = new j6.k(dVar2, aVar, false, 21);
        }
        this.f55546g = new jb.m(this.f55546g);
        return new x(this.f55541a, this.f55543c, this.f55542b, this.f55547i, this.f55548j, this.f55549k, this.d, this.f55544e, this.f55545f, this.f55546g, this.h, this.f55550l);
    }
}
