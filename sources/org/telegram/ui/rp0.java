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
public final class rp0 implements org.telegram.ui.Cells.x5, org.telegram.ui.Components.x71, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.bm0, jg.e, hg.z1 {
    public final int f41205a;
    public final Object f41206b;

    public rp0(Object obj, int i10) {
        this.f41205a = i10;
        this.f41206b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f41205a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f41206b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.f33819o0 = defaultWindowInsets;
                premiumPreviewFragment.f33801a.setPadding(0, defaultWindowInsets.f12316b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f33819o0.d);
                org.telegram.ui.Components.lm0 lm0Var = premiumPreviewFragment.f33801a;
                i0.b bVar = premiumPreviewFragment.f33819o0;
                AndroidUtilities.setViewLayoutMargins(lm0Var, bVar.f12315a, 0, bVar.f12317c, 0);
                qw0 qw0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f33819o0;
                qw0Var.setPadding(bVar2.f12315a, 0, bVar2.f12317c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f33819o0.f12315a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f33819o0;
                    frameLayout.setPadding(i12, dp, bVar3.f12317c, bVar3.d);
                }
                return r0.k1.f45249b;
            default:
                qg0 qg0Var = (qg0) ((tg1) this.f41206b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i13 = defaultWindowInsets2.f12315a;
                qg0Var.M = i13;
                int i14 = defaultWindowInsets2.f12317c;
                qg0Var.N = i14;
                qg0Var.L = defaultWindowInsets2.d;
                View view2 = qg0Var.f40821y.f36333b;
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
                qg0Var.f40821y.setPadding(0, 0, 0, qg0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + qg0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qg0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    qg0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = qg0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) qg0Var.f42051c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    qg0Var.f42051c.setLayoutParams(marginLayoutParams2);
                }
                qg0Var.E.setPadding(i13, 0, i14, qg0Var.L);
                if (z10) {
                    k1Var = k1Var.f45250a.m(0, 0, 0, qg0Var.L);
                }
                qg0Var.i0();
                qg0Var.h0();
                SparseArray sparseArray = qg0Var.f42049a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    rg1 rg1Var = (rg1) sparseArray.valueAt(i15);
                    if (rg1Var != null && (fragmentView = rg1Var.f41154a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f45249b;
        }
    }

    @Override
    public a0.h G() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public void a() {
        switch (this.f41205a) {
            case 5:
                ((tv0) this.f41206b).e();
                return;
            default:
                ((dd1) this.f41206b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.c00 c00Var) {
        Drawable[] drawableArr = PhotoViewer.U8;
        c00Var.f(new org.telegram.ui.Components.d00((MediaController.SavedFilterState) this.f41206b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        mx0 mx0Var = (mx0) this.f41206b;
        if (z10) {
            mx0Var.d.U((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f41205a) {
            case 16:
                return ((n61) this.f41206b).Q(i10, view);
            case 17:
                final t91 t91Var = (t91) this.f41206b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = t91Var.f41952h0;
                y81 y81Var = t91Var.X;
                int i11 = y81Var.I;
                if (i10 >= i11 && i10 <= y81Var.J) {
                    final MessageObject messageObject = ((q91) t91Var.f41968v0.get(i10 - i11)).f40751b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.h80 H = org.telegram.ui.Components.h80.H(t91Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    t91 t91Var2 = t91Var;
                                    t91Var2.getClass();
                                    t91Var2.presentFragment(new xi0(messageObject));
                                    return;
                                default:
                                    t91 t91Var3 = t91Var;
                                    t91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", t91Var3.f41943b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    t91Var3.presentFragment(new sn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    t91 t91Var2 = t91Var;
                                    t91Var2.getClass();
                                    t91Var2.presentFragment(new xi0(messageObject));
                                    return;
                                default:
                                    t91 t91Var3 = t91Var;
                                    t91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", t91Var3.f41943b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    t91Var3.presentFragment(new sn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(t91Var.S.W0(view, false));
                    H.Z();
                } else {
                    int i12 = y81Var.U;
                    if (i10 >= i12 && i10 <= y81Var.V) {
                        ((m91) t91Var.Q.get(i10 - i12)).c(t91Var.f41941a, t91Var, c2VarArr, true);
                    } else {
                        int i13 = y81Var.R;
                        if (i10 >= i13 && i10 <= y81Var.S) {
                            ((m91) t91Var.O.get(i10 - i13)).c(t91Var.f41941a, t91Var, c2VarArr, true);
                        } else {
                            int i14 = y81Var.X;
                            if (i10 < i14 || i10 > y81Var.Y) {
                                return false;
                            }
                            ((m91) t91Var.P.get(i10 - i14)).c(t91Var.f41941a, t91Var, c2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((ld1) this.f41206b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public void f(int i10) {
        pg1 pg1Var = (pg1) this.f41206b;
        if (pg1Var.h == null && !pg1Var.f40536f.e()) {
            pg1Var.v.f34262f.e(false, true);
        }
        pg1Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10 = false;
        switch (this.f41205a) {
            case 2:
                PhotoViewer photoViewer = ((ys0) this.f41206b).f43945b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f33761y, photoViewer.f33734v2, true);
                    photoViewer.H0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ((hv0) this.f41206b).finishFragment();
                return;
            case 4:
                ((bv0) this.f41206b).f36146a.R.s();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f41206b;
                int i14 = PopupNotificationActivity.f33789b0;
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
            case 10:
                ((org.telegram.messenger.ik) this.f41206b).run(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = ((l11) this.f41206b).f39103b;
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
                m11 m11Var = proxyListActivity.f34069a;
                if (m11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        m11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f34069a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((na1) this.f41206b).f39790a;
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
                    ya1 ya1Var = themeActivity.f34200a;
                    i12 = themeActivity.textSizeRow;
                    ya1Var.n(i12, new Object());
                    ya1 ya1Var2 = themeActivity.f34200a;
                    i13 = themeActivity.bubbleRadiusRow;
                    ya1Var2.n(i13, new Object());
                }
                if (themeActivity.f34204c != null) {
                    org.telegram.ui.ActionBar.j6 P0 = org.telegram.ui.ActionBar.k6.P0("Blue");
                    org.telegram.ui.ActionBar.j6 C0 = org.telegram.ui.ActionBar.k6.C0();
                    SparseArray sparseArray = P0.f21021a0;
                    int i17 = org.telegram.ui.ActionBar.k6.f21360n;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) sparseArray.get(i17);
                    if (i6Var != null) {
                        org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                        d6Var.f20818c = "d";
                        d6Var.f20816a = "Blue_99_wp.jpg";
                        d6Var.f20817b = "Blue_99_wp.jpg";
                        i6Var.f20985y = d6Var;
                        P0.v(d6Var);
                    }
                    if (P0 != C0) {
                        P0.u(i17);
                        org.telegram.ui.ActionBar.k6.w1(P0, true, false, true, false, false);
                        themeActivity.f34204c.E1(P0, null);
                        themeActivity.f34204c.x0(0);
                        return;
                    } else if (P0.Y != i17) {
                        if (themeActivity.f34208f == 1) {
                            z10 = true;
                        }
                        org.telegram.ui.ActionBar.k6.H1(C0, z10, i17, null);
                        themeActivity.f34200a.m(themeActivity.f34220q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.k6.r1(true);
                        return;
                    }
                }
                return;
            case 20:
                pc1 pc1Var = ((sb1) this.f41206b).f41341a;
                org.telegram.ui.ActionBar.k6.k0(pc1Var.f40460f0, pc1Var.v, true);
                org.telegram.ui.ActionBar.k6.o();
                org.telegram.ui.ActionBar.k6.q1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, pc1Var.f40460f0, Boolean.valueOf(pc1Var.f40463g0), null, -1);
                pc1Var.finishFragment();
                return;
            default:
                ((yf1) this.f41206b).f43843a.E0(true);
                return;
        }
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ph((SharedConfig.ProxyInfo) this.f41206b, j10, 1));
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        q21 q21Var = (q21) this.f41206b;
        org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        r21 r21Var = q21Var.v;
        if (l61Var.f44712a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = q21Var.f40694b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(l61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    r21.J(r21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = q21Var.f40695c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(l61Var.d);
                if (tL_messageReportOption != null) {
                    r21.J(r21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = q21Var.d;
            if (tL_reportResultAddComment != null) {
                byte[] bArr = tL_reportResultAddComment.option;
                if (bArr != null) {
                    r21.J(r21Var, null, bArr, null);
                    return;
                }
                return;
            }
            r21.J(r21Var, l61Var.f28227l, null, null);
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((fx0) this.f41206b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.A0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(R.drawable.msg_mini_lock3, 0);
                    vqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(vqVar, 0, 1, 33);
                    privacyControlActivity.A0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.A0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void S(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((hg.d1) this.f41206b).run();
    }
}
