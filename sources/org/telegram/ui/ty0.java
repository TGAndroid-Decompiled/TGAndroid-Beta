package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public final class ty0 implements Runnable {
    public final int f49922a;
    public final SecretMediaViewer f49923b;

    public ty0(SecretMediaViewer secretMediaViewer, int i3) {
        this.f49922a = i3;
        this.f49923b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i3 = this.f49922a;
        SecretMediaViewer secretMediaViewer = this.f49923b;
        switch (i3) {
            case 0:
                secretMediaViewer.J0 = null;
                secretMediaViewer.f41951l0 = 0;
                secretMediaViewer.f41936e.setLayerType(0, null);
                secretMediaViewer.f41936e.setVisibility(4);
                secretMediaViewer.f41965s = false;
                secretMediaViewer.M = null;
                secretMediaViewer.L = false;
                secretMediaViewer.j();
                new ArrayList();
                org.telegram.messenger.g0.i3(new ty0(secretMediaViewer, 4), 50L);
                return;
            case 1:
                ai.c0 c0Var = secretMediaViewer.f41936e;
                if (c0Var != null) {
                    c0Var.setLayerType(0, null);
                    secretMediaViewer.f41936e.setVisibility(4);
                    secretMediaViewer.f41951l0 = 0;
                    secretMediaViewer.f41965s = false;
                    secretMediaViewer.M = null;
                    secretMediaViewer.L = false;
                    secretMediaViewer.j();
                    new ArrayList();
                    org.telegram.messenger.g0.i3(new ty0(secretMediaViewer, 4), 50L);
                    secretMediaViewer.f41936e.setScaleX(1.0f);
                    secretMediaViewer.f41936e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                bp0 bp0Var = secretMediaViewer.E;
                if (bp0Var != null) {
                    long S = bp0Var.S();
                    long U = secretMediaViewer.E.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        org.telegram.ui.Components.o51 o51Var = secretMediaViewer.P;
                        if (!o51Var.f36723f) {
                            o51Var.h(false, ((float) S) / ((float) U));
                            secretMediaViewer.Q.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f41947i1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f41949j1;
                    Arrays.fill(iArr2, 0);
                    bp0 bp0Var2 = secretMediaViewer.E;
                    if (bp0Var2 != null) {
                        long max = Math.max(0L, bp0Var2.S()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.E.U()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i10 = iArr[0];
                    if (i10 >= 60) {
                        format = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i10 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1]));
                    } else {
                        format = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(iArr[1]));
                    }
                    int i11 = iArr2[0];
                    if (i11 >= 60) {
                        format2 = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1]));
                    } else {
                        format2 = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(iArr2[1]));
                    }
                    org.telegram.ui.ActionBar.k5 k5Var = secretMediaViewer.R;
                    Locale locale = Locale.ROOT;
                    k5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.E.d0()) {
                        org.telegram.messenger.g0.i3(secretMediaViewer.f41945h1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.n(false, true);
                return;
            default:
                org.telegram.messenger.cc ccVar = secretMediaViewer.f41944h0;
                if (ccVar != null) {
                    ccVar.a();
                    secretMediaViewer.f41944h0 = null;
                }
                secretMediaViewer.h.w0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f41928b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                secretMediaViewer.f41946i0 = false;
                return;
        }
    }

    public ty0(SecretMediaViewer secretMediaViewer, mq0 mq0Var, int i3) {
        this.f49922a = i3;
        this.f49923b = secretMediaViewer;
    }
}
