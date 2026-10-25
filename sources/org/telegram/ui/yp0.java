package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class yp0 extends org.telegram.ui.Components.lm0 {
    public final Context f46089c;
    public final aq0 d;

    public yp0(aq0 aq0Var, Context context) {
        this.d = aq0Var;
        this.f46089c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        aq0 aq0Var = this.d;
        ArrayList arrayList = aq0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / aq0Var.f37875f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) e1Var.f47735a;
        aq0 aq0Var = this.d;
        c6Var.setAlbumsCount(aq0Var.f37875f);
        int i11 = 0;
        while (true) {
            int i12 = aq0Var.f37875f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < aq0Var.d.size()) {
                    c6Var.a(i11, (MediaController.AlbumEntry) aq0Var.d.get(i13));
                } else {
                    c6Var.a(i11, null);
                }
                i11++;
            } else {
                c6Var.requestLayout();
                return;
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f46089c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.e = new Paint();
        frameLayout.f23928b = new MediaController.AlbumEntry[4];
        frameLayout.f23927a = new org.telegram.ui.Cells.a6[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f23927a[i11] = new org.telegram.ui.Cells.a6(frameLayout, context);
            frameLayout.addView(frameLayout.f23927a[i11]);
            frameLayout.f23927a[i11].setVisibility(4);
            frameLayout.f23927a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f23927a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new hl0(this, 2));
        return new s4.e1(frameLayout);
    }
}
