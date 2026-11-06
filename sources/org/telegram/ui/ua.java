package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final mb f50361a;
    public final ArrayList f50362b;
    public final ArrayList f50363c;
    public final ArrayList d;
    public final View f50364e;
    public final float f50365f;
    public final float h;

    public ua(mb mbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f50361a = mbVar;
        this.f50362b = arrayList;
        this.f50363c = arrayList2;
        this.d = arrayList3;
        this.f50364e = view;
        this.f50365f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        mb.a0(this.f50361a, this.f50362b, this.f50363c, this.d, this.f50364e, this.f50365f, this.h);
    }
}
