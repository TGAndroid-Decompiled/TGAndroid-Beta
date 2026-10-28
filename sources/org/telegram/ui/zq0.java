package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class zq0 implements Runnable {
    public final int f46339a;
    public final PhotoViewer f46340b;

    public zq0(PhotoViewer photoViewer, int i10) {
        this.f46339a = i10;
        this.f46340b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f46339a) {
            case 0:
                PhotoViewer photoViewer = this.f46340b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.y0(false);
                org.telegram.ui.Components.dh0.f27444p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f46340b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.h3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f46340b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.z2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f46340b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.z2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f46340b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.z2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f46340b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.c3();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f46340b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.z2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f46340b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.l2();
                return;
            case 8:
                org.telegram.ui.Components.pf0 pf0Var = this.f46340b.C1;
                ng.f fVar = pf0Var.f31598c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                pf0Var.f31597b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f46340b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.n0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f46340b;
                photoViewer10.q5.f28578b.setLoading(false);
                photoViewer10.h3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f46340b;
                photoViewer11.q5.f28578b.setLoading(false);
                photoViewer11.h3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f46340b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.h3(0);
                return;
            case 13:
                this.f46340b.f35771p5.V = false;
                return;
            case 14:
                this.f46340b.f35853y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f46340b;
                photoViewer13.f35712i7 = null;
                photoViewer13.n0();
                photoViewer13.h3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f46340b;
                photoViewer14.q5.f28578b.setLoading(false);
                photoViewer14.h3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f46340b;
                photoViewer15.q5.f28578b.setLoading(false);
                photoViewer15.h3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f46340b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.v3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f46340b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.l0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f46340b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.q3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f46340b;
                if (photoViewer19.f35820v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f35849y) && !org.telegram.ui.Components.dh0.f27444p0.P && photoViewer19.P3) {
                    if (photoViewer19.f35806t4) {
                        xt0 xt0Var = photoViewer19.f35680f0;
                        if (xt0Var != null) {
                            if ((!xt0Var.f30914x || !"inapp".equals(MessagesController.getInstance(xt0Var.f30906a).youtubePipType)) && photoViewer19.f35680f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f35631b9 != null) {
                                    PhotoViewer.f35631b9.Q0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f35631b9 = PhotoViewer.f35630a9;
                                PhotoViewer.f35630a9 = null;
                                photoViewer19.e = false;
                                su0 su0Var = photoViewer19.f35666d5;
                                if (su0Var != null && !su0Var.f43406a.getVisible()) {
                                    photoViewer19.f35666d5.f43406a.setVisible(true, true);
                                }
                                photoViewer19.f35744m6 = 1.0f;
                                photoViewer19.f35670e0.invalidate();
                                photoViewer19.T0();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer19.K3 = false;
                    photoViewer19.k3();
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f46340b;
                if (photoViewer20.e && photoViewer20.f35752n4 == 0) {
                    photoViewer20.y3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f46340b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.I1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f46340b;
                org.telegram.ui.Components.t81 t81Var = photoViewer22.F2;
                if (t81Var != null && photoViewer22.f35638a6 <= 1.35f) {
                    long n10 = t81Var.n();
                    long p10 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p10 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int m12 = photoViewer22.m1(photoViewer22.f35815u4);
                        if (p10 > 180000) {
                            int i10 = m12 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f35636a4.startRewind(photoViewer22.F2, z11, photoViewer22.f35803t1);
                            return;
                        }
                        if (f7 > m12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f35656c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f35803t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f46340b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.t81 t81Var2 = photoViewer23.F2;
                    if (t81Var2 != null) {
                        z11 = t81Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.t81 t81Var3 = photoViewer23.F2;
                    if (t81Var3 != null) {
                        t81Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.t81 t81Var4 = photoViewer23.F2;
                if (t81Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    t81Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f46340b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.H0(false, false);
                org.telegram.ui.Components.ti tiVar = photoViewer24.a2;
                if (tiVar != null) {
                    tiVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.r2 r2Var = photoViewer24.f35742m4;
                if (r2Var != null) {
                    r2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f46340b.f35755n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f46340b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.C3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f46340b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.u2(true), photoViewer26.u2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.h3(0);
                return;
        }
    }
}
