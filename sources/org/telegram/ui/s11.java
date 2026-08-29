package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class s11 implements Runnable {
    public final int f42253a;
    public final v11 f42254b;

    public s11(v11 v11Var, int i10) {
        this.f42253a = i10;
        this.f42254b = v11Var;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        switch (this.f42253a) {
            case 0:
                v11 v11Var = this.f42254b;
                AndroidUtilities.cancelRunOnUIThread(v11Var.J);
                boolean z10 = v11Var.f43398r;
                if (z10) {
                    if (z10 && v11Var.B == null) {
                        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), "qr_matrix", AndroidUtilities.dp(200.0f));
                        v11Var.B = xi0Var;
                        xi0Var.f34753r0 = v11Var;
                        xi0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        v11Var.B.I(1);
                        v11Var.B.start();
                    }
                    String str2 = "";
                    if (v11Var.F == 0 || System.currentTimeMillis() / 1000 >= v11Var.F) {
                        if (v11Var.F != 0) {
                            v11Var.E = null;
                            Utilities.themeQueue.postRunnable(new t11(v11Var, v11Var.getWidth(), v11Var.getHeight(), 2));
                            v11Var.f43399s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (v11Var.F == 0) {
                            j10 = 750;
                        } else {
                            j10 = 1750;
                        }
                        messagesController.requestContactToken(j10, new x3(v11Var, 18));
                    }
                    int i10 = v11Var.F;
                    if (i10 > 0 && v11Var.E != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.do0 do0Var = v11Var.f43399s;
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
                        do0Var.q(sb2.toString(), true, false);
                    }
                    if (v11Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(v11Var.J, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                v11 v11Var2 = this.f42254b;
                v11Var2.O = false;
                Bitmap bitmap = v11Var2.h;
                if (bitmap != null) {
                    v11Var2.h = null;
                    v11Var2.f43401x.d(0.0f, true);
                    Bitmap bitmap2 = v11Var2.f43397n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    v11Var2.f43397n = bitmap;
                    v11Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
