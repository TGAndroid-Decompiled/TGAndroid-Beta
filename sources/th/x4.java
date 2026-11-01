package th;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.dx0;
import org.telegram.ui.ox0;
public class x4 {
    public static HashMap B;
    public final int f49647c;
    public final long d;
    public final int e;
    public final int f49648f;
    public final AbstractSet f49652k;
    public final AbstractSet f49653l;
    public boolean f49659r;
    public boolean f49661t;
    public boolean f49662u;
    public boolean v;
    public boolean f49663w;
    public final o0 f49664x;
    public w4 f49665y;
    public boolean f49666z;
    public int f49645a = 0;
    public final ArrayList f49646b = new ArrayList();
    public final ArrayList f49649g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f49650i = new ArrayList();
    public final HashMap f49651j = new HashMap();
    public final HashSet f49654m = new HashSet();
    public boolean f49655n = true;
    public boolean f49656o = true;
    public final ArrayList f49657p = new ArrayList();
    public final u4 f49658q = new u4(this, 0);
    public int f49660s = -1;
    public int A = -1;

    public x4(int i10, long j10, int i11, int i12, r20 r20Var) {
        this.f49647c = i10;
        this.d = j10;
        this.e = i11;
        this.f49648f = i12;
        this.f49664x = new o0(10, this, r20Var);
        if (i11 == 0 && i12 > 0) {
            this.f49652k = new LinkedHashSet();
            this.f49653l = new LinkedHashSet();
        } else {
            this.f49652k = new TreeSet(Comparator$CC.reverseOrder());
            this.f49653l = new TreeSet(Comparator$CC.reverseOrder());
        }
        s();
    }

