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
public final class yk0 implements Runnable {
    public final int f42186a;
    public final Object f42187b;

    public yk0(Object obj, int i10) {
        this.f42186a = i10;
        this.f42187b = obj;
    }

    @Override
    public final void run() {
        int i10;
        aq0 aq0Var;
        sk skVar;
        int i11 = this.f42186a;
        Object obj = this.f42187b;
        switch (i11) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
            case 1:
                ((PasscodeActivity) ((ie0) obj).f37103n).k0();
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
                ((bn0) obj).f34600a.finishFragment();
                return;
            case 5:
                org.telegram.ui.Components.g5.w0(((fn0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                qn0 qn0Var = (qn0) ((di.n2) obj).f7450b;
                double d = currentTimeMillis - qn0Var.G;
                qn0Var.G = currentTimeMillis;
                int i12 = (int) (qn0Var.E - d);
                qn0Var.E = i12;
                if (i12 <= 1000) {
                    qn0Var.f39503r.setVisibility(0);
                    qn0Var.f39502n.setVisibility(8);
                    qn0Var.r();
                    return;
                }
                return;
            case 7:
                pn0 pn0Var = (pn0) obj;
                qn0 qn0Var2 = pn0Var.f39266a;
                int i13 = qn0Var2.f39507y;
                rn0 rn0Var = qn0Var2.f39504s;
                mn0 mn0Var = qn0Var2.f39502n;
                if (i13 >= 1000) {
                    int i14 = i13 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = qn0Var2.M;
                    if (i17 != 4 && i17 != 3) {
                        if (i17 == 2) {
                            mn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                        }
                    } else {
                        mn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (rn0Var != null) {
                        rn0Var.f39836c = 1.0f - (qn0Var2.f39507y / qn0Var2.P);
                        rn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (rn0Var != null) {
                    rn0Var.f39836c = 1.0f;
                    rn0Var.invalidate();
                }
                qn0Var2.s();
                int i18 = qn0Var2.L;
                if (i18 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(qn0Var2, NotificationCenter.didReceiveCall);
                    qn0Var2.I = false;
                    qn0Var2.r();
                    qn0Var2.t();
                    return;
                } else if (i18 == 2 || i18 == 4) {
                    int i19 = qn0Var2.M;
                    if (i19 != 4 && i19 != 2) {
                        if (i19 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(qn0Var2, NotificationCenter.didReceiveSmsCode);
                            qn0Var2.I = false;
                            qn0Var2.r();
                            qn0Var2.t();
                            return;
                        }
                        return;
                    }
                    if (i19 == 4) {
                        mn0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        mn0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    qn0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = qn0Var2.f39498a;
                    tL_auth_resendCode.phone_code_hash = qn0Var2.f39499b;
                    ConnectionsManager.getInstance(un0.e0(qn0Var2.Q)).sendRequest(tL_auth_resendCode, new m(pn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 8:
                pf.d.s(((mo0) obj).f38301b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 9:
                cp0 cp0Var = ((ro0) obj).f39839a;
                cp0Var.t0();
                cp0Var.H0(true, false);
                cp0Var.D0(false);
                return;
            case 10:
                pf.d.s(((vo0) obj).f41055b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                yp0 yp0Var = (yp0) obj;
                aq0 aq0Var2 = yp0Var.f42207c;
                fq0 fq0Var = aq0Var2.E;
                gq0 gq0Var = aq0Var2.f34322p0;
                if (fq0Var != null && aq0Var2.L.size() > 1) {
                    fq0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) aq0Var2.M.get(1);
                    aq0Var2.K = starGift;
                    if (starGift == null) {
                        yh.t3 t3Var = aq0Var2.J;
                        if (t3Var != null) {
                            t3Var.f();
                            aq0Var2.J = null;
                        }
                    } else {
                        yh.t3 t3Var2 = aq0Var2.J;
                        if (t3Var2 == null || t3Var2.f49130b != starGift.f19441id) {
                            i10 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                            yh.t3 t3Var3 = new yh.t3(aq0Var2.K.f19441id, i10, new v3(yp0Var, 16));
                            aq0Var2.J = t3Var3;
                            t3Var3.g(false);
                        }
                    }
                    aq0.a(aq0Var2);
                    if (gq0Var.I.getCurrentPosition() == 1) {
                        aq0Var = gq0Var.f36463n;
                    } else {
                        aq0Var = gq0Var.h;
                    }
                    aq0Var.e();
                    return;
                }
                return;
            case 12:
                hr0 hr0Var = ((yq0) obj).h;
                hr0Var.b0(hr0Var.P.getSearchField());
                return;
            case 13:
                ((zq0) obj).f42702z0.L.l();
                return;
            case 14:
                ((cv0) obj).invalidate();
                return;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.t2(vVar.f5044a);
                if (photoViewer.f32210c2 == 1) {
                    long j10 = vVar.f5044a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f5046c = null;
                return;
            case 16:
                PhotoViewer photoViewer2 = ((lt0) obj).f38088a;
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
                fo foVar = ((nt0) obj).f38797d1.l4;
                if (foVar != null && (skVar = foVar.Y) != null) {
                    skVar.F0();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.ql0 ql0Var = (org.telegram.ui.Components.ql0) ((lj0) obj).f38031b;
                PhotoViewer photoViewer3 = (PhotoViewer) ql0Var.f28643c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.h81 h81Var = photoViewer3.F2;
                if (h81Var != null) {
                    h81Var.C();
                }
                ((PhotoViewer) ql0Var.f28643c).I2 = null;
                return;
            case 19:
                PhotoViewer photoViewer4 = ((at0) obj).f34338a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.h81 h81Var2 = photoViewer4.F2;
                if (h81Var2 != null) {
                    h81Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 20:
                mu0 mu0Var = (mu0) ((lj0) obj).f38031b;
                mu0Var.f38354r.f32293l7.unlock();
                PhotoViewer photoViewer5 = mu0Var.f38354r;
                Runnable runnable = photoViewer5.f32326p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f32326p4 = null;
                }
                photoViewer5.y2(true);
                return;
            case 21:
                PhotoViewer photoViewer6 = ((pt0) obj).f39290b;
                Runnable runnable2 = photoViewer6.f32326p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f32326p4 = null;
                    return;
                }
                return;
            case 22:
                ((xu0) obj).f47716x.d(true);
                return;
            case 23:
                ((bv0) obj).d = true;
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((ix0) obj).f37213c;
                premiumPreviewFragment.showDialog(new n41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 25:
                ((org.telegram.messenger.mk) obj).run(0);
                return;
            case 26:
                AndroidUtilities.addToClipboard((String) obj);
                return;
            case 27:
                ((di.d4) obj).e(true);
                return;
            case 28:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                return;
            default:
                mz0 mz0Var = (mz0) obj;
                mz0Var.G.getNotificationCenter().onAnimationFinish(mz0Var.F);
                return;
        }
    }
}
