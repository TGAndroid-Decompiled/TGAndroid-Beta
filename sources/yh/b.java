package yh;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.fs;
import org.telegram.messenger.o20;
import org.telegram.ui.Components.a51;
import rh.e3;
public final class b implements o20, fs {
    public final e f54458a;

    @Override
    public void a(String str) {
        e eVar = this.f54458a;
        eVar.getMessagesController().L0(Long.valueOf(-eVar.f54468b));
        eVar.showDialog(new ai.a(eVar.getParentActivity(), null, eVar.f54468b, new e3(16, eVar, str)));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        e.Y(this.f54458a, (a51) obj);
    }
}
