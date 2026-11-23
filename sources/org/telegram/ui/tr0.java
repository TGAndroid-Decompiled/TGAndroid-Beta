package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
public final class tr0 implements Runnable {
    public final int f52387a;
    public final Object f52388b;
    public final Object f52389c;

    public tr0(int i7, Object obj, Object obj2) {
        this.f52387a = i7;
        this.f52388b = obj;
        this.f52389c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        View E;
        float f10;
        ai.o2 o2Var;
        ArrayList arrayList;
        String str;
        int i10;
        int i11;
        String str2;
        boolean z10;
        int i12;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        SpannableStringBuilder spannableStringBuilder;
        String str6;
        long j3 = 0;
        boolean z11 = true;
        switch (this.f52387a) {
            case 0:
                as0 as0Var = (as0) this.f52388b;
                as0Var.getClass();
                org.telegram.messenger.g0.g((String) this.f52389c);
                as0Var.c(true);
                return;
            case 1:
                as0 as0Var2 = (as0) this.f52388b;
                as0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.gj.h0(((TLRPC.PollAnswer) this.f52389c).text, false));
                as0Var2.c(true);
                return;
            case 2:
                as0 as0Var3 = (as0) this.f52388b;
                byte[] bArr = (byte[]) this.f52389c;
                org.telegram.messenger.az C = org.telegram.messenger.az.C(as0Var3.I.K1);
                org.telegram.messenger.gj gjVar = as0Var3.I;
                if (gjVar != null && (org.telegram.messenger.gj.m1(gjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.gj.B0(gjVar.f24213k);
                    int e12 = gjVar.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().l1(B0);
                    tL_messages_deletePollAnswer.msg_id = e12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.q5 q5Var = Utilities.d;
                    Objects.requireNonNull(q5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.x3(q5Var), new org.telegram.messenger.d(C, 7));
                }
                as0Var3.c(true);
                return;
            case 3:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.f52388b, (TLObject) this.f52389c);
                return;
            case 4:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f52388b;
                boolean[] zArr = (boolean[]) this.f52389c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    return;
                }
                return;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f52388b;
                privacySettingsActivity.d = (TL_account.Password) this.f52389c;
                privacySettingsActivity.D0();
                return;
            case 6:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f52388b;
                boolean z12 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z12;
                ((org.telegram.ui.Cells.s8) this.f52389c).setChecked(z12);
                return;
            case 7:
                ((st0) this.f52388b).getMessagesController().r5(null, ((Long) this.f52389c).longValue());
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f52388b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f52389c)[0]).f28442id);
                profileActivity.presentFragment(new bn(bundle), true);
                return;
            case 9:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f52388b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f52389c;
                long j10 = profileActivity2.B2;
                if (j10 != 0) {
                    TLRPC.User c22 = profileActivity2.getMessagesController().c2(Long.valueOf(j10));
                    profileActivity2.getMessagesController().f0(profileActivity2.f43593f1, c22);
                    if (profileActivity2.F2 != null && c22 != null && org.telegram.ui.Components.lc.a(profileActivity2)) {
                        org.telegram.ui.Components.lc.D(profileActivity2, c22, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.f43702v2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.H5(true, false);
                        return;
                    }
                    return;
                }
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                if (org.telegram.messenger.g0.Q1()) {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f43593f1));
                } else {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity2.getMessagesController().f0(profileActivity2.f43593f1, profileActivity2.getMessagesController().c2(Long.valueOf(profileActivity2.getUserConfig().e())));
                profileActivity2.J1 = i7;
                profileActivity2.finishFragment();
                return;
            case 10:
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g("https://" + ((ProfileActivity) this.f52388b).getMessagesController().X2 + "/" + org.telegram.messenger.v3.K((TLRPC.Chat) this.f52389c, false));
                return;
            case 11:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f52388b;
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity3.getClass();
                org.telegram.ui.Components.gc.e();
                vf.c.t(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f52389c).url);
                return;
            case 12:
                ProfileActivity profileActivity4 = (ProfileActivity) this.f52388b;
                RectF rectF4 = ProfileActivity.Z6;
                org.telegram.ui.Components.yn ynVar = ((org.telegram.ui.Components.co) this.f52389c).f34234e;
                cx cxVar = profileActivity4.f43637l5;
                if (cxVar != null && cxVar.getFragmentView() != null) {
                    E = profileActivity4.f43637l5.getFragmentView();
                } else {
                    E = profileActivity4.f43643m5.E();
                }
                RectF rectF5 = profileActivity4.f43638l6;
                if (jh.k.c(ynVar, E, rectF5)) {
                    f10 = rectF5.left;
                } else {
                    f10 = 0.0f;
                }
                profileActivity4.f43632k6 = f10;
                profileActivity4.d4();
                return;
            case 13:
                ProfileActivity profileActivity5 = (ProfileActivity) this.f52388b;
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity5.F2 = profileActivity5.getMessagesStorage().O(profileActivity5.f43593f1);
                ((CountDownLatch) this.f52389c).countDown();
                return;
            case 14:
                ProfileActivity profileActivity6 = (ProfileActivity) this.f52388b;
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.n8) ((View) this.f52389c)).setChecked(profileActivity6.f43689t2.g());
                return;
            case 15:
                ProfileActivity profileActivity7 = (ProfileActivity) this.f52388b;
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity7.getClass();
                profileActivity7.H2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) this.f52389c)).participant;
                return;
            case 16:
                ProfileActivity profileActivity8 = (ProfileActivity) this.f52388b;
                RectF rectF9 = ProfileActivity.Z6;
                if (!((boolean[]) this.f52389c)[0] && (o2Var = profileActivity8.D5) != null) {
                    o2Var.run();
                }
                profileActivity8.D5 = null;
                return;
            case 17:
                vu0 vu0Var = (vu0) this.f52388b;
                a0.h hVar = (a0.h) this.f52389c;
                ProfileActivity profileActivity9 = vu0Var.V2.f53534c;
                Activity parentActivity = profileActivity9.getParentActivity();
                tv0 tv0Var = profileActivity9.s5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f28438id;
                }
                org.telegram.ui.Components.lc.x(parentActivity, tv0Var, m10, j3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, vu0Var.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, vu0Var.J0)).j();
                return;
            case 18:
                kv0 kv0Var = (kv0) this.f52388b;
                a0.h hVar2 = (a0.h) this.f52389c;
                ProfileActivity profileActivity10 = kv0Var.V2;
                Activity parentActivity2 = profileActivity10.getParentActivity();
                tv0 tv0Var2 = profileActivity10.s5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar2.n(0)).f28438id;
                }
                org.telegram.ui.Components.lc.x(parentActivity2, tv0Var2, m11, j3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, kv0Var.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, kv0Var.J0)).j();
                return;
            case 19:
                ((lw0) this.f52388b).f49718e.presentFragment(ProfileActivity.D4(((Long) this.f52389c).longValue()));
                return;
            case 20:
                ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
                g2Var.d = (org.telegram.ui.ActionBar.h6) this.f52389c;
                ((org.telegram.ui.ActionBar.g2) this.f52388b).presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
                return;
            case 21:
                ww0 ww0Var = (ww0) this.f52388b;
                String str7 = (String) this.f52389c;
                ArrayList arrayList2 = ww0Var.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = ww0Var.f53544e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str8 = " ";
                String[] split = str7.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    String T0 = org.telegram.messenger.hd.E0().T0(split[i13], true, false);
                    strArr2[i13] = T0;
                    if (T0.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                }
                int i14 = 0;
                while (true) {
                    vw0[] vw0VarArr = ww0Var.f53543c;
                    if (i14 < vw0VarArr.length) {
                        vw0 vw0Var = vw0VarArr[i14];
                        if (vw0Var == null) {
                            i12 = i14;
                            z10 = z11;
                        } else {
                            String str9 = vw0Var.f52907a;
                            z10 = z11;
                            String str10 = " " + str9.toLowerCase();
                            i12 = i14;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            int i15 = 0;
                            while (i15 < split.length) {
                                if (split[i15].length() != 0) {
                                    String str11 = split[i15];
                                    strArr = strArr2;
                                    int indexOf = str10.indexOf(" " + str11);
                                    if (indexOf < 0 && (str6 = strArr[i15]) != null) {
                                        indexOf = str10.indexOf(" ".concat(str6));
                                    } else {
                                        str6 = str11;
                                    }
                                    if (indexOf >= 0) {
                                        str3 = str10;
                                        if (spannableStringBuilder2 == null) {
                                            spannableStringBuilder = new SpannableStringBuilder(str9);
                                        } else {
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        str4 = str7;
                                        str5 = str9;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(g2Var2.getThemedColor(org.telegram.ui.ActionBar.m6.f29621q6)), indexOf, str6.length() + indexOf, 33);
                                    } else {
                                        i14 = i12 + 1;
                                        z11 = z10;
                                        strArr2 = strArr;
                                        str7 = str7;
                                    }
                                } else {
                                    str3 = str10;
                                    strArr = strArr2;
                                    str4 = str7;
                                    str5 = str9;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i15 == split.length - 1) {
                                    if (vw0Var.f52911f == 502) {
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 < 4) {
                                                if (org.telegram.messenger.k10.i(i16).p()) {
                                                    i16++;
                                                }
                                            } else {
                                                i16 = -1;
                                            }
                                        }
                                        if (i16 < 0) {
                                        }
                                    }
                                    arrayList3.add(vw0Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i15++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                strArr2 = strArr;
                                str10 = str3;
                                str9 = str5;
                                str7 = str4;
                            }
                        }
                        strArr = strArr2;
                        i14 = i12 + 1;
                        z11 = z10;
                        strArr2 = strArr;
                        str7 = str7;
                    } else {
                        String[] strArr3 = strArr2;
                        String str12 = str7;
                        if (ww0Var.F != null) {
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                org.telegram.messenger.zo zoVar = (org.telegram.messenger.zo) arrayList2.get(i17);
                                String str13 = str8 + zoVar.f28365a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                int i18 = 0;
                                while (true) {
                                    if (i18 < split.length) {
                                        if (split[i18].length() != 0) {
                                            String str14 = split[i18];
                                            arrayList = arrayList2;
                                            int indexOf2 = str13.indexOf(str8 + str14);
                                            if (indexOf2 < 0 && (str2 = strArr3[i18]) != null) {
                                                str14 = str2;
                                                i11 = str13.indexOf(str8.concat(str2));
                                            } else {
                                                i11 = indexOf2;
                                            }
                                            if (i11 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    str = str8;
                                                    spannableStringBuilder3 = new SpannableStringBuilder(zoVar.f28365a);
                                                } else {
                                                    str = str8;
                                                }
                                                i10 = size;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(g2Var2.getThemedColor(org.telegram.ui.ActionBar.m6.f29621q6)), i11, str14.length() + i11, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            str = str8;
                                            i10 = size;
                                        }
                                        if (spannableStringBuilder3 != null && i18 == split.length - 1) {
                                            arrayList4.add(zoVar);
                                            arrayList5.add(spannableStringBuilder3);
                                        }
                                        i18++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                        str8 = str;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                }
                                i17++;
                                size = size;
                                arrayList2 = arrayList;
                                str8 = str8;
                            }
                        }
                        org.telegram.messenger.g0.g3(new wt0(ww0Var, str12, arrayList3, arrayList4, arrayList5, 4));
                        return;
                    }
                }
                break;
            case 22:
                ww0 ww0Var2 = (ww0) this.f52388b;
                ArrayList arrayList6 = (ArrayList) this.f52389c;
                ww0Var2.d.addAll(arrayList6);
                int i19 = ww0Var2.f53545f;
                org.telegram.messenger.np.u1(i19).f25956s2 = arrayList6;
                org.telegram.messenger.np.u1(i19).f25964t2 = ww0Var2.F;
                if (!ww0Var2.f53550x) {
                    ww0Var2.f();
                    return;
                }
                return;
            case 23:
                ax0 ax0Var = (ax0) this.f52388b;
                ax0Var.f45727f.add((cx0) this.f52389c);
                ax0Var.a();
                return;
            case 24:
                py0 py0Var = (py0) ((View[]) this.f52388b)[0];
                py0Var.f51007b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f52389c;
                py0Var.f51008c = null;
                py0Var.d = null;
                py0Var.f51010f.f35790g3.O(false);
                return;
            case 25:
                ((py0) ((View[]) this.f52388b)[0]).b((TLRPC.TL_reportResultAddComment) this.f52389c);
                return;
            case 26:
                py0 py0Var2 = (py0) ((View[]) this.f52388b)[0];
                py0Var2.f51007b = null;
                py0Var2.f51008c = (TLRPC.TL_reportResultChooseOption) this.f52389c;
                py0Var2.d = null;
                py0Var2.f51010f.f35790g3.O(false);
                return;
            case 27:
                ((org.telegram.messenger.video.a) this.f52388b).run();
                ((org.telegram.ui.Components.lc) this.f52389c).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                return;
            case 28:
                org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.g2) this.f52388b).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                org.telegram.messenger.g0.g3((org.telegram.ui.Components.ou) this.f52389c);
                return;
            default:
                ((SecretMediaViewer) this.f52388b).L = false;
                ((wq0) this.f52389c).f53497a.O0(false, true);
                return;
        }
    }

    public tr0(org.telegram.ui.Components.ap0 ap0Var, a0.h hVar, int i7, int i10) {
        this.f52387a = i10;
        this.f52388b = ap0Var;
        this.f52389c = hVar;
    }
}
