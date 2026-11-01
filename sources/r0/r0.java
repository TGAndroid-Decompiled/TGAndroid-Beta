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
public final class r0 extends WindowInsetsAnimation$Callback {
    public final hh.e f46157a;
    public List f46158b;
    public ArrayList f46159c;
    public final HashMap d;

    public r0(hh.e eVar) {
        super(0);
        this.d = new HashMap();
        this.f46157a = eVar;
    }

    public final u0 a(WindowInsetsAnimation windowInsetsAnimation) {
        u0 u0Var = (u0) this.d.get(windowInsetsAnimation);
        if (u0Var == null) {
            u0Var = new u0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                u0Var.f46167a = new s0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, u0Var);
        }
        return u0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f46157a.V0();
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f46157a.getClass();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f46159c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f46159c = arrayList2;
            this.f46158b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            u0 a2 = a(windowInsetsAnimation);
            a2.f46167a.d(windowInsetsAnimation.getFraction());
            this.f46159c.add(a2);
        }
        j1 h = j1.h(null, windowInsets);
        this.f46157a.W0(h, this.f46158b);
        return h.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        i0.c f7 = s0.f(bounds);
        i0.c e = s0.e(bounds);
        hh.e eVar = this.f46157a;
        if (eVar.f7693c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((hh.d) it.next()).x();
            }
        }
        eVar.f7693c++;
        q0.c();
        return q0.a(f7.d(), e.d());
    }
}
