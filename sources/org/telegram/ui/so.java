package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class so extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public oo D;
    public long E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public po f49787a;
    public org.telegram.ui.Components.pj0 f49788b;
    public org.telegram.ui.ActionBar.f5 f49789c;
    public org.telegram.ui.Components.jy d;
    public ro f49790e;
    public TLRPC.Chat f49791f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f49792n;
    public org.telegram.ui.ActionBar.u1 f49793r;
    public boolean f49794s;
    public ArrayList f49795w;
    public boolean f49796x;
    public boolean f49797y;

    public static void Z(so soVar, org.telegram.ui.ActionBar.u1[] u1VarArr) {
        try {
            u1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        u1VarArr[0] = null;
        soVar.h.linked_chat_id = 0L;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(soVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.qs.T, soVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new ho(soVar, 2), 1000L);
        if (!soVar.f49794s) {
            soVar.finishFragment();
        }
    }

    public static void b0(so soVar, org.telegram.ui.ActionBar.u1[] u1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            try {
                u1Var.dismiss();
            } catch (Throwable unused) {
            }
            u1VarArr[0] = null;
        }
        soVar.h.linked_chat_id = chat.f26956id;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(soVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.qs.T, soVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new ho(soVar, 1), 1000L);
        if (f2Var != null) {
            soVar.removeSelfFromStack();
            f2Var.finishFragment();
            return;
        }
        soVar.finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28187v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28168u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28017m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27910g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27816b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.N = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751390, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 6));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
        b10.N();
        b10.B0 = new kg.v1(this, 2);
        this.f49789c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
        this.f49790e = new ro(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.d = jyVar;
        jyVar.b();
        this.d.setText(org.telegram.messenger.id.M0(2131748168, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f49788b = pj0Var;
        pj0Var.r1();
        this.f49788b.setSectionsDrawBackground(true);
        this.f49788b.setEmptyView(this.d);
        this.f49788b.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.Components.pj0 pj0Var2 = this.f49788b;
        po poVar = new po(this, context);
        this.f49787a = poVar;
        pj0Var2.setAdapter(poVar);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f49788b;
        if (!org.telegram.messenger.id.f23157a0) {
            i7 = 2;
        }
        pj0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f49788b, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.f49788b.setOnItemClickListener(new h(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.f2 f2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.t3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.f26956id, this, new ni.c(19, this, f2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = null;
        if (f2Var == null) {
            u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = {u1Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.qp.i1(this.f49791f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.qp.i1(chat);
        org.telegram.messenger.g0.i3(new io(this, u1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.g2(this, u1VarArr, chat, f2Var, 10), 64), 1), 500L);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        oo ooVar;
        TLRPC.Chat M0;
        TLRPC.Chat chat = null;
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f26957id;
            if (j3 == this.E) {
                this.h = chatFull;
                e0();
                g0();
                return;
            }
            TLRPC.Chat chat2 = this.f49792n;
            if (chat2 != null && chat2.f26956id == j3) {
                try {
                    this.f49793r.dismiss();
                } catch (Throwable unused) {
                }
                this.f49793r = null;
                f0(this.f49792n, false);
                this.f49792n = null;
            }
        } else if (i7 == org.telegram.messenger.qs.f25063r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if ((intValue & 8192) != 0 && this.f49791f != null) {
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f49791f.f26956id));
                if (M02 != null) {
                    this.f49791f = M02;
                }
                if (this.f49795w.size() > 0 && (M0 = getMessagesController().M0(Long.valueOf(((TLRPC.Chat) this.f49795w.get(0)).f26956id))) != null) {
                    this.f49795w.set(0, M0);
                }
                if (this.f49794s) {
                    if (this.f49795w.size() > 0) {
                        chat = (TLRPC.Chat) this.f49795w.get(0);
                    }
                } else {
                    chat = this.f49791f;
                }
                if (chat != null && (ooVar = this.D) != null) {
                    if (!this.P) {
                        ooVar.setJoinRequest(chat.join_request);
                    }
                    if (!this.O) {
                        this.D.setJoinToSend(chat.join_to_send);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25112y1) {
            if ((-this.E) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var != null && q4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        if (this.h.linked_chat_id != 0) {
            this.f49795w.clear();
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.h.linked_chat_id));
            if (M0 != null) {
                this.f49795w.add(M0);
            }
            org.telegram.ui.ActionBar.f5 f5Var = this.f49789c;
            if (f5Var != null) {
                f5Var.setVisibility(8);
            }
        }
        if (!this.f49796x && this.f49794s && this.h.linked_chat_id == 0) {
            this.f49796x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new l(this, 3));
        }
    }

    public final void f0(TLRPC.Chat chat, boolean z9) {
        int i7;
        String a02;
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.ChatFull N0 = getMessagesController().N0(chat.f26956id);
        int i14 = 3;
        if (N0 == null) {
            if (z9) {
                getMessagesController().V2(0, chat.f26956id, true);
                this.f49792n = chat;
                this.f49793r = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                org.telegram.messenger.g0.i3(new ho(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, null);
        textView.setTextSize(1, 16.0f);
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        if (!org.telegram.messenger.t3.t0(chat)) {
            a02 = org.telegram.messenger.id.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751377, chat.title, this.f49791f.title);
        } else if (!org.telegram.messenger.t3.t0(this.f49791f)) {
            a02 = org.telegram.messenger.id.a0("DiscussionLinkGroupPrivateAlert", null, 2131751379, chat.title, this.f49791f.title);
        } else {
            a02 = org.telegram.messenger.id.a0("DiscussionLinkGroupPublicAlert", null, 2131751378, chat.title, this.f49791f.title);
        }
        if (N0.hidden_prehistory) {
            a02 = jg.g.l(2131751380, null, rf.b.j(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.g0.X2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getParentActivity());
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(l9Var, c8.ha.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z10 = org.telegram.messenger.id.f23157a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 48;
        int i16 = 76;
        if (z10) {
            i13 = 21;
        } else {
            i13 = 76;
        }
        float f10 = i13;
        if (!z10) {
            i16 = 21;
        }
        frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
        if (org.telegram.messenger.id.f23157a0) {
            i14 = 5;
        }
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        w8Var.q(chat);
        l9Var.e(chat, w8Var);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751381, null), new a7(this, N0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        showDialog(alertDialog$Builder.f27296a);
    }

    public final void g0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z9 = this.f49794s;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.E));
        this.f49791f = M0;
        if (M0 != null) {
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = 1;
            if (z9) {
                if (this.h.linked_chat_id == 0) {
                    this.M = 2;
                    this.F = 1;
                }
                int i7 = this.M;
                this.G = i7;
                int size = this.f49795w.size() + i7;
                this.M = size;
                this.H = size;
                if (this.h.linked_chat_id != 0) {
                    this.M = size + 1;
                    this.F = size;
                }
            } else {
                this.G = 1;
                int size2 = this.f49795w.size();
                int i10 = 1 + size2;
                this.H = i10;
                this.M = size2 + 2;
                this.F = i10;
            }
            int i11 = this.M;
            this.M = i11 + 1;
            this.J = i11;
            int i12 = 0;
            if (!z9 || (this.f49795w.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z9) {
                    chat = (TLRPC.Chat) this.f49795w.get(0);
                } else {
                    chat = this.f49791f;
                }
                if (chat != null && ((!org.telegram.messenger.t3.t0(chat) || z9) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i13 = this.M;
                    this.M = i13 + 1;
                    this.K = i13;
                }
            }
            po poVar = this.f49787a;
            if (poVar != null) {
                poVar.f();
            }
            org.telegram.ui.ActionBar.f5 f5Var = this.f49789c;
            if (f5Var != null) {
                if (this.f49795w.size() <= 10) {
                    i12 = 8;
                }
                f5Var.setVisibility(i12);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f49788b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49788b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28244y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49788b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28034n6));
        return arrayList;
    }

    public final void h0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f49788b != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28244y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28034n6, false);
                if (!this.Q || x02 != this.R || x03 != this.S) {
                    this.Q = true;
                    this.R = x02;
                    this.S = x03;
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f49788b.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f49788b.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f49788b.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f49788b.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f49788b.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f49788b.V(i10);
                            } else if (i7 == 2) {
                                O = this.f49788b.P(i10);
                            } else {
                                O = this.f49788b.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.a5) {
                                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) O;
                                a5Var.O = true;
                                a5Var.H = x02;
                                a5Var.I = x03;
                                if (i7 != 0) {
                                    ((org.telegram.ui.Cells.a5) O).d(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.qs.T);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25063r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25112y1);
        e0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.T);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25063r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25112y1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        po poVar = this.f49787a;
        if (poVar != null) {
            poVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            h0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
