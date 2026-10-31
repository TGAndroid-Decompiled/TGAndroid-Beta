package yh;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.ui.Components.a51;
import r0.j1;
public final class m implements o20, r0.m {
    public final q f54508a;

    @Override
    public j1 R0(View view, j1 j1Var) {
        this.f54508a.Z(j1Var.f46132a.f(519).d);
        return j1.f46131b;
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        q.Y(this.f54508a, (a51) obj);
    }
}
