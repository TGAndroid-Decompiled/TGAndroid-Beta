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

public final class rq0 implements Runnable {

    public final int f42314a = 0;

    public final boolean f42315b;

    public final boolean f42316c;
    public final boolean d;

    public final Object f42317e;

    public final Serializable f42318f;
    public final Object h;

    public rq0(qr0 qr0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f42317e = qr0Var;
        this.f42318f = iArr;
        this.h = iArr2;
        this.f42315b = z10;
        this.f42316c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lc lcVar;
        int i10 = this.f42314a;
        Object obj = this.h;
        Serializable serializable = this.f42318f;
        Object obj2 = this.f42317e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                MessageObject messageObject = (MessageObject) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i11 = photoViewer.R3;
                photoViewer.R3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f42315b;
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, z10 ? 0 : ((Integer) imageOrientation.first).intValue(), z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.Y1 = 2;
                photoViewer.f35729q2 = false;
                photoViewer.d = new dt0(photoViewer, photoViewer.d, messageObject, orientation, this.f42316c, this.d);
                photoViewer.l1.l();
                if (photoViewer.Q6 == null) {
                    photoViewer.Q6 = VelocityTracker.obtain();
                }
                photoViewer.f35799x7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                rn rnVar = photoViewer.f35652h4;
                if (rnVar == null || rnVar.U == null || !rnVar.x9()) {
                    photoViewer.R1();
                } else {
                    photoViewer.f35652h4.U.P();
                }
                photoViewer.H0.setAlpha(255);
                photoViewer.f35583a0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                photoViewer.L0.setTranslationY(AndroidUtilities.dp(photoViewer.f35702n1 ? 154.0f : 96.0f));
                photoViewer.O0.setTranslationY(AndroidUtilities.dp(photoViewer.f35702n1 ? 154.0f : 96.0f));
                ag.d2 d2Var = photoViewer.B;
                d2Var.setTranslationY(-d2Var.getHeight());
                photoViewer.M1.setTranslationY(AndroidUtilities.dp(photoViewer.f35702n1 ? 154.0f : 96.0f));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.f35799x7 = 0;
                break;
            default:
                qr0 qr0Var = (qr0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    ut0 ut0Var = qr0Var.f41739b.f35583a0;
                    boolean z11 = this.f42315b;
                    int i14 = (this.f42316c ? 1 : 0) + (z11 ? 1 : 0);
                    boolean z12 = this.d;
                    if (i14 + (z12 ? 1 : 0) > 1) {
                        lcVar = org.telegram.ui.Components.lc.v;
                    } else if (z12) {
                        lcVar = i13 > 1 ? org.telegram.ui.Components.lc.f30343s : org.telegram.ui.Components.lc.f30342r;
                    } else if (z11) {
                        lcVar = i13 > 1 ? org.telegram.ui.Components.lc.f30341n : org.telegram.ui.Components.lc.h;
                    } else {
                        lcVar = i13 > 1 ? org.telegram.ui.Components.lc.f30340f : org.telegram.ui.Components.lc.f30339e;
                    }
                    new org.telegram.ui.Components.mc(ut0Var, null).m(lcVar, i13, -115203550, -1, null).j();
                }
                break;
        }
    }

    public rq0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.f42317e = photoViewer;
        this.f42318f = file;
        this.f42315b = z10;
        this.h = messageObject;
        this.f42316c = z11;
        this.d = z12;
    }
}
