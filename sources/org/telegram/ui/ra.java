package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final ub f37272a;
    public final ArrayList f37273b;
    public final ArrayList f37274c;
    public final ArrayList d;
    public final View e;
    public final float f37275f;
    public final float h;

    public ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37272a = ubVar;
        this.f37273b = arrayList;
        this.f37274c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37275f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f37272a, this.f37273b, this.f37274c, this.d, this.e, this.f37275f, this.h);
    }
}
