package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class wu extends org.telegram.ui.ActionBar.n2 {
    public static final int[][] d = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] e = {org.telegram.ui.ActionBar.h6.hj, org.telegram.ui.ActionBar.h6.ij, org.telegram.ui.ActionBar.h6.lj, org.telegram.ui.ActionBar.h6.kj, org.telegram.ui.ActionBar.h6.jj, org.telegram.ui.ActionBar.h6.pj, org.telegram.ui.ActionBar.h6.qj};
    public static final int[] f39089f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f39090n = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.h81 f39091a;
    public org.telegram.ui.Components.g81 f39092b;
    public boolean f39093c;

    public wu() {
        super(null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19138w8;
        kVar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.B(getThemedColor(i11), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.h6.f18878i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 19));
        k0 k0Var = new k0(this, context, 6);
        k0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7));
        org.telegram.ui.Components.h81 h81Var = new org.telegram.ui.Components.h81(context, null);
        this.f39091a = h81Var;
        h81Var.setAdapter(new tu(this));
        org.telegram.ui.Components.g81 n10 = this.f39091a.n(8, true);
        this.f39092b = n10;
        n10.setBackgroundColor(getThemedColor(i10));
        k0Var.addView(this.f39092b, w7.x5.e(-1, 48, 55));
        k0Var.addView(this.f39091a, w7.x5.d(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = k0Var;
        return k0Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f39093c) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19138w8, false)) <= 0.721f) {
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
        if (this.f39091a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f39093c) {
            this.f39093c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void r0() {
        View currentView = this.f39091a.getCurrentView();
        if (!(currentView instanceof su)) {
            return;
        }
        su suVar = (su) currentView;
        suVar.e1(new ou(suVar), 700, true);
    }
}
