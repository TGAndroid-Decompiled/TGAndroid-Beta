package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w50 extends org.telegram.ui.Components.wk0 {
    public final int T2;
    public final NotificationCenter.NotificationCenterDelegate U2;

    public w50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.T2 = i9;
        this.U2 = notificationCenterDelegate;
    }

    @Override
    public boolean E0(float f10) {
        int i9;
        switch (this.T2) {
            case 2:
                org.telegram.ui.Components.ki kiVar = ((pf.e0) this.U2).f27493b;
                int dp = AndroidUtilities.dp(30.0f) + kiVar.X1[0];
                if (!kiVar.f30103c0) {
                    i9 = AndroidUtilities.statusBarHeight;
                } else {
                    i9 = 0;
                }
                if (f10 < dp + i9) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public Integer W0(int i9) {
        int i10;
        switch (this.T2) {
            case 1:
                i10 = ((SessionsActivity) this.U2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.b6 b6Var = this.f34260l2;
                if (i9 == i10) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23212p7, b6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var));
            default:
                return super.W0(i9);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.T2) {
            case 0:
                super.dispatchDraw(canvas);
                y50 y50Var = (y50) this.U2;
                if (y50Var.f44727v0 != null && y50Var.f44728w0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = y50Var.f44727v0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.o2) y50Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    y50Var.f44727v0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void k0(int i9, int i10) {
        int i11 = this.T2;
    }

    public w50(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.T2 = 1;
        this.U2 = sessionsActivity;
    }

    private final void w1(int i9, int i10) {
    }
}
