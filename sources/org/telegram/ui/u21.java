package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class u21 implements Runnable {
    public final int f42332a;
    public final x21 f42333b;

    public u21(x21 x21Var, int i10) {
        this.f42332a = i10;
        this.f42333b = x21Var;
    }

    @Override
    public final void run() {
        long j3;
        String str;
        switch (this.f42332a) {
            case 0:
                x21 x21Var = this.f42333b;
                AndroidUtilities.cancelRunOnUIThread(x21Var.N);
                boolean z10 = x21Var.f43951r;
                if (z10) {
                    if (z10 && x21Var.F == null) {
                        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        x21Var.F = ek0Var;
                        ek0Var.R(x21Var);
                        x21Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        x21Var.F.K(1);
                        x21Var.F.start();
                    }
                    String str2 = "";
                    if (x21Var.J == 0 || System.currentTimeMillis() / 1000 >= x21Var.J) {
                        if (x21Var.J != 0) {
                            x21Var.I = null;
                            Utilities.themeQueue.postRunnable(new v21(x21Var, x21Var.getWidth(), x21Var.getHeight(), 2));
                            x21Var.f43952s.t("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (x21Var.J == 0) {
                            j3 = 750;
                        } else {
                            j3 = 1750;
                        }
                        messagesController.requestContactToken(j3, new s3(x21Var, 22));
                    }
                    int i10 = x21Var.J;
                    if (i10 > 0 && x21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.qp0 qp0Var = x21Var.f43952s;
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
                        qp0Var.t(sb2.toString(), true, false);
                    }
                    if (x21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(x21Var.N, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                x21 x21Var2 = this.f42333b;
                x21Var2.S = false;
                Bitmap bitmap = x21Var2.h;
                if (bitmap != null) {
                    x21Var2.h = null;
                    x21Var2.f43954x.d(0.0f, true);
                    Bitmap bitmap2 = x21Var2.f43950n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    x21Var2.f43950n = bitmap;
                    x21Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
