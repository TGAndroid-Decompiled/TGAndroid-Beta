package ph;

import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.car.app.hardware.common.CarResultStub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;
public final class f6 implements Runnable {
    public final int f41650a;
    public final Object f41651b;
    public final Object f41652c;

    public f6(int i10, Object obj, Object obj2) {
        this.f41650a = i10;
        this.f41652c = obj;
        this.f41651b = obj2;
    }

    @Override
    public final void run() {
        boolean z4;
        float f10;
        float f11;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10;
        TL_account.connectedBots connectedbots;
        switch (this.f41650a) {
            case 0:
                m6.R((m6) this.f41652c, (TLObject) this.f41651b);
                return;
            case 1:
                u6 u6Var = (u6) this.f41652c;
                TLObject tLObject = (TLObject) this.f41651b;
                u6Var.f42410e1 = 0;
                if (tLObject instanceof Vector) {
                    u6Var.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i11);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.f19196id = document.f19190id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            u6Var.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 2:
                d7.R((d7) this.f41652c, (TLObject) this.f41651b);
                return;
            case 3:
                d7 d7Var = (d7) this.f41652c;
                TextView textView = (TextView) this.f41651b;
                ClipboardManager clipboardManager = (ClipboardManager) d7Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.g3 g3Var = d7Var.V.f21199b;
                if ((TextUtils.isEmpty(g3Var.getText()) || TextUtils.equals(g3Var.getText(), "https://") || TextUtils.isEmpty(g3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ViewPropertyAnimator animate = textView.animate();
                float f12 = 1.0f;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (!z4) {
                    f12 = 0.7f;
                }
                org.telegram.ui.b.p(scaleX.scaleY(f12), nr.h, 300L);
                return;
            case 4:
                f8 f8Var = (f8) this.f41652c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f41651b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new f6(5, f8Var, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 5:
                f8 f8Var2 = (f8) this.f41652c;
                HashMap hashMap = (HashMap) this.f41651b;
                if (f8Var2.M == null) {
                    f8Var2.M = new HashMap();
                }
                f8Var2.M.putAll(hashMap);
                return;
            case 6:
                d dVar = (d) this.f41652c;
                Runnable runnable = (Runnable) this.f41651b;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ma maVar = (ma) this.f41652c;
                Bitmap bitmap = (Bitmap) this.f41651b;
                if (maVar.f41983k && !maVar.f41981i) {
                    maVar.d.add(new la(maVar, bitmap));
                    maVar.f41983k = false;
                    maVar.f41986n.invalidate();
                    return;
                }
                return;
            case 8:
                int[] iArr = (int[]) this.f41652c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f41651b;
                int i12 = iArr[0];
                if (i12 != 0) {
                    connectionsManager.cancelRequest(i12, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 9:
                CarResultStub.F0((Map.Entry) this.f41652c, this.f41651b);
                return;
            case 10:
                rh.k kVar = (rh.k) this.f41652c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f41651b;
                if (userFull != null) {
                    kVar.T = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    kVar.V = starrefprogram;
                    if (starrefprogram == null) {
                        kVar.T = true;
                        kVar.V = kVar.F0();
                        kVar.U = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        kVar.U = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = kVar.V;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                kVar.H0(true);
                return;
            case 11:
                rh.q2 q2Var = (rh.q2) this.f41652c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f41651b;
                q2Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    q2Var.g(botappsettings, true);
                    return;
                }
                return;
            case 12:
                rh.q2 q2Var2 = (rh.q2) this.f41652c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f41651b;
                if (!q2Var2.Z) {
                    if (tL_error != null) {
                        q2Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(q2Var2.f43698q0, 60000L);
                        return;
                    }
                }
                return;
            case 13:
                rh.q2 q2Var3 = (rh.q2) this.f41652c;
                ic Q = new qc(q2Var3.m0, q2Var3.B).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f41651b));
                Q.f25672j = 5000;
                Q.k(true);
                return;
            case 14:
                rh.e3 e3Var = (rh.e3) this.f41652c;
                e3Var.getMessagesController().openApp((TLRPC.User) this.f41651b, e3Var.getClassGuid());
                return;
            case 15:
                rh.e3 e3Var2 = (rh.e3) this.f41652c;
                e3Var2.getClass();
                e3Var2.presentFragment(xn.R9(((TL_payments.connectedBotStarRef) this.f41651b).bot_id));
                return;
            case 16:
                rh.o3 o3Var = (rh.o3) this.f41652c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f41651b;
                if (!o3Var.Q) {
                    if (tL_error2 != null) {
                        o3Var.f24278b.dismiss();
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(o3Var.R, 60000L);
                        return;
                    }
                }
                return;
            case 17:
                rh.o3 o3Var2 = (rh.o3) this.f41652c;
                ic Q2 = new qc(o3Var2.f24278b.getContainer(), o3Var2.f24277a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f41651b));
                Q2.f25672j = 5000;
                Q2.k(true);
                return;
            case 18:
                sh.q qVar = (sh.q) this.f41652c;
                qVar.getClass();
                qVar.presentFragment(xn.R9(((th.e) this.f41651b).f44944b.f19331id));
                return;
            case 19:
                ((sh.i0) this.f41652c).f44356s.presentFragment(xn.R9(((th.e) this.f41651b).f44944b.f19331id));
                return;
            case 20:
                tf.c cVar = (tf.c) this.f41652c;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f41651b);
                int i13 = cVar.D;
                MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.f44673w, location, false);
                return;
            case 21:
                tf.z zVar = (tf.z) this.f41652c;
                TLObject tLObject2 = (TLObject) this.f41651b;
                int i14 = zVar.f44908p0;
                ArrayList arrayList = zVar.H;
                zVar.P = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        zVar.l();
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    MessagesController.getInstance(i14).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i14).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    zVar.l();
                    return;
                } else {
                    return;
                }
            case 22:
                tf.z zVar2 = (tf.z) this.f41652c;
                View view = (View) this.f41651b;
                zVar2.f44902j0 = false;
                zVar2.f44904l0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 23:
                tf.z zVar3 = (tf.z) this.f41652c;
                StringBuilder sb = (StringBuilder) this.f41651b;
                zVar3.getClass();
                try {
                    sb.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(zVar3.f44908p0).getDatabase().executeFast(sb.toString()).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                tf.c1 c1Var = (tf.c1) this.f41652c;
                String str = (String) this.f41651b;
                c1Var.F = str;
                if (c1Var.f44682r) {
                    c1Var.f44680f.g(str, true, false, c1Var.f44683s, c1Var.v, c1Var.f44685x, c1Var.f44684w, -1, 1);
                }
                int i15 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i15).contacts);
                c1Var.f44686y = true;
                int i16 = c1Var.C;
                c1Var.C = i16 + 1;
                c1Var.B = i16;
                c1Var.l();
                Utilities.searchQueue.postRunnable(new org.telegram.messenger.p6(c1Var, str, i16, arrayList2, i15, 3));
                return;
            case 25:
                ArrayList arrayList3 = (ArrayList) this.f41651b;
                int i17 = ((tf.k1) this.f41652c).f44778m;
                try {
                    MessagesStorage.getInstance(i17).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i17).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList3.size() && i18 != 100) {
                            tf.i1 i1Var = (tf.i1) arrayList3.get(i18);
                            executeFast.requery();
                            executeFast.bindString(1, i1Var.f44755a);
                            executeFast.bindInteger(2, i1Var.f44756b);
                            executeFast.step();
                            i18++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i17).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList3.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((tf.i1) arrayList3.get(i10)).f44755a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i17).getDatabase().commitTransaction();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 26:
                u4.b bVar = (u4.b) this.f41652c;
                bVar.f45005r = false;
                bVar.b((Uri) this.f41651b);
                return;
            case 27:
                uf.f fVar = (uf.f) this.f41652c;
                TLObject tLObject3 = (TLObject) this.f41651b;
                fVar.e = false;
                if (tLObject3 instanceof TL_account.connectedBots) {
                    connectedbots = (TL_account.connectedBots) tLObject3;
                } else {
                    connectedbots = null;
                }
                fVar.f45301c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(fVar.f45299a).putUsers(fVar.f45301c.users, false);
                }
                fVar.f45300b = System.currentTimeMillis();
                fVar.f45302f = true;
                fVar.d();
                return;
            case 28:
                uf.e0.R((uf.e0) this.f41652c, (hm) this.f41651b);
                return;
            default:
                uf.k0.V((uf.k0) this.f41652c, (TLObject) this.f41651b);
                return;
        }
    }
}
