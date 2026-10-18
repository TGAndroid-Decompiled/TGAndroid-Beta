package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class sp0 extends org.telegram.ui.Components.hm0 {
    public final Context f41502c;
    public final up0 d;

    public sp0(up0 up0Var, Context context) {
        this.d = up0Var;
        this.f41502c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        up0 up0Var = this.d;
        ArrayList arrayList = up0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / up0Var.f42044f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) b1Var.f45958a;
        up0 up0Var = this.d;
        x5Var.setAlbumsCount(up0Var.f42044f);
        int i11 = 0;
        while (true) {
            int i12 = up0Var.f42044f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < up0Var.d.size()) {
                    x5Var.a(i11, (MediaController.AlbumEntry) up0Var.d.get(i13));
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f41502c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.e = new Paint();
        frameLayout.f23807b = new MediaController.AlbumEntry[4];
        frameLayout.f23806a = new org.telegram.ui.Cells.v5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f23806a[i11] = new org.telegram.ui.Cells.v5(frameLayout, context);
            frameLayout.addView(frameLayout.f23806a[i11]);
            frameLayout.f23806a[i11].setVisibility(4);
            frameLayout.f23806a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f23806a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new rp0(this, 0));
        return new s4.b1(frameLayout);
    }
}
