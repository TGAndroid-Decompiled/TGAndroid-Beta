package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class v7 extends FrameLayout {
    public final int f38323a;
    public int f38324b;
    public final NotificationCenter.NotificationCenterDelegate f38325c;

    public v7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f38323a = i10;
        this.f38325c = notificationCenterDelegate;
        this.f38324b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38323a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f38324b != measuredWidth) {
                    this.f38324b = measuredWidth;
                    ((i8) this.f38325c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f38324b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    nq nqVar = (nq) this.f38325c;
                    nqVar.f36002b.y0(nqVar.V - 1);
                }
                this.f38324b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f38324b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) this.f38325c;
                    z20Var.f30722w = false;
                    z20Var.a();
                }
                this.f38324b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f38323a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f38324b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public v7(i8 i8Var, Context context) {
        super(context);
        this.f38323a = 0;
        this.f38325c = i8Var;
    }
}
