package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class xu extends org.telegram.ui.ActionBar.o2 {
    public static final int[][] f40040r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f40041s = {org.telegram.ui.ActionBar.i6.hj, org.telegram.ui.ActionBar.i6.ij, org.telegram.ui.ActionBar.i6.lj, org.telegram.ui.ActionBar.i6.kj, org.telegram.ui.ActionBar.i6.jj, org.telegram.ui.ActionBar.i6.pj, org.telegram.ui.ActionBar.i6.qj};
    public static final int[] v = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] f40042w = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f40043x = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.y81 f40044a;
    public org.telegram.ui.Components.x81 f40045b;
    public FrameLayout f40046c;
    public View d;
    public final pe.b e;
    public boolean f40047f;
    public int h;
    public int f40048n;

    public xu() {
        super(null);
        this.e = new pe.b();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19410w8));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        lVar.setTitleColor(getThemedColor(i10));
        this.actionBar.E(getThemedColor(i10), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.i6.f19147i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 19));
        ai.w5 w5Var = new ai.w5(context, 23);
        w5Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7));
        org.telegram.ui.Components.y81 y81Var = new org.telegram.ui.Components.y81(context, null);
        this.f40044a = y81Var;
        y81Var.setAdapter(new uu(this));
        this.f40046c = new FrameLayout(context);
        this.f40045b = this.f40044a.n(-2, true);
        w5Var.addView(this.f40044a, w7.y5.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        w5Var.addView(view, w7.y5.e(-1, 0, 48));
        this.d.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h;
        this.f40046c.setTranslationY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h) - AndroidUtilities.dp(9.0f));
        this.f40046c.addView(this.f40045b, w7.y5.c(48.0f, -1));
        this.f40046c.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        FrameLayout frameLayout = this.f40046c;
        ch.d c10 = getBaseSimpleGlass().f14356c.c(this.f40046c, null, false);
        c10.u(eh.b.m(this.resourceProvider));
        c10.v(AndroidUtilities.dp(9.66f));
        c10.w(AndroidUtilities.dp(18.0f));
        frameLayout.setBackground(c10);
        getBaseSimpleGlass().c(w5Var, this.f40044a, this.actionBar, this.resourceProvider);
        getBaseSimpleGlass().f14361k = new li.a(2, this, w5Var);
        getBaseSimpleGlass().f14360j = null;
        w5Var.addView(this.f40046c, w7.y5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(this.actionBar.getBackground());
        this.actionBar.setBackground(null);
        this.fragmentView = w5Var;
        return w5Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f40047f) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19410w8, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                return true;
            }
        }
        if (this.f40044a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.h = i11;
        this.f40048n = i13;
        this.f40046c.setTranslationY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11) - AndroidUtilities.dp(9.0f));
        this.d.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            tu tuVar = (tu) it.next();
            xu xuVar = tuVar.f37928o3;
            li.b.a(tuVar, xuVar.h, xuVar.f40048n, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f40047f) {
            this.f40047f = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void s0() {
        View currentView = this.f40044a.getCurrentView();
        if (!(currentView instanceof tu)) {
            return;
        }
        tu tuVar = (tu) currentView;
        tuVar.f1(new pu(tuVar), 700, true);
    }
}
