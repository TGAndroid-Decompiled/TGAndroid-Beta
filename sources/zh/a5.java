package zh;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class a5 {
    public static HashMap B;
    public final int f48237c;
    public final long d;
    public final int e;
    public final int f48238f;
    public final AbstractSet f48242k;
    public final AbstractSet f48243l;
    public boolean f48249r;
    public boolean f48251t;
    public boolean f48252u;
    public boolean v;
    public boolean f48253w;
    public final yg.q f48254x;
    public z4 f48255y;
    public boolean f48256z;
    public int f48235a = 0;
    public final ArrayList f48236b = new ArrayList();
    public final ArrayList f48239g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f48240i = new ArrayList();
    public final HashMap f48241j = new HashMap();
    public final HashSet f48244m = new HashSet();
    public boolean f48245n = true;
    public boolean f48246o = true;
    public final ArrayList f48247p = new ArrayList();
    public final x4 f48248q = new x4(this, 0);
    public int f48250s = -1;
    public int A = -1;

    public a5(int i10, long j3, int i11, int i12, Utilities.Callback callback) {
        this.f48237c = i10;
        this.d = j3;
        this.e = i11;
        this.f48238f = i12;
        this.f48254x = new yg.q(17, this, callback);
        if (i11 == 0 && i12 > 0) {
            this.f48242k = new LinkedHashSet();
            this.f48243l = new LinkedHashSet();
        } else {
            this.f48242k = new TreeSet(Comparator$CC.reverseOrder());
            this.f48243l = new TreeSet(Comparator$CC.reverseOrder());
        }
        s();
    }

    public static long b(MessageObject messageObject) {
        if (messageObject == null) {
            return 0L;
        }
        long j3 = messageObject.messageOwner.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3 * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject != null && messageObject.isStory()) {
            if (!z10 || !messageObject.isPhoto()) {
                if ((z11 && messageObject.isVideo()) || (messageObject.storyItem.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void v(AbstractSet abstractSet, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            if (abstractSet.contains(num)) {
                linkedHashSet.add(num);
            }
        }
        Iterator it = abstractSet.iterator();
        while (it.hasNext()) {
            Integer num2 = (Integer) it.next();
            if (!linkedHashSet.contains(num2)) {
                linkedHashSet.add(num2);
            }
        }
        abstractSet.clear();
        abstractSet.addAll(linkedHashSet);
    }

    public final void A(List list) {
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(this.e);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateDeletedStories {");
        sb2.append(i5.h0(list));
        hc.b.v("}", sb2);
        if (list != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i10);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.f17435id);
                    AbstractSet abstractSet = this.f48243l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f48242k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f17435id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f17435id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f17435id));
                        int i11 = this.f48250s;
                        if (i11 != -1) {
                            this.f48250s = i11 - 1;
                        }
                        z10 = true;
                    }
                    u(storyItem.f17435id, true);
                }
            }
            if (z10) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.f48242k, arrayList);
        v(this.f48243l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i10 = this.f48237c;
            tL_updateAlbum.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            tL_updateAlbum.album_id = this.f48238f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f48238f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i10 = this.f48237c;
        int i11 = MessagesController.getInstance(i10).storiesPinnedToTopCountMax;
        if (arrayList2.size() > i11) {
            arrayList2.subList(i11, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f48239g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList3.size() && arrayList3.get(i12) == arrayList2.get(i12); i12++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f17448id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new bi.g1(21));
        }
    }

    public final void D(List list, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i11 = this.e;
        sb2.append(i11);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(i5.h0(list));
        hc.b.v("}", sb2);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            boolean z13 = false;
            while (true) {
                int size = list.size();
                i10 = this.f48238f;
                if (i12 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i12);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f17435id);
                    AbstractSet abstractSet = this.f48243l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f48242k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f17435id))) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (i11 != 1 && !storyItem2.pinned) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (i10 > 0) {
                        ArrayList<Integer> arrayList2 = storyItem2.albums;
                        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i10))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        z12 = false;
                    }
                    HashMap hashMap = this.f48241j;
                    if (z11 != z12) {
                        if (!z12) {
                            hc.b.q(storyItem2.f17435id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f17435id, true);
                            int i13 = this.f48250s;
                            if (i13 != -1) {
                                this.f48250s = i13 - 1;
                            }
                        } else if (this.f48249r) {
                            FileLog.d("StoriesList put story " + storyItem2.f17435id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f17435id));
                            int i14 = this.f48250s;
                            if (i14 != -1) {
                                this.f48250s = i14 + 1;
                            }
                        } else if (!this.f48252u) {
                            FileLog.d("StoriesList cannot put story " + storyItem2.f17435id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f48237c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f48240i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f48249r = false;
                            this.f48253w = false;
                            p(Utilities.clamp(size2, 50, 10), true);
                        }
                    } else if (z11 && z12 && ((messageObject = (MessageObject) hashMap.get(Integer.valueOf(storyItem2.f17435id))) == null || z10 || (storyItem = messageObject.storyItem) == null || (storyItem != storyItem2 && (storyItem.f17435id != storyItem2.f17435id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        hc.b.q(storyItem2.f17435id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f17435id), y(storyItem2));
                    }
                    z13 = true;
                }
                i12++;
            }
            if (i10 > 0 && !arrayList.isEmpty()) {
                B(arrayList, false);
            }
            if (z13) {
                d(true);
                x();
            }
        }
    }

    public final void E(int i10, ArrayList arrayList, boolean z10) {
        TL_stories.StoryItem storyItem;
        HashSet hashSet;
        boolean add;
        ArrayList<Integer> arrayList2;
        int size = arrayList.size();
        boolean z11 = false;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            num.getClass();
            MessageObject messageObject = (MessageObject) this.f48241j.get(num);
            if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                if (storyItem.albums != null) {
                    hashSet = new HashSet(storyItem.albums);
                } else {
                    hashSet = new HashSet();
                }
                Integer valueOf = Integer.valueOf(i10);
                if (z10) {
                    add = hashSet.remove(valueOf);
                } else {
                    add = hashSet.add(valueOf);
                }
                if (!hashSet.isEmpty()) {
                    arrayList2 = new ArrayList<>(hashSet);
                } else {
                    arrayList2 = null;
                }
                storyItem.albums = arrayList2;
                z11 |= add;
            }
        }
        if (z11) {
            d(true);
            x();
        }
    }

    public final boolean a() {
        Long l4;
        if (B == null || (l4 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f48237c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f48238f))))) == null || System.currentTimeMillis() - l4.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: zh.a5.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z10) {
        c(this.f48240i, this.f48245n, this.f48246o);
        if (z10) {
            x4 x4Var = this.f48248q;
            AndroidUtilities.cancelRunOnUIThread(x4Var);
            AndroidUtilities.runOnUIThread(x4Var);
        }
    }

    public MessageObject f(int i10) {
        return (MessageObject) this.f48241j.get(Integer.valueOf(i10));
    }

    public int g() {
        boolean z10 = this.f48246o;
        ArrayList arrayList = this.f48240i;
        if (z10 && this.f48245n) {
            if (this.f48250s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f48250s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new sg.p(26));
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        int i11 = this.e;
        if (i11 == 0 && this.f48238f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f48240i;
            int size = arrayList4.size();
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList3.add(Integer.valueOf(((MessageObject) obj).storyItem.f17435id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f48239g;
        if (i11 == 0 && !arrayList5.isEmpty()) {
            arrayList2.add(new ArrayList(arrayList5));
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            TreeSet treeSet = (TreeSet) hashMap.get((Long) obj2);
            if (treeSet != null) {
                ArrayList arrayList6 = new ArrayList(treeSet);
                if (i11 == 0 && !arrayList5.isEmpty()) {
                    int size3 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj3 = arrayList5.get(i13);
                        i13++;
                        Integer num = (Integer) obj3;
                        num.intValue();
                        arrayList6.remove(num);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    arrayList2.add(arrayList6);
                }
            }
        }
        return arrayList2;
    }

    public int i() {
        return this.f48243l.size();
    }

    public void j() {
        if (this.f48251t) {
            this.v = true;
            return;
        }
        w();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f48237c);
        messagesStorage.getStorageQueue().postRunnable(new y4(this, messagesStorage, 1));
    }

    public boolean k() {
        if (!this.f48251t && !this.f48252u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f48243l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i10) {
        if (this.e == 0 && this.f48238f <= 0) {
            return this.f48239g.contains(Integer.valueOf(i10));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f48243l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f48239g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i10 = this.f48235a;
        this.f48235a = i10 + 1;
        this.f48236b.add(Integer.valueOf(i10));
        yg.q qVar = this.f48254x;
        if (qVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qVar);
        }
        return i10;
    }

    public final void p(int i10, boolean z10) {
        q(i10, Collections.EMPTY_LIST, z10);
    }

    public boolean q(int i10, List list, boolean z10) {
        int n10;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        int i11;
        if (this.f48252u || ((this.f48249r || this.f48253w || !a()) && !z10)) {
            return false;
        }
        if (this.f48251t) {
            this.f48255y = new z4(this, z10, i10, list);
            return false;
        }
        int i12 = this.e;
        long j3 = this.d;
        int i13 = this.f48237c;
        if (i12 == 0 && (i11 = this.f48238f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i11;
            tL_stories_getAlbumStories.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            n10 = this.f48243l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i12 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i12 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            tL_stories_getStoriesByID.f17442id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i12);
        sb2.append("{");
        sb2.append(j3);
        hc.b.v("} load", sb2);
        this.f48252u = true;
        this.A = ConnectionsManager.getInstance(i13).sendRequest(tL_stories_getStoriesArchive, new di.k4(this, n10, 9));
        return true;
    }

    public boolean r(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f48244m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i10));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i11 = this.f48237c;
        tL_stories_incrementStoryViews.peer = MessagesController.getInstance(i11).getInputPeer(this.d);
        tL_stories_incrementStoryViews.f17446id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_incrementStoryViews, new bi.g1(4));
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f48251t && !this.f48252u && !this.f48253w) {
            this.f48251t = true;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f48237c);
            messagesStorage.getStorageQueue().postRunnable(new y4(this, messagesStorage, 0));
        }
    }

    public final void t(MessageObject messageObject, boolean z10) {
        AbstractSet abstractSet;
        if (messageObject == null) {
            return;
        }
        this.f48241j.put(Integer.valueOf(messageObject.getId()), messageObject);
        if (z10) {
            abstractSet = this.f48242k;
        } else {
            abstractSet = this.f48243l;
        }
        abstractSet.add(Integer.valueOf(messageObject.getId()));
        long b10 = b(messageObject);
        Long valueOf = Long.valueOf(b10);
        HashMap hashMap = this.h;
        TreeSet treeSet = (TreeSet) hashMap.get(valueOf);
        if (treeSet == null) {
            Long valueOf2 = Long.valueOf(b10);
            TreeSet treeSet2 = new TreeSet(Comparator$CC.reverseOrder());
            hashMap.put(valueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(messageObject.getId()));
    }

    public final void u(int i10, boolean z10) {
        MessageObject messageObject = (MessageObject) this.f48241j.remove(Integer.valueOf(i10));
        if (z10) {
            this.f48242k.remove(Integer.valueOf(i10));
        }
        this.f48243l.remove(Integer.valueOf(i10));
        this.f48239g.remove(Integer.valueOf(i10));
        if (messageObject != null) {
            long b10 = b(messageObject);
            Long valueOf = Long.valueOf(b10);
            HashMap hashMap = this.h;
            Collection collection = (Collection) hashMap.get(valueOf);
            if (collection != null) {
                collection.remove(Integer.valueOf(i10));
                if (collection.isEmpty()) {
                    hashMap.remove(Long.valueOf(b10));
                }
            }
        }
    }

    public final void w() {
        HashMap hashMap = B;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f48237c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f48238f))));
        }
    }

    public void x() {
        if (this.f48256z) {
            return;
        }
        this.f48256z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f48239g);
        c(arrayList, true, true);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f48237c);
        messagesStorage.getStorageQueue().postRunnable(new r2(this, arrayList, messagesStorage, arrayList2, 2));
    }

    public final MessageObject y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f17435id;
        MessageObject messageObject = new MessageObject(this.f48237c, storyItem);
        messageObject.generateThumbs(false);
        return messageObject;
    }

    public final void z(int i10) {
        yg.q qVar;
        Integer valueOf = Integer.valueOf(i10);
        ArrayList arrayList = this.f48236b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (qVar = this.f48254x) != null) {
            AndroidUtilities.cancelRunOnUIThread(qVar);
            AndroidUtilities.runOnUIThread(qVar, 300000L);
        }
    }
}
