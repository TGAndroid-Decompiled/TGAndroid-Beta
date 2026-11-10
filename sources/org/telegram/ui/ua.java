package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final mb f50441a;
    public final ArrayList f50442b;
    public final ArrayList f50443c;
    public final ArrayList d;
    public final View f50444e;
    public final float f50445f;
    public final float h;

    public ua(mb mbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f50441a = mbVar;
        this.f50442b = arrayList;
        this.f50443c = arrayList2;
        this.d = arrayList3;
        this.f50444e = view;
        this.f50445f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        mb.a0(this.f50441a, this.f50442b, this.f50443c, this.d, this.f50444e, this.f50445f, this.h);
    }
}
