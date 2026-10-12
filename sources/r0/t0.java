package r0;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
public final class t0 extends WindowInsetsAnimation$Callback {
    public final qh.e f43755a;
    public List f43756b;
    public ArrayList f43757c;
    public final HashMap d;

    public t0(qh.e eVar) {
        super(0);
        this.d = new HashMap();
        this.f43755a = eVar;
    }

    public final w0 a(WindowInsetsAnimation windowInsetsAnimation) {
        w0 w0Var = (w0) this.d.get(windowInsetsAnimation);
        if (w0Var == null) {
            w0Var = new w0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                w0Var.f43765a = new u0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, w0Var);
        }
        return w0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f43755a.V0();
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f43755a.getClass();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f43757c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f43757c = arrayList2;
            this.f43756b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            w0 a2 = a(windowInsetsAnimation);
            a2.f43765a.d(windowInsetsAnimation.getFraction());
            this.f43757c.add(a2);
        }
        l1 h = l1.h(null, windowInsets);
        this.f43755a.W0(h, this.f43756b);
        return h.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        i0.b f7 = u0.f(bounds);
        i0.b e = u0.e(bounds);
        qh.e eVar = this.f43755a;
        if (eVar.f43635c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((qh.d) it.next()).u();
            }
        }
        eVar.f43635c++;
        s0.c();
        return s0.a(f7.d(), e.d());
    }
}
