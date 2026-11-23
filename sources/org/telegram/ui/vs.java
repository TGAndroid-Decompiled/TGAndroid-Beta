package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class vs implements Runnable {
    public final int f52851a;
    public final Object f52852b;
    public final Object f52853c;

    public vs(int i7, Object obj, Object obj2) {
        this.f52851a = i7;
        this.f52852b = obj;
        this.f52853c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        boolean z10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.f52851a;
        long j3 = 0;
        int i11 = 0;
        Object obj = this.f52853c;
        Object obj2 = this.f52852b;
        switch (i10) {
            case 0:
                org.telegram.messenger.np.u1(((ws) obj2).f30139a).V3((TLRPC.Updates) obj, false);
                return;
            case 1:
                ut utVar = (ut) obj2;
                a0.h hVar = (a0.h) obj;
                vt vtVar = utVar.V2;
                Activity parentActivity = vtVar.getParentActivity();
                kg.o1 o1Var = vtVar.f34672b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f28402id;
                }
                org.telegram.ui.Components.lc.x(parentActivity, o1Var, m10, j3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, utVar.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, utVar.J0)).j();
                return;
            case 2:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                xt xtVar = (xt) ((a7.d) obj2).f304c;
                xtVar.a();
                org.telegram.ui.Cells.n8 n8Var = xtVar.f53925e;
                xtVar.c();
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29587q6, false);
                org.telegram.ui.Components.oh0 oh0Var = xtVar.d;
                oh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                if (org.telegram.ui.ActionBar.m6.k1()) {
                    n8Var.p(org.telegram.messenger.hd.N0(2131745270, null), oh0Var, true);
                    n8Var.f31140x += 2;
                } else {
                    n8Var.p(org.telegram.messenger.hd.N0(2131745271, null), oh0Var, true);
                    n8Var.f31140x += 2;
                }
                org.telegram.ui.ActionBar.m6.M1(g2Var);
                return;
            case 3:
                ki.s2.n(((cx) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 4:
                cx cxVar = (cx) obj2;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj;
                org.telegram.ui.ActionBar.w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    w2VarArr[0] = null;
                }
                org.telegram.messenger.g0.h3(new gu(cxVar, 18), 300L);
                return;
            case 5:
                cx cxVar2 = (cx) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.messenger.np messagesController = cxVar2.getMessagesController();
                if (cxVar2.Y2 == 0 && cxVar2.f46658a3 == 0) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                messagesController.e(arrayList, i7, -1, null, 0L);
                return;
            case 6:
                CharSequence charSequence = (CharSequence) obj;
                cx cxVar3 = ((hv) obj2).f48501a;
                cxVar3.J2 = null;
                org.telegram.ui.Components.ep0 ep0Var = cxVar3.I2;
                if (ep0Var != null && ep0Var.h) {
                    ep0Var.e(charSequence, false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ActionBar.g2[] g2VarArr = (org.telegram.ui.ActionBar.g2[]) obj;
                ((cw) obj2).f46653b.removeSelfFromStack();
                if (g2VarArr[1] != null) {
                    g2VarArr[0].removeSelfFromStack();
                    g2VarArr[1].finishFragment();
                    return;
                }
                g2VarArr[0].finishFragment();
                return;
            case 8:
                ArrayList arrayList2 = (ArrayList) obj;
                cx cxVar4 = ((tw) obj2).f52369b;
                if (cxVar4.I4(cxVar4.f46683f0[0]) && !cxVar4.U1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cxVar4.U4(true, true);
                cxVar4.z3();
                if (z10 && cxVar4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList2.get(i12)).f28402id));
                    }
                    boolean z11 = false;
                    for (int size = cxVar4.T1.size() - 1; size >= 0; size--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar4.T1.get(size);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.f28402id)) && cxVar4.H4(cxVar4.f46683f0[0], dialog)) {
                            cxVar4.T1.remove(size);
                            z11 = true;
                        }
                    }
                    if (z11) {
                        cxVar4.f46683f0[0].q(false);
                    }
                }
                while (i11 < arrayList2.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList2.get(i11)).f28402id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (cxVar4.getMessagesController().y2(j10) || cxVar4.getMessagesController().F2(j10)) {
                        org.telegram.messenger.np messagesController2 = cxVar4.getMessagesController();
                        org.telegram.messenger.ur messagesStorage = messagesController2.getMessagesStorage();
                        org.telegram.messenger.ll llVar = new org.telegram.messenger.ll(messagesController2, j10);
                        org.telegram.messenger.q5 q5Var = messagesStorage.f27214a;
                        org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j10, llVar, 5);
                        j10 = j10;
                        q5Var.c(d4Var);
                    }
                    cxVar4.getMessagesController().v3(j10, 0L);
                    org.telegram.messenger.np messagesController3 = cxVar4.getMessagesController();
                    int i13 = dialog2.top_message;
                    messagesController3.q3(j10, i13, i13, dialog2.last_message_date, false, 0L, 0, true, 0);
                    i11++;
                }
                return;
            case 9:
                ((tw) obj2).d((org.telegram.messenger.so) obj);
                return;
            case 10:
                nx nxVar = (nx) obj2;
                bn bnVar = nxVar.f50339a;
                org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(bnVar.getParentActivity(), nxVar.f50339a, org.telegram.messenger.gj.j1(((org.telegram.messenger.gj) obj).f24177k), null, bnVar.f45903a0, bnVar.getResourceProvider());
                boolean V9 = bnVar.V9();
                kw0Var.f30160i0 = V9;
                kw0Var.f30167n = V9;
                bnVar.showDialog(kw0Var);
                return;
            case 11:
                iy iyVar = (iy) obj2;
                iyVar.getClass();
                ((org.telegram.ui.ActionBar.t1) obj).dismiss();
                jy jyVar = iyVar.F;
                ky kyVar = jyVar.f49099c;
                org.telegram.messenger.y10 y10Var = kyVar.f49395x;
                if (y10Var != null) {
                    y10Var.a(kyVar.d);
                }
                jyVar.f49099c.finishFragment();
                return;
            case 12:
                kz kzVar = (kz) obj2;
                ky kyVar2 = new ky(kzVar.f49407r, ((cz) obj).f46801m);
                kyVar2.f49396y = new oy(kzVar, 1);
                kyVar2.f49395x = new oy(kzVar, 2);
                kzVar.presentFragment(kyVar2);
                return;
            case 13:
                kz kzVar2 = (kz) obj2;
                kzVar2.h = false;
                kzVar2.f49408s = false;
                kzVar2.f49407r.f26855g = kzVar2.E;
                kzVar2.o0(true);
                kzVar2.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 14:
                kz kzVar3 = (kz) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = kzVar3.M;
                kzVar3.O = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    kzVar3.getMessagesController().Z3(tL_chatlists_exportedInvites.chats, false);
                    kzVar3.getMessagesController().f4(tL_chatlists_exportedInvites.users, false);
                    arrayList3.clear();
                    arrayList3.addAll(tL_chatlists_exportedInvites.invites);
                    kzVar3.C0();
                }
                kzVar3.N = 0;
                return;
            case 15:
                kz kzVar4 = (kz) obj2;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                org.telegram.messenger.so soVar = kzVar4.f49407r;
                if (t1Var != null) {
                    try {
                        t1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                kzVar4.getMessagesController().p4(soVar);
                org.telegram.messenger.ur messagesStorage2 = kzVar4.getMessagesStorage();
                messagesStorage2.f27214a.c(new org.telegram.messenger.sq(3, messagesStorage2, soVar));
                kzVar4.finishFragment();
                return;
            case 16:
                kz kzVar5 = (kz) obj2;
                kzVar5.getClass();
                kzVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 17:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f43069y) {
                    filtersSetupActivity.f43069y = true;
                    filtersSetupActivity.f0(new d00(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 18:
                FiltersSetupActivity filtersSetupActivity2 = ((j00) obj2).f48860e;
                filtersSetupActivity2.getMessagesController().W0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 19:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((f40) obj2).X3;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.y) arrayList5.get(i14)).f41454x != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.y) arrayList5.get(i14)).f41454x);
                    }
                }
                while (i11 < arrayList4.size()) {
                    org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList4.get(i11);
                    if (u3Var.f27119a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, u3Var.f27120b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(u3Var.f27119a, u3Var.f27120b);
                    }
                    i11++;
                }
                return;
            case 20:
                f40 f40Var = (f40) obj2;
                org.telegram.messenger.ls.f(f40Var.f47488o1.f23166a).k(75, 6, ((TLRPC.TL_error) obj).text);
                f40Var.dismiss();
                return;
            case 21:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.n2) obj).f41179e.getBitmap(100, 100);
                    if (bitmap != null) {
                        org.telegram.messenger.g0.g3(new vs(22, m4Var, c8.k0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 22:
                ((f40) ((m4) obj2).f49726b).P2.setNewColors((int[]) obj);
                return;
            case 23:
                n50.a0((n50) obj2, (TLRPC.TL_error) obj);
                return;
            case 24:
                j50 j50Var = (j50) obj2;
                String str = (String) obj;
                k50 k50Var = j50Var.f48911a;
                k50Var.f49159e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                k50Var.f49158c = k50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new e00(2, j50Var, str), 66);
                return;
            case 25:
                TLObject tLObject2 = (TLObject) obj;
                k50 k50Var2 = ((j50) obj2).f48911a;
                if (tLObject2 != null) {
                    n50.f0(k50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    n50.f0(k50Var2.h, null);
                    return;
                }
            case 26:
                m50 m50Var = (m50) obj2;
                String str2 = (String) obj;
                m50Var.h = str2;
                n50 n50Var = m50Var.f49739r;
                if (n50Var.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f28510q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f28512q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                m50Var.f49738n = n50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(m50Var, str2, str2, 14), 66);
                return;
            case 27:
                org.telegram.messenger.g0.h3(new oi.s2(26, (b60) obj2, (org.telegram.messenger.t2) obj), 150L);
                return;
            case 28:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.f43073e = (ArrayList) obj;
                languageSelectActivity.f43072c.f();
                return;
            default:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.g3(new vs(28, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList6 = new ArrayList();
                int size2 = languageSelectActivity2.h.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) languageSelectActivity2.h.get(i15);
                    if (ddVar.f23493a.toLowerCase().startsWith(str3) || ddVar.f23494b.toLowerCase().startsWith(str3)) {
                        arrayList6.add(ddVar);
                    }
                }
                int size3 = languageSelectActivity2.f43074f.size();
                while (i11 < size3) {
                    org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) languageSelectActivity2.f43074f.get(i11);
                    if (ddVar2.f23493a.toLowerCase().startsWith(str3) || ddVar2.f23494b.toLowerCase().startsWith(str3)) {
                        arrayList6.add(ddVar2);
                    }
                    i11++;
                }
                org.telegram.messenger.g0.g3(new vs(28, languageSelectActivity2, arrayList6));
                return;
        }
    }

    public vs(ut utVar, a0.h hVar, int i7) {
        this.f52851a = 1;
        this.f52852b = utVar;
        this.f52853c = hVar;
    }
}
