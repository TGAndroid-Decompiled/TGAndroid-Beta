package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class tp0 extends org.telegram.ui.Components.lm0 {
    public final Context f42059c;
    public final vp0 d;

    public tp0(vp0 vp0Var, Context context) {
        this.d = vp0Var;
        this.f42059c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        vp0 vp0Var = this.d;
        ArrayList arrayList = vp0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / vp0Var.f42807f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) b1Var.f46343a;
        vp0 vp0Var = this.d;
        y5Var.setAlbumsCount(vp0Var.f42807f);
        int i11 = 0;
        while (true) {
            int i12 = vp0Var.f42807f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < vp0Var.d.size()) {
                    y5Var.a(i11, (MediaController.AlbumEntry) vp0Var.d.get(i13));
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f42059c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.e = new Paint();
        frameLayout.f23977b = new MediaController.AlbumEntry[4];
        frameLayout.f23976a = new org.telegram.ui.Cells.w5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f23976a[i11] = new org.telegram.ui.Cells.w5(frameLayout, context);
            frameLayout.addView(frameLayout.f23976a[i11]);
            frameLayout.f23976a[i11].setVisibility(4);
            frameLayout.f23976a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f23976a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new sp0(this, 0));
        return new s4.b1(frameLayout);
    }
}
