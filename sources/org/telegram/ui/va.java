package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class va implements Runnable {
    public final yb f42735a;
    public final ArrayList f42736b;
    public final ArrayList f42737c;
    public final ArrayList d;
    public final View f42738e;
    public final float f42739f;
    public final float h;

    public va(yb ybVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f42735a = ybVar;
        this.f42736b = arrayList;
        this.f42737c = arrayList2;
        this.d = arrayList3;
        this.f42738e = view;
        this.f42739f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        yb.V(this.f42735a, this.f42736b, this.f42737c, this.d, this.f42738e, this.f42739f, this.h);
    }
}
