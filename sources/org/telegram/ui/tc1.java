package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class tc1 extends org.telegram.ui.Components.dk0 {
    public final Context f52250c;
    public final WallpapersListActivity d;

    public tc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f52250c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f45388a;
    }

    @Override
    public final int d(int i7) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i7 != i10 && i7 != wallpapersListActivity.h && i7 != wallpapersListActivity.f45390b && i7 != wallpapersListActivity.f45395e) {
            if (i7 != wallpapersListActivity.f45397f && i7 != wallpapersListActivity.f45400n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tc1.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View n8Var;
        Context context = this.f52250c;
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
        return new v4.e1(n8Var);
    }
}
