package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class u7 extends FrameLayout {
    public final int f40952a;
    public int f40953b;
    public final NotificationCenter.NotificationCenterDelegate f40954c;

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f40952a = i10;
        this.f40954c = notificationCenterDelegate;
        this.f40953b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f40952a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f40953b != measuredWidth) {
                    this.f40953b = measuredWidth;
                    ((h8) this.f40954c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f40953b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    qq qqVar = (qq) this.f40954c;
                    qqVar.f39937b.x0(qqVar.V - 1);
                }
                this.f40953b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f40953b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) this.f40954c;
                    z20Var.f33068w = false;
                    z20Var.a();
                }
                this.f40953b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f40952a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f40953b = -1;
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
        this.f40952a = 0;
        this.f40954c = h8Var;
    }
}
