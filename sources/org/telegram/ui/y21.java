package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class y21 implements Runnable {
    public final int f44277a;
    public final b31 f44278b;

    public y21(b31 b31Var, int i10) {
        this.f44277a = i10;
        this.f44278b = b31Var;
    }

    @Override
    public final void run() {
        long j3;
        String str;
        switch (this.f44277a) {
            case 0:
                b31 b31Var = this.f44278b;
                AndroidUtilities.cancelRunOnUIThread(b31Var.N);
                boolean z10 = b31Var.f36057r;
                if (z10) {
                    if (z10 && b31Var.F == null) {
                        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        b31Var.F = fk0Var;
                        fk0Var.R(b31Var);
                        b31Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        b31Var.F.K(1);
                        b31Var.F.start();
                    }
                    String str2 = "";
                    if (b31Var.J == 0 || System.currentTimeMillis() / 1000 >= b31Var.J) {
                        if (b31Var.J != 0) {
                            b31Var.I = null;
                            Utilities.themeQueue.postRunnable(new z21(b31Var, b31Var.getWidth(), b31Var.getHeight(), 2));
                            b31Var.f36058s.t("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (b31Var.J == 0) {
                            j3 = 750;
                        } else {
                            j3 = 1750;
                        }
                        messagesController.requestContactToken(j3, new t3(b31Var, 22));
                    }
                    int i10 = b31Var.J;
                    if (i10 > 0 && b31Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.up0 up0Var = b31Var.f36058s;
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
                        up0Var.t(sb2.toString(), true, false);
                    }
                    if (b31Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(b31Var.N, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                b31 b31Var2 = this.f44278b;
                b31Var2.S = false;
                Bitmap bitmap = b31Var2.h;
                if (bitmap != null) {
                    b31Var2.h = null;
                    b31Var2.f36060x.d(0.0f, true);
                    Bitmap bitmap2 = b31Var2.f36056n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    b31Var2.f36056n = bitmap;
                    b31Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
