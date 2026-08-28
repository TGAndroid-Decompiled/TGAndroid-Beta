package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class r11 implements Runnable {
    public final int f42252a;
    public final u11 f42253b;

    public r11(u11 u11Var, int i9) {
        this.f42252a = i9;
        this.f42253b = u11Var;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        switch (this.f42252a) {
            case 0:
                u11 u11Var = this.f42253b;
                AndroidUtilities.cancelRunOnUIThread(u11Var.J);
                boolean z10 = u11Var.f43106r;
                if (z10) {
                    if (z10 && u11Var.B == null) {
                        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), "qr_matrix", AndroidUtilities.dp(200.0f));
                        u11Var.B = mi0Var;
                        mi0Var.f30863r0 = u11Var;
                        mi0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        u11Var.B.I(1);
                        u11Var.B.start();
                    }
                    String str2 = "";
                    if (u11Var.F == 0 || System.currentTimeMillis() / 1000 >= u11Var.F) {
                        if (u11Var.F != 0) {
                            u11Var.E = null;
                            Utilities.themeQueue.postRunnable(new s11(u11Var, u11Var.getWidth(), u11Var.getHeight(), 2));
                            u11Var.f43107s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (u11Var.F == 0) {
                            j10 = 750;
                        } else {
                            j10 = 1750;
                        }
                        messagesController.requestContactToken(j10, new w3(u11Var, 18));
                    }
                    int i9 = u11Var.F;
                    if (i9 > 0 && u11Var.E != null) {
                        long max = Math.max(0L, (i9 - (System.currentTimeMillis() / 1000)) - 1);
                        int i10 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.sn0 sn0Var = u11Var.f43107s;
                        StringBuilder sb2 = new StringBuilder();
                        if (min >= 10) {
                            str = "";
                        } else {
                            str = "0";
                        }
                        sb2.append(str);
                        sb2.append(min);
                        sb2.append(":");
                        if (i10 < 10) {
                            str2 = "0";
                        }
                        sb2.append(str2);
                        sb2.append(i10);
                        sn0Var.q(sb2.toString(), true, false);
                    }
                    if (u11Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(u11Var.J, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                u11 u11Var2 = this.f42253b;
                u11Var2.O = false;
                Bitmap bitmap = u11Var2.h;
                if (bitmap != null) {
                    u11Var2.h = null;
                    u11Var2.f43109x.d(0.0f, true);
                    Bitmap bitmap2 = u11Var2.f43105n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    u11Var2.f43105n = bitmap;
                    u11Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
