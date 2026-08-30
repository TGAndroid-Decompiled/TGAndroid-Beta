package ph;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g61;
public final class m3 extends g61 {
    public final w8 c3;

    public m3(w8 w8Var, Context context, int i10, l3 l3Var, lh.m5 m5Var, nh.b bVar) {
        super(context, i10, 0, false, l3Var, m5Var, null, bVar, -1, 0);
        this.c3 = w8Var;
    }

    @Override
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.c3.f42240b, (h5.d) new mg.i(this, 5));
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }
}
