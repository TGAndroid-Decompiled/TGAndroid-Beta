package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class tc extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f36899a;
    public final ic1 f36900b;
    public final s4.c0 f36901c;
    public final int d;
    public int e;

    public tc(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = i10;
        this.f36899a = f6Var;
        ic1 ic1Var = new ic1(activity, 2, f6Var);
        this.f36900b = ic1Var;
        ic1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        ic1Var.setClipToPadding(false);
        ic1Var.setAdapter(new rc(this, activity, f6Var, i10));
        s4.c0 c0Var = new s4.c0();
        this.f36901c = c0Var;
        c0Var.j1(0);
        ic1Var.setLayoutManager(c0Var);
        addView(ic1Var, w7.a6.c(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= peerColors.colors.size()) {
                    break;
                } else if (peerColors.colors.get(i12).f14647id == i10) {
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
                this.f36901c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f36900b, (e2.h) new m4.v0(1, this, z10));
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
