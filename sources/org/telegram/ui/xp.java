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
public final class xp extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList E;
    public TLRPC.Chat f45745a;
    public TLRPC.ChatFull f45746b;
    public final long f45747c;
    public ArrayList d;
    public FrameLayout e;
    public org.telegram.ui.Components.nm0 f45748f;
    public wp h;
    public final ArrayList f45749n;
    public LinearLayout f45750r;
    public int f45751s;
    public int v;
    public org.telegram.ui.Cells.o6 f45752w;
    public org.telegram.ui.Cells.o6 f45753x;
    public org.telegram.ui.Cells.o6 f45754y;

    public xp(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f45749n = new ArrayList();
        this.f45751s = -1;
        this.E = new ArrayList();
        this.f45747c = bundle.getLong("chat_id", 0L);
    }

    public final void W(int i10, boolean z10) {
        if (this.f45751s != i10) {
            this.f45751s = i10;
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
            ArrayList arrayList2 = this.f45749n;
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
                wp wpVar = this.h;
                if (wpVar != null && z10) {
                    wpVar.s(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                wp wpVar2 = this.h;
                if (wpVar2 != null && z10) {
                    wpVar2.t(2, arrayList2.size() + 1);
                }
            }
            wp wpVar3 = this.h;
            if (wpVar3 != null && z10) {
                wpVar3.m(1);
            }
            wp wpVar4 = this.h;
            if (wpVar4 != null && !z10) {
                wpVar4.l();
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
        this.f45749n.addAll(getMediaDataController().getEnabledReactionsList());
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
        q4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f45750r = linearLayout;
        linearLayout.setOrientation(1);
        this.f45750r.setClickable(true);
        org.telegram.ui.Cells.o6 o6Var = new org.telegram.ui.Cells.o6(context, null);
        this.f45752w = o6Var;
        o6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.o6 o6Var2 = new org.telegram.ui.Cells.o6(context, null);
        this.f45753x = o6Var2;
        o6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.o6 o6Var3 = new org.telegram.ui.Cells.o6(context, null);
        this.f45754y = o6Var3;
        o6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f45750r.addView(q4Var, org.telegram.ui.Components.kb1.r(-1, -2));
        this.f45750r.addView(this.f45752w, org.telegram.ui.Components.kb1.r(-1, -2));
        this.f45750r.addView(this.f45753x, org.telegram.ui.Components.kb1.r(-1, -2));
        this.f45750r.addView(this.f45754y, org.telegram.ui.Components.kb1.r(-1, -2));
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.add(this.f45752w);
        arrayList.add(this.f45753x);
        arrayList.add(this.f45754y);
        this.f45752w.setOnClickListener(new View.OnClickListener(this) {
            public final xp f44084b;

            {
                this.f44084b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final xp xpVar = this.f44084b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar.W(2, true);
                                        return;
                                    case 1:
                                        xpVar.W(1, true);
                                        return;
                                    default:
                                        xpVar.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final xp xpVar2 = this.f44084b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar2.W(2, true);
                                        return;
                                    case 1:
                                        xpVar2.W(1, true);
                                        return;
                                    default:
                                        xpVar2.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xp xpVar3 = this.f44084b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar3.W(2, true);
                                        return;
                                    case 1:
                                        xpVar3.W(1, true);
                                        return;
                                    default:
                                        xpVar3.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f45753x.setOnClickListener(new View.OnClickListener(this) {
            public final xp f44084b;

            {
                this.f44084b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final xp xpVar = this.f44084b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar.W(2, true);
                                        return;
                                    case 1:
                                        xpVar.W(1, true);
                                        return;
                                    default:
                                        xpVar.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final xp xpVar2 = this.f44084b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar2.W(2, true);
                                        return;
                                    case 1:
                                        xpVar2.W(1, true);
                                        return;
                                    default:
                                        xpVar2.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xp xpVar3 = this.f44084b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar3.W(2, true);
                                        return;
                                    case 1:
                                        xpVar3.W(1, true);
                                        return;
                                    default:
                                        xpVar3.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f45754y.setOnClickListener(new View.OnClickListener(this) {
            public final xp f44084b;

            {
                this.f44084b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final xp xpVar = this.f44084b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar.W(2, true);
                                        return;
                                    case 1:
                                        xpVar.W(1, true);
                                        return;
                                    default:
                                        xpVar.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final xp xpVar2 = this.f44084b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar2.W(2, true);
                                        return;
                                    case 1:
                                        xpVar2.W(1, true);
                                        return;
                                    default:
                                        xpVar2.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final xp xpVar3 = this.f44084b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        xpVar3.W(2, true);
                                        return;
                                    case 1:
                                        xpVar3.W(1, true);
                                        return;
                                    default:
                                        xpVar3.W(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        org.telegram.ui.Cells.o6 o6Var4 = this.f45752w;
        int i10 = org.telegram.ui.ActionBar.y6.f23357d6;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.ActionBar.f7.R(o6Var4, org.telegram.ui.ActionBar.y6.h0(x02, org.telegram.ui.ActionBar.y6.x0(null, i11, false)), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(i11), null);
        org.telegram.ui.ActionBar.f7.R(this.f45753x, org.telegram.ui.ActionBar.y6.h0(org.telegram.ui.ActionBar.y6.x0(null, i10, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false)), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(i11), null);
        org.telegram.ui.ActionBar.f7.R(this.f45754y, org.telegram.ui.ActionBar.y6.h0(org.telegram.ui.ActionBar.y6.x0(null, i10, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false)), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(i11), null);
        W(this.v, false);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f45748f = nm0Var;
        nm0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var2 = this.f45748f;
        wp wpVar = new wp(this, context);
        this.h = wpVar;
        nm0Var2.setAdapter(wpVar);
        this.f45748f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f45748f, org.telegram.ui.Components.kb1.k());
        this.f45748f.u1();
        this.f45748f.setSectionsDrawBackground(true);
        this.e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.l();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                ArrayList arrayList = this.f45749n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f45747c)) {
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
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f45748f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.kb1.C(new j6(3, this), org.telegram.ui.ActionBar.y6.f23357d6, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.f23768z6, org.telegram.ui.ActionBar.y6.f23449i6, org.telegram.ui.ActionBar.y6.f23300a7, org.telegram.ui.ActionBar.y6.B6, org.telegram.ui.ActionBar.y6.f23582p7, org.telegram.ui.ActionBar.y6.f23394f6, org.telegram.ui.ActionBar.y6.f23413g6, org.telegram.ui.ActionBar.y6.O6, org.telegram.ui.ActionBar.y6.P6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f45747c, this.f45751s, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
