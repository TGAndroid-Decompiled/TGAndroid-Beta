package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class zk0 implements Runnable {

    public final int f45196a;

    public final Object f45197b;

    public zk0(Object obj, int i10) {
        this.f45196a = i10;
        this.f45197b = obj;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f6 f6VarN0;
        String[] strArr;
        String str;
        SparseIntArray sparseIntArrayQ0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.e6 e6VarK;
        vo0 vo0Var;
        boolean z10;
        org.telegram.ui.Components.oi0 oi0Var;
        af.h hVarH;
        Drawable drawable;
        int i11;
        ck ckVar;
        switch (this.f45196a) {
            case 0:
                ((PasscodeActivity) ((od0) this.f45197b).f41066n).h0();
                break;
            case 1:
                PasskeysActivity.X((PasskeysActivity) this.f45197b);
                break;
            case 2:
                TLObject tLObject = (TLObject) this.f45197b;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                } else {
                    SharedConfig.getCountryLangs();
                }
                break;
            case 3:
                ((gm0) this.f45197b).f38446a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.y4.x0(((km0) this.f45197b).f39810e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                lh.h2 h2Var = (lh.h2) this.f45197b;
                double dCurrentTimeMillis = System.currentTimeMillis();
                tm0 tm0Var = (tm0) h2Var.f16055b;
                double d = dCurrentTimeMillis - tm0Var.C;
                tm0Var.C = dCurrentTimeMillis;
                int i12 = (int) (((double) tm0Var.A) - d);
                tm0Var.A = i12;
                if (i12 <= 1000) {
                    tm0Var.f42972r.setVisibility(0);
                    tm0Var.f42971n.setVisibility(8);
                    tm0Var.r();
                }
                break;
            case 6:
                sm0 sm0Var = (sm0) this.f45197b;
                tm0 tm0Var2 = sm0Var.f42670a;
                int i13 = tm0Var2.f42976y;
                um0 um0Var = tm0Var2.f42973s;
                qd0 qd0Var = tm0Var2.f42971n;
                if (i13 >= 1000) {
                    int i14 = i13 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = tm0Var2.I;
                    if (i17 == 4 || i17 == 3) {
                        qd0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    } else if (i17 == 2) {
                        qd0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (um0Var != null) {
                        um0Var.f43253c = 1.0f - (tm0Var2.f42976y / tm0Var2.L);
                        um0Var.invalidate();
                    }
                } else {
                    if (um0Var != null) {
                        um0Var.f43253c = 1.0f;
                        um0Var.invalidate();
                    }
                    tm0Var2.s();
                    int i18 = tm0Var2.H;
                    if (i18 == 3) {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(tm0Var2, NotificationCenter.didReceiveCall);
                        tm0Var2.E = false;
                        tm0Var2.r();
                        tm0Var2.t();
                    } else if (i18 == 2 || i18 == 4) {
                        int i19 = tm0Var2.I;
                        if (i19 == 4 || i19 == 2) {
                            if (i19 == 4) {
                                qd0Var.setText(LocaleController.getString(R.string.Calling));
                            } else {
                                qd0Var.setText(LocaleController.getString(R.string.SendingSms));
                            }
                            tm0Var2.p();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = tm0Var2.f42966a;
                            tL_auth_resendCode.phone_code_hash = tm0Var2.f42967b;
                            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) tm0Var2.M).currentAccount).sendRequest(tL_auth_resendCode, new n(sm0Var, 16), 2);
                        } else if (i19 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(tm0Var2, NotificationCenter.didReceiveSmsCode);
                            tm0Var2.E = false;
                            tm0Var2.r();
                            tm0Var2.t();
                        }
                    }
                }
                break;
            case 7:
                we.e.s(((on0) this.f45197b).f41143b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                do0 do0Var = ((sn0) this.f45197b).f42671a;
                do0Var.t0();
                do0Var.H0(true, false);
                do0Var.D0(false);
                break;
            case 9:
                we.e.s(((wn0) this.f45197b).f44154b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                ap0 ap0Var = (ap0) this.f45197b;
                ap0Var.F = !ap0Var.F;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
                if (string.equals(string2)) {
                    if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                    }
                    if (ap0Var.F) {
                        f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str3);
                    } else {
                        f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
                    }
                    ap0Var.f36592s.clear();
                    strArr = new String[1];
                    str = f6VarN0.d;
                    if (str != null) {
                        sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(null, str, strArr);
                    } else {
                        sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(new File(f6VarN0.f22943b), null, strArr);
                    }
                    iArr = org.telegram.ui.ActionBar.g6.nl;
                    if (iArr != null) {
                        for (i11 = 0; i11 < iArr.length; i11++) {
                            ap0Var.f36592s.put(i11, iArr[i11]);
                        }
                    }
                    for (i10 = 0; i10 < sparseIntArrayQ0.size(); i10++) {
                        ap0Var.f36592s.put(sparseIntArrayQ0.keyAt(i10), sparseIntArrayQ0.valueAt(i10));
                    }
                    e6VarK = f6VarN0.k(false);
                    if (e6VarK != null) {
                        e6VarK.c(sparseIntArrayQ0, ap0Var.f36592s);
                    }
                    vo0Var = ap0Var.f36589f;
                    if (vo0Var != null && vo0Var.f43509w != null) {
                        hVarH = org.telegram.ui.ActionBar.g6.H(f6VarN0, ap0Var.f36592s, strArr[0], 0, true);
                        org.telegram.ui.Cells.ba baVar = ap0Var.f36589f.f43509w;
                        drawable = (BitmapDrawable) hVarH.f275b;
                        if (drawable == null) {
                            drawable = (Drawable) hVarH.f274a;
                        }
                        baVar.setOverrideBackground(drawable);
                    }
                    z10 = ap0Var.F;
                    if (ap0Var.N != z10) {
                        ap0Var.N = z10;
                        org.telegram.ui.Components.oi0 oi0Var2 = ap0Var.G;
                        oi0Var2.N(z10 ? oi0Var2.f31312e[0] : 0);
                        oi0Var = ap0Var.G;
                        if (oi0Var != null) {
                            oi0Var.start();
                        }
                    }
                    ap0Var.z0();
                } else {
                    str3 = string2;
                }
                str2 = string;
                if (ap0Var.F) {
                    f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str3);
                } else {
                    f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
                }
                ap0Var.f36592s.clear();
                strArr = new String[1];
                str = f6VarN0.d;
                if (str != null) {
                    sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(null, str, strArr);
                } else {
                    sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(new File(f6VarN0.f22943b), null, strArr);
                }
                iArr = org.telegram.ui.ActionBar.g6.nl;
                if (iArr != null) {
                    while (i11 < iArr.length) {
                        ap0Var.f36592s.put(i11, iArr[i11]);
                    }
                }
                while (i10 < sparseIntArrayQ0.size()) {
                    ap0Var.f36592s.put(sparseIntArrayQ0.keyAt(i10), sparseIntArrayQ0.valueAt(i10));
                }
                e6VarK = f6VarN0.k(false);
                if (e6VarK != null) {
                    e6VarK.c(sparseIntArrayQ0, ap0Var.f36592s);
                }
                vo0Var = ap0Var.f36589f;
                if (vo0Var != null) {
                    hVarH = org.telegram.ui.ActionBar.g6.H(f6VarN0, ap0Var.f36592s, strArr[0], 0, true);
                    org.telegram.ui.Cells.ba baVar2 = ap0Var.f36589f.f43509w;
                    drawable = (BitmapDrawable) hVarH.f275b;
                    if (drawable == null) {
                        drawable = (Drawable) hVarH.f274a;
                    }
                    baVar2.setOverrideBackground(drawable);
                }
                z10 = ap0Var.F;
                if (ap0Var.N != z10) {
                    ap0Var.N = z10;
                    org.telegram.ui.Components.oi0 oi0Var3 = ap0Var.G;
                    oi0Var3.N(z10 ? oi0Var3.f31312e[0] : 0);
                    oi0Var = ap0Var.G;
                    if (oi0Var != null) {
                        oi0Var.start();
                    }
                }
                ap0Var.z0();
                break;
            case 11:
                to0 to0Var = (to0) this.f45197b;
                vo0 vo0Var2 = to0Var.f42987c;
                no0 no0Var = vo0Var2.f43497b;
                gh.j2 j2Var = null;
                int i20 = 0;
                while (true) {
                    ap0 ap0Var2 = vo0Var2.f43505f0;
                    if (i20 < no0Var.getChildCount()) {
                        View childAt = no0Var.getChildAt(i20);
                        if (childAt instanceof gh.j2) {
                            j2Var = (gh.j2) childAt;
                        }
                        i20++;
                    } else if (j2Var != null && vo0Var2.C.size() > 1) {
                        j2Var.f7352b = 1;
                        j2Var.f7351a.invalidate();
                        TL_stars.StarGift starGift = (TL_stars.StarGift) vo0Var2.D.get(1);
                        vo0Var2.B = starGift;
                        if (starGift == null) {
                            gh.i5 i5Var = vo0Var2.A;
                            if (i5Var != null) {
                                i5Var.f();
                                vo0Var2.A = null;
                            }
                        } else {
                            gh.i5 i5Var2 = vo0Var2.A;
                            if (i5Var2 == null || i5Var2.f7324b != starGift.f22607id) {
                                gh.i5 i5Var3 = new gh.i5(vo0Var2.B.f22607id, ((org.telegram.ui.ActionBar.n2) ap0Var2).currentAccount, new x3(to0Var, 13));
                                vo0Var2.A = i5Var3;
                                i5Var3.g(false);
                            }
                        }
                        vo0Var2.e();
                        (ap0Var2.f36595y.getCurrentPosition() == 1 ? ap0Var2.h : ap0Var2.f36589f).e();
                        break;
                    }
                }
                break;
            case 12:
                aq0 aq0Var = ((sp0) this.f45197b).h;
                aq0Var.b0(aq0Var.L.getSearchField());
                break;
            case 13:
                ((tp0) this.f45197b).f42993v0.H.l();
                break;
            case 14:
                ((ut0) this.f45197b).invalidate();
                break;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) this.f45197b;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                long j10 = vVar.f3357a;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.t2(j10);
                if (photoViewer.Y1 == 1) {
                    long j11 = vVar.f3357a;
                    photoViewer.S7 = j11;
                    if (photoViewer.R7 != j11) {
                        photoViewer.R7 = -1L;
                    }
                }
                vVar.f3359c = null;
                break;
            case 16:
                PhotoViewer photoViewer2 = ((cs0) this.f45197b).f37146a;
                ImageView imageView = photoViewer2.A3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.A3.getParent()).removeView(photoViewer2.A3);
                    if (photoViewer2.f35813z3 != null) {
                        ImageView imageView2 = photoViewer2.A3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        AndroidUtilities.recycleBitmap(photoViewer2.f35813z3);
                        photoViewer2.f35813z3 = null;
                    }
                    photoViewer2.A3 = null;
                    break;
                }
                break;
            case 17:
                rn rnVar = ((es0) this.f45197b).Z0.f35652h4;
                if (rnVar != null && (ckVar = rnVar.U) != null) {
                    ckVar.H0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.fk0 fk0Var = (org.telegram.ui.Components.fk0) ((f50) this.f45197b).f37939b;
                PhotoViewer photoViewer3 = (PhotoViewer) fk0Var.f28400c;
                photoViewer3.D2 = false;
                org.telegram.ui.Components.m61 m61Var = photoViewer3.B2;
                if (m61Var != null) {
                    m61Var.D();
                }
                ((PhotoViewer) fk0Var.f28400c).E2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((rr0) this.f45197b).f42322a;
                photoViewer4.D2 = false;
                org.telegram.ui.Components.m61 m61Var2 = photoViewer4.B2;
                if (m61Var2 != null) {
                    m61Var2.D();
                }
                photoViewer4.E2 = null;
                break;
            case 20:
                et0 et0Var = (et0) ((f50) this.f45197b).f37939b;
                et0Var.f37840r.f35655h7.unlock();
                PhotoViewer photoViewer5 = et0Var.f37840r;
                Runnable runnable = photoViewer5.f35687l4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.f35687l4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((gs0) this.f45197b).f38470b;
                Runnable runnable2 = photoViewer6.f35687l4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.f35687l4 = null;
                }
                break;
            case 22:
                ((pt0) this.f45197b).f5570s.d(true);
                break;
            case 23:
                ((tt0) this.f45197b).d = true;
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((yv0) this.f45197b).f44953c;
                premiumPreviewFragment.showDialog(new c31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((org.telegram.messenger.hk) this.f45197b).run(0);
                break;
            case 26:
                AndroidUtilities.addToClipboard((String) this.f45197b);
                break;
            case 27:
                ((lh.w3) this.f45197b).e(true);
                break;
            case 28:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) this.f45197b));
                break;
            default:
                cy0 cy0Var = (cy0) this.f45197b;
                cy0Var.G.getNotificationCenter().onAnimationFinish(cy0Var.F);
                break;
        }
    }
}
