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
public final class vo extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public ro E;
    public long F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public so f52859a;
    public org.telegram.ui.Components.ek0 f52860b;
    public org.telegram.ui.ActionBar.g5 f52861c;
    public org.telegram.ui.Components.vy d;
    public uo f52862e;
    public TLRPC.Chat f52863f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f52864n;
    public org.telegram.ui.ActionBar.t1 f52865r;
    public boolean f52866s;
    public ArrayList f52867w;
    public boolean f52868x;
    public boolean f52869y;

    public static void Z(vo voVar, org.telegram.ui.ActionBar.t1[] t1VarArr) {
        try {
            t1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        t1VarArr[0] = null;
        voVar.h.linked_chat_id = 0L;
        org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(voVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.ls.T, voVar.h, 0, bool, bool);
        org.telegram.messenger.g0.h3(new ko(voVar, 2), 1000L);
        if (!voVar.f52866s) {
            voVar.finishFragment();
        }
    }

    public static void b0(vo voVar, org.telegram.ui.ActionBar.t1[] t1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.g2 g2Var) {
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            try {
                t1Var.dismiss();
            } catch (Throwable unused) {
            }
            t1VarArr[0] = null;
        }
        voVar.h.linked_chat_id = chat.f28434id;
        org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(voVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.ls.T, voVar.h, 0, bool, bool);
        org.telegram.messenger.g0.h3(new ko(voVar, 1), 1000L);
        if (g2Var != null) {
            voVar.removeSelfFromStack();
            g2Var.finishFragment();
            return;
        }
        voVar.finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29716v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29697u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29546m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131751377, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 9));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131232488);
        b10.O();
        b10.C0 = new bi.w1(this, 3);
        this.f52861c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        this.f52862e = new uo(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.d = vyVar;
        vyVar.b();
        this.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f52860b = ek0Var;
        ek0Var.r1();
        this.f52860b.setSectionsDrawBackground(true);
        this.f52860b.setEmptyView(this.d);
        this.f52860b.setLayoutManager(new v4.c0(1, false));
        org.telegram.ui.Components.ek0 ek0Var2 = this.f52860b;
        so soVar = new so(this, context);
        this.f52859a = soVar;
        ek0Var2.setAdapter(soVar);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f52860b;
        if (!org.telegram.messenger.hd.f24444a0) {
            i7 = 2;
        }
        ek0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f52860b, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        this.f52860b.setOnItemClickListener(new h(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.g2 g2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.v3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.f28434id, this, new oi.f0(21, this, g2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = null;
        if (g2Var == null) {
            t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = {t1Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.np.k1(this.f52863f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.np.k1(chat);
        org.telegram.messenger.g0.h3(new lo(this, t1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.k2(this, t1VarArr, chat, g2Var, 11), 64), 1), 500L);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ro roVar;
        TLRPC.Chat O0;
        TLRPC.Chat chat = null;
        if (i7 == org.telegram.messenger.ls.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f28435id;
            if (j3 == this.F) {
                this.h = chatFull;
                e0();
                g0();
                return;
            }
            TLRPC.Chat chat2 = this.f52864n;
            if (chat2 != null && chat2.f28434id == j3) {
                try {
                    this.f52865r.dismiss();
                } catch (Throwable unused) {
                }
                this.f52865r = null;
                f0(this.f52864n, false);
                this.f52864n = null;
            }
        } else if (i7 == org.telegram.messenger.ls.f25371r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.I8;
            if ((intValue & 8192) != 0 && this.f52863f != null) {
                TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(this.f52863f.f28434id));
                if (O02 != null) {
                    this.f52863f = O02;
                }
                if (this.f52867w.size() > 0 && (O0 = getMessagesController().O0(Long.valueOf(((TLRPC.Chat) this.f52867w.get(0)).f28434id))) != null) {
                    this.f52867w.set(0, O0);
                }
                if (this.f52866s) {
                    if (this.f52867w.size() > 0) {
                        chat = (TLRPC.Chat) this.f52867w.get(0);
                    }
                } else {
                    chat = this.f52863f;
                }
                if (chat != null && (roVar = this.E) != null) {
                    if (!this.Q) {
                        roVar.setJoinRequest(chat.join_request);
                    }
                    if (!this.P) {
                        this.E.setJoinToSend(chat.join_to_send);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25420y1) {
            if ((-this.F) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                if (r4Var != null && r4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        if (this.h.linked_chat_id != 0) {
            this.f52867w.clear();
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.h.linked_chat_id));
            if (O0 != null) {
                this.f52867w.add(O0);
            }
            org.telegram.ui.ActionBar.g5 g5Var = this.f52861c;
            if (g5Var != null) {
                g5Var.setVisibility(8);
            }
        }
        if (!this.f52868x && this.f52866s && this.h.linked_chat_id == 0) {
            this.f52868x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new l(this, 3));
        }
    }

    public final void f0(TLRPC.Chat chat, boolean z10) {
        int i7;
        String a02;
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.ChatFull P0 = getMessagesController().P0(chat.f28434id);
        int i14 = 3;
        if (P0 == null) {
            if (z10) {
                getMessagesController().b3(0, chat.f28434id, true);
                this.f52864n = chat;
                this.f52865r = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                org.telegram.messenger.g0.h3(new ko(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, null);
        textView.setTextSize(1, 16.0f);
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        if (!org.telegram.messenger.v3.t0(chat)) {
            a02 = org.telegram.messenger.hd.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751364, chat.title, this.f52863f.title);
        } else if (!org.telegram.messenger.v3.t0(this.f52863f)) {
            a02 = org.telegram.messenger.hd.a0("DiscussionLinkGroupPrivateAlert", null, 2131751366, chat.title, this.f52863f.title);
        } else {
            a02 = org.telegram.messenger.hd.a0("DiscussionLinkGroupPublicAlert", null, 2131751365, chat.title, this.f52863f.title);
        }
        if (P0.hidden_prehistory) {
            a02 = i5.c.k(2131751367, null, p5.c.n(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.g0.W2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getParentActivity());
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.hd.f24444a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(q9Var, c8.ma.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.m6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.hd.f24444a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = org.telegram.messenger.hd.f24444a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 48;
        int i16 = 76;
        if (z11) {
            i13 = 21;
        } else {
            i13 = 76;
        }
        float f10 = i13;
        if (!z11) {
            i16 = 21;
        }
        frameLayout.addView(textView2, c8.ma.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
        if (org.telegram.messenger.hd.f24444a0) {
            i14 = 5;
        }
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        b9Var.q(chat);
        q9Var.f(chat, b9Var);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751368, null), new z6(this, P0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        showDialog(alertDialog$Builder.f28777a);
    }

    public final void g0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f52866s;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.F));
        this.f52863f = O0;
        if (O0 != null) {
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = 1;
            if (z10) {
                if (this.h.linked_chat_id == 0) {
                    this.N = 2;
                    this.G = 1;
                }
                int i7 = this.N;
                this.H = i7;
                int size = this.f52867w.size() + i7;
                this.N = size;
                this.I = size;
                if (this.h.linked_chat_id != 0) {
                    this.N = size + 1;
                    this.G = size;
                }
            } else {
                this.H = 1;
                int size2 = this.f52867w.size();
                int i10 = 1 + size2;
                this.I = i10;
                this.N = size2 + 2;
                this.G = i10;
            }
            int i11 = this.N;
            this.N = i11 + 1;
            this.K = i11;
            int i12 = 0;
            if (!z10 || (this.f52867w.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z10) {
                    chat = (TLRPC.Chat) this.f52867w.get(0);
                } else {
                    chat = this.f52863f;
                }
                if (chat != null && ((!org.telegram.messenger.v3.t0(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i13 = this.N;
                    this.N = i13 + 1;
                    this.L = i13;
                }
            }
            so soVar = this.f52859a;
            if (soVar != null) {
                soVar.f();
            }
            org.telegram.ui.ActionBar.g5 g5Var = this.f52861c;
            if (g5Var != null) {
                if (this.f52867w.size() <= 10) {
                    i12 = 8;
                }
                g5Var.setVisibility(i12);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f52860b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52860b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29773y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52860b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29563n6));
        return arrayList;
    }

    public final void h0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f52860b != null) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29563n6, false);
                if (!this.R || x02 != this.S || x03 != this.T) {
                    this.R = true;
                    this.S = x02;
                    this.T = x03;
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f52860b.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f52860b.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f52860b.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f52860b.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f52860b.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f52860b.V(i10);
                            } else if (i7 == 2) {
                                O = this.f52860b.P(i10);
                            } else {
                                O = this.f52860b.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.b5) {
                                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) O;
                                b5Var.P = true;
                                b5Var.I = x02;
                                b5Var.J = x03;
                                if (i7 != 0) {
                                    ((org.telegram.ui.Cells.b5) O).d(0);
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
        getNotificationCenter().c(this, org.telegram.messenger.ls.T);
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25371r);
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25420y1);
        e0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ls.T);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25371r);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25420y1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        so soVar = this.f52859a;
        if (soVar != null) {
            soVar.f();
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
