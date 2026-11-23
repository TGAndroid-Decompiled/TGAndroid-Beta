package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ClippingImageView;
public final class wn implements Runnable {
    public final int f53459a;
    public final Object f53460b;
    public final Object f53461c;
    public final Object d;
    public final Object f53462e;
    public final Object f53463f;

    public wn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f53459a = i7;
        this.f53461c = obj;
        this.d = obj2;
        this.f53460b = obj3;
        this.f53462e = obj4;
        this.f53463f = obj5;
    }

    private final void a() {
        PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f53461c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f53460b;
        boolean[] zArr = (boolean[]) this.d;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) this.f53462e;
        TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) this.f53463f;
        if (tL_error != null) {
            privacyControlActivity.M0();
            return;
        }
        zArr[1] = true;
        if (globalPrivacySettings != null) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
            globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
            int i7 = globalPrivacySettings2.flags;
            globalPrivacySettings.flags = i7;
            globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
            long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
            if (j3 > 0) {
                globalPrivacySettings.flags = i7 | 32;
                globalPrivacySettings.noncontact_peers_paid_stars = j3;
            } else {
                globalPrivacySettings.flags = i7 & (-33);
                globalPrivacySettings.noncontact_peers_paid_stars = 0L;
            }
        }
        if (zArr[0]) {
            privacyControlActivity.I0();
        }
        privacyControlActivity.getNotificationCenter().k(org.telegram.messenger.ls.f25333k0, new Object[0]);
    }

    @Override
    public final void run() {
        String str;
        boolean z10;
        TLRPC.GroupCall groupCall;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i7;
        int i10;
        TLRPC.ThemeSettings themeSettings;
        boolean z11;
        TLRPC.TL_wallPaper tL_wallPaper;
        ml0 ml0Var;
        org.telegram.ui.Components.lc d;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        int i15;
        uq0 uq0Var;
        String str2;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i16 = this.f53459a;
        int i17 = 0;
        Object obj = this.f53460b;
        Object obj2 = this.f53463f;
        Object obj3 = this.d;
        Object obj4 = this.f53462e;
        Object obj5 = this.f53461c;
        switch (i16) {
            case 0:
                jo joVar = (jo) obj5;
                String str3 = (String) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) obj2;
                joVar.f49045i0 = 0;
                String str4 = joVar.f49046j0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                        joVar.h.setText(org.telegram.messenger.hd.a0("LinkAvailable", null, 2131748731, str3));
                        joVar.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29735w6);
                        joVar.f49048l0 = true;
                        return;
                    }
                    if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                        joVar.h.setText(org.telegram.messenger.hd.N0(2131743409, null));
                        org.telegram.ui.ActionBar.t6.U(joVar.h.getTextView(), org.telegram.ui.ActionBar.m6.f29602p7, null);
                    } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                        if (tL_channels_checkUsername.username.length() == 4) {
                            joVar.h.setText(org.telegram.messenger.hd.N0(2131743408, null));
                        } else {
                            joVar.h.setText(org.telegram.messenger.hd.N0(2131743412, null));
                        }
                        org.telegram.ui.ActionBar.t6.U(joVar.h.getTextView(), org.telegram.ui.ActionBar.m6.F6, null);
                    } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                        joVar.f49038d0 = false;
                        joVar.f0();
                    } else {
                        joVar.h.setText(org.telegram.messenger.hd.N0(2131748719, null));
                        joVar.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29602p7);
                    }
                    joVar.f49048l0 = false;
                    return;
                }
                return;
            case 1:
                np.d0((np) obj5, (TLRPC.TL_error) obj, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj4, (TLRPC.TL_channels_editCreator) obj2);
                return;
            case 2:
                qq qqVar = (qq) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                jg.z1 z1Var = qqVar.h;
                rq rqVar = qqVar.E;
                if (rqVar.f51727o1) {
                    qqVar.f51327s = false;
                    qqVar.d = arrayList;
                    qqVar.f51323e = hVar;
                    qqVar.f51324f = arrayList2;
                    z1Var.f(arrayList, null);
                    if (!org.telegram.messenger.v3.T(rqVar.f51724n)) {
                        ArrayList arrayList4 = z1Var.f17760g;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                    }
                    int i18 = qqVar.f51326r;
                    qqVar.f();
                    if (qqVar.f51326r > i18) {
                        rqVar.D0(i18);
                    }
                    if (!z1Var.e() && qqVar.f51326r == 0) {
                        rqVar.f51698b.e(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.rf rfVar = (org.telegram.ui.Components.rf) obj5;
                ji.p pVar = (ji.p) obj3;
                ji.g gVar = (ji.g) obj4;
                ji.r rVar = (ji.r) obj2;
                ChatActivityEnterView chatActivityEnterView = rfVar.f39178a;
                org.telegram.ui.Components.pe0 a82 = chatActivityEnterView.F3.a8(pVar, (org.telegram.ui.Components.qf) obj);
                if (a82 == null) {
                    org.telegram.messenger.g0.E2(pVar);
                    return;
                }
                int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.E8);
                ArrayList J = chatActivityEnterView.A0().J();
                int size = J.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj6 = J.get(i19);
                    i19++;
                    ai.g gVar2 = (ai.g) obj6;
                    a82.c(new ai.o0(chatActivityEnterView.getContext(), gVar2, G0, chatActivityEnterView.R, false), 48, new eh(29, gVar, gVar2));
                }
                a82.J = new org.telegram.ui.Components.mf(0, rfVar, pVar);
                chatActivityEnterView.f32721t1 = true;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                }
                Objects.requireNonNull(rVar);
                a82.K = new org.telegram.ui.Components.z2(rVar, 2);
                int[] iArr = new int[2];
                chatActivityEnterView.getLocationInWindow(iArr);
                a82.F = iArr[1];
                a82.H = org.telegram.messenger.g0.L(316);
                a82.i();
                return;
            case 4:
                View view = (View) obj5;
                View view2 = (View) obj3;
                WindowManager windowManager = (WindowManager) obj;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((View) obj4);
                windowManager.removeView((View) obj2);
                return;
            case 5:
                org.telegram.ui.Components.kw0 kw0Var = (org.telegram.ui.Components.kw0) obj5;
                String str5 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                TLObject tLObject2 = (TLObject) obj4;
                TextView textView = (TextView) obj2;
                kw0Var.f37014k2 = 0;
                String str6 = kw0Var.f37013j2;
                if (str6 != null && str6.equals(str5)) {
                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(org.telegram.messenger.hd.N0(2131749042, null));
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29735w6, kw0Var.J0);
                        kw0Var.f37015l2 = true;
                        return;
                    }
                    textView.setText(org.telegram.messenger.hd.N0(2131749037, null));
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29602p7, kw0Var.J0);
                    kw0Var.f37015l2 = false;
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.vw0 vw0Var = (org.telegram.ui.Components.vw0) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                        org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(T).I(2131624034, org.telegram.messenger.hd.N0(2131746662, null), org.telegram.messenger.hd.N0(2131746661, null));
                        I.f35527j = 5000;
                        I.j();
                        return;
                    }
                    if (userFull != null) {
                        if (tL_birthday == null) {
                            userFull.flags2 &= -33;
                        } else {
                            userFull.flags2 |= 32;
                        }
                        userFull.birthday = tL_birthday;
                        org.telegram.messenger.ur.a0(vw0Var.f41567a).j2(userFull, false);
                    }
                    if (tL_error3 != null && (str = tL_error3.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vw0Var.f41568b.getContext());
                        alertDialog$Builder.f28777a.S = org.telegram.messenger.hd.N0(2131746658, null);
                        alertDialog$Builder.f28777a.U = org.telegram.messenger.hd.N0(2131746659, null);
                        org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                        return;
                    }
                    org.telegram.messenger.f3.n(null, 2131743634, org.telegram.ui.Components.lc.b0(T), 2131624012, 36);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.a21 a21Var = (org.telegram.ui.Components.a21) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                org.telegram.ui.Components.a70 a70Var = (org.telegram.ui.Components.a70) obj4;
                org.telegram.ui.Components.a70 a70Var2 = (org.telegram.ui.Components.a70) obj2;
                bn bnVar = a21Var.f33299s;
                if (((org.telegram.messenger.np) obj3).u2(a21Var.f33289f, tL_forumTopic.f28486id, null)) {
                    a70Var.v();
                    org.telegram.messenger.ys.t(a21Var.f33287e).G(a21Var.f33289f, tL_forumTopic.f28486id, false);
                    if (org.telegram.ui.Components.lc.a(bnVar)) {
                        org.telegram.ui.Components.lc.z(bnVar, 4, 0, a21Var.h).j();
                        return;
                    }
                    return;
                }
                a70Var.L(a70Var2);
                return;
            case 8:
                ns nsVar = (ns) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj2;
                if (((TLRPC.TL_error) obj) == null && (tLObject4 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject4;
                    ArrayList<TLRPC.StickerSetCovered> arrayList6 = tL_messages_myStickers.sets;
                    int size2 = arrayList6.size();
                    while (i17 < size2) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i17);
                        i17++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.f28454id = stickerSetCovered2.set.f28461id;
                            TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.si.d0(nsVar.f50304r).o0(tL_inputStickerSetID, true);
                            if (o02 == null || o02.documents.size() < 120) {
                                arrayList5.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i5.c.h(1, tL_messages_myStickers.sets)).set.f28461id;
                        ConnectionsManager.getInstance(nsVar.f50304r).sendRequest(tL_messages_getMyStickers, new z9(nsVar, arrayList5, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                cx.l0((cx) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 10:
                f40 f40Var = (f40) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                f40Var.getClass();
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                if (tLObject5 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = f40Var.getContext();
                    int i20 = f40Var.f30173a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str7 = ((TL_phone.exportedGroupCallInvite) tLObject5).link;
                    org.telegram.ui.ActionBar.h6 h6Var2 = f40Var.J0;
                    org.telegram.messenger.t3 t3Var = f40Var.V2;
                    if (t3Var != null && (groupCall = t3Var.f26950b) != null && groupCall.creator) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j9.n0(context, i20, inputGroupCall, str7, h6Var2, false, z10);
                    return;
                } else if (tL_error4 != null) {
                    new org.telegram.ui.Components.lc(f40Var.F, new fi.h0()).g0(tL_error4, false);
                    return;
                } else {
                    return;
                }
            case 11:
                f40 f40Var2 = (f40) obj5;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = (ArrayList) obj4;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str8 = (String) obj3;
                f40Var2.getClass();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    ug.k0 k0Var = new ug.k0(34, f40Var2.f30173a, T2.getContext(), T2, new fi.h0());
                    k0Var.D1(null, arrayList7, arrayList8, arrayList9, str8);
                    k0Var.show();
                    return;
                }
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                h60 h60Var = (h60) obj3;
                TLObject tLObject6 = (TLObject) obj4;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                String str9 = LaunchActivity.C1;
                try {
                    h60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject6 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject6;
                    if (tL_wallPaper3.pattern) {
                        String str10 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        rc1 rc1Var = new rc1(str10, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        rc1Var.f51551g = tL_wallPaper3;
                        tL_wallPaper3 = rc1Var;
                    }
                    x71 x71Var = new x71(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z13 = wallPaperSettings3.blur;
                    boolean z14 = wallPaperSettings3.motion;
                    x71Var.H1 = z13;
                    x71Var.G1 = z14;
                    x71Var.f53760p1 = wallPaperSettings3.intensity;
                    launchActivity.t0(x71Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                sb2.append(tL_error5.text);
                launchActivity.F0(org.telegram.ui.Components.c5.K(launchActivity, null, sb2.toString()));
                return;
            case 13:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                cx cxVar = (cx) obj;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str11 = (String) obj3;
                ArrayList arrayList10 = launchActivity2.D0;
                if (cxVar != null) {
                    if (g2Var != null) {
                        g2Var.dismissCurrentDialog();
                    }
                    while (i17 < arrayList10.size()) {
                        if (((Dialog) arrayList10.get(i17)).isShowing()) {
                            ((Dialog) arrayList10.get(i17)).dismiss();
                        }
                        i17++;
                    }
                    arrayList10.clear();
                    launchActivity2.t0(cxVar);
                    return;
                } else if (g2Var instanceof bn) {
                    ((bn) g2Var).za(user.f28583id, str11, true);
                    return;
                } else {
                    return;
                }
            case 14:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj2;
                String str12 = (String) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.TL_urlAuthResultRequest) {
                        gi0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject7, null, null, null, false, null);
                        return;
                    } else if (tLObject7 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        gi0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject7, null, null, null, false, null);
                        return;
                    } else if (tLObject7 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.c5.n0(T3, str12, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error6 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error6.text)) {
                        gi0.a().I(2131624012, org.telegram.messenger.hd.N0(2131753125, null), org.telegram.messenger.hd.N0(2131753126, null)).j();
                        return;
                    } else {
                        gi0.a().g0(tL_error6, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                h60 h60Var2 = (h60) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                String str13 = LaunchActivity.C1;
                if (tLObject8 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject8;
                    if (tL_theme.settings.size() > 0) {
                        themeSettings = tL_theme.settings.get(0);
                    } else {
                        themeSettings = null;
                    }
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0(org.telegram.ui.ActionBar.m6.r0(themeSettings));
                        if (Q0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) wallPaper;
                                org.telegram.messenger.w7.G(launchActivity4.P);
                                z11 = true;
                                if (!org.telegram.messenger.w7.J(tL_wallPaper4.document, null, true, true).exists()) {
                                    launchActivity4.V0 = t1Var;
                                    launchActivity4.U0 = true;
                                    launchActivity4.S0 = Q0;
                                    launchActivity4.T0 = tL_theme;
                                    launchActivity4.R0 = tL_wallPaper4;
                                    launchActivity4.Q0 = org.telegram.messenger.w7.r(null, tL_wallPaper4.document);
                                    org.telegram.messenger.w7.G(launchActivity4.P).W(tL_wallPaper4.document, tL_wallPaper4, 1, 1);
                                    return;
                                }
                                tL_wallPaper = tL_wallPaper4;
                            } else {
                                z11 = true;
                                tL_wallPaper = null;
                            }
                            try {
                                h60Var2.run();
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, z11);
                            }
                            launchActivity4.r0(tL_theme, tL_wallPaper, Q0);
                        } else {
                            i17 = 1;
                        }
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.U0 = false;
                            launchActivity4.T0 = tL_theme;
                            launchActivity4.P0 = org.telegram.messenger.w7.r(null, document);
                            launchActivity4.V0 = t1Var;
                            org.telegram.messenger.w7.G(launchActivity4.P).W(launchActivity4.T0.document, tL_theme, 1, 1);
                        }
                        i7 = 1;
                    }
                    i7 = i17;
                } else {
                    if (tL_error7 == null || !"THEME_FORMAT_INVALID".equals(tL_error7.text)) {
                        i7 = 2;
                    }
                    i7 = 1;
                }
                if (i7 != 0) {
                    try {
                        h60Var2.run();
                        i10 = 1;
                    } catch (Exception e12) {
                        i10 = 1;
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    if (i7 == i10) {
                        launchActivity4.F0(org.telegram.ui.Components.c5.K(launchActivity4, org.telegram.messenger.hd.N0(2131743947, null), org.telegram.messenger.hd.N0(2131743930, null)));
                        return;
                    } else {
                        launchActivity4.F0(org.telegram.ui.Components.c5.K(launchActivity4, org.telegram.messenger.hd.N0(2131743947, null), org.telegram.messenger.hd.N0(2131743931, null)));
                        return;
                    }
                }
                return;
            case 16:
                s90 s90Var = (s90) obj5;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                TLObject tLObject9 = (TLObject) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str14 = (String) obj3;
                int i21 = s90Var.f51979b;
                LaunchActivity launchActivity5 = s90Var.f51978a;
                if (tL_error8 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error8.text)) {
                        d = s90.d();
                        i11 = 2131747201;
                    } else {
                        d = s90.d();
                        i11 = 2131747202;
                    }
                    org.telegram.messenger.f3.o(null, i11, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject9 instanceof TLRPC.TL_payments_paymentFormStars) {
                        bi.q8 q8Var = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        di.y8.y(i21, false).W(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject9, new o90(s90Var, 1), new m70(q8Var, 1));
                        return;
                    }
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        org.telegram.messenger.np.u1(i21).f4(paymentForm.users, false);
                        ml0Var = new ml0(paymentForm, null, str14, LaunchActivity.T());
                    } else if (tLObject9 instanceof TLRPC.PaymentReceipt) {
                        ml0Var = new ml0((TLRPC.PaymentReceipt) tLObject9);
                    } else {
                        ml0Var = null;
                    }
                    if (ml0Var != null) {
                        bi.q8 q8Var2 = launchActivity5.Y0;
                        if (q8Var2 != null) {
                            launchActivity5.Y0 = null;
                            ml0Var.f49900a1 = new ve(10, q8Var2);
                        }
                        s90Var.u(ml0Var, false);
                    }
                }
                s90Var.c();
                return;
            case 17:
                de0.b0((de0) obj5, (TLRPC.TL_error) obj, (String) obj3, (String) obj4, (String) obj2);
                return;
            case 18:
                TLObject tLObject10 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj2;
                de0 de0Var = ((pb0) obj5).f50834a0;
                if (tLObject10 instanceof TLRPC.TL_auth_sentCode) {
                    de0Var.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject10, true);
                    return;
                } else if (tL_error9 != null && tL_error9.text != null) {
                    i12 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    org.telegram.ui.Components.c5.c0(i12, tL_error9, de0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 19:
                sc0 sc0Var = (sc0) obj5;
                TLObject tLObject11 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj2;
                de0 de0Var2 = sc0Var.F;
                de0Var2.C1(false, true);
                sc0Var.f52015r = false;
                if (tLObject11 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject11;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    de0Var2.M1(13, true, bundle2, false);
                    return;
                }
                String str15 = tL_error10.text;
                if (str15 != null) {
                    if (str15.contains("EMAIL_INVALID")) {
                        sc0Var.n();
                        return;
                    } else if (tL_error10.text.contains("EMAIL_NOT_ALLOWED")) {
                        de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131751188, null));
                        return;
                    } else if (tL_error10.text.contains("PHONE_PASSWORD_FLOOD")) {
                        de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, "FloodWait"));
                        return;
                    } else if (tL_error10.text.contains("PHONE_NUMBER_FLOOD")) {
                        de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131747092, "PhoneNumberFlood"));
                        return;
                    } else if (!tL_error10.text.contains("PHONE_CODE_EMPTY") && !tL_error10.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                            de0Var2.M1(0, true, null, true);
                            de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, "CodeExpired"));
                            return;
                        } else if (tL_error10.text.startsWith("FLOOD_WAIT")) {
                            de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, "FloodWait"));
                            return;
                        } else if (tL_error10.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                            org.telegram.ui.Components.c5.c0(i13, tL_error10, de0Var2, sendverifyemailcode, sc0Var.f52018x);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748990, "InvalidCode"));
                        return;
                    }
                }
                return;
            case 20:
                TLObject tLObject12 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj2;
                de0 de0Var3 = ((sc0) obj5).F;
                if ((tLObject12 instanceof TL_account.TL_emailVerified) && de0Var3.G == 3) {
                    de0Var3.finishFragment();
                    de0Var3.f46934e0.run();
                    return;
                } else if (tLObject12 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject12;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    de0Var3.y1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else if (tL_error11 != null) {
                    if (tL_error11.text.contains("EMAIL_NOT_ALLOWED")) {
                        de0Var3.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131751188, null));
                        return;
                    } else if (tL_error11.text.contains("EMAIL_TOKEN_INVALID")) {
                        de0Var3.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131751185, null));
                        return;
                    } else if (tL_error11.code != -1000) {
                        i14 = ((org.telegram.ui.ActionBar.g2) de0Var3).currentAccount;
                        org.telegram.ui.Components.c5.c0(i14, tL_error11, de0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 21:
                final ld0 ld0Var = (ld0) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj;
                de0 de0Var4 = ld0Var.f49601w;
                ld0Var.f49594b.setLoading(false);
                if (tLObject13 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject13;
                    de0Var4.getMessagesController().f4(paymentForm2.users, false);
                    ml0 ml0Var2 = new ml0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, de0Var4, true);
                    ml0Var2.W0 = true;
                    ml0Var2.f49908d1 = new org.telegram.messenger.y10() {
                        @Override
                        public final void a(Object obj7) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj7;
                                    final ld0 ld0Var2 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    ld0 ld0Var3 = ld0Var2;
                                                    if (!ld0Var3.f49597f) {
                                                        ld0Var3.f49597f = true;
                                                        ld0Var3.h = str16;
                                                        ld0Var3.f49598n = str17;
                                                        ld0Var3.f49599r = j3;
                                                        ld0Var3.f49594b.setLoading(true);
                                                        ld0Var3.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str18 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str19 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    ld0 ld0Var4 = ld0Var2;
                                                    if (!ld0Var4.f49597f) {
                                                        ld0Var4.f49597f = true;
                                                        ld0Var4.h = str18;
                                                        ld0Var4.f49598n = str19;
                                                        ld0Var4.f49599r = j10;
                                                        ld0Var4.f49594b.setLoading(true);
                                                        ld0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj7;
                                    final ld0 ld0Var3 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    ld0 ld0Var32 = ld0Var3;
                                                    if (!ld0Var32.f49597f) {
                                                        ld0Var32.f49597f = true;
                                                        ld0Var32.h = str16;
                                                        ld0Var32.f49598n = str17;
                                                        ld0Var32.f49599r = j3;
                                                        ld0Var32.f49594b.setLoading(true);
                                                        ld0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str18 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str19 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    ld0 ld0Var4 = ld0Var3;
                                                    if (!ld0Var4.f49597f) {
                                                        ld0Var4.f49597f = true;
                                                        ld0Var4.h = str18;
                                                        ld0Var4.f49598n = str19;
                                                        ld0Var4.f49599r = j10;
                                                        ld0Var4.f49594b.setLoading(true);
                                                        ld0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    };
                    ml0Var2.f49911e1 = new org.telegram.messenger.y10() {
                        @Override
                        public final void a(Object obj7) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj7;
                                    final ld0 ld0Var2 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    ld0 ld0Var32 = ld0Var2;
                                                    if (!ld0Var32.f49597f) {
                                                        ld0Var32.f49597f = true;
                                                        ld0Var32.h = str16;
                                                        ld0Var32.f49598n = str17;
                                                        ld0Var32.f49599r = j3;
                                                        ld0Var32.f49594b.setLoading(true);
                                                        ld0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str18 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str19 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    ld0 ld0Var4 = ld0Var2;
                                                    if (!ld0Var4.f49597f) {
                                                        ld0Var4.f49597f = true;
                                                        ld0Var4.h = str18;
                                                        ld0Var4.f49598n = str19;
                                                        ld0Var4.f49599r = j10;
                                                        ld0Var4.f49594b.setLoading(true);
                                                        ld0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj7;
                                    final ld0 ld0Var3 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    ld0 ld0Var32 = ld0Var3;
                                                    if (!ld0Var32.f49597f) {
                                                        ld0Var32.f49597f = true;
                                                        ld0Var32.h = str16;
                                                        ld0Var32.f49598n = str17;
                                                        ld0Var32.f49599r = j3;
                                                        ld0Var32.f49594b.setLoading(true);
                                                        ld0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str18 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str19 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    ld0 ld0Var4 = ld0Var3;
                                                    if (!ld0Var4.f49597f) {
                                                        ld0Var4.f49597f = true;
                                                        ld0Var4.h = str18;
                                                        ld0Var4.f49598n = str19;
                                                        ld0Var4.f49599r = j10;
                                                        ld0Var4.f49594b.setLoading(true);
                                                        ld0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    };
                    ml0Var2.f49914f1 = new o00(ld0Var, 1);
                    de0Var4.presentFragment(ml0Var2);
                    return;
                } else if (tL_error12 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error12.text)) {
                        org.telegram.messenger.g0.g3(new hd0(ld0Var, 2));
                        return;
                    }
                    String str16 = tL_error12.text;
                    ld0Var.f49596e = str16;
                    new org.telegram.ui.Components.lc(de0Var4.f46927a0, null).H(2131624012, org.telegram.messenger.hd.a0(null, null, 2131743633, str16));
                    return;
                } else {
                    new org.telegram.ui.Components.lc(de0Var4.f46927a0, null).H(2131624012, org.telegram.messenger.hd.N0(2131743634, null));
                    return;
                }
            case 22:
                og0 og0Var = (og0) obj5;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                mg.b bVar = (mg.b) obj4;
                String str17 = (String) obj3;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj2;
                og0Var.E = true;
                if (tL_error13 == null && bVar != null) {
                    og0Var.f50596w.l(str17, bVar);
                    o41 o41Var = og0Var.f50594r;
                    o41Var.f50475e = bVar;
                    o41Var.f50474c = tL_loadAsyncGraph.f28667x;
                    og0Var.m0();
                    return;
                }
                og0Var.m0();
                return;
            case 23:
                fh0 fh0Var = (fh0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj3;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj4;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj2;
                org.telegram.ui.ActionBar.g2 g2Var2 = fh0Var.G1;
                fh0Var.B1 = false;
                if (tL_contacts_importedContacts != null) {
                    if (!tL_contacts_importedContacts.users.isEmpty()) {
                        org.telegram.messenger.np.u1(fh0Var.f30173a).f4(tL_contacts_importedContacts.users, false);
                        org.telegram.messenger.np.u1(fh0Var.f30173a).G3(tL_contacts_importedContacts.users.get(0), null, g2Var2, 1);
                        fh0Var.dismiss();
                        return;
                    } else if (g2Var2.getParentActivity() != null) {
                        org.telegram.messenger.g0.X3(fh0Var.R1, true, 0.5f, true, true);
                        org.telegram.messenger.g0.X3(fh0Var.S1, false, 0.5f, true, true);
                        org.telegram.ui.Components.c5.u(g2Var2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.messenger.g0.X3(fh0Var.R1, true, 0.5f, true, true);
                org.telegram.messenger.g0.X3(fh0Var.S1, false, 0.5f, true, true);
                org.telegram.ui.Components.c5.c0(fh0Var.f30173a, tL_error14, g2Var2, tL_contacts_importContacts, new Object[0]);
                return;
            case 24:
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                hf0 hf0Var = (hf0) obj3;
                k8.a aVar = (k8.a) obj4;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj2;
                hk0 hk0Var = ((qj0) obj5).f51295a;
                if (tL_error15 == null) {
                    ((mj0) hk0Var.C1).c(hk0Var.F, (String) hk0Var.f48460t1.get("email"), null, null, null, null, null, null, null, null, hf0Var, aVar);
                    return;
                }
                org.telegram.ui.Components.c5.c0(hk0.M0(hk0Var), tL_error15, hk0Var, verifyemail2, new Object[0]);
                aVar.d(null, null);
                return;
            case 25:
                dk0 dk0Var = (dk0) obj5;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject14 = (TLObject) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj2;
                hk0 hk0Var2 = dk0Var.R;
                dk0Var.K = false;
                if (tL_error16 == null) {
                    hk0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject14, true);
                } else {
                    org.telegram.ui.ActionBar.t1 c02 = org.telegram.ui.Components.c5.c0(hk0.n0(hk0Var2), tL_error16, hk0Var2, tL_auth_resendCode2, new Object[0]);
                    if (c02 != null && tL_error16.text.contains("PHONE_CODE_EXPIRED")) {
                        c02.f30038n0 = new zj0(dk0Var, 0);
                    }
                }
                hk0Var2.B1();
                return;
            case 26:
                ml0.k0((ml0) obj5, (TLRPC.TL_error) obj, (TLObject) obj4, (String) obj3, (TL_account.getPassword) obj2);
                return;
            case 27:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                Integer num = (Integer) obj4;
                uq0 uq0Var2 = (uq0) obj2;
                PhotoViewer photoViewer = ((aq0) obj5).f45671r;
                photoViewer.f43341p4 = null;
                qq0 qq0Var = photoViewer.f43253f0;
                if (qq0Var != null && photoViewer.f43271h0 != null) {
                    qq0Var.setLayerType(0, null);
                    photoViewer.f43324n4 = 0;
                    photoViewer.D1();
                    photoViewer.o4 = 0L;
                    photoViewer.H1 = null;
                    photoViewer.F1.f21878a = false;
                    photoViewer.I1 = null;
                    photoViewer.G1.f21878a = false;
                    photoViewer.B2();
                    photoViewer.x2();
                    photoViewer.f43253f0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    wq0 wq0Var = photoViewer.f43350q4;
                    if (wq0Var != null) {
                        z12 = true;
                        wq0Var.f53497a.O0(true, true);
                    } else {
                        z12 = true;
                    }
                    wq0 wq0Var2 = photoViewer.f43360r4;
                    if (wq0Var2 != null && !wq0Var2.f53513s) {
                        wq0Var2.f53497a.O0(false, z12);
                    }
                    if (arrayList11 != null && (i15 = photoViewer.d2) != 3 && i15 != z12 && ((uq0Var = photoViewer.d) == null || !uq0Var.P())) {
                        photoViewer.Q1();
                    }
                    org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
                    if (i61Var != null && i61Var.d0() && photoViewer.f43367s1 && !photoViewer.f43269g7.isEmpty()) {
                        PhotoViewer.S(photoViewer, photoViewer.G2.S());
                        PhotoViewer.R(photoViewer, true);
                    }
                    if (photoViewer.f43378t4) {
                        PhotoViewer.T(photoViewer, num.intValue());
                    }
                    if (uq0Var2 != null) {
                        uq0Var2.d();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                a();
                return;
            default:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error17 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity = ((kt0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(privacyControlActivity).Q(2131623990, 36, org.telegram.messenger.hd.N0(2131746662, null));
                    Q.f35527j = 5000;
                    Q.j();
                    return;
                }
                if (userFull2 != null) {
                    if (tL_birthday2 == null) {
                        userFull2.flags2 &= -33;
                    } else {
                        userFull2.flags2 |= 32;
                    }
                    userFull2.birthday = tL_birthday2;
                    privacyControlActivity.getMessagesStorage().j2(userFull2, false);
                }
                if (tL_error17 != null && (str2 = tL_error17.text) != null && str2.startsWith("FLOOD_WAIT_")) {
                    if (privacyControlActivity.getParentActivity() != null) {
                        Activity parentActivity = privacyControlActivity.getParentActivity();
                        h6Var = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, h6Var);
                        String N0 = org.telegram.messenger.hd.N0(2131746658, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                        t1Var2.S = N0;
                        t1Var2.U = org.telegram.messenger.hd.N0(2131746659, null);
                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                        privacyControlActivity.showDialog(t1Var2);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.f3.n(null, 2131743634, org.telegram.ui.Components.lc.b0(privacyControlActivity), 2131624012, 36);
                return;
        }
    }

    public wn(Object obj, Object obj2, Object obj3, Object obj4, String str, int i7) {
        this.f53459a = i7;
        this.f53461c = obj;
        this.f53460b = obj2;
        this.f53462e = obj3;
        this.f53463f = obj4;
        this.d = str;
    }

    public wn(Object obj, Object obj2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error, int i7) {
        this.f53459a = i7;
        this.f53461c = obj;
        this.d = obj2;
        this.f53462e = tLObject;
        this.f53463f = tLObject2;
        this.f53460b = tL_error;
    }

    public wn(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i7) {
        this.f53459a = i7;
        this.f53461c = obj;
        this.f53462e = tLObject;
        this.d = obj2;
        this.f53463f = obj3;
        this.f53460b = tL_error;
    }

    public wn(Object obj, TLRPC.TL_error tL_error, Object obj2, Serializable serializable, TLObject tLObject, int i7) {
        this.f53459a = i7;
        this.f53461c = obj;
        this.f53460b = tL_error;
        this.f53462e = obj2;
        this.d = serializable;
        this.f53463f = tLObject;
    }

    public wn(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i7) {
        this.f53459a = i7;
        this.f53461c = obj;
        this.f53460b = tL_error;
        this.d = obj2;
        this.f53462e = obj3;
        this.f53463f = obj4;
    }

    public wn(org.telegram.ui.Components.iu0 iu0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLObject tLObject2, int i7) {
        this.f53459a = i7;
        this.f53461c = iu0Var;
        this.f53462e = tLObject;
        this.d = bundle;
        this.f53460b = tL_error;
        this.f53463f = tLObject2;
    }

    public wn(LaunchActivity launchActivity, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error) {
        this.f53459a = 14;
        this.f53461c = launchActivity;
        this.f53462e = tLObject;
        this.f53463f = tL_messages_requestUrlAuth;
        this.d = str;
        this.f53460b = tL_error;
    }

    public wn(fh0 fh0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f53459a = 23;
        this.f53461c = fh0Var;
        this.d = tL_contacts_importedContacts;
        this.f53462e = tL_inputPhoneContact;
        this.f53460b = tL_error;
        this.f53463f = tL_contacts_importContacts;
    }
}
