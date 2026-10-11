package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class s7 extends FrameLayout {
    public final int f41645a;
    public int f41646b;
    public final NotificationCenter.NotificationCenterDelegate f41647c;

    public s7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f41645a = i10;
        this.f41647c = notificationCenterDelegate;
        this.f41646b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41645a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f41646b != measuredWidth) {
                    this.f41646b = measuredWidth;
                    ((f8) this.f41647c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f41646b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    nq nqVar = (nq) this.f41647c;
                    nqVar.f40343b.x0(nqVar.V - 1);
                }
                this.f41646b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f41646b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.r30 r30Var = (org.telegram.ui.Components.r30) this.f41647c;
                    r30Var.f30399w = false;
                    r30Var.a();
                }
                this.f41646b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f41645a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f41646b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public s7(f8 f8Var, Context context) {
        super(context);
        this.f41645a = 0;
        this.f41647c = f8Var;
    }
}
