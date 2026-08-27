package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

public final class ru extends org.telegram.ui.ActionBar.n2 {
    public static final int[][] d = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};

    public static final int[] f42335e = {org.telegram.ui.ActionBar.g6.hj, org.telegram.ui.ActionBar.g6.ij, org.telegram.ui.ActionBar.g6.lj, org.telegram.ui.ActionBar.g6.kj, org.telegram.ui.ActionBar.g6.jj, org.telegram.ui.ActionBar.g6.pj, org.telegram.ui.ActionBar.g6.qj};

    public static final int[] f42336f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};

    public static final int[] f42337n = {2, 5, 4, 1, 7, 3, 0};

    public org.telegram.ui.Components.p71 f42338a;

    public org.telegram.ui.Components.o71 f42339b;

    public boolean f42340c;

    public ru() {
        super(null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23393w8;
        kVar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.D(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 15));
        n0 n0Var = new n0(this, context, 6);
        n0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
        org.telegram.ui.Components.p71 p71Var = new org.telegram.ui.Components.p71(context, null);
        this.f42338a = p71Var;
        p71Var.setAdapter(new ou(this));
        org.telegram.ui.Components.o71 o71VarN = this.f42338a.n(8, true);
        this.f42339b = o71VarN;
        o71VarN.setBackgroundColor(getThemedColor(i10));
        n0Var.addView(this.f42339b, h7.z5.e(-1, 48, 55));
        n0Var.addView(this.f42338a, h7.z5.d(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = n0Var;
        return n0Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.f42340c) {
            return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23393w8, false)) > 0.721f;
        }
        return super.isLightStatusBar();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.f42338a.getCurrentPosition() == 0;
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f42340c) {
            this.f42340c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    public final void r0() {
        View currentView = this.f42338a.getCurrentView();
        if (currentView instanceof nu) {
            nu nuVar = (nu) currentView;
            nuVar.e1(new ju(nuVar), 700, true);
        }
    }
}
