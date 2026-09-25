package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class u7 extends FrameLayout {
    public final int f38335a;
    public int f38336b;
    public final NotificationCenter.NotificationCenterDelegate f38337c;

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f38335a = i10;
        this.f38337c = notificationCenterDelegate;
        this.f38336b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38335a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f38336b != measuredWidth) {
                    this.f38336b = measuredWidth;
                    ((h8) this.f38337c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f38336b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    kq kqVar = (kq) this.f38337c;
                    kqVar.f35126b.x0(kqVar.V - 1);
                }
                this.f38336b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f38336b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) this.f38337c;
                    a30Var.f22583w = false;
                    a30Var.a();
                }
                this.f38336b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f38335a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f38336b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public u7(h8 h8Var, Context context) {
        super(context);
        this.f38335a = 0;
        this.f38337c = h8Var;
    }
}
