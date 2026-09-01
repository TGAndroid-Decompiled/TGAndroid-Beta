package vf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.ui.Components.gj;
public final class y extends f2.k0 {
    public final gj f49241r;

    public y(gj gjVar, Context context) {
        super(context);
        this.f49241r = gjVar;
    }

    @Override
    public final int k(int i10, View view) {
        return y3.z(8.0f, ((c0) this.f49241r.V).f49010s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
