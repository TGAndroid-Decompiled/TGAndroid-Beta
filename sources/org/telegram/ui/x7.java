package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x7 extends FrameLayout {
    public final int f43117a;
    public int f43118b;
    public final NotificationCenter.NotificationCenterDelegate f43119c;

    public x7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f43117a = i10;
        this.f43119c = notificationCenterDelegate;
        this.f43118b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f43117a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f43118b != measuredWidth) {
                    this.f43118b = measuredWidth;
                    ((k8) this.f43119c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f43118b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    bq bqVar = (bq) this.f43119c;
                    bqVar.f35690b.x0(bqVar.V - 1);
                }
                this.f43118b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f43118b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) this.f43119c;
                    i30Var.f27114w = false;
                    i30Var.a();
                }
                this.f43118b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f43117a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f43118b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public x7(k8 k8Var, Context context) {
        super(context);
        this.f43117a = 0;
        this.f43119c = k8Var;
    }
}
