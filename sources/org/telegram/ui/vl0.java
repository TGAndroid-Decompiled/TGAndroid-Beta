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
public final class vl0 implements Utilities.Callback5, org.telegram.ui.Cells.w5, org.telegram.ui.Components.t61, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.bl0, jg.e, hg.a2 {
    public final int f41588a;
    public final Object f41589b;

    public vl0(Object obj, int i10) {
        this.f41588a = i10;
        this.f41589b = obj;
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public boolean Q(int i10) {
        return true;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f41588a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f41589b;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f33789o0 = defaultWindowInsets;
                premiumPreviewFragment.f33770a.setPadding(0, defaultWindowInsets.f11426b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f33789o0.d);
                org.telegram.ui.Components.ll0 ll0Var = premiumPreviewFragment.f33770a;
                i0.c cVar = premiumPreviewFragment.f33789o0;
                AndroidUtilities.setViewLayoutMargins(ll0Var, cVar.f11425a, 0, cVar.f11427c, 0);
                jx0 jx0Var = premiumPreviewFragment.U;
                i0.c cVar2 = premiumPreviewFragment.f33789o0;
                jx0Var.setPadding(cVar2.f11425a, 0, cVar2.f11427c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f33789o0.f11425a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.f33789o0;
                    frameLayout.setPadding(i12, dp, cVar3.f11427c, cVar3.d);
                }
                return r0.l1.f44710b;
            default:
                eh0 eh0Var = (eh0) ((bi1) this.f41589b);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f11425a;
                eh0Var.M = i13;
                int i14 = defaultWindowInsets2.f11427c;
                eh0Var.N = i14;
                eh0Var.L = defaultWindowInsets2.d;
                View view2 = eh0Var.f36082y.f37778b;
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
                eh0Var.f36082y.setPadding(0, 0, 0, eh0Var.L);
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
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) eh0Var.f34816c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    eh0Var.f34816c.setLayoutParams(marginLayoutParams2);
                }
                eh0Var.E.setPadding(i13, 0, i14, eh0Var.L);
                if (z10) {
                    l1Var = l1Var.f44711a.m(0, 0, 0, eh0Var.L);
                }
                eh0Var.i0();
                eh0Var.h0();
                SparseArray sparseArray = eh0Var.f34814a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    zh1 zh1Var = (zh1) sparseArray.valueAt(i15);
                    if (zh1Var != null && (fragmentView = zh1Var.f43438a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f44710b;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f41588a) {
            case 17:
                return ((w71) this.f41589b).Q(i10, view);
            case 18:
                final bb1 bb1Var = (bb1) this.f41589b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = bb1Var.f34702h0;
                ga1 ga1Var = bb1Var.X;
                int i11 = ga1Var.I;
                if (i10 >= i11 && i10 <= ga1Var.J) {
                    final MessageObject messageObject = ((ya1) bb1Var.f34718v0.get(i10 - i11)).f43067b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(bb1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    bb1 bb1Var2 = bb1Var;
                                    bb1Var2.getClass();
                                    bb1Var2.presentFragment(new lj0(messageObject));
                                    return;
                                default:
                                    bb1 bb1Var3 = bb1Var;
                                    bb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", bb1Var3.f34692b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    bb1Var3.presentFragment(new co(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    bb1 bb1Var2 = bb1Var;
                                    bb1Var2.getClass();
                                    bb1Var2.presentFragment(new lj0(messageObject));
                                    return;
                                default:
                                    bb1 bb1Var3 = bb1Var;
                                    bb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", bb1Var3.f34692b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    bb1Var3.presentFragment(new co(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(bb1Var.S.U0(view, false));
                    H.Z();
                } else {
                    int i12 = ga1Var.U;
                    if (i10 >= i12 && i10 <= ga1Var.V) {
                        ((ua1) bb1Var.Q.get(i10 - i12)).c(bb1Var.f34690a, bb1Var, b2VarArr, true);
                    } else {
                        int i13 = ga1Var.R;
                        if (i10 >= i13 && i10 <= ga1Var.S) {
                            ((ua1) bb1Var.O.get(i10 - i13)).c(bb1Var.f34690a, bb1Var, b2VarArr, true);
                        } else {
                            int i14 = ga1Var.X;
                            if (i10 < i14 || i10 > ga1Var.Y) {
                                return false;
                            }
                            ((ua1) bb1Var.P.get(i10 - i14)).c(bb1Var.f34690a, bb1Var, b2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((te1) this.f41589b).J.a(i10, view);
                return true;
        }
    }

    @Override
    public void b() {
        switch (this.f41588a) {
            case 6:
                ((lw0) this.f41589b).e();
                return;
            default:
                ((le1) this.f41589b).e();
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.vz vzVar) {
        Drawable[] drawableArr = PhotoViewer.T8;
        vzVar.f(new org.telegram.ui.Components.wz((MediaController.SavedFilterState) this.f41589b));
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        gy0 gy0Var = (gy0) this.f41589b;
        if (z10) {
            gy0Var.d.U((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public void f(int i10) {
        xh1 xh1Var = (xh1) this.f41589b;
        if (xh1Var.h == null && !xh1Var.f42732f.e()) {
            xh1Var.v.f34241f.e(false, true);
        }
        xh1Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f41588a) {
            case 3:
                PhotoViewer photoViewer = ((pt0) this.f41589b).f39633b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f33727y, photoViewer.f33700v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
                ((zv0) this.f41589b).finishFragment();
                return;
            case 5:
                ((tv0) this.f41589b).f40839a.R.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f41589b;
                int i14 = PopupNotificationActivity.f33757b0;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 11:
                ((org.telegram.messenger.nk) this.f41589b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((g21) this.f41589b).f36534b;
                ArrayList arrayList = proxyListActivity.H;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.f34040e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.c0(true);
                h21 h21Var = proxyListActivity.f34037a;
                if (h21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        h21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                        proxyListActivity.f34037a.n(ProxyListActivity.b0(proxyListActivity), 0);
                    }
                    proxyListActivity.f34037a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((vb1) this.f41589b).f41510a;
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
                    gc1 gc1Var = themeActivity.f34174a;
                    i12 = themeActivity.textSizeRow;
                    gc1Var.n(i12, new Object());
                    gc1 gc1Var2 = themeActivity.f34174a;
                    i13 = themeActivity.bubbleRadiusRow;
                    gc1Var2.n(i13, new Object());
                }
                if (themeActivity.f34178c != null) {
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
                    SparseArray sparseArray = N0.f20541a0;
                    int i17 = org.telegram.ui.ActionBar.j6.f20839n;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(i17);
                    if (h6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.f20276c = "d";
                        b6Var.f20274a = "Blue_99_wp.jpg";
                        b6Var.f20275b = "Blue_99_wp.jpg";
                        h6Var.f20511y = b6Var;
                        N0.v(b6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.j6.t1(N0, true, false, true, false, false);
                        themeActivity.f34178c.x1(N0);
                        themeActivity.f34178c.x0(0);
                        return;
                    } else if (N0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f34183f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f34174a.m(themeActivity.f34195q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.j6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                wd1 wd1Var = ((zc1) this.f41589b).f43379a;
                org.telegram.ui.ActionBar.j6.j0(wd1Var.f41929e0, wd1Var.f41964s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, wd1Var.f41929e0, Boolean.valueOf(wd1Var.f41933f0), null, -1);
                wd1Var.finishFragment();
                return;
            default:
                ((fh1) this.f41589b).f36407a.E0(true);
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f41588a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f41589b, (org.telegram.ui.Components.h51) obj, (View) obj2);
                return;
            default:
                d41 d41Var = (d41) this.f41589b;
                org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                e41 e41Var = d41Var.v;
                if (h51Var.f44071a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = d41Var.f35646b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(h51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            e41.H(e41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = d41Var.f35647c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(h51Var.d);
                        if (tL_messageReportOption != null) {
                            e41.H(e41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = d41Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            e41.H(e41Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    e41.H(e41Var, h51Var.f26594l, null, null);
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
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rh((SharedConfig.ProxyInfo) this.f41589b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((zx0) this.f41589b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f33841z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.msg_mini_lock3, 0);
                    nqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(nqVar, 0, 1, 33);
                    privacyControlActivity.f33841z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f33841z0);
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
        ((hg.e1) this.f41589b).run();
    }
}
