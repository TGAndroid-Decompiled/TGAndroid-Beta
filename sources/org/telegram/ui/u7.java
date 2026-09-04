package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class u7 extends FrameLayout {
    public final int f40951a;
    public int f40952b;
    public final NotificationCenter.NotificationCenterDelegate f40953c;

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f40951a = i10;
        this.f40953c = notificationCenterDelegate;
        this.f40952b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f40951a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f40952b != measuredWidth) {
                    this.f40952b = measuredWidth;
                    ((h8) this.f40953c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f40952b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    qq qqVar = (qq) this.f40953c;
                    qqVar.f39936b.x0(qqVar.V - 1);
                }
                this.f40952b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f40952b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) this.f40953c;
                    z20Var.f33067w = false;
                    z20Var.a();
                }
                this.f40952b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f40951a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f40952b = -1;
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
        this.f40951a = 0;
        this.f40953c = h8Var;
    }
}
