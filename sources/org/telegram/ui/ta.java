package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final ub f38439a;
    public final ArrayList f38440b;
    public final ArrayList f38441c;
    public final ArrayList d;
    public final View e;
    public final float f38442f;
    public final float h;

    public ta(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f38439a = ubVar;
        this.f38440b = arrayList;
        this.f38441c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f38442f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        ub.V(this.f38439a, this.f38440b, this.f38441c, this.d, this.e, this.f38442f, this.h);
    }
}
