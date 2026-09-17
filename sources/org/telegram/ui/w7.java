package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w7 extends FrameLayout {
    public final int f38577a;
    public int f38578b;
    public final NotificationCenter.NotificationCenterDelegate f38579c;

    public w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f38577a = i10;
        this.f38579c = notificationCenterDelegate;
        this.f38578b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38577a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f38578b != measuredWidth) {
                    this.f38578b = measuredWidth;
                    ((j8) this.f38579c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f38578b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    pq pqVar = (pq) this.f38579c;
                    pqVar.f36678b.y0(pqVar.V - 1);
                }
                this.f38578b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f38578b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) this.f38579c;
                    z20Var.f30385w = false;
                    z20Var.a();
                }
                this.f38578b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f38577a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f38578b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public w7(j8 j8Var, Context context) {
        super(context);
        this.f38577a = 0;
        this.f38579c = j8Var;
    }
}
