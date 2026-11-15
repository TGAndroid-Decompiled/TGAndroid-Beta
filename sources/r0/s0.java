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
public final class s0 extends WindowInsetsAnimation$Callback {
    public final rh.d f55699a;
    public List f55700b;
    public ArrayList f55701c;
    public final HashMap d;

    public s0(rh.d dVar) {
        super(0);
        this.d = new HashMap();
        this.f55699a = dVar;
    }

    public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
        v0 v0Var = (v0) this.d.get(windowInsetsAnimation);
        if (v0Var == null) {
            v0Var = new v0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                v0Var.f55711a = new t0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, v0Var);
        }
        return v0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f55699a.V0();
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f55699a.getClass();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f55701c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f55701c = arrayList2;
            this.f55700b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            v0 a10 = a(windowInsetsAnimation);
            a10.f55711a.d(windowInsetsAnimation.getFraction());
            this.f55701c.add(a10);
        }
        k1 h = k1.h(null, windowInsets);
        this.f55699a.W0(h, this.f55700b);
        return h.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        i0.c f10 = t0.f(bounds);
        i0.c e10 = t0.e(bounds);
        rh.d dVar = this.f55699a;
        if (dVar.f56026c == 0) {
            Iterator it = dVar.d.iterator();
            while (it.hasNext()) {
                ((rh.c) it.next()).w();
            }
        }
        dVar.f56026c++;
        r0.c();
        return r0.a(f10.d(), e10.d());
    }
}
