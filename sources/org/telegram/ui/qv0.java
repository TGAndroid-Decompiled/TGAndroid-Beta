package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qv0 implements Runnable {
    public final int f48962a;
    public final Object f48963b;
    public final Object f48964c;

    public qv0(int i3, Object obj, Object obj2) {
        this.f48962a = i3;
        this.f48963b = obj;
        this.f48964c = obj2;
    }

    @Override
    public final void run() {
        int i3;
        ArrayList arrayList;
        String str;
        int i10;
        String str2;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        org.telegram.ui.Components.bj0 bj0Var;
        int i11 = this.f48962a;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean z10 = true;
        Object obj = this.f48964c;
        Object obj2 = this.f48963b;
        switch (i11) {
            case 0:
                ((bw0) obj2).f44157e.presentFragment(ProfileActivity.A4(((Long) obj).longValue()));
                return;
            case 1:
                ?? d2Var = new org.telegram.ui.ActionBar.d2(null);
                d2Var.d = (org.telegram.ui.ActionBar.e6) obj;
                ((org.telegram.ui.ActionBar.d2) obj2).presentFragment((org.telegram.ui.ActionBar.d2) d2Var);
                return;
            case 2:
                lw0 lw0Var = (lw0) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = lw0Var.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = lw0Var.f47451e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                int i12 = 0;
                while (i12 < split.length) {
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                    String S0 = org.telegram.messenger.bd.E0().S0(split[i12], true, false);
                    strArr2[i12] = S0;
                    if (S0.equals(split[i12])) {
                        strArr2[i12] = spannableStringBuilder3;
                    }
                    i12++;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
                SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                int i13 = 0;
                while (true) {
                    kw0[] kw0VarArr = lw0Var.f47450c;
                    boolean z11 = z10;
                    if (i13 < kw0VarArr.length) {
                        kw0 kw0Var = kw0VarArr[i13];
                        if (kw0Var != null) {
                            String str6 = kw0Var.f47037a;
                            String str7 = " " + str6.toLowerCase();
                            SpannableStringBuilder spannableStringBuilder5 = spannableStringBuilder4;
                            int i14 = 0;
                            while (i14 < split.length) {
                                if (split[i14].length() != 0) {
                                    String str8 = split[i14];
                                    i10 = i13;
                                    int indexOf = str7.indexOf(" " + str8);
                                    if (indexOf < 0 && (str4 = strArr2[i14]) != null) {
                                        indexOf = str7.indexOf(" ".concat(str4));
                                    } else {
                                        str4 = str8;
                                    }
                                    if (indexOf >= 0) {
                                        String str9 = str4;
                                        if (spannableStringBuilder5 == null) {
                                            spannableStringBuilder = new SpannableStringBuilder(str6);
                                        } else {
                                            spannableStringBuilder = spannableStringBuilder5;
                                        }
                                        str2 = str7;
                                        strArr = strArr2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(d2Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f28121q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i13 = i10 + 1;
                                        z10 = z11;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    i10 = i13;
                                    str2 = str7;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder5;
                                }
                                if (spannableStringBuilder != null && i14 == split.length - 1) {
                                    if (kw0Var.f47041f == 502) {
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < 4) {
                                                if (org.telegram.messenger.h10.i(i15).p()) {
                                                    i15++;
                                                }
                                            } else {
                                                i15 = -1;
                                            }
                                        }
                                        if (i15 < 0) {
                                        }
                                    }
                                    arrayList3.add(kw0Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i14++;
                                spannableStringBuilder5 = spannableStringBuilder;
                                i13 = i10;
                                str5 = str3;
                                str7 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i10 = i13;
                        i13 = i10 + 1;
                        z10 = z11;
                        str5 = str5;
                        strArr2 = strArr2;
                    } else {
                        String[] strArr3 = strArr2;
                        String str10 = str5;
                        if (lw0Var.F != null) {
                            int size = arrayList2.size();
                            int i16 = 0;
                            while (i16 < size) {
                                org.telegram.messenger.to toVar = (org.telegram.messenger.to) arrayList2.get(i16);
                                String str11 = " " + toVar.f25574a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder6 = spannableStringBuilder4;
                                int i17 = 0;
                                while (true) {
                                    if (i17 < split.length) {
                                        if (split[i17].length() != 0) {
                                            String str12 = split[i17];
                                            int indexOf2 = str11.indexOf(" " + str12);
                                            i3 = size;
                                            if (indexOf2 < 0 && (str = strArr3[i17]) != null) {
                                                indexOf2 = str11.indexOf(" ".concat(str));
                                                str12 = str;
                                            }
                                            if (indexOf2 >= 0) {
                                                if (spannableStringBuilder6 == null) {
                                                    spannableStringBuilder6 = new SpannableStringBuilder(toVar.f25574a);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder6.setSpan(new ForegroundColorSpan(d2Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f28121q6)), indexOf2, str12.length() + indexOf2, 33);
                                            }
                                        } else {
                                            i3 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder6 != null && i17 == split.length - 1) {
                                            arrayList4.add(toVar);
                                            arrayList5.add(spannableStringBuilder6);
                                        }
                                        i17++;
                                        size = i3;
                                        arrayList2 = arrayList;
                                    } else {
                                        i3 = size;
                                    }
                                }
                                i16++;
                                size = i3;
                                arrayList2 = arrayList2;
                            }
                        }
                        org.telegram.messenger.g0.h3(new xt0(lw0Var, str10, arrayList3, arrayList4, arrayList5, 1));
                        return;
                    }
                }
                break;
            case 3:
                lw0 lw0Var2 = (lw0) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                lw0Var2.d.addAll(arrayList6);
                int i18 = lw0Var2.f47452f;
                org.telegram.messenger.hp.s1(i18).f23097q2 = arrayList6;
                org.telegram.messenger.hp.s1(i18).f23107r2 = lw0Var2.F;
                if (!lw0Var2.f47457x) {
                    lw0Var2.f();
                    return;
                }
                return;
            case 4:
                pw0 pw0Var = (pw0) obj2;
                pw0Var.f48696f.add((rw0) obj);
                pw0Var.a();
                return;
            case 5:
                dy0 dy0Var = (dy0) ((View[]) obj2)[0];
                dy0Var.f44829b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                dy0Var.f44830c = null;
                dy0Var.d = null;
                dy0Var.f44832f.f35594g3.O(false);
                return;
            case 6:
                ((dy0) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 7:
                dy0 dy0Var2 = (dy0) ((View[]) obj2)[0];
                dy0Var2.f44829b = null;
                dy0Var2.f44830c = (TLRPC.TL_reportResultChooseOption) obj;
                dy0Var2.d = null;
                dy0Var2.f44832f.f35594g3.O(false);
                return;
            case 8:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.fc) obj).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                return;
            case 9:
                org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) obj2).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                org.telegram.messenger.g0.h3((org.telegram.ui.Components.j50) obj);
                return;
            case 10:
                ((SecretMediaViewer) obj2).L = false;
                ((mq0) obj).f47751a.O0(false, true);
                return;
            case 11:
                ((SecretMediaViewer) ((mi.h0) obj2).f19645c).i((File) obj);
                return;
            case 12:
                g11 g11Var = (g11) obj2;
                g11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.d2) obj).presentFragment(new StickersActivity(5, g11Var.M0));
                Runnable runnable = g11Var.V1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.fc.a0((c31) obj2).k(false).j();
                return;
            case 14:
                c31.b0((c31) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 15:
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj2;
                new j31(d2Var3.getContext(), d2Var3.getCurrentAccount(), d2Var3.getResourceProvider(), (mi.f) obj).show();
                return;
            case 16:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.f8) obj);
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().F4(true);
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(themeActivity.getMessagesController().S4());
                    return;
                }
                return;
            case 18:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str13 = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.k6.f28227w = str13;
                if (str13 == null) {
                    org.telegram.ui.ActionBar.k6.f28227w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.f28247x), Double.valueOf(org.telegram.ui.ActionBar.k6.f28266y));
                }
                org.telegram.ui.ActionBar.k6.w1();
                org.telegram.ui.Components.tj0 tj0Var = themeActivity2.f42043b;
                if (tj0Var != null && (bj0Var = (org.telegram.ui.Components.bj0) tj0Var.K(themeActivity2.Z)) != null) {
                    View view2 = bj0Var.f55540a;
                    if (view2 instanceof org.telegram.ui.Cells.v9) {
                        ((org.telegram.ui.Cells.v9) view2).c(org.telegram.messenger.bd.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.k6.f28227w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                l71 l71Var = (l71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (l71Var.f47180n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    l71Var.C0.c(l71Var.M0[0]);
                    return;
                }
                return;
            case 20:
                o71.c0((o71) obj2, (String) obj);
                return;
            case 21:
                o71.a0((o71) obj2, (TLRPC.TL_theme) obj);
                return;
            case 22:
                w71 w71Var = (w71) obj2;
                w71Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                w71Var.c(true);
                return;
            case 23:
                w71 w71Var2 = (w71) obj2;
                w71Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.zi.h0(((TLRPC.TodoItem) obj).title, false));
                w71Var2.c(true);
                return;
            case 24:
                u81 u81Var = (u81) obj2;
                u81Var.getClass();
                Bundle bundle = new Bundle();
                m91 m91Var = u81Var.f50018b;
                bundle.putLong("dialog_id", -m91Var.f47575a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f27053id);
                m91Var.presentFragment(new yw0(bundle, null));
                return;
            case 25:
                i91 i91Var = (i91) obj2;
                String str14 = (String) obj;
                ArrayList arrayList7 = i91Var.f46206f0;
                m91 m91Var2 = i91Var.f46222w0;
                String lowerCase = str14.trim().toLowerCase();
                ArrayList arrayList8 = new ArrayList();
                int i19 = 0;
                while (true) {
                    ArrayList arrayList9 = m91Var2.f47578b;
                    if (i19 < arrayList9.size()) {
                        if (((e91) arrayList9.get(i19)).f44941c != null && ((e91) arrayList9.get(i19)).f44941c.title.toLowerCase().contains(lowerCase)) {
                            arrayList8.add(((e91) arrayList9.get(i19)).f44941c);
                            ((e91) arrayList9.get(i19)).f44941c.searchQuery = lowerCase;
                        }
                        i19++;
                    } else {
                        arrayList7.clear();
                        arrayList7.addAll(arrayList8);
                        i91Var.N();
                        if (!arrayList7.isEmpty()) {
                            i91Var.f46214o0 = false;
                            i91Var.f46217r0.b(0);
                        }
                        i91Var.L(str14);
                        return;
                    }
                }
                break;
            case 26:
                p91 p91Var = ((o91) obj2).f48241b;
                p91Var.f48498a.f49454e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f27053id));
                p91Var.f48498a.a0();
                return;
            case 27:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 28:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            default:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }
}
