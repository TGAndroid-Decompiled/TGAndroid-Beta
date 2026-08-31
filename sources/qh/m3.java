package qh;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i61;
public final class m3 extends i61 {
    public final u8 c3;

    public m3(u8 u8Var, Context context, int i10, l3 l3Var, mh.m5 m5Var, oh.b bVar) {
        super(context, i10, 0, false, l3Var, m5Var, null, bVar, -1, 0);
        this.c3 = u8Var;
    }

    @Override
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.c3.f45935b, (h5.d) new ng.i(this, 5));
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }
}
