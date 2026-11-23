package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final lb f52602a;
    public final ArrayList f52603b;
    public final ArrayList f52604c;
    public final ArrayList d;
    public final View f52605e;
    public final float f52606f;
    public final float h;

    public ua(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f52602a = lbVar;
        this.f52603b = arrayList;
        this.f52604c = arrayList2;
        this.d = arrayList3;
        this.f52605e = view;
        this.f52606f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        lb.a0(this.f52602a, this.f52603b, this.f52604c, this.d, this.f52605e, this.f52606f, this.h);
    }
}
