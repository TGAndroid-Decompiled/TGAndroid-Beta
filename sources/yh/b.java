package yh;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.gs;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.b51;
import rh.q2;
public final class b implements p20, gs {
    public final e f54462a;

    @Override
    public void a(String str) {
        e eVar = this.f54462a;
        eVar.getMessagesController().L0(Long.valueOf(-eVar.f54487b));
        eVar.showDialog(new ai.a(eVar.getParentActivity(), null, eVar.f54487b, new q2(17, eVar, str)));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        e.Z(this.f54462a, (b51) obj);
    }
}
