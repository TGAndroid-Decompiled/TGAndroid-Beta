package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class uc extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f38771a;
    public final rb1 f38772b;
    public final f2.i0 f38773c;
    public final int d;
    public int e;

    public uc(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = i10;
        this.f38771a = f6Var;
        rb1 rb1Var = new rb1(activity, 2, f6Var);
        this.f38772b = rb1Var;
        rb1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        rb1Var.setClipToPadding(false);
        rb1Var.setAdapter(new sc(this, activity, f6Var, i10));
        f2.i0 i0Var = new f2.i0();
        this.f38773c = i0Var;
        i0Var.j1(0);
        rb1Var.setLayoutManager(i0Var);
        addView(rb1Var, k7.b6.c(-1.0f, -1));
    }

    public final void a(int i10, boolean z4) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= peerColors.colors.size()) {
                    break;
                } else if (peerColors.colors.get(i12).f16651id == i10) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (i11 != this.e) {
            this.e = i11;
            if (!z4) {
                this.f38773c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f38772b, (h5.d) new rc(0, this, z4));
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z4 = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z4 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z4);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
