package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class qq0 implements Runnable {
    public final int f40954a;
    public final PhotoViewer f40955b;

    public qq0(PhotoViewer photoViewer, int i10) {
        this.f40954a = i10;
        this.f40955b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f40954a) {
            case 0:
                PhotoViewer photoViewer = this.f40955b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.y0(false);
                org.telegram.ui.Components.ah0.f24598p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f40955b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.g3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f40955b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.y2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f40955b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.y2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f40955b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.y2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f40955b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.b3();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f40955b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.y2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f40955b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.k2();
                return;
            case 8:
                org.telegram.ui.Components.of0 of0Var = this.f40955b.C1;
                mg.f fVar = of0Var.f29038c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                of0Var.f29037b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f40955b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.n0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f40955b;
                photoViewer10.f33388q5.f25897b.setLoading(false);
                photoViewer10.g3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f40955b;
                photoViewer11.f33388q5.f25897b.setLoading(false);
                photoViewer11.g3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f40955b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.g3(0);
                return;
            case 13:
                this.f40955b.p5.V = false;
                return;
            case 14:
                this.f40955b.f33462y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f40955b;
                photoViewer13.f33321i7 = null;
                photoViewer13.n0();
                photoViewer13.g3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f40955b;
                photoViewer14.f33388q5.f25897b.setLoading(false);
                photoViewer14.g3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f40955b;
                photoViewer15.f33388q5.f25897b.setLoading(false);
                photoViewer15.g3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f40955b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.u3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f40955b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.l0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f40955b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.p3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f40955b;
                if (photoViewer19.f33429v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f33458y) && !org.telegram.ui.Components.ah0.f24598p0.P && photoViewer19.P3) {
                    if (photoViewer19.f33415t4) {
                        ot0 ot0Var = photoViewer19.f33288f0;
                        if (ot0Var != null) {
                            if ((!ot0Var.f28159x || !"inapp".equals(MessagesController.getInstance(ot0Var.f28151a).youtubePipType)) && photoViewer19.f33288f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f33240b9 != null) {
                                    PhotoViewer.f33240b9.R0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f33240b9 = PhotoViewer.f33239a9;
                                PhotoViewer.f33239a9 = null;
                                photoViewer19.e = false;
                                ju0 ju0Var = photoViewer19.f33275d5;
                                if (ju0Var != null && !ju0Var.f38351a.getVisible()) {
                                    photoViewer19.f33275d5.f38351a.setVisible(true, true);
                                }
                                photoViewer19.f33353m6 = 1.0f;
                                photoViewer19.f33279e0.invalidate();
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
                PhotoViewer photoViewer20 = this.f40955b;
                if (photoViewer20.e && photoViewer20.f33361n4 == 0) {
                    photoViewer20.x3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f40955b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.H1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f40955b;
                org.telegram.ui.Components.c81 c81Var = photoViewer22.F2;
                if (c81Var != null && photoViewer22.f33247a6 <= 1.35f) {
                    long n10 = c81Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int l1 = photoViewer22.l1(photoViewer22.f33424u4);
                        if (p5 > 180000) {
                            int i10 = l1 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f33245a4.startRewind(photoViewer22.F2, z11, photoViewer22.f33412t1);
                            return;
                        }
                        if (f7 > l1 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f33265c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f33412t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f40955b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.c81 c81Var2 = photoViewer23.F2;
                    if (c81Var2 != null) {
                        z11 = c81Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.c81 c81Var3 = photoViewer23.F2;
                    if (c81Var3 != null) {
                        c81Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.c81 c81Var4 = photoViewer23.F2;
                if (c81Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    c81Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f40955b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.H0(false, false);
                org.telegram.ui.Components.ti tiVar = photoViewer24.a2;
                if (tiVar != null) {
                    tiVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer24.f33351m4;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f40955b.f33364n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f40955b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.B3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f40955b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.t2(true), photoViewer26.t2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.g3(0);
                return;
        }
    }
}
