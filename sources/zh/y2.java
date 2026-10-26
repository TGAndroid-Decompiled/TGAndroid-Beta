package zh;

import android.view.View;
import bi.i5;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.t61;
public final class y2 implements i5, Utilities.Callback5, Utilities.Callback5Return {
    public final h4 f53332a;

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        h4.V(this.f53332a, tL_starGiftUnique, j10, z10);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        t61 t61Var = (t61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f53332a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        h4.Z(this.f53332a, (t61) obj);
    }
}
