package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class tq0 implements Runnable {
    public final int f42063a;
    public final PhotoViewer f42064b;

    public tq0(PhotoViewer photoViewer, int i10) {
        this.f42063a = i10;
        this.f42064b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f42063a) {
            case 0:
                PhotoViewer photoViewer = this.f42064b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.y0(false);
                org.telegram.ui.Components.dh0.f25631p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f42064b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.g3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f42064b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.y2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f42064b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.y2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f42064b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.y2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f42064b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.b3();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f42064b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.y2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f42064b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.k2();
                return;
            case 8:
                org.telegram.ui.Components.rf0 rf0Var = this.f42064b.C1;
                mg.f fVar = rf0Var.f30164c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                rf0Var.f30163b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f42064b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.n0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f42064b;
                photoViewer10.f33689q5.f27314b.setLoading(false);
                photoViewer10.g3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f42064b;
                photoViewer11.f33689q5.f27314b.setLoading(false);
                photoViewer11.g3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f42064b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.g3(0);
                return;
            case 13:
                this.f42064b.p5.V = false;
                return;
            case 14:
                this.f42064b.f33763y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f42064b;
                photoViewer13.f33622i7 = null;
                photoViewer13.n0();
                photoViewer13.g3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f42064b;
                photoViewer14.f33689q5.f27314b.setLoading(false);
                photoViewer14.g3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f42064b;
                photoViewer15.f33689q5.f27314b.setLoading(false);
                photoViewer15.g3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f42064b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.u3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f42064b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.l0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f42064b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.p3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f42064b;
                if (photoViewer19.f33730v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f33759y) && !org.telegram.ui.Components.dh0.f25631p0.P && photoViewer19.P3) {
                    if (photoViewer19.f33716t4) {
                        rt0 rt0Var = photoViewer19.f33589f0;
                        if (rt0Var != null) {
                            if ((!rt0Var.f29558x || !"inapp".equals(MessagesController.getInstance(rt0Var.f29550a).youtubePipType)) && photoViewer19.f33589f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f33541b9 != null) {
                                    PhotoViewer.f33541b9.R0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f33541b9 = PhotoViewer.f33540a9;
                                PhotoViewer.f33540a9 = null;
                                photoViewer19.e = false;
                                mu0 mu0Var = photoViewer19.f33576d5;
                                if (mu0Var != null && !mu0Var.f39692a.getVisible()) {
                                    photoViewer19.f33576d5.f39692a.setVisible(true, true);
                                }
                                photoViewer19.f33654m6 = 1.0f;
                                photoViewer19.f33580e0.invalidate();
                                photoViewer19.U0();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer19.K3 = false;
                    photoViewer19.j3();
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f42064b;
                if (photoViewer20.e && photoViewer20.f33662n4 == 0) {
                    photoViewer20.x3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f42064b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.H1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f42064b;
                org.telegram.ui.Components.j81 j81Var = photoViewer22.F2;
                if (j81Var != null && photoViewer22.f33548a6 <= 1.35f) {
                    long n10 = j81Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int l1 = photoViewer22.l1(photoViewer22.f33725u4);
                        if (p5 > 180000) {
                            int i10 = l1 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f33546a4.startRewind(photoViewer22.F2, z11, photoViewer22.f33713t1);
                            return;
                        }
                        if (f7 > l1 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f33566c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f33713t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f42064b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.j81 j81Var2 = photoViewer23.F2;
                    if (j81Var2 != null) {
                        z11 = j81Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.j81 j81Var3 = photoViewer23.F2;
                    if (j81Var3 != null) {
                        j81Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.j81 j81Var4 = photoViewer23.F2;
                if (j81Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    j81Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f42064b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.H0(false, false);
                org.telegram.ui.Components.ti tiVar = photoViewer24.a2;
                if (tiVar != null) {
                    tiVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = photoViewer24.f33652m4;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f42064b.f33665n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f42064b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.B3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f42064b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.t2(true), photoViewer26.t2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.g3(0);
                return;
        }
    }
}
