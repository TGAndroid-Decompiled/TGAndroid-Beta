package org.telegram.ui;

import android.app.Activity;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

public final class zh1 implements Runnable {

    public final int f45183a;

    public final Object f45184b;

    public final Object f45185c;

    public zh1(int i10, Object obj, Object obj2) {
        this.f45183a = i10;
        this.f45184b = obj;
        this.f45185c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.z0 z0Var;
        org.telegram.ui.web.f0 f0Var;
        nh.f0 f0Var2;
        int i10;
        TLRPC.Message message;
        String path;
        String string;
        String strReplace;
        InputStream inputStreamOpenInputStream;
        FileOutputStream fileOutputStream;
        str = null;
        str = null;
        String str = null;
        ArrayList arrayList = null;
        sQLitePreparedStatementExecuteFast = null;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        sQLitePreparedStatementExecuteFast = null;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = null;
        boolean z10 = true;
        int i11 = 0;
        switch (this.f45183a) {
            case 0:
                ai1 ai1Var = (ai1) this.f45184b;
                String str2 = (String) this.f45185c;
                ai1Var.d.clear();
                ai1Var.f36543e.clear();
                ai1Var.f36544f = true;
                ai1Var.F(str2, "", true);
                ai1Var.h = str2;
                ai1Var.l();
                ai1Var.f36550y = null;
                return;
            case 1:
                ai1 ai1Var2 = (ai1) this.f45184b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f45185c);
                WallpapersListActivity wallpapersListActivity = ai1Var2.A;
                MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str3 = ai1Var2.f36549x;
                ai1Var2.f36549x = null;
                ai1Var2.F(str3, "", false);
                return;
            case 2:
                gi1 gi1Var = (gi1) this.f45184b;
                String str4 = (String) this.f45185c;
                hi1 hi1Var = gi1Var.f38423a;
                Activity parentActivity = hi1Var.getParentActivity();
                MessageObject messageObject = hi1Var.f38846n;
                if (parentActivity == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d(str4);
                }
                str4.getClass();
                if (str4.equals("share_game")) {
                    messageObject.messageOwner.with_my_score = false;
                } else if (str4.equals("share_score")) {
                    messageObject.messageOwner.with_my_score = true;
                }
                hi1Var.showDialog(org.telegram.ui.Components.sp0.N0(hi1Var.getParentActivity(), messageObject, null, false, hi1Var.h));
                return;
            case 3:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f45184b;
                ArrayList arrayList2 = (ArrayList) this.f45185c;
                if (botWebViewContainer$BotWebViewProxy == null || (z0Var = botWebViewContainer$BotWebViewProxy.f43764a) == null || (f0Var = z0Var.f44061c) == null) {
                    return;
                }
                f0Var.f(arrayList2);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) this.f45184b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f45185c;
                org.telegram.ui.web.b1.f43783c.addAll(0, arrayList3);
                for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
                    org.telegram.ui.web.b1.d.put(longSparseArray.keyAt(i12), (org.telegram.ui.web.a1) longSparseArray.valueAt(i12));
                }
                org.telegram.ui.web.b1.f43782b = true;
                org.telegram.ui.web.b1.f43781a = false;
                ArrayList arrayList4 = org.telegram.ui.web.b1.f43784e;
                if (arrayList4 != null) {
                    int size = arrayList4.size();
                    while (i11 < size) {
                        Object obj = arrayList4.get(i11);
                        i11++;
                        ((Utilities.Callback) obj).run(arrayList3);
                    }
                    org.telegram.ui.web.b1.f43784e = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f45184b;
                ArrayList arrayList5 = (ArrayList) this.f45185c;
                org.telegram.ui.web.d1 d1Var = c1Var.h;
                ArrayList arrayList6 = d1Var.f43807f;
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                d1Var.h = false;
                org.telegram.ui.Components.e51 e51Var = d1Var.f28261a;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f45184b;
                f1Var.setEnabled(((org.telegram.ui.web.c2) this.f45185c).b() != null);
                f1Var.animate().alpha(f1Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 7:
                ((o0) this.f45184b).f43960b0.run((Integer) this.f45185c);
                return;
            case 8:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f45184b;
                v1Var.getMessagesController().removeWebBrowserException((String) this.f45185c);
                v1Var.f28261a.U2.N(true);
                return;
            case 9:
                org.telegram.ui.web.c2 c2Var = (org.telegram.ui.web.c2) this.f45184b;
                TLObject tLObject = (TLObject) this.f45185c;
                int i13 = c2Var.f43794a;
                c2Var.f43799g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i13).putChats(tL_messages_webPage.chats, false);
                    c2Var.h = tL_messages_webPage.webpage;
                } else if (tLObject instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                    if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                        c2Var.h = tL_webPage;
                    } else {
                        c2Var.h = null;
                    }
                } else {
                    c2Var.h = null;
                }
                TLRPC.WebPage webPage = c2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    c2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && c2Var.h != null && (f0Var2 = c2Var.f43803l) != null) {
                    f0Var2.run();
                }
                c2Var.c();
                return;
            case 10:
                ((org.telegram.ui.web.c2) this.f45184b).f43804m.remove((zh1) this.f45185c);
                return;
            case 11:
                p4.b bVar = (p4.b) this.f45184b;
                Uri uri = (Uri) this.f45185c;
                bVar.f45367r = false;
                bVar.b(uri);
                return;
            case 12:
                pf.c cVar = (pf.c) this.f45184b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f45185c);
                int i14 = cVar.C;
                MessagesController.getInstance(i14).putUsers(tL_contacts_resolvedPeer2.users, false);
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer2.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.f45746w, location, false);
                return;
            case 13:
                pf.z zVar = (pf.z) this.f45184b;
                TLObject tLObject2 = (TLObject) this.f45185c;
                int i15 = zVar.f45996o0;
                ArrayList arrayList7 = zVar.G;
                zVar.O = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (arrayList7.isEmpty()) {
                        return;
                    }
                    arrayList7.clear();
                    zVar.l();
                    return;
                }
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i15).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList7.addAll(tL_contacts_sponsoredPeers.peers);
                    zVar.l();
                    return;
                }
                return;
            case 14:
                pf.z zVar2 = (pf.z) this.f45184b;
                View view = (View) this.f45185c;
                zVar2.f45990i0 = false;
                zVar2.f45992k0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                pf.z zVar3 = (pf.z) this.f45184b;
                StringBuilder sb2 = (StringBuilder) this.f45185c;
                zVar3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(zVar3.f45996o0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 16:
                pf.c1 c1Var2 = (pf.c1) this.f45184b;
                String str5 = (String) this.f45185c;
                c1Var2.E = str5;
                if (c1Var2.f45756r) {
                    c1Var2.f45754f.g(str5, true, false, c1Var2.f45757s, c1Var2.v, c1Var2.f45759x, c1Var2.f45758w, -1, 1);
                }
                int i16 = UserConfig.selectedAccount;
                ArrayList arrayList8 = new ArrayList(ContactsController.getInstance(i16).contacts);
                c1Var2.f45760y = true;
                int i17 = c1Var2.B;
                c1Var2.B = i17 + 1;
                c1Var2.A = i17;
                c1Var2.l();
                Utilities.searchQueue.postRunnable(new nh.j4(c1Var2, str5, i17, arrayList8, i16, 3));
                return;
            case 17:
                pf.j1 j1Var = (pf.j1) this.f45184b;
                ArrayList arrayList9 = (ArrayList) this.f45185c;
                int i18 = j1Var.f45846m;
                try {
                    MessagesStorage.getInstance(i18).getDatabase().beginTransaction();
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast3 = MessagesStorage.getInstance(i18).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i11 < arrayList9.size() && i11 != 100) {
                            pf.h1 h1Var = (pf.h1) arrayList9.get(i11);
                            sQLitePreparedStatementExecuteFast3.requery();
                            sQLitePreparedStatementExecuteFast3.bindString(1, h1Var.f45821a);
                            sQLitePreparedStatementExecuteFast3.bindInteger(2, h1Var.f45822b);
                            sQLitePreparedStatementExecuteFast3.step();
                            i11++;
                        }
                    }
                    sQLitePreparedStatementExecuteFast3.dispose();
                    if (arrayList9.size() > 100) {
                        SQLitePreparedStatement sQLitePreparedStatementExecuteFast4 = MessagesStorage.getInstance(i18).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList9.size(); i10++) {
                            sQLitePreparedStatementExecuteFast4.requery();
                            sQLitePreparedStatementExecuteFast4.bindString(1, ((pf.h1) arrayList9.get(i10)).f45821a);
                            sQLitePreparedStatementExecuteFast4.step();
                        }
                        sQLitePreparedStatementExecuteFast4.dispose();
                    }
                    MessagesStorage.getInstance(i18).getDatabase().commitTransaction();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 18:
                qf.h hVar = (qf.h) this.f45184b;
                TLObject tLObject3 = (TLObject) this.f45185c;
                hVar.f46312e = false;
                TL_account.connectedBots connectedbots = tLObject3 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject3 : null;
                hVar.f46311c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(hVar.f46309a).putUsers(hVar.f46311c.users, false);
                }
                hVar.f46310b = System.currentTimeMillis();
                hVar.f46313f = true;
                hVar.d();
                return;
            case 19:
                qf.g0.R((qf.g0) this.f45184b, (org.telegram.ui.Components.xl) this.f45185c);
                return;
            case 20:
                MessagesController.getInstance(((qf.m0) this.f45184b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f45185c), false);
                return;
            case 21:
                qf.y0 y0Var = (qf.y0) this.f45184b;
                org.telegram.ui.Components.n41 n41Var = (org.telegram.ui.Components.n41) this.f45185c;
                y0Var.getClass();
                y0Var.X(n41Var.d);
                return;
            case 22:
                MessagesStorage messagesStorage = (MessagesStorage) this.f45184b;
                qf.p1 p1Var = (qf.p1) this.f45185c;
                try {
                    try {
                        sQLitePreparedStatementExecuteFast2 = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatementExecuteFast2.requery();
                        sQLitePreparedStatementExecuteFast2.bindInteger(1, p1Var.f46418a);
                        sQLitePreparedStatementExecuteFast2.bindString(2, p1Var.f46419b);
                        sQLitePreparedStatementExecuteFast2.bindInteger(3, p1Var.f46420c);
                        sQLitePreparedStatementExecuteFast2.bindInteger(4, p1Var.f46422f);
                        sQLitePreparedStatementExecuteFast2.step();
                    } catch (Throwable th) {
                        if (sQLitePreparedStatementExecuteFast2 != null) {
                            sQLitePreparedStatementExecuteFast2.dispose();
                        }
                        throw th;
                    }
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    if (sQLitePreparedStatementExecuteFast2 == null) {
                        return;
                    }
                }
                sQLitePreparedStatementExecuteFast2.dispose();
                return;
            case 23:
                qf.q1 q1Var = (qf.q1) this.f45184b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.f45185c;
                ArrayList arrayList10 = q1Var.f46434b;
                try {
                    SQLiteDatabase database = messagesStorage2.getDatabase();
                    database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                    sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                    while (i11 < arrayList10.size()) {
                        qf.p1 p1Var2 = (qf.p1) arrayList10.get(i11);
                        sQLitePreparedStatementExecuteFast.requery();
                        sQLitePreparedStatementExecuteFast.bindInteger(1, p1Var2.f46418a);
                        sQLitePreparedStatementExecuteFast.bindString(2, p1Var2.f46419b);
                        sQLitePreparedStatementExecuteFast.bindInteger(3, p1Var2.f46420c);
                        sQLitePreparedStatementExecuteFast.bindInteger(4, p1Var2.f46422f);
                        sQLitePreparedStatementExecuteFast.step();
                        i11++;
                    }
                    if (sQLitePreparedStatementExecuteFast == null) {
                        return;
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                    if (sQLitePreparedStatementExecuteFast == null) {
                        return;
                    }
                } finally {
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                }
                return;
            case 24:
                qf.q1 q1Var2 = (qf.q1) this.f45184b;
                TLObject tLObject4 = (TLObject) this.f45185c;
                ArrayList arrayList11 = q1Var2.f46434b;
                int i19 = q1Var2.f46433a;
                if (tLObject4 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject4;
                    MessagesController.getInstance(i19).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i19).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i19).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList12 = new ArrayList();
                    for (int i20 = 0; i20 < tL_messages_quickReplies.quick_replies.size(); i20++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i20);
                        qf.p1 p1Var3 = new qf.p1();
                        p1Var3.f46418a = tL_quickReply.shortcut_id;
                        p1Var3.f46419b = tL_quickReply.shortcut;
                        p1Var3.f46422f = tL_quickReply.count;
                        p1Var3.d = tL_quickReply.top_message;
                        p1Var3.f46420c = i20;
                        int i21 = 0;
                        while (true) {
                            if (i21 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i21);
                                if (message.f22401id != tL_quickReply.top_message) {
                                    i21++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject2 = new MessageObject(i19, message, false, true);
                            p1Var3.f46421e = messageObject2;
                            messageObject2.generateThumbs(false);
                            p1Var3.f46421e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList12.add(p1Var3);
                    }
                    arrayList = arrayList12;
                }
                q1Var2.f46436e = false;
                if (arrayList != null) {
                    arrayList11.clear();
                    arrayList11.addAll(arrayList);
                }
                q1Var2.f46437f = true;
                q1Var2.l();
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 25:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.f45184b, this.f45185c);
                return;
            case 26:
                String[] strArr = (String[]) this.f45184b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f45185c;
                rh.q qVarA = rh.q.a(strArr[0], AndroidUtilities.dp(26.0f), false);
                if (qVarA == null) {
                    qVarA = rh.q.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                } else {
                    z10 = false;
                }
                AndroidUtilities.runOnUIThread(new op0(callback2, qVarA != null ? qVarA.f47381a : null, z10, 12));
                return;
            case 27:
                rh.v vVar = (rh.v) this.f45184b;
                TLObject tLObject5 = (TLObject) this.f45185c;
                vVar.f47509c0 = false;
                vVar.f47510d0 = 0;
                lh.d dVar = vVar.f47508b0;
                dVar.setLoading(false);
                if (!(tLObject5 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject5).result;
                if (richMessage == null) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                vVar.f47511e0 = richMessage;
                vVar.Y.set(richMessage);
                dVar.g(LocaleController.getString(R.string.ArticleAIAddToPage), true, true);
                vVar.P();
                org.telegram.ui.Components.b51 b51Var = vVar.V;
                if (b51Var != null) {
                    b51Var.N(true);
                    return;
                }
                return;
            case 28:
                rh.p3 p3Var = (rh.p3) this.f45184b;
                Uri uri2 = (Uri) this.f45185c;
                try {
                    path = AndroidUtilities.getPath(uri2);
                    break;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    path = null;
                }
                if (TextUtils.isEmpty(path) || !com.google.android.recaptcha.internal.a.v(path)) {
                    try {
                        Cursor cursorQuery = p3Var.getContext().getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(0);
                                } else {
                                    string = null;
                                }
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } else {
                            string = null;
                        }
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Exception e14) {
                                e = e14;
                                FileLog.e(e);
                            }
                        }
                        break;
                    } catch (Exception e15) {
                        e = e15;
                        string = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(string)) {
                            string = "document_" + SharedConfig.getLastLocalId();
                        }
                        strReplace = string.replace('/', '_').replace('\\', '_');
                        inputStreamOpenInputStream = p3Var.getContext().getContentResolver().openInputStream(uri2);
                        if (inputStreamOpenInputStream == null) {
                            try {
                                File file = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri2.hashCode()) + "_" + strReplace);
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    AndroidUtilities.copyFile(inputStreamOpenInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    String absolutePath = file.getAbsolutePath();
                                    inputStreamOpenInputStream.close();
                                    str = absolutePath;
                                } catch (Throwable th4) {
                                    try {
                                        fileOutputStream.close();
                                        throw th4;
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th6) {
                                try {
                                    inputStreamOpenInputStream.close();
                                    throw th6;
                                } catch (Throwable th7) {
                                    th6.addSuppressed(th7);
                                    throw th6;
                                }
                            }
                        } else if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        path = str;
                        if (TextUtils.isEmpty(path)) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        string = "document_" + SharedConfig.getLastLocalId();
                    }
                    strReplace = string.replace('/', '_').replace('\\', '_');
                    try {
                        inputStreamOpenInputStream = p3Var.getContext().getContentResolver().openInputStream(uri2);
                        if (inputStreamOpenInputStream == null) {
                            File file2 = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri2.hashCode()) + "_" + strReplace);
                            fileOutputStream = new FileOutputStream(file2);
                            AndroidUtilities.copyFile(inputStreamOpenInputStream, fileOutputStream);
                            fileOutputStream.close();
                            String absolutePath2 = file2.getAbsolutePath();
                            inputStreamOpenInputStream.close();
                            str = absolutePath2;
                        } else if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                    path = str;
                }
                if (TextUtils.isEmpty(path) || !com.google.android.recaptcha.internal.a.v(path)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new zh1(29, p3Var, path));
                return;
            default:
                ((rh.p3) this.f45184b).c2((String) this.f45185c);
                return;
        }
    }
}
