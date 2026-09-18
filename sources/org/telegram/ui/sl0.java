package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sl0 implements Runnable {
    public final int f37370a;
    public final Object f37371b;

    public sl0(Object obj, int i10) {
        this.f37370a = i10;
        this.f37371b = obj;
    }

    @Override
    public final void run() {
        int i10;
        wp0 wp0Var;
        lk lkVar;
        int i11 = this.f37370a;
        int i12 = 0;
        Object obj = this.f37371b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((ee0) obj).f33267n).h0();
                return;
            case 1:
                PasskeysActivity.X((PasskeysActivity) obj);
                return;
            case 2:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    return;
                }
                SharedConfig.getCountryLangs();
                return;
            case 3:
                ((xm0) obj).f39521a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.e5.x0(((bn0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                ln0 ln0Var = (ln0) ((ci.p2) obj).f5303b;
                double d = currentTimeMillis - ln0Var.G;
                ln0Var.G = currentTimeMillis;
                int i13 = (int) (ln0Var.E - d);
                ln0Var.E = i13;
                if (i13 <= 1000) {
                    ln0Var.f35414r.setVisibility(0);
                    ln0Var.f35413n.setVisibility(8);
                    ln0Var.r();
                    return;
                }
                return;
            case 6:
                kn0 kn0Var = (kn0) obj;
                ln0 ln0Var2 = kn0Var.f35151a;
                int i14 = ln0Var2.f35418y;
                mn0 mn0Var = ln0Var2.f35415s;
                in0 in0Var = ln0Var2.f35413n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = ln0Var2.M;
                    if (i18 != 4 && i18 != 3) {
                        if (i18 == 2) {
                            in0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                        }
                    } else {
                        in0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (mn0Var != null) {
                        mn0Var.f35702c = 1.0f - (ln0Var2.f35418y / ln0Var2.P);
                        mn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (mn0Var != null) {
                    mn0Var.f35702c = 1.0f;
                    mn0Var.invalidate();
                }
                ln0Var2.s();
                int i19 = ln0Var2.L;
                if (i19 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(ln0Var2, NotificationCenter.didReceiveCall);
                    ln0Var2.I = false;
                    ln0Var2.r();
                    ln0Var2.u();
                    return;
                } else if (i19 == 2 || i19 == 4) {
                    int i20 = ln0Var2.M;
                    if (i20 != 4 && i20 != 2) {
                        if (i20 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(ln0Var2, NotificationCenter.didReceiveSmsCode);
                            ln0Var2.I = false;
                            ln0Var2.r();
                            ln0Var2.u();
                            return;
                        }
                        return;
                    }
                    if (i20 == 4) {
                        in0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        in0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    ln0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = ln0Var2.f35409a;
                    tL_auth_resendCode.phone_code_hash = ln0Var2.f35410b;
                    ConnectionsManager.getInstance(pn0.f0(ln0Var2.Q)).sendRequest(tL_auth_resendCode, new m(kn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                nf.f.s(((ho0) obj).f34200b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                xo0 xo0Var = ((mo0) obj).f35705a;
                xo0Var.t0();
                xo0Var.H0(true, false);
                xo0Var.D0(false);
                return;
            case 9:
                nf.f.s(((qo0) obj).f36866b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                up0 up0Var = (up0) obj;
                wp0 wp0Var2 = up0Var.f38082c;
                bq0 bq0Var = wp0Var2.E;
                cq0 cq0Var = wp0Var2.f39221p0;
                if (bq0Var != null && wp0Var2.L.size() > 1) {
                    bq0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) wp0Var2.M.get(1);
                    wp0Var2.K = starGift;
                    if (starGift == null) {
                        xh.v3 v3Var = wp0Var2.J;
                        if (v3Var != null) {
                            v3Var.f();
                            wp0Var2.J = null;
                        }
                    } else {
                        xh.v3 v3Var2 = wp0Var2.J;
                        if (v3Var2 == null || v3Var2.f46424b != starGift.f18521id) {
                            i10 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(wp0Var2.K.f18521id, i10, new s3(up0Var, 13));
                            wp0Var2.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    wp0.a(wp0Var2);
                    if (cq0Var.I.getCurrentPosition() == 1) {
                        wp0Var = cq0Var.f32751n;
                    } else {
                        wp0Var = cq0Var.h;
                    }
                    wp0Var.e();
                    return;
                }
                return;
            case 11:
                cr0 cr0Var = ((tq0) obj).h;
                cr0Var.b0(cr0Var.P.getSearchField());
                return;
            case 12:
                ((uq0) obj).f38089z0.L.l();
                return;
            case 13:
                ((vu0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.s2(vVar.f6181a);
                if (photoViewer.f31165c2 == 1) {
                    long j3 = vVar.f6181a;
                    photoViewer.X7 = j3;
                    if (photoViewer.W7 != j3) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f6183c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((et0) obj).f33356a;
                ImageView imageView = photoViewer2.E3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.E3.getParent()).removeView(photoViewer2.E3);
                    if (photoViewer2.D3 != null) {
                        ImageView imageView2 = photoViewer2.E3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        AndroidUtilities.recycleBitmap(photoViewer2.D3);
                        photoViewer2.D3 = null;
                    }
                    photoViewer2.E3 = null;
                    return;
                }
                return;
            case 16:
                zn znVar = ((gt0) obj).f33940d1.l4;
                if (znVar != null && (lkVar = znVar.Y) != null) {
                    lkVar.H0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.al0 al0Var = (org.telegram.ui.Components.al0) ((gp0) obj).f33912b;
                PhotoViewer photoViewer3 = (PhotoViewer) al0Var.f22650c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.u71 u71Var = photoViewer3.F2;
                if (u71Var != null) {
                    u71Var.C();
                }
                ((PhotoViewer) al0Var.f22650c).I2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((ts0) obj).f37802a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.u71 u71Var2 = photoViewer4.F2;
                if (u71Var2 != null) {
                    u71Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 19:
                fu0 fu0Var = (fu0) ((gp0) obj).f33912b;
                fu0Var.f33617r.f31247l7.unlock();
                PhotoViewer photoViewer5 = fu0Var.f33617r;
                Runnable runnable = photoViewer5.f31280p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f31280p4 = null;
                }
                photoViewer5.x2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((it0) obj).f34623b;
                Runnable runnable2 = photoViewer6.f31280p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f31280p4 = null;
                    return;
                }
                return;
            case 21:
                ((qu0) obj).f44710s.d(true);
                return;
            case 22:
                ((uu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((cx0) obj).f32813c;
                premiumPreviewFragment.showDialog(new h41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 24:
                ((org.telegram.messenger.nk) obj).run(0);
                return;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                return;
            case 26:
                ((ci.f4) obj).e(true);
                return;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            case 28:
                gz0 gz0Var = (gz0) obj;
                gz0Var.G.getNotificationCenter().onAnimationFinish(gz0Var.F);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.n6) obj).f5075c;
                if (profileActivity.f31578n5 != 1.0f) {
                    pz0 pz0Var = profileActivity.f31573n0;
                    while (pz0Var.D0.k(i12) != pz0Var.getRealCount() - 1) {
                        i12++;
                    }
                    pz0Var.x(i12, true);
                    return;
                }
                return;
        }
    }
}
