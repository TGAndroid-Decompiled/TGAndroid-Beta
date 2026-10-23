package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rp extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.k6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f41206a;
    public TLRPC.ChatFull f41207b;
    public long f41208c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.mm0 f41209f;
    public qp h;
    public org.telegram.ui.Cells.w8 f41210n;
    public ArrayList f41211r;
    public LinearLayout f41212s;
    public int v;
    public int f41213w;
    public org.telegram.ui.Cells.k6 f41214x;
    public org.telegram.ui.Cells.k6 f41215y;

    public final void V(int i10, boolean z10) {
        qp qpVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f41211r;
        if (this.v != i10) {
            org.telegram.ui.Cells.w8 w8Var = this.f41210n;
            if (w8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                w8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.k6.f21219f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.k6.f21200e6;
                }
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
                if (z12) {
                    this.f41210n.b(x02, z12);
                } else {
                    this.f41210n.setBackgroundColorAnimatedReverse(x02);
                }
            }
            this.v = i10;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) arrayList.get(i12);
                if (i10 == i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k6Var.a(z11, z10);
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
                    if (this.G) {
                        i13 = 1;
                    }
                    qpVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                qp qpVar3 = this.h;
                if (qpVar3 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    qpVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.G && (qpVar = this.h) != null && z10) {
                qpVar.m(1);
            }
            qp qpVar4 = this.h;
            if (qpVar4 != null && !z10) {
                qpVar4.l();
            }
        }
    }

    public final void W() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false));
        org.telegram.ui.Cells.w8 w8Var = this.f41210n;
        if (w8Var != null) {
            w8Var.d(org.telegram.ui.ActionBar.k6.f21236g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f41208c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f41211r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.f41210n = w8Var;
            w8Var.setHeight(56);
            this.f41210n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.w8 w8Var2 = this.f41210n;
            if (w8Var2.e.h) {
                i10 = org.telegram.ui.ActionBar.k6.f21219f6;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21200e6;
            }
            w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            this.f41210n.setTypeface(AndroidUtilities.bold());
            this.f41210n.setOnClickListener(new View.OnClickListener(this) {
                public final rp f40238b;

                {
                    this.f40238b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            rp rpVar = this.f40238b;
                            if (rpVar.f41210n.e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            rpVar.V(i11, true);
                            return;
                        case 1:
                            final rp rpVar2 = this.f40238b;
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
                            final rp rpVar3 = this.f40238b;
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
                            final rp rpVar4 = this.f40238b;
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
            linearLayout.addView(this.f41210n, w7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        l4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f41212s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.f41214x = k6Var;
        k6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, null);
        this.f41215y = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(context, null);
        this.E = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f41212s.addView(l4Var, w7.z5.n(-1, -2));
        this.f41212s.addView(this.f41214x, w7.z5.n(-1, -2));
        this.f41212s.addView(this.f41215y, w7.z5.n(-1, -2));
        this.f41212s.addView(this.E, w7.z5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f41214x);
        arrayList.add(this.f41215y);
        arrayList.add(this.E);
        this.f41214x.setOnClickListener(new View.OnClickListener(this) {
            public final rp f40238b;

            {
                this.f40238b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        rp rpVar = this.f40238b;
                        if (rpVar.f41210n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        rpVar.V(i11, true);
                        return;
                    case 1:
                        final rp rpVar2 = this.f40238b;
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
                        final rp rpVar3 = this.f40238b;
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
                        final rp rpVar4 = this.f40238b;
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
        this.f41215y.setOnClickListener(new View.OnClickListener(this) {
            public final rp f40238b;

            {
                this.f40238b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        rp rpVar = this.f40238b;
                        if (rpVar.f41210n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        rpVar.V(i11, true);
                        return;
                    case 1:
                        final rp rpVar2 = this.f40238b;
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
                        final rp rpVar3 = this.f40238b;
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
                        final rp rpVar4 = this.f40238b;
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
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final rp f40238b;

            {
                this.f40238b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        rp rpVar = this.f40238b;
                        if (rpVar.f41210n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        rpVar.V(i11, true);
                        return;
                    case 1:
                        final rp rpVar2 = this.f40238b;
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
                        final rp rpVar3 = this.f40238b;
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
                        final rp rpVar4 = this.f40238b;
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
        int i11 = org.telegram.ui.ActionBar.k6.f21183d6;
        org.telegram.ui.ActionBar.r6.i(i11, l4Var, null);
        org.telegram.ui.Cells.k6 k6Var4 = this.f41214x;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.ActionBar.r6.S(k6Var4, org.telegram.ui.ActionBar.k6.h0(x02, org.telegram.ui.ActionBar.k6.x0(null, i12, false)), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.O(i12), null);
        org.telegram.ui.ActionBar.r6.S(this.f41215y, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i12, false)), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.O(i12), null);
        org.telegram.ui.ActionBar.r6.S(this.E, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i12, false)), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.O(i12), null);
        V(this.f41213w, false);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f41209f = mm0Var;
        mm0Var.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f41209f;
        qp qpVar = new qp(this, context);
        this.h = qpVar;
        mm0Var2.setAdapter(qpVar);
        this.f41209f.setOnItemClickListener(new h(this, 5));
        linearLayout.addView(this.f41209f, w7.z5.l(1.0f, -1, 0));
        this.f41209f.t1();
        this.actionBar.setAdaptiveBackground(this.f41209f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f41211r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f41208c)) {
                org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
                if (h5Var != null && h5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new i6(3, this), org.telegram.ui.ActionBar.k6.f21183d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f21588z6, org.telegram.ui.ActionBar.k6.f21272i6, org.telegram.ui.ActionBar.k6.f21125a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f21404p7, org.telegram.ui.ActionBar.k6.f21219f6, org.telegram.ui.ActionBar.k6.f21236g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f41208c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        super.onThemeColorsChanged();
        try {
            LinearLayout linearLayout = this.e;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false));
            }
            org.telegram.ui.Cells.w8 w8Var = this.f41210n;
            if (w8Var != null && (w8Var.getBackground() instanceof ColorDrawable)) {
                int i11 = this.v;
                boolean z10 = true;
                if (i11 != 1 && i11 != 0) {
                    z10 = false;
                }
                org.telegram.ui.Cells.w8 w8Var2 = this.f41210n;
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.k6.f21219f6;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f21200e6;
                }
                w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
