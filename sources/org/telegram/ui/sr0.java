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
public final class sr0 implements Runnable {
    public final int f40505a = 0;
    public final boolean f40506b;
    public final boolean f40507c;
    public final boolean d;
    public final Object f40508e;
    public final Serializable f40509f;
    public final Object h;

    public sr0(rs0 rs0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f40508e = rs0Var;
        this.f40509f = iArr;
        this.h = iArr2;
        this.f40506b = z10;
        this.f40507c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.xc xcVar;
        int i10 = this.f40505a;
        Object obj = this.h;
        Serializable serializable = this.f40509f;
        Object obj2 = this.f40508e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                MessageObject messageObject = (MessageObject) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i11 = photoViewer.V3;
                photoViewer.V3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f40506b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f33532c2 = 2;
                photoViewer.f33691u2 = false;
                photoViewer.d = new du0(photoViewer, photoViewer.d, messageObject, orientation, this.f40507c, this.d);
                photoViewer.f33645p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                co coVar = photoViewer.l4;
                if (coVar != null && coVar.Y != null && coVar.x9()) {
                    photoViewer.l4.Y.P();
                } else {
                    photoViewer.R1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f33549e0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                t5 t5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f33662r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                t5Var.setTranslationY(AndroidUtilities.dp(f7));
                ji.x1 x1Var = photoViewer.S0;
                if (photoViewer.f33662r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                x1Var.setTranslationY(AndroidUtilities.dp(f10));
                org.telegram.ui.Components.z7 z7Var = photoViewer.F;
                z7Var.setTranslationY(-z7Var.getHeight());
                qu0 qu0Var = photoViewer.Q1;
                if (photoViewer.f33662r1) {
                    f11 = 154.0f;
                }
                qu0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.B7 = 0;
                return;
            default:
                rs0 rs0Var = (rs0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    uu0 uu0Var = rs0Var.f40230b.f33549e0;
                    boolean z11 = this.f40506b;
                    boolean z12 = this.f40507c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        xcVar = org.telegram.ui.Components.xc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            xcVar = org.telegram.ui.Components.xc.f32500s;
                        } else {
                            xcVar = org.telegram.ui.Components.xc.f32499r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            xcVar = org.telegram.ui.Components.xc.f32498n;
                        } else {
                            xcVar = org.telegram.ui.Components.xc.h;
                        }
                    } else if (i13 > 1) {
                        xcVar = org.telegram.ui.Components.xc.f32497f;
                    } else {
                        xcVar = org.telegram.ui.Components.xc.f32496e;
                    }
                    new org.telegram.ui.Components.yc(uu0Var, null).m(xcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public sr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.f40508e = photoViewer;
        this.f40509f = file;
        this.f40506b = z10;
        this.h = messageObject;
        this.f40507c = z11;
        this.d = z12;
    }
}
