package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class rc1 extends org.telegram.ui.Components.oj0 {
    public final Context f49470c;
    public final WallpapersListActivity d;

    public rc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f49470c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57047f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f43484a;
    }

    @Override
    public final int d(int i7) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i7 != i10 && i7 != wallpapersListActivity.h && i7 != wallpapersListActivity.f43486b && i7 != wallpapersListActivity.f43491e) {
            if (i7 != wallpapersListActivity.f43493f && i7 != wallpapersListActivity.f43495n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rc1.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View m8Var;
        Context context = this.f49470c;
        if (i7 != 0) {
            if (i7 != 3) {
                m8Var = new org.telegram.ui.Components.pi(this, context, 1);
                m8Var.setTag(-33024);
            } else {
                m8Var = new org.telegram.ui.Cells.z8(context);
            }
        } else {
            m8Var = new org.telegram.ui.Cells.m8(context);
        }
        return new v4.d1(m8Var);
    }
}
