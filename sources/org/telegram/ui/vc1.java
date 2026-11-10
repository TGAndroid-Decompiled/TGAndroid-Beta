package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class vc1 extends org.telegram.ui.Components.oj0 {
    public final Context f50702c;
    public final WallpapersListActivity d;

    public vc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f50702c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f43490a;
    }

    @Override
    public final int d(int i7) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i7 != i10 && i7 != wallpapersListActivity.h && i7 != wallpapersListActivity.f43492b && i7 != wallpapersListActivity.f43497e) {
            if (i7 != wallpapersListActivity.f43499f && i7 != wallpapersListActivity.f43501n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc1.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View m8Var;
        Context context = this.f50702c;
        if (i7 != 0) {
            if (i7 != 3) {
                m8Var = new org.telegram.ui.Components.oi(this, context, 1);
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
