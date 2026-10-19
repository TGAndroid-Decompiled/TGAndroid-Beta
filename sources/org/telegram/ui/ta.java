package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final vb f41621a;
    public final ArrayList f41622b;
    public final ArrayList f41623c;
    public final ArrayList d;
    public final View e;
    public final float f41624f;
    public final float h;

    public ta(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41621a = vbVar;
        this.f41622b = arrayList;
        this.f41623c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f41624f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f41621a, this.f41622b, this.f41623c, this.d, this.e, this.f41624f, this.h);
    }
}
