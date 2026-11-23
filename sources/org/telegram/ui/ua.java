package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final lb f52496a;
    public final ArrayList f52497b;
    public final ArrayList f52498c;
    public final ArrayList d;
    public final View f52499e;
    public final float f52500f;
    public final float h;

    public ua(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f52496a = lbVar;
        this.f52497b = arrayList;
        this.f52498c = arrayList2;
        this.d = arrayList3;
        this.f52499e = view;
        this.f52500f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        lb.a0(this.f52496a, this.f52497b, this.f52498c, this.d, this.f52499e, this.f52500f, this.h);
    }
}
