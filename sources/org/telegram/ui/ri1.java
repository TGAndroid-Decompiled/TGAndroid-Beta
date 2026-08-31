package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ri1 extends org.telegram.ui.Components.sl0 {
    public final Context f40973c;
    public final WallpapersListActivity d;

    public ri1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f40973c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f34946a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.f34959r && i10 != wallpapersListActivity.f34948b && i10 != wallpapersListActivity.h) {
            if (i10 != wallpapersListActivity.f34950c && i10 != wallpapersListActivity.f34955f) {
                if (i10 != wallpapersListActivity.f34958n && i10 != wallpapersListActivity.f34960s) {
                    return 2;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ri1.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View o8Var;
        Context context = this.f40973c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    o8Var = new org.telegram.ui.Components.aj(this, context, 1);
                } else {
                    o8Var = new org.telegram.ui.Cells.a9(context);
                }
            } else {
                o8Var = new org.telegram.ui.Cells.z6(context, (b) null);
            }
        } else {
            o8Var = new org.telegram.ui.Cells.o8(context);
        }
        return new f2.m1(o8Var);
    }
}
