package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
public final class xm0 implements Runnable {
    public final int f52051a;
    public final PhotoViewer f52052b;

    public xm0(PhotoViewer photoViewer, int i3) {
        this.f52051a = i3;
        this.f52052b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f52051a) {
            case 0:
                PhotoViewer photoViewer = this.f52052b;
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.y0(false);
                org.telegram.ui.Components.ie0.f34683q0.d(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f52052b;
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer2.h3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f52052b;
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer3.z2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f52052b;
                Drawable[] drawableArr4 = PhotoViewer.V8;
                photoViewer4.z2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f52052b;
                Drawable[] drawableArr5 = PhotoViewer.V8;
                photoViewer5.z2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f52052b;
                Drawable[] drawableArr6 = PhotoViewer.V8;
                photoViewer6.c3();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f52052b;
                Drawable[] drawableArr7 = PhotoViewer.V8;
                photoViewer7.z2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f52052b;
                Drawable[] drawableArr8 = PhotoViewer.V8;
                photoViewer8.l2();
                return;
            case 8:
                org.telegram.ui.Components.ad0 ad0Var = this.f52052b.D1;
                pg.e eVar = ad0Var.f31809c;
                eVar.b(0.0f);
                eVar.setMirrored(false);
                eVar.setRotated(false);
                ad0Var.f31808b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f52052b;
                Drawable[] drawableArr9 = PhotoViewer.V8;
                photoViewer9.n0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f52052b;
                photoViewer10.r5.f36807b.setLoading(false);
                photoViewer10.h3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f52052b;
                photoViewer11.r5.f36807b.setLoading(false);
                photoViewer11.h3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f52052b;
                Drawable[] drawableArr10 = PhotoViewer.V8;
                photoViewer12.h3(0);
                return;
            case 13:
                this.f52052b.f41518q5.W = false;
                return;
            case 14:
                this.f52052b.f41601z4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f52052b;
                photoViewer13.f41460j7 = null;
                photoViewer13.n0();
                photoViewer13.h3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f52052b;
                photoViewer14.r5.f36807b.setLoading(false);
                photoViewer14.h3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f52052b;
                photoViewer15.r5.f36807b.setLoading(false);
                photoViewer15.h3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f52052b;
                Drawable[] drawableArr11 = PhotoViewer.V8;
                photoViewer16.v3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f52052b;
                Drawable[] drawableArr12 = PhotoViewer.V8;
                photoViewer17.l0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f52052b;
                Drawable[] drawableArr13 = PhotoViewer.V8;
                photoViewer18.q3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f52052b;
                if (photoViewer19.f41568w0.isEnabled()) {
                    Activity activity = photoViewer19.E;
                    Typeface typeface = org.telegram.messenger.g0.f22580a;
                    if (Settings.canDrawOverlays(activity) && !org.telegram.ui.Components.ie0.f34683q0.Q && photoViewer19.Q3) {
                        if (photoViewer19.f41553u4) {
                            tp0 tp0Var = photoViewer19.f41429g0;
                            if (tp0Var != null) {
                                if ((!tp0Var.f38729y || !"inapp".equals(org.telegram.messenger.hp.s1(tp0Var.f38719a).B3)) && photoViewer19.f41429g0.e()) {
                                    photoViewer19.L3 = false;
                                    if (PhotoViewer.f41370c9 != null) {
                                        PhotoViewer.f41370c9.Q0();
                                    }
                                    photoViewer19.K3 = true;
                                    PhotoViewer.f41370c9 = PhotoViewer.f41369b9;
                                    PhotoViewer.f41369b9 = null;
                                    photoViewer19.f41409e = false;
                                    mq0 mq0Var = photoViewer19.f41415e5;
                                    if (mq0Var != null) {
                                        ImageReceiver imageReceiver = mq0Var.f47751a;
                                        if (!imageReceiver.R0) {
                                            imageReceiver.O0(true, true);
                                        }
                                    }
                                    photoViewer19.f41492n6 = 1.0f;
                                    photoViewer19.f41420f0.invalidate();
                                    photoViewer19.T0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        photoViewer19.L3 = false;
                        photoViewer19.k3();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f52052b;
                if (photoViewer20.f41409e && photoViewer20.f41499o4 == 0) {
                    photoViewer20.y3(photoViewer20.K);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f52052b;
                Drawable[] drawableArr14 = PhotoViewer.V8;
                photoViewer21.I1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f52052b;
                org.telegram.ui.Components.m51 m51Var = photoViewer22.G2;
                if (m51Var != null && photoViewer22.f41388b6 <= 1.35f) {
                    long S = m51Var.S();
                    long U = photoViewer22.G2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f10 = photoViewer22.F7;
                        int m1 = photoViewer22.m1(photoViewer22.f41562v4);
                        if (U > 180000) {
                            int i3 = m1 / 3;
                            if (f10 < i3 * 2) {
                                if (f10 < i3) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f41386b4.startRewind(photoViewer22.G2, z11, photoViewer22.f41550u1);
                            return;
                        }
                        if (f10 > m1 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f41404d4.startRewind(photoViewer22.G2, z10, photoViewer22.F7, photoViewer22.f41550u1, photoViewer22.B1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f52052b;
                if (photoViewer23.V4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.V4;
                    org.telegram.ui.Components.m51 m51Var2 = photoViewer23.G2;
                    if (m51Var2 != null) {
                        z11 = m51Var2.d0();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.m51 m51Var3 = photoViewer23.G2;
                    if (m51Var3 != null) {
                        m51Var3.g0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.m51 m51Var4 = photoViewer23.G2;
                if (m51Var4 != null && photoViewer23.V4.videoWasPlaying) {
                    m51Var4.h0();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f52052b;
                Drawable[] drawableArr15 = PhotoViewer.V8;
                photoViewer24.H0(false, false);
                org.telegram.ui.Components.bi biVar = photoViewer24.f41384b2;
                if (biVar != null) {
                    biVar.a(true);
                }
                org.telegram.ui.ActionBar.d2 d2Var = photoViewer24.n4;
                if (d2Var != null) {
                    d2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f52052b.f41502o7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f52052b;
                Drawable[] drawableArr16 = PhotoViewer.V8;
                photoViewer25.C3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f52052b;
                photoViewer26.E1.e(photoViewer26.K2, photoViewer26.L2, photoViewer26.M2, photoViewer26.Q2, photoViewer26.S2, photoViewer26.P2, photoViewer26.u2(true), photoViewer26.u2(true), photoViewer26.N2, photoViewer26.O2, 0.0f, 0.0f, photoViewer26.R2);
                photoViewer26.h3(0);
                return;
        }
    }
}
