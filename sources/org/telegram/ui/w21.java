package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class w21 implements Runnable {
    public final int f38689a;
    public final z21 f38690b;

    public w21(z21 z21Var, int i10) {
        this.f38689a = i10;
        this.f38690b = z21Var;
    }

    @Override
    public final void run() {
        long j3;
        String str;
        switch (this.f38689a) {
            case 0:
                z21 z21Var = this.f38690b;
                AndroidUtilities.cancelRunOnUIThread(z21Var.N);
                boolean z10 = z21Var.f40098r;
                if (z10) {
                    if (z10 && z21Var.F == null) {
                        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        z21Var.F = kj0Var;
                        kj0Var.R(z21Var);
                        z21Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        z21Var.F.K(1);
                        z21Var.F.start();
                    }
                    String str2 = "";
                    if (z21Var.J == 0 || System.currentTimeMillis() / 1000 >= z21Var.J) {
                        if (z21Var.J != 0) {
                            z21Var.I = null;
                            Utilities.themeQueue.postRunnable(new x21(z21Var, z21Var.getWidth(), z21Var.getHeight(), 2));
                            z21Var.f40099s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (z21Var.J == 0) {
                            j3 = 750;
                        } else {
                            j3 = 1750;
                        }
                        messagesController.requestContactToken(j3, new s3(z21Var, 18));
                    }
                    int i10 = z21Var.J;
                    if (i10 > 0 && z21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.yo0 yo0Var = z21Var.f40099s;
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
                        yo0Var.q(sb2.toString(), true, false);
                    }
                    if (z21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(z21Var.N, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                z21 z21Var2 = this.f38690b;
                z21Var2.S = false;
                Bitmap bitmap = z21Var2.h;
                if (bitmap != null) {
                    z21Var2.h = null;
                    z21Var2.f40101x.d(0.0f, true);
                    Bitmap bitmap2 = z21Var2.f40097n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    z21Var2.f40097n = bitmap;
                    z21Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
