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
public final class yc extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 f42130a;
    public final kc1 f42131b;
    public final s4.b0 f42132c;
    public final int d;
    public int e;

    public yc(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.d = i10;
        this.f42130a = c6Var;
        kc1 kc1Var = new kc1(activity, 3, c6Var);
        this.f42131b = kc1Var;
        kc1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        kc1Var.setClipToPadding(false);
        kc1Var.setAdapter(new wc(this, activity, c6Var, i10));
        s4.b0 b0Var = new s4.b0();
        this.f42132c = b0Var;
        b0Var.j1(0);
        kc1Var.setLayoutManager(b0Var);
        addView(kc1Var, w7.a6.d(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= peerColors.colors.size()) {
                    break;
                } else if (peerColors.colors.get(i12).f16710id == i10) {
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
                this.f42132c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f42131b, (Utilities.Callback<View>) new bi.y2(3, this, z10));
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
