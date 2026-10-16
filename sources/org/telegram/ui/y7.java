package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class y7 extends FrameLayout {
    public final int f41757a;
    public int f41758b;
    public final NotificationCenter.NotificationCenterDelegate f41759c;

    public y7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f41757a = i10;
        this.f41759c = notificationCenterDelegate;
        this.f41758b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41757a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f41758b != measuredWidth) {
                    this.f41758b = measuredWidth;
                    ((l8) this.f41759c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f41758b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    tq tqVar = (tq) this.f41759c;
                    tqVar.f40164b.x0(tqVar.V - 1);
                }
                this.f41758b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f41758b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) this.f41759c;
                    m30Var.f26905w = false;
                    m30Var.a();
                }
                this.f41758b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f41757a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f41758b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public y7(l8 l8Var, Context context) {
        super(context);
        this.f41757a = 0;
        this.f41759c = l8Var;
    }
}
