package yh;

import ai.n5;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h61;
public final class w2 implements n5, Utilities.Callback5, Utilities.Callback5Return {
    public final g4 f50576a;

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        g4.U(this.f50576a, tL_starGiftUnique, j10, z10);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h61 h61Var = (h61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f50576a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g4.Y(this.f50576a, (h61) obj);
    }
}
