package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry0 implements Utilities.Callback2 {
    public final int f40961a;
    public final boolean f40962b;
    public final NotificationCenter.NotificationCenterDelegate f40963c;

    public ry0(boolean z4, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f40961a = i10;
        this.f40963c = notificationCenterDelegate;
        this.f40962b = z4;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z4;
        float f10;
        org.telegram.ui.Components.jv0 jv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.f40961a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f40963c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.qc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z10 = this.f40962b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.qc.l(null, profileActivity, z10).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.qc.l(DialogObject.getShortName(profileActivity.f34569b1), profileActivity, z10).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.qc.b0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.U1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qh.ba baVar = (qh.ba) this.f40963c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = baVar.f45047c;
                if (obj != null && baVar.f45080m2 == null && !baVar.T && baVar.J()) {
                    int i11 = 0;
                    if (this.f40962b) {
                        if (baVar.H1 != null) {
                            baVar.u();
                            baVar.H1.f46013j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                qh.e9 e9Var = baVar.f45100s1;
                                e9Var.d0(e9Var.k0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                qh.e9 e9Var2 = baVar.f45100s1;
                                TLObject tLObject = (TLObject) obj;
                                e9Var2.f44938i2 = true;
                                qh.v4 v4Var = e9Var2.O0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f10 = closestPhotoSizeWithSize.f20870w / closestPhotoSizeWithSize.h;
                                } else {
                                    f10 = 1.0f;
                                }
                                if (f10 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(e9Var2.O1, v4Var.getMeasuredWidth()) * 0.5d);
                                    jv0Var = new org.telegram.ui.Components.jv0(floor, floor / f10);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(e9Var2.P1, v4Var.getMeasuredHeight()) * 0.5d);
                                    jv0Var = new org.telegram.ui.Components.jv0(f10 * floor2, floor2);
                                }
                                eg.t2 t2Var = new eg.t2(e9Var2.getContext(), e9Var2.e0(), jv0Var, tLObject);
                                t2Var.setDelegate(e9Var2);
                                v4Var.addView(t2Var);
                                e9Var2.g0();
                                e9Var2.d0(t2Var);
                            }
                            baVar.f(false);
                        } else {
                            return;
                        }
                    } else {
                        baVar.i0(false, true);
                        baVar.N0.a(baVar.L1);
                        qh.q5 q5Var = baVar.L0;
                        if (baVar.L1 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        q5Var.f45940k0 = -1.0f;
                        q5Var.f45941l0 = z4;
                        q5Var.invalidate();
                        baVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            baVar.L1 = i11;
                            qh.r6 l10 = qh.r6.l(photoEntry);
                            l10.M0 = bitmap;
                            l10.J0 = baVar.f45099s0;
                            l10.K0 = baVar.f45102t0;
                            l10.A();
                            baVar.I1 = true;
                            if (baVar.f45116x0.j()) {
                                baVar.D1 = null;
                                l10.P = 1.0f;
                                if (baVar.f45116x0.l(l10)) {
                                    baVar.H1 = qh.r6.a(baVar.f45116x0.getLayout(), baVar.f45116x0.getContent());
                                }
                                baVar.m0(true);
                            } else {
                                l10.B();
                                baVar.H1 = l10;
                                if (z11) {
                                    qh.e8.a(i10, l10);
                                }
                                baVar.K(1, true);
                            }
                        } else if (obj instanceof qh.r6) {
                            qh.r6 r6Var = (qh.r6) obj;
                            if (r6Var.L == null && !r6Var.v()) {
                                baVar.f45045b1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f17791w.c(r6Var);
                                return;
                            }
                            r6Var.J0 = baVar.f45099s0;
                            r6Var.K0 = baVar.f45102t0;
                            baVar.L1 = r6Var.K ? 1 : 0;
                            r6Var.M0 = bitmap;
                            baVar.I1 = false;
                            baVar.f45116x0.n(r6Var);
                            baVar.H1 = r6Var;
                            if (z11) {
                                qh.e8.a(i10, r6Var);
                            }
                            baVar.K(1, true);
                        } else {
                            return;
                        }
                    }
                    qh.b9 b9Var = baVar.J0;
                    if (b9Var != null) {
                        baVar.f45070i2 = b9Var.f46393e.e0();
                        baVar.f45073j2 = baVar.J0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                th.i0.m((th.i0) this.f40963c, this.f40962b, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
