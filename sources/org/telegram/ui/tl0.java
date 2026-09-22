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
public final class tl0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.t61, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.bl0, ig.e, gg.b2 {
    public final int f37696a;
    public final Object f37697b;

    public tl0(Object obj, int i10) {
        this.f37696a = i10;
        this.f37697b = obj;
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
        switch (this.f37696a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37697b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f31170o0 = defaultWindowInsets;
                premiumPreviewFragment.f31152a.setPadding(0, defaultWindowInsets.f10591b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f31170o0.d);
                org.telegram.ui.Components.ll0 ll0Var = premiumPreviewFragment.f31152a;
                i0.b bVar = premiumPreviewFragment.f31170o0;
                AndroidUtilities.setViewLayoutMargins(ll0Var, bVar.f10590a, 0, bVar.f10592c, 0);
                jx0 jx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f31170o0;
                jx0Var.setPadding(bVar2.f10590a, 0, bVar2.f10592c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f31170o0.f10590a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f31170o0;
                    frameLayout.setPadding(i12, dp, bVar3.f10592c, bVar3.d);
                }
                return r0.l1.f41850b;
            default:
                eh0 eh0Var = (eh0) ((bi1) this.f37697b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f10590a;
                eh0Var.M = i13;
                int i14 = defaultWindowInsets2.f10592c;
                eh0Var.N = i14;
                eh0Var.L = defaultWindowInsets2.d;
                View view2 = eh0Var.f33346y.f34915b;
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
                eh0Var.f33346y.setPadding(0, 0, 0, eh0Var.L);
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
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) eh0Var.f32167c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    eh0Var.f32167c.setLayoutParams(marginLayoutParams2);
                }
                eh0Var.E.setPadding(i13, 0, i14, eh0Var.L);
                if (z10) {
                    l1Var = l1Var.f41851a.m(0, 0, 0, eh0Var.L);
                }
                eh0Var.i0();
                eh0Var.h0();
                SparseArray sparseArray = eh0Var.f32165a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    zh1 zh1Var = (zh1) sparseArray.valueAt(i15);
                    if (zh1Var != null && (fragmentView = zh1Var.f40207a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f41850b;
        }
    }

    @Override
    public void a() {
        switch (this.f37696a) {
            case 6:
                ((mw0) this.f37697b).e();
                return;
            default:
                ((le1) this.f37697b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.vz vzVar) {
        Drawable[] drawableArr = PhotoViewer.U8;
        vzVar.f(new org.telegram.ui.Components.wz((MediaController.SavedFilterState) this.f37697b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        fy0 fy0Var = (fy0) this.f37697b;
        if (z10) {
            fy0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f37696a) {
            case 17:
                return ((u71) this.f37697b).Q(i10, view);
            case 18:
                final za1 za1Var = (za1) this.f37697b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = za1Var.f40119h0;
                ea1 ea1Var = za1Var.X;
                int i11 = ea1Var.I;
                if (i10 >= i11 && i10 <= ea1Var.J) {
                    final MessageObject messageObject = ((wa1) za1Var.f40135v0.get(i10 - i11)).f38764b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(za1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    za1 za1Var2 = za1Var;
                                    za1Var2.getClass();
                                    za1Var2.presentFragment(new jj0(messageObject));
                                    return;
                                default:
                                    za1 za1Var3 = za1Var;
                                    za1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", za1Var3.f40110b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    za1Var3.presentFragment(new bo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    za1 za1Var2 = za1Var;
                                    za1Var2.getClass();
                                    za1Var2.presentFragment(new jj0(messageObject));
                                    return;
                                default:
                                    za1 za1Var3 = za1Var;
                                    za1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", za1Var3.f40110b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    za1Var3.presentFragment(new bo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(za1Var.S.V0(view, false));
                    H.Z();
                } else {
                    int i12 = ea1Var.U;
                    if (i10 >= i12 && i10 <= ea1Var.V) {
                        ((sa1) za1Var.Q.get(i10 - i12)).c(za1Var.f40108a, za1Var, b2VarArr, true);
                    } else {
                        int i13 = ea1Var.R;
                        if (i10 >= i13 && i10 <= ea1Var.S) {
                            ((sa1) za1Var.O.get(i10 - i13)).c(za1Var.f40108a, za1Var, b2VarArr, true);
                        } else {
                            int i14 = ea1Var.X;
                            if (i10 < i14 || i10 > ea1Var.Y) {
                                return false;
                            }
                            ((sa1) za1Var.P.get(i10 - i14)).c(za1Var.f40108a, za1Var, b2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((te1) this.f37697b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f37696a) {
            case 3:
                PhotoViewer photoViewer = ((qt0) this.f37697b).f36938b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f31112y, photoViewer.f31085v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((aw0) this.f37697b).finishFragment();
                return;
            case 5:
                ((uv0) this.f37697b).f38184a.R.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f37697b;
                int i14 = PopupNotificationActivity.f31140b0;
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
                ((org.telegram.messenger.nk) this.f37697b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((f21) this.f37697b).f33467b;
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
                g21 g21Var = proxyListActivity.f31415a;
                if (g21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        g21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f31415a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((vb1) this.f37697b).f38507a;
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
                    gc1 gc1Var = themeActivity.f31546a;
                    i12 = themeActivity.textSizeRow;
                    gc1Var.n(i12, new Object());
                    gc1 gc1Var2 = themeActivity.f31546a;
                    i13 = themeActivity.bubbleRadiusRow;
                    gc1Var2.n(i13, new Object());
                }
                if (themeActivity.f31550c != null) {
                    org.telegram.ui.ActionBar.h6 N0 = org.telegram.ui.ActionBar.i6.N0("Blue");
                    org.telegram.ui.ActionBar.h6 A0 = org.telegram.ui.ActionBar.i6.A0();
                    SparseArray sparseArray = N0.f18728a0;
                    int i17 = org.telegram.ui.ActionBar.i6.f19011n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(i17);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.f18508c = "d";
                        b6Var.f18506a = "Blue_99_wp.jpg";
                        b6Var.f18507b = "Blue_99_wp.jpg";
                        g6Var.f18710y = b6Var;
                        N0.v(b6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.i6.t1(N0, true, false, true, false, false);
                        themeActivity.f31550c.y1(N0);
                        themeActivity.f31550c.x0(0);
                        return;
                    } else if (N0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f31554f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f31546a.m(themeActivity.f31566q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.i6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                wd1 wd1Var = ((zc1) this.f37697b).f40153a;
                org.telegram.ui.ActionBar.i6.j0(wd1Var.f38800e0, wd1Var.f38835s, true);
                org.telegram.ui.ActionBar.i6.o();
                org.telegram.ui.ActionBar.i6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, wd1Var.f38800e0, Boolean.valueOf(wd1Var.f38804f0), null, -1);
                wd1Var.finishFragment();
                return;
            default:
                ((fh1) this.f37697b).f33603a.E0(true);
                return;
        }
    }

    @Override
    public void h(int i10) {
        xh1 xh1Var = (xh1) this.f37697b;
        if (xh1Var.h == null && !xh1Var.f39631f.e()) {
            xh1Var.v.f31608f.e(false, true);
        }
        xh1Var.l();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f37696a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f37697b, (org.telegram.ui.Components.i51) obj, (View) obj2);
                return;
            default:
                b41 b41Var = (b41) this.f37697b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                c41 c41Var = b41Var.v;
                if (i51Var.f15531a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b41Var.f32031b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(i51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            c41.H(c41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b41Var.f32032c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(i51Var.d);
                        if (tL_messageReportOption != null) {
                            c41.H(c41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = b41Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            c41.H(c41Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    c41.H(c41Var, i51Var.f24900l, null, null);
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
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rh((SharedConfig.ProxyInfo) this.f37697b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((yx0) this.f37697b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f31221z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                    oqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
                    privacyControlActivity.f31221z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f31221z0);
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
        ((gg.e1) this.f37697b).run();
    }
}
