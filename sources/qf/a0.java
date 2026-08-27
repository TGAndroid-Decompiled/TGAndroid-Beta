package qf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y1;
import org.telegram.ui.Components.zi;

public final class a0 extends f2.l0 {

    public final zi f46229r;

    public a0(zi ziVar, Context context) {
        super(context);
        this.f46229r = ziVar;
    }

    @Override
    public final int k(int i10, View view) {
        return y1.A(8.0f, ((e0) this.f46229r.V).f46280s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
