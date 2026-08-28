package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class t7 extends FrameLayout {
    public final int f42880a;
    public int f42881b;
    public final NotificationCenter.NotificationCenterDelegate f42882c;

    public t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i9) {
        super(context);
        this.f42880a = i9;
        this.f42882c = notificationCenterDelegate;
        this.f42881b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f42880a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f42881b != measuredWidth) {
                    this.f42881b = measuredWidth;
                    ((g8) this.f42882c).H.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i9, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.f42881b;
                if (i14 != -1 && Math.abs(i14 - i13) > AndroidUtilities.dp(20.0f)) {
                    bq bqVar = (bq) this.f42882c;
                    bqVar.f36921b.x0(bqVar.R - 1);
                }
                this.f42881b = i13;
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                Point point = AndroidUtilities.displaySize;
                int i15 = point.x + point.y;
                int i16 = this.f42881b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.j20 j20Var = (org.telegram.ui.Components.j20) this.f42882c;
                    j20Var.f29606w = false;
                    j20Var.a();
                }
                this.f42881b = i15;
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.f42880a) {
            case 2:
                super.setVisibility(i9);
                if (i9 == 8) {
                    this.f42881b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }

    public t7(g8 g8Var, Context context) {
        super(context);
        this.f42880a = 0;
        this.f42882c = g8Var;
    }
}
