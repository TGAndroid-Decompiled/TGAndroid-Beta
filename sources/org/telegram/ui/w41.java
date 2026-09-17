package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public final class w41 implements Runnable {
    public final int f41787a;
    public final SecretMediaViewer f41788b;

    public w41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f41787a = i10;
        this.f41788b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i10 = this.f41787a;
        SecretMediaViewer secretMediaViewer = this.f41788b;
        switch (i10) {
            case 0:
                secretMediaViewer.K0 = null;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.f34096e.setLayerType(0, null);
                secretMediaViewer.f34096e.setVisibility(4);
                secretMediaViewer.f34126s = false;
                secretMediaViewer.N = null;
                secretMediaViewer.M = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new w41(secretMediaViewer, 4), 50L);
                return;
            case 1:
                ah.w wVar = secretMediaViewer.f34096e;
                if (wVar != null) {
                    wVar.setLayerType(0, null);
                    secretMediaViewer.f34096e.setVisibility(4);
                    secretMediaViewer.m0 = 0;
                    secretMediaViewer.f34126s = false;
                    secretMediaViewer.N = null;
                    secretMediaViewer.M = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new w41(secretMediaViewer, 4), 50L);
                    secretMediaViewer.f34096e.setScaleX(1.0f);
                    secretMediaViewer.f34096e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                c51 c51Var = secretMediaViewer.f34140y;
                if (c51Var != null) {
                    long n10 = c51Var.n();
                    long p5 = secretMediaViewer.f34140y.p();
                    if (p5 == -9223372036854775807L) {
                        n10 = 0;
                        p5 = 0;
                    }
                    if (p5 > 0) {
                        org.telegram.ui.Components.i71 i71Var = secretMediaViewer.Q;
                        if (!i71Var.f27017f) {
                            i71Var.h(((float) n10) / ((float) p5), false);
                            secretMediaViewer.R.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f34109j1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f34111k1;
                    Arrays.fill(iArr2, 0);
                    c51 c51Var2 = secretMediaViewer.f34140y;
                    if (c51Var2 != null) {
                        long max = Math.max(0L, c51Var2.n()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.f34140y.p()) / 1000;
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
                    org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.S;
                    Locale locale = Locale.ROOT;
                    j5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.f34140y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f34107i1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.m(false, true);
                return;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f34106i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f34106i0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f34088b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                secretMediaViewer.f34108j0 = false;
                return;
        }
    }

    public w41(SecretMediaViewer secretMediaViewer, cv0 cv0Var, int i10) {
        this.f41787a = i10;
        this.f41788b = secretMediaViewer;
    }
}
