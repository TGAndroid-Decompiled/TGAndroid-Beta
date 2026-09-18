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
    public final int f37517a;
    public final Object f37518b;

    public sl0(Object obj, int i10) {
        this.f37517a = i10;
        this.f37518b = obj;
    }

    @Override
    public final void run() {
        int i10;
        wp0 wp0Var;
        nk nkVar;
        int i11 = this.f37517a;
        int i12 = 0;
        Object obj = this.f37518b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((fe0) obj).f33628n).h0();
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
                ((ym0) obj).f39941a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.c5.x0(((cn0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                mn0 mn0Var = (mn0) ((ci.p2) obj).f5303b;
                double d = currentTimeMillis - mn0Var.G;
                mn0Var.G = currentTimeMillis;
                int i13 = (int) (mn0Var.E - d);
                mn0Var.E = i13;
                if (i13 <= 1000) {
                    mn0Var.f35854r.setVisibility(0);
                    mn0Var.f35853n.setVisibility(8);
                    mn0Var.r();
                    return;
                }
                return;
            case 6:
                ln0 ln0Var = (ln0) obj;
                mn0 mn0Var2 = ln0Var.f35595a;
                int i14 = mn0Var2.f35858y;
                nn0 nn0Var = mn0Var2.f35855s;
                jn0 jn0Var = mn0Var2.f35853n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = mn0Var2.M;
                    if (i18 != 4 && i18 != 3) {
                        if (i18 == 2) {
                            jn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                        }
                    } else {
                        jn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (nn0Var != null) {
                        nn0Var.f36142c = 1.0f - (mn0Var2.f35858y / mn0Var2.P);
                        nn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (nn0Var != null) {
                    nn0Var.f36142c = 1.0f;
                    nn0Var.invalidate();
                }
                mn0Var2.s();
                int i19 = mn0Var2.L;
                if (i19 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(mn0Var2, NotificationCenter.didReceiveCall);
                    mn0Var2.I = false;
                    mn0Var2.r();
                    mn0Var2.u();
                    return;
                } else if (i19 == 2 || i19 == 4) {
                    int i20 = mn0Var2.M;
                    if (i20 != 4 && i20 != 2) {
                        if (i20 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(mn0Var2, NotificationCenter.didReceiveSmsCode);
                            mn0Var2.I = false;
                            mn0Var2.r();
                            mn0Var2.u();
                            return;
                        }
                        return;
                    }
                    if (i20 == 4) {
                        jn0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        jn0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    mn0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = mn0Var2.f35849a;
                    tL_auth_resendCode.phone_code_hash = mn0Var2.f35850b;
                    ConnectionsManager.getInstance(qn0.f0(mn0Var2.Q)).sendRequest(tL_auth_resendCode, new m(ln0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                nf.f.s(((io0) obj).f34644b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                yo0 yo0Var = ((no0) obj).f36145a;
                yo0Var.t0();
                yo0Var.H0(true, false);
                yo0Var.D0(false);
                return;
            case 9:
                nf.f.s(((ro0) obj).f37292b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                up0 up0Var = (up0) obj;
                wp0 wp0Var2 = up0Var.f38114c;
                bq0 bq0Var = wp0Var2.E;
                cq0 cq0Var = wp0Var2.f39152p0;
                if (bq0Var != null && wp0Var2.L.size() > 1) {
                    bq0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) wp0Var2.M.get(1);
                    wp0Var2.K = starGift;
                    if (starGift == null) {
                        xh.u3 u3Var = wp0Var2.J;
                        if (u3Var != null) {
                            u3Var.f();
                            wp0Var2.J = null;
                        }
                    } else {
                        xh.u3 u3Var2 = wp0Var2.J;
                        if (u3Var2 == null || u3Var2.f46172b != starGift.f18346id) {
                            i10 = ((org.telegram.ui.ActionBar.o2) cq0Var).currentAccount;
                            xh.u3 u3Var3 = new xh.u3(wp0Var2.K.f18346id, i10, new s3(up0Var, 13));
                            wp0Var2.J = u3Var3;
                            u3Var3.g(false);
                        }
                    }
                    wp0.a(wp0Var2);
                    if (cq0Var.I.getCurrentPosition() == 1) {
                        wp0Var = cq0Var.f32866n;
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
                ((uq0) obj).f38121z0.L.l();
                return;
            case 13:
                ((xu0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.s2(vVar.f6181a);
                if (photoViewer.f30938c2 == 1) {
                    long j3 = vVar.f6181a;
                    photoViewer.X7 = j3;
                    if (photoViewer.W7 != j3) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f6183c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((gt0) obj).f34046a;
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
                bo boVar = ((it0) obj).f34689d1.l4;
                if (boVar != null && (nkVar = boVar.Y) != null) {
                    nkVar.I0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) ((er0) obj).f33467b;
                PhotoViewer photoViewer3 = (PhotoViewer) qk0Var.f27341c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.h71 h71Var = photoViewer3.F2;
                if (h71Var != null) {
                    h71Var.C();
                }
                ((PhotoViewer) qk0Var.f27341c).I2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((vs0) obj).f38504a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.h71 h71Var2 = photoViewer4.F2;
                if (h71Var2 != null) {
                    h71Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 19:
                hu0 hu0Var = (hu0) ((er0) obj).f33467b;
                hu0Var.f34357r.f31020l7.unlock();
                PhotoViewer photoViewer5 = hu0Var.f34357r;
                Runnable runnable = photoViewer5.f31053p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f31053p4 = null;
                }
                photoViewer5.x2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((kt0) obj).f35369b;
                Runnable runnable2 = photoViewer6.f31053p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f31053p4 = null;
                    return;
                }
                return;
            case 21:
                ((su0) obj).f44485s.d(true);
                return;
            case 22:
                ((wu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((ex0) obj).f33493c;
                premiumPreviewFragment.showDialog(new j41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
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
                iz0 iz0Var = (iz0) obj;
                iz0Var.G.getNotificationCenter().onAnimationFinish(iz0Var.F);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.n6) obj).f5075c;
                if (profileActivity.f31351n5 != 1.0f) {
                    rz0 rz0Var = profileActivity.f31346n0;
                    while (rz0Var.D0.k(i12) != rz0Var.getRealCount() - 1) {
                        i12++;
                    }
                    rz0Var.x(i12, true);
                    return;
                }
                return;
        }
    }
}
