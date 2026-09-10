package r0;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
public final class s0 extends WindowInsetsAnimation.Callback {
    public final oh.e f41087a;
    public List f41088b;
    public ArrayList f41089c;
    public final HashMap d;

    public s0(oh.e eVar) {
        super(0);
        this.d = new HashMap();
        this.f41087a = eVar;
    }

    public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
        v0 v0Var = (v0) this.d.get(windowInsetsAnimation);
        if (v0Var == null) {
            v0Var = new v0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                v0Var.f41097a = new t0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, v0Var);
        }
        return v0Var;
    }

    @Override
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        oh.e eVar = this.f41087a;
        a(windowInsetsAnimation);
        eVar.S0();
        this.d.remove(windowInsetsAnimation);
    }

    @Override
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        oh.e eVar = this.f41087a;
        a(windowInsetsAnimation);
        eVar.getClass();
    }

    @Override
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f41089c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f41089c = arrayList2;
            this.f41088b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            v0 a2 = a(windowInsetsAnimation);
            a2.f41097a.d(windowInsetsAnimation.getFraction());
            this.f41089c.add(a2);
        }
        oh.e eVar = this.f41087a;
        l1 h = l1.h(null, windowInsets);
        eVar.T0(h, this.f41088b);
        return h.g();
    }

    @Override
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        oh.e eVar = this.f41087a;
        a(windowInsetsAnimation);
        i0.c f7 = t0.f(bounds);
        i0.c e = t0.e(bounds);
        if (eVar.f14588c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((oh.d) it.next()).s();
            }
        }
        eVar.f14588c++;
        r0.c();
        return r0.a(f7.d(), e.d());
    }
}
