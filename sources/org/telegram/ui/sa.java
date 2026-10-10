package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sa implements Runnable {
    public final vb f41691a;
    public final ArrayList f41692b;
    public final ArrayList f41693c;
    public final ArrayList d;
    public final View f41694e;
    public final float f41695f;
    public final float h;

    public sa(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41691a = vbVar;
        this.f41692b = arrayList;
        this.f41693c = arrayList2;
        this.d = arrayList3;
        this.f41694e = view;
        this.f41695f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f41691a, this.f41692b, this.f41693c, this.d, this.f41694e, this.f41695f, this.h);
    }
}
