package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final kb f49751a;
    public final ArrayList f49752b;
    public final ArrayList f49753c;
    public final ArrayList d;
    public final View f49754e;
    public final float f49755f;
    public final float h;

    public ta(kb kbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f49751a = kbVar;
        this.f49752b = arrayList;
        this.f49753c = arrayList2;
        this.d = arrayList3;
        this.f49754e = view;
        this.f49755f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        kb.a0(this.f49751a, this.f49752b, this.f49753c, this.d, this.f49754e, this.f49755f, this.h);
    }
}
