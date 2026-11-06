package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final mb f50360a;
    public final ArrayList f50361b;
    public final ArrayList f50362c;
    public final ArrayList d;
    public final View f50363e;
    public final float f50364f;
    public final float h;

    public ua(mb mbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f50360a = mbVar;
        this.f50361b = arrayList;
        this.f50362c = arrayList2;
        this.d = arrayList3;
        this.f50363e = view;
        this.f50364f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        mb.a0(this.f50360a, this.f50361b, this.f50362c, this.d, this.f50363e, this.f50364f, this.h);
    }
}
