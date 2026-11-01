package yh;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.as;
import org.telegram.messenger.at;
import org.telegram.messenger.p20;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.b51;
import r0.j1;
public final class i implements p20, q20, r0.m, as {
    public final l f54499a;

    public i(l lVar) {
        this.f54499a = lVar;
    }

    @Override
    public j1 R0(View view, j1 j1Var) {
        i0.c f7 = j1Var.f46143a.f(519);
        this.f54499a.e.setPadding(0, f7.f7767b, 0, f7.d);
        return j1.f46142b;
    }

    @Override
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(l.Z(this.f54499a, b51Var, view));
    }

    @Override
    public void i(boolean z10) {
        l lVar = this.f54499a;
        lVar.finishFragment();
        lVar.getNotificationCenter().k(at.K2, Long.valueOf(-lVar.f54504c), null, lVar.I, Boolean.valueOf(z10));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        l.a0(this.f54499a, (b51) obj);
    }
}
