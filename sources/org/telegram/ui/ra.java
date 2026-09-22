package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final ub f37081a;
    public final ArrayList f37082b;
    public final ArrayList f37083c;
    public final ArrayList d;
    public final View e;
    public final float f37084f;
    public final float h;

    public ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37081a = ubVar;
        this.f37082b = arrayList;
        this.f37083c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37084f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f37081a, this.f37082b, this.f37083c, this.d, this.e, this.f37084f, this.h);
    }
}
