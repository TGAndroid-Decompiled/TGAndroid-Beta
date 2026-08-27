package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class qp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.g6 A;
    public ArrayList B;
    public boolean C;

    public TLRPC.Chat f41718a;

    public TLRPC.ChatFull f41719b;

    public long f41720c;
    public ArrayList d;

    public LinearLayout f41721e;

    public org.telegram.ui.Components.zk0 f41722f;
    public pp h;

    public org.telegram.ui.Cells.p8 f41723n;

    public ArrayList f41724r;

    public LinearLayout f41725s;
    public int v;

    public int f41726w;

    public org.telegram.ui.Cells.g6 f41727x;

    public org.telegram.ui.Cells.g6 f41728y;

    public final void V(int i10, boolean z10) {
        pp ppVar;
        ArrayList arrayList = this.B;
        ArrayList arrayList2 = this.f41724r;
        if (this.v == i10) {
            return;
        }
        org.telegram.ui.Cells.p8 p8Var = this.f41723n;
        if (p8Var != null) {
            boolean z11 = i10 == 1 || i10 == 0;
            p8Var.setChecked(z11);
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, z11 ? org.telegram.ui.ActionBar.g6.f23090f6 : org.telegram.ui.ActionBar.g6.f23072e6, false);
            if (z11) {
                this.f41723n.b(iW0, z11);
            } else {
                this.f41723n.setBackgroundColorAnimatedReverse(iW0);
            }
        }
        this.v = i10;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ((org.telegram.ui.Cells.g6) arrayList.get(i11)).a(i10 == i11, z10);
            i11++;
        }
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
            pp ppVar2 = this.h;
            if (ppVar2 != null && z10) {
                ppVar2.s(this.C ? 1 : 2, arrayList2.size() + 1);
            }
        } else if (!this.d.isEmpty()) {
            this.d.clear();
            pp ppVar3 = this.h;
            if (ppVar3 != null && z10) {
                ppVar3.t(this.C ? 1 : 2, arrayList2.size() + 1);
            }
        }
        if (!this.C && (ppVar = this.h) != null && z10) {
            ppVar.m(1);
        }
        pp ppVar4 = this.h;
        if (ppVar4 == null || z10) {
            return;
        }
        ppVar4.l();
    }

    public final void W() {
        this.f41721e.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        org.telegram.ui.Cells.p8 p8Var = this.f41723n;
        if (p8Var != null) {
            p8Var.d(org.telegram.ui.ActionBar.g6.f23108g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.B;
        this.C = ChatObject.isChannelAndNotMegaGroup(this.f41720c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 29));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f41724r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.C) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            this.f41723n = p8Var;
            p8Var.setHeight(56);
            this.f41723n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.p8 p8Var2 = this.f41723n;
            p8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, p8Var2.f25003e.h ? org.telegram.ui.ActionBar.g6.f23090f6 : org.telegram.ui.ActionBar.g6.f23072e6, false));
            this.f41723n.setTypeface(AndroidUtilities.bold());
            final int i10 = 0;
            this.f41723n.setOnClickListener(new View.OnClickListener(this) {

                public final qp f40893b;

                {
                    this.f40893b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            qp qpVar = this.f40893b;
                            qpVar.V(qpVar.f41723n.f25003e.h ? 2 : 1, true);
                            break;
                        case 1:
                            final int i11 = 0;
                            final qp qpVar2 = this.f40893b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            qpVar2.V(0, true);
                                            break;
                                        case 1:
                                            qpVar2.V(1, true);
                                            break;
                                        default:
                                            qpVar2.V(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 2:
                            final int i12 = 1;
                            final qp qpVar3 = this.f40893b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            qpVar3.V(0, true);
                                            break;
                                        case 1:
                                            qpVar3.V(1, true);
                                            break;
                                        default:
                                            qpVar3.V(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i13 = 2;
                            final qp qpVar4 = this.f40893b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            qpVar4.V(0, true);
                                            break;
                                        case 1:
                                            qpVar4.V(1, true);
                                            break;
                                        default:
                                            qpVar4.V(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            linearLayout.addView(this.f41723n, h7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
        j4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f41725s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, null);
        this.f41727x = g6Var;
        g6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, null);
        this.f41728y = g6Var2;
        g6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.g6 g6Var3 = new org.telegram.ui.Cells.g6(context, null);
        this.A = g6Var3;
        g6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f41725s.addView(j4Var, h7.z5.n(-1, -2));
        this.f41725s.addView(this.f41727x, h7.z5.n(-1, -2));
        this.f41725s.addView(this.f41728y, h7.z5.n(-1, -2));
        this.f41725s.addView(this.A, h7.z5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f41727x);
        arrayList.add(this.f41728y);
        arrayList.add(this.A);
        final int i11 = 1;
        this.f41727x.setOnClickListener(new View.OnClickListener(this) {

            public final qp f40893b;

            {
                this.f40893b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        qp qpVar = this.f40893b;
                        qpVar.V(qpVar.f41723n.f25003e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i12 = 0;
                        final qp qpVar2 = this.f40893b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        qpVar2.V(0, true);
                                        break;
                                    case 1:
                                        qpVar2.V(1, true);
                                        break;
                                    default:
                                        qpVar2.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i13 = 1;
                        final qp qpVar3 = this.f40893b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        qpVar3.V(0, true);
                                        break;
                                    case 1:
                                        qpVar3.V(1, true);
                                        break;
                                    default:
                                        qpVar3.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i14 = 2;
                        final qp qpVar4 = this.f40893b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        qpVar4.V(0, true);
                                        break;
                                    case 1:
                                        qpVar4.V(1, true);
                                        break;
                                    default:
                                        qpVar4.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i12 = 2;
        this.f41728y.setOnClickListener(new View.OnClickListener(this) {

            public final qp f40893b;

            {
                this.f40893b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        qp qpVar = this.f40893b;
                        qpVar.V(qpVar.f41723n.f25003e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i13 = 0;
                        final qp qpVar2 = this.f40893b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        qpVar2.V(0, true);
                                        break;
                                    case 1:
                                        qpVar2.V(1, true);
                                        break;
                                    default:
                                        qpVar2.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i14 = 1;
                        final qp qpVar3 = this.f40893b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        qpVar3.V(0, true);
                                        break;
                                    case 1:
                                        qpVar3.V(1, true);
                                        break;
                                    default:
                                        qpVar3.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i15 = 2;
                        final qp qpVar4 = this.f40893b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        qpVar4.V(0, true);
                                        break;
                                    case 1:
                                        qpVar4.V(1, true);
                                        break;
                                    default:
                                        qpVar4.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i13 = 3;
        this.A.setOnClickListener(new View.OnClickListener(this) {

            public final qp f40893b;

            {
                this.f40893b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        qp qpVar = this.f40893b;
                        qpVar.V(qpVar.f41723n.f25003e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i14 = 0;
                        final qp qpVar2 = this.f40893b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        qpVar2.V(0, true);
                                        break;
                                    case 1:
                                        qpVar2.V(1, true);
                                        break;
                                    default:
                                        qpVar2.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i15 = 1;
                        final qp qpVar3 = this.f40893b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        qpVar3.V(0, true);
                                        break;
                                    case 1:
                                        qpVar3.V(1, true);
                                        break;
                                    default:
                                        qpVar3.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i16 = 2;
                        final qp qpVar4 = this.f40893b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i16) {
                                    case 0:
                                        qpVar4.V(0, true);
                                        break;
                                    case 1:
                                        qpVar4.V(1, true);
                                        break;
                                    default:
                                        qpVar4.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        int i14 = org.telegram.ui.ActionBar.g6.f23053d6;
        j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        org.telegram.ui.Cells.g6 g6Var4 = this.f41727x;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        int i15 = org.telegram.ui.ActionBar.g6.f23144i6;
        g6Var4.setBackground(org.telegram.ui.ActionBar.g6.g0(iW0, org.telegram.ui.ActionBar.g6.w0(null, i15, false)));
        this.f41728y.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), org.telegram.ui.ActionBar.g6.w0(null, i15, false)));
        this.A.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), org.telegram.ui.ActionBar.g6.w0(null, i15, false)));
        V(this.f41726w, false);
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f41722f = zk0Var;
        zk0Var.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var2 = this.f41722f;
        pp ppVar = new pp(this, context);
        this.h = ppVar;
        zk0Var2.setAdapter(ppVar);
        this.f41722f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f41722f, h7.z5.l(1.0f, -1, 0));
        this.f41722f.p1();
        this.actionBar.setAdaptiveBackground(this.f41722f);
        this.f41721e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.f41721e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f41724r;
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.reactionsDidLoad) {
            arrayList.clear();
            arrayList.addAll(getMediaDataController().getEnabledReactionsList());
            this.h.l();
        } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f41720c)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return h7.c6.a(new e(this, 8), org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.f23441z6, org.telegram.ui.ActionBar.g6.f23144i6, org.telegram.ui.ActionBar.g6.f22999a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.f23269p7, org.telegram.ui.ActionBar.g6.f23090f6, org.telegram.ui.ActionBar.g6.f23108g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f41720c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
