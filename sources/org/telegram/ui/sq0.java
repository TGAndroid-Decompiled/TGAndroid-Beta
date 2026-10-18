package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class sq0 implements Runnable {
    public final int f41507a;
    public final PhotoViewer f41508b;

    public sq0(PhotoViewer photoViewer, int i10) {
        this.f41507a = i10;
        this.f41508b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f41507a) {
            case 0:
                PhotoViewer photoViewer = this.f41508b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.x0(false);
                org.telegram.ui.Components.zg0.f32912p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f41508b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f41508b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f41508b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f41508b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f41508b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.Z2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f41508b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f41508b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.i2();
                return;
            case 8:
                org.telegram.ui.Components.nf0 nf0Var = this.f41508b.C1;
                mg.f fVar = nf0Var.f28755c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                nf0Var.f28754b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f41508b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.m0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f41508b;
                photoViewer10.f33382q5.f25591b.setLoading(false);
                photoViewer10.e3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f41508b;
                photoViewer11.f33382q5.f25591b.setLoading(false);
                photoViewer11.e3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f41508b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.e3(0);
                return;
            case 13:
                this.f41508b.p5.V = false;
                return;
            case 14:
                this.f41508b.f33456y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f41508b;
                photoViewer13.f33315i7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f41508b;
                photoViewer14.f33382q5.f25591b.setLoading(false);
                photoViewer14.e3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f41508b;
                photoViewer15.f33382q5.f25591b.setLoading(false);
                photoViewer15.e3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f41508b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.s3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f41508b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.k0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f41508b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.n3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f41508b;
                if (photoViewer19.f33423v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f33452y) && !org.telegram.ui.Components.zg0.f32912p0.P && photoViewer19.P3) {
                    if (photoViewer19.f33409t4) {
                        qt0 qt0Var = photoViewer19.f33282f0;
                        if (qt0Var != null) {
                            if ((!qt0Var.f27878x || !"inapp".equals(MessagesController.getInstance(qt0Var.f27870a).youtubePipType)) && photoViewer19.f33282f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f33234b9 != null) {
                                    PhotoViewer.f33234b9.Q0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f33234b9 = PhotoViewer.f33233a9;
                                PhotoViewer.f33233a9 = null;
                                photoViewer19.e = false;
                                lu0 lu0Var = photoViewer19.f33269d5;
                                if (lu0Var != null && !lu0Var.f38961a.getVisible()) {
                                    photoViewer19.f33269d5.f38961a.setVisible(true, true);
                                }
                                photoViewer19.f33347m6 = 1.0f;
                                photoViewer19.f33273e0.invalidate();
                                photoViewer19.T0();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer19.K3 = false;
                    photoViewer19.h3();
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f41508b;
                if (photoViewer20.e && photoViewer20.f33355n4 == 0) {
                    photoViewer20.v3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f41508b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.G1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f41508b;
                org.telegram.ui.Components.a81 a81Var = photoViewer22.F2;
                if (a81Var != null && photoViewer22.f33241a6 <= 1.35f) {
                    long n10 = a81Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int k12 = photoViewer22.k1(photoViewer22.f33418u4);
                        if (p5 > 180000) {
                            int i10 = k12 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f33239a4.startRewind(photoViewer22.F2, z11, photoViewer22.f33406t1);
                            return;
                        }
                        if (f7 > k12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f33259c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f33406t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f41508b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.a81 a81Var2 = photoViewer23.F2;
                    if (a81Var2 != null) {
                        z11 = a81Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.a81 a81Var3 = photoViewer23.F2;
                    if (a81Var3 != null) {
                        a81Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.a81 a81Var4 = photoViewer23.F2;
                if (a81Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    a81Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f41508b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.ti tiVar = photoViewer24.a2;
                if (tiVar != null) {
                    tiVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer24.f33345m4;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f41508b.f33358n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f41508b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.z3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f41508b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.e3(0);
                return;
        }
    }
}
