package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class xu extends org.telegram.ui.ActionBar.m2 {
    public static final int[][] d = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f44216e = {org.telegram.ui.ActionBar.h6.hj, org.telegram.ui.ActionBar.h6.ij, org.telegram.ui.ActionBar.h6.lj, org.telegram.ui.ActionBar.h6.kj, org.telegram.ui.ActionBar.h6.jj, org.telegram.ui.ActionBar.h6.pj, org.telegram.ui.ActionBar.h6.qj};
    public static final int[] f44217f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f44218n = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.p91 f44219a;
    public org.telegram.ui.Components.o91 f44220b;
    public boolean f44221c;

    public xu() {
        super(null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21174w8;
        kVar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.D(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.h6.f20913i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 19));
        j0 j0Var = new j0(this, context, 6);
        j0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20766a7));
        org.telegram.ui.Components.p91 p91Var = new org.telegram.ui.Components.p91(context, null);
        this.f44219a = p91Var;
        p91Var.setAdapter(new uu(this));
        org.telegram.ui.Components.o91 n10 = this.f44219a.n(8, true);
        this.f44220b = n10;
        n10.setBackgroundColor(getThemedColor(i10));
        j0Var.addView(this.f44220b, w7.x5.e(-1, 48, 55));
        j0Var.addView(this.f44219a, w7.x5.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 119));
        this.fragmentView = j0Var;
        return j0Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f44221c) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21174w8, false)) <= 0.721f) {
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
        if (this.f44219a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f44221c) {
            this.f44221c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void r0() {
        View currentView = this.f44219a.getCurrentView();
        if (!(currentView instanceof tu)) {
            return;
        }
        tu tuVar = (tu) currentView;
        tuVar.e1(new pu(tuVar), 700, true);
    }
}
