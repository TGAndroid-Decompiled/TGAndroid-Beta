package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sc implements Runnable {
    public final int f49469a;
    public final Object f49470b;
    public final Object f49471c;

    public sc(int i3, Object obj, Object obj2) {
        this.f49469a = i3;
        this.f49470b = obj;
        this.f49471c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Components.f41 f41Var;
        org.telegram.ui.Components.cz0 cz0Var;
        int[] iArr;
        gi.l3 l3Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String a02;
        TLRPC.Chat M0;
        int i3 = this.f49469a;
        org.telegram.messenger.zi ziVar = null;
        boolean z11 = true;
        boolean z12 = false;
        Object obj = this.f49471c;
        Object obj2 = this.f49470b;
        switch (i3) {
            case 0:
                ad.b0((ad) obj2, (String) obj);
                return;
            case 1:
                ad adVar = (ad) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = adVar.f43737h0;
                adVar.f43735f0 = false;
                if (tLObject != null && adVar.getParentActivity() != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        adVar.M.removeView((View) arrayList.get(i10));
                    }
                    arrayList.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(adVar.getParentActivity(), new tc(adVar, 0), false, 0);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                        if (i11 == tL_messages_chats.chats.size() - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        nVar.a(chat, z10);
                        arrayList.add(nVar);
                        adVar.N.addView(nVar, b8.mf.o(-1, 72));
                    }
                    adVar.n0();
                    return;
                }
                return;
            case 2:
                xd xdVar = (xd) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                xdVar.f51933r0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    xdVar.f51935s0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.l41 l41Var = xdVar.Y0;
                if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
                    f41Var.O(true);
                    return;
                }
                return;
            case 3:
                ((xd) obj2).D((TLRPC.TL_payments_starsRevenueStats) obj);
                return;
            case 4:
                wm wmVar = (wm) obj2;
                org.telegram.ui.Components.cz0[] cz0VarArr = (org.telegram.ui.Components.cz0[]) obj;
                if (!wmVar.Lb && (cz0Var = cz0VarArr[0]) != null) {
                    cz0VarArr[0] = null;
                    if (wmVar.f51548y0 == cz0Var) {
                        wmVar.f51548y0 = null;
                    }
                    org.telegram.messenger.g0.E2(cz0Var);
                    return;
                }
                return;
            case 5:
                wm.a0((wm) obj2, (org.telegram.ui.Components.f60) obj);
                return;
            case 6:
                wm wmVar2 = (wm) obj2;
                wmVar2.getClass();
                wmVar2.presentFragment(ProfileActivity.A4(((TLRPC.User[]) obj)[0].f27150id));
                return;
            case 7:
                wm wmVar3 = (wm) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                q1Var.getLocationInWindow(new int[2]);
                wmVar3.O1.setTranslationY(q1Var.getTimeY() + ((iArr[1] - l3Var.getTop()) - org.telegram.messenger.g0.L(120.0f)));
                wmVar3.O1.p(0.0f, ((((-org.telegram.messenger.g0.L(16.0f)) + iArr[0]) + q1Var.B9) + q1Var.f30167z9) - (q1Var.C9 / 2.0f));
                wmVar3.O1.w();
                return;
            case 8:
                ((ci.o2) obj2).a((TLRPC.User) obj);
                return;
            case 9:
                wm.r1((wm) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 10:
                wm wmVar4 = (wm) obj2;
                int[] iArr2 = (int[]) obj;
                wmVar4.getClass();
                if (iArr2[0] != 0) {
                    wmVar4.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 11:
                ((wm) obj2).w8((lg) obj);
                return;
            case 12:
                wm wmVar5 = (wm) obj2;
                Activity parentActivity = wmVar5.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (wmVar5.f51529w8 != 0) {
                    z11 = false;
                }
                sf.c.q(parentActivity, Uri.parse(str2), z11, false);
                return;
            case 13:
                ((wm) obj2).Ka((TLRPC.Chat) obj);
                return;
            case 14:
                wm.H1((wm) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 15:
                wm wmVar6 = (wm) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.t4.v0(org.telegram.messenger.bd.M0(2131745312, null), wmVar6);
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.t4.v0(org.telegram.messenger.bd.M0(2131753955, null), wmVar6);
                    return;
                } else {
                    org.telegram.ui.Components.t4.v0(tL_error.text, wmVar6);
                    return;
                }
            case 16:
                a0.h hVar = (a0.h) obj2;
                o6 o6Var = (o6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    ziVar = (org.telegram.messenger.zi) ((ArrayList) hVar.n(0)).get(0);
                }
                if (ziVar != null && (message = ziVar.f26868k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i12 = 0; i12 < ziVar.f26868k.media.webpage.attributes.size(); i12++) {
                        TLRPC.WebPageAttribute webPageAttribute = ziVar.f26868k.media.webpage.attributes.get(i12);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            org.telegram.messenger.g0.h3(new sc(17, o6Var, ziVar.f26868k.media.webpage));
                            return;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new xg(o6Var, 0));
                return;
            case 17:
                ((o6) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 18:
                wm wmVar7 = (wm) obj2;
                View view = (View) obj;
                if (wmVar7.getParentActivity() != null) {
                    wmVar7.Z0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    wmVar7.Z0.l(wmVar7.L);
                    wmVar7.Z0.s(16.0f);
                    wmVar7.Z0.r(true);
                    wmVar7.Z0.u(org.telegram.messenger.bd.M0(2131753102, null));
                    wmVar7.Z0.o(0.0f, 96.0f);
                    wmVar7.Z0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - wmVar7.Ua) - wmVar7.m1.getHeight()));
                    wmVar7.m1.addView(wmVar7.Z0, b8.mf.e(-1, 100, 87));
                    gi.l3 l3Var2 = wmVar7.Z0;
                    l3Var2.f13100r0 = new yd(wmVar7, 3);
                    l3Var2.w();
                    org.telegram.ui.Components.v20.f38967x.b();
                    return;
                }
                return;
            case 19:
                ((wm) obj2).m1.removeView((org.telegram.ui.Components.li0) obj);
                return;
            case 20:
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) obj;
                wm wmVar8 = ((zh) obj2).f52682s;
                org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) wmVar8.F6[0].get(ziVar2.f1());
                if (ziVar3 != null && ziVar3 != ziVar2) {
                    org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) wmVar8.F6[0].get(ziVar2.f1());
                    ziVar4.f26868k.reactions = ziVar2.f26868k.reactions;
                    ziVar2 = ziVar4;
                }
                wmVar8.Uc(ziVar2, true);
                dh.j0.f();
                return;
            case 21:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) obj;
                wm wmVar9 = ((al) ((am) obj2).f43797f).f43794a.R;
                int i13 = wm.f51227jd;
                wmVar9.lb();
                t0Var.getMessageObject().f26893r = false;
                t0Var.invalidate();
                return;
            case 22:
                gi.l3 l3Var3 = (gi.l3) obj;
                wm wmVar10 = ((hm) obj2).f45934a;
                wmVar10.m1.removeView(l3Var3);
                if (l3Var3 == wmVar10.P1) {
                    wmVar10.P1 = null;
                    return;
                }
                return;
            case 23:
                Long l10 = (Long) obj;
                wm wmVar11 = ((bm) obj2).T2.f45934a;
                if (l10.longValue() < 0 && (M0 = wmVar11.getMessagesController().M0(Long.valueOf(-l10.longValue()))) != null) {
                    str = M0.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.fc a03 = org.telegram.ui.Components.fc.a0(wmVar11);
                if (TextUtils.isEmpty(str)) {
                    a02 = org.telegram.messenger.bd.M0(2131746192, null);
                } else {
                    a02 = org.telegram.messenger.bd.a0(null, null, 2131746193, str);
                }
                org.telegram.messenger.camera.q.s(a02, a03, 2131623989, 36);
                return;
            case 24:
                ln lnVar = (ln) obj2;
                lnVar.getClass();
                lnVar.presentFragment(r41.g0((TLRPC.Chat) obj, true));
                return;
            case 25:
                bo boVar = (bo) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = boVar.getMessagesController().h1(boVar.f44089a0);
                boVar.f44101i0 = boVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new y9(boVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 26:
                bo boVar2 = (bo) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z12 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                boVar2.f44094d0 = z12;
                if (!z12 && boVar2.getUserConfig().q() && !boVar2.f44096e0 && boVar2.f44117y != null) {
                    boVar2.f44096e0 = true;
                    boVar2.h0();
                    boVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new mn(boVar2, 1));
                    return;
                }
                return;
            case 27:
                qo.Z((qo) obj2, (org.telegram.ui.ActionBar.s1[]) obj);
                return;
            case 28:
                qo qoVar = (qo) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    qoVar.getMessagesController().S3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    qoVar.f48928w = arrayList2;
                    Iterator<TLRPC.Chat> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.t3.c0(next) || org.telegram.messenger.t3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                qoVar.f48929x = false;
                qoVar.f48930y = true;
                qoVar.g0();
                return;
            default:
                ((mo) obj2).f47718y.d.Q = false;
                ((org.telegram.ui.Components.z60) obj).run();
                return;
        }
    }
}
