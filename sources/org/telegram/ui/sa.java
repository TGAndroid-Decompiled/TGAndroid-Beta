package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sa implements Runnable {
    public final ub f40364a;
    public final ArrayList f40365b;
    public final ArrayList f40366c;
    public final ArrayList d;
    public final View f40367e;
    public final float f40368f;
    public final float h;

    public sa(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f40364a = ubVar;
        this.f40365b = arrayList;
        this.f40366c = arrayList2;
        this.d = arrayList3;
        this.f40367e = view;
        this.f40368f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f40364a, this.f40365b, this.f40366c, this.d, this.f40367e, this.f40368f, this.h);
    }
}
