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
public final class z11 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f43606a;
    public org.telegram.ui.Components.jm0 f43607b;
    public v11 f43608c;
    public int d;
    public int e;
    public int f43609f;
    public int h;
    public x11 f43610n;

    public z11() {
        super(null);
        this.e = -1;
    }

    public static void U(z11 z11Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.f23833n && !z11Var.getUserConfig().isPremium()) {
                z11Var.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) z11Var, 4, true));
                return;
            }
            MediaDataController.getInstance(z11Var.currentAccount).setDoubleTapReaction(yVar.f23832f.reaction);
            z11Var.f43607b.getAdapter().q(0, z11Var.f43607b.getAdapter().h());
        } else if (view instanceof y11) {
            y11 y11Var = (y11) view;
            if (z11Var.f43610n == null) {
                o51[] o51VarArr = new o51[1];
                org.telegram.ui.Components.p5 p5Var = y11Var.f43336a;
                if (p5Var != null) {
                    p5Var.f();
                    y11Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(p5Var.getBounds());
                    i11 = (-(y11Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                w11 w11Var = new w11(z11Var, z11Var, z11Var.getParentActivity(), Integer.valueOf(i10), y11Var, o51VarArr);
                String doubleTapReaction = z11Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        w11Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = z11Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f783f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                w11Var.setRecentReactions(arrayList);
                w11Var.setSaveState(3);
                w11Var.y(p5Var, y11Var);
                x11 x11Var = new x11(z11Var, w11Var);
                z11Var.f43610n = x11Var;
                o51VarArr[0] = x11Var;
                x11Var.showAsDropDown(y11Var, 0, i11, 53);
                o51VarArr[0].b();
            }
        }
    }

    public static int Y(z11 z11Var) {
        return z11Var.currentAccount;
    }

    public static int Z(z11 z11Var) {
        return z11Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f43609f = i10;
            return;
        }
        this.f43609f = -1;
        this.e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 28));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f43607b = jm0Var;
        jm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f43607b);
        ((s4.k) this.f43607b.getItemAnimator()).f45954m = false;
        this.f43607b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.jm0 jm0Var2 = this.f43607b;
        v11 v11Var = new v11(this, context);
        this.f43608c = v11Var;
        jm0Var2.setAdapter(v11Var);
        this.f43607b.setOnItemClickListener(new f11(this, 1));
        linearLayout.addView(this.f43607b, w7.z5.n(-1, -1));
        this.f43606a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false));
        this.f43608c.l();
        c0();
        return this.f43606a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f43608c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f43608c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new zx0(3, this), org.telegram.ui.ActionBar.h6.f20993d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f21398z6, org.telegram.ui.ActionBar.h6.f21082i6, org.telegram.ui.ActionBar.h6.f20935a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f21214p7, org.telegram.ui.ActionBar.h6.f21029f6, org.telegram.ui.ActionBar.h6.f21046g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
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
        this.f43607b.setPadding(0, 0, 0, i13);
        this.f43607b.setClipToPadding(false);
    }
}
