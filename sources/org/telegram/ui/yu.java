package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class yu extends org.telegram.ui.ActionBar.p2 {
    public static final int[][] d = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f43707e = {org.telegram.ui.ActionBar.k6.hj, org.telegram.ui.ActionBar.k6.ij, org.telegram.ui.ActionBar.k6.lj, org.telegram.ui.ActionBar.k6.kj, org.telegram.ui.ActionBar.k6.jj, org.telegram.ui.ActionBar.k6.pj, org.telegram.ui.ActionBar.k6.qj};
    public static final int[] f43708f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f43709n = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.m81 f43710a;
    public org.telegram.ui.Components.l81 f43711b;
    public boolean f43712c;

    public yu() {
        super(null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f22000w8;
        kVar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.k6.f21750i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 6));
        l0 l0Var = new l0(this, context, 6);
        l0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
        org.telegram.ui.Components.m81 m81Var = new org.telegram.ui.Components.m81(context, null);
        this.f43710a = m81Var;
        m81Var.setAdapter(new vu(this));
        org.telegram.ui.Components.l81 n10 = this.f43710a.n(8, true);
        this.f43711b = n10;
        n10.setBackgroundColor(getThemedColor(i10));
        l0Var.addView(this.f43711b, k7.c6.e(-1, 48, 55));
        l0Var.addView(this.f43710a, k7.c6.d(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = l0Var;
        return l0Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f43712c) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22000w8, false)) <= 0.721f) {
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
        if (this.f43710a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        if (f10 > 0.5f && !this.f43712c) {
            this.f43712c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z4, f10);
    }

    public final void r0() {
        View currentView = this.f43710a.getCurrentView();
        if (!(currentView instanceof uu)) {
            return;
        }
        uu uuVar = (uu) currentView;
        uuVar.e1(new qu(uuVar), 700, true);
    }
}
