package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class x21 implements Runnable {
    public final int f42604a;
    public final a31 f42605b;

    public x21(a31 a31Var, int i10) {
        this.f42604a = i10;
        this.f42605b = a31Var;
    }

    @Override
    public final void run() {
        long j3;
        String str;
        switch (this.f42604a) {
            case 0:
                a31 a31Var = this.f42605b;
                AndroidUtilities.cancelRunOnUIThread(a31Var.N);
                boolean z10 = a31Var.f34347r;
                if (z10) {
                    if (z10 && a31Var.F == null) {
                        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        a31Var.F = xi0Var;
                        xi0Var.f32605v0 = a31Var;
                        xi0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        a31Var.F.I(1);
                        a31Var.F.start();
                    }
                    String str2 = "";
                    if (a31Var.J == 0 || System.currentTimeMillis() / 1000 >= a31Var.J) {
                        if (a31Var.J != 0) {
                            a31Var.I = null;
                            Utilities.themeQueue.postRunnable(new y21(a31Var, a31Var.getWidth(), a31Var.getHeight(), 2));
                            a31Var.f34348s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (a31Var.J == 0) {
                            j3 = 750;
                        } else {
                            j3 = 1750;
                        }
                        messagesController.requestContactToken(j3, new t3(a31Var, 18));
                    }
                    int i10 = a31Var.J;
                    if (i10 > 0 && a31Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.jo0 jo0Var = a31Var.f34348s;
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
                    if (a31Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(a31Var.N, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                a31 a31Var2 = this.f42605b;
                a31Var2.S = false;
                Bitmap bitmap = a31Var2.h;
                if (bitmap != null) {
                    a31Var2.h = null;
                    a31Var2.f34350x.d(0.0f, true);
                    Bitmap bitmap2 = a31Var2.f34346n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    a31Var2.f34346n = bitmap;
                    a31Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
