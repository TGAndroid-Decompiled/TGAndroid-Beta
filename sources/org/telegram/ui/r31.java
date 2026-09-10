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
public final class r31 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f36204a;
    public org.telegram.ui.Components.vl0 f36205b;
    public n31 f36206c;
    public int d;
    public int e;
    public int f36207f;
    public int h;
    public p31 f36208n;

    public r31() {
        super(null);
        this.e = -1;
    }

    public static void U(r31 r31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !r31Var.getUserConfig().isPremium()) {
                r31Var.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) r31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(r31Var.currentAccount).setDoubleTapReaction(yVar.e.reaction);
            r31Var.f36205b.getAdapter().q(0, r31Var.f36205b.getAdapter().h());
        } else if (view instanceof q31) {
            q31 q31Var = (q31) view;
            if (r31Var.f36208n == null) {
                c71[] c71VarArr = new c71[1];
                org.telegram.ui.Components.n5 n5Var = q31Var.f35960a;
                if (n5Var != null) {
                    n5Var.f();
                    q31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(n5Var.getBounds());
                    i11 = (-(q31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                o31 o31Var = new o31(r31Var, r31Var, r31Var.getParentActivity(), Integer.valueOf(i10), q31Var, c71VarArr);
                String doubleTapReaction = r31Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        o31Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = r31Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f47101f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                o31Var.setRecentReactions(arrayList);
                o31Var.setSaveState(3);
                o31Var.y(n5Var, q31Var);
                p31 p31Var = new p31(r31Var, o31Var);
                r31Var.f36208n = p31Var;
                c71VarArr[0] = p31Var;
                p31Var.showAsDropDown(q31Var, 0, i11, 53);
                c71VarArr[0].b();
            }
        }
    }

    public static int Y(r31 r31Var) {
        return r31Var.currentAccount;
    }

    public static int Z(r31 r31Var) {
        return r31Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f36207f = i10;
            return;
        }
        this.f36207f = -1;
        this.e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 25));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f36205b = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f36205b);
        ((s4.j) this.f36205b.getItemAnimator()).f41645m = false;
        this.f36205b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var2 = this.f36205b;
        n31 n31Var = new n31(this, context);
        this.f36206c = n31Var;
        vl0Var2.setAdapter(n31Var);
        this.f36205b.setOnItemClickListener(new f31(this, 1));
        linearLayout.addView(this.f36205b, w7.a6.n(-1, -1));
        this.f36204a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        this.f36206c.l();
        c0();
        return this.f36204a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f36206c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f36206c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.d6.a(new zy0(4, this), org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f18325z6, org.telegram.ui.ActionBar.j6.f18017i6, org.telegram.ui.ActionBar.j6.f17872a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f18144p7, org.telegram.ui.ActionBar.j6.f17964f6, org.telegram.ui.ActionBar.j6.f17982g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
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
        this.f36205b.setPadding(0, 0, 0, i13);
        this.f36205b.setClipToPadding(false);
    }
}
