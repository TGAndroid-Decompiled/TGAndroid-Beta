package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class xo extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public org.telegram.ui.Cells.h6 E;
    public final ArrayList F;
    public TLRPC.Chat f52057a;
    public TLRPC.ChatFull f52058b;
    public final long f52059c;
    public ArrayList d;
    public FrameLayout f52060e;
    public org.telegram.ui.Components.tj0 f52061f;
    public wo h;
    public final ArrayList f52062n;
    public LinearLayout f52063r;
    public int f52064s;
    public int f52065w;
    public org.telegram.ui.Cells.h6 f52066x;
    public org.telegram.ui.Cells.h6 f52067y;

    public xo(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f52062n = new ArrayList();
        this.f52064s = -1;
        this.F = new ArrayList();
        this.f52059c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i3, boolean z10) {
        if (this.f52064s != i3) {
            this.f52064s = i3;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.F;
                boolean z11 = true;
                if (i10 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) arrayList.get(i10);
                if (i3 != i10) {
                    z11 = false;
                }
                h6Var.a(z11, z10);
                i10++;
            }
            ArrayList arrayList2 = this.f52062n;
            if (i3 == 1) {
                if (z10) {
                    this.d.clear();
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
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
                wo woVar = this.h;
                if (woVar != null && z10) {
                    woVar.o(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                wo woVar2 = this.h;
                if (woVar2 != null && z10) {
                    woVar2.p(2, arrayList2.size() + 1);
                }
            }
            wo woVar3 = this.h;
            if (woVar3 != null && z10) {
                woVar3.g(1);
            }
            wo woVar4 = this.h;
            if (woVar4 != null && !z10) {
                woVar4.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746395, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f52062n.addAll(getMediaDataController().f24036n);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        n4Var.setText(org.telegram.messenger.bd.M0(2131753759, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f52063r = linearLayout;
        linearLayout.setOrientation(1);
        this.f52063r.setClickable(true);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.f52066x = h6Var;
        h6Var.c(org.telegram.messenger.bd.M0(2131754291, null), false, true);
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, null);
        this.f52067y = h6Var2;
        h6Var2.c(org.telegram.messenger.bd.M0(2131745302, null), false, true);
        org.telegram.ui.Cells.h6 h6Var3 = new org.telegram.ui.Cells.h6(context, null);
        this.E = h6Var3;
        h6Var3.c(org.telegram.messenger.bd.M0(2131748183, null), false, false);
        this.f52063r.addView(n4Var, b8.mf.o(-1, -2));
        this.f52063r.addView(this.f52066x, b8.mf.o(-1, -2));
        this.f52063r.addView(this.f52067y, b8.mf.o(-1, -2));
        this.f52063r.addView(this.E, b8.mf.o(-1, -2));
        ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.add(this.f52066x);
        arrayList.add(this.f52067y);
        arrayList.add(this.E);
        this.f52066x.setOnClickListener(new View.OnClickListener(this) {
            public final xo f50161b;

            {
                this.f50161b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final xo xoVar = this.f50161b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xoVar.a0(2, true);
                                        return;
                                    case 1:
                                        xoVar.a0(1, true);
                                        return;
                                    default:
                                        xoVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final xo xoVar2 = this.f50161b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xoVar2.a0(2, true);
                                        return;
                                    case 1:
                                        xoVar2.a0(1, true);
                                        return;
                                    default:
                                        xoVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xo xoVar3 = this.f50161b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xoVar3.a0(2, true);
                                        return;
                                    case 1:
                                        xoVar3.a0(1, true);
                                        return;
                                    default:
                                        xoVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f52067y.setOnClickListener(new View.OnClickListener(this) {
            public final xo f50161b;

            {
                this.f50161b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final xo xoVar = this.f50161b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xoVar.a0(2, true);
                                        return;
                                    case 1:
                                        xoVar.a0(1, true);
                                        return;
                                    default:
                                        xoVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final xo xoVar2 = this.f50161b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xoVar2.a0(2, true);
                                        return;
                                    case 1:
                                        xoVar2.a0(1, true);
                                        return;
                                    default:
                                        xoVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xo xoVar3 = this.f50161b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xoVar3.a0(2, true);
                                        return;
                                    case 1:
                                        xoVar3.a0(1, true);
                                        return;
                                    default:
                                        xoVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final xo f50161b;

            {
                this.f50161b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final xo xoVar = this.f50161b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xoVar.a0(2, true);
                                        return;
                                    case 1:
                                        xoVar.a0(1, true);
                                        return;
                                    default:
                                        xoVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final xo xoVar2 = this.f50161b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xoVar2.a0(2, true);
                                        return;
                                    case 1:
                                        xoVar2.a0(1, true);
                                        return;
                                    default:
                                        xoVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xo xoVar3 = this.f50161b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xoVar3.a0(2, true);
                                        return;
                                    case 1:
                                        xoVar3.a0(1, true);
                                        return;
                                    default:
                                        xoVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        org.telegram.ui.Cells.h6 h6Var4 = this.f52066x;
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.r6.R(h6Var4, org.telegram.ui.ActionBar.k6.i0(x02, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.ui.ActionBar.r6.N(i3), org.telegram.ui.ActionBar.r6.N(i10), null);
        org.telegram.ui.ActionBar.r6.R(this.f52067y, org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.ui.ActionBar.r6.N(i3), org.telegram.ui.ActionBar.r6.N(i10), null);
        org.telegram.ui.ActionBar.r6.R(this.E, org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.ui.ActionBar.r6.N(i3), org.telegram.ui.ActionBar.r6.N(i10), null);
        a0(this.f52065w, false);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f52061f = tj0Var;
        tj0Var.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.f52061f;
        wo woVar = new wo(this, context);
        this.h = woVar;
        tj0Var2.setAdapter(woVar);
        this.f52061f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f52061f, b8.mf.g());
        this.f52061f.r1();
        this.f52061f.setSectionsDrawBackground(true);
        this.f52060e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.f52060e;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i3 == org.telegram.messenger.hs.V4) {
                ArrayList arrayList = this.f52062n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().f24036n);
                this.h.f();
            } else if (i3 == org.telegram.messenger.hs.f23341y1 && ((Long) objArr[0]).longValue() == (-this.f52059c)) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var != null && q4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f52061f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(3, this), org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f28290z6, org.telegram.ui.ActionBar.k6.f27972i6, org.telegram.ui.ActionBar.k6.f27824a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f28102p7, org.telegram.ui.ActionBar.k6.f27917f6, org.telegram.ui.ActionBar.k6.f27937g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.f52059c;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        this.f52057a = M0;
        if (M0 == null) {
            TLRPC.Chat P = org.telegram.messenger.qr.a0(this.currentAccount).P(j10);
            this.f52057a = P;
            if (P != null) {
                getMessagesController().Q3(this.f52057a, true);
                if (this.f52058b == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.qr.a0(this.currentAccount).F0(this.f52059c, org.telegram.messenger.t3.T(this.f52057a), new CountDownLatch(1), false, false, 0);
                    this.f52058b = F0;
                    if (F0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.hs.V4);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23341y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hp messagesController = getMessagesController();
        int i3 = this.f52064s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j10 = this.f52059c;
        tL_messages_setChatAvailableReactions.peer = messagesController.j1(-j10);
        if (i3 == 2) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        } else if (i3 == 0) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsAll();
        } else {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = new TLRPC.TL_chatReactionsSome();
            tL_messages_setChatAvailableReactions.available_reactions = tL_chatReactionsSome;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = (String) arrayList.get(i10);
                tL_chatReactionsSome.reactions.add(tL_reactionEmoji);
            }
        }
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new org.telegram.messenger.fj(messagesController, j10, tL_messages_setChatAvailableReactions, 4));
        getNotificationCenter().n(this, org.telegram.messenger.hs.V4);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23341y1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
