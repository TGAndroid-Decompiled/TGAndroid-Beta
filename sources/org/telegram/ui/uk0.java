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
public final class uk0 implements Runnable {
    public final int f42532a;
    public final Object f42533b;

    public uk0(Object obj, int i10) {
        this.f42532a = i10;
        this.f42533b = obj;
    }

    @Override
    public final void run() {
        int i10;
        wp0 wp0Var;
        sk skVar;
        int i11 = this.f42532a;
        Object obj = this.f42533b;
        switch (i11) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
            case 1:
                ((PasscodeActivity) ((de0) obj).f36777n).k0();
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
                ((xm0) obj).f44047a.finishFragment();
                return;
            case 5:
                org.telegram.ui.Components.g5.w0(((bn0) obj).f36215e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                ln0 ln0Var = (ln0) ((ci.n2) obj).f5629b;
                double d = currentTimeMillis - ln0Var.G;
                ln0Var.G = currentTimeMillis;
                int i12 = (int) (ln0Var.E - d);
                ln0Var.E = i12;
                if (i12 <= 1000) {
                    ln0Var.f39791r.setVisibility(0);
                    ln0Var.f39790n.setVisibility(8);
                    ln0Var.r();
                    return;
                }
                return;
            case 7:
                kn0 kn0Var = (kn0) obj;
                ln0 ln0Var2 = kn0Var.f39556a;
                int i13 = ln0Var2.f39795y;
                mn0 mn0Var = ln0Var2.f39792s;
                in0 in0Var = ln0Var2.f39790n;
                if (i13 >= 1000) {
                    int i14 = i13 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = ln0Var2.M;
                    if (i17 != 4 && i17 != 3) {
                        if (i17 == 2) {
                            in0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                        }
                    } else {
                        in0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (mn0Var != null) {
                        mn0Var.f40099c = 1.0f - (ln0Var2.f39795y / ln0Var2.P);
                        mn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (mn0Var != null) {
                    mn0Var.f40099c = 1.0f;
                    mn0Var.invalidate();
                }
                ln0Var2.s();
                int i18 = ln0Var2.L;
                if (i18 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(ln0Var2, NotificationCenter.didReceiveCall);
                    ln0Var2.I = false;
                    ln0Var2.r();
                    ln0Var2.t();
                    return;
                } else if (i18 == 2 || i18 == 4) {
                    int i19 = ln0Var2.M;
                    if (i19 != 4 && i19 != 2) {
                        if (i19 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(ln0Var2, NotificationCenter.didReceiveSmsCode);
                            ln0Var2.I = false;
                            ln0Var2.r();
                            ln0Var2.t();
                            return;
                        }
                        return;
                    }
                    if (i19 == 4) {
                        in0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        in0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    ln0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = ln0Var2.f39785a;
                    tL_auth_resendCode.phone_code_hash = ln0Var2.f39786b;
                    ConnectionsManager.getInstance(pn0.e0(ln0Var2.Q)).sendRequest(tL_auth_resendCode, new m(kn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 8:
                of.f.s(((ho0) obj).f38482b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 9:
                xo0 xo0Var = ((mo0) obj).f40103a;
                xo0Var.t0();
                xo0Var.H0(true, false);
                xo0Var.D0(false);
                return;
            case 10:
                of.f.s(((qo0) obj).f41381b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                up0 up0Var = (up0) obj;
                wp0 wp0Var2 = up0Var.f42549c;
                bq0 bq0Var = wp0Var2.E;
                cq0 cq0Var = wp0Var2.f43602p0;
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
                        if (u3Var2 == null || u3Var2.f51773b != starGift.f20032id) {
                            i10 = ((org.telegram.ui.ActionBar.m2) cq0Var).currentAccount;
                            xh.u3 u3Var3 = new xh.u3(wp0Var2.K.f20032id, i10, new t3(up0Var, 16));
                            wp0Var2.J = u3Var3;
                            u3Var3.g(false);
                        }
                    }
                    wp0.a(wp0Var2);
                    if (cq0Var.I.getCurrentPosition() == 1) {
                        wp0Var = cq0Var.f36492n;
                    } else {
                        wp0Var = cq0Var.h;
                    }
                    wp0Var.e();
                    return;
                }
                return;
            case 12:
                dr0 dr0Var = ((uq0) obj).h;
                dr0Var.b0(dr0Var.P.getSearchField());
                return;
            case 13:
                ((vq0) obj).f42832z0.L.l();
                return;
            case 14:
                ((yu0) obj).invalidate();
                return;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.t2(vVar.f6692a);
                if (photoViewer.f33726c2 == 1) {
                    long j3 = vVar.f6692a;
                    photoViewer.X7 = j3;
                    if (photoViewer.W7 != j3) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f6694c = null;
                return;
            case 16:
                PhotoViewer photoViewer2 = ((gt0) obj).f38137a;
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
                eo eoVar = ((it0) obj).f38997d1.l4;
                if (eoVar != null && (skVar = eoVar.Y) != null) {
                    skVar.J0();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.am0 am0Var = (org.telegram.ui.Components.am0) ((gp0) obj).f38117b;
                PhotoViewer photoViewer3 = (PhotoViewer) am0Var.f24434c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.q81 q81Var = photoViewer3.F2;
                if (q81Var != null) {
                    q81Var.C();
                }
                ((PhotoViewer) am0Var.f24434c).I2 = null;
                return;
            case 19:
                PhotoViewer photoViewer4 = ((vs0) obj).f42847a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.q81 q81Var2 = photoViewer4.F2;
                if (q81Var2 != null) {
                    q81Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 20:
                iu0 iu0Var = (iu0) ((gp0) obj).f38117b;
                iu0Var.f39008r.f33809l7.unlock();
                PhotoViewer photoViewer5 = iu0Var.f39008r;
                Runnable runnable = photoViewer5.f33842p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f33842p4 = null;
                }
                photoViewer5.y2(true);
                return;
            case 21:
                PhotoViewer photoViewer6 = ((kt0) obj).f39578b;
                Runnable runnable2 = photoViewer6.f33842p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f33842p4 = null;
                    return;
                }
                return;
            case 22:
                ((tu0) obj).f49975x.d(true);
                return;
            case 23:
                ((xu0) obj).d = true;
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((ex0) obj).f37565c;
                premiumPreviewFragment.showDialog(new j41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 25:
                ((org.telegram.messenger.pk) obj).run(0);
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
                hz0 hz0Var = (hz0) obj;
                hz0Var.G.getNotificationCenter().onAnimationFinish(hz0Var.F);
                return;
        }
    }
}
