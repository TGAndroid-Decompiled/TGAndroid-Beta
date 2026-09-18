package r0;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
public final class t0 extends WindowInsetsAnimation.Callback {
    public final ph.e f42124a;
    public List f42125b;
    public ArrayList f42126c;
    public final HashMap d;

    public t0(ph.e eVar) {
        super(0);
        this.d = new HashMap();
        this.f42124a = eVar;
    }

    public final w0 a(WindowInsetsAnimation windowInsetsAnimation) {
        w0 w0Var = (w0) this.d.get(windowInsetsAnimation);
        if (w0Var == null) {
            w0Var = new w0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                w0Var.f42133a = new u0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, w0Var);
        }
        return w0Var;
    }

    @Override
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        ph.e eVar = this.f42124a;
        a(windowInsetsAnimation);
        eVar.S0();
        this.d.remove(windowInsetsAnimation);
    }

    @Override
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        ph.e eVar = this.f42124a;
        a(windowInsetsAnimation);
        eVar.getClass();
    }

    @Override
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f42126c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f42126c = arrayList2;
            this.f42125b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            w0 a2 = a(windowInsetsAnimation);
            a2.f42133a.d(windowInsetsAnimation.getFraction());
            this.f42126c.add(a2);
        }
        ph.e eVar = this.f42124a;
        m1 h = m1.h(null, windowInsets);
        eVar.T0(h, this.f42125b);
        return h.g();
    }

    @Override
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        ph.e eVar = this.f42124a;
        a(windowInsetsAnimation);
        i0.b f7 = u0.f(bounds);
        i0.b e = u0.e(bounds);
        if (eVar.f41322c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((ph.d) it.next()).s();
            }
        }
        eVar.f41322c++;
        r0.c();
        return r0.a(f7.d(), e.d());
    }
}
