package wh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v51;
public final class x2 implements xh.k2, Utilities.Callback5, Utilities.Callback5Return {
    public final h4 f44428a;

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        h4.U(this.f44428a, tL_starGiftUnique, j3, z10);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f44428a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        h4.Y(this.f44428a, (v51) obj);
    }
}
