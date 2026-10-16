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
public final class xk0 implements Runnable {
    public final int f41592a;
    public final Object f41593b;

    public xk0(Object obj, int i10) {
        this.f41592a = i10;
        this.f41593b = obj;
    }

    @Override
    public final void run() {
        int i10;
        yp0 yp0Var;
        sk skVar;
        int i11 = this.f41592a;
        Object obj = this.f41593b;
        switch (i11) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
            case 1:
                ((PasscodeActivity) ((ge0) obj).f36174n).k0();
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
                ((an0) obj).f33999a.finishFragment();
                return;
            case 5:
                org.telegram.ui.Components.g5.w0(((en0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                on0 on0Var = (on0) ((di.n2) obj).f7453b;
                double d = currentTimeMillis - on0Var.G;
                on0Var.G = currentTimeMillis;
                int i12 = (int) (on0Var.E - d);
                on0Var.E = i12;
                if (i12 <= 1000) {
                    on0Var.f38714r.setVisibility(0);
                    on0Var.f38713n.setVisibility(8);
                    on0Var.r();
                    return;
                }
                return;
            case 7:
                nn0 nn0Var = (nn0) obj;
                on0 on0Var2 = nn0Var.f38428a;
                int i13 = on0Var2.f38718y;
                pn0 pn0Var = on0Var2.f38715s;
                ln0 ln0Var = on0Var2.f38713n;
                if (i13 >= 1000) {
                    int i14 = i13 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = on0Var2.M;
                    if (i17 != 4 && i17 != 3) {
                        if (i17 == 2) {
                            ln0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                        }
                    } else {
                        ln0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (pn0Var != null) {
                        pn0Var.f38978c = 1.0f - (on0Var2.f38718y / on0Var2.P);
                        pn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (pn0Var != null) {
                    pn0Var.f38978c = 1.0f;
                    pn0Var.invalidate();
                }
                on0Var2.s();
                int i18 = on0Var2.L;
                if (i18 == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(on0Var2, NotificationCenter.didReceiveCall);
                    on0Var2.I = false;
                    on0Var2.r();
                    on0Var2.t();
                    return;
                } else if (i18 == 2 || i18 == 4) {
                    int i19 = on0Var2.M;
                    if (i19 != 4 && i19 != 2) {
                        if (i19 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(on0Var2, NotificationCenter.didReceiveSmsCode);
                            on0Var2.I = false;
                            on0Var2.r();
                            on0Var2.t();
                            return;
                        }
                        return;
                    }
                    if (i19 == 4) {
                        ln0Var.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        ln0Var.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    on0Var2.p();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = on0Var2.f38709a;
                    tL_auth_resendCode.phone_code_hash = on0Var2.f38710b;
                    ConnectionsManager.getInstance(sn0.e0(on0Var2.Q)).sendRequest(tL_auth_resendCode, new m(nn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 8:
                pf.d.r(((ko0) obj).f37471b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 9:
                ap0 ap0Var = ((po0) obj).f38981a;
                ap0Var.t0();
                ap0Var.H0(true, false);
                ap0Var.D0(false);
                return;
            case 10:
                pf.d.r(((to0) obj).f40160b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                wp0 wp0Var = (wp0) obj;
                yp0 yp0Var2 = wp0Var.f41338c;
                dq0 dq0Var = yp0Var2.E;
                eq0 eq0Var = yp0Var2.f41880p0;
                if (dq0Var != null && yp0Var2.L.size() > 1) {
                    dq0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) yp0Var2.M.get(1);
                    yp0Var2.K = starGift;
                    if (starGift == null) {
                        yh.t3 t3Var = yp0Var2.J;
                        if (t3Var != null) {
                            t3Var.f();
                            yp0Var2.J = null;
                        }
                    } else {
                        yh.t3 t3Var2 = yp0Var2.J;
                        if (t3Var2 == null || t3Var2.f49129b != starGift.f19141id) {
                            i10 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                            yh.t3 t3Var3 = new yh.t3(yp0Var2.K.f19141id, i10, new v3(wp0Var, 16));
                            yp0Var2.J = t3Var3;
                            t3Var3.g(false);
                        }
                    }
                    yp0.a(yp0Var2);
                    if (eq0Var.I.getCurrentPosition() == 1) {
                        yp0Var = eq0Var.f35362n;
                    } else {
                        yp0Var = eq0Var.h;
                    }
                    yp0Var.e();
                    return;
                }
                return;
            case 12:
                fr0 fr0Var = ((wq0) obj).h;
                fr0Var.b0(fr0Var.P.getSearchField());
                return;
            case 13:
                ((xq0) obj).f41616z0.L.l();
                return;
            case 14:
                ((bv0) obj).invalidate();
                return;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.t2(vVar.f5047a);
                if (photoViewer.f31912c2 == 1) {
                    long j10 = vVar.f5047a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f5049c = null;
                return;
            case 16:
                PhotoViewer photoViewer2 = ((kt0) obj).f37514a;
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
                fo foVar = ((mt0) obj).f38070d1.l4;
                if (foVar != null && (skVar = foVar.Y) != null) {
                    skVar.F0();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.ql0 ql0Var = (org.telegram.ui.Components.ql0) ((kj0) obj).f37443b;
                PhotoViewer photoViewer3 = (PhotoViewer) ql0Var.f28324c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.i81 i81Var = photoViewer3.F2;
                if (i81Var != null) {
                    i81Var.C();
                }
                ((PhotoViewer) ql0Var.f28324c).I2 = null;
                return;
            case 19:
                PhotoViewer photoViewer4 = ((zs0) obj).f42417a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.i81 i81Var2 = photoViewer4.F2;
                if (i81Var2 != null) {
                    i81Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 20:
                lu0 lu0Var = (lu0) ((kj0) obj).f37443b;
                lu0Var.f37836r.f31995l7.unlock();
                PhotoViewer photoViewer5 = lu0Var.f37836r;
                Runnable runnable = photoViewer5.f32028p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f32028p4 = null;
                }
                photoViewer5.y2(true);
                return;
            case 21:
                PhotoViewer photoViewer6 = ((ot0) obj).f38748b;
                Runnable runnable2 = photoViewer6.f32028p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f32028p4 = null;
                    return;
                }
                return;
            case 22:
                ((wu0) obj).f47715x.d(true);
                return;
            case 23:
                ((av0) obj).d = true;
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((ix0) obj).f36886c;
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
                lz0 lz0Var = (lz0) obj;
                lz0Var.G.getNotificationCenter().onAnimationFinish(lz0Var.F);
                return;
        }
    }
}
