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
public final class rl0 implements Runnable {
    public final int f40213a;
    public final Object f40214b;

    public rl0(Object obj, int i10) {
        this.f40213a = i10;
        this.f40214b = obj;
    }

    @Override
    public final void run() {
        int i10;
        vp0 vp0Var;
        mk mkVar;
        int i11 = this.f40213a;
        int i12 = 0;
        Object obj = this.f40214b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((de0) obj).f35800n).h0();
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
                ((xm0) obj).f42790a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.e5.x0(((bn0) obj).f34876e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                ln0 ln0Var = (ln0) ((di.p2) obj).f7850b;
                double d = currentTimeMillis - ln0Var.G;
                ln0Var.G = currentTimeMillis;
                int i13 = (int) (ln0Var.E - d);
                ln0Var.E = i13;
                if (i13 <= 1000) {
                    ln0Var.f38441r.setVisibility(0);
                    ln0Var.f38440n.setVisibility(8);
                    ln0Var.r();
                    return;
                }
                return;
            case 6:
                kn0 kn0Var = (kn0) obj;
                ln0 ln0Var2 = kn0Var.f38122a;
                int i14 = ln0Var2.f38445y;
                mn0 mn0Var = ln0Var2.f38442s;
                in0 in0Var = ln0Var2.f38440n;
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
                        mn0Var.f38767c = 1.0f - (ln0Var2.f38445y / ln0Var2.P);
                        mn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (mn0Var != null) {
                    mn0Var.f38767c = 1.0f;
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
                    tL_auth_resendCode.phone_number = ln0Var2.f38435a;
                    tL_auth_resendCode.phone_code_hash = ln0Var2.f38436b;
                    ConnectionsManager.getInstance(pn0.f0(ln0Var2.Q)).sendRequest(tL_auth_resendCode, new m(kn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                of.f.s(((ho0) obj).f37103b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                xo0 xo0Var = ((mo0) obj).f38770a;
                xo0Var.t0();
                xo0Var.H0(true, false);
                xo0Var.D0(false);
                return;
            case 9:
                of.f.s(((qo0) obj).f39956b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                tp0 tp0Var = (tp0) obj;
                vp0 vp0Var2 = tp0Var.f40838c;
                aq0 aq0Var = vp0Var2.E;
                bq0 bq0Var = vp0Var2.f41646p0;
                if (aq0Var != null && vp0Var2.L.size() > 1) {
                    aq0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) vp0Var2.M.get(1);
                    vp0Var2.K = starGift;
                    if (starGift == null) {
                        yh.t3 t3Var = vp0Var2.J;
                        if (t3Var != null) {
                            t3Var.f();
                            vp0Var2.J = null;
                        }
                    } else {
                        yh.t3 t3Var2 = vp0Var2.J;
                        if (t3Var2 == null || t3Var2.f50586b != starGift.f20124id) {
                            i10 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                            yh.t3 t3Var3 = new yh.t3(vp0Var2.K.f20124id, i10, new t3(tp0Var, 13));
                            vp0Var2.J = t3Var3;
                            t3Var3.g(false);
                        }
                    }
                    vp0.a(vp0Var2);
                    if (bq0Var.I.getCurrentPosition() == 1) {
                        vp0Var = bq0Var.f34900n;
                    } else {
                        vp0Var = bq0Var.h;
                    }
                    vp0Var.e();
                    return;
                }
                return;
            case 11:
                br0 br0Var = ((sq0) obj).h;
                br0Var.b0(br0Var.P.getSearchField());
                return;
            case 12:
                ((tq0) obj).f40844z0.L.l();
                return;
            case 13:
                ((uu0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.t2(vVar.f5142a);
                if (photoViewer.f33559c2 == 1) {
                    long j3 = vVar.f5142a;
                    photoViewer.W7 = j3;
                    if (photoViewer.V7 != j3) {
                        photoViewer.V7 = -1L;
                    }
                }
                vVar.f5144c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((dt0) obj).f35886a;
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
                co coVar = ((ft0) obj).f36494d1.l4;
                if (coVar != null && (mkVar = coVar.Y) != null) {
                    mkVar.H0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) ((gk0) obj).f36737b;
                PhotoViewer photoViewer3 = (PhotoViewer) pk0Var.f29441c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.g71 g71Var = photoViewer3.F2;
                if (g71Var != null) {
                    g71Var.C();
                }
                ((PhotoViewer) pk0Var.f29441c).I2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((ss0) obj).f40548a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.g71 g71Var2 = photoViewer4.F2;
                if (g71Var2 != null) {
                    g71Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 19:
                eu0 eu0Var = (eu0) ((gk0) obj).f36737b;
                eu0Var.f36209r.f33642l7.unlock();
                PhotoViewer photoViewer5 = eu0Var.f36209r;
                Runnable runnable = photoViewer5.f33675p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f33675p4 = null;
                }
                photoViewer5.y2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((ht0) obj).f37135b;
                Runnable runnable2 = photoViewer6.f33675p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f33675p4 = null;
                    return;
                }
                return;
            case 21:
                ((pu0) obj).f48701s.d(true);
                return;
            case 22:
                ((tu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((cx0) obj).f35594c;
                premiumPreviewFragment.showDialog(new k41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 24:
                ((org.telegram.messenger.nk) obj).run(0);
                return;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                return;
            case 26:
                ((di.f4) obj).e(true);
                return;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            case 28:
                hz0 hz0Var = (hz0) obj;
                hz0Var.G.getNotificationCenter().onAnimationFinish(hz0Var.F);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.w) obj).f725c;
                if (profileActivity.f33980n5 != 1.0f) {
                    qz0 qz0Var = profileActivity.f33975n0;
                    while (qz0Var.D0.k(i12) != qz0Var.getRealCount() - 1) {
                        i12++;
                    }
                    qz0Var.x(i12, true);
                    return;
                }
                return;
        }
    }
}
