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
public final class qp0 implements org.telegram.ui.Cells.w5, org.telegram.ui.Components.o71, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.yl0, jg.e, hg.z1 {
    public final int f40482a;
    public final Object f40483b;

    public qp0(Object obj, int i10) {
        this.f40482a = i10;
        this.f40483b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f40482a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f40483b;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.f33503o0 = defaultWindowInsets;
                premiumPreviewFragment.f33485a.setPadding(0, defaultWindowInsets.f12285b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f33503o0.d);
                org.telegram.ui.Components.im0 im0Var = premiumPreviewFragment.f33485a;
                i0.c cVar = premiumPreviewFragment.f33503o0;
                AndroidUtilities.setViewLayoutMargins(im0Var, cVar.f12284a, 0, cVar.f12286c, 0);
                pw0 pw0Var = premiumPreviewFragment.U;
                i0.c cVar2 = premiumPreviewFragment.f33503o0;
                pw0Var.setPadding(cVar2.f12284a, 0, cVar2.f12286c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f33503o0.f12284a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.f33503o0;
                    frameLayout.setPadding(i12, dp, cVar3.f12286c, cVar3.d);
                }
                return r0.k1.f44852b;
            default:
                pg0 pg0Var = (pg0) ((qg1) this.f40483b);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i13 = defaultWindowInsets2.f12284a;
                pg0Var.M = i13;
                int i14 = defaultWindowInsets2.f12286c;
                pg0Var.N = i14;
                pg0Var.L = defaultWindowInsets2.d;
                View view2 = pg0Var.f40131y.f43740b;
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
                pg0Var.f40131y.setPadding(0, 0, 0, pg0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + pg0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pg0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    pg0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = pg0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) pg0Var.f40427c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    pg0Var.f40427c.setLayoutParams(marginLayoutParams2);
                }
                pg0Var.E.setPadding(i13, 0, i14, pg0Var.L);
                if (z10) {
                    k1Var = k1Var.f44853a.m(0, 0, 0, pg0Var.L);
                }
                pg0Var.i0();
                pg0Var.h0();
                SparseArray sparseArray = pg0Var.f40425a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    og1 og1Var = (og1) sparseArray.valueAt(i15);
                    if (og1Var != null && (fragmentView = og1Var.f39775a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f44852b;
        }
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f40482a) {
            case 16:
                return ((m61) this.f40483b).R(i10, view);
            case 17:
                final r91 r91Var = (r91) this.f40483b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = r91Var.f40648h0;
                w81 w81Var = r91Var.X;
                int i11 = w81Var.I;
                if (i10 >= i11 && i10 <= w81Var.J) {
                    final MessageObject messageObject = ((o91) r91Var.f40664v0.get(i10 - i11)).f39695b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(r91Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    r91 r91Var2 = r91Var;
                                    r91Var2.getClass();
                                    r91Var2.presentFragment(new wi0(messageObject));
                                    return;
                                default:
                                    r91 r91Var3 = r91Var;
                                    r91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", r91Var3.f40639b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    r91Var3.presentFragment(new sn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    r91 r91Var2 = r91Var;
                                    r91Var2.getClass();
                                    r91Var2.presentFragment(new wi0(messageObject));
                                    return;
                                default:
                                    r91 r91Var3 = r91Var;
                                    r91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", r91Var3.f40639b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    r91Var3.presentFragment(new sn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(r91Var.S.V0(view, false));
                    H.Z();
                } else {
                    int i12 = w81Var.U;
                    if (i10 >= i12 && i10 <= w81Var.V) {
                        ((k91) r91Var.Q.get(i10 - i12)).c(r91Var.f40637a, r91Var, b2VarArr, true);
                    } else {
                        int i13 = w81Var.R;
                        if (i10 >= i13 && i10 <= w81Var.S) {
                            ((k91) r91Var.O.get(i10 - i13)).c(r91Var.f40637a, r91Var, b2VarArr, true);
                        } else {
                            int i14 = w81Var.X;
                            if (i10 < i14 || i10 > w81Var.Y) {
                                return false;
                            }
                            ((k91) r91Var.P.get(i10 - i14)).c(r91Var.f40637a, r91Var, b2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((id1) this.f40483b).J.a(i10, view);
                return true;
        }
    }

    @Override
    public void b() {
        switch (this.f40482a) {
            case 5:
                ((sv0) this.f40483b).e();
                return;
            default:
                ((ad1) this.f40483b).e();
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.e00 e00Var) {
        Drawable[] drawableArr = PhotoViewer.U8;
        e00Var.f(new org.telegram.ui.Components.f00((MediaController.SavedFilterState) this.f40483b));
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        lx0 lx0Var = (lx0) this.f40483b;
        if (z10) {
            lx0Var.d.U((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public void f(int i10) {
        mg1 mg1Var = (mg1) this.f40483b;
        if (mg1Var.h == null && !mg1Var.f39184f.e()) {
            mg1Var.v.f33944f.e(false, true);
        }
        mg1Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f40482a) {
            case 2:
                PhotoViewer photoViewer = ((ys0) this.f40483b).f43477b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f33445y, photoViewer.f33418v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ((hv0) this.f40483b).finishFragment();
                return;
            case 4:
                ((bv0) this.f40483b).f35752a.R.r();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f40483b;
                int i14 = PopupNotificationActivity.f33473b0;
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
                ((org.telegram.messenger.fk) this.f40483b).run(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = ((k11) this.f40483b).f38376b;
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
                l11 l11Var = proxyListActivity.f33751a;
                if (l11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        l11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f33751a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((la1) this.f40483b).f38840a;
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
                    wa1 wa1Var = themeActivity.f33882a;
                    i12 = themeActivity.textSizeRow;
                    wa1Var.n(i12, new Object());
                    wa1 wa1Var2 = themeActivity.f33882a;
                    i13 = themeActivity.bubbleRadiusRow;
                    wa1Var2.n(i13, new Object());
                }
                if (themeActivity.f33886c != null) {
                    org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0("Blue");
                    org.telegram.ui.ActionBar.g6 B0 = org.telegram.ui.ActionBar.h6.B0();
                    SparseArray sparseArray = O0.f20878a0;
                    int i17 = org.telegram.ui.ActionBar.h6.f21162n;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(i17);
                    if (f6Var != null) {
                        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6();
                        a6Var.f20615c = "d";
                        a6Var.f20613a = "Blue_99_wp.jpg";
                        a6Var.f20614b = "Blue_99_wp.jpg";
                        f6Var.f20848y = a6Var;
                        O0.v(a6Var);
                    }
                    if (O0 != B0) {
                        O0.u(i17);
                        org.telegram.ui.ActionBar.h6.u1(O0, true, false, true, false, false);
                        themeActivity.f33886c.z1(O0);
                        themeActivity.f33886c.x0(0);
                        return;
                    } else if (O0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f33890f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, B0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f33882a.m(themeActivity.f33902q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.h6.p1(true);
                        return;
                    }
                }
                return;
            case 20:
                mc1 mc1Var = ((pb1) this.f40483b).f40035a;
                org.telegram.ui.ActionBar.h6.k0(mc1Var.f39111e0, mc1Var.f39146s, true);
                org.telegram.ui.ActionBar.h6.o();
                org.telegram.ui.ActionBar.h6.o1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, mc1Var.f39111e0, Boolean.valueOf(mc1Var.f39115f0), null, -1);
                mc1Var.finishFragment();
                return;
            default:
                ((uf1) this.f40483b).f41978a.E0(true);
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        p21 p21Var = (p21) this.f40483b;
        org.telegram.ui.Components.f61 f61Var = (org.telegram.ui.Components.f61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        q21 q21Var = p21Var.v;
        if (f61Var.f44314a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = p21Var.f39942b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(f61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    q21.I(q21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = p21Var.f39943c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(f61Var.d);
                if (tL_messageReportOption != null) {
                    q21.I(q21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = p21Var.d;
            if (tL_reportResultAddComment != null) {
                byte[] bArr = tL_reportResultAddComment.option;
                if (bArr != null) {
                    q21.I(q21Var, null, bArr, null);
                    return;
                }
                return;
            }
            q21.I(q21Var, f61Var.f26140l, null, null);
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.lh((SharedConfig.ProxyInfo) this.f40483b, j10, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ex0) this.f40483b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f33554z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.msg_mini_lock3, 0);
                    yqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(yqVar, 0, 1, 33);
                    privacyControlActivity.f33554z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f33554z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void Y(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((hg.d1) this.f40483b).run();
    }
}
