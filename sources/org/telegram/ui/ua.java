package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final lb f51886a;
    public final ArrayList f51887b;
    public final ArrayList f51888c;
    public final ArrayList d;
    public final View f51889e;
    public final float f51890f;
    public final float h;

    public ua(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f51886a = lbVar;
        this.f51887b = arrayList;
        this.f51888c = arrayList2;
        this.d = arrayList3;
        this.f51889e = view;
        this.f51890f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        lb.a0(this.f51886a, this.f51887b, this.f51888c, this.d, this.f51889e, this.f51890f, this.h);
    }
}
