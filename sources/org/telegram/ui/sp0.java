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
public final class sp0 implements org.telegram.ui.Cells.x5, org.telegram.ui.Components.y71, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.cm0, jg.e, hg.z1 {
    public final int f41782a;
    public final Object f41783b;

    public sp0(Object obj, int i10) {
        this.f41782a = i10;
        this.f41783b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f41782a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f41783b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.f33817o0 = defaultWindowInsets;
                premiumPreviewFragment.f33799a.setPadding(0, defaultWindowInsets.f12316b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f33817o0.d);
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.f33799a;
                i0.b bVar = premiumPreviewFragment.f33817o0;
                AndroidUtilities.setViewLayoutMargins(mm0Var, bVar.f12315a, 0, bVar.f12317c, 0);
                rw0 rw0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f33817o0;
                rw0Var.setPadding(bVar2.f12315a, 0, bVar2.f12317c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f33817o0.f12315a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f33817o0;
                    frameLayout.setPadding(i12, dp, bVar3.f12317c, bVar3.d);
                }
                return r0.k1.f45250b;
            default:
                rg0 rg0Var = (rg0) ((ug1) this.f41783b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i13 = defaultWindowInsets2.f12315a;
                rg0Var.M = i13;
                int i14 = defaultWindowInsets2.f12317c;
                rg0Var.N = i14;
                rg0Var.L = defaultWindowInsets2.d;
                View view2 = rg0Var.f41133y.f36623b;
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
                rg0Var.f41133y.setPadding(0, 0, 0, rg0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + rg0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rg0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    rg0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = rg0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) rg0Var.f42433c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    rg0Var.f42433c.setLayoutParams(marginLayoutParams2);
                }
                rg0Var.E.setPadding(i13, 0, i14, rg0Var.L);
                if (z10) {
                    k1Var = k1Var.f45251a.m(0, 0, 0, rg0Var.L);
                }
                rg0Var.i0();
                rg0Var.h0();
                SparseArray sparseArray = rg0Var.f42431a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    sg1 sg1Var = (sg1) sparseArray.valueAt(i15);
                    if (sg1Var != null && (fragmentView = sg1Var.f41408a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f45250b;
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
        switch (this.f41782a) {
            case 5:
                ((uv0) this.f41783b).e();
                return;
            default:
                ((ed1) this.f41783b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.e00 e00Var) {
        Drawable[] drawableArr = PhotoViewer.U8;
        e00Var.f(new org.telegram.ui.Components.f00((MediaController.SavedFilterState) this.f41783b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        nx0 nx0Var = (nx0) this.f41783b;
        if (z10) {
            nx0Var.d.U((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f41782a) {
            case 16:
                return ((o61) this.f41783b).Q(i10, view);
            case 17:
                final u91 u91Var = (u91) this.f41783b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = u91Var.f42321h0;
                z81 z81Var = u91Var.X;
                int i11 = z81Var.I;
                if (i10 >= i11 && i10 <= z81Var.J) {
                    final MessageObject messageObject = ((r91) u91Var.f42337v0.get(i10 - i11)).f41065b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(u91Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    u91 u91Var2 = u91Var;
                                    u91Var2.getClass();
                                    u91Var2.presentFragment(new yi0(messageObject));
                                    return;
                                default:
                                    u91 u91Var3 = u91Var;
                                    u91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", u91Var3.f42312b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    u91Var3.presentFragment(new sn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    u91 u91Var2 = u91Var;
                                    u91Var2.getClass();
                                    u91Var2.presentFragment(new yi0(messageObject));
                                    return;
                                default:
                                    u91 u91Var3 = u91Var;
                                    u91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", u91Var3.f42312b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    u91Var3.presentFragment(new sn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(u91Var.S.W0(view, false));
                    H.Z();
                } else {
                    int i12 = z81Var.U;
                    if (i10 >= i12 && i10 <= z81Var.V) {
                        ((n91) u91Var.Q.get(i10 - i12)).c(u91Var.f42310a, u91Var, c2VarArr, true);
                    } else {
                        int i13 = z81Var.R;
                        if (i10 >= i13 && i10 <= z81Var.S) {
                            ((n91) u91Var.O.get(i10 - i13)).c(u91Var.f42310a, u91Var, c2VarArr, true);
                        } else {
                            int i14 = z81Var.X;
                            if (i10 < i14 || i10 > z81Var.Y) {
                                return false;
                            }
                            ((n91) u91Var.P.get(i10 - i14)).c(u91Var.f42310a, u91Var, c2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((md1) this.f41783b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public void f(int i10) {
        qg1 qg1Var = (qg1) this.f41783b;
        if (qg1Var.h == null && !qg1Var.f40806f.e()) {
            qg1Var.v.f34260f.e(false, true);
        }
        qg1Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10 = false;
        switch (this.f41782a) {
            case 2:
                PhotoViewer photoViewer = ((zs0) this.f41783b).f44200b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f33759y, photoViewer.f33732v2, true);
                    photoViewer.H0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ((iv0) this.f41783b).finishFragment();
                return;
            case 4:
                ((cv0) this.f41783b).f36437a.R.s();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f41783b;
                int i14 = PopupNotificationActivity.f33787b0;
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
                ((org.telegram.messenger.hk) this.f41783b).run(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = ((m11) this.f41783b).f39357b;
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
                n11 n11Var = proxyListActivity.f34067a;
                if (n11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        n11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f34067a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((oa1) this.f41783b).f40115a;
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
                    za1 za1Var = themeActivity.f34198a;
                    i12 = themeActivity.textSizeRow;
                    za1Var.n(i12, new Object());
                    za1 za1Var2 = themeActivity.f34198a;
                    i13 = themeActivity.bubbleRadiusRow;
                    za1Var2.n(i13, new Object());
                }
                if (themeActivity.f34202c != null) {
                    org.telegram.ui.ActionBar.j6 P0 = org.telegram.ui.ActionBar.k6.P0("Blue");
                    org.telegram.ui.ActionBar.j6 C0 = org.telegram.ui.ActionBar.k6.C0();
                    SparseArray sparseArray = P0.f21020a0;
                    int i17 = org.telegram.ui.ActionBar.k6.f21359n;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) sparseArray.get(i17);
                    if (i6Var != null) {
                        org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                        d6Var.f20817c = "d";
                        d6Var.f20815a = "Blue_99_wp.jpg";
                        d6Var.f20816b = "Blue_99_wp.jpg";
                        i6Var.f20984y = d6Var;
                        P0.v(d6Var);
                    }
                    if (P0 != C0) {
                        P0.u(i17);
                        org.telegram.ui.ActionBar.k6.w1(P0, true, false, true, false, false);
                        themeActivity.f34202c.E1(P0, null);
                        themeActivity.f34202c.x0(0);
                        return;
                    } else if (P0.Y != i17) {
                        if (themeActivity.f34206f == 1) {
                            z10 = true;
                        }
                        org.telegram.ui.ActionBar.k6.H1(C0, z10, i17, null);
                        themeActivity.f34198a.m(themeActivity.f34218q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.k6.r1(true);
                        return;
                    }
                }
                return;
            case 20:
                qc1 qc1Var = ((tb1) this.f41783b).f41945a;
                org.telegram.ui.ActionBar.k6.k0(qc1Var.f40731f0, qc1Var.v, true);
                org.telegram.ui.ActionBar.k6.o();
                org.telegram.ui.ActionBar.k6.q1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, qc1Var.f40731f0, Boolean.valueOf(qc1Var.f40734g0), null, -1);
                qc1Var.finishFragment();
                return;
            default:
                ((zf1) this.f41783b).f44136a.E0(true);
                return;
        }
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.oh((SharedConfig.ProxyInfo) this.f41783b, j10, 1));
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        r21 r21Var = (r21) this.f41783b;
        org.telegram.ui.Components.m61 m61Var = (org.telegram.ui.Components.m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        s21 s21Var = r21Var.v;
        if (m61Var.f44713a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = r21Var.f40980b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(m61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    s21.J(s21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = r21Var.f40981c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(m61Var.d);
                if (tL_messageReportOption != null) {
                    s21.J(s21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = r21Var.d;
            if (tL_reportResultAddComment != null) {
                byte[] bArr = tL_reportResultAddComment.option;
                if (bArr != null) {
                    s21.J(s21Var, null, bArr, null);
                    return;
                }
                return;
            }
            s21.J(s21Var, m61Var.f28559l, null, null);
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((gx0) this.f41783b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.A0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.msg_mini_lock3, 0);
                    xqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(xqVar, 0, 1, 33);
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
        ((hg.d1) this.f41783b).run();
    }
}
