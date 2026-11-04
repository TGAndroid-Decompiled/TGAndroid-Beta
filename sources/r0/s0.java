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
    public final sh.d f54043a;
    public List f54044b;
    public ArrayList f54045c;
    public final HashMap d;

    public s0(sh.d dVar) {
        super(0);
        this.d = new HashMap();
        this.f54043a = dVar;
    }

    public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
        v0 v0Var = (v0) this.d.get(windowInsetsAnimation);
        if (v0Var == null) {
            v0Var = new v0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                v0Var.f54055a = new t0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, v0Var);
        }
        return v0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f54043a.V0();
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f54043a.getClass();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f54045c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f54045c = arrayList2;
            this.f54044b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            v0 a10 = a(windowInsetsAnimation);
            a10.f54055a.d(windowInsetsAnimation.getFraction());
            this.f54045c.add(a10);
        }
        k1 h = k1.h(null, windowInsets);
        this.f54043a.W0(h, this.f54044b);
        return h.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        i0.b f10 = t0.f(bounds);
        i0.b e10 = t0.e(bounds);
        sh.d dVar = this.f54043a;
        if (dVar.f54726c == 0) {
            Iterator it = dVar.d.iterator();
            while (it.hasNext()) {
                ((sh.c) it.next()).w();
            }
        }
        dVar.f54726c++;
        r0.c();
        return r0.a(f10.d(), e10.d());
    }
}
