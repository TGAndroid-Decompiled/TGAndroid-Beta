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
    public final qh.e f44867a;
    public List f44868b;
    public ArrayList f44869c;
    public final HashMap d;

    public s0(qh.e eVar) {
        super(0);
        this.d = new HashMap();
        this.f44867a = eVar;
    }

    public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
        v0 v0Var = (v0) this.d.get(windowInsetsAnimation);
        if (v0Var == null) {
            v0Var = new v0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                v0Var.f44877a = new t0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, v0Var);
        }
        return v0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f44867a.V0();
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f44867a.getClass();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f44869c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f44869c = arrayList2;
            this.f44868b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            v0 a2 = a(windowInsetsAnimation);
            a2.f44877a.d(windowInsetsAnimation.getFraction());
            this.f44869c.add(a2);
        }
        k1 h = k1.h(null, windowInsets);
        this.f44867a.W0(h, this.f44868b);
        return h.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        i0.c f7 = t0.f(bounds);
        i0.c e = t0.e(bounds);
        qh.e eVar = this.f44867a;
        if (eVar.f44750c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((qh.d) it.next()).t();
            }
        }
        eVar.f44750c++;
        r0.c();
        return r0.a(f7.d(), e.d());
    }
}
