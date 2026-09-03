package ph;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g61;
public final class m3 extends g61 {
    public final v8 c3;

    public m3(v8 v8Var, Context context, int i10, l3 l3Var, lh.m5 m5Var, nh.b bVar) {
        super(context, i10, 0, false, l3Var, m5Var, null, bVar, -1, 0);
        this.c3 = v8Var;
    }

    @Override
    public final void G1() {
        AndroidUtilities.forEachViews((RecyclerView) this.c3.f42276b, (h5.d) new mg.i(this, 5));
    }

    @Override
    public final Integer V0(int i10) {
        return 0;
    }
}