    public static long b(kj kjVar) {
        if (kjVar == null) {
            return 0L;
        }
        long j10 = kjVar.f16690k.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10 * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(kj kjVar, boolean z10, boolean z11) {
        if (kjVar != null && kjVar.x4()) {
            if (!z10 || !kj.S3(kjVar.f16690k)) {
                if ((z11 && kj.L4(kjVar.f16690k)) || (kjVar.f16694l.media instanceof TLRPC.TL_messageMediaUnsupported)) {
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
        sb2.append(e5.k0(list));
        a1.g.z("}", sb2);
        if (list != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i10);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.f20032id);
                    AbstractSet abstractSet = this.f49653l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f49652k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f20032id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f20032id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f20032id));
                        int i11 = this.f49660s;
                        if (i11 != -1) {
                            this.f49660s = i11 - 1;
                        }
                        z10 = true;
                    }
                    u(storyItem.f20032id, true);
                }
            }
            if (z10) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.f49652k, arrayList);
        v(this.f49653l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i10 = this.f49647c;
            tL_updateAlbum.peer = wp.r1(i10).i1(this.d);
            tL_updateAlbum.album_id = this.f49648f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f49648f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i10 = this.f49647c;
        int i11 = wp.r1(i10).O5;
        if (arrayList2.size() > i11) {
            arrayList2.subList(i11, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f49649g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList3.size() && arrayList3.get(i12) == arrayList2.get(i12); i12++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f20045id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = wp.r1(i10).i1(this.d);
            ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ag.c3(27));
        }
    }

    public final void D(List list, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        kj kjVar;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i11 = this.e;
        sb2.append(i11);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(e5.k0(list));
        a1.g.z("}", sb2);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            boolean z13 = false;
            while (true) {
                int size = list.size();
                i10 = this.f49648f;
                if (i12 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i12);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f20032id);
                    AbstractSet abstractSet = this.f49653l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f49652k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f20032id))) {
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
                    HashMap hashMap = this.f49651j;
                    if (z11 != z12) {
                        if (!z12) {
                            i0.a.p(storyItem2.f20032id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f20032id, true);
                            int i13 = this.f49660s;
                            if (i13 != -1) {
                                this.f49660s = i13 - 1;
                            }
                        } else if (this.f49659r) {
                            f8.b("StoriesList put story " + storyItem2.f20032id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f20032id));
                            int i14 = this.f49660s;
                            if (i14 != -1) {
                                this.f49660s = i14 + 1;
                            }
                        } else if (!this.f49662u) {
                            f8.b("StoriesList cannot put story " + storyItem2.f20032id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f49647c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f49650i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f49659r = false;
                            this.f49663w = false;
                            p(Utilities.j(size2, 50, 10), true);
                        }
                    } else if (z11 && z12 && ((kjVar = (kj) hashMap.get(Integer.valueOf(storyItem2.f20032id))) == null || z10 || (storyItem = kjVar.f16694l) == null || (storyItem != storyItem2 && (storyItem.f20032id != storyItem2.f20032id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        i0.a.p(storyItem2.f20032id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f20032id), y(storyItem2));
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
            kj kjVar = (kj) this.f49651j.get(num);
            if (kjVar != null && (storyItem = kjVar.f16694l) != null) {
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
        if (B == null || (l4 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f49647c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f49648f))))) == null || System.currentTimeMillis() - l4.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: th.x4.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z10) {
        c(this.f49650i, this.f49655n, this.f49656o);
        if (z10) {
            u4 u4Var = this.f49658q;
            org.telegram.messenger.i0.r(u4Var);
            org.telegram.messenger.i0.g3(u4Var);
        }
    }

    public kj f(int i10) {
        return (kj) this.f49651j.get(Integer.valueOf(i10));
    }

    public int g() {
        boolean z10 = this.f49656o;
        ArrayList arrayList = this.f49650i;
        if (z10 && this.f49655n) {
            if (this.f49660s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f49660s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new dx0(24));
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        int i11 = this.e;
        if (i11 == 0 && this.f49648f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f49650i;
            int size = arrayList4.size();
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList3.add(Integer.valueOf(((kj) obj).f16694l.f20032id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f49649g;
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
        return this.f49653l.size();
    }

    public void j() {
        if (this.f49661t) {
            this.v = true;
            return;
        }
        w();
        is a02 = is.a0(this.f49647c);
        a02.f16331a.c(new v4(this, a02, 1));
    }

    public boolean k() {
        if (!this.f49661t && !this.f49662u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f49653l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i10) {
        if (this.e == 0 && this.f49648f <= 0) {
            return this.f49649g.contains(Integer.valueOf(i10));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f49653l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f49649g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i10 = this.f49645a;
        this.f49645a = i10 + 1;
        this.f49646b.add(Integer.valueOf(i10));
        o0 o0Var = this.f49664x;
        if (o0Var != null) {
            org.telegram.messenger.i0.r(o0Var);
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
        if (this.f49662u || ((this.f49659r || this.f49663w || !a()) && !z10)) {
            return false;
        }
        if (this.f49661t) {
            this.f49665y = new w4(this, z10, i10, list);
            return false;
        }
        int i12 = this.e;
        long j10 = this.d;
        int i13 = this.f49647c;
        if (i12 == 0 && (i11 = this.f49648f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i11;
            tL_stories_getAlbumStories.peer = wp.r1(i13).i1(j10);
            n10 = this.f49653l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i12 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = wp.r1(i13).i1(j10);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i12 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = wp.r1(i13).i1(j10);
            tL_stories_getStoriesByID.f20039id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = wp.r1(i13).i1(j10);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i12);
        sb2.append("{");
        sb2.append(j10);
        a1.g.z("} load", sb2);
        this.f49662u = true;
        this.A = ConnectionsManager.getInstance(i13).sendRequest(tL_stories_getStoriesArchive, new org.telegram.messenger.voip.g0(this, n10, 8));
        return true;
    }

    public boolean r(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f49654m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i10));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i11 = this.f49647c;
        tL_stories_incrementStoryViews.peer = wp.r1(i11).i1(this.d);
        tL_stories_incrementStoryViews.f20043id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_incrementStoryViews, new ag.c3(4));
        at.f(i11).k(at.F5, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f49661t && !this.f49662u && !this.f49663w) {
            this.f49661t = true;
            is a02 = is.a0(this.f49647c);
            a02.f16331a.c(new v4(this, a02, 0));
        }
    }

    public final void t(kj kjVar, boolean z10) {
        AbstractSet abstractSet;
        if (kjVar == null) {
            return;
        }
        this.f49651j.put(Integer.valueOf(kjVar.f1()), kjVar);
        if (z10) {
            abstractSet = this.f49652k;
        } else {
            abstractSet = this.f49653l;
        }
        abstractSet.add(Integer.valueOf(kjVar.f1()));
        long b10 = b(kjVar);
        Long valueOf = Long.valueOf(b10);
        HashMap hashMap = this.h;
        TreeSet treeSet = (TreeSet) hashMap.get(valueOf);
        if (treeSet == null) {
            Long valueOf2 = Long.valueOf(b10);
            TreeSet treeSet2 = new TreeSet(Comparator$CC.reverseOrder());
            hashMap.put(valueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(kjVar.f1()));
    }

    public final void u(int i10, boolean z10) {
        kj kjVar = (kj) this.f49651j.remove(Integer.valueOf(i10));
        if (z10) {
            this.f49652k.remove(Integer.valueOf(i10));
        }
        this.f49653l.remove(Integer.valueOf(i10));
        this.f49649g.remove(Integer.valueOf(i10));
        if (kjVar != null) {
            long b10 = b(kjVar);
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
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f49647c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f49648f))));
        }
    }

    public void x() {
        if (this.f49666z) {
            return;
        }
        this.f49666z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f49649g);
        c(arrayList, true, true);
        is a02 = is.a0(this.f49647c);
        a02.f16331a.c(new ox0(this, arrayList, a02, arrayList2, 25));
    }

    public final kj y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f20032id;
        kj kjVar = new kj(this.f49647c, storyItem);
        kjVar.r0(false);
        return kjVar;
    }

    public final void z(int i10) {
        o0 o0Var;
        Integer valueOf = Integer.valueOf(i10);
        ArrayList arrayList = this.f49646b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (o0Var = this.f49664x) != null) {
            org.telegram.messenger.i0.r(o0Var);
            org.telegram.messenger.i0.h3(o0Var, 300000L);
        }
    }
}
