package th;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.dd;
import org.telegram.messenger.dt;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.ot;
import org.telegram.messenger.q20;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nd;
import org.telegram.ui.kb0;
import org.telegram.ui.zb1;
public final class e5 {
    public static final Comparator X = Comparator$CC.comparingInt(new bi.t6(21));
    public TL_stories.TL_storiesStealthMode B;
    public final org.telegram.utils.twidget.v K;
    public int N;
    public boolean R;
    public j4.w S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int f48904a;
    public final r5 f48911k;
    public final SharedPreferences f48912l;
    public boolean f48914n;
    public String f48915o;
    public boolean f48916p;
    public boolean f48917q;
    public boolean f48918r;
    public boolean f48919s;
    public final HashSet f48920t;
    public int f48921u;
    public int v;
    public final vh.s0 f48922w;
    public String f48924y;
    public final a0.h f48905b = new a0.h();
    public final a0.h f48906c = new a0.h();
    public int d = 0;
    public final a0.h e = new a0.h();
    public LongSparseIntArray f48907f = new LongSparseIntArray();
    public final ArrayList f48908g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final a0.h f48909i = new a0.h();
    public final LongSparseIntArray f48910j = new LongSparseIntArray();
    public final a0.h f48913m = new a0.h();
    public final a0.h f48923x = new a0.h();
    public boolean f48925z = true;
    public boolean A = true;
    public final HashSet C = new HashSet();
    public final HashSet D = new HashSet();
    public final a0.h E = new a0.h();
    public final a0.h F = new a0.h();
    public final HashMap[] G = new HashMap[5];
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final bi.v6 J = new bi.v6(this, 5);
    public final HashSet L = new HashSet();
    public final a0.h M = new a0.h();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public e5(int i10) {
        this.f48915o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.f48904a = i10;
        ?? obj = new Object();
        obj.f49411a = i10;
        obj.f49412b = hs.a0(i10);
        this.f48911k = obj;
        SharedPreferences sharedPreferences = vp.r1(i10).f7;
        this.f48912l = sharedPreferences;
        this.f48915o = sharedPreferences.getString("last_stories_state", "");
        this.f48924y = sharedPreferences.getString("last_stories_state_hidden", "");
        this.v = sharedPreferences.getInt("total_stores_hidden", 0);
        this.f48921u = sharedPreferences.getInt("total_stores", 0);
        this.f48919s = sharedPreferences.getBoolean("read_loaded", false);
        this.f48920t = new HashSet(sharedPreferences.getStringSet("unsupported_stories_checked", new HashSet()));
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = null;
        String string = sharedPreferences.getString("stories_stealth_mode", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_storiesStealthMode = TL_stories.TL_storiesStealthMode.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        this.B = tL_storiesStealthMode;
        r5 r5Var = this.f48911k;
        r5Var.f49412b.f15938a.c(new o0(16, r5Var, new j4(this, 1)));
        this.K = new org.telegram.utils.twidget.v(this, i10, 4);
        this.f48922w = new vh.s0(i10);
    }

    public static org.telegram.tgnet.TLRPC.Document C(int r10, org.telegram.tgnet.tl.TL_stories.StoryItem r11) {
        throw new UnsupportedOperationException("Method not decompiled: th.e5.C(int, org.telegram.tgnet.tl.TL_stories$StoryItem):org.telegram.tgnet.TLRPC$Document");
    }

    public static boolean G(int i10, TLRPC.Document document) {
        String r10 = b8.r(null, document);
        int lastIndexOf = r10.lastIndexOf(46);
        if (!b8.G(i10).T(r10)) {
            File z10 = b8.z(4);
            StringBuilder sb2 = new StringBuilder();
            if (lastIndexOf > 0) {
                r10 = r10.substring(0, lastIndexOf);
            }
            if (!new File(z10, a1.g.r(sb2, r10, ".temp")).exists()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean P(int i10, TLRPC.Document document) {
        if (!new File(b8.z(6), b8.r(null, document)).exists()) {
            b8.G(i10);
            if (!b8.K(document, null, true, true).exists()) {
                return false;
            }
        }
        return true;
    }

    public static String a(ArrayList arrayList) {
        TL_stories.StoryItem storyItem;
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (i10 > 0) {
                    str = str + ", ";
                }
                if (((jj) arrayList.get(i10)).f16341l == null) {
                    str = str + "null";
                } else {
                    str = str + storyItem.f20031id + "@" + storyItem.dialogId;
                }
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public static TL_stories.StoryItem f(TL_stories.StoryItem storyItem, TL_stories.StoryItem storyItem2) {
        if (storyItem2 == null) {
            return storyItem;
        }
        if (storyItem != null && storyItem2.min) {
            storyItem.pinned = storyItem2.pinned;
            storyItem.isPublic = storyItem2.isPublic;
            storyItem.close_friends = storyItem2.close_friends;
            int i10 = storyItem2.date;
            if (i10 != 0) {
                storyItem.date = i10;
            }
            int i11 = storyItem2.expire_date;
            if (i11 != 0) {
                storyItem.expire_date = i11;
            }
            storyItem.caption = storyItem2.caption;
            storyItem.entities = storyItem2.entities;
            TLRPC.MessageMedia messageMedia = storyItem2.media;
            if (messageMedia != null) {
                storyItem.media = messageMedia;
            }
            return storyItem;
        }
        return storyItem2;
    }

    public static String k0(List list) {
        if (list == null) {
            return "null";
        }
        String str = "";
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                if (i10 > 0) {
                    str = str + ", ";
                }
                str = str + ((TL_stories.StoryItem) list.get(i10)).f20031id + "@" + ((TL_stories.StoryItem) list.get(i10)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final x4 A(int i10, int i11, long j10, boolean z10) {
        if (i10 == 0 && i11 > 0) {
            Long valueOf = Long.valueOf(j10);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j10), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            x4 x4Var = (x4) hashMap3.get(Integer.valueOf(i11));
            if (x4Var == null && z10) {
                x4 x4Var2 = new x4(this.f48904a, j10, i10, i11, new j4(this, 0));
                hashMap3.put(Integer.valueOf(i11), x4Var2);
                return x4Var2;
            }
            return x4Var;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i10] == null) {
            hashMapArr[i10] = new HashMap();
        }
        x4 x4Var3 = (x4) hashMapArr[i10].get(Long.valueOf(j10));
        if (x4Var3 == null && z10) {
            if (i10 == 4) {
                HashMap hashMap4 = hashMapArr[i10];
                Long valueOf2 = Long.valueOf(j10);
                q4 q4Var = new q4(this.f48904a, j10, null, new j4(this, 0));
                hashMap4.put(valueOf2, q4Var);
                return q4Var;
            }
            HashMap hashMap5 = hashMapArr[i10];
            Long valueOf3 = Long.valueOf(j10);
            x4 x4Var4 = new x4(this.f48904a, j10, i10, i11, new j4(this, 0));
            hashMap5.put(valueOf3, x4Var4);
            return x4Var4;
        }
        return x4Var3;
    }

    public final t4 B(long j10, boolean z10) {
        a0.h hVar = this.F;
        t4 t4Var = (t4) hVar.f(j10);
        if (t4Var == null && z10) {
            t4 t4Var2 = new t4(this.f48904a, j10, this);
            hVar.k(t4Var2, j10);
            return t4Var2;
        }
        return t4Var;
    }

    public final int D(boolean z10) {
        if (z10) {
            if (this.f48925z) {
                return Math.max(1, this.v);
            }
            return this.h.size();
        } else if (this.f48916p) {
            return Math.max(1, this.f48921u);
        } else {
            return this.f48908g.size();
        }
    }

    public final int E(int i10, long j10) {
        if (j10 == 0) {
            return 0;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f48909i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j10 == d20.i(this.f48904a).e() && !Utilities.x((Collection) this.f48905b.f(j10))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.f48907f.get(j10, 0));
        boolean z10 = false;
        for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
            if (peerStories.stories.get(i11).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i10 == 0 || peerStories.stories.get(i11).f20031id == i10) && peerStories.stories.get(i11).f20031id > max) {
                if (peerStories.stories.get(i11).close_friends) {
                    return 2;
                }
                z10 = true;
            }
        }
        if (Q(j10) || !z10) {
            return 0;
        }
        return 1;
    }

    public final ArrayList F(long j10) {
        return (ArrayList) this.f48905b.f(j10);
    }

    public final boolean H(long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f48909i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return false;
        }
        for (int size = peerStories.stories.size() - 1; size >= 0; size--) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(size);
            if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        if (J()) {
            ArrayList arrayList = this.f48908g;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(0)).peer) == d20.i(this.f48904a).f15165n)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J() {
        long j10 = d20.i(this.f48904a).f15165n;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f48909i.f(j10);
        if ((peerStories != null && !peerStories.stories.isEmpty()) || !Utilities.x((Collection) this.f48905b.f(j10))) {
            return true;
        }
        return false;
    }

    public final boolean K(long j10) {
        if (j10 == 0) {
            return false;
        }
        if (M(j10) || Q(j10)) {
            return true;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f48909i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null || peerStories.stories.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean L(long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f48909i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return false;
        }
        if (j10 == d20.i(this.f48904a).e() && !Utilities.x((Collection) this.f48905b.f(j10))) {
            return true;
        }
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i10);
            if (storyItem != null && storyItem.f20031id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean M(long j10) {
        ArrayList arrayList = (ArrayList) this.f48905b.f(j10);
        HashMap hashMap = (HashMap) this.e.f(j10);
        if (arrayList == null || arrayList.isEmpty()) {
            if (hashMap != null && !hashMap.isEmpty()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean N(TL_stories.StoryView storyView) {
        if (storyView == null) {
            return false;
        }
        long j10 = storyView.user_id;
        a0.h hVar = this.M;
        if (hVar.d(j10)) {
            return ((Boolean) hVar.f(storyView.user_id)).booleanValue();
        }
        if (this.Q == 0) {
            if (!storyView.blocked_my_stories_from && !storyView.blocked) {
                return false;
            }
            return true;
        }
        if (!this.L.contains(Long.valueOf(storyView.user_id)) && !storyView.blocked_my_stories_from && !storyView.blocked) {
            return false;
        }
        return true;
    }

    public final boolean O(TLRPC.User user) {
        if (user != null) {
            if (user.contact || user.f19942id == vp.r1(this.f48904a).f18833l0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Q(long j10) {
        ArrayList arrayList = (ArrayList) this.f48905b.f(j10);
        if (arrayList != null && !arrayList.isEmpty()) {
            return ((d5) i0.a.g(1, arrayList)).I;
        }
        return false;
    }

    public final void R(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = this.C;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Long.valueOf(j10));
        f8.b("StoriesController loadAllStoriesForDialog " + j10);
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        int i10 = this.f48904a;
        tL_stories_getPeerStories.peer = vp.r1(i10).i1(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getPeerStories, new kb0(this, j10, 1));
    }

    public final void S() {
        if (this.P || this.O) {
            return;
        }
        this.P = true;
        TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
        tL_contacts_getBlocked.my_stories_from = true;
        tL_contacts_getBlocked.offset = this.L.size();
        tL_contacts_getBlocked.limit = 25;
        ConnectionsManager.getInstance(this.f48904a).sendRequest(tL_contacts_getBlocked, new i4(this, 2));
    }

    public final void T(boolean z10) {
        String str;
        boolean z11;
        if (!z10 || !this.f48918r) {
            if ((!z10 && this.f48917q) || this.f48914n) {
                return;
            }
            boolean z12 = true;
            if (z10) {
                this.f48918r = true;
            } else {
                this.f48917q = true;
            }
            TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
            if (z10) {
                str = this.f48924y;
            } else {
                str = this.f48915o;
            }
            if (z10) {
                z11 = this.f48925z;
            } else {
                z11 = this.f48916p;
            }
            if (!TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.state = str;
                tL_stories_getAllStories.flags |= 1;
            }
            if (z11 && !TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.next = true;
            } else {
                z12 = false;
            }
            tL_stories_getAllStories.include_hidden = z10;
            ConnectionsManager.getInstance(this.f48904a).sendRequest(tL_stories_getAllStories, new zb1(this, z10, tL_stories_getAllStories, z12));
        }
    }

    public final void U() {
        if (!this.U && !this.V) {
            this.U = true;
            ConnectionsManager.getInstance(this.f48904a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new i4(this, 1));
        }
    }

    public final void V(final TL_stories.PeerStories peerStories, final boolean z10) {
        int i10;
        if (peerStories != null) {
            final long o10 = org.telegram.messenger.o5.o(peerStories.peer);
            if (z10) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            final long j10 = o10 * i10;
            Long valueOf = Long.valueOf(j10);
            HashSet hashSet = this.D;
            if (!hashSet.contains(valueOf)) {
                ArrayList<Integer> arrayList = null;
                for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                    if (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItemSkipped) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(Integer.valueOf(peerStories.stories.get(i11).f20031id));
                    }
                    if (arrayList != null && arrayList.size() > 14) {
                        break;
                    }
                }
                if (arrayList != null) {
                    hashSet.add(Long.valueOf(j10));
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.f20038id = arrayList;
                    int i12 = this.f48904a;
                    tL_stories_getStoriesByID.peer = vp.r1(i12).i1(o10);
                    ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.i0.g3(new org.telegram.messenger.q7(e5.this, j10, z10, peerStories, o10, tLObject));
                        }
                    });
                }
            }
        }
    }

    public final void W() {
        if (this.A) {
            this.f48914n = true;
            j4 j4Var = new j4(this, 2);
            r5 r5Var = this.f48911k;
            r5Var.f49412b.f15938a.c(new o0(13, r5Var, j4Var));
        } else {
            T(false);
            T(true);
        }
        this.A = false;
    }

    public final void X(int i10, long j10) {
        org.telegram.messenger.i0.g3(new dd(this, j10, i10, 8));
    }

    public final boolean Y(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z10) {
        if (storyItem != null && peerStories != null) {
            long o10 = org.telegram.messenger.o5.o(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i10 = this.f48907f.get(o10);
            int max = Math.max(peerStories.max_read_id, Math.max(i10, storyItem.f20031id));
            int i11 = this.f48904a;
            ot.f17304k0.c(new dt(ot.t(i11), o10, max, 1));
            peerStories.max_read_id = max;
            this.f48907f.put(o10, max);
            if (max > i10) {
                if (!z10) {
                    this.f48911k.i(max, o10);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = vp.r1(i11).i1(o10);
                tL_stories_readStories.max_id = storyItem.f20031id;
                ConnectionsManager.getInstance(i11).sendRequest(tL_stories_readStories, null);
                zs.f(i11).k(zs.F5, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void Z(long j10, TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath == null) {
            int i10 = this.f48904a;
            if (org.telegram.messenger.b6.q(i10).f()) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null && jj.K4(messageMedia.getDocument())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                storyItem.dialogId = j10;
                if (z10) {
                    TLRPC.PhotoSize w9 = b8.w(storyItem.media.getDocument().thumbs, 1000, false, null, false);
                    b8.G(i10).X(C(i10, storyItem), storyItem, 0, 1);
                    b8.G(i10).W(ic.c(w9, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
                } else {
                    TLRPC.MessageMedia messageMedia2 = storyItem.media;
                    if (messageMedia2 == null) {
                        photo = null;
                    } else {
                        photo = messageMedia2.photo;
                    }
                    if (photo != null && (arrayList = photo.sizes) != null) {
                        b8.G(i10).W(ic.i(b8.w(arrayList, Integer.MAX_VALUE, false, null, false), photo), storyItem, "jpg", 0, 1);
                    }
                }
                if (storyItem.media_areas != null) {
                    for (int i11 = 0; i11 < Math.min(2, storyItem.media_areas.size()); i11++) {
                        if (storyItem.media_areas.get(i11) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                            sg.o0 d = sg.o0.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i11)).reaction);
                            if (d.f48434f != null) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i10).f18341r.get(d.f48434f);
                                if (tL_availableReaction != null) {
                                    b8.G(i10).X(tL_availableReaction.select_animation, d, 0, 0);
                                }
                            } else {
                                org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(1, i10, d.f48435g);
                                f5Var.f25977m = true;
                                f5Var.u();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a0(TL_stories.PeerStories peerStories) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= peerStories.stories.size()) {
                break;
            } else if (peerStories.stories.get(i11).f20031id > peerStories.max_read_id) {
                i10 = i11;
                break;
            } else {
                i11++;
            }
        }
        if (!peerStories.stories.isEmpty()) {
            long o10 = org.telegram.messenger.o5.o(peerStories.peer);
            Z(o10, peerStories.stories.get(i10));
            if (i10 > 0) {
                Z(o10, peerStories.stories.get(i10 - 1));
            }
            if (i10 < peerStories.stories.size() - 1) {
                Z(o10, peerStories.stories.get(i10 + 1));
            }
        }
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        t4 B = B(j10, true);
        B.getClass();
        e5 e5Var = B.f49464j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i11 = B.f49458a;
        tL_updateAlbum.peer = vp.r1(i11).i1(B.f49459b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f20031id));
        }
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 == null) {
                ArrayList<Integer> arrayList3 = new ArrayList<>();
                storyItem.albums = arrayList3;
                arrayList3.add(Integer.valueOf(i10));
            } else if (!arrayList2.contains(Integer.valueOf(i10))) {
                storyItem.albums.add(Integer.valueOf(i10));
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        x4 A = e5Var.A(0, i10, B.f49459b, false);
        if (A != null) {
            A.D(arrayList, true);
        }
        ArrayList arrayList4 = B.h;
        int size3 = arrayList4.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList4.get(i14);
            i14++;
            x4 A2 = e5Var.A(0, ((y4) obj3).f49680a, B.f49459b, false);
            if (A2 != null) {
                A2.E(i10, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void b0(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.h;
        ArrayList arrayList3 = this.f48908g;
        if (!z12) {
            if (!z10) {
                arrayList3.clear();
            } else {
                arrayList2.clear();
            }
        }
        if (org.telegram.messenger.v2.f18448a) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < tL_stories_allStories.peer_stories.size(); i10++) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.o5.o(tL_stories_allStories.peer_stories.get(i10).peer));
            }
            f8.b("StoriesController cache=" + z11 + " hidden=" + z10 + " processAllStoriesResponse {" + ((Object) sb2) + "}");
        }
        int i11 = this.f48904a;
        vp.r1(i11).V3(tL_stories_allStories.users, z11);
        vp.r1(i11).P3(tL_stories_allStories.chats, z11);
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        for (int i12 = 0; i12 < tL_stories_allStories.peer_stories.size(); i12++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i12);
            long o10 = org.telegram.messenger.o5.o(peerStories.peer);
            int i13 = 0;
            while (i13 < peerStories.stories.size()) {
                TL_stories.StoryItem storyItem = peerStories.stories.get(i13);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    ot.f17304k0.c(new dt(ot.t(i11), o10, storyItem.f20031id, 0));
                    peerStories.stories.remove(i13);
                    i13--;
                }
                i13++;
            }
            if (!peerStories.stories.isEmpty()) {
                e0(o10, peerStories);
                for (int i14 = 0; i14 < 2; i14++) {
                    if (i14 == 0) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList3;
                    }
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        } else if (org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i15)).peer) == o10) {
                            arrayList.remove(i15);
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                if (o10 > 0) {
                    TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(o10));
                    if (Z1 != null) {
                        if (Z1.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList3.add(peerStories);
                            a0(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat L0 = vp.r1(i11).L0(Long.valueOf(-o10));
                    if (L0 != null) {
                        if (L0.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList3.add(peerStories);
                            a0(peerStories);
                        }
                    }
                }
            } else {
                this.f48909i.l(o10);
            }
        }
        if (!z11) {
            ArrayList<TL_stories.PeerStories> arrayList4 = tL_stories_allStories.peer_stories;
            r5.a aVar = new r5.a(12);
            r5 r5Var = this.f48911k;
            r5Var.f49412b.f15938a.c(new ig.k0(r5Var, arrayList4, z12, z10, aVar, 6));
        }
        org.telegram.utils.twidget.v vVar = this.K;
        org.telegram.messenger.i0.r(vVar);
        vVar.run();
    }

    public final void c(int i10, long j10, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        b(i10, j10, arrayList);
    }

    public final void c0(TL_stories.TL_updateStory tL_updateStory) {
        TLRPC.User user;
        if (tL_updateStory.story == null) {
            return;
        }
        long o10 = org.telegram.messenger.o5.o(tL_updateStory.peer);
        int i10 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
        if (i10 == 0) {
            f8.b("StoriesController can't update story dialogId == 0");
            return;
        }
        r5 r5Var = this.f48911k;
        if (i10 > 0) {
            user = vp.r1(this.f48904a).Z1(Long.valueOf(o10));
            if (user != null && (O(user) || user.self)) {
                r5Var.f49412b.f15938a.c(new o0(14, r5Var, tL_updateStory));
            }
        } else {
            r5Var.f49412b.f15938a.c(new o0(14, r5Var, tL_updateStory));
            user = null;
        }
        org.telegram.messenger.i0.g3(new ag.a3(this, o10, tL_updateStory, user, 23));
    }

    public final void d(long j10, d5 d5Var, a0.h hVar, boolean z10) {
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (z10 && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = org.telegram.messenger.m5.i(hVar, j10);
        }
        arrayList.add(d5Var);
    }

    public final void d0(long j10, TL_stories.PeerStories peerStories) {
        e0(j10, peerStories);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        r5 r5Var = this.f48911k;
        int i11 = this.f48904a;
        if (i10 > 0) {
            TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(j10));
            if (O(Z1) || Z1.self) {
                r5Var.f49412b.f15938a.c(new q5(r5Var, peerStories, 1));
            }
        } else if (org.telegram.messenger.w3.j0(vp.r1(i11).L0(Long.valueOf(-j10)))) {
            r5Var.f49412b.f15938a.c(new q5(r5Var, peerStories, 1));
        }
    }

    public final void e(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long o10 = org.telegram.messenger.o5.o(peerStories.peer);
        int i10 = this.f48904a;
        if (o10 == d20.i(i10).e()) {
            return;
        }
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i11)).peer) == o10) {
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            arrayList.add(peerStories);
        }
        vp.r1(i10).D();
    }

    public final void e0(long j10, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        a0.h hVar = this.f48909i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                if (peerStories.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                    int i11 = peerStories.stories.get(i10).f20031id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i12).f20031id == i11 && (peerStories2.stories.get(i12) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i10, peerStories2.stories.get(i12));
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        hVar.k(peerStories, j10);
    }

    public final void f0(int i10, long j10, ArrayList arrayList) {
        t4 B = B(j10, true);
        B.getClass();
        e5 e5Var = B.f49464j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i11 = B.f49458a;
        tL_updateAlbum.peer = vp.r1(i11).i1(B.f49459b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f20031id));
        }
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 != null) {
                arrayList2.remove(Integer.valueOf(i10));
                if (storyItem.albums.isEmpty()) {
                    storyItem.albums = null;
                }
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        x4 A = e5Var.A(0, i10, B.f49459b, false);
        if (A != null) {
            A.A(arrayList);
        }
        ArrayList arrayList3 = B.h;
        int size3 = arrayList3.size();
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            x4 A2 = e5Var.A(0, ((y4) obj3).f49680a, B.f49459b, false);
            if (A2 != null) {
                A2.E(i10, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void g(TL_stories.PeerStories peerStories) {
        TLRPC.Chat L0;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        ArrayList arrayList2;
        long o10 = org.telegram.messenger.o5.o(peerStories.peer);
        int i10 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
        int i11 = this.f48904a;
        TLRPC.User user = null;
        if (i10 > 0) {
            TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(o10));
            if (Z1 == null) {
                f8.b("StoriesController can't apply story user == null");
                return;
            } else {
                user = Z1;
                L0 = null;
            }
        } else {
            L0 = vp.r1(i11).L0(Long.valueOf(-o10));
            if (L0 == null) {
                f8.b("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i12 = 0;
        while (true) {
            arrayList = this.f48908g;
            z10 = true;
            if (i12 < arrayList.size()) {
                if (org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i12)).peer) == o10) {
                    arrayList.remove(i12);
                    z11 = true;
                    break;
                }
                i12++;
            } else {
                z11 = false;
                break;
            }
        }
        int i13 = 0;
        while (true) {
            arrayList2 = this.h;
            if (i13 >= arrayList2.size()) {
                break;
            } else if (org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList2.get(i13)).peer) == o10) {
                arrayList2.remove(i13);
                z11 = true;
                break;
            } else {
                i13++;
            }
        }
        if ((user == null || !user.stories_hidden) && (L0 == null || !L0.stories_hidden)) {
            z10 = false;
        }
        if (org.telegram.messenger.v2.f18448a) {
            f8.b("StoriesController move user stories to first hidden=" + z10 + " did=" + o10);
        }
        if (z10) {
            arrayList2.add(0, peerStories);
        } else {
            arrayList.add(0, peerStories);
        }
        if (!z11) {
            R(o10);
        }
        vp.r1(i11).D();
    }

    public final void g0(int i10, long j10, q20 q20Var) {
        TL_stories.PeerStories y3 = y(j10);
        if (y3 != null) {
            for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                if (y3.stories.get(i11).f20031id == i10 && !(y3.stories.get(i11) instanceof TL_stories.TL_storyItemSkipped)) {
                    q20Var.a(y3.stories.get(i11));
                    return;
                }
            }
        }
        long j11 = (i10 + j10) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j11);
        if (storyItem != null) {
            q20Var.a(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.f20038id.add(Integer.valueOf(i10));
        int i12 = this.f48904a;
        tL_stories_getStoriesByID.peer = vp.r1(i12).i1(j10);
        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesByID, new o4(this, j11, q20Var));
    }

    public final boolean h(long j10) {
        TLRPC.Chat L0;
        if (j10 >= 0 || (L0 = vp.r1(this.f48904a).L0(Long.valueOf(-j10))) == null) {
            return false;
        }
        if (!L0.creator) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights = L0.admin_rights;
            if (tL_chatAdminRights == null || !tL_chatAdminRights.edit_stories) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0(long j10, boolean z10) {
        LongSparseIntArray longSparseIntArray = this.f48910j;
        if (z10) {
            longSparseIntArray.put(j10, 1);
        } else {
            longSparseIntArray.delete(j10);
        }
    }

    public final boolean i(long j10) {
        if (d20.i(this.f48904a).e() != j10 && !h(j10)) {
            return false;
        }
        return true;
    }

    public final void i0(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.B = tL_storiesStealthMode;
        int i10 = this.f48904a;
        zs.f(i10).k(zs.D5, new Object[0]);
        SharedPreferences.Editor edit = vp.r1(i10).f7.edit();
        if (tL_storiesStealthMode == null) {
            edit.remove("stories_stealth_mode").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(tL_storiesStealthMode.getObjectSize());
        tL_storiesStealthMode.serializeToStream(serializedData);
        edit.putString("stories_stealth_mode", Utilities.f(serializedData.toByteArray())).apply();
    }

    public final boolean j(long j10) {
        TLRPC.User Z1;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f48904a;
        if (i10 < 0) {
            TLRPC.Chat L0 = vp.r1(i11).L0(Long.valueOf(-j10));
            if (L0 == null || !org.telegram.messenger.w3.R(L0)) {
                return false;
            }
            if (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_stories)) {
                return true;
            }
            return false;
        } else if (i10 > 0 && (Z1 = vp.r1(i11).Z1(Long.valueOf(j10))) != null && Z1.bot && Z1.bot_can_edit) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(long j10, TL_stories.StoryItem storyItem, sg.o0 o0Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.f20031id;
        int i10 = this.f48904a;
        tL_stories_sendReaction.peer = vp.r1(i10).i1(j10);
        if (o0Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (o0Var.f48435g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = o0Var.f48435g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (o0Var.f48434f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = o0Var.f48434f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        s0(j10, storyItem, false);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_sendReaction, new ag.c3(25));
    }

    public final void k(long j10, q20 q20Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i10 = this.f48904a;
        tL_stories_canSendStory.peer = vp.r1(i10).i1(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_canSendStory, new rh.e(this, z10, j10, q20Var, p6Var), 1024);
    }

    public final void l(ArrayList arrayList) {
        int i10;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            int size = arrayList.size();
            i10 = this.f48904a;
            if (i11 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i11);
            long o10 = org.telegram.messenger.o5.o(peerStories.peer);
            int i12 = 0;
            while (i12 < peerStories.stories.size()) {
                if (w5.w(i10, peerStories.stories.get(i12))) {
                    peerStories.stories.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (peerStories.stories.isEmpty() && !M(o10)) {
                this.f48909i.l(o10);
                arrayList.remove(peerStories);
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            zs.f(i10).k(zs.f19709v5, new Object[0]);
        }
    }

    public final void l0(long j10, boolean z10, boolean z11) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.f48908g;
        if (z10) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i10)).peer) == j10) {
                    peerStories = (TL_stories.PeerStories) arrayList.remove(i10);
                    break;
                }
                i10++;
            } else {
                peerStories = null;
                break;
            }
        }
        if (peerStories != null) {
            int i11 = 0;
            while (true) {
                if (i11 < arrayList2.size()) {
                    if (org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList2.get(i11)).peer) == j10) {
                        break;
                    }
                    i11++;
                } else {
                    arrayList2.add(0, peerStories);
                    org.telegram.utils.twidget.v vVar = this.K;
                    org.telegram.messenger.i0.r(vVar);
                    vVar.run();
                    break;
                }
            }
        }
        int i12 = this.f48904a;
        zs.f(i12).k(zs.f19709v5, new Object[0]);
        vp.r1(i12).D();
        if (z11) {
            if (j10 >= 0) {
                TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(j10));
                Z1.stories_hidden = z10;
                hs.a0(i12).m1(Collections.singletonList(Z1), null, false, true);
                vp.r1(i12).U3(Z1, false, false);
            } else {
                TLRPC.Chat L0 = vp.r1(i12).L0(Long.valueOf(-j10));
                L0.stories_hidden = z10;
                hs.a0(i12).m1(null, Collections.singletonList(L0), false, true);
                vp.r1(i12).N3(L0, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = vp.r1(i12).i1(j10);
            tL_stories_togglePeerStoriesHidden.hidden = z10;
            ConnectionsManager.getInstance(i12).sendRequest(tL_stories_togglePeerStoriesHidden, new ag.c3(25));
        }
    }

    public final void m(TL_stories.PeerStories peerStories) {
        if (peerStories != null && peerStories.stories != null) {
            int i10 = 0;
            while (i10 < peerStories.stories.size()) {
                if (w5.w(this.f48904a, peerStories.stories.get(i10))) {
                    peerStories.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            peerStories.checkedExpired = true;
        }
    }

    public final void m0(long j10, boolean z10, boolean z11) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i10 = this.f48904a;
        TLRPC.InputPeer i12 = vp.r1(i10).i1(j10);
        if (i12 instanceof TLRPC.TL_inputPeerEmpty) {
            return;
        }
        this.M.k(Boolean.valueOf(z10), j10);
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = this.L;
        if (hashSet.contains(valueOf) != z10) {
            if (z10) {
                hashSet.add(Long.valueOf(j10));
                this.N++;
            } else {
                hashSet.remove(Long.valueOf(j10));
                this.N--;
            }
        }
        if (z11) {
            if (z10) {
                TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
                tL_contacts_block.my_stories_from = true;
                tL_contacts_block.f19836id = i12;
                tL_contacts_unblock = tL_contacts_block;
            } else {
                TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                tL_contacts_unblock2.my_stories_from = true;
                tL_contacts_unblock2.f19841id = i12;
                tL_contacts_unblock = tL_contacts_unblock2;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_unblock, null);
        }
        zs.f(i10).k(zs.f19581a3, new Object[0]);
    }

    public final boolean n(org.telegram.tgnet.TLRPC.TL_error r8) {
        throw new UnsupportedOperationException("Method not decompiled: th.e5.n(org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void n0(long j10, List list) {
        ArrayList arrayList;
        StringBuilder s10 = a1.g.s(j10, "updateDeletedStoriesInLists ", " storyItems[");
        s10.append(list.size());
        s10.append("] {");
        s10.append(k0(list));
        s10.append("}");
        f8.b(s10.toString());
        x4 A = A(0, -1, j10, false);
        e5 e5Var = this;
        x4 A2 = e5Var.A(1, -1, j10, false);
        if (A != null) {
            A.A(list);
        }
        if (A2 != null) {
            A2.A(list);
        }
        int i10 = 0;
        t4 B = B(j10, false);
        if (B != null && (arrayList = B.h) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x4 A3 = e5Var.A(0, ((y4) obj).f49680a, j10, false);
                if (A3 != null) {
                    A3.A(list);
                }
                e5Var = this;
            }
        }
    }

    public final j4.w o() {
        int i10;
        int size;
        ArrayList<TL_stories.StoryItem> arrayList;
        int i11 = this.f48904a;
        if (d20.i(i11).q()) {
            i10 = vp.r1(i11).f18829k5;
        } else {
            i10 = vp.r1(i11).f18820j5;
        }
        ArrayList arrayList2 = (ArrayList) this.f48906c.f(d20.i(i11).e());
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        TL_stories.PeerStories y3 = y(d20.i(i11).e());
        if (y3 != null && (arrayList = y3.stories) != null) {
            size += arrayList.size();
        }
        if (size >= i10) {
            return new j4.w(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = vp.r1(i11).i1(d20.i(i11).e());
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_canSendStory, new i4(this, 5), 1024);
        return null;
    }

    public final void o0(long j10, List list, boolean z10) {
        TL_stories.PeerStories peerStories;
        boolean z11;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f48904a;
        if (i10 > 0) {
            TLRPC.UserFull a2 = vp.r1(i11).a2(j10);
            if (a2 != null) {
                if (a2.stories == null) {
                    if (z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        a2.stories = tL_peerStories;
                        tL_peerStories.peer = vp.r1(i11).y1(j10);
                        a2.stories.max_read_id = x(j10);
                    } else {
                        return;
                    }
                }
                peerStories = a2.stories;
            } else {
                return;
            }
        } else {
            TLRPC.ChatFull M0 = vp.r1(i11).M0(-j10);
            if (M0 != null) {
                if (M0.stories == null) {
                    if (z10) {
                        TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                        M0.stories = tL_peerStories2;
                        tL_peerStories2.peer = vp.r1(i11).y1(j10);
                        M0.stories.max_read_id = x(j10);
                    } else {
                        return;
                    }
                }
                peerStories = M0.stories;
            } else {
                return;
            }
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i12);
            int i13 = 0;
            while (true) {
                if (i13 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i13).f20031id == storyItem.f20031id) {
                        z11 = true;
                        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i13);
                        } else {
                            TL_stories.StoryItem storyItem2 = peerStories.stories.get(i13);
                            storyItem = f(storyItem2, storyItem);
                            peerStories.stories.set(i13, storyItem);
                            if (storyItem.attachPath == null) {
                                storyItem.attachPath = storyItem2.attachPath;
                            }
                            if (storyItem.firstFramePath == null) {
                                storyItem.firstFramePath = storyItem2.firstFramePath;
                            }
                            i0.a.p(storyItem.f20031id, new StringBuilder("StoriesController update story for full peer storyId="));
                        }
                    } else {
                        i13++;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    i0.a.p(storyItem.f20031id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z10) {
                    i0.a.p(storyItem.f20031id, new StringBuilder("StoriesController add new story for full peer storyId="));
                    peerStories.stories.add(storyItem);
                    peerStories.checkedExpired = false;
                }
            }
        }
    }

    public final void p(int i10, long j10) {
        String str = "233:" + j10 + ":" + i10;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.f48920t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i11 = this.f48904a;
        tL_stories_getStoriesByID.peer = vp.r1(i11).i1(j10);
        tL_stories_getStoriesByID.f20038id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new org.telegram.ui.Components.o2(this, i10, str, j10));
    }

    public final void p0(long j10, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories != null && (peerStories2 = (TL_stories.PeerStories) this.f48909i.f(j10)) != null) {
            f8.b("StoriesController update stories from full peer " + j10);
            for (int i10 = 0; i10 < peerStories2.stories.size(); i10++) {
                if (peerStories2.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                    int i11 = peerStories2.stories.get(i10).f20031id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories.stories.size()) {
                            break;
                        }
                        if (peerStories.stories.get(i12).f20031id == i11 && (peerStories.stories.get(i12) instanceof TL_stories.TL_storyItem)) {
                            peerStories2.stories.set(i10, peerStories.stories.get(i12));
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
    }

    public final void q() {
        this.f48919s = false;
        this.f48924y = "";
        this.f48915o = "";
        this.f48912l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        vh.s0 s0Var = this.f48922w;
        Objects.requireNonNull(s0Var);
        org.telegram.messenger.i0.g3(new sg.v(s0Var, 12));
        W();
        if (this.f48919s) {
            return;
        }
        ConnectionsManager.getInstance(this.f48904a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new i4(this, 0));
    }

    public final void q0(long j10, List list, boolean z10) {
        ArrayList arrayList;
        StringBuilder s10 = a1.g.s(j10, "updateStoriesInLists ", " storyItems[");
        s10.append(list.size());
        s10.append("] {");
        s10.append(k0(list));
        s10.append("}");
        f8.b(s10.toString());
        x4 A = A(0, -1, j10, false);
        e5 e5Var = this;
        x4 A2 = e5Var.A(1, -1, j10, false);
        if (A != null) {
            A.D(list, z10);
        }
        if (A2 != null) {
            A2.D(list, z10);
        }
        ArrayList arrayList2 = e5Var.I;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ((r4) obj).D(list, z10);
        }
        t4 B = B(j10, false);
        if (B != null && (arrayList = B.h) != null) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                int i12 = i10 + 1;
                x4 A3 = e5Var.A(0, ((y4) arrayList.get(i10)).f49680a, j10, false);
                if (A3 != null) {
                    A3.D(list, z10);
                }
                e5Var = this;
                i10 = i12;
            }
        }
    }

    public final void r(long j10, String str, q20 q20Var) {
        t4 B = B(j10, true);
        int i10 = B.f49458a;
        if (B.f49463i) {
            return;
        }
        B.f49463i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = vp.r1(i10).i1(B.f49459b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_createAlbum, new rh.h5(4, B, q20Var));
    }

    public final void r0(long j10, ArrayList arrayList, boolean z10, nd ndVar) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories y3 = y(j10);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z10;
                togglepinned.f20045id.add(Integer.valueOf(storyItem.f20031id));
                if (y3 != null) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f20031id == storyItem.f20031id) {
                            y3.stories.get(i11).pinned = z10;
                            this.f48911k.k(j10, storyItem);
                        }
                    }
                }
            }
        }
        f8.b("StoriesController updateStoriesPinned");
        q0(j10, arrayList, false);
        o0(j10, arrayList, false);
        togglepinned.pinned = z10;
        int i12 = this.f48904a;
        togglepinned.peer = vp.r1(i12).i1(j10);
        ConnectionsManager.getInstance(i12).sendRequest(togglepinned, new rh.m5(ndVar, 1));
    }

    public final void s(ArrayList arrayList, long j10) {
        TLRPC.ChatFull M0;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull a2;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i10 = this.f48904a;
        tL_stories_deleteStories.peer = vp.r1(i10).i1(j10);
        a0.h hVar = this.f48909i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        } else if (peerStories2.stories.get(i12).f20031id == storyItem.f20031id) {
                            peerStories2.stories.remove(i12);
                            if (peerStories2.stories.isEmpty()) {
                                hVar.l(j10);
                            }
                        } else {
                            i12++;
                        }
                    }
                }
                tL_stories_deleteStories.f20034id.add(Integer.valueOf(storyItem.f20031id));
            }
        }
        if (j10 < 0 ? !((M0 = vp.r1(i10).M0(-j10)) == null || (peerStories = M0.stories) == null) : !((a2 = vp.r1(i10).a2(j10)) == null || (peerStories = a2.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i13);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= peerStories2.stories.size()) {
                        break;
                    } else if (peerStories2.stories.get(i14).f20031id == storyItem2.f20031id) {
                        peerStories2.stories.remove(i14);
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_deleteStories, new i4(this, 3));
        n0(j10, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.f20034id;
        r5 r5Var = this.f48911k;
        r5Var.f49412b.f15938a.c(new p5(r5Var, arrayList2, j10, 1));
        zs.f(i10).k(zs.f19709v5, new Object[0]);
    }

    public final void s0(long j10, TL_stories.StoryItem storyItem, boolean z10) {
        String str;
        StringBuilder s10 = a1.g.s(j10, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.f20031id + "@" + storyItem.dialogId;
        }
        s10.append(str);
        f8.b(s10.toString());
        q0(j10, Collections.singletonList(storyItem), z10);
        this.f48911k.k(j10, storyItem);
        o0(j10, Collections.singletonList(storyItem), false);
    }

    public final d5 t(long j10, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.e.f(j10);
        if (hashMap != null && !hashMap.isEmpty()) {
            return (d5) hashMap.get(Integer.valueOf(storyItem.f20031id));
        }
        return null;
    }

    public final void t0(long j10, int i10, TLRPC.Reaction reaction) {
        TL_stories.StoryItem u10 = u(i10, j10);
        if (u10 != null) {
            u10.sent_reaction = reaction;
            if (reaction != null) {
                u10.flags |= 32768;
            } else {
                u10.flags &= -32769;
            }
            s0(j10, u10, false);
        }
    }

    public final TL_stories.StoryItem u(int i10, long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f48909i.f(j10);
        if (peerStories != null) {
            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                if (peerStories.stories.get(i11).f20031id == i10) {
                    return peerStories.stories.get(i11);
                }
            }
            return null;
        }
        return null;
    }

    public final void v(ArrayList arrayList) {
        boolean z10;
        TLRPC.User Z1;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i10);
            long o10 = org.telegram.messenger.o5.o(peerStories.peer);
            if (o10 > 0 && (Z1 = vp.r1(this.f48904a).Z1(Long.valueOf(o10))) != null && !O(Z1)) {
                arrayList.remove(i10);
                i10--;
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = 0;
            while (i11 < peerStories.stories.size()) {
                if (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (!z10 && peerStories.stories.isEmpty() && !M(o10)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final String w(int i10, long j10) {
        y4 b10;
        t4 B = B(j10, false);
        if (B != null && (b10 = B.b(i10)) != null) {
            return b10.f49681b;
        }
        return null;
    }

    public final int x(long j10) {
        TL_stories.PeerStories y3 = y(j10);
        if (y3 == null) {
            y3 = z(j10);
        }
        if (y3 != null) {
            return Math.max(y3.max_read_id, this.f48907f.get(j10, 0));
        }
        return this.f48907f.get(j10, 0);
    }

    public final TL_stories.PeerStories y(long j10) {
        return (TL_stories.PeerStories) this.f48909i.f(j10);
    }

    public final TL_stories.PeerStories z(long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f48904a;
        if (i10 > 0) {
            TLRPC.UserFull a2 = vp.r1(i11).a2(j10);
            if (a2 != null && (peerStories2 = a2.stories) != null && !peerStories2.checkedExpired) {
                m(peerStories2);
            }
            if (a2 == null) {
                return null;
            }
            return a2.stories;
        }
        TLRPC.ChatFull M0 = vp.r1(i11).M0(-j10);
        if (M0 != null && (peerStories = M0.stories) != null && !peerStories.checkedExpired) {
            m(peerStories);
        }
        if (M0 == null) {
            return null;
        }
        return M0.stories;
    }
}
