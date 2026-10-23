package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final vb f41630a;
    public final ArrayList f41631b;
    public final ArrayList f41632c;
    public final ArrayList d;
    public final View e;
    public final float f41633f;
    public final float h;

    public ta(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41630a = vbVar;
        this.f41631b = arrayList;
        this.f41632c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f41633f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f41630a, this.f41631b, this.f41632c, this.d, this.e, this.f41633f, this.h);
    }
}
