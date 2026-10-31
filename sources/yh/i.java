package yh;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.messenger.p20;
import org.telegram.messenger.zr;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.a51;
import r0.j1;
public final class i implements o20, p20, r0.m, zr {
    public final l f54495a;

    public i(l lVar) {
        this.f54495a = lVar;
    }

    @Override
    public j1 R0(View view, j1 j1Var) {
        i0.c f7 = j1Var.f46132a.f(519);
        this.f54495a.e.setPadding(0, f7.f7766b, 0, f7.d);
        return j1.f46131b;
    }

    @Override
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(l.Y(this.f54495a, a51Var, view));
    }

    @Override
    public void i(boolean z10) {
        l lVar = this.f54495a;
        lVar.finishFragment();
        lVar.getNotificationCenter().k(zs.K2, Long.valueOf(-lVar.f54500c), null, lVar.I, Boolean.valueOf(z10));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        l.Z(this.f54495a, (a51) obj);
    }
}
