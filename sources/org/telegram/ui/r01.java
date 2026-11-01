package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public final class r01 implements Runnable {
    public final int f40935a;
    public final SecretMediaViewer f40936b;

    public r01(SecretMediaViewer secretMediaViewer, int i10) {
        this.f40935a = i10;
        this.f40936b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i10 = this.f40935a;
        SecretMediaViewer secretMediaViewer = this.f40936b;
        switch (i10) {
            case 0:
                secretMediaViewer.I0 = null;
                secretMediaViewer.f34007k0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.f34023s = false;
                secretMediaViewer.L = null;
                secretMediaViewer.K = false;
                secretMediaViewer.j();
                new ArrayList();
                org.telegram.messenger.i0.h3(new r01(secretMediaViewer, 4), 50L);
                return;
            case 1:
                fg.i iVar = secretMediaViewer.e;
                if (iVar != null) {
                    iVar.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.f34007k0 = 0;
                    secretMediaViewer.f34023s = false;
                    secretMediaViewer.L = null;
                    secretMediaViewer.K = false;
                    secretMediaViewer.j();
                    new ArrayList();
                    org.telegram.messenger.i0.h3(new r01(secretMediaViewer, 4), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                sq0 sq0Var = secretMediaViewer.D;
                if (sq0Var != null) {
                    long S = sq0Var.S();
                    long U = secretMediaViewer.D.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        org.telegram.ui.Components.x61 x61Var = secretMediaViewer.O;
                        if (!x61Var.f32455f) {
                            x61Var.h(false, ((float) S) / ((float) U));
                            secretMediaViewer.P.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f34002h1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f34004i1;
                    Arrays.fill(iArr2, 0);
                    sq0 sq0Var2 = secretMediaViewer.D;
                    if (sq0Var2 != null) {
                        long max = Math.max(0L, sq0Var2.S()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.D.U()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i11 = iArr[0];
                    if (i11 >= 60) {
                        format = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1]));
                    } else {
                        format = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(iArr[1]));
                    }
                    int i12 = iArr2[0];
                    if (i12 >= 60) {
                        format2 = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1]));
                    } else {
                        format2 = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr2[1]));
                    }
                    org.telegram.ui.ActionBar.u5 u5Var = secretMediaViewer.Q;
                    Locale locale = Locale.ROOT;
                    u5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.D.d0()) {
                        org.telegram.messenger.i0.h3(secretMediaViewer.f34000g1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.n(false, true);
                return;
            default:
                org.telegram.messenger.lc lcVar = secretMediaViewer.f33999g0;
                if (lcVar != null) {
                    lcVar.a();
                    secretMediaViewer.f33999g0 = null;
                }
                secretMediaViewer.h.w0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f33986b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                secretMediaViewer.f34001h0 = false;
                return;
        }
    }

    public r01(SecretMediaViewer secretMediaViewer, fs0 fs0Var, int i10) {
        this.f40935a = i10;
        this.f40936b = secretMediaViewer;
    }
}
