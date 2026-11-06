package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class zo extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public org.telegram.ui.Cells.i6 D;
    public final ArrayList E;
    public TLRPC.Chat f52624a;
    public TLRPC.ChatFull f52625b;
    public final long f52626c;
    public ArrayList d;
    public FrameLayout f52627e;
    public org.telegram.ui.Components.pj0 f52628f;
    public yo h;
    public final ArrayList f52629n;
    public LinearLayout f52630r;
    public int f52631s;
    public int f52632w;
    public org.telegram.ui.Cells.i6 f52633x;
    public org.telegram.ui.Cells.i6 f52634y;

    public zo(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f52629n = new ArrayList();
        this.f52631s = -1;
        this.E = new ArrayList();
        this.f52626c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i7, boolean z9) {
        if (this.f52631s != i7) {
            this.f52631s = i7;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.E;
                boolean z10 = true;
                if (i10 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) arrayList.get(i10);
                if (i7 != i10) {
                    z10 = false;
                }
                i6Var.a(z10, z9);
                i10++;
            }
            ArrayList arrayList2 = this.f52629n;
            if (i7 == 1) {
                if (z9) {
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
                yo yoVar = this.h;
                if (yoVar != null && z9) {
                    yoVar.o(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                yo yoVar2 = this.h;
                if (yoVar2 != null && z9) {
                    yoVar2.p(2, arrayList2.size() + 1);
                }
            }
            yo yoVar3 = this.h;
            if (yoVar3 != null && z9) {
                yoVar3.g(1);
            }
            yo yoVar4 = this.h;
            if (yoVar4 != null && !z9) {
                yoVar4.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746386, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f52629n.addAll(getMediaDataController().f25817n);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        n4Var.setText(org.telegram.messenger.hd.M0(2131753759, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f52630r = linearLayout;
        linearLayout.setOrientation(1);
        this.f52630r.setClickable(true);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.f52633x = i6Var;
        i6Var.c(org.telegram.messenger.hd.M0(2131754291, null), false, true);
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, null);
        this.f52634y = i6Var2;
        i6Var2.c(org.telegram.messenger.hd.M0(2131745293, null), false, true);
        org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(context, null);
        this.D = i6Var3;
        i6Var3.c(org.telegram.messenger.hd.M0(2131748174, null), false, false);
        this.f52630r.addView(n4Var, c8.ha.o(-1, -2));
        this.f52630r.addView(this.f52633x, c8.ha.o(-1, -2));
        this.f52630r.addView(this.f52634y, c8.ha.o(-1, -2));
        this.f52630r.addView(this.D, c8.ha.o(-1, -2));
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.add(this.f52633x);
        arrayList.add(this.f52634y);
        arrayList.add(this.D);
        this.f52633x.setOnClickListener(new View.OnClickListener(this) {
            public final zo f51467b;

            {
                this.f51467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final zo zoVar = this.f51467b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zoVar.a0(2, true);
                                        return;
                                    case 1:
                                        zoVar.a0(1, true);
                                        return;
                                    default:
                                        zoVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final zo zoVar2 = this.f51467b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zoVar2.a0(2, true);
                                        return;
                                    case 1:
                                        zoVar2.a0(1, true);
                                        return;
                                    default:
                                        zoVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final zo zoVar3 = this.f51467b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zoVar3.a0(2, true);
                                        return;
                                    case 1:
                                        zoVar3.a0(1, true);
                                        return;
                                    default:
                                        zoVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f52634y.setOnClickListener(new View.OnClickListener(this) {
            public final zo f51467b;

            {
                this.f51467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final zo zoVar = this.f51467b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zoVar.a0(2, true);
                                        return;
                                    case 1:
                                        zoVar.a0(1, true);
                                        return;
                                    default:
                                        zoVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final zo zoVar2 = this.f51467b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zoVar2.a0(2, true);
                                        return;
                                    case 1:
                                        zoVar2.a0(1, true);
                                        return;
                                    default:
                                        zoVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final zo zoVar3 = this.f51467b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zoVar3.a0(2, true);
                                        return;
                                    case 1:
                                        zoVar3.a0(1, true);
                                        return;
                                    default:
                                        zoVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.D.setOnClickListener(new View.OnClickListener(this) {
            public final zo f51467b;

            {
                this.f51467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final zo zoVar = this.f51467b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zoVar.a0(2, true);
                                        return;
                                    case 1:
                                        zoVar.a0(1, true);
                                        return;
                                    default:
                                        zoVar.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final zo zoVar2 = this.f51467b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zoVar2.a0(2, true);
                                        return;
                                    case 1:
                                        zoVar2.a0(1, true);
                                        return;
                                    default:
                                        zoVar2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final zo zoVar3 = this.f51467b;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zoVar3.a0(2, true);
                                        return;
                                    case 1:
                                        zoVar3.a0(1, true);
                                        return;
                                    default:
                                        zoVar3.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        org.telegram.ui.Cells.i6 i6Var4 = this.f52633x;
        int i7 = org.telegram.ui.ActionBar.k6.f27848d6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.ActionBar.r6.R(i6Var4, org.telegram.ui.ActionBar.k6.i0(x02, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.ui.ActionBar.r6.N(i7), org.telegram.ui.ActionBar.r6.N(i10), null);
        org.telegram.ui.ActionBar.r6.R(this.f52634y, org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.x0(null, i7, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.ui.ActionBar.r6.N(i7), org.telegram.ui.ActionBar.r6.N(i10), null);
        org.telegram.ui.ActionBar.r6.R(this.D, org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.x0(null, i7, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.ui.ActionBar.r6.N(i7), org.telegram.ui.ActionBar.r6.N(i10), null);
        a0(this.f52632w, false);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f52628f = pj0Var;
        pj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.f52628f;
        yo yoVar = new yo(this, context);
        this.h = yoVar;
        pj0Var2.setAdapter(yoVar);
        this.f52628f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f52628f, c8.ha.g());
        this.f52628f.r1();
        this.f52628f.setSectionsDrawBackground(true);
        this.f52627e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.f52627e;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.qs.V4) {
                ArrayList arrayList = this.f52629n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().f25817n);
                this.h.f();
            } else if (i7 == org.telegram.messenger.qs.f25095y1 && ((Long) objArr[0]).longValue() == (-this.f52626c)) {
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
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f52628f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(3, this), org.telegram.ui.ActionBar.k6.f27848d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f28258z6, org.telegram.ui.ActionBar.k6.f27940i6, org.telegram.ui.ActionBar.k6.f27792a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f28069p7, org.telegram.ui.ActionBar.k6.f27886f6, org.telegram.ui.ActionBar.k6.f27903g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.f52626c;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        this.f52624a = M0;
        if (M0 == null) {
            TLRPC.Chat P = org.telegram.messenger.yr.a0(this.currentAccount).P(j3);
            this.f52624a = P;
            if (P != null) {
                getMessagesController().Q3(this.f52624a, true);
                if (this.f52625b == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.yr.a0(this.currentAccount).F0(this.f52626c, org.telegram.messenger.t3.T(this.f52624a), new CountDownLatch(1), false, false, 0);
                    this.f52625b = F0;
                    if (F0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.qs.V4);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25095y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qp messagesController = getMessagesController();
        int i7 = this.f52631s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j3 = this.f52626c;
        tL_messages_setChatAvailableReactions.peer = messagesController.j1(-j3);
        if (i7 == 2) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        } else if (i7 == 0) {
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
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new org.telegram.messenger.oj(messagesController, j3, tL_messages_setChatAvailableReactions, 4));
        getNotificationCenter().n(this, org.telegram.messenger.qs.V4);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25095y1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
