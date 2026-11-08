package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final mb f50276a;
    public final ArrayList f50277b;
    public final ArrayList f50278c;
    public final ArrayList d;
    public final View f50279e;
    public final float f50280f;
    public final float h;

    public ua(mb mbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f50276a = mbVar;
        this.f50277b = arrayList;
        this.f50278c = arrayList2;
        this.d = arrayList3;
        this.f50279e = view;
        this.f50280f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        mb.a0(this.f50276a, this.f50277b, this.f50278c, this.d, this.f50279e, this.f50280f, this.h);
    }
}
