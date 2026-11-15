package p4;

import a8.ja;
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
    public static final AtomicReference f54842n = new AtomicReference(null);
    public final Context f54843a;
    public final e2.c1 f54844b;
    public String f54845c;
    public final w7.s d;
    public final Bundle f54846e;
    public final Bundle f54847f;
    public h2.d f54848g;
    public final boolean h;
    public final s1 f54849i;
    public final s1 f54850j;
    public final s1 f54851k;
    public final boolean f54852l;
    public boolean f54853m;

    public r(LaunchActivity launchActivity, e2.c1 c1Var) {
        w7.s sVar = new w7.s(20);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.f54843a = applicationContext;
        this.f54844b = c1Var;
        ja.f(c1Var.P());
        this.f54845c = "";
        this.d = sVar;
        this.f54846e = new Bundle();
        this.f54847f = new Bundle();
        h9.g0 g0Var = h9.i0.f13686b;
        s1 s1Var = s1.f13749e;
        this.f54849i = s1Var;
        this.f54850j = s1Var;
        this.h = true;
        this.f54852l = true;
        this.f54851k = s1Var;
    }

    public final x a() {
        ja.p(!this.f54853m);
        this.f54853m = true;
        Object obj = x.f54879b;
        int intValue = ((Integer) d0.C.get()).intValue();
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f54843a;
        if (i7 < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        h2.d dVar = this.f54848g;
        if (dVar == null) {
            ?? obj2 = new Object();
            obj2.f3345c = context;
            obj2.f3344b = -1;
            obj2.f3344b = intValue;
            obj2.f3343a = true;
            this.f54848g = new j2.i(obj2);
        } else {
            this.f54848g = new f5.v(dVar, intValue, 11);
        }
        if (i7 == 29) {
            h2.d dVar2 = this.f54848g;
            AtomicReference atomicReference = f54842n;
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
            this.f54848g = new ji.j(20, dVar2, aVar);
        }
        this.f54848g = new k8.a(this.f54848g);
        return new x(this.f54843a, this.f54845c, this.f54844b, this.f54849i, this.f54850j, this.f54851k, this.d, this.f54846e, this.f54847f, this.f54848g, this.h, this.f54852l);
    }
}
