package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class s7 extends FrameLayout {
    public final int f42290a;
    public int f42291b;
    public final NotificationCenter.NotificationCenterDelegate f42292c;

    public s7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f42290a = i10;
        this.f42292c = notificationCenterDelegate;
        this.f42291b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f42290a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f42291b != measuredWidth) {
                    this.f42291b = measuredWidth;
                    ((f8) this.f42292c).H.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f42291b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    dq dqVar = (dq) this.f42292c;
                    dqVar.f37575b.x0(dqVar.R - 1);
                }
                this.f42291b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f42291b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) this.f42292c;
                    w20Var.f34283w = false;
                    w20Var.a();
                }
                this.f42291b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f42290a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f42291b = -1;
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
        this.f42290a = 0;
        this.f42292c = f8Var;
    }
}
