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
public final class sn0 implements Runnable {
    public final int f49960a;
    public final Object f49961b;
    public final Object f49962c;

    public sn0(int i7, Object obj, Object obj2) {
        this.f49960a = i7;
        this.f49961b = obj;
        this.f49962c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        View D;
        float f10;
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
        switch (this.f49960a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f49961b;
                tg.o0 o0Var = (tg.o0) this.f49962c;
                Drawable[] drawableArr = PhotoViewer.Y8;
                o0Var.f55887e.h();
                o0Var.f55886c.postRunnable(new p61(17));
                photoViewer.f41391e0.removeView(photoViewer.N1);
                return;
            case 1:
                org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) this.f49961b;
                Bitmap bitmap = (Bitmap) this.f49962c;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                if (v5Var != null) {
                    ArrayList arrayList2 = v5Var.h;
                    org.telegram.ui.Components.s5 s5Var = v5Var.f38935n;
                    if (s5Var != null) {
                        arrayList2.add(s5Var);
                    }
                    org.telegram.ui.Components.s5 s5Var2 = v5Var.f38940r;
                    if (s5Var2 != null) {
                        arrayList2.add(s5Var2);
                    }
                    org.telegram.ui.Components.s5 s5Var3 = v5Var.f38942s;
                    if (s5Var3 != null) {
                        arrayList2.add(s5Var3);
                    }
                    v5Var.f38935n = new org.telegram.ui.Components.s5(bitmap);
                    v5Var.f38940r = null;
                    v5Var.f38942s = null;
                    v5Var.t();
                    return;
                }
                return;
            case 2:
                eo0 eo0Var = (eo0) this.f49961b;
                eo0Var.getClass();
                ((View) this.f49962c).setOutlineProvider(null);
                PhotoViewer photoViewer2 = eo0Var.f45481c;
                ImageView imageView = photoViewer2.f41552w3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                qq0 qq0Var = photoViewer2.E2;
                if (qq0Var != null) {
                    qq0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 3:
                op0 op0Var = (op0) this.f49961b;
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.f49962c;
                op0Var.getClass();
                if (u51Var.U() > 0 && u51Var.S() >= u51Var.U() - 590) {
                    op0Var.f48502a.f41391e0.invalidate();
                    return;
                }
                return;
            case 4:
                rp0 rp0Var = (rp0) this.f49961b;
                tg.o0 o0Var2 = (tg.o0) this.f49962c;
                o0Var2.f55887e.h();
                o0Var2.f55886c.postRunnable(new p61(17));
                try {
                    rp0Var.f49556b.f41391e0.removeView(o0Var2);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 5:
                ((bq0) this.f49961b).f44106r.f41450k7.d();
                ((AnimatorSet) this.f49962c).start();
                return;
            case 6:
                yq0 yq0Var = (yq0) this.f49962c;
                ((bq0) this.f49961b).f44106r.f41508r4 = false;
                if (!yq0Var.f52175s) {
                    yq0Var.f52159a.O0(false, true);
                    return;
                }
                return;
            case 7:
                bs0 bs0Var = (bs0) this.f49961b;
                bs0Var.getClass();
                org.telegram.messenger.g0.g((String) this.f49962c);
                bs0Var.c(true);
                return;
            case 8:
                bs0 bs0Var2 = (bs0) this.f49961b;
                bs0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(((TLRPC.PollAnswer) this.f49962c).text, false));
                bs0Var2.c(true);
                return;
            case 9:
                bs0 bs0Var3 = (bs0) this.f49961b;
                byte[] bArr = (byte[]) this.f49962c;
                org.telegram.messenger.gz C = org.telegram.messenger.gz.C(bs0Var3.H.I1);
                org.telegram.messenger.ij ijVar = bs0Var3.H;
                if (ijVar != null && (org.telegram.messenger.ij.m1(ijVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
                    int e12 = ijVar.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().j1(B0);
                    tL_messages_deletePollAnswer.msg_id = e12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.p5 p5Var = Utilities.d;
                    Objects.requireNonNull(p5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.d(C, 7));
                }
                bs0Var3.c(true);
                return;
            case 10:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.f49961b, (TLObject) this.f49962c);
                return;
            case 11:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f49961b;
                boolean[] zArr = (boolean[]) this.f49962c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    return;
                }
                return;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f49961b;
                privacySettingsActivity.d = (TL_account.Password) this.f49962c;
                privacySettingsActivity.D0();
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f49961b;
                boolean z11 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z11;
                ((org.telegram.ui.Cells.r8) this.f49962c).setChecked(z11);
                return;
            case 14:
                ((ut0) this.f49961b).getMessagesController().f5(null, ((Long) this.f49962c).longValue());
                return;
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.f49961b;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f49962c)[0]).f26964id);
                profileActivity.presentFragment(new cn(bundle), true);
                return;
            case 16:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f49961b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f49962c;
                long j10 = profileActivity2.f41878z2;
                if (j10 != 0) {
                    TLRPC.User a22 = profileActivity2.getMessagesController().a2(Long.valueOf(j10));
                    profileActivity2.getMessagesController().f0(profileActivity2.f41730e1, a22);
                    if (profileActivity2.D2 != null && a22 != null && org.telegram.ui.Components.hc.a(profileActivity2)) {
                        org.telegram.ui.Components.hc.D(profileActivity2, a22, profileActivity2.D2.title).j();
                    }
                    if (profileActivity2.f41834t2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.G5(true, false);
                        return;
                    }
                    return;
                }
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                if (org.telegram.messenger.g0.Q1()) {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f41730e1));
                } else {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity2.getMessagesController().f0(profileActivity2.f41730e1, profileActivity2.getMessagesController().a2(Long.valueOf(profileActivity2.getUserConfig().e())));
                profileActivity2.I1 = i7;
                profileActivity2.finishFragment();
                return;
            case 17:
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.messenger.g0.g("https://" + ((ProfileActivity) this.f49961b).getMessagesController().U2 + "/" + org.telegram.messenger.t3.K((TLRPC.Chat) this.f49962c, false));
                return;
            case 18:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f49961b;
                RectF rectF3 = ProfileActivity.V6;
                profileActivity3.getClass();
                org.telegram.ui.Components.cc.e();
                vf.c.t(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f49962c).url);
                return;
            case 19:
                ProfileActivity profileActivity4 = (ProfileActivity) this.f49961b;
                RectF rectF4 = ProfileActivity.V6;
                org.telegram.ui.Components.gn gnVar = ((org.telegram.ui.Components.kn) this.f49962c).f35406e;
                yw ywVar = profileActivity4.f41756h5;
                if (ywVar != null && ywVar.getFragmentView() != null) {
                    D = profileActivity4.f41756h5.getFragmentView();
                } else {
                    D = profileActivity4.f41763i5.D();
                }
                RectF rectF5 = profileActivity4.f41757h6;
                if (jh.k.c(gnVar, D, rectF5)) {
                    f10 = rectF5.left;
                } else {
                    f10 = 0.0f;
                }
                profileActivity4.f41750g6 = f10;
                profileActivity4.d4();
                return;
            case 20:
                ProfileActivity profileActivity5 = (ProfileActivity) this.f49961b;
                RectF rectF6 = ProfileActivity.V6;
                profileActivity5.D2 = profileActivity5.getMessagesStorage().O(profileActivity5.f41730e1);
                ((CountDownLatch) this.f49962c).countDown();
                return;
            case 21:
                ProfileActivity profileActivity6 = (ProfileActivity) this.f49961b;
                RectF rectF7 = ProfileActivity.V6;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.m8) ((View) this.f49962c)).setChecked(profileActivity6.f41820r2.g());
                return;
            case 22:
                ProfileActivity profileActivity7 = (ProfileActivity) this.f49961b;
                RectF rectF8 = ProfileActivity.V6;
                profileActivity7.getClass();
                profileActivity7.F2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) this.f49962c)).participant;
                return;
            case 23:
                ProfileActivity profileActivity8 = (ProfileActivity) this.f49961b;
                RectF rectF9 = ProfileActivity.V6;
                if (!((boolean[]) this.f49962c)[0] && (nVar = profileActivity8.f41881z5) != null) {
                    nVar.run();
                }
                profileActivity8.f41881z5 = null;
                return;
            case 24:
                xu0 xu0Var = (xu0) this.f49961b;
                a0.h hVar = (a0.h) this.f49962c;
                ProfileActivity profileActivity9 = xu0Var.R2.f52195c;
                Activity parentActivity = profileActivity9.getParentActivity();
                vv0 vv0Var = profileActivity9.f41801o5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f26960id;
                }
                org.telegram.ui.Components.hc.x(parentActivity, vv0Var, m10, j3, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tj, xu0Var.I0), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.vj, xu0Var.I0)).j();
                return;
            case 25:
                mv0 mv0Var = (mv0) this.f49961b;
                a0.h hVar2 = (a0.h) this.f49962c;
                ProfileActivity profileActivity10 = mv0Var.R2;
                Activity parentActivity2 = profileActivity10.getParentActivity();
                vv0 vv0Var2 = profileActivity10.f41801o5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar2.n(0)).f26960id;
                }
                org.telegram.ui.Components.hc.x(parentActivity2, vv0Var2, m11, j3, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tj, mv0Var.I0), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.vj, mv0Var.I0)).j();
                return;
            case 26:
                ((lw0) this.f49961b).f47690e.presentFragment(ProfileActivity.D4(((Long) this.f49962c).longValue()));
                return;
            case 27:
                ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
                f2Var.d = (org.telegram.ui.ActionBar.g6) this.f49962c;
                ((org.telegram.ui.ActionBar.f2) this.f49961b).presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
                return;
            case 28:
                ww0 ww0Var = (ww0) this.f49961b;
                String str7 = (String) this.f49962c;
                ArrayList arrayList3 = ww0Var.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = ww0Var.f51491e;
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
                    vw0[] vw0VarArr = ww0Var.f51490c;
                    if (i14 < vw0VarArr.length) {
                        vw0 vw0Var = vw0VarArr[i14];
                        if (vw0Var == null) {
                            i12 = i14;
                            z9 = z10;
                        } else {
                            String str9 = vw0Var.f50791a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(f2Var2.getThemedColor(org.telegram.ui.ActionBar.l6.f28105q6)), indexOf, str6.length() + indexOf, 33);
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
                                    if (vw0Var.f50795f == 502) {
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
                                    arrayList4.add(vw0Var);
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
                        if (ww0Var.E != null) {
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
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(f2Var2.getThemedColor(org.telegram.ui.ActionBar.l6.f28105q6)), i11, str14.length() + i11, 33);
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
                        org.telegram.messenger.g0.h3(new qw0(ww0Var, str12, arrayList4, arrayList5, arrayList6, 0));
                        return;
                    }
                }
                break;
            default:
                ww0 ww0Var2 = (ww0) this.f49961b;
                ArrayList arrayList7 = (ArrayList) this.f49962c;
                ww0Var2.d.addAll(arrayList7);
                int i19 = ww0Var2.f51492f;
                org.telegram.messenger.qp.s1(i19).f24863p2 = arrayList7;
                org.telegram.messenger.qp.s1(i19).f24872q2 = ww0Var2.E;
                if (!ww0Var2.f51497x) {
                    ww0Var2.f();
                    return;
                }
                return;
        }
    }

    public sn0(org.telegram.ui.Components.no0 no0Var, a0.h hVar, int i7, int i10) {
        this.f49960a = i10;
        this.f49961b = no0Var;
        this.f49962c = hVar;
    }
}
