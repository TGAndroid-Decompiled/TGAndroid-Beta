package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class uh1 extends org.telegram.ui.Components.hm0 {
    public final Context f41990c;
    public final WallpapersListActivity d;

    public uh1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f41990c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45913f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f35202a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.f35217r && i10 != wallpapersListActivity.f35204b && i10 != wallpapersListActivity.h) {
            if (i10 != wallpapersListActivity.f35206c && i10 != wallpapersListActivity.f35210f) {
                if (i10 != wallpapersListActivity.f35216n && i10 != wallpapersListActivity.f35218s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uh1.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View q8Var;
        Context context = this.f41990c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    q8Var = new org.telegram.ui.Components.hj(this, context, 1);
                } else {
                    q8Var = new org.telegram.ui.Cells.d9(context);
                }
            } else {
                q8Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
            }
        } else {
            q8Var = new org.telegram.ui.Cells.q8(context);
        }
        return new s4.b1(q8Var);
    }
}
