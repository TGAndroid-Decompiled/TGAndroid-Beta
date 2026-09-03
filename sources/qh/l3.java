package qh;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h61;
public final class l3 extends h61 {
    public final t8 c3;

    public l3(t8 t8Var, Context context, int i10, k3 k3Var, mh.m5 m5Var, oh.b bVar) {
        super(context, i10, 0, false, k3Var, m5Var, null, bVar, -1, 0);
        this.c3 = t8Var;
    }

    @Override
    public final void G1() {
        AndroidUtilities.forEachViews((RecyclerView) this.c3.f45914b, (h5.d) new ng.i(this, 5));
    }

    @Override
    public final Integer V0(int i10) {
        return 0;
    }
}
