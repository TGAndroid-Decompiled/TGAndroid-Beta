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
public final class sk0 implements Runnable {
    public final int f41792a;
    public final Object f41793b;

    public sk0(Object obj, int i10) {
        this.f41792a = i10;
        this.f41793b = obj;
    }

    @Override
    public final void run() {
        int i10;
        tp0 tp0Var;
        ok okVar;
        int i11 = this.f41792a;
        Object obj = this.f41793b;
        switch (i11) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
            case 1:
                ((PasscodeActivity) ((be0) obj).f36384n).k0();
                return;
            case 2:
                PasskeysActivity.X((PasskeysActivity) obj);
                return;
            case 3:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    return;
                }
                SharedConfig.getCountryLangs();
                return;
            case 4:
                ((um0) obj).f42684a.finishFragment();
                return;
            case 5:
                org.telegram.ui.Components.g5.w0(((ym0) obj).f44493e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                in0 in0Var = (in0) ((ci.n2) obj).f5630b;
                double d = currentTimeMillis - in0Var.G;
                in0Var.G = currentTimeMillis;
                int i12 = (int) (in0Var.E - d);
                in0Var.E = i12;
                if (i12 <= 1000) {
                    in0Var.f38760r.setVisibility(0);
                    in0Var.f38759n.setVisibility(8);
                    in0Var.r();
                    return;
                }
                return;
            case 7:
                hn0 hn0Var = (hn0) obj;
                in0 in0Var2 = hn0Var.f38517a;
                int i13 = in0Var2.f38764y;
                jn0 jn0Var = in0Var2.f38761s;
                fn0 fn0Var = in0Var2.f38759n;
                if (i13 >= 1000) {
                    int i14 = i13 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = in0Var2.M;
                    if (i17 != 4 && i17 != 3) {
                        if (i17 == 2) {
                            fn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                        }
                    } else {
                        fn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (jn0Var != null) {
                        jn0Var.f39123c = 1.0f - (in0Var2.f38764y / in0Var2.P);
                        jn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (jn0Var != null) {
                    jn0Var.f39123c = 1.0f;
                    jn0Var.invalidate();
                }
                in0Var2.s();
                int i18 = in0Var2.L;
                if (i18 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(in0Var2, NotificationCenter.didReceiveCall);
                    in0Var2.I = false;
                    in0Var2.r();
                    in0Var2.t();
                    return;
                } else if (i18 == 2 || i18 == 4) {
                    int i19 = in0Var2.M;
                    if (i19 != 4 && i19 != 2) {
                        if (i19 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(in0Var2, NotificationCenter.didReceiveSmsCode);
                            in0Var2.I = false;
                            in0Var2.r();
                            in0Var2.t();
                            return;
                        }
                        return;
                    }
                    if (i19 == 4) {
                        fn0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        fn0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    in0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = in0Var2.f38754a;
                    tL_auth_resendCode.phone_code_hash = in0Var2.f38755b;
                    ConnectionsManager.getInstance(mn0.e0(in0Var2.Q)).sendRequest(tL_auth_resendCode, new m(hn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 8:
                of.f.s(((eo0) obj).f37446b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 9:
                uo0 uo0Var = ((jo0) obj).f39126a;
                uo0Var.t0();
                uo0Var.H0(true, false);
                uo0Var.D0(false);
                return;
            case 10:
                of.f.s(((no0) obj).f40334b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                rp0 rp0Var = (rp0) obj;
                tp0 tp0Var2 = rp0Var.f41520c;
                yp0 yp0Var = tp0Var2.E;
                zp0 zp0Var = tp0Var2.f42275p0;
                if (yp0Var != null && tp0Var2.L.size() > 1) {
                    yp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) tp0Var2.M.get(1);
                    tp0Var2.K = starGift;
                    if (starGift == null) {
                        xh.v3 v3Var = tp0Var2.J;
                        if (v3Var != null) {
                            v3Var.f();
                            tp0Var2.J = null;
                        }
                    } else {
                        xh.v3 v3Var2 = tp0Var2.J;
                        if (v3Var2 == null || v3Var2.f51674b != starGift.f20295id) {
                            i10 = ((org.telegram.ui.ActionBar.m2) zp0Var).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(tp0Var2.K.f20295id, i10, new s3(rp0Var, 16));
                            tp0Var2.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    tp0.a(tp0Var2);
                    if (zp0Var.I.getCurrentPosition() == 1) {
                        tp0Var = zp0Var.f45086n;
                    } else {
                        tp0Var = zp0Var.h;
                    }
                    tp0Var.e();
                    return;
                }
                return;
            case 12:
                ar0 ar0Var = ((rq0) obj).h;
                ar0Var.b0(ar0Var.P.getSearchField());
                return;
            case 13:
                ((sq0) obj).f41817z0.L.l();
                return;
            case 14:
                ((vu0) obj).invalidate();
                return;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.t2(vVar.f6693a);
                if (photoViewer.f33949c2 == 1) {
                    long j3 = vVar.f6693a;
                    photoViewer.X7 = j3;
                    if (photoViewer.W7 != j3) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f6695c = null;
                return;
            case 16:
                PhotoViewer photoViewer2 = ((dt0) obj).f37127a;
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
            case 17:
                zn znVar = ((ft0) obj).f37803d1.l4;
                if (znVar != null && (okVar = znVar.Y) != null) {
                    okVar.F0();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) ((dp0) obj).f37097b;
                PhotoViewer photoViewer3 = (PhotoViewer) vl0Var.f31920c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.l81 l81Var = photoViewer3.F2;
                if (l81Var != null) {
                    l81Var.C();
                }
                ((PhotoViewer) vl0Var.f31920c).I2 = null;
                return;
            case 19:
                PhotoViewer photoViewer4 = ((ss0) obj).f41883a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.l81 l81Var2 = photoViewer4.F2;
                if (l81Var2 != null) {
                    l81Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 20:
                fu0 fu0Var = (fu0) ((dp0) obj).f37097b;
                fu0Var.f37812r.f34032l7.unlock();
                PhotoViewer photoViewer5 = fu0Var.f37812r;
                Runnable runnable = photoViewer5.f34065p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f34065p4 = null;
                }
                photoViewer5.y2(true);
                return;
            case 21:
                PhotoViewer photoViewer6 = ((ht0) obj).f38539b;
                Runnable runnable2 = photoViewer6.f34065p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f34065p4 = null;
                    return;
                }
                return;
            case 22:
                ((qu0) obj).f49860x.d(true);
                return;
            case 23:
                ((uu0) obj).d = true;
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((bx0) obj).f36501c;
                premiumPreviewFragment.showDialog(new g41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 25:
                ((org.telegram.messenger.jk) obj).run(0);
                return;
            case 26:
                AndroidUtilities.addToClipboard((String) obj);
                return;
            case 27:
                ((ci.d4) obj).e(true);
                return;
            case 28:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            default:
                ez0 ez0Var = (ez0) obj;
                ez0Var.G.getNotificationCenter().onAnimationFinish(ez0Var.F);
                return;
        }
    }
}
