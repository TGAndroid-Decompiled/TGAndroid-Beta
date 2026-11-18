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
    public final int f52847a;
    public final Object f52848b;
    public final Object f52849c;

    public vs(int i7, Object obj, Object obj2) {
        this.f52847a = i7;
        this.f52848b = obj;
        this.f52849c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        boolean z10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.f52847a;
        long j3 = 0;
        int i11 = 0;
        Object obj = this.f52849c;
        Object obj2 = this.f52848b;
        switch (i10) {
            case 0:
                org.telegram.messenger.mp.u1(((ws) obj2).f30189a).V3((TLRPC.Updates) obj, false);
                return;
            case 1:
                ut utVar = (ut) obj2;
                a0.h hVar = (a0.h) obj;
                vt vtVar = utVar.V2;
                Activity parentActivity = vtVar.getParentActivity();
                kg.o1 o1Var = vtVar.f33531b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f28409id;
                }
                org.telegram.ui.Components.lc.x(parentActivity, o1Var, m10, j3, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, utVar.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, utVar.J0)).j();
                return;
            case 2:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                xt xtVar = (xt) ((a7.d) obj2).f304c;
                xtVar.a();
                org.telegram.ui.Cells.m8 m8Var = xtVar.f53935e;
                xtVar.c();
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29636q6, false);
                org.telegram.ui.Components.mh0 mh0Var = xtVar.d;
                mh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                if (org.telegram.ui.ActionBar.n6.k1()) {
                    m8Var.p(org.telegram.messenger.gd.M0(2131745271, null), mh0Var, true);
                    m8Var.f31088x += 2;
                } else {
                    m8Var.p(org.telegram.messenger.gd.M0(2131745272, null), mh0Var, true);
                    m8Var.f31088x += 2;
                }
                org.telegram.ui.ActionBar.n6.M1(h2Var);
                return;
            case 3:
                ki.t2.n(((cx) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 4:
                cx cxVar = (cx) obj2;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) obj;
                org.telegram.ui.ActionBar.x2 x2Var = x2VarArr[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                    x2VarArr[0] = null;
                }
                org.telegram.messenger.g0.h3(new gu(cxVar, 18), 300L);
                return;
            case 5:
                cx cxVar2 = (cx) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.messenger.mp messagesController = cxVar2.getMessagesController();
                if (cxVar2.Y2 == 0 && cxVar2.f46658a3 == 0) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                messagesController.e(arrayList, i7, -1, null, 0L);
                return;
            case 6:
                CharSequence charSequence = (CharSequence) obj;
                cx cxVar3 = ((hv) obj2).f48530a;
                cxVar3.J2 = null;
                org.telegram.ui.Components.cp0 cp0Var = cxVar3.I2;
                if (cp0Var != null && cp0Var.h) {
                    cp0Var.e(charSequence, false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ActionBar.h2[] h2VarArr = (org.telegram.ui.ActionBar.h2[]) obj;
                ((cw) obj2).f46651b.removeSelfFromStack();
                if (h2VarArr[1] != null) {
                    h2VarArr[0].removeSelfFromStack();
                    h2VarArr[1].finishFragment();
                    return;
                }
                h2VarArr[0].finishFragment();
                return;
            case 8:
                ArrayList arrayList2 = (ArrayList) obj;
                cx cxVar4 = ((tw) obj2).f52368b;
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
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList2.get(i12)).f28409id));
                    }
                    boolean z11 = false;
                    for (int size = cxVar4.T1.size() - 1; size >= 0; size--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar4.T1.get(size);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.f28409id)) && cxVar4.H4(cxVar4.f46683f0[0], dialog)) {
                            cxVar4.T1.remove(size);
                            z11 = true;
                        }
                    }
                    if (z11) {
                        cxVar4.f46683f0[0].q(false);
                    }
                }
                while (i11 < arrayList2.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList2.get(i11)).f28409id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (cxVar4.getMessagesController().y2(j10) || cxVar4.getMessagesController().F2(j10)) {
                        org.telegram.messenger.mp messagesController2 = cxVar4.getMessagesController();
                        org.telegram.messenger.tr messagesStorage = messagesController2.getMessagesStorage();
                        org.telegram.messenger.kl klVar = new org.telegram.messenger.kl(messagesController2, j10);
                        org.telegram.messenger.q5 q5Var = messagesStorage.f27054a;
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
            case 9:
                ((tw) obj2).d((org.telegram.messenger.ro) obj);
                return;
            case 10:
                nx nxVar = (nx) obj2;
                bn bnVar = nxVar.f50341a;
                org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(bnVar.getParentActivity(), nxVar.f50341a, org.telegram.messenger.fj.j1(((org.telegram.messenger.fj) obj).f23968k), null, bnVar.f45932a0, bnVar.getResourceProvider());
                boolean V9 = bnVar.V9();
                iw0Var.f30210i0 = V9;
                iw0Var.f30217n = V9;
                bnVar.showDialog(iw0Var);
                return;
            case 11:
                iy iyVar = (iy) obj2;
                iyVar.getClass();
                ((org.telegram.ui.ActionBar.u1) obj).dismiss();
                jy jyVar = iyVar.F;
                ky kyVar = jyVar.f49121c;
                org.telegram.messenger.x10 x10Var = kyVar.f49369x;
                if (x10Var != null) {
                    x10Var.a(kyVar.d);
                }
                jyVar.f49121c.finishFragment();
                return;
            case 12:
                kz kzVar = (kz) obj2;
                ky kyVar2 = new ky(kzVar.f49381r, ((cz) obj).f46801m);
                kyVar2.f49370y = new oy(kzVar, 1);
                kyVar2.f49369x = new oy(kzVar, 2);
                kzVar.presentFragment(kyVar2);
                return;
            case 13:
                kz kzVar2 = (kz) obj2;
                kzVar2.h = false;
                kzVar2.f49382s = false;
                kzVar2.f49381r.f26679g = kzVar2.E;
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
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj;
                org.telegram.messenger.ro roVar = kzVar4.f49381r;
                if (u1Var != null) {
                    try {
                        u1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                kzVar4.getMessagesController().p4(roVar);
                org.telegram.messenger.tr messagesStorage2 = kzVar4.getMessagesStorage();
                messagesStorage2.f27054a.c(new org.telegram.messenger.rq(3, messagesStorage2, roVar));
                kzVar4.finishFragment();
                return;
            case 16:
                kz kzVar5 = (kz) obj2;
                kzVar5.getClass();
                kzVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 17:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f43059y) {
                    filtersSetupActivity.f43059y = true;
                    filtersSetupActivity.f0(new d00(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 18:
                FiltersSetupActivity filtersSetupActivity2 = ((j00) obj2).f48831e;
                filtersSetupActivity2.getMessagesController().W0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 19:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((f40) obj2).X3;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.y) arrayList5.get(i14)).f41356x != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.y) arrayList5.get(i14)).f41356x);
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
                org.telegram.messenger.ks.f(f40Var.f47498o1.f23221a).k(75, 6, ((TLRPC.TL_error) obj).text);
                f40Var.dismiss();
                return;
            case 21:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.n2) obj).f41081e.getBitmap(100, 100);
                    if (bitmap != null) {
                        org.telegram.messenger.g0.g3(new vs(22, m4Var, c8.j0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 22:
                ((f40) ((m4) obj2).f49746b).P2.setNewColors((int[]) obj);
                return;
            case 23:
                n50.a0((n50) obj2, (TLRPC.TL_error) obj);
                return;
            case 24:
                j50 j50Var = (j50) obj2;
                String str = (String) obj;
                k50 k50Var = j50Var.f48882a;
                k50Var.f49181e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                k50Var.f49180c = k50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new e00(2, j50Var, str), 66);
                return;
            case 25:
                TLObject tLObject2 = (TLObject) obj;
                k50 k50Var2 = ((j50) obj2).f48882a;
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
                n50 n50Var = m50Var.f49759r;
                if (n50Var.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f28517q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f28519q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                m50Var.f49758n = n50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(m50Var, str2, str2, 14), 66);
                return;
            case 27:
                org.telegram.messenger.g0.h3(new oi.s2(26, (b60) obj2, (org.telegram.messenger.t2) obj), 150L);
                return;
            case 28:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.f43063e = (ArrayList) obj;
                languageSelectActivity.f43062c.f();
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
                    org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) languageSelectActivity2.h.get(i15);
                    if (cdVar.f23331a.toLowerCase().startsWith(str3) || cdVar.f23332b.toLowerCase().startsWith(str3)) {
                        arrayList6.add(cdVar);
                    }
                }
                int size3 = languageSelectActivity2.f43064f.size();
                while (i11 < size3) {
                    org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) languageSelectActivity2.f43064f.get(i11);
                    if (cdVar2.f23331a.toLowerCase().startsWith(str3) || cdVar2.f23332b.toLowerCase().startsWith(str3)) {
                        arrayList6.add(cdVar2);
                    }
                    i11++;
                }
                org.telegram.messenger.g0.g3(new vs(28, languageSelectActivity2, arrayList6));
                return;
        }
    }

    public vs(ut utVar, a0.h hVar, int i7) {
        this.f52847a = 1;
        this.f52848b = utVar;
        this.f52849c = hVar;
    }
}
