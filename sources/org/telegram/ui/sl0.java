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
    public final int f37425a;
    public final Object f37426b;

    public sl0(Object obj, int i10) {
        this.f37425a = i10;
        this.f37426b = obj;
    }

    @Override
    public final void run() {
        int i10;
        wp0 wp0Var;
        lk lkVar;
        int i11 = this.f37425a;
        int i12 = 0;
        Object obj = this.f37426b;
        switch (i11) {
            case 0:
                ((PasscodeActivity) ((fe0) obj).f33580n).h0();
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
                ((xm0) obj).f39626a.finishFragment();
                return;
            case 4:
                org.telegram.ui.Components.d5.x0(((bn0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                ln0 ln0Var = (ln0) ((ci.p2) obj).f5304b;
                double d = currentTimeMillis - ln0Var.G;
                ln0Var.G = currentTimeMillis;
                int i13 = (int) (ln0Var.E - d);
                ln0Var.E = i13;
                if (i13 <= 1000) {
                    ln0Var.f35488r.setVisibility(0);
                    ln0Var.f35487n.setVisibility(8);
                    ln0Var.r();
                    return;
                }
                return;
            case 6:
                kn0 kn0Var = (kn0) obj;
                ln0 ln0Var2 = kn0Var.f35214a;
                int i14 = ln0Var2.f35492y;
                mn0 mn0Var = ln0Var2.f35489s;
                in0 in0Var = ln0Var2.f35487n;
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
                        mn0Var.f35777c = 1.0f - (ln0Var2.f35492y / ln0Var2.P);
                        mn0Var.invalidate();
                        return;
                    }
                    return;
                }
                if (mn0Var != null) {
                    mn0Var.f35777c = 1.0f;
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
                    tL_auth_resendCode.phone_number = ln0Var2.f35483a;
                    tL_auth_resendCode.phone_code_hash = ln0Var2.f35484b;
                    ConnectionsManager.getInstance(pn0.f0(ln0Var2.Q)).sendRequest(tL_auth_resendCode, new m(kn0Var, 16), 2);
                    return;
                } else {
                    return;
                }
            case 7:
                nf.f.s(((ho0) obj).f34248b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 8:
                xo0 xo0Var = ((mo0) obj).f35780a;
                xo0Var.t0();
                xo0Var.H0(true, false);
                xo0Var.D0(false);
                return;
            case 9:
                nf.f.s(((qo0) obj).f36952b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                up0 up0Var = (up0) obj;
                wp0 wp0Var2 = up0Var.f38191c;
                bq0 bq0Var = wp0Var2.E;
                cq0 cq0Var = wp0Var2.f39211p0;
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
                        if (v3Var2 == null || v3Var2.f46471b != starGift.f18553id) {
                            i10 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(wp0Var2.K.f18553id, i10, new s3(up0Var, 13));
                            wp0Var2.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    wp0.a(wp0Var2);
                    if (cq0Var.I.getCurrentPosition() == 1) {
                        wp0Var = cq0Var.f32823n;
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
                ((uq0) obj).f38198z0.L.l();
                return;
            case 13:
                ((vu0) obj).invalidate();
                return;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.s2(vVar.f6182a);
                if (photoViewer.f31205c2 == 1) {
                    long j3 = vVar.f6182a;
                    photoViewer.X7 = j3;
                    if (photoViewer.W7 != j3) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.f6184c = null;
                return;
            case 15:
                PhotoViewer photoViewer2 = ((et0) obj).f33400a;
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
                zn znVar = ((gt0) obj).f33976d1.l4;
                if (znVar != null && (lkVar = znVar.Y) != null) {
                    lkVar.H0();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) ((gp0) obj).f33948b;
                PhotoViewer photoViewer3 = (PhotoViewer) zk0Var.f30853c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.t71 t71Var = photoViewer3.F2;
                if (t71Var != null) {
                    t71Var.C();
                }
                ((PhotoViewer) zk0Var.f30853c).I2 = null;
                return;
            case 18:
                PhotoViewer photoViewer4 = ((ts0) obj).f37876a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.t71 t71Var2 = photoViewer4.F2;
                if (t71Var2 != null) {
                    t71Var2.C();
                }
                photoViewer4.I2 = null;
                return;
            case 19:
                fu0 fu0Var = (fu0) ((gp0) obj).f33948b;
                fu0Var.f33728r.f31287l7.unlock();
                PhotoViewer photoViewer5 = fu0Var.f33728r;
                Runnable runnable = photoViewer5.f31320p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f31320p4 = null;
                }
                photoViewer5.x2(true);
                return;
            case 20:
                PhotoViewer photoViewer6 = ((it0) obj).f34682b;
                Runnable runnable2 = photoViewer6.f31320p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f31320p4 = null;
                    return;
                }
                return;
            case 21:
                ((qu0) obj).f44754s.d(true);
                return;
            case 22:
                ((uu0) obj).d = true;
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((cx0) obj).f32884c;
                premiumPreviewFragment.showDialog(new i41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 24:
                ((org.telegram.messenger.mk) obj).run(0);
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
                ProfileActivity profileActivity = (ProfileActivity) ((ci.n6) obj).f5076c;
                if (profileActivity.f31618n5 != 1.0f) {
                    pz0 pz0Var = profileActivity.f31613n0;
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
