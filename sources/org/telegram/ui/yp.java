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
public final class yp extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.j6 B;
    public ArrayList C;
    public boolean D;
    public TLRPC.Chat f43674a;
    public TLRPC.ChatFull f43675b;
    public long f43676c;
    public ArrayList d;
    public LinearLayout f43677e;
    public org.telegram.ui.Components.tl0 f43678f;
    public xp h;
    public org.telegram.ui.Cells.s8 f43679n;
    public ArrayList f43680r;
    public LinearLayout f43681s;
    public int v;
    public int f43682w;
    public org.telegram.ui.Cells.j6 f43683x;
    public org.telegram.ui.Cells.j6 f43684y;

    public final void V(int i10, boolean z4) {
        xp xpVar;
        boolean z10;
        boolean z11;
        int i11;
        ArrayList arrayList = this.C;
        ArrayList arrayList2 = this.f43680r;
        if (this.v != i10) {
            org.telegram.ui.Cells.s8 s8Var = this.f43679n;
            if (s8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                s8Var.setChecked(z11);
                if (z11) {
                    i11 = org.telegram.ui.ActionBar.k6.f21696f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.k6.e6;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
                if (z11) {
                    this.f43679n.b(w02, z11);
                } else {
                    this.f43679n.setBackgroundColorAnimatedReverse(w02);
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
                xp xpVar2 = this.h;
                if (xpVar2 != null && z4) {
                    if (this.D) {
                        i13 = 1;
                    }
                    xpVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                xp xpVar3 = this.h;
                if (xpVar3 != null && z4) {
                    if (this.D) {
                        i13 = 1;
                    }
                    xpVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.D && (xpVar = this.h) != null && z4) {
                xpVar.m(1);
            }
            xp xpVar4 = this.h;
            if (xpVar4 != null && !z4) {
                xpVar4.l();
            }
        }
    }

    public final void W() {
        this.f43677e.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        org.telegram.ui.Cells.s8 s8Var = this.f43679n;
        if (s8Var != null) {
            s8Var.d(org.telegram.ui.ActionBar.k6.f21714g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.C;
        this.D = ChatObject.isChannelAndNotMegaGroup(this.f43676c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f43680r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.D) {
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            this.f43679n = s8Var;
            s8Var.setHeight(56);
            this.f43679n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.s8 s8Var2 = this.f43679n;
            if (s8Var2.f23753e.h) {
                i10 = org.telegram.ui.ActionBar.k6.f21696f6;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.e6;
            }
            s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
            this.f43679n.setTypeface(AndroidUtilities.bold());
            this.f43679n.setOnClickListener(new View.OnClickListener(this) {
                public final yp f42271b;

                {
                    this.f42271b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            yp ypVar = this.f42271b;
                            if (ypVar.f43679n.f23753e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            ypVar.V(i11, true);
                            return;
                        case 1:
                            final yp ypVar2 = this.f42271b;
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
                            final yp ypVar3 = this.f42271b;
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
                            final yp ypVar4 = this.f42271b;
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
            linearLayout.addView(this.f43679n, k7.c6.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f43681s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.f43683x = j6Var;
        j6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, null);
        this.f43684y = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(context, null);
        this.B = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f43681s.addView(m4Var, k7.c6.n(-1, -2));
        this.f43681s.addView(this.f43683x, k7.c6.n(-1, -2));
        this.f43681s.addView(this.f43684y, k7.c6.n(-1, -2));
        this.f43681s.addView(this.B, k7.c6.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f43683x);
        arrayList.add(this.f43684y);
        arrayList.add(this.B);
        this.f43683x.setOnClickListener(new View.OnClickListener(this) {
            public final yp f42271b;

            {
                this.f42271b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        yp ypVar = this.f42271b;
                        if (ypVar.f43679n.f23753e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        ypVar.V(i11, true);
                        return;
                    case 1:
                        final yp ypVar2 = this.f42271b;
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
                        final yp ypVar3 = this.f42271b;
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
                        final yp ypVar4 = this.f42271b;
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
        this.f43684y.setOnClickListener(new View.OnClickListener(this) {
            public final yp f42271b;

            {
                this.f42271b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        yp ypVar = this.f42271b;
                        if (ypVar.f43679n.f23753e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        ypVar.V(i11, true);
                        return;
                    case 1:
                        final yp ypVar2 = this.f42271b;
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
                        final yp ypVar3 = this.f42271b;
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
                        final yp ypVar4 = this.f42271b;
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
        this.B.setOnClickListener(new View.OnClickListener(this) {
            public final yp f42271b;

            {
                this.f42271b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        yp ypVar = this.f42271b;
                        if (ypVar.f43679n.f23753e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        ypVar.V(i11, true);
                        return;
                    case 1:
                        final yp ypVar2 = this.f42271b;
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
                        final yp ypVar3 = this.f42271b;
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
                        final yp ypVar4 = this.f42271b;
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
        int i11 = org.telegram.ui.ActionBar.k6.f21659d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        org.telegram.ui.Cells.j6 j6Var4 = this.f43683x;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.f21750i6;
        j6Var4.setBackground(org.telegram.ui.ActionBar.k6.g0(w02, org.telegram.ui.ActionBar.k6.w0(null, i12, false)));
        this.f43684y.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(null, i11, false), org.telegram.ui.ActionBar.k6.w0(null, i12, false)));
        this.B.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(null, i11, false), org.telegram.ui.ActionBar.k6.w0(null, i12, false)));
        V(this.f43682w, false);
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.f43678f = tl0Var;
        tl0Var.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.tl0 tl0Var2 = this.f43678f;
        xp xpVar = new xp(this, context);
        this.h = xpVar;
        tl0Var2.setAdapter(xpVar);
        this.f43678f.setOnItemClickListener(new j(this, 4));
        linearLayout.addView(this.f43678f, k7.c6.l(1.0f, -1, 0));
        this.f43678f.p1();
        this.actionBar.setAdaptiveBackground(this.f43678f);
        this.f43677e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.f43677e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f43680r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f43676c)) {
                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                if (f5Var != null && f5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.f6.a(new f(this, 8), org.telegram.ui.ActionBar.k6.f21659d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f22053z6, org.telegram.ui.ActionBar.k6.f21750i6, org.telegram.ui.ActionBar.k6.f21605a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f21876p7, org.telegram.ui.ActionBar.k6.f21696f6, org.telegram.ui.ActionBar.k6.f21714g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f43676c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
