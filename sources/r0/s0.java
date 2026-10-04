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
    public final ph.e f45625a;
    public List f45626b;
    public ArrayList f45627c;
    public final HashMap d;

    public s0(ph.e eVar) {
        super(0);
        this.d = new HashMap();
        this.f45625a = eVar;
    }

    public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
        v0 v0Var = (v0) this.d.get(windowInsetsAnimation);
        if (v0Var == null) {
            v0Var = new v0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                v0Var.f45637a = new t0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, v0Var);
        }
        return v0Var;
    }

    @Override
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        ph.e eVar = this.f45625a;
        a(windowInsetsAnimation);
        eVar.S0();
        this.d.remove(windowInsetsAnimation);
    }

    @Override
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        ph.e eVar = this.f45625a;
        a(windowInsetsAnimation);
        eVar.getClass();
    }

    @Override
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f45627c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f45627c = arrayList2;
            this.f45626b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            v0 a2 = a(windowInsetsAnimation);
            a2.f45637a.d(windowInsetsAnimation.getFraction());
            this.f45627c.add(a2);
        }
        ph.e eVar = this.f45625a;
        l1 h = l1.h(null, windowInsets);
        eVar.T0(h, this.f45626b);
        return h.g();
    }

    @Override
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        ph.e eVar = this.f45625a;
        a(windowInsetsAnimation);
        i0.b f7 = t0.f(bounds);
        i0.b e7 = t0.e(bounds);
        if (eVar.f44711c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((ph.d) it.next()).s();
            }
        }
        eVar.f44711c++;
        r0.c();
        return r0.a(f7.d(), e7.d());
    }
}
