package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w7 extends FrameLayout {
    public final int f42395a;
    public int f42396b;
    public final NotificationCenter.NotificationCenterDelegate f42397c;

    public w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f42395a = i10;
        this.f42397c = notificationCenterDelegate;
        this.f42396b = -1;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f42395a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f42396b != measuredWidth) {
                    this.f42396b = measuredWidth;
                    ((j8) this.f42397c).I.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f42396b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    kq kqVar = (kq) this.f42397c;
                    kqVar.f38457b.x0(kqVar.S - 1);
                }
                this.f42396b = i14;
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f42396b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.c30 c30Var = (org.telegram.ui.Components.c30) this.f42397c;
                    c30Var.f25779w = false;
                    c30Var.a();
                }
                this.f42396b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f42395a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f42396b = -1;
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
        this.f42395a = 0;
        this.f42397c = j8Var;
    }
}
