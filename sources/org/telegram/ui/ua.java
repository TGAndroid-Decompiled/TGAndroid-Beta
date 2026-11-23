package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final lb f52508a;
    public final ArrayList f52509b;
    public final ArrayList f52510c;
    public final ArrayList d;
    public final View f52511e;
    public final float f52512f;
    public final float h;

    public ua(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f52508a = lbVar;
        this.f52509b = arrayList;
        this.f52510c = arrayList2;
        this.d = arrayList3;
        this.f52511e = view;
        this.f52512f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        lb.a0(this.f52508a, this.f52509b, this.f52510c, this.d, this.f52511e, this.f52512f, this.h);
    }
}
