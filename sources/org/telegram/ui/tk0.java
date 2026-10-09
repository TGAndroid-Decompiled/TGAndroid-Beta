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
public final class tk0 implements Runnable {
    public final int f42024a;
    public final Object f42025b;

    public tk0(Object obj, int i10) {
        this.f42024a = i10;
        this.f42025b = obj;
    }

    @Override
    public final void run() {
        int i10;
        up0 up0Var;
        ok okVar;
        int i11 = this.f42024a;
        Object obj = this.f42025b;
        switch (i11) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
            case 1:
                ((PasscodeActivity) ((ce0) obj).f36631n).k0();
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
                ((vm0) obj).f42903a.finishFragment();
                return;
            case 5:
                org.telegram.ui.Components.g5.w0(((zm0) obj).f44697e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                jn0 jn0Var = (jn0) ((ci.n2) obj).f5631b;
                double d = currentTimeMillis - jn0Var.G;
                jn0Var.G = currentTimeMillis;
                int i12 = (int) (jn0Var.E - d);
                jn0Var.E = i12;
                if (i12 <= 1000) {
                    jn0Var.f38992r.setVisibility(0);
                    jn0Var.f38991n.setVisibility(8);
                    jn0Var.r();
                    return;
                }
                return;
            case 7:
                in0 in0Var = (in0) obj;
                jn0 jn0Var2 = in0Var.f38702a;
                int i13 = jn0Var2.f38996y;
                kn0 kn0Var = jn0Var2.f38993s;
                gn0 gn0Var = jn0Var2.f38991n;
                if (i13 >= 1000) {
                    int i14 = i13 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = jn0Var2.M;
                    if (i17 != 4 && i17 != 3) {
                        if (i17 == 2) {
                            gn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                        }
                    } else {
                        gn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (kn0Var != null) {
                        kn0Var.f39318c = 1.0f - (jn0Var2.f38996y / jn0Var2.P);
                        kn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (kn0Var != null) {
                    kn0Var.f39318c = 1.0f;
                    kn0Var.invalidate();
                }
                jn0Var2.s();
                int i18 = jn0Var2.L;
                if (i18 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(jn0Var2, NotificationCenter.didReceiveCall);
                    jn0Var2.I = false;
                    jn0Var2.r();
                    jn0Var2.t();
                    return;
                } else if (i18 == 2 || i18 == 4) {
                    int i19 = jn0Var2.M;
                    if (i19 != 4 && i19 != 2) {
                        if (i19 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(jn0Var2, NotificationCenter.didReceiveSmsCode);
                            jn0Var2.I = false;
                            jn0Var2.r();
                            jn0Var2.t();
                            return;
                        }
                        return;
                    }
                    if (i19 == 4) {
                        gn0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        gn0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    jn0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = jn0Var2.f38986a;
                    tL_auth_resendCode.phone_code_hash = jn0Var2.f38987b;
                    ConnectionsManager.getInstance(nn0.e0(jn0Var2.Q)).sendRequest(tL_auth_resendCode, new m(in0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 8:
                of.f.s(((fo0) obj).f37652b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 9:
                vo0 vo0Var = ((ko0) obj).f39321a;
                vo0Var.t0();
                vo0Var.H0(true, false);
                vo0Var.D0(false);
                return;
            case 10:
                of.f.s(((oo0) obj).f40583b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                sp0 sp0Var = (sp0) obj;
                up0 up0Var2 = sp0Var.f41744c;
                zp0 zp0Var = up0Var2.E;
                aq0 aq0Var = up0Var2.f42530p0;
                if (zp0Var != null && up0Var2.L.size() > 1) {
                    zp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) up0Var2.M.get(1);
                    up0Var2.K = starGift;
                    if (starGift == null) {
                        xh.v3 v3Var = up0Var2.J;
                        if (v3Var != null) {
                            v3Var.f();
                            up0Var2.J = null;
                        }
                    } else {
                        xh.v3 v3Var2 = up0Var2.J;
                        if (v3Var2 == null || v3Var2.f51551b != starGift.f20265id) {
                            i10 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(up0Var2.K.f20265id, i10, new t3(sp0Var, 16));
                            up0Var2.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    up0.a(up0Var2);
                    if (aq0Var.I.getCurrentPosition() == 1) {
                        up0Var = aq0Var.f35993n;
                    } else {
                        up0Var = aq0Var.h;
                    }
                    up0Var.e();
                    return;
                }
                return;
            case 12:
                br0 br0Var = ((sq0) obj).h;
                br0Var.b0(br0Var.P.getSearchField());
                return;
            case 13:
                ((tq0) obj).f42049z0.L.l();
                return;
            case 14:
                ((wu0) obj).invalidate();
                return;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.t2(vVar.f6694a);
                if (photoViewer.f33887c2 == 1) {
                    long j3 = vVar.f6694a;
                    photoViewer.X7 = j3;
                    if (photoViewer.W7 != j3) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f6696c = null;
                return;
            case 16:
                PhotoViewer photoViewer2 = ((et0) obj).f37334a;
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
                zn znVar = ((gt0) obj).f38105d1.l4;
                if (znVar != null && (okVar = znVar.Y) != null) {
                    okVar.F0();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.ul0 ul0Var = (org.telegram.ui.Components.ul0) ((ep0) obj).f37304b;
                PhotoViewer photoViewer3 = (PhotoViewer) ul0Var.f31536c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.k81 k81Var = photoViewer3.F2;
                if (k81Var != null) {
                    k81Var.C();
                }
                ((PhotoViewer) ul0Var.f31536c).I2 = null;
                return;
            case 19:
                PhotoViewer photoViewer4 = ((ts0) obj).f42117a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.k81 k81Var2 = photoViewer4.F2;
                if (k81Var2 != null) {
                    k81Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 20:
                gu0 gu0Var = (gu0) ((ep0) obj).f37304b;
                gu0Var.f38114r.f33970l7.unlock();
                PhotoViewer photoViewer5 = gu0Var.f38114r;
                Runnable runnable = photoViewer5.f34003p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f34003p4 = null;
                }
                photoViewer5.y2(true);
                return;
            case 21:
                PhotoViewer photoViewer6 = ((it0) obj).f38753b;
                Runnable runnable2 = photoViewer6.f34003p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f34003p4 = null;
                    return;
                }
                return;
            case 22:
                ((ru0) obj).f49737x.d(true);
                return;
            case 23:
                ((vu0) obj).d = true;
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((cx0) obj).f36746c;
                premiumPreviewFragment.showDialog(new h41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
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
                fz0 fz0Var = (fz0) obj;
                fz0Var.G.getNotificationCenter().onAnimationFinish(fz0Var.F);
                return;
        }
    }
}
