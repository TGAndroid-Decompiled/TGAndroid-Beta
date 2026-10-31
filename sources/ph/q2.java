package ph;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
public final class q2 implements rh.o2, o20 {
    public final r3 f45279a;

    @Override
    public void c(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        r3.Y(this.f45279a, tL_starGiftUnique, j10, z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        r3.c0(this.f45279a, (a51) obj);
    }
}
