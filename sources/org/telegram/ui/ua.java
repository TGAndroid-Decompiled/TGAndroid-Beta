package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final wb f43951a;
    public final ArrayList f43952b;
    public final ArrayList f43953c;
    public final ArrayList d;
    public final View e;
    public final float f43954f;
    public final float h;

    public ua(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f43951a = wbVar;
        this.f43952b = arrayList;
        this.f43953c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f43954f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.W(this.f43951a, this.f43952b, this.f43953c, this.d, this.e, this.f43954f, this.h);
    }
}
