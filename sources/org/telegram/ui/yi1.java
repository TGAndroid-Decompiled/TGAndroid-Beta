package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class yi1 extends org.telegram.ui.Components.yl0 {
    public final Context f43242c;
    public final WallpapersListActivity d;

    public yi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f43242c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46542f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f34617a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.h && i10 != wallpapersListActivity.f34619b && i10 != wallpapersListActivity.f34624e) {
            if (i10 != wallpapersListActivity.f34626f && i10 != wallpapersListActivity.f34630n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yi1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View r8Var;
        Context context = this.f43242c;
        if (i10 != 0) {
            if (i10 != 3) {
                r8Var = new org.telegram.ui.Components.lj(this, context, 1);
                r8Var.setTag(-33024);
            } else {
                r8Var = new org.telegram.ui.Cells.e9(context);
            }
        } else {
            r8Var = new org.telegram.ui.Cells.r8(context);
        }
        return new s4.c1(r8Var);
    }
}
