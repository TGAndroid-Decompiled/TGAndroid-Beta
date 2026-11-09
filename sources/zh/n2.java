package zh;

import android.view.View;
import bi.l5;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.y31;
public final class n2 implements l5, a20 {
    public final m3 f60487a;

    public n2(m3 m3Var) {
        this.f60487a = m3Var;
    }

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z9) {
        m3.b0(this.f60487a, tL_starGiftUnique, j3, z9);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        m3.e0(this.f60487a, (y31) obj);
    }
}
