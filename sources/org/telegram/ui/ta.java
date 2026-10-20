package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final vb f41626a;
    public final ArrayList f41627b;
    public final ArrayList f41628c;
    public final ArrayList d;
    public final View e;
    public final float f41629f;
    public final float h;

    public ta(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41626a = vbVar;
        this.f41627b = arrayList;
        this.f41628c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f41629f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f41626a, this.f41627b, this.f41628c, this.d, this.e, this.f41629f, this.h);
    }
}
