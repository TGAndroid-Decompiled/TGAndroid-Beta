package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final mb f50339a;
    public final ArrayList f50340b;
    public final ArrayList f50341c;
    public final ArrayList d;
    public final View f50342e;
    public final float f50343f;
    public final float h;

    public ua(mb mbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f50339a = mbVar;
        this.f50340b = arrayList;
        this.f50341c = arrayList2;
        this.d = arrayList3;
        this.f50342e = view;
        this.f50343f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        mb.a0(this.f50339a, this.f50340b, this.f50341c, this.d, this.f50342e, this.f50343f, this.h);
    }
}
