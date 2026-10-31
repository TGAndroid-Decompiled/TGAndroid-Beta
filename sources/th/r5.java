package th;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.k00;
import org.telegram.messenger.l00;
import org.telegram.messenger.li;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class r5 {
    public int f49411a;
    public hs f49412b;

    public static void a(th.r5 r22, th.j4 r23) {
        throw new UnsupportedOperationException("Method not decompiled: th.r5.a(th.r5, th.j4):void");
    }

    public static void b(int i10, long j10, jj jjVar, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = jjVar.f16337k;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.f20031id) {
            message.replyStory = c(i10, j10, storyItem);
        }
        int i11 = jjVar.D;
        if (i11 == 23 || i11 == 24) {
            TLRPC.TL_messageMediaStory tL_messageMediaStory = new TLRPC.TL_messageMediaStory();
            tL_messageMediaStory.user_id = org.telegram.messenger.o5.o(jjVar.f16337k.media.peer);
            TLRPC.MessageMedia messageMedia = jjVar.f16337k.media;
            tL_messageMediaStory.peer = messageMedia.peer;
            tL_messageMediaStory.f19815id = messageMedia.f19815id;
            tL_messageMediaStory.storyItem = c(i10, j10, storyItem);
            TLRPC.Message message2 = jjVar.f16337k;
            tL_messageMediaStory.via_mention = message2.media.via_mention;
            message2.media = tL_messageMediaStory;
        }
        TLRPC.MessageMedia messageMedia2 = jjVar.f16337k.media;
        if (messageMedia2 != null && (webPage = messageMedia2.webpage) != null && webPage.attributes != null) {
            for (int i12 = 0; i12 < jjVar.f16337k.media.webpage.attributes.size(); i12++) {
                TLRPC.WebPageAttribute webPageAttribute = jjVar.f16337k.media.webpage.attributes.get(i12);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                    if (tL_webPageAttributeStory.f19938id == storyItem.f20031id) {
                        webPageAttribute.flags |= 1;
                        tL_webPageAttributeStory.storyItem = c(i10, j10, storyItem);
                    }
                }
            }
        }
    }

    public static TL_stories.StoryItem c(int i10, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        int i11 = storyItem.expire_date;
        boolean z10 = false;
        if (i11 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i11) {
            z10 = true;
        }
        if (!storyItem.pinned && z10 && j10 != 0 && j10 != d20.i(i10).f15165n) {
            TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
            tL_storyItemDeleted.f20031id = storyItem.f20031id;
            return tL_storyItemDeleted;
        }
        return storyItem;
    }

    public static int e(jj jjVar) {
        TLRPC.WebPage webPage;
        int i10 = jjVar.D;
        if (i10 != 23 && i10 != 24) {
            TLRPC.MessageMedia messageMedia = jjVar.f16337k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                for (int i11 = 0; i11 < jjVar.f16337k.media.webpage.attributes.size(); i11++) {
                    TLRPC.WebPageAttribute webPageAttribute = jjVar.f16337k.media.webpage.attributes.get(i11);
                    if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                        return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).f19938id;
                    }
                }
            }
            return jjVar.f16337k.reply_to.story_id;
        }
        return jjVar.f16337k.media.f19815id;
    }

    public final void d(a0.h hVar, Runnable runnable, int i10, boolean z10, l00 l00Var) {
        r5 r5Var = this;
        l00 l00Var2 = l00Var;
        int i11 = r5Var.f49411a;
        if (hVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        k00 d = l00.d(l00Var2, "fillMessagesWithStories: applying stories for existing array");
        int i12 = 0;
        while (i12 < hVar.m()) {
            long j10 = hVar.j(i12);
            ArrayList arrayList2 = (ArrayList) hVar.n(i12);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                jj jjVar = (jj) arrayList2.get(i13);
                TL_stories.StoryItem f7 = r5Var.f(e(jjVar), j10);
                if (f7 != null && !(f7 instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i11, j10, jjVar, f7);
                    arrayList.add(jjVar);
                    arrayList2.remove(i13);
                    i13--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = hVar.f16c;
                        Object obj = objArr[i12];
                        Object obj2 = a0.i.f17a;
                        if (obj != obj2) {
                            objArr[i12] = obj2;
                            hVar.f14a = true;
                        }
                        i12--;
                    }
                }
                i13++;
            }
            i12++;
        }
        l00.a(d);
        if (z10) {
            r5Var.j(arrayList);
        }
        if (!hVar.i()) {
            int[] iArr = {hVar.m()};
            int i14 = 0;
            while (i14 < hVar.m()) {
                long j11 = hVar.j(i14);
                ArrayList arrayList3 = (ArrayList) hVar.n(i14);
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = vp.r1(i11).i1(j11);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    tL_stories_getStoriesByID.f20038id.add(Integer.valueOf(e((jj) arrayList3.get(i15))));
                }
                StringBuilder s10 = a1.g.s(j11, "fillMessagesWithStories: getStoriesByID did=", " ids=");
                s10.append(TextUtils.join(",", tL_stories_getStoriesByID.f20038id));
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new li(r5Var, l00.d(l00Var2, s10.toString()), arrayList3, j11, z10, l00Var2, iArr, runnable));
                if (i10 != 0) {
                    ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, i10);
                }
                i14++;
                r5Var = this;
                l00Var2 = l00Var;
            }
            return;
        }
        runnable.run();
    }

    public final TL_stories.StoryItem f(int i10, long j10) {
        SQLiteDatabase sQLiteDatabase = this.f49412b.f15940b;
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j10;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    n6.a(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e) {
            f8.g(e, true);
            return storyItem;
        }
    }

    public final void g(long j10, TL_stories.PeerStories peerStories) {
        SQLiteDatabase sQLiteDatabase = this.f49412b.f15940b;
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i10);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        f8.d("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j10);
                        executeFast.bindLong(2, storyItem.f20031id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b10 = n6.b(storyItem);
                        if (b10 != null) {
                            executeFast.bindByteBuffer(4, b10);
                        } else {
                            executeFast.bindNull(4);
                        }
                        if (b10 != null) {
                            b10.reuse();
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                executeFast.dispose();
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    public final void h(long j10, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.f49412b.f15940b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                f8.d("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j10);
            executeFast.bindLong(2, storyItem.f20031id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = n6.b(storyItem);
            if (b10 != null) {
                executeFast.bindByteBuffer(4, b10);
            } else {
                executeFast.bindNull(4);
            }
            if (b10 != null) {
                b10.reuse();
            }
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void i(int i10, long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i11 = this.f49411a;
        hs hsVar = this.f49412b;
        if (j10 > 0) {
            TLRPC.UserFull a2 = vp.r1(i11).a2(j10);
            if (a2 != null && (peerStories2 = a2.stories) != null) {
                peerStories2.max_read_id = i10;
                hsVar.j2(a2, false);
            }
        } else {
            TLRPC.ChatFull M0 = vp.r1(i11).M0(-j10);
            if (M0 != null && (peerStories = M0.stories) != null) {
                peerStories.max_read_id = i10;
                hsVar.N1(M0, false);
            }
        }
        hsVar.f15938a.c(new o5(this, j10, i10, 0));
    }

    public final void j(List list) {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement sQLitePreparedStatement3;
        hs hsVar = this.f49412b;
        int i10 = 1;
        try {
            SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
            if (!list.isEmpty()) {
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast3 = sQLiteDatabase.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast4 = sQLiteDatabase.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                int i11 = 0;
                while (i11 < list.size()) {
                    jj jjVar = (jj) list.get(i11);
                    int i12 = 0;
                    while (i12 < 2) {
                        if (jjVar.f16337k.replyStory != null) {
                            if (i12 == 0) {
                                sQLitePreparedStatement3 = executeFast;
                            } else {
                                sQLitePreparedStatement3 = executeFast2;
                            }
                            if (sQLitePreparedStatement3 == null) {
                                sQLitePreparedStatement = executeFast;
                            } else {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(jjVar.f16337k.replyStory.getObjectSize());
                                jjVar.f16337k.replyStory.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement3.requery();
                                sQLitePreparedStatement3.bindByteBuffer(i10, nativeByteBuffer);
                                sQLitePreparedStatement3.bindInteger(2, jjVar.f1());
                                sQLitePreparedStatement = executeFast;
                                sQLitePreparedStatement3.bindLong(3, jj.B0(jjVar.f16337k));
                                sQLitePreparedStatement3.step();
                            }
                        } else {
                            sQLitePreparedStatement = executeFast;
                            if (i12 == 0) {
                                sQLitePreparedStatement2 = executeFast3;
                            } else {
                                sQLitePreparedStatement2 = executeFast4;
                            }
                            if (sQLitePreparedStatement2 != null) {
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(jjVar.f16337k.getObjectSize());
                                jjVar.f16337k.serializeToStream(nativeByteBuffer2);
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer2);
                                sQLitePreparedStatement2.bindInteger(2, jjVar.f1());
                                sQLitePreparedStatement2.bindLong(3, jj.B0(jjVar.f16337k));
                                sQLitePreparedStatement2.step();
                            }
                        }
                        i12++;
                        executeFast = sQLitePreparedStatement;
                        i10 = 1;
                    }
                    i11++;
                    i10 = 1;
                }
                executeFast.dispose();
                executeFast2.dispose();
                executeFast3.dispose();
                executeFast4.dispose();
            }
        } catch (Throwable th2) {
            hsVar.o(th2, true);
        }
    }

    public final void k(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0) {
            return;
        }
        this.f49412b.f15938a.c(new p5(this, j10, storyItem, 0));
    }

    public final void l(long j10, TL_stories.StoryItem storyItem) {
        if (j10 != 0 && storyItem != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                f8.d("StoriesStorage: try write deleted story");
            }
            if (w5.w(this.f49411a, storyItem)) {
                f8.d("StoriesStorage: try write expired story");
            }
            try {
                SQLitePreparedStatement executeFast = this.f49412b.f15940b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                executeFast.requery();
                executeFast.bindLong(1, j10);
                executeFast.bindLong(2, storyItem.f20031id);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                storyItem.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                NativeByteBuffer b10 = n6.b(storyItem);
                if (b10 != null) {
                    executeFast.bindByteBuffer(4, b10);
                } else {
                    executeFast.bindNull(4);
                }
                if (b10 != null) {
                    b10.reuse();
                }
                executeFast.step();
                nativeByteBuffer.reuse();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }
}
