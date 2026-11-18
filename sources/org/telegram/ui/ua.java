package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final lb f52490a;
    public final ArrayList f52491b;
    public final ArrayList f52492c;
    public final ArrayList d;
    public final View f52493e;
    public final float f52494f;
    public final float h;

    public ua(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f52490a = lbVar;
        this.f52491b = arrayList;
        this.f52492c = arrayList2;
        this.d = arrayList3;
        this.f52493e = view;
        this.f52494f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        lb.a0(this.f52490a, this.f52491b, this.f52492c, this.d, this.f52493e, this.f52494f, this.h);
    }
}
