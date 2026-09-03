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
    public final dh.e f46498a;
    public List f46499b;
    public ArrayList f46500c;
    public final HashMap d;

    public t0(dh.e eVar) {
        super(0);
        this.d = new HashMap();
        this.f46498a = eVar;
    }

    public final w0 a(WindowInsetsAnimation windowInsetsAnimation) {
        w0 w0Var = (w0) this.d.get(windowInsetsAnimation);
        if (w0Var == null) {
            w0Var = new w0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                w0Var.f46510a = new u0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, w0Var);
        }
        return w0Var;
    }

    @Override
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        dh.e eVar = this.f46498a;
        a(windowInsetsAnimation);
        eVar.H();
        this.d.remove(windowInsetsAnimation);
    }

    @Override
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        dh.e eVar = this.f46498a;
        a(windowInsetsAnimation);
        eVar.getClass();
    }

    @Override
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f46500c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f46500c = arrayList2;
            this.f46499b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            w0 a2 = a(windowInsetsAnimation);
            a2.f46510a.d(windowInsetsAnimation.getFraction());
            this.f46500c.add(a2);
        }
        dh.e eVar = this.f46498a;
        m1 h = m1.h(null, windowInsets);
        eVar.I(h, this.f46499b);
        return h.g();
    }

    @Override
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        dh.e eVar = this.f46498a;
        a(windowInsetsAnimation);
        i0.b f10 = u0.f(bounds);
        i0.b e6 = u0.e(bounds);
        if (eVar.f4754c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((dh.d) it.next()).t();
            }
        }
        eVar.f4754c++;
        s0.c();
        return s0.a(f10.d(), e6.d());
    }
}
