package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class xp extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public org.telegram.ui.Cells.m6 D;
    public final ArrayList E;
    public TLRPC.Chat f43433a;
    public TLRPC.ChatFull f43434b;
    public final long f43435c;
    public ArrayList d;
    public FrameLayout e;
    public org.telegram.ui.Components.uk0 f43436f;
    public wp h;
    public final ArrayList f43437n;
    public LinearLayout f43438r;
    public int f43439s;
    public int f43440w;
    public org.telegram.ui.Cells.m6 f43441x;
    public org.telegram.ui.Cells.m6 f43442y;

    public xp(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f43437n = new ArrayList();
        this.f43439s = -1;
        this.E = new ArrayList();
        this.f43435c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i10, boolean z10) {
        if (this.f43439s != i10) {
            this.f43439s = i10;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.E;
                boolean z11 = true;
                if (i11 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) arrayList.get(i11);
                if (i10 != i11) {
                    z11 = false;
                }
                m6Var.a(z11, z10);
                i11++;
            }
            ArrayList arrayList2 = this.f43437n;
            if (i10 == 1) {
                if (z10) {
                    this.d.clear();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals("👍") || tL_availableReaction.reaction.equals("👎")) {
                            this.d.add(tL_availableReaction.reaction);
                        }
                    }
                    if (this.d.isEmpty() && arrayList2.size() >= 2) {
                        this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(0)).reaction);
                        this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(1)).reaction);
                    }
                }
                wp wpVar = this.h;
                if (wpVar != null && z10) {
                    wpVar.o(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                wp wpVar2 = this.h;
                if (wpVar2 != null && z10) {
                    wpVar2.p(2, arrayList2.size() + 1);
                }
            }
            wp wpVar3 = this.h;
            if (wpVar3 != null && z10) {
                wpVar3.g(1);
            }
            wp wpVar4 = this.h;
            if (wpVar4 != null && !z10) {
                wpVar4.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131746402, null));
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43437n.addAll(getMediaDataController().f18661n);
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
        p4Var.setText(org.telegram.messenger.dd.L0(2131753759, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f43438r = linearLayout;
        linearLayout.setOrientation(1);
        this.f43438r.setClickable(true);
        org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, null);
        this.f43441x = m6Var;
        m6Var.c(org.telegram.messenger.dd.L0(2131754291, null), false, true);
        org.telegram.ui.Cells.m6 m6Var2 = new org.telegram.ui.Cells.m6(context, null);
        this.f43442y = m6Var2;
        m6Var2.c(org.telegram.messenger.dd.L0(2131745310, null), false, true);
        org.telegram.ui.Cells.m6 m6Var3 = new org.telegram.ui.Cells.m6(context, null);
        this.D = m6Var3;
        m6Var3.c(org.telegram.messenger.dd.L0(2131748191, null), false, false);
        this.f43438r.addView(p4Var, w7.b6.o(-1, -2));
        this.f43438r.addView(this.f43441x, w7.b6.o(-1, -2));
        this.f43438r.addView(this.f43442y, w7.b6.o(-1, -2));
        this.f43438r.addView(this.D, w7.b6.o(-1, -2));
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.add(this.f43441x);
        arrayList.add(this.f43442y);
        arrayList.add(this.D);
        this.f43441x.setOnClickListener(new View.OnClickListener(this) {
            public final xp f42321b;

            {
                this.f42321b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final xp xpVar = this.f42321b;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar.a0(2, true);
                                        return;
                                    case 1:
                                        xpVar.a0(1, true);
                                        return;
                                    default:
                                        xpVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final xp xpVar2 = this.f42321b;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar2.a0(2, true);
                                        return;
                                    case 1:
                                        xpVar2.a0(1, true);
                                        return;
                                    default:
                                        xpVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xp xpVar3 = this.f42321b;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar3.a0(2, true);
                                        return;
                                    case 1:
                                        xpVar3.a0(1, true);
                                        return;
                                    default:
                                        xpVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f43442y.setOnClickListener(new View.OnClickListener(this) {
            public final xp f42321b;

            {
                this.f42321b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final xp xpVar = this.f42321b;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar.a0(2, true);
                                        return;
                                    case 1:
                                        xpVar.a0(1, true);
                                        return;
                                    default:
                                        xpVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final xp xpVar2 = this.f42321b;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar2.a0(2, true);
                                        return;
                                    case 1:
                                        xpVar2.a0(1, true);
                                        return;
                                    default:
                                        xpVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xp xpVar3 = this.f42321b;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar3.a0(2, true);
                                        return;
                                    case 1:
                                        xpVar3.a0(1, true);
                                        return;
                                    default:
                                        xpVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.D.setOnClickListener(new View.OnClickListener(this) {
            public final xp f42321b;

            {
                this.f42321b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final xp xpVar = this.f42321b;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar.a0(2, true);
                                        return;
                                    case 1:
                                        xpVar.a0(1, true);
                                        return;
                                    default:
                                        xpVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final xp xpVar2 = this.f42321b;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar2.a0(2, true);
                                        return;
                                    case 1:
                                        xpVar2.a0(1, true);
                                        return;
                                    default:
                                        xpVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xp xpVar3 = this.f42321b;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar3.a0(2, true);
                                        return;
                                    case 1:
                                        xpVar3.a0(1, true);
                                        return;
                                    default:
                                        xpVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        org.telegram.ui.Cells.m6 m6Var4 = this.f43441x;
        int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.ActionBar.a7.R(m6Var4, org.telegram.ui.ActionBar.t6.i0(x02, org.telegram.ui.ActionBar.t6.x0(null, i11, false)), org.telegram.ui.ActionBar.a7.N(i10), org.telegram.ui.ActionBar.a7.N(i11), null);
        org.telegram.ui.ActionBar.a7.R(this.f43442y, org.telegram.ui.ActionBar.t6.i0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false)), org.telegram.ui.ActionBar.a7.N(i10), org.telegram.ui.ActionBar.a7.N(i11), null);
        org.telegram.ui.ActionBar.a7.R(this.D, org.telegram.ui.ActionBar.t6.i0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false)), org.telegram.ui.ActionBar.a7.N(i10), org.telegram.ui.ActionBar.a7.N(i11), null);
        a0(this.f43440w, false);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f43436f = uk0Var;
        uk0Var.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.f43436f;
        wp wpVar = new wp(this, context);
        this.h = wpVar;
        uk0Var2.setAdapter(wpVar);
        this.f43436f.setOnItemClickListener(new g(this, 5));
        frameLayout.addView(this.f43436f, w7.b6.g());
        this.f43436f.r1();
        this.f43436f.setSectionsDrawBackground(true);
        this.e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == org.telegram.messenger.at.V4) {
                ArrayList arrayList = this.f43437n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().f18661n);
                this.h.f();
            } else if (i10 == org.telegram.messenger.at.f14822y1 && ((Long) objArr[0]).longValue() == (-this.f43435c)) {
                org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                if (z4Var != null && z4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f43436f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(3, this), org.telegram.ui.ActionBar.t6.f20930d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.f21331z6, org.telegram.ui.ActionBar.t6.f21021i6, org.telegram.ui.ActionBar.t6.f20873a7, org.telegram.ui.ActionBar.t6.B6, org.telegram.ui.ActionBar.t6.f21154p7, org.telegram.ui.ActionBar.t6.f20967f6, org.telegram.ui.ActionBar.t6.f20986g6, org.telegram.ui.ActionBar.t6.O6, org.telegram.ui.ActionBar.t6.P6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.wp messagesController = getMessagesController();
        long j10 = this.f43435c;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        this.f43433a = L0;
        if (L0 == null) {
            TLRPC.Chat P = org.telegram.messenger.is.a0(this.currentAccount).P(j10);
            this.f43433a = P;
            if (P != null) {
                getMessagesController().N3(this.f43433a, true);
                if (this.f43434b == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.is.a0(this.currentAccount).F0(this.f43435c, org.telegram.messenger.w3.T(this.f43433a), new CountDownLatch(1), false, false, 0);
                    this.f43434b = F0;
                    if (F0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.at.V4);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14822y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.wp messagesController = getMessagesController();
        int i10 = this.f43439s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j10 = this.f43435c;
        tL_messages_setChatAvailableReactions.peer = messagesController.i1(-j10);
        if (i10 == 2) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        } else if (i10 == 0) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsAll();
        } else {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = new TLRPC.TL_chatReactionsSome();
            tL_messages_setChatAvailableReactions.available_reactions = tL_chatReactionsSome;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = (String) arrayList.get(i11);
                tL_chatReactionsSome.reactions.add(tL_reactionEmoji);
            }
        }
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new org.telegram.messenger.rj(messagesController, j10, tL_messages_setChatAvailableReactions, 4));
        getNotificationCenter().n(this, org.telegram.messenger.at.V4);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14822y1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
