package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final lb f52504a;
    public final ArrayList f52505b;
    public final ArrayList f52506c;
    public final ArrayList d;
    public final View f52507e;
    public final float f52508f;
    public final float h;

    public ua(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f52504a = lbVar;
        this.f52505b = arrayList;
        this.f52506c = arrayList2;
        this.d = arrayList3;
        this.f52507e = view;
        this.f52508f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        lb.a0(this.f52504a, this.f52505b, this.f52506c, this.d, this.f52507e, this.f52508f, this.h);
    }
}
