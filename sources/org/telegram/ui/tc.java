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
public final class tc extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 f40783a;
    public final zb1 f40784b;
    public final s4.c0 f40785c;
    public final int d;
    public int f40786e;

    public tc(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.d = i10;
        this.f40783a = d6Var;
        zb1 zb1Var = new zb1(activity, 3, d6Var);
        this.f40784b = zb1Var;
        zb1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        zb1Var.setClipToPadding(false);
        zb1Var.setAdapter(new rc(this, activity, d6Var, i10));
        s4.c0 c0Var = new s4.c0();
        this.f40785c = c0Var;
        c0Var.j1(0);
        zb1Var.setLayoutManager(c0Var);
        addView(zb1Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= peerColors.colors.size()) {
                    break;
                } else if (peerColors.colors.get(i12).f17259id == i10) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (i11 != this.f40786e) {
            this.f40786e = i11;
            if (!z10) {
                this.f40785c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f40784b, (Utilities.Callback<View>) new ai.i3(3, this, z10));
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
