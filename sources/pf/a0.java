package pf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dj;
public final class a0 extends f2.n0 {
    public final dj f45558r;

    public a0(dj djVar, Context context) {
        super(context);
        this.f45558r = djVar;
    }

    @Override
    public final int k(int i9, View view) {
        return org.telegram.messenger.l0.A(8.0f, ((e0) this.f45558r.V).f45609s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i9, view));
    }

    @Override
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
