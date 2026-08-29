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
public final class qq0 implements Runnable {
    public final int f41762a = 0;
    public final boolean f41763b;
    public final boolean f41764c;
    public final boolean d;
    public final Object f41765e;
    public final Serializable f41766f;
    public final Object h;

    public qq0(or0 or0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f41765e = or0Var;
        this.f41766f = iArr;
        this.h = iArr2;
        this.f41763b = z10;
        this.f41764c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f9;
        float f10;
        org.telegram.ui.Components.sc scVar;
        int i10 = this.f41762a;
        Object obj = this.h;
        Serializable serializable = this.f41766f;
        Object obj2 = this.f41765e;
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
                boolean z10 = this.f41763b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.Y1 = 2;
                photoViewer.f35793q2 = false;
                photoViewer.d = new at0(photoViewer, photoViewer.d, messageObject, orientation, this.f41764c, this.d);
                photoViewer.l1.l();
                if (photoViewer.Q6 == null) {
                    photoViewer.Q6 = VelocityTracker.obtain();
                }
                photoViewer.f35862x7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                tn tnVar = photoViewer.f35715h4;
                if (tnVar != null && tnVar.U != null && tnVar.x9()) {
                    photoViewer.f35715h4.U.P();
                } else {
                    photoViewer.R1();
                }
                photoViewer.H0.setAlpha(255);
                photoViewer.f35647a0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                bg.u1 u1Var = photoViewer.L0;
                float f11 = 96.0f;
                if (photoViewer.f35765n1) {
                    f9 = 154.0f;
                } else {
                    f9 = 96.0f;
                }
                u1Var.setTranslationY(AndroidUtilities.dp(f9));
                org.telegram.ui.Components.hp0 hp0Var = photoViewer.O0;
                if (photoViewer.f35765n1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                hp0Var.setTranslationY(AndroidUtilities.dp(f10));
                cg.m1 m1Var = photoViewer.B;
                m1Var.setTranslationY(-m1Var.getHeight());
                nt0 nt0Var = photoViewer.M1;
                if (photoViewer.f35765n1) {
                    f11 = 154.0f;
                }
                nt0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.f35862x7 = 0;
                return;
            default:
                or0 or0Var = (or0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    rt0 rt0Var = or0Var.f41216b.f35647a0;
                    boolean z11 = this.f41763b;
                    boolean z12 = this.f41764c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        scVar = org.telegram.ui.Components.sc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            scVar = org.telegram.ui.Components.sc.f32606s;
                        } else {
                            scVar = org.telegram.ui.Components.sc.f32605r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            scVar = org.telegram.ui.Components.sc.f32604n;
                        } else {
                            scVar = org.telegram.ui.Components.sc.h;
                        }
                    } else if (i13 > 1) {
                        scVar = org.telegram.ui.Components.sc.f32603f;
                    } else {
                        scVar = org.telegram.ui.Components.sc.f32602e;
                    }
                    new org.telegram.ui.Components.tc(rt0Var, null).m(scVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public qq0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.f41765e = photoViewer;
        this.f41766f = file;
        this.f41763b = z10;
        this.h = messageObject;
        this.f41764c = z11;
        this.d = z12;
    }
}
