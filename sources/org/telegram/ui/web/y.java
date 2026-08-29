package org.telegram.ui.web;

import android.location.Location;
import android.net.Uri;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.car.app.hardware.common.CarResultStub;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.o6;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.tn;
import ph.d3;
import ph.n3;
import ph.p2;
public final class y implements Runnable {
    public final int f44250a;
    public final Object f44251b;
    public final Object f44252c;

    public y(int i10, Object obj, Object obj2) {
        this.f44250a = i10;
        this.f44252c = obj;
        this.f44251b = obj2;
    }

    @Override
    public final void run() {
        z0 z0Var;
        f0 f0Var;
        boolean z10;
        float f9;
        t1 t1Var;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10;
        TL_account.connectedBots connectedbots;
        switch (this.f44250a) {
            case 0:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f44252c;
                ArrayList arrayList = (ArrayList) this.f44251b;
                if (botWebViewContainer$BotWebViewProxy != null && (z0Var = botWebViewContainer$BotWebViewProxy.f43963a) != null && (f0Var = z0Var.f44264c) != null) {
                    f0Var.f(arrayList);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.f44251b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f44252c;
                int i11 = 0;
                b1.f43989c.addAll(0, arrayList2);
                for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
                    b1.d.put(longSparseArray.keyAt(i12), (a1) longSparseArray.valueAt(i12));
                }
                b1.f43988b = true;
                b1.f43987a = false;
                ArrayList arrayList3 = b1.f43990e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        ((Utilities.Callback) obj).run(arrayList2);
                    }
                    b1.f43990e = null;
                    return;
                }
                return;
            case 2:
                d1 d1Var = ((c1) this.f44252c).h;
                ArrayList arrayList4 = d1Var.f44000f;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) this.f44251b);
                d1Var.h = false;
                o51 o51Var = d1Var.f31601a;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f44252c;
                if (((d2) this.f44251b).b() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g1Var.setEnabled(z10);
                ViewPropertyAnimator animate = g1Var.animate();
                if (g1Var.isEnabled()) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.5f;
                }
                animate.alpha(f9);
                return;
            case 4:
                ((org.telegram.ui.o0) this.f44252c).f44163b0.run((Integer) this.f44251b);
                return;
            case 5:
                w1 w1Var = (w1) this.f44252c;
                w1Var.getMessagesController().removeWebBrowserException((String) this.f44251b);
                w1Var.f31601a.U2.N(true);
                return;
            case 6:
                d2 d2Var = (d2) this.f44252c;
                TLObject tLObject = (TLObject) this.f44251b;
                int i13 = d2Var.f44005a;
                d2Var.f44010g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i13).putChats(tL_messages_webPage.chats, false);
                    d2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            d2Var.h = tL_webPage;
                        }
                    }
                    d2Var.h = null;
                }
                TLRPC.WebPage webPage = d2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    d2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && d2Var.h != null && (t1Var = d2Var.f44014l) != null) {
                    t1Var.run();
                }
                d2Var.c();
                return;
            case 7:
                ((d2) this.f44252c).f44015m.remove((y) this.f44251b);
                return;
            case 8:
                ph.j jVar = (ph.j) this.f44252c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f44251b;
                if (userFull != null) {
                    jVar.S = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    jVar.U = starrefprogram;
                    if (starrefprogram == null) {
                        jVar.S = true;
                        jVar.U = jVar.F0();
                        jVar.T = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        jVar.T = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = jVar.U;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                jVar.H0(true);
                return;
            case 9:
                p2 p2Var = (p2) this.f44252c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f44251b;
                p2Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    p2Var.g(botappsettings, true);
                    return;
                }
                return;
            case 10:
                p2 p2Var2 = (p2) this.f44252c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f44251b;
                if (!p2Var2.Y) {
                    if (tL_error != null) {
                        p2Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(p2Var2.f45976p0, 60000L);
                        return;
                    }
                }
                return;
            case 11:
                p2 p2Var3 = (p2) this.f44252c;
                mc Q = new tc(p2Var3.f45972l0, p2Var3.A).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f44251b));
                Q.f30652j = 5000;
                Q.k(true);
                return;
            case 12:
                d3 d3Var = (d3) this.f44252c;
                d3Var.getMessagesController().openApp((TLRPC.User) this.f44251b, d3Var.getClassGuid());
                return;
            case 13:
                d3 d3Var2 = (d3) this.f44252c;
                d3Var2.getClass();
                d3Var2.presentFragment(tn.R9(((TL_payments.connectedBotStarRef) this.f44251b).bot_id));
                return;
            case 14:
                n3 n3Var = (n3) this.f44252c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f44251b;
                if (!n3Var.P) {
                    if (tL_error2 != null) {
                        n3Var.f28403b.dismiss();
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(n3Var.Q, 60000L);
                        return;
                    }
                }
                return;
            case 15:
                n3 n3Var2 = (n3) this.f44252c;
                mc Q2 = new tc(n3Var2.f28403b.getContainer(), n3Var2.f28402a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f44251b));
                Q2.f30652j = 5000;
                Q2.k(true);
                return;
            case 16:
                qh.q qVar = (qh.q) this.f44252c;
                qVar.getClass();
                qVar.presentFragment(tn.R9(((rh.e) this.f44251b).f47440b.f22539id));
                return;
            case 17:
                ((qh.i0) this.f44252c).f46719s.presentFragment(tn.R9(((rh.e) this.f44251b).f47440b.f22539id));
                return;
            case 18:
                CarResultStub.F0((Map.Entry) this.f44252c, this.f44251b);
                return;
            case 19:
                r4.b bVar = (r4.b) this.f44252c;
                bVar.f46942r = false;
                bVar.b((Uri) this.f44251b);
                return;
            case 20:
                rf.c cVar = (rf.c) this.f44252c;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f44251b);
                int i14 = cVar.C;
                MessagesController.getInstance(i14).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.f47181w, location, false);
                return;
            case 21:
                rf.a0 a0Var = (rf.a0) this.f44252c;
                TLObject tLObject2 = (TLObject) this.f44251b;
                int i15 = a0Var.f47155o0;
                ArrayList arrayList5 = a0Var.G;
                a0Var.O = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList5.isEmpty()) {
                        arrayList5.clear();
                        a0Var.l();
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i15).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList5.addAll(tL_contacts_sponsoredPeers.peers);
                    a0Var.l();
                    return;
                } else {
                    return;
                }
            case 22:
                rf.a0 a0Var2 = (rf.a0) this.f44252c;
                View view = (View) this.f44251b;
                a0Var2.f47149i0 = false;
                a0Var2.f47151k0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 23:
                rf.a0 a0Var3 = (rf.a0) this.f44252c;
                StringBuilder sb2 = (StringBuilder) this.f44251b;
                a0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(a0Var3.f47155o0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 24:
                rf.d1 d1Var2 = (rf.d1) this.f44252c;
                String str = (String) this.f44251b;
                d1Var2.E = str;
                if (d1Var2.f47197r) {
                    d1Var2.f47195f.g(str, true, false, d1Var2.f47198s, d1Var2.v, d1Var2.f47200x, d1Var2.f47199w, -1, 1);
                }
                int i16 = UserConfig.selectedAccount;
                ArrayList arrayList6 = new ArrayList(ContactsController.getInstance(i16).contacts);
                d1Var2.f47201y = true;
                int i17 = d1Var2.B;
                d1Var2.B = i17 + 1;
                d1Var2.A = i17;
                d1Var2.l();
                Utilities.searchQueue.postRunnable(new o6(d1Var2, str, i17, arrayList6, i16, 3));
                return;
            case 25:
                ArrayList arrayList7 = (ArrayList) this.f44251b;
                int i18 = ((rf.k1) this.f44252c).f47287m;
                try {
                    MessagesStorage.getInstance(i18).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i18).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList7.size() && i19 != 100) {
                            rf.i1 i1Var = (rf.i1) arrayList7.get(i19);
                            executeFast.requery();
                            executeFast.bindString(1, i1Var.f47262a);
                            executeFast.bindInteger(2, i1Var.f47263b);
                            executeFast.step();
                            i19++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList7.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i18).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList7.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((rf.i1) arrayList7.get(i10)).f47262a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i18).getDatabase().commitTransaction();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 26:
                sf.g gVar = (sf.g) this.f44252c;
                TLObject tLObject3 = (TLObject) this.f44251b;
                gVar.f47809e = false;
                if (tLObject3 instanceof TL_account.connectedBots) {
                    connectedbots = (TL_account.connectedBots) tLObject3;
                } else {
                    connectedbots = null;
                }
                gVar.f47808c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(gVar.f47806a).putUsers(gVar.f47808c.users, false);
                }
                gVar.f47807b = System.currentTimeMillis();
                gVar.f47810f = true;
                gVar.d();
                return;
            case 27:
                sf.f0.R((sf.f0) this.f44252c, (i8) this.f44251b);
                return;
            case 28:
                sf.l0.V((sf.l0) this.f44252c, (TLObject) this.f44251b);
                return;
            default:
                sf.x0 x0Var = (sf.x0) this.f44252c;
                x0Var.getClass();
                x0Var.X(((w41) this.f44251b).d);
                return;
        }
    }

    public y(ArrayList arrayList, LongSparseArray longSparseArray) {
        this.f44250a = 1;
        this.f44251b = arrayList;
        this.f44252c = longSparseArray;
    }
}
