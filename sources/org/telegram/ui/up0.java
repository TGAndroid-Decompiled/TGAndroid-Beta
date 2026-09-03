package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class up0 extends org.telegram.ui.Components.ql0 {
    public final Context f38899c;
    public final wp0 d;

    public up0(wp0 wp0Var, Context context) {
        this.d = wp0Var;
        this.f38899c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        wp0 wp0Var = this.d;
        ArrayList arrayList = wp0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / wp0Var.f39750f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) l1Var.f5774a;
        wp0 wp0Var = this.d;
        x5Var.setAlbumsCount(wp0Var.f39750f);
        int i11 = 0;
        while (true) {
            int i12 = wp0Var.f39750f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < wp0Var.d.size()) {
                    x5Var.a(i11, (MediaController.AlbumEntry) wp0Var.d.get(i13));
                } else {
                    x5Var.a(i11, null);
                }
                i11++;
            } else {
                x5Var.requestLayout();
                return;
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38899c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.e = new Paint();
        frameLayout.f22546b = new MediaController.AlbumEntry[4];
        frameLayout.f22545a = new org.telegram.ui.Cells.v5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f22545a[i11] = new org.telegram.ui.Cells.v5(frameLayout, context);
            frameLayout.addView(frameLayout.f22545a[i11]);
            frameLayout.f22545a[i11].setVisibility(4);
            frameLayout.f22545a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f22545a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new kl0(this, 1));
        return new f2.l1(frameLayout);
    }
}
