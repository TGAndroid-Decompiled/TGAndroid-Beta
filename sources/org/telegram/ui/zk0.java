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
public final class zk0 implements Utilities.Callback5, org.telegram.ui.Cells.v5, org.telegram.ui.Components.k61, org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.n1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.y4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.bl0, tf.e, rf.j1 {
    public final int f45254a;
    public final Object f45255b;

    public zk0(Object obj, int i10) {
        this.f45254a = i10;
        this.f45255b = obj;
    }

    @Override
    public boolean A(int i10) {
        return true;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f45254a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f45255b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.f35920k0 = defaultWindowInsets;
                premiumPreviewFragment.f35905a.setPadding(0, defaultWindowInsets.f8187b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f35920k0.d);
                org.telegram.ui.Components.jl0 jl0Var = premiumPreviewFragment.f35905a;
                i0.b bVar = premiumPreviewFragment.f35920k0;
                AndroidUtilities.setViewLayoutMargins(jl0Var, bVar.f8186a, 0, bVar.f8188c, 0);
                ew0 ew0Var = premiumPreviewFragment.Q;
                i0.b bVar2 = premiumPreviewFragment.f35920k0;
                ew0Var.setPadding(bVar2.f8186a, 0, bVar2.f8188c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.F;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f35920k0.f8186a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f35920k0;
                    frameLayout.setPadding(i12, dp, bVar3.f8188c, bVar3.d);
                }
                return r0.m1.f46842b;
            default:
                ng0 ng0Var = (ng0) ((vg1) this.f45255b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i13 = defaultWindowInsets2.f8186a;
                ng0Var.I = i13;
                int i14 = defaultWindowInsets2.f8188c;
                ng0Var.J = i14;
                ng0Var.H = defaultWindowInsets2.d;
                View view2 = ng0Var.f40799y.f37822b;
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
                ng0Var.f40799y.setPadding(0, 0, 0, ng0Var.H);
                int dp2 = AndroidUtilities.dp(72.0f) + ng0Var.H + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ng0Var.D.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    ng0Var.D.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = ng0Var.H + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ng0Var.f43594c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    ng0Var.f43594c.setLayoutParams(marginLayoutParams2);
                }
                ng0Var.A.setPadding(i13, 0, i14, ng0Var.H);
                if (z10) {
                    m1Var = m1Var.f46843a.m(0, 0, 0, ng0Var.H);
                }
                ng0Var.i0();
                ng0Var.h0();
                SparseArray sparseArray = ng0Var.f43592a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    tg1 tg1Var = (tg1) sparseArray.valueAt(i15);
                    if (tg1Var != null && (fragmentView = tg1Var.f42707a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                return r0.m1.f46842b;
        }
    }

    @Override
    public void a() {
        switch (this.f45254a) {
            case 6:
                ((iv0) this.f45255b).e();
                return;
            default:
                ((fd1) this.f45255b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.qz qzVar) {
        Drawable[] drawableArr = PhotoViewer.P8;
        qzVar.f(new org.telegram.ui.Components.rz((MediaController.SavedFilterState) this.f45255b));
    }

    @Override
    public boolean c(int i10, View view) {
        switch (this.f45254a) {
            case 17:
                return ((q61) this.f45255b).Q(i10, view);
            case 18:
                final t91 t91Var = (t91) this.f45255b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = t91Var.f42594d0;
                y81 y81Var = t91Var.T;
                int i11 = y81Var.E;
                if (i10 >= i11 && i10 <= y81Var.F) {
                    final MessageObject messageObject = ((q91) t91Var.f42611r0.get(i10 - i11)).f41602b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(t91Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    t91 t91Var2 = t91Var;
                                    t91Var2.getClass();
                                    t91Var2.presentFragment(new si0(messageObject));
                                    return;
                                default:
                                    t91 t91Var3 = t91Var;
                                    t91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", t91Var3.f42590b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    t91Var3.presentFragment(new tn(bundle), false);
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
                                    t91Var2.presentFragment(new si0(messageObject));
                                    return;
                                default:
                                    t91 t91Var3 = t91Var;
                                    t91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", t91Var3.f42590b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    t91Var3.presentFragment(new tn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(t91Var.O.V0(view, false));
                    H.Z();
                } else {
                    int i12 = y81Var.Q;
                    if (i10 >= i12 && i10 <= y81Var.R) {
                        ((m91) t91Var.M.get(i10 - i12)).c(t91Var.f42588a, t91Var, c2VarArr, true);
                    } else {
                        int i13 = y81Var.N;
                        if (i10 >= i13 && i10 <= y81Var.O) {
                            ((m91) t91Var.K.get(i10 - i13)).c(t91Var.f42588a, t91Var, c2VarArr, true);
                        } else {
                            int i14 = y81Var.T;
                            if (i10 < i14 || i10 > y81Var.U) {
                                return false;
                            }
                            ((m91) t91Var.L.get(i10 - i14)).c(t91Var.f42588a, t91Var, c2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((md1) this.f45255b).F.c(i10, view);
                return true;
        }
    }

    @Override
    public boolean d(org.telegram.ui.Cells.z4 z4Var, boolean z10) {
        ax0 ax0Var = (ax0) this.f45255b;
        if (z10) {
            ax0Var.d.U((Long) z4Var.getTag(), z4Var);
            return true;
        }
        return true;
    }

    @Override
    public void f(int i10) {
        rg1 rg1Var = (rg1) this.f45255b;
        if (rg1Var.h == null && !rg1Var.f42100f.e()) {
            rg1Var.v.f36354f.e(false, true);
        }
        rg1Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f45254a) {
            case 3:
                PhotoViewer photoViewer = ((ms0) this.f45255b).f40632b;
                try {
                    AndroidUtilities.openForView(photoViewer.P4, photoViewer.f35864y, photoViewer.f35802r2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
                ((vu0) this.f45255b).finishFragment();
                return;
            case 5:
                ((pu0) this.f45255b).f41468a.N.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f45255b;
                int i14 = PopupNotificationActivity.X;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 11:
                ((org.telegram.messenger.kk) this.f45255b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((b11) this.f45255b).f36647b;
                ArrayList arrayList = proxyListActivity.D;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.f36164e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.c0(true);
                c11 c11Var = proxyListActivity.f36161a;
                if (c11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        c11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                        proxyListActivity.f36161a.n(ProxyListActivity.b0(proxyListActivity), 0);
                    }
                    proxyListActivity.f36161a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((na1) this.f45255b).f40766a;
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
                    ya1 ya1Var = themeActivity.f36290a;
                    i12 = themeActivity.textSizeRow;
                    ya1Var.n(i12, new Object());
                    ya1 ya1Var2 = themeActivity.f36290a;
                    i13 = themeActivity.bubbleRadiusRow;
                    ya1Var2.n(i13, new Object());
                }
                if (themeActivity.f36294c != null) {
                    org.telegram.ui.ActionBar.f6 N0 = org.telegram.ui.ActionBar.g6.N0("Blue");
                    org.telegram.ui.ActionBar.f6 A0 = org.telegram.ui.ActionBar.g6.A0();
                    SparseArray sparseArray = N0.W;
                    int i17 = org.telegram.ui.ActionBar.g6.f23234n;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) sparseArray.get(i17);
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.f24020c = "d";
                        z5Var.f24018a = "Blue_99_wp.jpg";
                        z5Var.f24019b = "Blue_99_wp.jpg";
                        e6Var.f22923y = z5Var;
                        N0.v(z5Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.g6.t1(N0, true, false, true, false, false);
                        themeActivity.f36294c.y1(N0);
                        themeActivity.f36294c.x0(0);
                        return;
                    } else if (N0.U != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f36299f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f36290a.m(themeActivity.m0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.g6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                qc1 qc1Var = ((sb1) this.f45255b).f42352a;
                org.telegram.ui.ActionBar.g6.j0(qc1Var.f41624a0, qc1Var.f41669s, true);
                org.telegram.ui.ActionBar.g6.o();
                org.telegram.ui.ActionBar.g6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, qc1Var.f41624a0, Boolean.valueOf(qc1Var.f41627b0), null, -1);
                qc1Var.finishFragment();
                return;
            default:
                ((ag1) this.f45255b).f36548a.E0(true);
                return;
        }
    }

    @Override
    public a0.h q() {
        return null;
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f45254a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f45255b, (org.telegram.ui.Components.w41) obj, (View) obj2);
                return;
            default:
                x21 x21Var = (x21) this.f45255b;
                org.telegram.ui.Components.w41 w41Var = (org.telegram.ui.Components.w41) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                y21 y21Var = x21Var.v;
                if (w41Var.f50845a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = x21Var.f44443b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(w41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            y21.G(y21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = x21Var.f44444c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(w41Var.d);
                        if (tL_messageReportOption != null) {
                            y21.G(y21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = x21Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            y21.G(y21Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    y21.G(y21Var, w41Var.f34300l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public a0.h t() {
        return null;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.f45255b, j10, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((tw0) this.f45255b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f35965v0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.msg_mini_lock3, 0);
                    iqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(iqVar, 0, 1, 33);
                    privacyControlActivity.f35965v0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f35965v0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void E(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((ih.m2) this.f45255b).run();
    }
}
