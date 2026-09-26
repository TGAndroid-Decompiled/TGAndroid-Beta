package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class u7 extends FrameLayout {
    public final int f38333a;
    public int f38334b;
    public final NotificationCenter.NotificationCenterDelegate f38335c;

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f38333a = i10;
        this.f38335c = notificationCenterDelegate;
        this.f38334b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38333a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f38334b != measuredWidth) {
                    this.f38334b = measuredWidth;
                    ((h8) this.f38335c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f38334b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    kq kqVar = (kq) this.f38335c;
                    kqVar.f35124b.x0(kqVar.V - 1);
                }
                this.f38334b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f38334b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) this.f38335c;
                    b30Var.f22886w = false;
                    b30Var.a();
                }
                this.f38334b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f38333a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f38334b = -1;
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
        this.f38333a = 0;
        this.f38335c = h8Var;
    }
}
