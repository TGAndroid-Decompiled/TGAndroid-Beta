package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf implements Runnable {
    public final int f49473a;
    public final Object f49474b;
    public final Object f49475c;

    public rf(int i7, Object obj, Object obj2) {
        this.f49473a = i7;
        this.f49474b = obj;
        this.f49475c = obj2;
    }

    @Override
    public final void run() {
        int[] iArr;
        fi.m3 m3Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String a02;
        TLRPC.Chat M0;
        int i7 = this.f49473a;
        org.telegram.messenger.ij ijVar = null;
        boolean z9 = true;
        boolean z10 = false;
        Object obj = this.f49475c;
        Object obj2 = this.f49474b;
        switch (i7) {
            case 0:
                cn.b0((cn) obj2, (org.telegram.ui.Components.l60) obj);
                return;
            case 1:
                cn cnVar = (cn) obj2;
                cnVar.getClass();
                cnVar.presentFragment(ProfileActivity.D4(((TLRPC.User[]) obj)[0].f27105id));
                return;
            case 2:
                ((bi.z2) obj2).a((TLRPC.User) obj);
                return;
            case 3:
                cn cnVar2 = (cn) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                q1Var.getLocationInWindow(new int[2]);
                cnVar2.N1.setTranslationY(q1Var.getTimeY() + ((iArr[1] - m3Var.getTop()) - org.telegram.messenger.g0.L(120.0f)));
                cnVar2.N1.p(0.0f, ((((-org.telegram.messenger.g0.L(16.0f)) + iArr[0]) + q1Var.B9) + q1Var.z9) - (q1Var.C9 / 2.0f));
                cnVar2.N1.w();
                return;
            case 4:
                cn.v1((cn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 5:
                cn cnVar3 = (cn) obj2;
                int[] iArr2 = (int[]) obj;
                cnVar3.getClass();
                if (iArr2[0] != 0) {
                    cnVar3.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 6:
                ((cn) obj2).x8((jg) obj);
                return;
            case 7:
                cn cnVar4 = (cn) obj2;
                Activity parentActivity = cnVar4.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (cnVar4.f44656v8 != 0) {
                    z9 = false;
                }
                vf.c.q(parentActivity, Uri.parse(str2), z9, false);
                return;
            case 8:
                ((cn) obj2).Ma((TLRPC.Chat) obj);
                return;
            case 9:
                cn.W0((cn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 10:
                cn cnVar5 = (cn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131745302, null), cnVar5);
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131753955, null), cnVar5);
                    return;
                } else {
                    org.telegram.ui.Components.v4.t0(tL_error.text, cnVar5);
                    return;
                }
            case 11:
                a0.h hVar = (a0.h) obj2;
                n6 n6Var = (n6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    ijVar = (org.telegram.messenger.ij) ((ArrayList) hVar.n(0)).get(0);
                }
                if (ijVar != null && (message = ijVar.f23262k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i10 = 0; i10 < ijVar.f23262k.media.webpage.attributes.size(); i10++) {
                        TLRPC.WebPageAttribute webPageAttribute = ijVar.f23262k.media.webpage.attributes.get(i10);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            org.telegram.messenger.g0.h3(new rf(12, n6Var, ijVar.f23262k.media.webpage));
                            return;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new dh(n6Var, 0));
                return;
            case 12:
                ((n6) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 13:
                cn cnVar6 = (cn) obj2;
                View view = (View) obj;
                if (cnVar6.getParentActivity() != null) {
                    cnVar6.Y0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    cnVar6.Y0.l(cnVar6.K);
                    cnVar6.Y0.s(16.0f);
                    cnVar6.Y0.r(true);
                    cnVar6.Y0.u(org.telegram.messenger.id.M0(2131753102, null));
                    cnVar6.Y0.o(0.0f, 96.0f);
                    cnVar6.Y0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - cnVar6.Va) - cnVar6.l1.getHeight()));
                    cnVar6.l1.addView(cnVar6.Y0, c8.ha.e(-1, 100, 87));
                    fi.m3 m3Var2 = cnVar6.Y0;
                    m3Var2.f12437q0 = new ae(cnVar6, 3);
                    m3Var2.w();
                    org.telegram.ui.Components.a30.f31696x.b();
                    return;
                }
                return;
            case 14:
                ((cn) obj2).l1.removeView((org.telegram.ui.Components.ji0) obj);
                return;
            case 15:
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj;
                cn cnVar7 = ((fi) obj2).f45728s;
                org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) cnVar7.E6[0].get(ijVar2.e1());
                if (ijVar3 != null && ijVar3 != ijVar2) {
                    org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) cnVar7.E6[0].get(ijVar2.e1());
                    ijVar4.f23262k.reactions = ijVar2.f23262k.reactions;
                    ijVar2 = ijVar4;
                }
                cnVar7.Xc(ijVar2, true);
                ch.k0.f();
                return;
            case 16:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) obj;
                cn cnVar8 = ((gl) ((gm) obj2).f46034f).f46031a.Q;
                int i11 = cn.f44367kd;
                cnVar8.ob();
                t0Var.getMessageObject().f23287r = false;
                t0Var.invalidate();
                return;
            case 17:
                fi.m3 m3Var3 = (fi.m3) obj;
                cn cnVar9 = ((nm) obj2).f48207a;
                cnVar9.l1.removeView(m3Var3);
                if (m3Var3 == cnVar9.O1) {
                    cnVar9.O1 = null;
                    return;
                }
                return;
            case 18:
                Long l10 = (Long) obj;
                cn cnVar10 = ((hm) obj2).S2.f48207a;
                if (l10.longValue() < 0 && (M0 = cnVar10.getMessagesController().M0(Long.valueOf(-l10.longValue()))) != null) {
                    str = M0.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.hc a03 = org.telegram.ui.Components.hc.a0(cnVar10);
                if (TextUtils.isEmpty(str)) {
                    a02 = org.telegram.messenger.id.M0(2131746182, null);
                } else {
                    a02 = org.telegram.messenger.id.a0(null, null, 2131746183, str);
                }
                org.telegram.messenger.camera.q.s(a02, a03, 2131623989, 36);
                return;
            case 19:
                rn rnVar = (rn) obj2;
                rnVar.getClass();
                rnVar.presentFragment(d51.g0((TLRPC.Chat) obj, true));
                return;
            case 20:
                io ioVar = (io) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = ioVar.getMessagesController().h1(ioVar.Z);
                ioVar.f46720h0 = ioVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(ioVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 21:
                io ioVar2 = (io) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z10 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                ioVar2.f46713c0 = z10;
                if (!z10 && ioVar2.getUserConfig().q() && !ioVar2.f46714d0 && ioVar2.f46736y != null) {
                    ioVar2.f46714d0 = true;
                    ioVar2.h0();
                    ioVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new sn(ioVar2, 1));
                    return;
                }
                return;
            case 22:
                uo.Z((uo) obj2, (org.telegram.ui.ActionBar.u1[]) obj);
                return;
            case 23:
                uo uoVar = (uo) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    uoVar.getMessagesController().S3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    uoVar.f50439w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.t3.c0(next) || org.telegram.messenger.t3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                uoVar.f50440x = false;
                uoVar.f50441y = true;
                uoVar.g0();
                return;
            case 24:
                ((qo) obj2).f49109y.d.P = false;
                ((org.telegram.ui.Components.e70) obj).run();
                return;
            case 25:
                ((qo) obj2).f49109y.d.O = false;
                ((org.telegram.ui.Components.f70) obj).run();
                return;
            case 26:
                uo uoVar2 = ((qo) obj2).f49109y.d;
                uoVar2.O = false;
                uoVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 27:
                qo qoVar = (qo) obj2;
                qoVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                qoVar.h = true;
                qoVar.f33892c.setChecked(true);
                return;
            case 28:
                qq qqVar = (qq) obj2;
                qqVar.getClass();
                qqVar.getMessagesController().V2(0, ((TLRPC.Updates) obj).chats.get(0).f26956id, true);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                qq qqVar2 = ((fq) obj2).f45777a;
                if (org.telegram.ui.Components.hc.a(qqVar2)) {
                    org.telegram.ui.Components.hc.C(user.first_name, qqVar2).j();
                    return;
                }
                return;
        }
    }
}
