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
public final class zu extends org.telegram.ui.ActionBar.n2 {
    public static final int[][] f43892r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f43893s = {org.telegram.ui.ActionBar.i6.hj, org.telegram.ui.ActionBar.i6.ij, org.telegram.ui.ActionBar.i6.lj, org.telegram.ui.ActionBar.i6.kj, org.telegram.ui.ActionBar.i6.jj, org.telegram.ui.ActionBar.i6.pj, org.telegram.ui.ActionBar.i6.qj};
    public static final int[] v = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] f43894w = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f43895x = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.g91 f43896a;
    public org.telegram.ui.Components.f91 f43897b;
    public FrameLayout f43898c;
    public View d;
    public final pe.b f43899e;
    public boolean f43900f;
    public int h;
    public int f43901n;

    public zu() {
        super(null);
        this.f43899e = new pe.b();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21172w8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.setTitleColor(getThemedColor(i10));
        this.actionBar.B(getThemedColor(i10), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.i6.f20908i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 19));
        ai.w5 w5Var = new ai.w5(context, 23);
        w5Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20761a7));
        org.telegram.ui.Components.g91 g91Var = new org.telegram.ui.Components.g91(context, null);
        this.f43896a = g91Var;
        g91Var.setAdapter(new wu(this));
        this.f43898c = new FrameLayout(context);
        this.f43897b = this.f43896a.n(-2, true);
        w5Var.addView(this.f43896a, w7.z5.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        w5Var.addView(view, w7.z5.e(-1, 0, 48));
        this.d.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.f43898c.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h) - AndroidUtilities.dp(9.0f));
        this.f43898c.addView(this.f43897b, w7.z5.c(48.0f, -1));
        this.f43898c.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        FrameLayout frameLayout = this.f43898c;
        ch.d c10 = getBaseSimpleGlass().f15605c.c(this.f43898c, null, false);
        c10.x(eh.b.m(this.resourceProvider));
        c10.y(AndroidUtilities.dp(9.66f));
        c10.z(AndroidUtilities.dp(18.0f));
        frameLayout.setBackground(c10);
        getBaseSimpleGlass().e(w5Var, this.f43896a, this.actionBar, this.resourceProvider);
        getBaseSimpleGlass().f15609i = new di.f(3, this, w5Var);
        getBaseSimpleGlass().h = null;
        w5Var.addView(this.f43898c, w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.actionBar.setBackground(null);
        this.fragmentView = w5Var;
        return w5Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f43900f) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21172w8, false)) <= 0.721f) {
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
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        if (this.f43896a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.h = i11;
        this.f43901n = i13;
        this.f43898c.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - AndroidUtilities.dp(9.0f));
        this.d.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.f43899e.iterator();
        while (it.hasNext()) {
            vu vuVar = (vu) it.next();
            zu zuVar = vuVar.f41832v3;
            li.a.c(vuVar, zuVar.h, zuVar.f43901n, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f43900f) {
            this.f43900f = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void s0() {
        View currentView = this.f43896a.getCurrentView();
        if (!(currentView instanceof vu)) {
            return;
        }
        vu vuVar = (vu) currentView;
        vuVar.f1(new ru(vuVar), 700, true);
    }
}
