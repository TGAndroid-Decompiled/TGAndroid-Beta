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
public final class tn0 implements Runnable {
    public final int f50309a;
    public final Object f50310b;
    public final Object f50311c;

    public tn0(int i7, Object obj, Object obj2) {
        this.f50309a = i7;
        this.f50310b = obj;
        this.f50311c = obj2;
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
        switch (this.f50309a) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                ((bi.r2) this.f50310b).a((Bitmap) this.f50311c);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.f50310b;
                tg.o0 o0Var = (tg.o0) this.f50311c;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                o0Var.f55886e.h();
                o0Var.f55885c.postRunnable(new q61(17));
                photoViewer.f41382e0.removeView(photoViewer.N1);
                return;
            case 2:
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.f50310b;
                Bitmap bitmap = (Bitmap) this.f50311c;
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                if (u5Var != null) {
                    ArrayList arrayList2 = u5Var.h;
                    org.telegram.ui.Components.r5 r5Var = u5Var.f38530n;
                    if (r5Var != null) {
                        arrayList2.add(r5Var);
                    }
                    org.telegram.ui.Components.r5 r5Var2 = u5Var.f38535r;
                    if (r5Var2 != null) {
                        arrayList2.add(r5Var2);
                    }
                    org.telegram.ui.Components.r5 r5Var3 = u5Var.f38537s;
                    if (r5Var3 != null) {
                        arrayList2.add(r5Var3);
                    }
                    u5Var.f38530n = new org.telegram.ui.Components.r5(bitmap);
                    u5Var.f38535r = null;
                    u5Var.f38537s = null;
                    u5Var.t();
                    return;
                }
                return;
            case 3:
                fo0 fo0Var = (fo0) this.f50310b;
                fo0Var.getClass();
                ((View) this.f50311c).setOutlineProvider(null);
                PhotoViewer photoViewer2 = fo0Var.f45817c;
                ImageView imageView = photoViewer2.f41543w3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                rq0 rq0Var = photoViewer2.E2;
                if (rq0Var != null) {
                    rq0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 4:
                pp0 pp0Var = (pp0) this.f50310b;
                org.telegram.ui.Components.t51 t51Var = (org.telegram.ui.Components.t51) this.f50311c;
                pp0Var.getClass();
                if (t51Var.U() > 0 && t51Var.S() >= t51Var.U() - 590) {
                    pp0Var.f48818a.f41382e0.invalidate();
                    return;
                }
                return;
            case 5:
                sp0 sp0Var = (sp0) this.f50310b;
                tg.o0 o0Var2 = (tg.o0) this.f50311c;
                o0Var2.f55886e.h();
                o0Var2.f55885c.postRunnable(new q61(17));
                try {
                    sp0Var.f49910b.f41382e0.removeView(o0Var2);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 6:
                ((cq0) this.f50310b).f44778r.f41441k7.d();
                ((AnimatorSet) this.f50311c).start();
                return;
            case 7:
                zq0 zq0Var = (zq0) this.f50311c;
                ((cq0) this.f50310b).f44778r.f41499r4 = false;
                if (!zq0Var.f52519s) {
                    zq0Var.f52503a.O0(false, true);
                    return;
                }
                return;
            case 8:
                cs0 cs0Var = (cs0) this.f50310b;
                cs0Var.getClass();
                org.telegram.messenger.g0.g((String) this.f50311c);
                cs0Var.c(true);
                return;
            case 9:
                cs0 cs0Var2 = (cs0) this.f50310b;
                cs0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(((TLRPC.PollAnswer) this.f50311c).text, false));
                cs0Var2.c(true);
                return;
            case 10:
                cs0 cs0Var3 = (cs0) this.f50310b;
                byte[] bArr = (byte[]) this.f50311c;
                org.telegram.messenger.gz C = org.telegram.messenger.gz.C(cs0Var3.H.I1);
                org.telegram.messenger.ij ijVar = cs0Var3.H;
                if (ijVar != null && (org.telegram.messenger.ij.m1(ijVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.ij.B0(ijVar.f23266k);
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
                cs0Var3.c(true);
                return;
            case 11:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.f50310b, (TLObject) this.f50311c);
                return;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f50310b;
                boolean[] zArr = (boolean[]) this.f50311c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    return;
                }
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f50310b;
                privacySettingsActivity.d = (TL_account.Password) this.f50311c;
                privacySettingsActivity.D0();
                return;
            case 14:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f50310b;
                boolean z11 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z11;
                ((org.telegram.ui.Cells.r8) this.f50311c).setChecked(z11);
                return;
            case 15:
                ((vt0) this.f50310b).getMessagesController().f5(null, ((Long) this.f50311c).longValue());
                return;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) this.f50310b;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f50311c)[0]).f26968id);
                profileActivity.presentFragment(new cn(bundle), true);
                return;
            case 17:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f50310b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f50311c;
                long j10 = profileActivity2.f41869z2;
                if (j10 != 0) {
                    TLRPC.User a22 = profileActivity2.getMessagesController().a2(Long.valueOf(j10));
                    profileActivity2.getMessagesController().f0(profileActivity2.f41721e1, a22);
                    if (profileActivity2.D2 != null && a22 != null && org.telegram.ui.Components.gc.a(profileActivity2)) {
                        org.telegram.ui.Components.gc.D(profileActivity2, a22, profileActivity2.D2.title).j();
                    }
                    if (profileActivity2.f41825t2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.G5(true, false);
                        return;
                    }
                    return;
                }
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                if (org.telegram.messenger.g0.Q1()) {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f41721e1));
                } else {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity2.getMessagesController().f0(profileActivity2.f41721e1, profileActivity2.getMessagesController().a2(Long.valueOf(profileActivity2.getUserConfig().e())));
                profileActivity2.I1 = i7;
                profileActivity2.finishFragment();
                return;
            case 18:
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.messenger.g0.g("https://" + ((ProfileActivity) this.f50310b).getMessagesController().U2 + "/" + org.telegram.messenger.t3.K((TLRPC.Chat) this.f50311c, false));
                return;
            case 19:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f50310b;
                RectF rectF3 = ProfileActivity.V6;
                profileActivity3.getClass();
                org.telegram.ui.Components.bc.e();
                vf.c.t(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f50311c).url);
                return;
            case 20:
                ProfileActivity profileActivity4 = (ProfileActivity) this.f50310b;
                RectF rectF4 = ProfileActivity.V6;
                org.telegram.ui.Components.fn fnVar = ((org.telegram.ui.Components.jn) this.f50311c).f34997e;
                zw zwVar = profileActivity4.f41747h5;
                if (zwVar != null && zwVar.getFragmentView() != null) {
                    D = profileActivity4.f41747h5.getFragmentView();
                } else {
                    D = profileActivity4.f41754i5.D();
                }
                RectF rectF5 = profileActivity4.f41748h6;
                if (jh.k.c(fnVar, D, rectF5)) {
                    f10 = rectF5.left;
                } else {
                    f10 = 0.0f;
                }
                profileActivity4.f41741g6 = f10;
                profileActivity4.d4();
                return;
            case 21:
                ProfileActivity profileActivity5 = (ProfileActivity) this.f50310b;
                RectF rectF6 = ProfileActivity.V6;
                profileActivity5.D2 = profileActivity5.getMessagesStorage().O(profileActivity5.f41721e1);
                ((CountDownLatch) this.f50311c).countDown();
                return;
            case 22:
                ProfileActivity profileActivity6 = (ProfileActivity) this.f50310b;
                RectF rectF7 = ProfileActivity.V6;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.m8) ((View) this.f50311c)).setChecked(profileActivity6.f41811r2.g());
                return;
            case 23:
                ProfileActivity profileActivity7 = (ProfileActivity) this.f50310b;
                RectF rectF8 = ProfileActivity.V6;
                profileActivity7.getClass();
                profileActivity7.F2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) this.f50311c)).participant;
                return;
            case 24:
                ProfileActivity profileActivity8 = (ProfileActivity) this.f50310b;
                RectF rectF9 = ProfileActivity.V6;
                if (!((boolean[]) this.f50311c)[0] && (nVar = profileActivity8.f41872z5) != null) {
                    nVar.run();
                }
                profileActivity8.f41872z5 = null;
                return;
            case 25:
                yu0 yu0Var = (yu0) this.f50310b;
                a0.h hVar = (a0.h) this.f50311c;
                ProfileActivity profileActivity9 = yu0Var.U2.f52541c;
                Activity parentActivity = profileActivity9.getParentActivity();
                wv0 wv0Var = profileActivity9.f41792o5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f26964id;
                }
                org.telegram.ui.Components.gc.x(parentActivity, wv0Var, m10, j3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tj, yu0Var.I0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.vj, yu0Var.I0)).j();
                return;
            case 26:
                nv0 nv0Var = (nv0) this.f50310b;
                a0.h hVar2 = (a0.h) this.f50311c;
                ProfileActivity profileActivity10 = nv0Var.U2;
                Activity parentActivity2 = profileActivity10.getParentActivity();
                wv0 wv0Var2 = profileActivity10.f41792o5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar2.n(0)).f26964id;
                }
                org.telegram.ui.Components.gc.x(parentActivity2, wv0Var2, m11, j3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tj, nv0Var.I0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.vj, nv0Var.I0)).j();
                return;
            case 27:
                ((mw0) this.f50310b).f48065e.presentFragment(ProfileActivity.D4(((Long) this.f50311c).longValue()));
                return;
            case 28:
                ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
                f2Var.d = (org.telegram.ui.ActionBar.h6) this.f50311c;
                ((org.telegram.ui.ActionBar.f2) this.f50310b).presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
                return;
            default:
                yw0 yw0Var = (yw0) this.f50310b;
                String str7 = (String) this.f50311c;
                ArrayList arrayList3 = yw0Var.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = yw0Var.f52137e;
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
                    xw0[] xw0VarArr = yw0Var.f52136c;
                    if (i14 < xw0VarArr.length) {
                        xw0 xw0Var = xw0VarArr[i14];
                        if (xw0Var == null) {
                            i12 = i14;
                            z9 = z10;
                        } else {
                            String str9 = xw0Var.f51831a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(f2Var2.getThemedColor(org.telegram.ui.ActionBar.m6.f28130q6)), indexOf, str6.length() + indexOf, 33);
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
                                    if (xw0Var.f51835f == 502) {
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
                                    arrayList4.add(xw0Var);
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
                        if (yw0Var.E != null) {
                            int size = arrayList3.size();
                            int i17 = 0;
                            while (i17 < size) {
                                org.telegram.messenger.cp cpVar = (org.telegram.messenger.cp) arrayList3.get(i17);
                                String str13 = str8 + cpVar.f21916a.toLowerCase();
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
                                                    spannableStringBuilder3 = new SpannableStringBuilder(cpVar.f21916a);
                                                } else {
                                                    i10 = size;
                                                }
                                                str = str8;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(f2Var2.getThemedColor(org.telegram.ui.ActionBar.m6.f28130q6)), i11, str14.length() + i11, 33);
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
                        org.telegram.messenger.g0.h3(new sw0(yw0Var, str12, arrayList4, arrayList5, arrayList6, 0));
                        return;
                    }
                }
                break;
        }
    }

    public tn0(org.telegram.ui.Components.mo0 mo0Var, a0.h hVar, int i7, int i10) {
        this.f50309a = i10;
        this.f50310b = mo0Var;
        this.f50311c = hVar;
    }
}
