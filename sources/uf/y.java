package uf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.ui.Components.ej;
public final class y extends f2.j0 {
    public final ej f45479r;

    public y(ej ejVar, Context context) {
        super(context);
        this.f45479r = ejVar;
    }

    @Override
    public final int k(int i10, View view) {
        return y3.z(8.0f, ((c0) this.f45479r.V).f45269s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
