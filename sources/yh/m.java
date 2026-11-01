package yh;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.b51;
import r0.j1;
public final class m implements p20, r0.m {
    public final p f54512a;

    @Override
    public j1 R0(View view, j1 j1Var) {
        this.f54512a.a0(j1Var.f46143a.f(519).d);
        return j1.f46142b;
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        p.Z(this.f54512a, (b51) obj);
    }
}
