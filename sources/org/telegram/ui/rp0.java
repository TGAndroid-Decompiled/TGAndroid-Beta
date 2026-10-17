package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class rp0 extends org.telegram.ui.Components.hm0 {
    public final Context f40792c;
    public final tp0 d;

    public rp0(tp0 tp0Var, Context context) {
        this.d = tp0Var;
        this.f40792c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        tp0 tp0Var = this.d;
        ArrayList arrayList = tp0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / tp0Var.f41801f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) b1Var.f45938a;
        tp0 tp0Var = this.d;
        x5Var.setAlbumsCount(tp0Var.f41801f);
        int i11 = 0;
        while (true) {
            int i12 = tp0Var.f41801f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < tp0Var.d.size()) {
                    x5Var.a(i11, (MediaController.AlbumEntry) tp0Var.d.get(i13));
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
        Context context = this.f40792c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.e = new Paint();
        frameLayout.f23802b = new MediaController.AlbumEntry[4];
        frameLayout.f23801a = new org.telegram.ui.Cells.v5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f23801a[i11] = new org.telegram.ui.Cells.v5(frameLayout, context);
            frameLayout.addView(frameLayout.f23801a[i11]);
            frameLayout.f23801a[i11].setVisibility(4);
            frameLayout.f23801a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f23801a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new qp0(this, 0));
        return new s4.b1(frameLayout);
    }
}
