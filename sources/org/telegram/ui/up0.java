package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class up0 extends org.telegram.ui.Components.rl0 {
    public final Context f41901c;
    public final wp0 d;

    public up0(wp0 wp0Var, Context context) {
        this.d = wp0Var;
        this.f41901c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        wp0 wp0Var = this.d;
        ArrayList arrayList = wp0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / wp0Var.f42836f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) m1Var.f5875a;
        wp0 wp0Var = this.d;
        y5Var.setAlbumsCount(wp0Var.f42836f);
        int i11 = 0;
        while (true) {
            int i12 = wp0Var.f42836f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < wp0Var.d.size()) {
                    y5Var.a(i11, (MediaController.AlbumEntry) wp0Var.d.get(i13));
                } else {
                    y5Var.a(i11, null);
                }
                i11++;
            } else {
                y5Var.requestLayout();
                return;
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f41901c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f24446e = new Paint();
        frameLayout.f24444b = new MediaController.AlbumEntry[4];
        frameLayout.f24443a = new org.telegram.ui.Cells.w5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f24443a[i11] = new org.telegram.ui.Cells.w5(frameLayout, context);
            frameLayout.addView(frameLayout.f24443a[i11]);
            frameLayout.f24443a[i11].setVisibility(4);
            frameLayout.f24443a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f24443a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new kl0(this, 1));
        return new f2.m1(frameLayout);
    }
}
