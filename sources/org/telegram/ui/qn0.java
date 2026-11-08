package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
public final class qn0 implements Runnable {
    public final int f49282a;
    public final Object f49283b;
    public final Object f49284c;

    public qn0(int i7, Object obj, Object obj2) {
        this.f49282a = i7;
        this.f49283b = obj;
        this.f49284c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        org.telegram.messenger.video.n nVar;
        ArrayList arrayList;
        int i10;
        String str;
        int i11;
        String str2;
        boolean z9;
        int i12;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        SpannableStringBuilder spannableStringBuilder;
        String str6;
        long j3 = 0;
        boolean z10 = true;
        switch (this.f49282a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f49283b;
                tg.o0 o0Var = (tg.o0) this.f49284c;
                Drawable[] drawableArr = PhotoViewer.Y8;
                o0Var.f55875e.h();
                o0Var.f55874c.postRunnable(new o61(17));
                photoViewer.f41384e0.removeView(photoViewer.N1);
                return;
            case 1:
                org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) this.f49283b;
                Bitmap bitmap = (Bitmap) this.f49284c;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                if (v5Var != null) {
                    ArrayList arrayList2 = v5Var.h;
                    org.telegram.ui.Components.s5 s5Var = v5Var.f38874n;
                    if (s5Var != null) {
                        arrayList2.add(s5Var);
                    }
                    org.telegram.ui.Components.s5 s5Var2 = v5Var.f38879r;
                    if (s5Var2 != null) {
                        arrayList2.add(s5Var2);
                    }
                    org.telegram.ui.Components.s5 s5Var3 = v5Var.f38881s;
                    if (s5Var3 != null) {
                        arrayList2.add(s5Var3);
                    }
                    v5Var.f38874n = new org.telegram.ui.Components.s5(bitmap);
                    v5Var.f38879r = null;
                    v5Var.f38881s = null;
                    v5Var.t();
                    return;
                }
                return;
            case 2:
                co0 co0Var = (co0) this.f49283b;
                co0Var.getClass();
                ((View) this.f49284c).setOutlineProvider(null);
                PhotoViewer photoViewer2 = co0Var.f44871c;
                ImageView imageView = photoViewer2.f41545w3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                oq0 oq0Var = photoViewer2.E2;
                if (oq0Var != null) {
                    oq0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 3:
                mp0 mp0Var = (mp0) this.f49283b;
                org.telegram.ui.Components.t51 t51Var = (org.telegram.ui.Components.t51) this.f49284c;
                mp0Var.getClass();
                if (t51Var.U() > 0 && t51Var.S() >= t51Var.U() - 590) {
                    mp0Var.f47861a.f41384e0.invalidate();
                    return;
                }
                return;
            case 4:
                pp0 pp0Var = (pp0) this.f49283b;
                tg.o0 o0Var2 = (tg.o0) this.f49284c;
                o0Var2.f55875e.h();
                o0Var2.f55874c.postRunnable(new o61(17));
                try {
                    pp0Var.f48906b.f41384e0.removeView(o0Var2);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 5:
                ((zp0) this.f49283b).f52647r.f41443k7.d();
                ((AnimatorSet) this.f49284c).start();
                return;
            case 6:
                wq0 wq0Var = (wq0) this.f49284c;
                ((zp0) this.f49283b).f52647r.f41501r4 = false;
                if (!wq0Var.f51499s) {
                    wq0Var.f51483a.O0(false, true);
                    return;
                }
                return;
            case 7:
                zr0 zr0Var = (zr0) this.f49283b;
                zr0Var.getClass();
                org.telegram.messenger.g0.g((String) this.f49284c);
                zr0Var.c(true);
                return;
            case 8:
                zr0 zr0Var2 = (zr0) this.f49283b;
                zr0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(((TLRPC.PollAnswer) this.f49284c).text, false));
                zr0Var2.c(true);
                return;
            case 9:
                zr0 zr0Var3 = (zr0) this.f49283b;
                byte[] bArr = (byte[]) this.f49284c;
                org.telegram.messenger.gz C = org.telegram.messenger.gz.C(zr0Var3.H.I1);
                org.telegram.messenger.ij ijVar = zr0Var3.H;
                if (ijVar != null && (org.telegram.messenger.ij.n1(ijVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
                    int f12 = ijVar.f1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().j1(B0);
                    tL_messages_deletePollAnswer.msg_id = f12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.p5 p5Var = Utilities.d;
                    Objects.requireNonNull(p5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.d(C, 7));
                }
                zr0Var3.c(true);
                return;
            case 10:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.f49283b, (TLObject) this.f49284c);
                return;
            case 11:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f49283b;
                boolean[] zArr = (boolean[]) this.f49284c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    return;
                }
                return;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f49283b;
                privacySettingsActivity.d = (TL_account.Password) this.f49284c;
                privacySettingsActivity.D0();
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f49283b;
                boolean z11 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z11;
                ((org.telegram.ui.Cells.r8) this.f49284c).setChecked(z11);
                return;
            case 14:
                ((st0) this.f49283b).getMessagesController().f5(null, ((Long) this.f49284c).longValue());
                return;
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.f49283b;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f49284c)[0]).f26964id);
                profileActivity.presentFragment(new an(bundle), true);
                return;
            case 16:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f49283b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f49284c;
                long j10 = profileActivity2.f41871z2;
                if (j10 != 0) {
                    TLRPC.User a22 = profileActivity2.getMessagesController().a2(Long.valueOf(j10));
                    profileActivity2.getMessagesController().f0(profileActivity2.f41723e1, a22);
                    if (profileActivity2.D2 != null && a22 != null && org.telegram.ui.Components.hc.a(profileActivity2)) {
                        org.telegram.ui.Components.hc.D(profileActivity2, a22, profileActivity2.D2.title).j();
                    }
                    if (profileActivity2.f41827t2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.D5(true, false);
                        return;
                    }
                    return;
                }
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                if (org.telegram.messenger.g0.Q1()) {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f41723e1));
                } else {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity2.getMessagesController().f0(profileActivity2.f41723e1, profileActivity2.getMessagesController().a2(Long.valueOf(profileActivity2.getUserConfig().e())));
                profileActivity2.I1 = i7;
                profileActivity2.finishFragment();
                return;
            case 17:
                RectF rectF2 = ProfileActivity.S6;
                org.telegram.messenger.g0.g("https://" + ((ProfileActivity) this.f49283b).getMessagesController().U2 + "/" + org.telegram.messenger.t3.K((TLRPC.Chat) this.f49284c, false));
                return;
            case 18:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f49283b;
                RectF rectF3 = ProfileActivity.S6;
                profileActivity3.getClass();
                org.telegram.ui.Components.cc.e();
                vf.c.t(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f49284c).url);
                return;
            case 19:
                ProfileActivity profileActivity4 = (ProfileActivity) this.f49283b;
                RectF rectF4 = ProfileActivity.S6;
                profileActivity4.D2 = profileActivity4.getMessagesStorage().O(profileActivity4.f41723e1);
                ((CountDownLatch) this.f49284c).countDown();
                return;
            case 20:
                ProfileActivity profileActivity5 = (ProfileActivity) this.f49283b;
                RectF rectF5 = ProfileActivity.S6;
                profileActivity5.getClass();
                ((org.telegram.ui.Cells.m8) ((View) this.f49284c)).setChecked(profileActivity5.f41813r2.g());
                return;
            case 21:
                ProfileActivity profileActivity6 = (ProfileActivity) this.f49283b;
                RectF rectF6 = ProfileActivity.S6;
                profileActivity6.getClass();
                profileActivity6.F2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) this.f49284c)).participant;
                return;
            case 22:
                ProfileActivity profileActivity7 = (ProfileActivity) this.f49283b;
                RectF rectF7 = ProfileActivity.S6;
                if (!((boolean[]) this.f49284c)[0] && (nVar = profileActivity7.f41859x5) != null) {
                    nVar.run();
                }
                profileActivity7.f41859x5 = null;
                return;
            case 23:
                vu0 vu0Var = (vu0) this.f49283b;
                a0.h hVar = (a0.h) this.f49284c;
                ProfileActivity profileActivity8 = vu0Var.R2.f51519c;
                Activity parentActivity = profileActivity8.getParentActivity();
                tv0 tv0Var = profileActivity8.f41781m5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f26960id;
                }
                org.telegram.ui.Components.hc.x(parentActivity, tv0Var, m10, j3, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, vu0Var.I0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, vu0Var.I0)).j();
                return;
            case 24:
                kv0 kv0Var = (kv0) this.f49283b;
                a0.h hVar2 = (a0.h) this.f49284c;
                ProfileActivity profileActivity9 = kv0Var.R2;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                tv0 tv0Var2 = profileActivity9.f41781m5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar2.n(0)).f26960id;
                }
                org.telegram.ui.Components.hc.x(parentActivity2, tv0Var2, m11, j3, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, kv0Var.I0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, kv0Var.I0)).j();
                return;
            case 25:
                ((jw0) this.f49283b).f47047e.presentFragment(ProfileActivity.A4(((Long) this.f49284c).longValue()));
                return;
            case 26:
                ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
                f2Var.d = (org.telegram.ui.ActionBar.f6) this.f49284c;
                ((org.telegram.ui.ActionBar.f2) this.f49283b).presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
                return;
            case 27:
                tw0 tw0Var = (tw0) this.f49283b;
                String str7 = (String) this.f49284c;
                ArrayList arrayList3 = tw0Var.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = tw0Var.f50159e;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String str8 = " ";
                String[] split = str7.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    String S0 = org.telegram.messenger.id.E0().S0(split[i13], true, false);
                    strArr2[i13] = S0;
                    if (S0.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                }
                int i14 = 0;
                while (true) {
                    sw0[] sw0VarArr = tw0Var.f50158c;
                    if (i14 < sw0VarArr.length) {
                        sw0 sw0Var = sw0VarArr[i14];
                        if (sw0Var == null) {
                            i12 = i14;
                            z9 = z10;
                        } else {
                            String str9 = sw0Var.f49847a;
                            z9 = z10;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(f2Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f28092q6)), indexOf, str6.length() + indexOf, 33);
                                    } else {
                                        i14 = i12 + 1;
                                        z10 = z9;
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
                                    if (sw0Var.f49851f == 502) {
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 < 4) {
                                                if (org.telegram.messenger.p10.i(i16).p()) {
                                                    i16++;
                                                }
                                            } else {
                                                i16 = -1;
                                            }
                                        }
                                        if (i16 < 0) {
                                        }
                                    }
                                    arrayList4.add(sw0Var);
                                    arrayList6.add(spannableStringBuilder);
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
                        z10 = z9;
                        strArr2 = strArr;
                        str7 = str7;
                    } else {
                        String[] strArr3 = strArr2;
                        String str12 = str7;
                        if (tw0Var.E != null) {
                            int size = arrayList3.size();
                            int i17 = 0;
                            while (i17 < size) {
                                org.telegram.messenger.cp cpVar = (org.telegram.messenger.cp) arrayList3.get(i17);
                                String str13 = str8 + cpVar.f21912a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                int i18 = 0;
                                while (true) {
                                    if (i18 < split.length) {
                                        if (split[i18].length() != 0) {
                                            String str14 = split[i18];
                                            arrayList = arrayList3;
                                            int indexOf2 = str13.indexOf(str8 + str14);
                                            if (indexOf2 < 0 && (str2 = strArr3[i18]) != null) {
                                                str14 = str2;
                                                i11 = str13.indexOf(str8.concat(str2));
                                            } else {
                                                i11 = indexOf2;
                                            }
                                            if (i11 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    i10 = size;
                                                    spannableStringBuilder3 = new SpannableStringBuilder(cpVar.f21912a);
                                                } else {
                                                    i10 = size;
                                                }
                                                str = str8;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(f2Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f28092q6)), i11, str14.length() + i11, 33);
                                            }
                                        } else {
                                            arrayList = arrayList3;
                                            i10 = size;
                                            str = str8;
                                        }
                                        if (spannableStringBuilder3 != null && i18 == split.length - 1) {
                                            arrayList5.add(cpVar);
                                            arrayList6.add(spannableStringBuilder3);
                                        }
                                        i18++;
                                        size = i10;
                                        arrayList3 = arrayList;
                                        str8 = str;
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                }
                                i17++;
                                size = size;
                                arrayList3 = arrayList;
                                str8 = str8;
                            }
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(tw0Var, str12, arrayList4, arrayList5, arrayList6, 29));
                        return;
                    }
                }
                break;
            case 28:
                tw0 tw0Var2 = (tw0) this.f49283b;
                ArrayList arrayList7 = (ArrayList) this.f49284c;
                tw0Var2.d.addAll(arrayList7);
                int i19 = tw0Var2.f50160f;
                org.telegram.messenger.qp.s1(i19).f24863p2 = arrayList7;
                org.telegram.messenger.qp.s1(i19).f24872q2 = tw0Var2.E;
                if (!tw0Var2.f50165x) {
                    tw0Var2.f();
                    return;
                }
                return;
            default:
                xw0 xw0Var = (xw0) this.f49283b;
                xw0Var.f51997f.add((zw0) this.f49284c);
                xw0Var.a();
                return;
        }
    }

    public qn0(org.telegram.ui.Components.mo0 mo0Var, a0.h hVar, int i7, int i10) {
        this.f49282a = i10;
        this.f49283b = mo0Var;
        this.f49284c = hVar;
    }
}
