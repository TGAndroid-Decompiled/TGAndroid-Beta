package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class zu extends org.telegram.ui.ActionBar.p2 {
    public static final int[][] d = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] e = {org.telegram.ui.ActionBar.j6.hj, org.telegram.ui.ActionBar.j6.ij, org.telegram.ui.ActionBar.j6.lj, org.telegram.ui.ActionBar.j6.kj, org.telegram.ui.ActionBar.j6.jj, org.telegram.ui.ActionBar.j6.pj, org.telegram.ui.ActionBar.j6.qj};
    public static final int[] f40874f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f40875n = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.l81 f40876a;
    public org.telegram.ui.Components.k81 f40877b;
    public boolean f40878c;

    public zu() {
        super(null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20221w8;
        kVar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.f19971i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 6));
        n0 n0Var = new n0(this, context, 6);
        n0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7));
        org.telegram.ui.Components.l81 l81Var = new org.telegram.ui.Components.l81(context, null);
        this.f40876a = l81Var;
        l81Var.setAdapter(new wu(this));
        org.telegram.ui.Components.k81 n10 = this.f40876a.n(8, true);
        this.f40877b = n10;
        n10.setBackgroundColor(getThemedColor(i10));
        n0Var.addView(this.f40877b, k7.b6.e(-1, 48, 55));
        n0Var.addView(this.f40876a, k7.b6.d(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = n0Var;
        return n0Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f40878c) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20221w8, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        if (this.f40876a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        if (f10 > 0.5f && !this.f40878c) {
            this.f40878c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z4, f10);
    }

    public final void r0() {
        View currentView = this.f40876a.getCurrentView();
        if (!(currentView instanceof vu)) {
            return;
        }
        vu vuVar = (vu) currentView;
        vuVar.d1(new ru(vuVar), 700, true);
    }
}
