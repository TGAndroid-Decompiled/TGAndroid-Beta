package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class t7 extends FrameLayout {
    public final int f41879a;
    public int f41880b;
    public final NotificationCenter.NotificationCenterDelegate f41881c;

    public t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f41879a = i10;
        this.f41881c = notificationCenterDelegate;
        this.f41880b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41879a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f41880b != measuredWidth) {
                    this.f41880b = measuredWidth;
                    ((g8) this.f41881c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f41880b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    nq nqVar = (nq) this.f41881c;
                    nqVar.f40312b.x0(nqVar.V - 1);
                }
                this.f41880b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f41880b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.q30 q30Var = (org.telegram.ui.Components.q30) this.f41881c;
                    q30Var.f30022w = false;
                    q30Var.a();
                }
                this.f41880b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f41879a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f41880b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public t7(g8 g8Var, Context context) {
        super(context);
        this.f41879a = 0;
        this.f41881c = g8Var;
    }
}
