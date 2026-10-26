package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class xq0 implements Runnable {
    public final int f45835a;
    public final PhotoViewer f45836b;

    public xq0(PhotoViewer photoViewer, int i10) {
        this.f45835a = i10;
        this.f45836b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f45835a) {
            case 0:
                PhotoViewer photoViewer = this.f45836b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.y0(false);
                org.telegram.ui.Components.ch0.f27159p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f45836b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.g3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f45836b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.y2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f45836b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.y2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f45836b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.y2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f45836b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.b3();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f45836b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.y2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f45836b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.k2();
                return;
            case 8:
                org.telegram.ui.Components.of0 of0Var = this.f45836b.C1;
                ng.f fVar = of0Var.f31286c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                of0Var.f31285b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f45836b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.n0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f45836b;
                photoViewer10.q5.f28184b.setLoading(false);
                photoViewer10.g3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f45836b;
                photoViewer11.q5.f28184b.setLoading(false);
                photoViewer11.g3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f45836b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.g3(0);
                return;
            case 13:
                this.f45836b.f35747p5.V = false;
                return;
            case 14:
                this.f45836b.f35829y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f45836b;
                photoViewer13.f35688i7 = null;
                photoViewer13.n0();
                photoViewer13.g3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f45836b;
                photoViewer14.q5.f28184b.setLoading(false);
                photoViewer14.g3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f45836b;
                photoViewer15.q5.f28184b.setLoading(false);
                photoViewer15.g3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f45836b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.u3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f45836b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.l0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f45836b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.p3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f45836b;
                if (photoViewer19.f35796v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f35825y) && !org.telegram.ui.Components.ch0.f27159p0.P && photoViewer19.P3) {
                    if (photoViewer19.f35782t4) {
                        vt0 vt0Var = photoViewer19.f35656f0;
                        if (vt0Var != null) {
                            if ((!vt0Var.f30582x || !"inapp".equals(MessagesController.getInstance(vt0Var.f30574a).youtubePipType)) && photoViewer19.f35656f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f35607b9 != null) {
                                    PhotoViewer.f35607b9.Q0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f35607b9 = PhotoViewer.f35606a9;
                                PhotoViewer.f35606a9 = null;
                                photoViewer19.e = false;
                                qu0 qu0Var = photoViewer19.f35642d5;
                                if (qu0Var != null && !qu0Var.f42919a.getVisible()) {
                                    photoViewer19.f35642d5.f42919a.setVisible(true, true);
                                }
                                photoViewer19.f35720m6 = 1.0f;
                                photoViewer19.f35646e0.invalidate();
                                photoViewer19.T0();
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
                PhotoViewer photoViewer20 = this.f45836b;
                if (photoViewer20.e && photoViewer20.f35728n4 == 0) {
                    photoViewer20.x3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f45836b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.H1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f45836b;
                org.telegram.ui.Components.s81 s81Var = photoViewer22.F2;
                if (s81Var != null && photoViewer22.f35614a6 <= 1.35f) {
                    long n10 = s81Var.n();
                    long p10 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p10 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int l1 = photoViewer22.l1(photoViewer22.f35791u4);
                        if (p10 > 180000) {
                            int i10 = l1 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f35612a4.startRewind(photoViewer22.F2, z11, photoViewer22.f35779t1);
                            return;
                        }
                        if (f7 > l1 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f35632c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f35779t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f45836b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.s81 s81Var2 = photoViewer23.F2;
                    if (s81Var2 != null) {
                        z11 = s81Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.s81 s81Var3 = photoViewer23.F2;
                    if (s81Var3 != null) {
                        s81Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.s81 s81Var4 = photoViewer23.F2;
                if (s81Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    s81Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f45836b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.H0(false, false);
                org.telegram.ui.Components.ti tiVar = photoViewer24.a2;
                if (tiVar != null) {
                    tiVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.r2 r2Var = photoViewer24.f35718m4;
                if (r2Var != null) {
                    r2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f45836b.f35731n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f45836b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.B3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f45836b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.t2(true), photoViewer26.t2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.g3(0);
                return;
        }
    }
}
