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
public final class zp extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.i6 B;
    public ArrayList C;
    public boolean D;
    public TLRPC.Chat f40842a;
    public TLRPC.ChatFull f40843b;
    public long f40844c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.rl0 f40845f;
    public yp h;
    public org.telegram.ui.Cells.r8 f40846n;
    public ArrayList f40847r;
    public LinearLayout f40848s;
    public int v;
    public int f40849w;
    public org.telegram.ui.Cells.i6 f40850x;
    public org.telegram.ui.Cells.i6 f40851y;

    public final void V(int i10, boolean z4) {
        yp ypVar;
        boolean z10;
        boolean z11;
        int i11;
        ArrayList arrayList = this.C;
        ArrayList arrayList2 = this.f40847r;
        if (this.v != i10) {
            org.telegram.ui.Cells.r8 r8Var = this.f40846n;
            if (r8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                r8Var.setChecked(z11);
                if (z11) {
                    i11 = org.telegram.ui.ActionBar.j6.f19917f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.e6;
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                if (z11) {
                    this.f40846n.b(w02, z11);
                } else {
                    this.f40846n.setBackgroundColorAnimatedReverse(w02);
                }
            }
            this.v = i10;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) arrayList.get(i12);
                if (i10 == i12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i6Var.a(z10, z4);
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
                yp ypVar2 = this.h;
                if (ypVar2 != null && z4) {
                    if (this.D) {
                        i13 = 1;
                    }
                    ypVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                yp ypVar3 = this.h;
                if (ypVar3 != null && z4) {
                    if (this.D) {
                        i13 = 1;
                    }
                    ypVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.D && (ypVar = this.h) != null && z4) {
                ypVar.m(1);
            }
            yp ypVar4 = this.h;
            if (ypVar4 != null && !z4) {
                ypVar4.l();
            }
        }
    }

    public final void W() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        org.telegram.ui.Cells.r8 r8Var = this.f40846n;
        if (r8Var != null) {
            r8Var.d(org.telegram.ui.ActionBar.j6.f19935g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.C;
        this.D = ChatObject.isChannelAndNotMegaGroup(this.f40844c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f40847r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.D) {
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.f40846n = r8Var;
            r8Var.setHeight(56);
            this.f40846n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.r8 r8Var2 = this.f40846n;
            if (r8Var2.e.h) {
                i10 = org.telegram.ui.ActionBar.j6.f19917f6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.e6;
            }
            r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.f40846n.setTypeface(AndroidUtilities.bold());
            this.f40846n.setOnClickListener(new View.OnClickListener(this) {
                public final zp f39746b;

                {
                    this.f39746b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            zp zpVar = this.f39746b;
                            if (zpVar.f40846n.e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            zpVar.V(i11, true);
                            return;
                        case 1:
                            final zp zpVar2 = this.f39746b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            zpVar2.V(0, true);
                                            return;
                                        case 1:
                                            zpVar2.V(1, true);
                                            return;
                                        default:
                                            zpVar2.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final zp zpVar3 = this.f39746b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            zpVar3.V(0, true);
                                            return;
                                        case 1:
                                            zpVar3.V(1, true);
                                            return;
                                        default:
                                            zpVar3.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final zp zpVar4 = this.f39746b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            zpVar4.V(0, true);
                                            return;
                                        case 1:
                                            zpVar4.V(1, true);
                                            return;
                                        default:
                                            zpVar4.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f40846n, k7.b6.n(-1, -2));
        }
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        l4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f40848s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.f40850x = i6Var;
        i6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, null);
        this.f40851y = i6Var2;
        i6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(context, null);
        this.B = i6Var3;
        i6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f40848s.addView(l4Var, k7.b6.n(-1, -2));
        this.f40848s.addView(this.f40850x, k7.b6.n(-1, -2));
        this.f40848s.addView(this.f40851y, k7.b6.n(-1, -2));
        this.f40848s.addView(this.B, k7.b6.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f40850x);
        arrayList.add(this.f40851y);
        arrayList.add(this.B);
        this.f40850x.setOnClickListener(new View.OnClickListener(this) {
            public final zp f39746b;

            {
                this.f39746b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        zp zpVar = this.f39746b;
                        if (zpVar.f40846n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        zpVar.V(i11, true);
                        return;
                    case 1:
                        final zp zpVar2 = this.f39746b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zpVar2.V(0, true);
                                        return;
                                    case 1:
                                        zpVar2.V(1, true);
                                        return;
                                    default:
                                        zpVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final zp zpVar3 = this.f39746b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zpVar3.V(0, true);
                                        return;
                                    case 1:
                                        zpVar3.V(1, true);
                                        return;
                                    default:
                                        zpVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final zp zpVar4 = this.f39746b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zpVar4.V(0, true);
                                        return;
                                    case 1:
                                        zpVar4.V(1, true);
                                        return;
                                    default:
                                        zpVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f40851y.setOnClickListener(new View.OnClickListener(this) {
            public final zp f39746b;

            {
                this.f39746b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        zp zpVar = this.f39746b;
                        if (zpVar.f40846n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        zpVar.V(i11, true);
                        return;
                    case 1:
                        final zp zpVar2 = this.f39746b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zpVar2.V(0, true);
                                        return;
                                    case 1:
                                        zpVar2.V(1, true);
                                        return;
                                    default:
                                        zpVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final zp zpVar3 = this.f39746b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zpVar3.V(0, true);
                                        return;
                                    case 1:
                                        zpVar3.V(1, true);
                                        return;
                                    default:
                                        zpVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final zp zpVar4 = this.f39746b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zpVar4.V(0, true);
                                        return;
                                    case 1:
                                        zpVar4.V(1, true);
                                        return;
                                    default:
                                        zpVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.B.setOnClickListener(new View.OnClickListener(this) {
            public final zp f39746b;

            {
                this.f39746b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        zp zpVar = this.f39746b;
                        if (zpVar.f40846n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        zpVar.V(i11, true);
                        return;
                    case 1:
                        final zp zpVar2 = this.f39746b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zpVar2.V(0, true);
                                        return;
                                    case 1:
                                        zpVar2.V(1, true);
                                        return;
                                    default:
                                        zpVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final zp zpVar3 = this.f39746b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zpVar3.V(0, true);
                                        return;
                                    case 1:
                                        zpVar3.V(1, true);
                                        return;
                                    default:
                                        zpVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final zp zpVar4 = this.f39746b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        zpVar4.V(0, true);
                                        return;
                                    case 1:
                                        zpVar4.V(1, true);
                                        return;
                                    default:
                                        zpVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.j6.f19881d6;
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Cells.i6 i6Var4 = this.f40850x;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.f19971i6;
        i6Var4.setBackground(org.telegram.ui.ActionBar.j6.g0(w02, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.f40851y.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.B.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        V(this.f40849w, false);
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.f40845f = rl0Var;
        rl0Var.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.rl0 rl0Var2 = this.f40845f;
        yp ypVar = new yp(this, context);
        this.h = ypVar;
        rl0Var2.setAdapter(ypVar);
        this.f40845f.setOnItemClickListener(new j(this, 4));
        linearLayout.addView(this.f40845f, k7.b6.l(1.0f, -1, 0));
        this.f40845f.o1();
        this.actionBar.setAdaptiveBackground(this.f40845f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f40847r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f40844c)) {
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
        return k7.e6.a(new f(this, 8), org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f20273z6, org.telegram.ui.ActionBar.j6.f19971i6, org.telegram.ui.ActionBar.j6.f19827a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f20097p7, org.telegram.ui.ActionBar.j6.f19917f6, org.telegram.ui.ActionBar.j6.f19935g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f40844c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
