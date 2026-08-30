package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class u21 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f38829a;
    public org.telegram.ui.Components.sl0 f38830b;
    public q21 f38831c;
    public int d;
    public int e;
    public int f38832f;
    public int h;
    public s21 f38833n;

    public u21() {
        super(null);
        this.e = -1;
    }

    public static void U(u21 u21Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !u21Var.getUserConfig().isPremium()) {
                u21Var.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) u21Var, 4, true));
                return;
            }
            MediaDataController.getInstance(u21Var.currentAccount).setDoubleTapReaction(yVar.e.reaction);
            u21Var.f38830b.getAdapter().q(0, u21Var.f38830b.getAdapter().h());
        } else if (view instanceof t21) {
            t21 t21Var = (t21) view;
            if (u21Var.f38833n == null) {
                g61[] g61VarArr = new g61[1];
                org.telegram.ui.Components.j5 j5Var = t21Var.f38503a;
                if (j5Var != null) {
                    j5Var.f();
                    t21Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(j5Var.getBounds());
                    i11 = (-(t21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                r21 r21Var = new r21(u21Var, u21Var, u21Var.getParentActivity(), Integer.valueOf(i10), t21Var, g61VarArr);
                String doubleTapReaction = u21Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        r21Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = u21Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f14107f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                r21Var.setRecentReactions(arrayList);
                r21Var.setSaveState(3);
                r21Var.y(j5Var, t21Var);
                s21 s21Var = new s21(u21Var, r21Var);
                u21Var.f38833n = s21Var;
                g61VarArr[0] = s21Var;
                s21Var.showAsDropDown(t21Var, 0, i11, 53);
                g61VarArr[0].b();
            }
        }
    }

    public static int Y(u21 u21Var) {
        return u21Var.currentAccount;
    }

    public static int Z(u21 u21Var) {
        return u21Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f38832f = i10;
            return;
        }
        this.f38832f = -1;
        this.e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f38830b = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f38830b);
        ((f2.l) this.f38830b.getItemAnimator()).f5818m = false;
        this.f38830b.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.sl0 sl0Var2 = this.f38830b;
        q21 q21Var = new q21(this, context);
        this.f38831c = q21Var;
        sl0Var2.setAdapter(q21Var);
        this.f38830b.setOnItemClickListener(new p21(this, 0));
        linearLayout.addView(this.f38830b, k7.b6.n(-1, -1));
        this.f38829a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        this.f38831c.l();
        c0();
        return this.f38829a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f38831c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f38831c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.e6.a(new cy0(4, this), org.telegram.ui.ActionBar.j6.f19906d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f20298z6, org.telegram.ui.ActionBar.j6.f19996i6, org.telegram.ui.ActionBar.j6.f19852a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f20122p7, org.telegram.ui.ActionBar.j6.f19942f6, org.telegram.ui.ActionBar.j6.f19960g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38830b.setPadding(0, 0, 0, i13);
        this.f38830b.setClipToPadding(false);
    }
}
