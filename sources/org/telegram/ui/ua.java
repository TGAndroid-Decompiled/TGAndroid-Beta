package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final mb f50345a;
    public final ArrayList f50346b;
    public final ArrayList f50347c;
    public final ArrayList d;
    public final View f50348e;
    public final float f50349f;
    public final float h;

    public ua(mb mbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f50345a = mbVar;
        this.f50346b = arrayList;
        this.f50347c = arrayList2;
        this.d = arrayList3;
        this.f50348e = view;
        this.f50349f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        mb.a0(this.f50345a, this.f50346b, this.f50347c, this.d, this.f50348e, this.f50349f, this.h);
    }
}
