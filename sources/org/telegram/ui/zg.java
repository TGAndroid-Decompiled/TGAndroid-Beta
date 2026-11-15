package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zg implements Runnable {
    public final int f53931a;
    public final Object f53932b;
    public final Object f53933c;

    public zg(int i7, Object obj, Object obj2) {
        this.f53931a = i7;
        this.f53933c = obj;
        this.f53932b = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String a02;
        TLRPC.Chat M0;
        org.telegram.ui.Components.ud udVar;
        int i7 = this.f53931a;
        org.telegram.messenger.gj gjVar = null;
        boolean z10 = false;
        Object obj = this.f53932b;
        Object obj2 = this.f53933c;
        switch (i7) {
            case 0:
                a0.h hVar = (a0.h) obj2;
                n6 n6Var = (n6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    gjVar = (org.telegram.messenger.gj) ((ArrayList) hVar.n(0)).get(0);
                }
                if (gjVar != null && (message = gjVar.f23819k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i10 = 0; i10 < gjVar.f23819k.media.webpage.attributes.size(); i10++) {
                        TLRPC.WebPageAttribute webPageAttribute = gjVar.f23819k.media.webpage.attributes.get(i10);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            org.telegram.messenger.g0.h3(new zg(n6Var, gjVar.f23819k.media.webpage));
                            return;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new bh(n6Var, 0));
                return;
            case 1:
                ((n6) obj).a(Boolean.TRUE, (TLRPC.WebPage) obj2);
                return;
            case 2:
                an anVar = (an) obj2;
                View view = (View) obj;
                if (anVar.getParentActivity() != null) {
                    anVar.Z0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    anVar.Z0.l(anVar.L);
                    anVar.Z0.s(16.0f);
                    anVar.Z0.r(true);
                    anVar.Z0.u(org.telegram.messenger.hd.M0(2131753102, null));
                    anVar.Z0.o(0.0f, 96.0f);
                    anVar.Z0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - anVar.Wa) - anVar.f45277m1.getHeight()));
                    anVar.f45277m1.addView(anVar.Z0, c8.ja.e(-1, 100, 87));
                    hi.l3 l3Var = anVar.Z0;
                    l3Var.f14570r0 = new yd(anVar, 4);
                    l3Var.w();
                    org.telegram.ui.Components.c30.f33492x.b();
                    return;
                }
                return;
            case 3:
                ((an) obj2).f45277m1.removeView((org.telegram.ui.Components.mi0) obj);
                return;
            case 4:
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj;
                an anVar2 = ((di) obj2).f46382s;
                org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) anVar2.F6[0].get(gjVar2.e1());
                if (gjVar3 != null && gjVar3 != gjVar2) {
                    org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) anVar2.F6[0].get(gjVar2.e1());
                    gjVar4.f23819k.reactions = gjVar2.f23819k.reactions;
                    gjVar2 = gjVar4;
                }
                anVar2.Yc(gjVar2, true);
                ch.l0.f();
                return;
            case 5:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) obj;
                an anVar3 = ((el) ((em) obj2).f46859f).f46852a.R;
                int i11 = an.f45107ld;
                anVar3.pb();
                t0Var.getMessageObject().f23846r = false;
                t0Var.invalidate();
                return;
            case 6:
                hi.l3 l3Var2 = (hi.l3) obj;
                an anVar4 = ((lm) obj2).f49001a;
                anVar4.f45277m1.removeView(l3Var2);
                if (l3Var2 == anVar4.P1) {
                    anVar4.P1 = null;
                    return;
                }
                return;
            case 7:
                Long l10 = (Long) obj;
                an anVar5 = ((fm) obj2).W2.f49001a;
                if (l10.longValue() < 0 && (M0 = anVar5.getMessagesController().M0(Long.valueOf(-l10.longValue()))) != null) {
                    str = M0.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(anVar5);
                if (TextUtils.isEmpty(str)) {
                    a02 = org.telegram.messenger.hd.M0(2131746182, null);
                } else {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131746183, str);
                }
                org.telegram.messenger.i20.t(a02, a03, 2131623990, 36);
                return;
            case 8:
                qn qnVar = (qn) obj2;
                qnVar.getClass();
                qnVar.presentFragment(z41.g0((TLRPC.Chat) obj, true));
                return;
            case 9:
                ho hoVar = (ho) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = hoVar.getMessagesController().h1(hoVar.f47749a0);
                hoVar.f47761i0 = hoVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(hoVar, str2, tL_channels_checkUsername, 6), 2);
                return;
            case 10:
                ho hoVar2 = (ho) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                z10 = (tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                hoVar2.f47754d0 = z10;
                if (!z10 && hoVar2.getUserConfig().q() && !hoVar2.f47756e0 && hoVar2.f47777y != null) {
                    hoVar2.f47756e0 = true;
                    hoVar2.h0();
                    hoVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new rn(hoVar2, 1));
                    return;
                }
                return;
            case 11:
                to.Z((to) obj2, (org.telegram.ui.ActionBar.t1[]) obj);
                return;
            case 12:
                to toVar = (to) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    toVar.getMessagesController().S3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    toVar.f51626w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.t3.c0(next) || org.telegram.messenger.t3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                toVar.f51627x = false;
                toVar.f51628y = true;
                toVar.g0();
                return;
            case 13:
                ((po) obj2).f50320y.d.Q = false;
                ((org.telegram.ui.Components.g70) obj).run();
                return;
            case 14:
                ((po) obj2).f50320y.d.P = false;
                ((org.telegram.ui.Components.h70) obj).run();
                return;
            case 15:
                to toVar2 = ((po) obj2).f50320y.d;
                toVar2.P = false;
                toVar2.Q = false;
                ((Runnable) obj).run();
                return;
            case 16:
                po poVar = (po) obj2;
                poVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                poVar.h = true;
                poVar.f35473c.setChecked(true);
                return;
            case 17:
                qq qqVar = (qq) obj2;
                qqVar.getClass();
                qqVar.getMessagesController().V2(0, ((TLRPC.Updates) obj).chats.get(0).f28051id, true);
                return;
            case 18:
                TLRPC.User user = (TLRPC.User) obj;
                qq qqVar2 = ((fq) obj2).f47167a;
                if (org.telegram.ui.Components.cc.a(qqVar2)) {
                    org.telegram.ui.Components.cc.C(user.first_name, qqVar2).j();
                    return;
                }
                return;
            case 19:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                org.telegram.messenger.e eVar = ((org.telegram.ui.Components.d0) obj2).f33764q2;
                eVar.f23218b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.f23217a).sendRequest(savetone, null);
                return;
            case 20:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) obj;
                qVar.getClass();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.C4(tL_aiComposeTone2.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 21:
                pu0 pu0Var = (pu0) obj;
                if (((boolean[]) obj2)[0]) {
                    pu0Var.run();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) obj2;
                CharSequence charSequence = (CharSequence) obj;
                xbVar.f41639n = true;
                org.telegram.ui.Components.cb cbVar = xbVar.f41631e;
                if (cbVar instanceof org.telegram.ui.Components.db) {
                    org.telegram.ui.Components.eb ebVar = (org.telegram.ui.Components.eb) ((org.telegram.ui.Components.db) cbVar);
                    ebVar.f34556b.setText(charSequence);
                    org.telegram.messenger.g0.U3(ebVar.d, false, false);
                    org.telegram.messenger.g0.U3(ebVar.f34556b, true, false);
                }
                xbVar.i(true);
                return;
            case 23:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 24:
                ((org.telegram.ui.Components.pc) obj2).removeView((hi.l3) obj);
                return;
            case 25:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i12 = ChatActivityEnterView.N6;
                ((org.telegram.ui.Components.uc) obj).run();
                org.telegram.messenger.b6.p(chatActivityEnterView.R, chatActivityEnterView.f32327y3);
                return;
            case 26:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                org.telegram.ui.Components.t4.J(chatActivityEnterView2.f32311w3, chatActivityEnterView2.f32319x3.a(), new org.telegram.ui.Components.cf((org.telegram.ui.Components.yc) obj), chatActivityEnterView2.E4);
                return;
            case 27:
                int i13 = ChatActivityEnterView.N6;
                ((ChatActivityEnterView) obj2).removeView((hi.l3) obj);
                return;
            case 28:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView3.J3 == ((TLRPC.TL_document) obj) && (udVar = chatActivityEnterView3.f32193f1) != null && udVar.getVisibility() == 0) {
                    chatActivityEnterView3.f32270q5 = true;
                    chatActivityEnterView3.g1();
                    chatActivityEnterView3.f32270q5 = false;
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView4.t6 == ((org.telegram.ui.Components.m60) obj)) {
                    chatActivityEnterView4.t6 = null;
                    return;
                }
                return;
        }
    }

    public zg(n6 n6Var, TLRPC.WebPage webPage) {
        this.f53931a = 1;
        this.f53932b = n6Var;
        this.f53933c = webPage;
    }
}
