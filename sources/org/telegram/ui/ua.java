package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final lb f51885a;
    public final ArrayList f51886b;
    public final ArrayList f51887c;
    public final ArrayList d;
    public final View f51888e;
    public final float f51889f;
    public final float h;

    public ua(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f51885a = lbVar;
        this.f51886b = arrayList;
        this.f51887c = arrayList2;
        this.d = arrayList3;
        this.f51888e = view;
        this.f51889f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        lb.a0(this.f51885a, this.f51886b, this.f51887c, this.d, this.f51888e, this.f51889f, this.h);
    }
}
