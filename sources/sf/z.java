package sf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.gj;
public final class z extends f2.k0 {
    public final gj f48011r;

    public z(gj gjVar, Context context) {
        super(context);
        this.f48011r = gjVar;
    }

    @Override
    public final int k(int i10, View view) {
        return x3.z(8.0f, ((d0) this.f48011r.V).f47776s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
