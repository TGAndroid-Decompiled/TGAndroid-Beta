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
public final class yp extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.k6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f40208a;
    public TLRPC.ChatFull f40209b;
    public long f40210c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.xl0 f40211f;
    public xp h;
    public org.telegram.ui.Cells.w8 f40212n;
    public ArrayList f40213r;
    public LinearLayout f40214s;
    public int v;
    public int f40215w;
    public org.telegram.ui.Cells.k6 f40216x;
    public org.telegram.ui.Cells.k6 f40217y;

    public final void V(int i10, boolean z10) {
        xp xpVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f40213r;
        if (this.v != i10) {
            org.telegram.ui.Cells.w8 w8Var = this.f40212n;
            if (w8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                w8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.h6.f19095f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.h6.f19078e6;
                }
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
                if (z12) {
                    this.f40212n.b(w02, z12);
                } else {
                    this.f40212n.setBackgroundColorAnimatedReverse(w02);
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
                xp xpVar2 = this.h;
                if (xpVar2 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    xpVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                xp xpVar3 = this.h;
                if (xpVar3 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    xpVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.G && (xpVar = this.h) != null && z10) {
                xpVar.m(1);
            }
            xp xpVar4 = this.h;
            if (xpVar4 != null && !z10) {
                xpVar4.l();
            }
        }
    }

    public final void W() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false));
        org.telegram.ui.Cells.w8 w8Var = this.f40212n;
        if (w8Var != null) {
            w8Var.d(org.telegram.ui.ActionBar.h6.f19113g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f40210c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f40213r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.f40212n = w8Var;
            w8Var.setHeight(56);
            this.f40212n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.w8 w8Var2 = this.f40212n;
            if (w8Var2.e.h) {
                i10 = org.telegram.ui.ActionBar.h6.f19095f6;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f19078e6;
            }
            w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
            this.f40212n.setTypeface(AndroidUtilities.bold());
            this.f40212n.setOnClickListener(new View.OnClickListener(this) {
                public final yp f38787b;

                {
                    this.f38787b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            yp ypVar = this.f38787b;
                            if (ypVar.f40212n.e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            ypVar.V(i11, true);
                            return;
                        case 1:
                            final yp ypVar2 = this.f38787b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ypVar2.V(0, true);
                                            return;
                                        case 1:
                                            ypVar2.V(1, true);
                                            return;
                                        default:
                                            ypVar2.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final yp ypVar3 = this.f38787b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ypVar3.V(0, true);
                                            return;
                                        case 1:
                                            ypVar3.V(1, true);
                                            return;
                                        default:
                                            ypVar3.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final yp ypVar4 = this.f38787b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ypVar4.V(0, true);
                                            return;
                                        case 1:
                                            ypVar4.V(1, true);
                                            return;
                                        default:
                                            ypVar4.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f40212n, w7.y5.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f40214s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.f40216x = k6Var;
        k6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, null);
        this.f40217y = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(context, null);
        this.E = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f40214s.addView(m4Var, w7.y5.n(-1, -2));
        this.f40214s.addView(this.f40216x, w7.y5.n(-1, -2));
        this.f40214s.addView(this.f40217y, w7.y5.n(-1, -2));
        this.f40214s.addView(this.E, w7.y5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f40216x);
        arrayList.add(this.f40217y);
        arrayList.add(this.E);
        this.f40216x.setOnClickListener(new View.OnClickListener(this) {
            public final yp f38787b;

            {
                this.f38787b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        yp ypVar = this.f38787b;
                        if (ypVar.f40212n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        ypVar.V(i11, true);
                        return;
                    case 1:
                        final yp ypVar2 = this.f38787b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ypVar2.V(0, true);
                                        return;
                                    case 1:
                                        ypVar2.V(1, true);
                                        return;
                                    default:
                                        ypVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final yp ypVar3 = this.f38787b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ypVar3.V(0, true);
                                        return;
                                    case 1:
                                        ypVar3.V(1, true);
                                        return;
                                    default:
                                        ypVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final yp ypVar4 = this.f38787b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ypVar4.V(0, true);
                                        return;
                                    case 1:
                                        ypVar4.V(1, true);
                                        return;
                                    default:
                                        ypVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f40217y.setOnClickListener(new View.OnClickListener(this) {
            public final yp f38787b;

            {
                this.f38787b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        yp ypVar = this.f38787b;
                        if (ypVar.f40212n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        ypVar.V(i11, true);
                        return;
                    case 1:
                        final yp ypVar2 = this.f38787b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ypVar2.V(0, true);
                                        return;
                                    case 1:
                                        ypVar2.V(1, true);
                                        return;
                                    default:
                                        ypVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final yp ypVar3 = this.f38787b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ypVar3.V(0, true);
                                        return;
                                    case 1:
                                        ypVar3.V(1, true);
                                        return;
                                    default:
                                        ypVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final yp ypVar4 = this.f38787b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ypVar4.V(0, true);
                                        return;
                                    case 1:
                                        ypVar4.V(1, true);
                                        return;
                                    default:
                                        ypVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final yp f38787b;

            {
                this.f38787b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        yp ypVar = this.f38787b;
                        if (ypVar.f40212n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        ypVar.V(i11, true);
                        return;
                    case 1:
                        final yp ypVar2 = this.f38787b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ypVar2.V(0, true);
                                        return;
                                    case 1:
                                        ypVar2.V(1, true);
                                        return;
                                    default:
                                        ypVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final yp ypVar3 = this.f38787b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ypVar3.V(0, true);
                                        return;
                                    case 1:
                                        ypVar3.V(1, true);
                                        return;
                                    default:
                                        ypVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final yp ypVar4 = this.f38787b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ypVar4.V(0, true);
                                        return;
                                    case 1:
                                        ypVar4.V(1, true);
                                        return;
                                    default:
                                        ypVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.h6.f19059d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        org.telegram.ui.Cells.k6 k6Var4 = this.f40216x;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.h6.f19148i6;
        k6Var4.setBackground(org.telegram.ui.ActionBar.h6.g0(w02, org.telegram.ui.ActionBar.h6.w0(null, i12, false)));
        this.f40217y.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(null, i11, false), org.telegram.ui.ActionBar.h6.w0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(null, i11, false), org.telegram.ui.ActionBar.h6.w0(null, i12, false)));
        V(this.f40215w, false);
        org.telegram.ui.Components.xl0 xl0Var = new org.telegram.ui.Components.xl0(context, null);
        this.f40211f = xl0Var;
        xl0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.xl0 xl0Var2 = this.f40211f;
        xp xpVar = new xp(this, context);
        this.h = xpVar;
        xl0Var2.setAdapter(xpVar);
        this.f40211f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f40211f, w7.y5.l(1.0f, -1, 0));
        this.f40211f.p1();
        this.actionBar.setAdaptiveBackground(this.f40211f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f40213r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f40210c)) {
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
        return w7.b6.a(new e(this, 8), org.telegram.ui.ActionBar.h6.f19059d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f19461z6, org.telegram.ui.ActionBar.h6.f19148i6, org.telegram.ui.ActionBar.h6.f19003a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f19279p7, org.telegram.ui.ActionBar.h6.f19095f6, org.telegram.ui.ActionBar.h6.f19113g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f40210c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
