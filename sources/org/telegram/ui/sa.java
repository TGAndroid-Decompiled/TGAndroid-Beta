package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sa implements Runnable {
    public final vb f37350a;
    public final ArrayList f37351b;
    public final ArrayList f37352c;
    public final ArrayList d;
    public final View e;
    public final float f37353f;
    public final float h;

    public sa(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37350a = vbVar;
        this.f37351b = arrayList;
        this.f37352c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37353f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f37350a, this.f37351b, this.f37352c, this.d, this.e, this.f37353f, this.h);
    }
}
