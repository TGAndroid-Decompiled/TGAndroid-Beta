package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class xs implements Runnable {
    public final int f43641a;
    public final Object f43642b;
    public final Object f43643c;

    public xs(int i10, Object obj, Object obj2) {
        this.f43641a = i10;
        this.f43642b = obj;
        this.f43643c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.tk0 tk0Var;
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f43641a;
        long j10 = 0;
        int i12 = 0;
        Object obj = this.f43643c;
        Object obj2 = this.f43642b;
        switch (i11) {
            case 0:
                org.telegram.ui.Components.tk0 tk0Var2 = (org.telegram.ui.Components.tk0) obj2;
                if (tk0Var2 != null) {
                    tk0Var2.setOnItemClickListener((org.telegram.ui.Components.gk0) obj);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.pj pjVar = (org.telegram.ui.Components.pj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new xs(2, pjVar, new ArrayList()));
                    return;
                }
                String N3 = org.telegram.messenger.i0.N3(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = pjVar.f29370f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    nt ntVar = (nt) obj3;
                    String str = ntVar.f40047a;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String lowerCase2 = str.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.i0.N3(ntVar.f40047a).toLowerCase();
                    String str3 = ntVar.f40048b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase4 = str3.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.i0.N3(ntVar.f40048b).toLowerCase();
                    String str4 = ntVar.f40049c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = "+".concat(str4);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(N3) || lowerCase3.contains(" ".concat(N3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(N3) || lowerCase5.contains(" ".concat(N3)) || str4.startsWith(lowerCase) || str2.startsWith(lowerCase)) {
                        arrayList.add(ntVar);
                    }
                }
                org.telegram.messenger.i0.g3(new xs(2, pjVar, arrayList));
                return;
            case 2:
                org.telegram.ui.Components.pj pjVar2 = (org.telegram.ui.Components.pj) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                rt rtVar = (rt) pjVar2.f29371n;
                if (rtVar.f41283f) {
                    pjVar2.e = arrayList3;
                    if (rtVar.e && (tk0Var = rtVar.f41280a) != null) {
                        s4.g0 adapter = tk0Var.getAdapter();
                        org.telegram.ui.Components.pj pjVar3 = rtVar.d;
                        if (adapter != pjVar3) {
                            rtVar.f41280a.setAdapter(pjVar3);
                            rtVar.f41280a.setFastScrollVisible(false);
                        }
                    }
                    pjVar2.f();
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.vp.r1(((ut) obj2).f21583a).L3((TLRPC.Updates) obj, false);
                return;
            case 4:
                ru ruVar = (ru) obj2;
                a0.h hVar = (a0.h) obj;
                su suVar = ruVar.R2;
                Activity parentActivity = suVar.getParentActivity();
                ag.t2 t2Var = suVar.f29838b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f19797id;
                }
                org.telegram.ui.Components.cc.x(parentActivity, t2Var, m10, j10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, ruVar.I0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, ruVar.I0)).j();
                return;
            case 5:
                ay ayVar = (ay) obj2;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) obj;
                org.telegram.ui.ActionBar.z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                    z2VarArr[0] = null;
                }
                org.telegram.messenger.i0.h3(new fv(ayVar, 10), 300L);
                return;
            case 6:
                ay ayVar2 = (ay) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.messenger.vp messagesController = ayVar2.getMessagesController();
                if (ayVar2.W2 == 0 && ayVar2.Y2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.e(arrayList4, i10, -1, null, 0L);
                return;
            case 7:
                xh.m2.n(((ay) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 8:
                CharSequence charSequence = (CharSequence) obj;
                ay ayVar3 = ((iw) obj2).f38358a;
                ayVar3.H2 = null;
                org.telegram.ui.Components.sp0 sp0Var = ayVar3.G2;
                if (sp0Var != null && sp0Var.h) {
                    sp0Var.e(charSequence, false);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.k2[] k2VarArr = (org.telegram.ui.ActionBar.k2[]) obj;
                ((cx) obj2).f36564b.removeSelfFromStack();
                if (k2VarArr[1] != null) {
                    k2VarArr[0].removeSelfFromStack();
                    k2VarArr[1].finishFragment();
                    return;
                }
                k2VarArr[0].finishFragment();
                return;
            case 10:
                ArrayList arrayList5 = (ArrayList) obj;
                ay ayVar4 = ((rx) obj2).f41307b;
                ayVar4.L4(true, true);
                ayVar4.y3();
                while (i12 < arrayList5.size()) {
                    long j11 = ((TLRPC.Dialog) arrayList5.get(i12)).f19797id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i12);
                    if (ayVar4.getMessagesController().s2(j11) || ayVar4.getMessagesController().y2(j11)) {
                        org.telegram.messenger.vp messagesController2 = ayVar4.getMessagesController();
                        org.telegram.messenger.hs messagesStorage = messagesController2.getMessagesStorage();
                        org.telegram.messenger.vl vlVar = new org.telegram.messenger.vl(messagesController2, j11);
                        org.telegram.messenger.r5 r5Var = messagesStorage.f15938a;
                        org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j11, vlVar, 5);
                        j11 = j11;
                        r5Var.c(d4Var);
                    }
                    ayVar4.getMessagesController().l3(j11, 0L);
                    org.telegram.messenger.vp messagesController3 = ayVar4.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController3.h3(j11, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 11:
                ((rx) obj2).d((org.telegram.messenger.ap) obj);
                return;
            case 12:
                ly lyVar = (ly) obj2;
                un unVar = lyVar.f39426a;
                org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(unVar.getParentActivity(), lyVar.f39426a, org.telegram.messenger.jj.k1(((org.telegram.messenger.jj) obj).f16337k), null, unVar.Z, unVar.getResourceProvider());
                boolean J9 = unVar.J9();
                cx0Var.f21601h0 = J9;
                cx0Var.f21606n = J9;
                unVar.showDialog(cx0Var);
                return;
            case 13:
                gz gzVar = (gz) obj2;
                gzVar.getClass();
                ((org.telegram.ui.ActionBar.x1) obj).dismiss();
                hz hzVar = gzVar.E;
                iz izVar = hzVar.f38061c;
                org.telegram.messenger.q20 q20Var = izVar.f38386x;
                if (q20Var != null) {
                    q20Var.a(izVar.d);
                }
                hzVar.f38061c.finishFragment();
                return;
            case 14:
                i00 i00Var = (i00) obj2;
                iz izVar2 = new iz(i00Var.f38071r, ((a00) obj).f35502m);
                izVar2.f38387y = new lz(i00Var, 1);
                izVar2.f38386x = new lz(i00Var, 2);
                i00Var.presentFragment(izVar2);
                return;
            case 15:
                i00 i00Var2 = (i00) obj2;
                i00Var2.h = false;
                i00Var2.f38072s = false;
                i00Var2.f38071r.f14649g = i00Var2.D;
                i00Var2.n0(true);
                i00Var2.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 16:
                i00 i00Var3 = (i00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = i00Var3.L;
                i00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    i00Var3.getMessagesController().P3(tL_chatlists_exportedInvites.chats, false);
                    i00Var3.getMessagesController().V3(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    i00Var3.B0();
                }
                i00Var3.M = 0;
                return;
            case 17:
                i00 i00Var4 = (i00) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                org.telegram.messenger.ap apVar = i00Var4.f38071r;
                if (x1Var != null) {
                    try {
                        x1Var.dismiss();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                i00Var4.getMessagesController().e4(apVar);
                org.telegram.messenger.hs messagesStorage2 = i00Var4.getMessagesStorage();
                messagesStorage2.f15938a.c(new org.telegram.messenger.oi(29, messagesStorage2, apVar));
                i00Var4.finishFragment();
                return;
            case 18:
                i00 i00Var5 = (i00) obj2;
                i00Var5.getClass();
                i00Var5.r0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 19:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33340y) {
                    filtersSetupActivity.f33340y = true;
                    filtersSetupActivity.e0(new a10(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 20:
                FiltersSetupActivity filtersSetupActivity2 = ((f10) obj2).e;
                filtersSetupActivity2.getMessagesController().V0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 21:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((b50) obj2).P3;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.r) arrayList8.get(i14)).f31630x != null) {
                        arrayList7.remove(((org.telegram.ui.Components.voip.r) arrayList8.get(i14)).f31630x);
                    }
                }
                while (i12 < arrayList7.size()) {
                    org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) arrayList7.get(i12);
                    if (v3Var.f18477a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, v3Var.f18478b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(v3Var.f18477a, v3Var.f18478b);
                    }
                    i12++;
                }
                return;
            case 22:
                b50 b50Var = (b50) obj2;
                org.telegram.messenger.zs.f(b50Var.f36036k1.f14863a).k(75, 6, ((TLRPC.TL_error) obj).text);
                b50Var.dismiss();
                return;
            case 23:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.y1) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        org.telegram.messenger.i0.g3(new xs(24, m4Var, w7.l8.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 24:
                ((b50) ((m4) obj2).f39467b).L2.setNewColors((int[]) obj);
                return;
            case 25:
                k60.Z((k60) obj2, (TLRPC.TL_error) obj);
                return;
            case 26:
                g60 g60Var = (g60) obj2;
                String str5 = (String) obj;
                h60 h60Var = g60Var.f37432a;
                h60Var.e = str5;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str5;
                h60Var.f37764c = h60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new org.telegram.ui.Components.t20(14, g60Var, str5), 66);
                return;
            case 27:
                TLObject tLObject2 = (TLObject) obj;
                h60 h60Var2 = ((g60) obj2).f37432a;
                if (tLObject2 != null) {
                    k60.e0(h60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    k60.e0(h60Var2.h, null);
                    return;
                }
            case 28:
                j60 j60Var = (j60) obj2;
                String str6 = (String) obj;
                j60Var.h = str6;
                k60 k60Var = j60Var.f38439r;
                if (k60Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f19905q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f19907q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                j60Var.f38438n = k60Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(j60Var, str6, str6, 14), 66);
                return;
            default:
                org.telegram.messenger.i0.h3(new h0(5, (z60) obj2, (org.telegram.messenger.w2) obj), 150L);
                return;
        }
    }

    public xs(ru ruVar, a0.h hVar, int i10) {
        this.f43641a = 4;
        this.f43642b = ruVar;
        this.f43643c = hVar;
    }
}
