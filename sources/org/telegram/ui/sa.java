package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sa implements Runnable {
    public final ub f40365a;
    public final ArrayList f40366b;
    public final ArrayList f40367c;
    public final ArrayList d;
    public final View f40368e;
    public final float f40369f;
    public final float h;

    public sa(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f40365a = ubVar;
        this.f40366b = arrayList;
        this.f40367c = arrayList2;
        this.d = arrayList3;
        this.f40368e = view;
        this.f40369f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f40365a, this.f40366b, this.f40367c, this.d, this.f40368e, this.f40369f, this.h);
    }
}
