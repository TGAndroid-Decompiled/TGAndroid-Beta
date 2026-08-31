package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class zq0 implements Runnable {
    public final int f43973a = 0;
    public final boolean f43974b;
    public final boolean f43975c;
    public final boolean d;
    public final Object f43976e;
    public final Serializable f43977f;
    public final Object h;

    public zq0(yr0 yr0Var, int[] iArr, int[] iArr2, boolean z4, boolean z10, boolean z11) {
        this.f43976e = yr0Var;
        this.f43977f = iArr;
        this.h = iArr2;
        this.f43974b = z4;
        this.f43975c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        int intValue;
        float f10;
        float f11;
        org.telegram.ui.Components.pc pcVar;
        int i10 = this.f43973a;
        Object obj = this.h;
        Serializable serializable = this.f43977f;
        Object obj2 = this.f43976e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                MessageObject messageObject = (MessageObject) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i11 = photoViewer.S3;
                photoViewer.S3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z4 = this.f43974b;
                if (z4) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z4, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.Z1 = 2;
                photoViewer.f34377r2 = false;
                photoViewer.d = new lt0(photoViewer, photoViewer.d, messageObject, orientation, this.f43975c, this.d);
                photoViewer.f34329m1.l();
                if (photoViewer.R6 == null) {
                    photoViewer.R6 = VelocityTracker.obtain();
                }
                photoViewer.f34447y7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                xn xnVar = photoViewer.f34298i4;
                if (xnVar != null && xnVar.V != null && xnVar.x9()) {
                    photoViewer.f34298i4.V.P();
                } else {
                    photoViewer.R1();
                }
                photoViewer.I0.setAlpha(255);
                photoViewer.f34230b0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                eg.q1 q1Var = photoViewer.M0;
                float f12 = 96.0f;
                if (photoViewer.f34348o1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                q1Var.setTranslationY(AndroidUtilities.dp(f10));
                org.telegram.ui.Components.rp0 rp0Var = photoViewer.P0;
                if (photoViewer.f34348o1) {
                    f11 = 154.0f;
                } else {
                    f11 = 96.0f;
                }
                rp0Var.setTranslationY(AndroidUtilities.dp(f11));
                fg.k1 k1Var = photoViewer.C;
                k1Var.setTranslationY(-k1Var.getHeight());
                yt0 yt0Var = photoViewer.N1;
                if (photoViewer.f34348o1) {
                    f12 = 154.0f;
                }
                yt0Var.setTranslationY(AndroidUtilities.dp(f12));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.f34447y7 = 0;
                return;
            default:
                yr0 yr0Var = (yr0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    du0 du0Var = yr0Var.f43699b.f34230b0;
                    boolean z10 = this.f43974b;
                    boolean z11 = this.f43975c;
                    int i14 = z10 ? 1 : 0;
                    boolean z12 = this.d;
                    if ((z11 ? 1 : 0) + i14 + (z12 ? 1 : 0) > 1) {
                        pcVar = org.telegram.ui.Components.pc.v;
                    } else if (z12) {
                        if (i13 > 1) {
                            pcVar = org.telegram.ui.Components.pc.f30019s;
                        } else {
                            pcVar = org.telegram.ui.Components.pc.f30018r;
                        }
                    } else if (z10) {
                        if (i13 > 1) {
                            pcVar = org.telegram.ui.Components.pc.f30017n;
                        } else {
                            pcVar = org.telegram.ui.Components.pc.h;
                        }
                    } else if (i13 > 1) {
                        pcVar = org.telegram.ui.Components.pc.f30016f;
                    } else {
                        pcVar = org.telegram.ui.Components.pc.f30015e;
                    }
                    new org.telegram.ui.Components.qc(du0Var, null).m(pcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public zq0(PhotoViewer photoViewer, File file, boolean z4, MessageObject messageObject, boolean z10, boolean z11) {
        this.f43976e = photoViewer;
        this.f43977f = file;
        this.f43974b = z4;
        this.h = messageObject;
        this.f43975c = z10;
        this.d = z11;
    }
}
