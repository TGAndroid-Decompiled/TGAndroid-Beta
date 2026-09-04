package yh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
public final class x2 implements zh.j2, Utilities.Callback5, Utilities.Callback5Return {
    public final g4 f50625a;

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        g4.U(this.f50625a, tL_starGiftUnique, j3, z10);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f50625a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g4.Y(this.f50625a, (h51) obj);
    }
}
