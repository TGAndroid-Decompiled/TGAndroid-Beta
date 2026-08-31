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
public final class w21 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f42362a;
    public org.telegram.ui.Components.tl0 f42363b;
    public s21 f42364c;
    public int d;
    public int f42365e;
    public int f42366f;
    public int h;
    public u21 f42367n;

    public w21() {
        super(null);
        this.f42365e = -1;
    }

    public static void U(w21 w21Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !w21Var.getUserConfig().isPremium()) {
                w21Var.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) w21Var, 4, true));
                return;
            }
            MediaDataController.getInstance(w21Var.currentAccount).setDoubleTapReaction(yVar.f24426e.reaction);
            w21Var.f42363b.getAdapter().q(0, w21Var.f42363b.getAdapter().h());
        } else if (view instanceof v21) {
            v21 v21Var = (v21) view;
            if (w21Var.f42367n == null) {
                i61[] i61VarArr = new i61[1];
                org.telegram.ui.Components.j5 j5Var = v21Var.f42106a;
                if (j5Var != null) {
                    j5Var.f();
                    v21Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(j5Var.getBounds());
                    i11 = (-(v21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                t21 t21Var = new t21(w21Var, w21Var, w21Var.getParentActivity(), Integer.valueOf(i10), v21Var, i61VarArr);
                String doubleTapReaction = w21Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        t21Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = w21Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f16178f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                t21Var.setRecentReactions(arrayList);
                t21Var.setSaveState(3);
                t21Var.y(j5Var, v21Var);
                u21 u21Var = new u21(w21Var, t21Var);
                w21Var.f42367n = u21Var;
                i61VarArr[0] = u21Var;
                u21Var.showAsDropDown(v21Var, 0, i11, 53);
                i61VarArr[0].b();
            }
        }
    }

    public static int Y(w21 w21Var) {
        return w21Var.currentAccount;
    }

    public static int Z(w21 w21Var) {
        return w21Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.f42365e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f42366f = i10;
            return;
        }
        this.f42366f = -1;
        this.f42365e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.f42363b = tl0Var;
        tl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f42363b);
        ((f2.l) this.f42363b.getItemAnimator()).f5910m = false;
        this.f42363b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.tl0 tl0Var2 = this.f42363b;
        s21 s21Var = new s21(this, context);
        this.f42364c = s21Var;
        tl0Var2.setAdapter(s21Var);
        this.f42363b.setOnItemClickListener(new r21(this, 0));
        linearLayout.addView(this.f42363b, k7.c6.n(-1, -1));
        this.f42362a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        this.f42364c.l();
        c0();
        return this.f42362a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f42364c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f42364c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.f6.a(new ey0(4, this), org.telegram.ui.ActionBar.k6.f21659d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f22053z6, org.telegram.ui.ActionBar.k6.f21750i6, org.telegram.ui.ActionBar.k6.f21605a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f21876p7, org.telegram.ui.ActionBar.k6.f21696f6, org.telegram.ui.ActionBar.k6.f21714g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
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
        this.f42363b.setPadding(0, 0, 0, i13);
        this.f42363b.setClipToPadding(false);
    }
}
