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
public final class ul0 implements Utilities.Callback5, org.telegram.ui.Cells.y5, org.telegram.ui.Components.g71, org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.o1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.ll0, hg.e, fg.c2 {
    public final int f37293a;
    public final Object f37294b;

    public ul0(Object obj, int i10) {
        this.f37293a = i10;
        this.f37294b = obj;
    }

    @Override
    public a0.i D() {
        return null;
    }

    @Override
    public a0.i P() {
        return null;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f37293a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37294b;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f30285o0 = defaultWindowInsets;
                premiumPreviewFragment.f30267a.setPadding(0, defaultWindowInsets.f10075b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f30285o0.d);
                org.telegram.ui.Components.vl0 vl0Var = premiumPreviewFragment.f30267a;
                i0.c cVar = premiumPreviewFragment.f30285o0;
                AndroidUtilities.setViewLayoutMargins(vl0Var, cVar.f10074a, 0, cVar.f10076c, 0);
                lx0 lx0Var = premiumPreviewFragment.U;
                i0.c cVar2 = premiumPreviewFragment.f30285o0;
                lx0Var.setPadding(cVar2.f10074a, 0, cVar2.f10076c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f30285o0.f10074a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.f30285o0;
                    frameLayout.setPadding(i12, dp, cVar3.f10076c, cVar3.d);
                }
                return r0.l1.f41073b;
            default:
                fh0 fh0Var = (fh0) ((gi1) this.f37294b);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f10074a;
                fh0Var.M = i13;
                int i14 = defaultWindowInsets2.f10076c;
                fh0Var.N = i14;
                fh0Var.L = defaultWindowInsets2.d;
                View view2 = fh0Var.f32835y.f35500b;
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
                fh0Var.f32835y.setPadding(0, 0, 0, fh0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + fh0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    fh0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = fh0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fh0Var.f33117c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    fh0Var.f33117c.setLayoutParams(marginLayoutParams2);
                }
                fh0Var.E.setPadding(i13, 0, i14, fh0Var.L);
                if (z10) {
                    l1Var = l1Var.f41074a.m(0, 0, 0, fh0Var.L);
                }
                fh0Var.i0();
                fh0Var.h0();
                SparseArray sparseArray = fh0Var.f33115a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    ei1 ei1Var = (ei1) sparseArray.valueAt(i15);
                    if (ei1Var != null && (fragmentView = ei1Var.f32218a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f41073b;
        }
    }

    @Override
    public void a(int i10) {
        ci1 ci1Var = (ci1) this.f37294b;
        if (ci1Var.h == null && !ci1Var.f31676f.e()) {
            ci1Var.v.f30723f.e(false, true);
        }
        ci1Var.l();
    }

    @Override
    public void b() {
        switch (this.f37293a) {
            case 6:
                ((ow0) this.f37294b).e();
                return;
            default:
                ((pe1) this.f37294b).e();
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.c00 c00Var) {
        Drawable[] drawableArr = PhotoViewer.T8;
        c00Var.f(new org.telegram.ui.Components.d00((MediaController.SavedFilterState) this.f37294b));
    }

    @Override
    public boolean c0(int i10) {
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f37293a) {
            case 17:
                return ((z71) this.f37294b).Q(i10, view);
            case 18:
                final fb1 fb1Var = (fb1) this.f37294b;
                org.telegram.ui.ActionBar.d2[] d2VarArr = fb1Var.f32751h0;
                ka1 ka1Var = fb1Var.X;
                int i11 = ka1Var.I;
                if (i10 >= i11 && i10 <= ka1Var.J) {
                    final MessageObject messageObject = ((cb1) fb1Var.f32767v0.get(i10 - i11)).f31603b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fb1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    fb1 fb1Var2 = fb1Var;
                                    fb1Var2.getClass();
                                    fb1Var2.presentFragment(new kj0(messageObject));
                                    return;
                                default:
                                    fb1 fb1Var3 = fb1Var;
                                    fb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", fb1Var3.f32742b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    fb1Var3.presentFragment(new eo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    fb1 fb1Var2 = fb1Var;
                                    fb1Var2.getClass();
                                    fb1Var2.presentFragment(new kj0(messageObject));
                                    return;
                                default:
                                    fb1 fb1Var3 = fb1Var;
                                    fb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", fb1Var3.f32742b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    fb1Var3.presentFragment(new eo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(fb1Var.S.U0(view, false));
                    H.Z();
                } else {
                    int i12 = ka1Var.U;
                    if (i10 >= i12 && i10 <= ka1Var.V) {
                        ((ya1) fb1Var.Q.get(i10 - i12)).c(fb1Var.f32740a, fb1Var, d2VarArr, true);
                    } else {
                        int i13 = ka1Var.R;
                        if (i10 >= i13 && i10 <= ka1Var.S) {
                            ((ya1) fb1Var.O.get(i10 - i13)).c(fb1Var.f32740a, fb1Var, d2VarArr, true);
                        } else {
                            int i14 = ka1Var.X;
                            if (i10 < i14 || i10 > ka1Var.Y) {
                                return false;
                            }
                            ((ya1) fb1Var.P.get(i10 - i14)).c(fb1Var.f32740a, fb1Var, d2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((xe1) this.f37294b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        jy0 jy0Var = (jy0) this.f37294b;
        if (z10) {
            jy0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f37293a) {
            case 3:
                PhotoViewer photoViewer = ((pt0) this.f37294b).f35901b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f30227y, photoViewer.f30200v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((bw0) this.f37294b).finishFragment();
                return;
            case 5:
                ((vv0) this.f37294b).f37632a.R.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f37294b;
                int i14 = PopupNotificationActivity.f30255b0;
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
                ((org.telegram.messenger.vk) this.f37294b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((k21) this.f37294b).f34205b;
                ArrayList arrayList = proxyListActivity.H;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.c0(true);
                l21 l21Var = proxyListActivity.f30530a;
                if (l21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        l21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                        proxyListActivity.f30530a.n(ProxyListActivity.b0(proxyListActivity), 0);
                    }
                    proxyListActivity.f30530a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((zb1) this.f37294b).f39255a;
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
                    kc1 kc1Var = themeActivity.f30661a;
                    i12 = themeActivity.textSizeRow;
                    kc1Var.n(i12, new Object());
                    kc1 kc1Var2 = themeActivity.f30661a;
                    i13 = themeActivity.bubbleRadiusRow;
                    kc1Var2.n(i13, new Object());
                }
                if (themeActivity.f30665c != null) {
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
                    SparseArray sparseArray = N0.f17835a0;
                    int i17 = org.telegram.ui.ActionBar.j6.f18103n;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(i17);
                    if (h6Var != null) {
                        org.telegram.ui.ActionBar.c6 c6Var = new org.telegram.ui.ActionBar.c6();
                        c6Var.f17577c = "d";
                        c6Var.f17575a = "Blue_99_wp.jpg";
                        c6Var.f17576b = "Blue_99_wp.jpg";
                        h6Var.f17812y = c6Var;
                        N0.v(c6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.j6.t1(N0, true, false, true, false, false);
                        themeActivity.f30665c.x1(N0);
                        themeActivity.f30665c.x0(0);
                        return;
                    } else if (N0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f30669f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f30661a.m(themeActivity.f30681q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.j6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                ae1 ae1Var = ((dd1) this.f37294b).f31887a;
                org.telegram.ui.ActionBar.j6.j0(ae1Var.f30928e0, ae1Var.f30963s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ae1Var.f30928e0, Boolean.valueOf(ae1Var.f30932f0), null, -1);
                ae1Var.finishFragment();
                return;
            default:
                ((kh1) this.f37294b).f34374a.E0(true);
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f37293a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f37294b, (org.telegram.ui.Components.v51) obj, (View) obj2);
                return;
            default:
                g41 g41Var = (g41) this.f37294b;
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                h41 h41Var = g41Var.v;
                if (v51Var.f14046a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = g41Var.f32989b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(v51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            h41.H(h41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = g41Var.f32990c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(v51Var.d);
                        if (tL_messageReportOption != null) {
                            h41.H(h41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = g41Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            h41.H(h41Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    h41.H(h41Var, v51Var.f27829l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.zh((SharedConfig.ProxyInfo) this.f37294b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ay0) this.f37294b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f30336z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.msg_mini_lock3, 0);
                    uqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(uqVar, 0, 1, 33);
                    privacyControlActivity.f30336z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f30336z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void k0(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((fg.f1) this.f37294b).run();
    }
}
