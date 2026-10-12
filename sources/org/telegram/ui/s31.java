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
public final class s31 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f39966a;
    public org.telegram.ui.Components.mm0 f39967b;
    public o31 f39968c;
    public int d;
    public int e;
    public int f39969f;
    public int h;
    public q31 f39970n;

    public s31() {
        super(null);
        this.e = -1;
    }

    public static void U(s31 s31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.f22764n && !s31Var.getUserConfig().isPremium()) {
                s31Var.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) s31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(s31Var.currentAccount).setDoubleTapReaction(yVar.f22763f.reaction);
            s31Var.f39967b.getAdapter().q(0, s31Var.f39967b.getAdapter().h());
        } else if (view instanceof r31) {
            r31 r31Var = (r31) view;
            if (s31Var.f39970n == null) {
                i71[] i71VarArr = new i71[1];
                org.telegram.ui.Components.q5 q5Var = r31Var.f39578a;
                if (q5Var != null) {
                    q5Var.f();
                    r31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(q5Var.getBounds());
                    i11 = (-(r31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                p31 p31Var = new p31(s31Var, s31Var, s31Var.getParentActivity(), Integer.valueOf(i10), r31Var, i71VarArr);
                String doubleTapReaction = s31Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        p31Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = s31Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f779f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                p31Var.setRecentReactions(arrayList);
                p31Var.setSaveState(3);
                p31Var.y(q5Var, r31Var);
                q31 q31Var = new q31(s31Var, p31Var);
                s31Var.f39970n = q31Var;
                i71VarArr[0] = q31Var;
                q31Var.showAsDropDown(r31Var, 0, i11, 53);
                i71VarArr[0].b();
            }
        }
    }

    public static int Y(s31 s31Var) {
        return s31Var.currentAccount;
    }

    public static int Z(s31 s31Var) {
        return s31Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f39969f = i10;
            return;
        }
        this.f39969f = -1;
        this.e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 27));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f39967b = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39967b);
        ((s4.k) this.f39967b.getItemAnimator()).f44872m = false;
        this.f39967b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f39967b;
        o31 o31Var = new o31(this, context);
        this.f39968c = o31Var;
        mm0Var2.setAdapter(o31Var);
        this.f39967b.setOnItemClickListener(new i21(this, 2));
        linearLayout.addView(this.f39967b, w7.a6.n(-1, -1));
        this.f39966a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        this.f39968c.l();
        c0();
        return this.f39966a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f39968c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f39968c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.d6.a(new cz0(4, this), org.telegram.ui.ActionBar.g6.f19901d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.f20305z6, org.telegram.ui.ActionBar.g6.f19990i6, org.telegram.ui.ActionBar.g6.f19843a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.f20122p7, org.telegram.ui.ActionBar.g6.f19937f6, org.telegram.ui.ActionBar.g6.f19954g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
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
        this.f39967b.setPadding(0, 0, 0, i13);
        this.f39967b.setClipToPadding(false);
    }
}
