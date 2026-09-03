package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class wi1 extends org.telegram.ui.Components.ql0 {
    public final Context f39712c;
    public final WallpapersListActivity d;

    public wi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f39712c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f32376a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.f32388r && i10 != wallpapersListActivity.f32378b && i10 != wallpapersListActivity.h) {
            if (i10 != wallpapersListActivity.f32380c && i10 != wallpapersListActivity.f32384f) {
                if (i10 != wallpapersListActivity.f32387n && i10 != wallpapersListActivity.f32389s) {
                    return 2;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wi1.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View n8Var;
        Context context = this.f39712c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    n8Var = new org.telegram.ui.Components.yi(this, context, 1);
                } else {
                    n8Var = new org.telegram.ui.Cells.z8(context);
                }
            } else {
                n8Var = new org.telegram.ui.Cells.y6(context, (b) null);
            }
        } else {
            n8Var = new org.telegram.ui.Cells.n8(context);
        }
        return new f2.l1(n8Var);
    }
}
