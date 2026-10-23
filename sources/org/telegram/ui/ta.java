package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final vb f41932a;
    public final ArrayList f41933b;
    public final ArrayList f41934c;
    public final ArrayList d;
    public final View e;
    public final float f41935f;
    public final float h;

    public ta(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41932a = vbVar;
        this.f41933b = arrayList;
        this.f41934c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f41935f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f41932a, this.f41933b, this.f41934c, this.d, this.e, this.f41935f, this.h);
    }
}
