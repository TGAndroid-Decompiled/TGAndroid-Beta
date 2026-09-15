package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
public final class tl0 implements Utilities.Callback5, org.telegram.ui.Cells.w5, org.telegram.ui.Components.t61, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.bl0, ig.e, ki.e, gg.b2 {
    public final int f37747a;
    public final Object f37748b;

    public tl0(Object obj, int i10) {
        this.f37747a = i10;
        this.f37748b = obj;
    }

    @Override
    public a0.i F() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f37747a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37748b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f31172o0 = defaultWindowInsets;
                premiumPreviewFragment.f31154a.setPadding(0, defaultWindowInsets.f10589b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f31172o0.d);
                org.telegram.ui.Components.ll0 ll0Var = premiumPreviewFragment.f31154a;
                i0.b bVar = premiumPreviewFragment.f31172o0;
                AndroidUtilities.setViewLayoutMargins(ll0Var, bVar.f10588a, 0, bVar.f10590c, 0);
                jx0 jx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f31172o0;
                jx0Var.setPadding(bVar2.f10588a, 0, bVar2.f10590c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f31172o0.f10588a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f31172o0;
                    frameLayout.setPadding(i12, dp, bVar3.f10590c, bVar3.d);
                }
                return r0.l1.f41854b;
            default:
                eh0 eh0Var = (eh0) ((ai1) this.f37748b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f10588a;
                eh0Var.M = i13;
                int i14 = defaultWindowInsets2.f10590c;
                eh0Var.N = i14;
                eh0Var.L = defaultWindowInsets2.d;
                View view2 = eh0Var.f33342y.f34679b;
                if (view2 != null && view2.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(44.0f);
                } else {
                    i10 = 0;
                }
                eh0Var.f33342y.setPadding(0, 0, 0, eh0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + eh0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) eh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    eh0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = eh0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) eh0Var.f31847c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    eh0Var.f31847c.setLayoutParams(marginLayoutParams2);
                }
                eh0Var.E.setPadding(i13, 0, i14, eh0Var.L);
                if (z10) {
                    l1Var = l1Var.f41855a.m(0, 0, 0, eh0Var.L);
                }
                eh0Var.i0();
                eh0Var.h0();
                SparseArray sparseArray = eh0Var.f31845a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    yh1 yh1Var = (yh1) sparseArray.valueAt(i15);
                    if (yh1Var != null && (fragmentView = yh1Var.f39911a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f41854b;
        }
    }

    @Override
    public void a() {
        switch (this.f37747a) {
            case 6:
                ((mw0) this.f37748b).e();
                return;
            default:
                ((ke1) this.f37748b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.vz vzVar) {
        Drawable[] drawableArr = PhotoViewer.T8;
        vzVar.f(new org.telegram.ui.Components.wz((MediaController.SavedFilterState) this.f37748b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        fy0 fy0Var = (fy0) this.f37748b;
        if (z10) {
            fy0Var.d.U((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f37747a) {
            case 17:
                return ((t71) this.f37748b).Q(i10, view);
            case 18:
                final ya1 ya1Var = (ya1) this.f37748b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = ya1Var.f39806h0;
                da1 da1Var = ya1Var.X;
                int i11 = da1Var.I;
                if (i10 >= i11 && i10 <= da1Var.J) {
                    final MessageObject messageObject = ((va1) ya1Var.f39822v0.get(i10 - i11)).f38488b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(ya1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ya1 ya1Var2 = ya1Var;
                                    ya1Var2.getClass();
                                    ya1Var2.presentFragment(new jj0(messageObject));
                                    return;
                                default:
                                    ya1 ya1Var3 = ya1Var;
                                    ya1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ya1Var3.f39797b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ya1Var3.presentFragment(new bo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ya1 ya1Var2 = ya1Var;
                                    ya1Var2.getClass();
                                    ya1Var2.presentFragment(new jj0(messageObject));
                                    return;
                                default:
                                    ya1 ya1Var3 = ya1Var;
                                    ya1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ya1Var3.f39797b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ya1Var3.presentFragment(new bo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(ya1Var.S.V0(view, false));
                    H.Z();
                } else {
                    int i12 = da1Var.U;
                    if (i10 >= i12 && i10 <= da1Var.V) {
                        ((ra1) ya1Var.Q.get(i10 - i12)).c(ya1Var.f39795a, ya1Var, b2VarArr, true);
                    } else {
                        int i13 = da1Var.R;
                        if (i10 >= i13 && i10 <= da1Var.S) {
                            ((ra1) ya1Var.O.get(i10 - i13)).c(ya1Var.f39795a, ya1Var, b2VarArr, true);
                        } else {
                            int i14 = da1Var.X;
                            if (i10 < i14 || i10 > da1Var.Y) {
                                return false;
                            }
                            ((ra1) ya1Var.P.get(i10 - i14)).c(ya1Var.f39795a, ya1Var, b2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((se1) this.f37748b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public int e() {
        UserInfoActivity userInfoActivity = (UserInfoActivity) this.f37748b;
        userInfoActivity.getClass();
        return userInfoActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f37747a) {
            case 3:
                PhotoViewer photoViewer = ((qt0) this.f37748b).f36936b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f31114y, photoViewer.f31087v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((aw0) this.f37748b).finishFragment();
                return;
            case 5:
                ((uv0) this.f37748b).f38170a.R.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f37748b;
                int i14 = PopupNotificationActivity.f31142b0;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 11:
                ((org.telegram.messenger.nk) this.f37748b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((e21) this.f37748b).f33193b;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.b0(true);
                f21 f21Var = proxyListActivity.f31418a;
                if (f21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        f21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f31418a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((ub1) this.f37748b).f37972a;
                if (AndroidUtilities.isTablet()) {
                    i11 = 18;
                } else {
                    i11 = 16;
                }
                boolean k02 = ThemeActivity.k0(themeActivity, i11);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    fc1 fc1Var = themeActivity.f31549a;
                    i12 = themeActivity.textSizeRow;
                    fc1Var.n(i12, new Object());
                    fc1 fc1Var2 = themeActivity.f31549a;
                    i13 = themeActivity.bubbleRadiusRow;
                    fc1Var2.n(i13, new Object());
                }
                if (themeActivity.f31553c != null) {
                    org.telegram.ui.ActionBar.h6 N0 = org.telegram.ui.ActionBar.i6.N0("Blue");
                    org.telegram.ui.ActionBar.h6 A0 = org.telegram.ui.ActionBar.i6.A0();
                    SparseArray sparseArray = N0.f18730a0;
                    int i17 = org.telegram.ui.ActionBar.i6.f19014n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(i17);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.f18510c = "d";
                        b6Var.f18508a = "Blue_99_wp.jpg";
                        b6Var.f18509b = "Blue_99_wp.jpg";
                        g6Var.f18712y = b6Var;
                        N0.v(b6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.i6.t1(N0, true, false, true, false, false);
                        themeActivity.f31553c.y1(N0);
                        themeActivity.f31553c.x0(0);
                        return;
                    } else if (N0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f31557f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f31549a.m(themeActivity.f31569q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.i6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                vd1 vd1Var = ((yc1) this.f37748b).f39847a;
                org.telegram.ui.ActionBar.i6.j0(vd1Var.f38527e0, vd1Var.f38562s, true);
                org.telegram.ui.ActionBar.i6.o();
                org.telegram.ui.ActionBar.i6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, vd1Var.f38527e0, Boolean.valueOf(vd1Var.f38531f0), null, -1);
                vd1Var.finishFragment();
                return;
            default:
                ((eh1) this.f37748b).f33343a.E0(true);
                return;
        }
    }

    @Override
    public void h(int i10) {
        wh1 wh1Var = (wh1) this.f37748b;
        if (wh1Var.h == null && !wh1Var.f39229f.e()) {
            wh1Var.v.f31611f.e(false, true);
        }
        wh1Var.l();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f37747a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f37748b, (org.telegram.ui.Components.i51) obj, (View) obj2);
                return;
            default:
                a41 a41Var = (a41) this.f37748b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                b41 b41Var = a41Var.v;
                if (i51Var.f15533a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a41Var.f31690b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(i51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            b41.H(b41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a41Var.f31691c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(i51Var.d);
                        if (tL_messageReportOption != null) {
                            b41.H(b41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = a41Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            b41.H(b41Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    b41.H(b41Var, i51Var.f24894l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rh((SharedConfig.ProxyInfo) this.f37748b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((yx0) this.f37748b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f31223z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                    oqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
                    privacyControlActivity.f31223z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f31223z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void Q(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((gg.e1) this.f37748b).run();
    }
}
