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
public final class tr0 implements Runnable {
    public final int f37796a = 0;
    public final boolean f37797b;
    public final boolean f37798c;
    public final boolean d;
    public final Object e;
    public final Serializable f37799f;
    public final Object h;

    public tr0(ss0 ss0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = ss0Var;
        this.f37799f = iArr;
        this.h = iArr2;
        this.f37797b = z10;
        this.f37798c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.wc wcVar;
        int i10 = this.f37796a;
        Object obj = this.h;
        Serializable serializable = this.f37799f;
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
                boolean z10 = this.f37797b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f31165c2 = 2;
                photoViewer.f31323u2 = false;
                photoViewer.d = new eu0(photoViewer, photoViewer.d, messageObject, orientation, this.f37798c, this.d);
                photoViewer.f31277p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.o3(false, false);
                photoViewer.i3(true, false);
                zn znVar = photoViewer.l4;
                if (znVar != null && znVar.Y != null && znVar.x9()) {
                    photoViewer.l4.Y.P();
                } else {
                    photoViewer.R1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f31181e0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                t5 t5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f31294r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                t5Var.setTranslationY(AndroidUtilities.dp(f7));
                ii.y1 y1Var = photoViewer.S0;
                if (photoViewer.f31294r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                y1Var.setTranslationY(AndroidUtilities.dp(f10));
                org.telegram.ui.Components.y7 y7Var = photoViewer.F;
                y7Var.setTranslationY(-y7Var.getHeight());
                ru0 ru0Var = photoViewer.Q1;
                if (photoViewer.f31294r1) {
                    f11 = 154.0f;
                }
                ru0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.K0();
                photoViewer.f3();
                photoViewer.B7 = 0;
                return;
            default:
                ss0 ss0Var = (ss0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    vu0 vu0Var = ss0Var.f37466b.f31181e0;
                    boolean z11 = this.f37797b;
                    boolean z12 = this.f37798c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        wcVar = org.telegram.ui.Components.wc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            wcVar = org.telegram.ui.Components.wc.f30017s;
                        } else {
                            wcVar = org.telegram.ui.Components.wc.f30016r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            wcVar = org.telegram.ui.Components.wc.f30015n;
                        } else {
                            wcVar = org.telegram.ui.Components.wc.h;
                        }
                    } else if (i13 > 1) {
                        wcVar = org.telegram.ui.Components.wc.f30014f;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.e;
                    }
                    new org.telegram.ui.Components.xc(vu0Var, null).m(wcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public tr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f37799f = file;
        this.f37797b = z10;
        this.h = messageObject;
        this.f37798c = z11;
        this.d = z12;
    }
}
