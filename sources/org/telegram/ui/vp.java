package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vp extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList E;
    public TLRPC.Chat f44870a;
    public TLRPC.ChatFull f44871b;
    public final long f44872c;
    public ArrayList d;
    public FrameLayout e;
    public org.telegram.ui.Components.mm0 f44873f;
    public up h;
    public final ArrayList f44874n;
    public LinearLayout f44875r;
    public int f44876s;
    public int v;
    public org.telegram.ui.Cells.o6 f44877w;
    public org.telegram.ui.Cells.o6 f44878x;
    public org.telegram.ui.Cells.o6 f44879y;

    public vp(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f44874n = new ArrayList();
        this.f44876s = -1;
        this.E = new ArrayList();
        this.f44872c = bundle.getLong("chat_id", 0L);
    }

    public final void W(int i10, boolean z10) {
        if (this.f44876s != i10) {
            this.f44876s = i10;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.E;
                boolean z11 = true;
                if (i11 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) arrayList.get(i11);
                if (i10 != i11) {
                    z11 = false;
                }
                o6Var.a(z11, z10);
                i11++;
            }
            ArrayList arrayList2 = this.f44874n;
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
                up upVar = this.h;
                if (upVar != null && z10) {
                    upVar.s(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                up upVar2 = this.h;
                if (upVar2 != null && z10) {
                    upVar2.t(2, arrayList2.size() + 1);
                }
            }
            up upVar3 = this.h;
            if (upVar3 != null && z10) {
                upVar3.m(1);
            }
            up upVar4 = this.h;
            if (upVar4 != null && !z10) {
                upVar4.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44874n.addAll(getMediaDataController().getEnabledReactionsList());
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
        q4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44875r = linearLayout;
        linearLayout.setOrientation(1);
        this.f44875r.setClickable(true);
        org.telegram.ui.Cells.o6 o6Var = new org.telegram.ui.Cells.o6(context, null);
        this.f44877w = o6Var;
        o6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.o6 o6Var2 = new org.telegram.ui.Cells.o6(context, null);
        this.f44878x = o6Var2;
        o6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.o6 o6Var3 = new org.telegram.ui.Cells.o6(context, null);
        this.f44879y = o6Var3;
        o6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f44875r.addView(q4Var, org.telegram.ui.Components.gb1.r(-1, -2));
        this.f44875r.addView(this.f44877w, org.telegram.ui.Components.gb1.r(-1, -2));
        this.f44875r.addView(this.f44878x, org.telegram.ui.Components.gb1.r(-1, -2));
        this.f44875r.addView(this.f44879y, org.telegram.ui.Components.gb1.r(-1, -2));
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.add(this.f44877w);
        arrayList.add(this.f44878x);
        arrayList.add(this.f44879y);
        this.f44877w.setOnClickListener(new View.OnClickListener(this) {
            public final vp f43570b;

            {
                this.f43570b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final vp vpVar = this.f43570b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        vpVar.W(2, true);
                                        return;
                                    case 1:
                                        vpVar.W(1, true);
                                        return;
                                    default:
                                        vpVar.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final vp vpVar2 = this.f43570b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        vpVar2.W(2, true);
                                        return;
                                    case 1:
                                        vpVar2.W(1, true);
                                        return;
                                    default:
                                        vpVar2.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final vp vpVar3 = this.f43570b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        vpVar3.W(2, true);
                                        return;
                                    case 1:
                                        vpVar3.W(1, true);
                                        return;
                                    default:
                                        vpVar3.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f44878x.setOnClickListener(new View.OnClickListener(this) {
            public final vp f43570b;

            {
                this.f43570b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final vp vpVar = this.f43570b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        vpVar.W(2, true);
                                        return;
                                    case 1:
                                        vpVar.W(1, true);
                                        return;
                                    default:
                                        vpVar.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final vp vpVar2 = this.f43570b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        vpVar2.W(2, true);
                                        return;
                                    case 1:
                                        vpVar2.W(1, true);
                                        return;
                                    default:
                                        vpVar2.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final vp vpVar3 = this.f43570b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        vpVar3.W(2, true);
                                        return;
                                    case 1:
                                        vpVar3.W(1, true);
                                        return;
                                    default:
                                        vpVar3.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f44879y.setOnClickListener(new View.OnClickListener(this) {
            public final vp f43570b;

            {
                this.f43570b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final vp vpVar = this.f43570b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        vpVar.W(2, true);
                                        return;
                                    case 1:
                                        vpVar.W(1, true);
                                        return;
                                    default:
                                        vpVar.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final vp vpVar2 = this.f43570b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        vpVar2.W(2, true);
                                        return;
                                    case 1:
                                        vpVar2.W(1, true);
                                        return;
                                    default:
                                        vpVar2.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final vp vpVar3 = this.f43570b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        vpVar3.W(2, true);
                                        return;
                                    case 1:
                                        vpVar3.W(1, true);
                                        return;
                                    default:
                                        vpVar3.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        org.telegram.ui.Cells.o6 o6Var4 = this.f44877w;
        int i10 = org.telegram.ui.ActionBar.y6.f23356d6;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.ActionBar.f7.R(o6Var4, org.telegram.ui.ActionBar.y6.h0(x02, org.telegram.ui.ActionBar.y6.x0(null, i11, false)), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(i11), null);
        org.telegram.ui.ActionBar.f7.R(this.f44878x, org.telegram.ui.ActionBar.y6.h0(org.telegram.ui.ActionBar.y6.x0(null, i10, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false)), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(i11), null);
        org.telegram.ui.ActionBar.f7.R(this.f44879y, org.telegram.ui.ActionBar.y6.h0(org.telegram.ui.ActionBar.y6.x0(null, i10, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false)), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(i11), null);
        W(this.v, false);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f44873f = mm0Var;
        mm0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f44873f;
        up upVar = new up(this, context);
        this.h = upVar;
        mm0Var2.setAdapter(upVar);
        this.f44873f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f44873f, org.telegram.ui.Components.gb1.k());
        this.f44873f.u1();
        this.f44873f.setSectionsDrawBackground(true);
        this.e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.l();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                ArrayList arrayList = this.f44874n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f44872c)) {
                org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
                if (j5Var != null && j5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f44873f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.gb1.C(new j6(3, this), org.telegram.ui.ActionBar.y6.f23356d6, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.f23767z6, org.telegram.ui.ActionBar.y6.f23448i6, org.telegram.ui.ActionBar.y6.f23299a7, org.telegram.ui.ActionBar.y6.B6, org.telegram.ui.ActionBar.y6.f23581p7, org.telegram.ui.ActionBar.y6.f23393f6, org.telegram.ui.ActionBar.y6.f23412g6, org.telegram.ui.ActionBar.y6.O6, org.telegram.ui.ActionBar.y6.P6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f44872c, this.f44876s, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
