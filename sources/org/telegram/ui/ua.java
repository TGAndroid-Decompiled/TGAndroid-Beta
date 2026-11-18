package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final lb f52499a;
    public final ArrayList f52500b;
    public final ArrayList f52501c;
    public final ArrayList d;
    public final View f52502e;
    public final float f52503f;
    public final float h;

    public ua(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f52499a = lbVar;
        this.f52500b = arrayList;
        this.f52501c = arrayList2;
        this.d = arrayList3;
        this.f52502e = view;
        this.f52503f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        lb.a0(this.f52499a, this.f52500b, this.f52501c, this.d, this.f52502e, this.f52503f, this.h);
    }
}
