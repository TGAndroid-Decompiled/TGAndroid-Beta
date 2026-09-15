package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class v21 implements Runnable {
    public final int f38335a;
    public final y21 f38336b;

    public v21(y21 y21Var, int i10) {
        this.f38335a = i10;
        this.f38336b = y21Var;
    }

    @Override
    public final void run() {
        long j3;
        String str;
        switch (this.f38335a) {
            case 0:
                y21 y21Var = this.f38336b;
                AndroidUtilities.cancelRunOnUIThread(y21Var.N);
                boolean z10 = y21Var.f39738r;
                if (z10) {
                    if (z10 && y21Var.F == null) {
                        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        y21Var.F = xi0Var;
                        xi0Var.f29972v0 = y21Var;
                        xi0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        y21Var.F.K(1);
                        y21Var.F.start();
                    }
                    String str2 = "";
                    if (y21Var.J == 0 || System.currentTimeMillis() / 1000 >= y21Var.J) {
                        if (y21Var.J != 0) {
                            y21Var.I = null;
                            Utilities.themeQueue.postRunnable(new w21(y21Var, y21Var.getWidth(), y21Var.getHeight(), 2));
                            y21Var.f39739s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (y21Var.J == 0) {
                            j3 = 750;
                        } else {
                            j3 = 1750;
                        }
                        messagesController.requestContactToken(j3, new s3(y21Var, 18));
                    }
                    int i10 = y21Var.J;
                    if (i10 > 0 && y21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.jo0 jo0Var = y21Var.f39739s;
                        StringBuilder sb2 = new StringBuilder();
                        if (min >= 10) {
                            str = "";
                        } else {
                            str = "0";
                        }
                        sb2.append(str);
                        sb2.append(min);
                        sb2.append(":");
                        if (i11 < 10) {
                            str2 = "0";
                        }
                        sb2.append(str2);
                        sb2.append(i11);
                        jo0Var.q(sb2.toString(), true, false);
                    }
                    if (y21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(y21Var.N, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                y21 y21Var2 = this.f38336b;
                y21Var2.S = false;
                Bitmap bitmap = y21Var2.h;
                if (bitmap != null) {
                    y21Var2.h = null;
                    y21Var2.f39741x.d(0.0f, true);
                    Bitmap bitmap2 = y21Var2.f39737n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    y21Var2.f39737n = bitmap;
                    y21Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
