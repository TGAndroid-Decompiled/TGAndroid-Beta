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
    public final rh.e f47132a;
    public List f47133b;
    public ArrayList f47134c;
    public final HashMap d;

    public s0(rh.e eVar) {
        super(0);
        this.d = new HashMap();
        this.f47132a = eVar;
    }

    public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
        v0 v0Var = (v0) this.d.get(windowInsetsAnimation);
        if (v0Var == null) {
            v0Var = new v0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                v0Var.f47142a = new t0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, v0Var);
        }
        return v0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f47132a.V0();
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f47132a.getClass();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f47134c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f47134c = arrayList2;
            this.f47133b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            v0 a2 = a(windowInsetsAnimation);
            a2.f47142a.d(windowInsetsAnimation.getFraction());
            this.f47134c.add(a2);
        }
        k1 h = k1.h(null, windowInsets);
        this.f47132a.W0(h, this.f47133b);
        return h.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        i0.b f7 = t0.f(bounds);
        i0.b e = t0.e(bounds);
        rh.e eVar = this.f47132a;
        if (eVar.f47616c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((rh.d) it.next()).t();
            }
        }
        eVar.f47616c++;
        r0.c();
        return r0.a(f7.d(), e.d());
    }
}
