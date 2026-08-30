package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final sb f37955a;
    public final ArrayList f37956b;
    public final ArrayList f37957c;
    public final ArrayList d;
    public final View e;
    public final float f37958f;
    public final float h;

    public ra(sb sbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f37955a = sbVar;
        this.f37956b = arrayList;
        this.f37957c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37958f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        sb.V(this.f37955a, this.f37956b, this.f37957c, this.d, this.e, this.f37958f, this.h);
    }
}
