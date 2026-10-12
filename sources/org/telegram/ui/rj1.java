package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class rj1 extends org.telegram.ui.Components.lm0 {
    public final Context f39816c;
    public final WallpapersListActivity d;

    public rj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f39816c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f33975a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.f33990r && i10 != wallpapersListActivity.f33977b && i10 != wallpapersListActivity.h) {
            if (i10 != wallpapersListActivity.f33979c && i10 != wallpapersListActivity.f33983f) {
                if (i10 != wallpapersListActivity.f33989n && i10 != wallpapersListActivity.f33991s) {
                    return 2;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rj1.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View r8Var;
        Context context = this.f39816c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    r8Var = new org.telegram.ui.Components.jj(this, context, 1);
                } else {
                    r8Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                r8Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
            }
        } else {
            r8Var = new org.telegram.ui.Cells.r8(context);
        }
        return new s4.b1(r8Var);
    }
}
