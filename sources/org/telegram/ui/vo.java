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
public final class vo extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
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
    public so f52823a;
    public org.telegram.ui.Components.ck0 f52824b;
    public org.telegram.ui.ActionBar.h5 f52825c;
    public org.telegram.ui.Components.ty d;
    public uo f52826e;
    public TLRPC.Chat f52827f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f52828n;
    public org.telegram.ui.ActionBar.u1 f52829r;
    public boolean f52830s;
    public ArrayList f52831w;
    public boolean f52832x;
    public boolean f52833y;

    public static void Z(vo voVar, org.telegram.ui.ActionBar.u1[] u1VarArr) {
        try {
            u1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        u1VarArr[0] = null;
        voVar.h.linked_chat_id = 0L;
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(voVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.ks.T, voVar.h, 0, bool, bool);
        org.telegram.messenger.g0.h3(new ko(voVar, 2), 1000L);
        if (!voVar.f52830s) {
            voVar.finishFragment();
        }
    }

    public static void b0(vo voVar, org.telegram.ui.ActionBar.u1[] u1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.h2 h2Var) {
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            try {
                u1Var.dismiss();
            } catch (Throwable unused) {
            }
            u1VarArr[0] = null;
        }
        voVar.h.linked_chat_id = chat.f28405id;
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(voVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.ks.T, voVar.h, 0, bool, bool);
        org.telegram.messenger.g0.h3(new ko(voVar, 1), 1000L);
        if (h2Var != null) {
            voVar.removeSelfFromStack();
            h2Var.finishFragment();
            return;
        }
        voVar.finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29712u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29561m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29454g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29360b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29397d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29488i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131751378, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 9));
        org.telegram.ui.ActionBar.h5 b10 = this.simpleActionBar.t().b(0, 2131232488);
        b10.O();
        b10.C0 = new bi.s1(this, 3);
        this.f52825c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
        this.f52826e = new uo(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.d = tyVar;
        tyVar.b();
        this.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f52824b = ck0Var;
        ck0Var.r1();
        this.f52824b.setSectionsDrawBackground(true);
        this.f52824b.setEmptyView(this.d);
        this.f52824b.setLayoutManager(new v4.c0(1, false));
        org.telegram.ui.Components.ck0 ck0Var2 = this.f52824b;
        so soVar = new so(this, context);
        this.f52823a = soVar;
        ck0Var2.setAdapter(soVar);
        org.telegram.ui.Components.ck0 ck0Var3 = this.f52824b;
        if (!org.telegram.messenger.gd.f24216a0) {
            i7 = 2;
        }
        ck0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f52824b, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        this.f52824b.setOnItemClickListener(new h(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.h2 h2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.v3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.f28405id, this, new oi.e0(21, this, h2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = null;
        if (h2Var == null) {
            u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = {u1Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.mp.k1(this.f52827f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.mp.k1(chat);
        org.telegram.messenger.g0.h3(new lo(this, u1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.g2(this, u1VarArr, chat, h2Var, 11), 64), 1), 500L);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ro roVar;
        TLRPC.Chat O0;
        TLRPC.Chat chat = null;
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f28406id;
            if (j3 == this.F) {
                this.h = chatFull;
                e0();
                g0();
                return;
            }
            TLRPC.Chat chat2 = this.f52828n;
            if (chat2 != null && chat2.f28405id == j3) {
                try {
                    this.f52829r.dismiss();
                } catch (Throwable unused) {
                }
                this.f52829r = null;
                f0(this.f52828n, false);
                this.f52828n = null;
            }
        } else if (i7 == org.telegram.messenger.ks.f25179r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if ((intValue & 8192) != 0 && this.f52827f != null) {
                TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(this.f52827f.f28405id));
                if (O02 != null) {
                    this.f52827f = O02;
                }
                if (this.f52831w.size() > 0 && (O0 = getMessagesController().O0(Long.valueOf(((TLRPC.Chat) this.f52831w.get(0)).f28405id))) != null) {
                    this.f52831w.set(0, O0);
                }
                if (this.f52830s) {
                    if (this.f52831w.size() > 0) {
                        chat = (TLRPC.Chat) this.f52831w.get(0);
                    }
                } else {
                    chat = this.f52827f;
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
        } else if (i7 == org.telegram.messenger.ks.f25228y1) {
            if ((-this.F) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
                if (s4Var != null && s4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        if (this.h.linked_chat_id != 0) {
            this.f52831w.clear();
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.h.linked_chat_id));
            if (O0 != null) {
                this.f52831w.add(O0);
            }
            org.telegram.ui.ActionBar.h5 h5Var = this.f52825c;
            if (h5Var != null) {
                h5Var.setVisibility(8);
            }
        }
        if (!this.f52832x && this.f52830s && this.h.linked_chat_id == 0) {
            this.f52832x = true;
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
        TLRPC.ChatFull P0 = getMessagesController().P0(chat.f28405id);
        int i14 = 3;
        if (P0 == null) {
            if (z10) {
                getMessagesController().b3(0, chat.f28405id, true);
                this.f52828n = chat;
                this.f52829r = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                org.telegram.messenger.g0.h3(new ko(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, null);
        textView.setTextSize(1, 16.0f);
        if (org.telegram.messenger.gd.f24216a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        if (!org.telegram.messenger.v3.t0(chat)) {
            a02 = org.telegram.messenger.gd.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751365, chat.title, this.f52827f.title);
        } else if (!org.telegram.messenger.v3.t0(this.f52827f)) {
            a02 = org.telegram.messenger.gd.a0("DiscussionLinkGroupPrivateAlert", null, 2131751367, chat.title, this.f52827f.title);
        } else {
            a02 = org.telegram.messenger.gd.a0("DiscussionLinkGroupPublicAlert", null, 2131751366, chat.title, this.f52827f.title);
        }
        if (P0.hidden_prehistory) {
            a02 = i5.c.k(2131751368, null, p5.c.n(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.g0.W2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getParentActivity());
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.gd.f24216a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(q9Var, c8.ma.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.gd.f24216a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = org.telegram.messenger.gd.f24216a0;
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
        if (org.telegram.messenger.gd.f24216a0) {
            i14 = 5;
        }
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        b9Var.q(chat);
        q9Var.f(chat, b9Var);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751369, null), new z6(this, P0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        showDialog(alertDialog$Builder.f28746a);
    }

    public final void g0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f52830s;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.F));
        this.f52827f = O0;
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
                int size = this.f52831w.size() + i7;
                this.N = size;
                this.I = size;
                if (this.h.linked_chat_id != 0) {
                    this.N = size + 1;
                    this.G = size;
                }
            } else {
                this.H = 1;
                int size2 = this.f52831w.size();
                int i10 = 1 + size2;
                this.I = i10;
                this.N = size2 + 2;
                this.G = i10;
            }
            int i11 = this.N;
            this.N = i11 + 1;
            this.K = i11;
            int i12 = 0;
            if (!z10 || (this.f52831w.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z10) {
                    chat = (TLRPC.Chat) this.f52831w.get(0);
                } else {
                    chat = this.f52827f;
                }
                if (chat != null && ((!org.telegram.messenger.v3.t0(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i13 = this.N;
                    this.N = i13 + 1;
                    this.L = i13;
                }
            }
            so soVar = this.f52823a;
            if (soVar != null) {
                soVar.f();
            }
            org.telegram.ui.ActionBar.h5 h5Var = this.f52825c;
            if (h5Var != null) {
                if (this.f52831w.size() <= 10) {
                    i12 = 8;
                }
                h5Var.setVisibility(i12);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f52824b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52824b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29788y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52824b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29578n6));
        return arrayList;
    }

    public final void h0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f52824b != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29578n6, false);
                if (!this.R || x02 != this.S || x03 != this.T) {
                    this.R = true;
                    this.S = x02;
                    this.T = x03;
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f52824b.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f52824b.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f52824b.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f52824b.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f52824b.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f52824b.V(i10);
                            } else if (i7 == 2) {
                                O = this.f52824b.P(i10);
                            } else {
                                O = this.f52824b.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.a5) {
                                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) O;
                                a5Var.P = true;
                                a5Var.I = x02;
                                a5Var.J = x03;
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
        getNotificationCenter().c(this, org.telegram.messenger.ks.T);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25179r);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25228y1);
        e0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.T);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25179r);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25228y1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        so soVar = this.f52823a;
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
