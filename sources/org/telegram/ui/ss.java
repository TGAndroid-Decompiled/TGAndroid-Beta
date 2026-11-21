package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class ss implements Runnable {
    public final int f52114a;
    public final Object f52115b;
    public final Object f52116c;

    public ss(int i7, Object obj, Object obj2) {
        this.f52114a = i7;
        this.f52115b = obj;
        this.f52116c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ek0 ek0Var;
        int i7;
        boolean z10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.f52114a;
        long j3 = 0;
        int i11 = 0;
        Object obj = this.f52116c;
        Object obj2 = this.f52115b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ek ekVar = (org.telegram.ui.Components.ek) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new ss(1, ekVar, new ArrayList()));
                    return;
                }
                String M3 = org.telegram.messenger.g0.M3(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = ekVar.f34842f;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    ps psVar = (ps) obj3;
                    String str = psVar.f50965a;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String lowerCase2 = str.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.g0.M3(psVar.f50965a).toLowerCase();
                    String str3 = psVar.f50966b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase4 = str3.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.g0.M3(psVar.f50966b).toLowerCase();
                    String str4 = psVar.f50967c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = "+".concat(str4);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(M3) || lowerCase3.contains(" ".concat(M3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(M3) || lowerCase5.contains(" ".concat(M3)) || str4.startsWith(lowerCase) || str2.startsWith(lowerCase)) {
                        arrayList.add(psVar);
                    }
                }
                org.telegram.messenger.g0.g3(new ss(1, ekVar, arrayList));
                return;
            case 1:
                org.telegram.ui.Components.ek ekVar2 = (org.telegram.ui.Components.ek) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                us usVar = (us) ekVar2.f34843n;
                if (usVar.f52623f) {
                    ekVar2.f34841e = arrayList3;
                    if (usVar.f52622e && (ek0Var = usVar.f52619a) != null) {
                        v4.i0 adapter = ek0Var.getAdapter();
                        org.telegram.ui.Components.ek ekVar3 = usVar.d;
                        if (adapter != ekVar3) {
                            usVar.f52619a.setAdapter(ekVar3);
                            usVar.f52619a.setFastScrollVisible(false);
                        }
                    }
                    ekVar2.f();
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.mp.u1(((ws) obj2).f30170a).V3((TLRPC.Updates) obj, false);
                return;
            case 3:
                ut utVar = (ut) obj2;
                a0.h hVar = (a0.h) obj;
                vt vtVar = utVar.V2;
                Activity parentActivity = vtVar.getParentActivity();
                kg.n1 n1Var = vtVar.f34684b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f28435id;
                }
                org.telegram.ui.Components.lc.x(parentActivity, n1Var, m10, j3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, utVar.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, utVar.J0)).j();
                return;
            case 4:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                xt xtVar = (xt) ((a7.d) obj2).f304c;
                xtVar.a();
                org.telegram.ui.Cells.n8 n8Var = xtVar.f53952e;
                xtVar.c();
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29618q6, false);
                org.telegram.ui.Components.oh0 oh0Var = xtVar.d;
                oh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                if (org.telegram.ui.ActionBar.m6.k1()) {
                    n8Var.p(org.telegram.messenger.gd.N0(2131745270, null), oh0Var, true);
                    n8Var.f31171x += 2;
                } else {
                    n8Var.p(org.telegram.messenger.gd.N0(2131745271, null), oh0Var, true);
                    n8Var.f31171x += 2;
                }
                org.telegram.ui.ActionBar.m6.M1(g2Var);
                return;
            case 5:
                ki.s2.n(((cx) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 6:
                cx cxVar = (cx) obj2;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj;
                org.telegram.ui.ActionBar.w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    w2VarArr[0] = null;
                }
                org.telegram.messenger.g0.h3(new gu(cxVar, 18), 300L);
                return;
            case 7:
                cx cxVar2 = (cx) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.messenger.mp messagesController = cxVar2.getMessagesController();
                if (cxVar2.Y2 == 0 && cxVar2.f46694a3 == 0) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                messagesController.e(arrayList4, i7, -1, null, 0L);
                return;
            case 8:
                CharSequence charSequence = (CharSequence) obj;
                cx cxVar3 = ((hv) obj2).f48529a;
                cxVar3.J2 = null;
                org.telegram.ui.Components.ep0 ep0Var = cxVar3.I2;
                if (ep0Var != null && ep0Var.h) {
                    ep0Var.e(charSequence, false);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.g2[] g2VarArr = (org.telegram.ui.ActionBar.g2[]) obj;
                ((cw) obj2).f46687b.removeSelfFromStack();
                if (g2VarArr[1] != null) {
                    g2VarArr[0].removeSelfFromStack();
                    g2VarArr[1].finishFragment();
                    return;
                }
                g2VarArr[0].finishFragment();
                return;
            case 10:
                ArrayList arrayList5 = (ArrayList) obj;
                cx cxVar4 = ((tw) obj2).f52401b;
                if (cxVar4.I4(cxVar4.f46719f0[0]) && !cxVar4.U1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cxVar4.U4(true, true);
                cxVar4.z3();
                if (z10 && cxVar4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList5.get(i12)).f28435id));
                    }
                    boolean z11 = false;
                    for (int size2 = cxVar4.T1.size() - 1; size2 >= 0; size2--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar4.T1.get(size2);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.f28435id)) && cxVar4.H4(cxVar4.f46719f0[0], dialog)) {
                            cxVar4.T1.remove(size2);
                            z11 = true;
                        }
                    }
                    if (z11) {
                        cxVar4.f46719f0[0].q(false);
                    }
                }
                while (i11 < arrayList5.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList5.get(i11)).f28435id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList5.get(i11);
                    if (cxVar4.getMessagesController().y2(j10) || cxVar4.getMessagesController().F2(j10)) {
                        org.telegram.messenger.mp messagesController2 = cxVar4.getMessagesController();
                        org.telegram.messenger.tr messagesStorage = messagesController2.getMessagesStorage();
                        org.telegram.messenger.kl klVar = new org.telegram.messenger.kl(messagesController2, j10);
                        org.telegram.messenger.q5 q5Var = messagesStorage.f27080a;
                        org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j10, klVar, 5);
                        j10 = j10;
                        q5Var.c(d4Var);
                    }
                    cxVar4.getMessagesController().v3(j10, 0L);
                    org.telegram.messenger.mp messagesController3 = cxVar4.getMessagesController();
                    int i13 = dialog2.top_message;
                    messagesController3.q3(j10, i13, i13, dialog2.last_message_date, false, 0L, 0, true, 0);
                    i11++;
                }
                return;
            case 11:
                ((tw) obj2).d((org.telegram.messenger.ro) obj);
                return;
            case 12:
                nx nxVar = (nx) obj2;
                bn bnVar = nxVar.f50332a;
                org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(bnVar.getParentActivity(), nxVar.f50332a, org.telegram.messenger.fj.j1(((org.telegram.messenger.fj) obj).f23993k), null, bnVar.f45946a0, bnVar.getResourceProvider());
                boolean V9 = bnVar.V9();
                kw0Var.f30191i0 = V9;
                kw0Var.f30198n = V9;
                bnVar.showDialog(kw0Var);
                return;
            case 13:
                iy iyVar = (iy) obj2;
                iyVar.getClass();
                ((org.telegram.ui.ActionBar.t1) obj).dismiss();
                jy jyVar = iyVar.F;
                ky kyVar = jyVar.f49131c;
                org.telegram.messenger.x10 x10Var = kyVar.f49416x;
                if (x10Var != null) {
                    x10Var.a(kyVar.d);
                }
                jyVar.f49131c.finishFragment();
                return;
            case 14:
                kz kzVar = (kz) obj2;
                ky kyVar2 = new ky(kzVar.f49428r, ((cz) obj).f46837m);
                kyVar2.f49417y = new oy(kzVar, 1);
                kyVar2.f49416x = new oy(kzVar, 2);
                kzVar.presentFragment(kyVar2);
                return;
            case 15:
                kz kzVar2 = (kz) obj2;
                kzVar2.h = false;
                kzVar2.f49429s = false;
                kzVar2.f49428r.f26705g = kzVar2.E;
                kzVar2.o0(true);
                kzVar2.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 16:
                kz kzVar3 = (kz) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = kzVar3.M;
                kzVar3.O = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    kzVar3.getMessagesController().Z3(tL_chatlists_exportedInvites.chats, false);
                    kzVar3.getMessagesController().f4(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    kzVar3.C0();
                }
                kzVar3.N = 0;
                return;
            case 17:
                kz kzVar4 = (kz) obj2;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                org.telegram.messenger.ro roVar = kzVar4.f49428r;
                if (t1Var != null) {
                    try {
                        t1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                kzVar4.getMessagesController().p4(roVar);
                org.telegram.messenger.tr messagesStorage2 = kzVar4.getMessagesStorage();
                messagesStorage2.f27080a.c(new org.telegram.messenger.rq(3, messagesStorage2, roVar));
                kzVar4.finishFragment();
                return;
            case 18:
                kz kzVar5 = (kz) obj2;
                kzVar5.getClass();
                kzVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 19:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f43100y) {
                    filtersSetupActivity.f43100y = true;
                    filtersSetupActivity.f0(new d00(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 20:
                FiltersSetupActivity filtersSetupActivity2 = ((j00) obj2).f48853e;
                filtersSetupActivity2.getMessagesController().W0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 21:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((f40) obj2).X3;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.y) arrayList8.get(i14)).f41491x != null) {
                        arrayList7.remove(((org.telegram.ui.Components.voip.y) arrayList8.get(i14)).f41491x);
                    }
                }
                while (i11 < arrayList7.size()) {
                    org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList7.get(i11);
                    if (u3Var.f27145a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, u3Var.f27146b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(u3Var.f27145a, u3Var.f27146b);
                    }
                    i11++;
                }
                return;
            case 22:
                f40 f40Var = (f40) obj2;
                org.telegram.messenger.ks.f(f40Var.f47522o1.f23246a).k(75, 6, ((TLRPC.TL_error) obj).text);
                f40Var.dismiss();
                return;
            case 23:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.n2) obj).f41216e.getBitmap(100, 100);
                    if (bitmap != null) {
                        org.telegram.messenger.g0.g3(new ss(24, m4Var, c8.j0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 24:
                ((f40) ((m4) obj2).f49753b).P2.setNewColors((int[]) obj);
                return;
            case 25:
                n50.a0((n50) obj2, (TLRPC.TL_error) obj);
                return;
            case 26:
                j50 j50Var = (j50) obj2;
                String str5 = (String) obj;
                k50 k50Var = j50Var.f48896a;
                k50Var.f49201e = str5;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str5;
                k50Var.f49200c = k50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new e00(2, j50Var, str5), 66);
                return;
            case 27:
                TLObject tLObject2 = (TLObject) obj;
                k50 k50Var2 = ((j50) obj2).f48896a;
                if (tLObject2 != null) {
                    n50.f0(k50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    n50.f0(k50Var2.h, null);
                    return;
                }
            case 28:
                m50 m50Var = (m50) obj2;
                String str6 = (String) obj;
                m50Var.h = str6;
                n50 n50Var = m50Var.f49766r;
                if (n50Var.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f28543q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f28545q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                m50Var.f49765n = n50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(m50Var, str6, str6, 14), 66);
                return;
            default:
                org.telegram.messenger.g0.h3(new oi.t(28, (b60) obj2, (org.telegram.messenger.t2) obj), 150L);
                return;
        }
    }

    public ss(ut utVar, a0.h hVar, int i7) {
        this.f52114a = 3;
        this.f52115b = utVar;
        this.f52116c = hVar;
    }
}
