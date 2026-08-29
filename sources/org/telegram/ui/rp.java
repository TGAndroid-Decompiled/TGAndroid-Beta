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
public final class rp extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.h6 A;
    public ArrayList B;
    public boolean C;
    public TLRPC.Chat f42170a;
    public TLRPC.ChatFull f42171b;
    public long f42172c;
    public ArrayList d;
    public LinearLayout f42173e;
    public org.telegram.ui.Components.jl0 f42174f;
    public qp h;
    public org.telegram.ui.Cells.q8 f42175n;
    public ArrayList f42176r;
    public LinearLayout f42177s;
    public int v;
    public int f42178w;
    public org.telegram.ui.Cells.h6 f42179x;
    public org.telegram.ui.Cells.h6 f42180y;

    public final void V(int i10, boolean z10) {
        qp qpVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.B;
        ArrayList arrayList2 = this.f42176r;
        if (this.v != i10) {
            org.telegram.ui.Cells.q8 q8Var = this.f42175n;
            if (q8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                q8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.g6.f23099f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.g6.f23080e6;
                }
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
                if (z12) {
                    this.f42175n.b(w02, z12);
                } else {
                    this.f42175n.setBackgroundColorAnimatedReverse(w02);
                }
            }
            this.v = i10;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) arrayList.get(i12);
                if (i10 == i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h6Var.a(z11, z10);
            }
            int i13 = 2;
            if (i10 == 1) {
                if (z10) {
                    this.d.clear();
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList2.get(i14);
                        i14++;
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
                qp qpVar2 = this.h;
                if (qpVar2 != null && z10) {
                    if (this.C) {
                        i13 = 1;
                    }
                    qpVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                qp qpVar3 = this.h;
                if (qpVar3 != null && z10) {
                    if (this.C) {
                        i13 = 1;
                    }
                    qpVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.C && (qpVar = this.h) != null && z10) {
                qpVar.m(1);
            }
            qp qpVar4 = this.h;
            if (qpVar4 != null && !z10) {
                qpVar4.l();
            }
        }
    }

    public final void W() {
        this.f42173e.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Cells.q8 q8Var = this.f42175n;
        if (q8Var != null) {
            q8Var.d(org.telegram.ui.ActionBar.g6.f23117g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.B;
        this.C = ChatObject.isChannelAndNotMegaGroup(this.f42172c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f42176r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.C) {
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            this.f42175n = q8Var;
            q8Var.setHeight(56);
            this.f42175n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.q8 q8Var2 = this.f42175n;
            if (q8Var2.f25083e.h) {
                i10 = org.telegram.ui.ActionBar.g6.f23099f6;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f23080e6;
            }
            q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            this.f42175n.setTypeface(AndroidUtilities.bold());
            this.f42175n.setOnClickListener(new View.OnClickListener(this) {
                public final rp f41207b;

                {
                    this.f41207b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            rp rpVar = this.f41207b;
                            if (rpVar.f42175n.f25083e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            rpVar.V(i11, true);
                            return;
                        case 1:
                            final rp rpVar2 = this.f41207b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            rpVar2.V(0, true);
                                            return;
                                        case 1:
                                            rpVar2.V(1, true);
                                            return;
                                        default:
                                            rpVar2.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final rp rpVar3 = this.f41207b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            rpVar3.V(0, true);
                                            return;
                                        case 1:
                                            rpVar3.V(1, true);
                                            return;
                                        default:
                                            rpVar3.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final rp rpVar4 = this.f41207b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            rpVar4.V(0, true);
                                            return;
                                        case 1:
                                            rpVar4.V(1, true);
                                            return;
                                        default:
                                            rpVar4.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f42175n, i7.f6.n(-1, -2));
        }
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
        k4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f42177s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.f42179x = h6Var;
        h6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, null);
        this.f42180y = h6Var2;
        h6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.h6 h6Var3 = new org.telegram.ui.Cells.h6(context, null);
        this.A = h6Var3;
        h6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f42177s.addView(k4Var, i7.f6.n(-1, -2));
        this.f42177s.addView(this.f42179x, i7.f6.n(-1, -2));
        this.f42177s.addView(this.f42180y, i7.f6.n(-1, -2));
        this.f42177s.addView(this.A, i7.f6.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f42179x);
        arrayList.add(this.f42180y);
        arrayList.add(this.A);
        this.f42179x.setOnClickListener(new View.OnClickListener(this) {
            public final rp f41207b;

            {
                this.f41207b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        rp rpVar = this.f41207b;
                        if (rpVar.f42175n.f25083e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        rpVar.V(i11, true);
                        return;
                    case 1:
                        final rp rpVar2 = this.f41207b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        rpVar2.V(0, true);
                                        return;
                                    case 1:
                                        rpVar2.V(1, true);
                                        return;
                                    default:
                                        rpVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final rp rpVar3 = this.f41207b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        rpVar3.V(0, true);
                                        return;
                                    case 1:
                                        rpVar3.V(1, true);
                                        return;
                                    default:
                                        rpVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final rp rpVar4 = this.f41207b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        rpVar4.V(0, true);
                                        return;
                                    case 1:
                                        rpVar4.V(1, true);
                                        return;
                                    default:
                                        rpVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f42180y.setOnClickListener(new View.OnClickListener(this) {
            public final rp f41207b;

            {
                this.f41207b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        rp rpVar = this.f41207b;
                        if (rpVar.f42175n.f25083e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        rpVar.V(i11, true);
                        return;
                    case 1:
                        final rp rpVar2 = this.f41207b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        rpVar2.V(0, true);
                                        return;
                                    case 1:
                                        rpVar2.V(1, true);
                                        return;
                                    default:
                                        rpVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final rp rpVar3 = this.f41207b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        rpVar3.V(0, true);
                                        return;
                                    case 1:
                                        rpVar3.V(1, true);
                                        return;
                                    default:
                                        rpVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final rp rpVar4 = this.f41207b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        rpVar4.V(0, true);
                                        return;
                                    case 1:
                                        rpVar4.V(1, true);
                                        return;
                                    default:
                                        rpVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.A.setOnClickListener(new View.OnClickListener(this) {
            public final rp f41207b;

            {
                this.f41207b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        rp rpVar = this.f41207b;
                        if (rpVar.f42175n.f25083e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        rpVar.V(i11, true);
                        return;
                    case 1:
                        final rp rpVar2 = this.f41207b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        rpVar2.V(0, true);
                                        return;
                                    case 1:
                                        rpVar2.V(1, true);
                                        return;
                                    default:
                                        rpVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final rp rpVar3 = this.f41207b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        rpVar3.V(0, true);
                                        return;
                                    case 1:
                                        rpVar3.V(1, true);
                                        return;
                                    default:
                                        rpVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final rp rpVar4 = this.f41207b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        rpVar4.V(0, true);
                                        return;
                                    case 1:
                                        rpVar4.V(1, true);
                                        return;
                                    default:
                                        rpVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
        k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        org.telegram.ui.Cells.h6 h6Var4 = this.f42179x;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.f23152i6;
        h6Var4.setBackground(org.telegram.ui.ActionBar.g6.g0(w02, org.telegram.ui.ActionBar.g6.w0(null, i12, false)));
        this.f42180y.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i12, false)));
        this.A.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i12, false)));
        V(this.f42178w, false);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f42174f = jl0Var;
        jl0Var.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var2 = this.f42174f;
        qp qpVar = new qp(this, context);
        this.h = qpVar;
        jl0Var2.setAdapter(qpVar);
        this.f42174f.setOnItemClickListener(new j(this, 4));
        linearLayout.addView(this.f42174f, i7.f6.l(1.0f, -1, 0));
        this.f42174f.p1();
        this.actionBar.setAdaptiveBackground(this.f42174f);
        this.f42173e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.f42173e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f42176r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f42172c)) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return i7.i6.a(new f(this, 8), org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.f23450z6, org.telegram.ui.ActionBar.g6.f23152i6, org.telegram.ui.ActionBar.g6.f23009a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.f23279p7, org.telegram.ui.ActionBar.g6.f23099f6, org.telegram.ui.ActionBar.g6.f23117g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f42172c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
