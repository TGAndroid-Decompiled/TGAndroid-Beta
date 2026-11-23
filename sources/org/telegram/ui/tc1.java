package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class tc1 extends org.telegram.ui.Components.dk0 {
    public final Context f52304c;
    public final WallpapersListActivity d;

    public tc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f52304c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59169f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f45423a;
    }

    @Override
    public final int d(int i7) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i7 != i10 && i7 != wallpapersListActivity.h && i7 != wallpapersListActivity.f45425b && i7 != wallpapersListActivity.f45430e) {
            if (i7 != wallpapersListActivity.f45432f && i7 != wallpapersListActivity.f45435n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tc1.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View n8Var;
        Context context = this.f52304c;
        if (i7 != 0) {
            if (i7 != 3) {
                n8Var = new org.telegram.ui.Components.gj(this, context, 1);
                n8Var.setTag(-33024);
            } else {
                n8Var = new org.telegram.ui.Cells.a9(context);
            }
        } else {
            n8Var = new org.telegram.ui.Cells.n8(context);
        }
        return new v4.f1(n8Var);
    }
}
