package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class wc extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 f43130a;
    public final hc1 f43131b;
    public final s4.d0 f43132c;
    public final int d;
    public int f43133e;

    public wc(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.d = i10;
        this.f43130a = c6Var;
        hc1 hc1Var = new hc1(activity, 3, c6Var);
        this.f43131b = hc1Var;
        hc1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        hc1Var.setClipToPadding(false);
        hc1Var.setAdapter(new uc(this, activity, c6Var, i10));
        s4.d0 d0Var = new s4.d0();
        this.f43132c = d0Var;
        d0Var.j1(0);
        hc1Var.setLayoutManager(d0Var);
        addView(hc1Var, w7.w5.d(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= peerColors.colors.size()) {
                    break;
                } else if (peerColors.colors.get(i12).f17005id == i10) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (i11 != this.f43133e) {
            this.f43133e = i11;
            if (!z10) {
                this.f43132c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f43131b, (Utilities.Callback<View>) new ai.j3(3, this, z10));
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z10 = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z10 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
