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
    public final int f36745a = 0;
    public final boolean f36746b;
    public final boolean f36747c;
    public final boolean d;
    public final Object e;
    public final Serializable f36748f;
    public final Object h;

    public sr0(rs0 rs0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = rs0Var;
        this.f36748f = iArr;
        this.h = iArr2;
        this.f36746b = z10;
        this.f36747c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.vc vcVar;
        int i10 = this.f36745a;
        Object obj = this.h;
        Serializable serializable = this.f36748f;
        Object obj2 = this.e;
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
                boolean z10 = this.f36746b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f30033c2 = 2;
                photoViewer.f30191u2 = false;
                photoViewer.d = new du0(photoViewer, photoViewer.d, messageObject, orientation, this.f36747c, this.d);
                photoViewer.f30145p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                eo eoVar = photoViewer.l4;
                if (eoVar != null && eoVar.Y != null && eoVar.x9()) {
                    photoViewer.l4.Y.P();
                } else {
                    photoViewer.R1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f30049e0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                u5 u5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f30162r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                u5Var.setTranslationY(AndroidUtilities.dp(f7));
                hi.b2 b2Var = photoViewer.S0;
                if (photoViewer.f30162r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                b2Var.setTranslationY(AndroidUtilities.dp(f10));
                org.telegram.ui.Components.y7 y7Var = photoViewer.F;
                y7Var.setTranslationY(-y7Var.getHeight());
                ru0 ru0Var = photoViewer.Q1;
                if (photoViewer.f30162r1) {
                    f11 = 154.0f;
                }
                ru0Var.setTranslationY(AndroidUtilities.dp(f11));
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
                    wu0 wu0Var = rs0Var.f36451b.f30049e0;
                    boolean z11 = this.f36746b;
                    boolean z12 = this.f36747c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        vcVar = org.telegram.ui.Components.vc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            vcVar = org.telegram.ui.Components.vc.f27910s;
                        } else {
                            vcVar = org.telegram.ui.Components.vc.f27909r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            vcVar = org.telegram.ui.Components.vc.f27908n;
                        } else {
                            vcVar = org.telegram.ui.Components.vc.h;
                        }
                    } else if (i13 > 1) {
                        vcVar = org.telegram.ui.Components.vc.f27907f;
                    } else {
                        vcVar = org.telegram.ui.Components.vc.e;
                    }
                    new org.telegram.ui.Components.wc(wu0Var, null).m(vcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public sr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f36748f = file;
        this.f36746b = z10;
        this.h = messageObject;
        this.f36747c = z11;
        this.d = z12;
    }
}
