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
public final class xp extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.j6 B;
    public ArrayList C;
    public boolean D;
    public TLRPC.Chat f40276a;
    public TLRPC.ChatFull f40277b;
    public long f40278c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.sl0 f40279f;
    public wp h;
    public org.telegram.ui.Cells.s8 f40280n;
    public ArrayList f40281r;
    public LinearLayout f40282s;
    public int v;
    public int f40283w;
    public org.telegram.ui.Cells.j6 f40284x;
    public org.telegram.ui.Cells.j6 f40285y;

    public final void V(int i10, boolean z4) {
        wp wpVar;
        boolean z10;
        boolean z11;
        int i11;
        ArrayList arrayList = this.C;
        ArrayList arrayList2 = this.f40281r;
        if (this.v != i10) {
            org.telegram.ui.Cells.s8 s8Var = this.f40280n;
            if (s8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                s8Var.setChecked(z11);
                if (z11) {
                    i11 = org.telegram.ui.ActionBar.j6.f19942f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.e6;
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                if (z11) {
                    this.f40280n.b(w02, z11);
                } else {
                    this.f40280n.setBackgroundColorAnimatedReverse(w02);
                }
            }
            this.v = i10;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) arrayList.get(i12);
                if (i10 == i12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j6Var.a(z10, z4);
            }
            int i13 = 2;
            if (i10 == 1) {
                if (z4) {
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
                wp wpVar2 = this.h;
                if (wpVar2 != null && z4) {
                    if (this.D) {
                        i13 = 1;
                    }
                    wpVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                wp wpVar3 = this.h;
                if (wpVar3 != null && z4) {
                    if (this.D) {
                        i13 = 1;
                    }
                    wpVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.D && (wpVar = this.h) != null && z4) {
                wpVar.m(1);
            }
            wp wpVar4 = this.h;
            if (wpVar4 != null && !z4) {
                wpVar4.l();
            }
        }
    }

    public final void W() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        org.telegram.ui.Cells.s8 s8Var = this.f40280n;
        if (s8Var != null) {
            s8Var.d(org.telegram.ui.ActionBar.j6.f19960g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.C;
        this.D = ChatObject.isChannelAndNotMegaGroup(this.f40278c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f40281r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.D) {
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            this.f40280n = s8Var;
            s8Var.setHeight(56);
            this.f40280n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.s8 s8Var2 = this.f40280n;
            if (s8Var2.e.h) {
                i10 = org.telegram.ui.ActionBar.j6.f19942f6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.e6;
            }
            s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.f40280n.setTypeface(AndroidUtilities.bold());
            this.f40280n.setOnClickListener(new View.OnClickListener(this) {
                public final xp f38986b;

                {
                    this.f38986b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            xp xpVar = this.f38986b;
                            if (xpVar.f40280n.e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            xpVar.V(i11, true);
                            return;
                        case 1:
                            final xp xpVar2 = this.f38986b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            xpVar2.V(0, true);
                                            return;
                                        case 1:
                                            xpVar2.V(1, true);
                                            return;
                                        default:
                                            xpVar2.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final xp xpVar3 = this.f38986b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            xpVar3.V(0, true);
                                            return;
                                        case 1:
                                            xpVar3.V(1, true);
                                            return;
                                        default:
                                            xpVar3.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final xp xpVar4 = this.f38986b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            xpVar4.V(0, true);
                                            return;
                                        case 1:
                                            xpVar4.V(1, true);
                                            return;
                                        default:
                                            xpVar4.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f40280n, k7.b6.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f40282s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.f40284x = j6Var;
        j6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, null);
        this.f40285y = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(context, null);
        this.B = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f40282s.addView(m4Var, k7.b6.n(-1, -2));
        this.f40282s.addView(this.f40284x, k7.b6.n(-1, -2));
        this.f40282s.addView(this.f40285y, k7.b6.n(-1, -2));
        this.f40282s.addView(this.B, k7.b6.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f40284x);
        arrayList.add(this.f40285y);
        arrayList.add(this.B);
        this.f40284x.setOnClickListener(new View.OnClickListener(this) {
            public final xp f38986b;

            {
                this.f38986b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        xp xpVar = this.f38986b;
                        if (xpVar.f40280n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        xpVar.V(i11, true);
                        return;
                    case 1:
                        final xp xpVar2 = this.f38986b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar2.V(0, true);
                                        return;
                                    case 1:
                                        xpVar2.V(1, true);
                                        return;
                                    default:
                                        xpVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final xp xpVar3 = this.f38986b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar3.V(0, true);
                                        return;
                                    case 1:
                                        xpVar3.V(1, true);
                                        return;
                                    default:
                                        xpVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xp xpVar4 = this.f38986b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar4.V(0, true);
                                        return;
                                    case 1:
                                        xpVar4.V(1, true);
                                        return;
                                    default:
                                        xpVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f40285y.setOnClickListener(new View.OnClickListener(this) {
            public final xp f38986b;

            {
                this.f38986b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        xp xpVar = this.f38986b;
                        if (xpVar.f40280n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        xpVar.V(i11, true);
                        return;
                    case 1:
                        final xp xpVar2 = this.f38986b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar2.V(0, true);
                                        return;
                                    case 1:
                                        xpVar2.V(1, true);
                                        return;
                                    default:
                                        xpVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final xp xpVar3 = this.f38986b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar3.V(0, true);
                                        return;
                                    case 1:
                                        xpVar3.V(1, true);
                                        return;
                                    default:
                                        xpVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xp xpVar4 = this.f38986b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar4.V(0, true);
                                        return;
                                    case 1:
                                        xpVar4.V(1, true);
                                        return;
                                    default:
                                        xpVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.B.setOnClickListener(new View.OnClickListener(this) {
            public final xp f38986b;

            {
                this.f38986b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        xp xpVar = this.f38986b;
                        if (xpVar.f40280n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        xpVar.V(i11, true);
                        return;
                    case 1:
                        final xp xpVar2 = this.f38986b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar2.V(0, true);
                                        return;
                                    case 1:
                                        xpVar2.V(1, true);
                                        return;
                                    default:
                                        xpVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final xp xpVar3 = this.f38986b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar3.V(0, true);
                                        return;
                                    case 1:
                                        xpVar3.V(1, true);
                                        return;
                                    default:
                                        xpVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xp xpVar4 = this.f38986b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar4.V(0, true);
                                        return;
                                    case 1:
                                        xpVar4.V(1, true);
                                        return;
                                    default:
                                        xpVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.j6.f19906d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Cells.j6 j6Var4 = this.f40284x;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.f19996i6;
        j6Var4.setBackground(org.telegram.ui.ActionBar.j6.g0(w02, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.f40285y.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.B.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        V(this.f40283w, false);
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f40279f = sl0Var;
        sl0Var.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.sl0 sl0Var2 = this.f40279f;
        wp wpVar = new wp(this, context);
        this.h = wpVar;
        sl0Var2.setAdapter(wpVar);
        this.f40279f.setOnItemClickListener(new j(this, 4));
        linearLayout.addView(this.f40279f, k7.b6.l(1.0f, -1, 0));
        this.f40279f.p1();
        this.actionBar.setAdaptiveBackground(this.f40279f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f40281r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f40278c)) {
                org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                if (e5Var != null && e5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.e6.a(new f(this, 8), org.telegram.ui.ActionBar.j6.f19906d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f20298z6, org.telegram.ui.ActionBar.j6.f19996i6, org.telegram.ui.ActionBar.j6.f19852a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f20122p7, org.telegram.ui.ActionBar.j6.f19942f6, org.telegram.ui.ActionBar.j6.f19960g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f40278c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
