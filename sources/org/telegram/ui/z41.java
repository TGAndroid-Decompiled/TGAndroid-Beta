package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public final class z41 implements Runnable {
    public final int f39213a;
    public final SecretMediaViewer f39214b;

    public z41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f39213a = i10;
        this.f39214b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i10 = this.f39213a;
        SecretMediaViewer secretMediaViewer = this.f39214b;
        switch (i10) {
            case 0:
                secretMediaViewer.K0 = null;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.f30588s = false;
                secretMediaViewer.N = null;
                secretMediaViewer.M = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new z41(secretMediaViewer, 4), 50L);
                return;
            case 1:
                bi.n7 n7Var = secretMediaViewer.e;
                if (n7Var != null) {
                    n7Var.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.m0 = 0;
                    secretMediaViewer.f30588s = false;
                    secretMediaViewer.N = null;
                    secretMediaViewer.M = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new z41(secretMediaViewer, 4), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                f51 f51Var = secretMediaViewer.f30602y;
                if (f51Var != null) {
                    long n10 = f51Var.n();
                    long p5 = secretMediaViewer.f30602y.p();
                    if (p5 == -9223372036854775807L) {
                        n10 = 0;
                        p5 = 0;
                    }
                    if (p5 > 0) {
                        org.telegram.ui.Components.v71 v71Var = secretMediaViewer.Q;
                        if (!v71Var.f27852f) {
                            v71Var.h(((float) n10) / ((float) p5), false);
                            secretMediaViewer.R.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f30571j1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f30573k1;
                    Arrays.fill(iArr2, 0);
                    f51 f51Var2 = secretMediaViewer.f30602y;
                    if (f51Var2 != null) {
                        long max = Math.max(0L, f51Var2.n()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.f30602y.p()) / 1000;
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
                    org.telegram.ui.ActionBar.l5 l5Var = secretMediaViewer.S;
                    Locale locale = Locale.ROOT;
                    l5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.f30602y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f30569i1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.m(false, true);
                return;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f30568i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f30568i0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f30551b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                secretMediaViewer.f30570j0 = false;
                return;
        }
    }

    public z41(SecretMediaViewer secretMediaViewer, ev0 ev0Var, int i10) {
        this.f39213a = i10;
        this.f39214b = secretMediaViewer;
    }
}
