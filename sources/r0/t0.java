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

    public final yg.e f46634a;

    public List f46635b;

    public ArrayList f46636c;
    public final HashMap d;

    public t0(yg.e eVar) {
        super(0);
        this.d = new HashMap();
        this.f46634a = eVar;
    }

    public final w0 a(WindowInsetsAnimation windowInsetsAnimation) {
        w0 w0Var = (w0) this.d.get(windowInsetsAnimation);
        if (w0Var == null) {
            w0Var = new w0(0, 0L, null);
            if (Build.VERSION.SDK_INT >= 30) {
                w0Var.f46646a = new u0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, w0Var);
        }
        return w0Var;
    }

    @Override
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        yg.e eVar = this.f46634a;
        a(windowInsetsAnimation);
        eVar.L();
        this.d.remove(windowInsetsAnimation);
    }

    @Override
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        yg.e eVar = this.f46634a;
        a(windowInsetsAnimation);
        eVar.getClass();
    }

    @Override
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f46636c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f46636c = arrayList2;
            this.f46635b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            w0 w0VarA = a(windowInsetsAnimation);
            w0VarA.f46646a.d(windowInsetsAnimation.getFraction());
            this.f46636c.add(w0VarA);
        }
        yg.e eVar = this.f46634a;
        m1 m1VarH = m1.h(null, windowInsets);
        eVar.M(m1VarH, this.f46635b);
        return m1VarH.g();
    }

    @Override
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        yg.e eVar = this.f46634a;
        a(windowInsetsAnimation);
        i0.c cVarF = u0.f(bounds);
        i0.c cVarE = u0.e(bounds);
        if (eVar.f50151c == 0) {
            Iterator it = eVar.d.iterator();
            while (it.hasNext()) {
                ((yg.d) it.next()).u();
            }
        }
        eVar.f50151c++;
        s0.c();
        return s0.a(cVarF.d(), cVarE.d());
    }
}
