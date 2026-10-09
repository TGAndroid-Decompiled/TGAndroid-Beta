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
    public final ph.e f46793a;
    public List f46794b;
    public ArrayList f46795c;
    public final HashMap d;

    public s0(ph.e eVar) {
        super(0);
        this.d = new HashMap();
        this.f46793a = eVar;
    }

    public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
        v0 v0Var = (v0) this.d.get(windowInsetsAnimation);
        if (v0Var == null) {
            v0Var = new v0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                v0Var.f46805a = new t0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, v0Var);
        }
        return v0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f46793a.S0();
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f46793a.getClass();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f46795c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f46795c = arrayList2;
            this.f46794b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            v0 a2 = a(windowInsetsAnimation);
            a2.f46805a.d(windowInsetsAnimation.getFraction());
            this.f46795c.add(a2);
        }
        k1 h = k1.h(null, windowInsets);
        this.f46793a.T0(h, this.f46794b);
        return h.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        i0.b f7 = t0.f(bounds);
        i0.b e7 = t0.e(bounds);
        ph.e eVar = this.f46793a;
        if (eVar.f45869c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((ph.d) it.next()).t();
            }
        }
        eVar.f45869c++;
        r0.c();
        return r0.a(f7.d(), e7.d());
    }
}
