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
public final class ur0 implements Runnable {
    public final int f38182a = 0;
    public final boolean f38183b;
    public final boolean f38184c;
    public final boolean d;
    public final Object e;
    public final Serializable f38185f;
    public final Object h;

    public ur0(us0 us0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = us0Var;
        this.f38185f = iArr;
        this.h = iArr2;
        this.f38183b = z10;
        this.f38184c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.uc ucVar;
        int i10 = this.f38182a;
        Object obj = this.h;
        Serializable serializable = this.f38185f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                MessageObject messageObject = (MessageObject) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i11 = photoViewer.V3;
                photoViewer.V3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f38183b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f30938c2 = 2;
                photoViewer.f31096u2 = false;
                photoViewer.d = new gu0(photoViewer, photoViewer.d, messageObject, orientation, this.f38184c, this.d);
                photoViewer.f31050p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.o3(false, false);
                photoViewer.i3(true, false);
                bo boVar = photoViewer.l4;
                if (boVar != null && boVar.Y != null && boVar.x9()) {
                    photoViewer.l4.Y.Q();
                } else {
                    photoViewer.R1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f30954e0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                t5 t5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f31067r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                t5Var.setTranslationY(AndroidUtilities.dp(f7));
                ii.y1 y1Var = photoViewer.S0;
                if (photoViewer.f31067r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                y1Var.setTranslationY(AndroidUtilities.dp(f10));
                org.telegram.ui.Components.w7 w7Var = photoViewer.F;
                w7Var.setTranslationY(-w7Var.getHeight());
                tu0 tu0Var = photoViewer.Q1;
                if (photoViewer.f31067r1) {
                    f11 = 154.0f;
                }
                tu0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.K0();
                photoViewer.f3();
                photoViewer.B7 = 0;
                return;
            default:
                us0 us0Var = (us0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    xu0 xu0Var = us0Var.f38197b.f30954e0;
                    boolean z11 = this.f38183b;
                    boolean z12 = this.f38184c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        ucVar = org.telegram.ui.Components.uc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            ucVar = org.telegram.ui.Components.uc.f28327s;
                        } else {
                            ucVar = org.telegram.ui.Components.uc.f28326r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            ucVar = org.telegram.ui.Components.uc.f28325n;
                        } else {
                            ucVar = org.telegram.ui.Components.uc.h;
                        }
                    } else if (i13 > 1) {
                        ucVar = org.telegram.ui.Components.uc.f28324f;
                    } else {
                        ucVar = org.telegram.ui.Components.uc.e;
                    }
                    new org.telegram.ui.Components.vc(xu0Var, null).m(ucVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public ur0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f38185f = file;
        this.f38183b = z10;
        this.h = messageObject;
        this.f38184c = z11;
        this.d = z12;
    }
}
