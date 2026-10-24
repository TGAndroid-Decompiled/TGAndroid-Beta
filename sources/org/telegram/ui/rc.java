package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class rc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f41089a;
    public final wa1 f41090b;
    public final s4.b0 f41091c;
    public final int d;
    public int e;

    public rc(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.d = i10;
        this.f41089a = g6Var;
        wa1 wa1Var = new wa1(activity, 3, g6Var);
        this.f41090b = wa1Var;
        wa1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        wa1Var.setClipToPadding(false);
        wa1Var.setAdapter(new pc(this, activity, g6Var, i10));
        s4.b0 b0Var = new s4.b0();
        this.f41091c = b0Var;
        b0Var.j1(0);
        wa1Var.setLayoutManager(b0Var);
        addView(wa1Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= peerColors.colors.size()) {
                    break;
                } else if (peerColors.colors.get(i12).f17864id == i10) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (i11 != this.e) {
            this.e = i11;
            if (!z10) {
                this.f41091c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f41090b, (Utilities.Callback<View>) new ai.y8(4, this, z10));
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

    @Override
    public final void updateColors() {
        AndroidUtilities.forEachViews((RecyclerView) this.f41090b, (Utilities.Callback<View>) new org.telegram.ui.ActionBar.m3(6, this, MessagesController.getInstance(this.d).peerColors));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
