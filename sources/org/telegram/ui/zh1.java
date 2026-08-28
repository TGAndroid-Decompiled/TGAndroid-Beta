package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class zh1 extends org.telegram.ui.Components.vk0 {
    public final Context f45161c;
    public final WallpapersListActivity d;

    public zh1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f45161c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f36301a;
    }

    @Override
    public final int j(int i9) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i9 != i10 && i9 != wallpapersListActivity.f36313r && i9 != wallpapersListActivity.f36303b && i9 != wallpapersListActivity.h) {
            if (i9 != wallpapersListActivity.f36305c && i9 != wallpapersListActivity.f36310f) {
                if (i9 != wallpapersListActivity.f36312n && i9 != wallpapersListActivity.f36314s) {
                    return 2;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zh1.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View p8Var;
        Context context = this.f45161c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 3) {
                    p8Var = new org.telegram.ui.Components.xi(this, context, 1);
                } else {
                    p8Var = new org.telegram.ui.Cells.b9(context);
                }
            } else {
                p8Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
            }
        } else {
            p8Var = new org.telegram.ui.Cells.p8(context);
        }
        return new f2.q1(p8Var);
    }
}
