package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x7 extends FrameLayout {
    public final int f43518a;
    public int f43519b;
    public final NotificationCenter.NotificationCenterDelegate f43520c;

    public x7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f43518a = i10;
        this.f43520c = notificationCenterDelegate;
        this.f43519b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f43518a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f43519b != measuredWidth) {
                    this.f43519b = measuredWidth;
                    ((k8) this.f43520c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f43519b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    dq dqVar = (dq) this.f43520c;
                    dqVar.f36675b.x0(dqVar.W - 1);
                }
                this.f43519b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f43519b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) this.f43520c;
                    i30Var.f27196w = false;
                    i30Var.a();
                }
                this.f43519b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f43518a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f43519b = -1;
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
        this.f43518a = 0;
        this.f43520c = k8Var;
    }
}
