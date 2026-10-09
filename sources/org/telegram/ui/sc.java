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
public final class sc extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f41665a;
    public final fc1 f41666b;
    public final s4.d0 f41667c;
    public final int d;
    public int f41668e;

    public sc(int i10, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.d = i10;
        this.f41665a = e6Var;
        fc1 fc1Var = new fc1(activity, 3, e6Var);
        this.f41666b = fc1Var;
        fc1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        fc1Var.setClipToPadding(false);
        fc1Var.setAdapter(new qc(this, activity, e6Var, i10));
        s4.d0 d0Var = new s4.d0();
        this.f41667c = d0Var;
        d0Var.j1(0);
        fc1Var.setLayoutManager(d0Var);
        addView(fc1Var, w7.x5.d(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= peerColors.colors.size()) {
                    break;
                } else if (peerColors.colors.get(i12).f17254id == i10) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (i11 != this.f41668e) {
            this.f41668e = i11;
            if (!z10) {
                this.f41667c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f41666b, (Utilities.Callback<View>) new ai.j3(3, this, z10));
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
