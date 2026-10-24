package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class sq0 implements Runnable {
    public final int f41787a;
    public final PhotoViewer f41788b;

    public sq0(PhotoViewer photoViewer, int i10) {
        this.f41787a = i10;
        this.f41788b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f41787a) {
            case 0:
                PhotoViewer photoViewer = this.f41788b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.y0(false);
                org.telegram.ui.Components.ch0.f25313p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f41788b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.g3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f41788b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.y2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f41788b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.y2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f41788b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.y2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f41788b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.b3();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f41788b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.y2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f41788b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.k2();
                return;
            case 8:
                org.telegram.ui.Components.qf0 qf0Var = this.f41788b.C1;
                mg.f fVar = qf0Var.f29904c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                qf0Var.f29903b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f41788b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.n0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f41788b;
                photoViewer10.f33691q5.f27028b.setLoading(false);
                photoViewer10.g3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f41788b;
                photoViewer11.f33691q5.f27028b.setLoading(false);
                photoViewer11.g3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f41788b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.g3(0);
                return;
            case 13:
                this.f41788b.p5.V = false;
                return;
            case 14:
                this.f41788b.f33765y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f41788b;
                photoViewer13.f33624i7 = null;
                photoViewer13.n0();
                photoViewer13.g3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f41788b;
                photoViewer14.f33691q5.f27028b.setLoading(false);
                photoViewer14.g3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f41788b;
                photoViewer15.f33691q5.f27028b.setLoading(false);
                photoViewer15.g3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f41788b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.u3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f41788b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.l0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f41788b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.p3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f41788b;
                if (photoViewer19.f33732v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f33761y) && !org.telegram.ui.Components.ch0.f25313p0.P && photoViewer19.P3) {
                    if (photoViewer19.f33718t4) {
                        qt0 qt0Var = photoViewer19.f33591f0;
                        if (qt0Var != null) {
                            if ((!qt0Var.f29277x || !"inapp".equals(MessagesController.getInstance(qt0Var.f29269a).youtubePipType)) && photoViewer19.f33591f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f33543b9 != null) {
                                    PhotoViewer.f33543b9.R0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f33543b9 = PhotoViewer.f33542a9;
                                PhotoViewer.f33542a9 = null;
                                photoViewer19.e = false;
                                lu0 lu0Var = photoViewer19.f33578d5;
                                if (lu0Var != null && !lu0Var.f39381a.getVisible()) {
                                    photoViewer19.f33578d5.f39381a.setVisible(true, true);
                                }
                                photoViewer19.f33656m6 = 1.0f;
                                photoViewer19.f33582e0.invalidate();
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
                PhotoViewer photoViewer20 = this.f41788b;
                if (photoViewer20.e && photoViewer20.f33664n4 == 0) {
                    photoViewer20.x3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f41788b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.H1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f41788b;
                org.telegram.ui.Components.j81 j81Var = photoViewer22.F2;
                if (j81Var != null && photoViewer22.f33550a6 <= 1.35f) {
                    long n10 = j81Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int l1 = photoViewer22.l1(photoViewer22.f33727u4);
                        if (p5 > 180000) {
                            int i10 = l1 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f33548a4.startRewind(photoViewer22.F2, z11, photoViewer22.f33715t1);
                            return;
                        }
                        if (f7 > l1 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f33568c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f33715t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f41788b;
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
                PhotoViewer photoViewer24 = this.f41788b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.H0(false, false);
                org.telegram.ui.Components.ri riVar = photoViewer24.a2;
                if (riVar != null) {
                    riVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = photoViewer24.f33654m4;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f41788b.f33667n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f41788b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.B3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f41788b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.t2(true), photoViewer26.t2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.g3(0);
                return;
        }
    }
}
