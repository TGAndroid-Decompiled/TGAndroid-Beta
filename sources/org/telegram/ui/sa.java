package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sa implements Runnable {
    public final ub f40392a;
    public final ArrayList f40393b;
    public final ArrayList f40394c;
    public final ArrayList d;
    public final View f40395e;
    public final float f40396f;
    public final float h;

    public sa(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f40392a = ubVar;
        this.f40393b = arrayList;
        this.f40394c = arrayList2;
        this.d = arrayList3;
        this.f40395e = view;
        this.f40396f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f40392a, this.f40393b, this.f40394c, this.d, this.f40395e, this.f40396f, this.h);
    }
}
