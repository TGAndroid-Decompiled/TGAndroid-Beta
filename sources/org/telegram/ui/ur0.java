package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
public final class ur0 implements Runnable {
    public final int f52625a;
    public final Object f52626b;
    public final Object f52627c;

    public ur0(int i7, Object obj, Object obj2) {
        this.f52625a = i7;
        this.f52626b = obj;
        this.f52627c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        View E;
        float f10;
        ai.e2 e2Var;
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
        switch (this.f52625a) {
            case 0:
                bs0 bs0Var = (bs0) this.f52626b;
                byte[] bArr = (byte[]) this.f52627c;
                org.telegram.messenger.az C = org.telegram.messenger.az.C(bs0Var.I.K1);
                org.telegram.messenger.gj gjVar = bs0Var.I;
                if (gjVar != null && (org.telegram.messenger.gj.m1(gjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.gj.B0(gjVar.f24177k);
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
                bs0Var.c(true);
                return;
            case 1:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.f52626b, (TLObject) this.f52627c);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f52626b;
                boolean[] zArr = (boolean[]) this.f52627c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    return;
                }
                return;
            case 3:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f52626b;
                privacySettingsActivity.d = (TL_account.Password) this.f52627c;
                privacySettingsActivity.D0();
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f52626b;
                boolean z12 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z12;
                ((org.telegram.ui.Cells.s8) this.f52627c).setChecked(z12);
                return;
            case 5:
                ((tt0) this.f52626b).getMessagesController().r5(null, ((Long) this.f52627c).longValue());
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f52626b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f52627c)[0]).f28406id);
                profileActivity.presentFragment(new bn(bundle), true);
                return;
            case 7:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f52626b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f52627c;
                long j10 = profileActivity2.B2;
                if (j10 != 0) {
                    TLRPC.User c22 = profileActivity2.getMessagesController().c2(Long.valueOf(j10));
                    profileActivity2.getMessagesController().f0(profileActivity2.f43558f1, c22);
                    if (profileActivity2.F2 != null && c22 != null && org.telegram.ui.Components.lc.a(profileActivity2)) {
                        org.telegram.ui.Components.lc.D(profileActivity2, c22, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.f43667v2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.H5(true, false);
                        return;
                    }
                    return;
                }
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                if (org.telegram.messenger.g0.Q1()) {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f43558f1));
                } else {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity2.getMessagesController().f0(profileActivity2.f43558f1, profileActivity2.getMessagesController().c2(Long.valueOf(profileActivity2.getUserConfig().e())));
                profileActivity2.J1 = i7;
                profileActivity2.finishFragment();
                return;
            case 8:
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g("https://" + ((ProfileActivity) this.f52626b).getMessagesController().X2 + "/" + org.telegram.messenger.v3.K((TLRPC.Chat) this.f52627c, false));
                return;
            case 9:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f52626b;
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity3.getClass();
                org.telegram.ui.Components.gc.e();
                vf.c.t(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f52627c).url);
                return;
            case 10:
                ProfileActivity profileActivity4 = (ProfileActivity) this.f52626b;
                RectF rectF4 = ProfileActivity.Z6;
                org.telegram.ui.Components.yn ynVar = ((org.telegram.ui.Components.co) this.f52627c).f34202e;
                cx cxVar = profileActivity4.f43602l5;
                if (cxVar != null && cxVar.getFragmentView() != null) {
                    E = profileActivity4.f43602l5.getFragmentView();
                } else {
                    E = profileActivity4.f43608m5.E();
                }
                RectF rectF5 = profileActivity4.f43603l6;
                if (jh.k.c(ynVar, E, rectF5)) {
                    f10 = rectF5.left;
                } else {
                    f10 = 0.0f;
                }
                profileActivity4.f43597k6 = f10;
                profileActivity4.d4();
                return;
            case 11:
                ProfileActivity profileActivity5 = (ProfileActivity) this.f52626b;
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity5.F2 = profileActivity5.getMessagesStorage().O(profileActivity5.f43558f1);
                ((CountDownLatch) this.f52627c).countDown();
                return;
            case 12:
                ProfileActivity profileActivity6 = (ProfileActivity) this.f52626b;
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.n8) ((View) this.f52627c)).setChecked(profileActivity6.f43654t2.g());
                return;
            case 13:
                ProfileActivity profileActivity7 = (ProfileActivity) this.f52626b;
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity7.getClass();
                profileActivity7.H2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) this.f52627c)).participant;
                return;
            case 14:
                ProfileActivity profileActivity8 = (ProfileActivity) this.f52626b;
                RectF rectF9 = ProfileActivity.Z6;
                if (!((boolean[]) this.f52627c)[0] && (e2Var = profileActivity8.D5) != null) {
                    e2Var.run();
                }
                profileActivity8.D5 = null;
                return;
            case 15:
                wu0 wu0Var = (wu0) this.f52626b;
                a0.h hVar = (a0.h) this.f52627c;
                ProfileActivity profileActivity9 = wu0Var.V2.f53939c;
                Activity parentActivity = profileActivity9.getParentActivity();
                uv0 uv0Var = profileActivity9.s5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f28402id;
                }
                org.telegram.ui.Components.lc.x(parentActivity, uv0Var, m10, j3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, wu0Var.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, wu0Var.J0)).j();
                return;
            case 16:
                lv0 lv0Var = (lv0) this.f52626b;
                a0.h hVar2 = (a0.h) this.f52627c;
                ProfileActivity profileActivity10 = lv0Var.V2;
                Activity parentActivity2 = profileActivity10.getParentActivity();
                uv0 uv0Var2 = profileActivity10.s5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar2.n(0)).f28402id;
                }
                org.telegram.ui.Components.lc.x(parentActivity2, uv0Var2, m11, j3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, lv0Var.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, lv0Var.J0)).j();
                return;
            case 17:
                ((lw0) this.f52626b).f49684e.presentFragment(ProfileActivity.D4(((Long) this.f52627c).longValue()));
                return;
            case 18:
                ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
                g2Var.d = (org.telegram.ui.ActionBar.h6) this.f52627c;
                ((org.telegram.ui.ActionBar.g2) this.f52626b).presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
                return;
            case 19:
                ww0 ww0Var = (ww0) this.f52626b;
                String str7 = (String) this.f52627c;
                ArrayList arrayList2 = ww0Var.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = ww0Var.f53461e;
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
                    vw0[] vw0VarArr = ww0Var.f53460c;
                    if (i14 < vw0VarArr.length) {
                        vw0 vw0Var = vw0VarArr[i14];
                        if (vw0Var == null) {
                            i12 = i14;
                            z10 = z11;
                        } else {
                            String str9 = vw0Var.f52875a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(g2Var2.getThemedColor(org.telegram.ui.ActionBar.m6.f29587q6)), indexOf, str6.length() + indexOf, 33);
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
                                    if (vw0Var.f52879f == 502) {
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
                                String str13 = str8 + zoVar.f28329a.toLowerCase();
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
                                                    spannableStringBuilder3 = new SpannableStringBuilder(zoVar.f28329a);
                                                } else {
                                                    str = str8;
                                                }
                                                i10 = size;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(g2Var2.getThemedColor(org.telegram.ui.ActionBar.m6.f29587q6)), i11, str14.length() + i11, 33);
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
                        org.telegram.messenger.g0.g3(new gu0(ww0Var, str12, arrayList3, arrayList4, arrayList5, 3));
                        return;
                    }
                }
                break;
            case 20:
                ww0 ww0Var2 = (ww0) this.f52626b;
                ArrayList arrayList6 = (ArrayList) this.f52627c;
                ww0Var2.d.addAll(arrayList6);
                int i19 = ww0Var2.f53462f;
                org.telegram.messenger.np.u1(i19).f25920s2 = arrayList6;
                org.telegram.messenger.np.u1(i19).f25928t2 = ww0Var2.F;
                if (!ww0Var2.f53467x) {
                    ww0Var2.f();
                    return;
                }
                return;
            case 21:
                ax0 ax0Var = (ax0) this.f52626b;
                ax0Var.f45671f.add((cx0) this.f52627c);
                ax0Var.a();
                return;
            case 22:
                py0 py0Var = (py0) ((View[]) this.f52626b)[0];
                py0Var.f50939b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f52627c;
                py0Var.f50940c = null;
                py0Var.d = null;
                py0Var.f50942f.f35742g3.O(false);
                return;
            case 23:
                ((py0) ((View[]) this.f52626b)[0]).b((TLRPC.TL_reportResultAddComment) this.f52627c);
                return;
            case 24:
                py0 py0Var2 = (py0) ((View[]) this.f52626b)[0];
                py0Var2.f50939b = null;
                py0Var2.f50940c = (TLRPC.TL_reportResultChooseOption) this.f52627c;
                py0Var2.d = null;
                py0Var2.f50942f.f35742g3.O(false);
                return;
            case 25:
                ((org.telegram.messenger.video.a) this.f52626b).run();
                ((org.telegram.ui.Components.lc) this.f52627c).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                return;
            case 26:
                org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.g2) this.f52626b).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                org.telegram.messenger.g0.g3((org.telegram.ui.Components.fw) this.f52627c);
                return;
            case 27:
                ((SecretMediaViewer) this.f52626b).L = false;
                ((xq0) this.f52627c).f53898a.O0(false, true);
                return;
            case 28:
                ((SecretMediaViewer) ((ji.k) this.f52626b).f17943c).i((File) this.f52627c);
                return;
            default:
                r11 r11Var = (r11) this.f52626b;
                r11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.g2) this.f52627c).presentFragment(new StickersActivity(5, r11Var.M0));
                Runnable runnable = r11Var.V1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public ur0(org.telegram.ui.Components.ap0 ap0Var, a0.h hVar, int i7, int i10) {
        this.f52625a = i10;
        this.f52626b = ap0Var;
        this.f52627c = hVar;
    }
}
