package th;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class x3 {
    public int f49615a;
    public final TL_stories.StoryItem f49616b;
    public final long f49617c;
    public final int d;
    public boolean e;
    public final boolean f49618f;
    public final boolean f49621j;
    public final boolean f49622k;
    public boolean f49623l;
    public String f49625n;
    public final boolean f49628q;
    public final ArrayList f49619g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f49620i = new ArrayList();
    public boolean f49624m = true;
    public int f49626o = -1;
    public final HashSet f49627p = new HashSet();
    public final ArrayList f49629r = new ArrayList();
    public final l3 f49630s = new l3();

    public x3(int i10, long j10, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i11;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f49616b = storyItem;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49618f = z10;
        this.f49617c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f49615a = i11;
        if (i11 < 200) {
            this.f49628q = true;
        }
        if (w5.v(storyItem) && !d20.i(i10).q()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f49621j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f49621j = false;
            this.f49622k = true;
        }
        if (!this.f49621j) {
            this.f49623l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l4 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l4.longValue();
                    if (vp.r1(i10).Z1(l4) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f49619g.add(tL_storyView);
                    }
                }
            }
        }
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        if (!this.f49618f) {
            ArrayList arrayList = this.f49619g;
            arrayList.clear();
            l3 l3Var = this.f49630s;
            boolean z11 = l3Var.f49168b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(l3Var.f49169c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(l3Var.f49169c)) {
                    str = l3Var.f49169c.trim().toLowerCase();
                    str2 = cd.D0().R0(str, true, false);
                    str4 = sc.e.h(" ", str);
                    str3 = sc.e.h(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User Z1 = vp.r1(this.d).Z1(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                    if (l3Var.f49168b && (Z1 == null || !Z1.contact)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && str != null) {
                        String lowerCase = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name).toLowerCase();
                        String n10 = h20.n(Z1);
                        String N3 = org.telegram.messenger.i0.N3(lowerCase);
                        if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !N3.startsWith(str2) && !N3.contains(str3) && (n10 == null || (!n10.startsWith(str2) && !n10.contains(str3)))) {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i10));
                    }
                }
            }
            if (!l3Var.f49167a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new bi.t6(20)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f49618f) {
            arrayList = this.f49620i;
        } else {
            arrayList = this.f49619g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.e && this.f49624m && !this.f49621j) {
            boolean z10 = this.f49618f;
            int i10 = 100;
            long j10 = this.f49617c;
            l3 l3Var = this.f49630s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f49616b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = l3Var.f49167a;
                tL_getStoryReactionsList.f20032id = storyItem.f20031id;
                tL_getStoryReactionsList.peer = vp.r1(i11).i1(j10);
                if (this.f49623l || this.f49620i.size() < 20) {
                    i10 = 20;
                }
                tL_getStoryReactionsList.limit = i10;
                String str = this.f49625n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.e = true;
                f8.b("SelfStoryViewsPage reactions load next " + storyItem.f20031id + " " + this.f49623l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final x3 f49539b;

                    {
                        this.f49539b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final x3 x3Var = this.f49539b;
                                final int[] iArr = r2;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                x3 x3Var2 = x3Var;
                                                ArrayList arrayList = x3Var2.f49629r;
                                                ArrayList arrayList2 = x3Var2.h;
                                                int i12 = x3Var2.d;
                                                ArrayList arrayList3 = x3Var2.f49619g;
                                                TL_stories.StoryItem storyItem2 = x3Var2.f49616b;
                                                if (iArr[0] != x3Var2.f49626o) {
                                                    f8.b("SelfStoryViewsPage " + storyItem2.f20031id + " localId != reqId");
                                                    return;
                                                }
                                                x3Var2.e = false;
                                                x3Var2.f49626o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = vp.r1(i12).O1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    vp.r1(i12).V3(storyViewsList.users, false);
                                                    vp.r1(i12).P3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    hs.a0(i12).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (x3Var2.f49623l) {
                                                        x3Var2.f49623l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            x3Var2.f49627p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (x3Var2.f49628q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        x3Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        x3Var2.f49624m = true;
                                                    } else {
                                                        x3Var2.f49624m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    x3Var2.f49625n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        x3Var2.f49624m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = c3.i0.k(i16, 1, storyViewsList.users.get(i16).f19942id, storyItem2.views.recent_viewers)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i17 = storyViews2.reactions_count;
                                                    int i18 = storyViewsList.reactions_count;
                                                    if (i17 != i18) {
                                                        storyViews2.reactions_count = i18;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        zs.f(i12).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        x3Var2.f49615a = 0;
                                                    }
                                                    x3Var2.f49624m = false;
                                                }
                                                f8.b("SelfStoryViewsPage " + storyItem2.f20031id + " response  totalItems " + arrayList3.size() + " has next " + x3Var2.f49624m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((y3) arrayList.get(i19)).e(x3Var2);
                                                }
                                                if (arrayList3.size() < 20 && x3Var2.f49624m) {
                                                    x3Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                x3 x3Var3 = x3Var;
                                                ArrayList arrayList4 = x3Var3.f49629r;
                                                TL_stories.StoryItem storyItem3 = x3Var3.f49616b;
                                                int i20 = x3Var3.d;
                                                ArrayList arrayList5 = x3Var3.f49620i;
                                                if (iArr[0] != x3Var3.f49626o) {
                                                    f8.b("SelfStoryViewsPage reactions " + storyItem3.f20031id + " localId != reqId");
                                                    return;
                                                }
                                                x3Var3.e = false;
                                                x3Var3.f49626o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    vp.r1(i20).V3(tL_storyReactionsList.users, false);
                                                    vp.r1(i20).P3(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    hs.a0(i20).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (x3Var3.f49623l) {
                                                        x3Var3.f49623l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            x3Var3.f49627p.add(Long.valueOf(org.telegram.messenger.o5.o(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        x3Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        x3Var3.f49624m = true;
                                                    } else {
                                                        x3Var3.f49624m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    x3Var3.f49625n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        x3Var3.f49624m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = x3Var3.f49615a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    x3Var3.f49615a = i23;
                                                    if (z13) {
                                                        zs.f(i20).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        x3Var3.f49615a = 0;
                                                    }
                                                    x3Var3.f49624m = false;
                                                }
                                                f8.b("SelfStoryViewsPage reactions " + storyItem3.f20031id + " response  totalItems " + arrayList5.size() + " has next " + x3Var3.f49624m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((y3) arrayList4.get(i24)).e(x3Var3);
                                                }
                                                if (arrayList5.size() < 20 && x3Var3.f49624m) {
                                                    x3Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final x3 x3Var2 = this.f49539b;
                                final int[] iArr2 = r2;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                x3 x3Var22 = x3Var2;
                                                ArrayList arrayList = x3Var22.f49629r;
                                                ArrayList arrayList2 = x3Var22.h;
                                                int i12 = x3Var22.d;
                                                ArrayList arrayList3 = x3Var22.f49619g;
                                                TL_stories.StoryItem storyItem2 = x3Var22.f49616b;
                                                if (iArr2[0] != x3Var22.f49626o) {
                                                    f8.b("SelfStoryViewsPage " + storyItem2.f20031id + " localId != reqId");
                                                    return;
                                                }
                                                x3Var22.e = false;
                                                x3Var22.f49626o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = vp.r1(i12).O1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    vp.r1(i12).V3(storyViewsList.users, false);
                                                    vp.r1(i12).P3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    hs.a0(i12).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (x3Var22.f49623l) {
                                                        x3Var22.f49623l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            x3Var22.f49627p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (x3Var22.f49628q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        x3Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        x3Var22.f49624m = true;
                                                    } else {
                                                        x3Var22.f49624m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    x3Var22.f49625n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        x3Var22.f49624m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = c3.i0.k(i16, 1, storyViewsList.users.get(i16).f19942id, storyItem2.views.recent_viewers)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i17 = storyViews2.reactions_count;
                                                    int i18 = storyViewsList.reactions_count;
                                                    if (i17 != i18) {
                                                        storyViews2.reactions_count = i18;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        zs.f(i12).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        x3Var22.f49615a = 0;
                                                    }
                                                    x3Var22.f49624m = false;
                                                }
                                                f8.b("SelfStoryViewsPage " + storyItem2.f20031id + " response  totalItems " + arrayList3.size() + " has next " + x3Var22.f49624m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((y3) arrayList.get(i19)).e(x3Var22);
                                                }
                                                if (arrayList3.size() < 20 && x3Var22.f49624m) {
                                                    x3Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                x3 x3Var3 = x3Var2;
                                                ArrayList arrayList4 = x3Var3.f49629r;
                                                TL_stories.StoryItem storyItem3 = x3Var3.f49616b;
                                                int i20 = x3Var3.d;
                                                ArrayList arrayList5 = x3Var3.f49620i;
                                                if (iArr2[0] != x3Var3.f49626o) {
                                                    f8.b("SelfStoryViewsPage reactions " + storyItem3.f20031id + " localId != reqId");
                                                    return;
                                                }
                                                x3Var3.e = false;
                                                x3Var3.f49626o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    vp.r1(i20).V3(tL_storyReactionsList.users, false);
                                                    vp.r1(i20).P3(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    hs.a0(i20).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (x3Var3.f49623l) {
                                                        x3Var3.f49623l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            x3Var3.f49627p.add(Long.valueOf(org.telegram.messenger.o5.o(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        x3Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        x3Var3.f49624m = true;
                                                    } else {
                                                        x3Var3.f49624m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    x3Var3.f49625n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        x3Var3.f49624m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = x3Var3.f49615a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    x3Var3.f49615a = i23;
                                                    if (z13) {
                                                        zs.f(i20).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        x3Var3.f49615a = 0;
                                                    }
                                                    x3Var3.f49624m = false;
                                                }
                                                f8.b("SelfStoryViewsPage reactions " + storyItem3.f20031id + " response  totalItems " + arrayList5.size() + " has next " + x3Var3.f49624m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((y3) arrayList4.get(i24)).e(x3Var3);
                                                }
                                                if (arrayList5.size() < 20 && x3Var3.f49624m) {
                                                    x3Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
                this.f49626o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f20040id = storyItem.f20031id;
            tL_stories_getStoryViewsList.peer = vp.r1(i11).i1(j10);
            if (this.f49628q) {
                tL_stories_getStoryViewsList.f20041q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = l3Var.f49169c;
                tL_stories_getStoryViewsList.f20041q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = l3Var.f49168b;
                tL_stories_getStoryViewsList.reactions_first = l3Var.f49167a;
            }
            if (this.f49623l || this.f49619g.size() < 20) {
                i10 = 20;
            }
            tL_stories_getStoryViewsList.limit = i10;
            String str3 = this.f49625n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.e = true;
            f8.b("SelfStoryViewsPage load next " + storyItem.f20031id + " " + this.f49623l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f20041q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final x3 f49539b;

                {
                    this.f49539b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final x3 x3Var = this.f49539b;
                            final int[] iArr2 = r2;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            x3 x3Var22 = x3Var;
                                            ArrayList arrayList = x3Var22.f49629r;
                                            ArrayList arrayList2 = x3Var22.h;
                                            int i12 = x3Var22.d;
                                            ArrayList arrayList3 = x3Var22.f49619g;
                                            TL_stories.StoryItem storyItem2 = x3Var22.f49616b;
                                            if (iArr2[0] != x3Var22.f49626o) {
                                                f8.b("SelfStoryViewsPage " + storyItem2.f20031id + " localId != reqId");
                                                return;
                                            }
                                            x3Var22.e = false;
                                            x3Var22.f49626o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = vp.r1(i12).O1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                vp.r1(i12).V3(storyViewsList.users, false);
                                                vp.r1(i12).P3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                hs.a0(i12).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (x3Var22.f49623l) {
                                                    x3Var22.f49623l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        x3Var22.f49627p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (x3Var22.f49628q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    x3Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    x3Var22.f49624m = true;
                                                } else {
                                                    x3Var22.f49624m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                x3Var22.f49625n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    x3Var22.f49624m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = c3.i0.k(i16, 1, storyViewsList.users.get(i16).f19942id, storyItem2.views.recent_viewers)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i17 = storyViews2.reactions_count;
                                                int i18 = storyViewsList.reactions_count;
                                                if (i17 != i18) {
                                                    storyViews2.reactions_count = i18;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    zs.f(i12).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    x3Var22.f49615a = 0;
                                                }
                                                x3Var22.f49624m = false;
                                            }
                                            f8.b("SelfStoryViewsPage " + storyItem2.f20031id + " response  totalItems " + arrayList3.size() + " has next " + x3Var22.f49624m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((y3) arrayList.get(i19)).e(x3Var22);
                                            }
                                            if (arrayList3.size() < 20 && x3Var22.f49624m) {
                                                x3Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            x3 x3Var3 = x3Var;
                                            ArrayList arrayList4 = x3Var3.f49629r;
                                            TL_stories.StoryItem storyItem3 = x3Var3.f49616b;
                                            int i20 = x3Var3.d;
                                            ArrayList arrayList5 = x3Var3.f49620i;
                                            if (iArr2[0] != x3Var3.f49626o) {
                                                f8.b("SelfStoryViewsPage reactions " + storyItem3.f20031id + " localId != reqId");
                                                return;
                                            }
                                            x3Var3.e = false;
                                            x3Var3.f49626o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                vp.r1(i20).V3(tL_storyReactionsList.users, false);
                                                vp.r1(i20).P3(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                hs.a0(i20).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (x3Var3.f49623l) {
                                                    x3Var3.f49623l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        x3Var3.f49627p.add(Long.valueOf(org.telegram.messenger.o5.o(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    x3Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    x3Var3.f49624m = true;
                                                } else {
                                                    x3Var3.f49624m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                x3Var3.f49625n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    x3Var3.f49624m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = x3Var3.f49615a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                x3Var3.f49615a = i23;
                                                if (z13) {
                                                    zs.f(i20).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    x3Var3.f49615a = 0;
                                                }
                                                x3Var3.f49624m = false;
                                            }
                                            f8.b("SelfStoryViewsPage reactions " + storyItem3.f20031id + " response  totalItems " + arrayList5.size() + " has next " + x3Var3.f49624m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((y3) arrayList4.get(i24)).e(x3Var3);
                                            }
                                            if (arrayList5.size() < 20 && x3Var3.f49624m) {
                                                x3Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final x3 x3Var2 = this.f49539b;
                            final int[] iArr22 = r2;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            x3 x3Var22 = x3Var2;
                                            ArrayList arrayList = x3Var22.f49629r;
                                            ArrayList arrayList2 = x3Var22.h;
                                            int i12 = x3Var22.d;
                                            ArrayList arrayList3 = x3Var22.f49619g;
                                            TL_stories.StoryItem storyItem2 = x3Var22.f49616b;
                                            if (iArr22[0] != x3Var22.f49626o) {
                                                f8.b("SelfStoryViewsPage " + storyItem2.f20031id + " localId != reqId");
                                                return;
                                            }
                                            x3Var22.e = false;
                                            x3Var22.f49626o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = vp.r1(i12).O1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                vp.r1(i12).V3(storyViewsList.users, false);
                                                vp.r1(i12).P3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                hs.a0(i12).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (x3Var22.f49623l) {
                                                    x3Var22.f49623l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        x3Var22.f49627p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (x3Var22.f49628q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    x3Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    x3Var22.f49624m = true;
                                                } else {
                                                    x3Var22.f49624m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                x3Var22.f49625n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    x3Var22.f49624m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = c3.i0.k(i16, 1, storyViewsList.users.get(i16).f19942id, storyItem2.views.recent_viewers)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i17 = storyViews2.reactions_count;
                                                int i18 = storyViewsList.reactions_count;
                                                if (i17 != i18) {
                                                    storyViews2.reactions_count = i18;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    zs.f(i12).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    x3Var22.f49615a = 0;
                                                }
                                                x3Var22.f49624m = false;
                                            }
                                            f8.b("SelfStoryViewsPage " + storyItem2.f20031id + " response  totalItems " + arrayList3.size() + " has next " + x3Var22.f49624m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((y3) arrayList.get(i19)).e(x3Var22);
                                            }
                                            if (arrayList3.size() < 20 && x3Var22.f49624m) {
                                                x3Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            x3 x3Var3 = x3Var2;
                                            ArrayList arrayList4 = x3Var3.f49629r;
                                            TL_stories.StoryItem storyItem3 = x3Var3.f49616b;
                                            int i20 = x3Var3.d;
                                            ArrayList arrayList5 = x3Var3.f49620i;
                                            if (iArr22[0] != x3Var3.f49626o) {
                                                f8.b("SelfStoryViewsPage reactions " + storyItem3.f20031id + " localId != reqId");
                                                return;
                                            }
                                            x3Var3.e = false;
                                            x3Var3.f49626o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                vp.r1(i20).V3(tL_storyReactionsList.users, false);
                                                vp.r1(i20).P3(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                hs.a0(i20).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (x3Var3.f49623l) {
                                                    x3Var3.f49623l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        x3Var3.f49627p.add(Long.valueOf(org.telegram.messenger.o5.o(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    x3Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    x3Var3.f49624m = true;
                                                } else {
                                                    x3Var3.f49624m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                x3Var3.f49625n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    x3Var3.f49624m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = x3Var3.f49615a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                x3Var3.f49615a = i23;
                                                if (z13) {
                                                    zs.f(i20).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    x3Var3.f49615a = 0;
                                                }
                                                x3Var3.f49624m = false;
                                            }
                                            f8.b("SelfStoryViewsPage reactions " + storyItem3.f20031id + " response  totalItems " + arrayList5.size() + " has next " + x3Var3.f49624m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((y3) arrayList4.get(i24)).e(x3Var3);
                                            }
                                            if (arrayList5.size() < 20 && x3Var3.f49624m) {
                                                x3Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            this.f49626o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f49626o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f49626o, false);
        }
        this.f49626o = -1;
    }

    public final void e(l3 l3Var, boolean z10, boolean z11) {
        l3 l3Var2 = new l3();
        l3Var2.f49167a = l3Var.f49167a;
        l3Var2.f49168b = l3Var.f49168b;
        l3Var2.f49169c = l3Var.f49169c;
        int i10 = 0;
        if (!z10) {
            l3Var2.f49168b = false;
        }
        if (!z11) {
            l3Var2.f49167a = true;
        }
        l3 l3Var3 = this.f49630s;
        if (!l3Var3.equals(l3Var2)) {
            l3Var3.f49167a = l3Var2.f49167a;
            l3Var3.f49168b = l3Var2.f49168b;
            l3Var3.f49169c = l3Var2.f49169c;
            if (!this.f49618f && this.f49628q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f49629r;
                    if (i10 < arrayList.size()) {
                        ((y3) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f49619g.clear();
                this.f49620i.clear();
                this.f49623l = true;
                this.e = false;
                this.f49624m = true;
                this.f49625n = "";
                c();
            }
        }
    }
}
