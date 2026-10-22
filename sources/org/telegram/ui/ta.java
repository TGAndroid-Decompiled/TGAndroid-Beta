package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final vb f41629a;
    public final ArrayList f41630b;
    public final ArrayList f41631c;
    public final ArrayList d;
    public final View e;
    public final float f41632f;
    public final float h;

    public ta(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41629a = vbVar;
        this.f41630b = arrayList;
        this.f41631c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f41632f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f41629a, this.f41630b, this.f41631c, this.d, this.e, this.f41632f, this.h);
    }
}
