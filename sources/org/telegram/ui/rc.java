package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class rc extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 f40809a;
    public final qb1 f40810b;
    public final f2.j0 f40811c;
    public final int d;
    public int f40812e;

    public rc(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.d = i10;
        this.f40809a = g6Var;
        qb1 qb1Var = new qb1(activity, 2, g6Var);
        this.f40810b = qb1Var;
        qb1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        qb1Var.setClipToPadding(false);
        qb1Var.setAdapter(new pc(this, activity, g6Var, i10));
        f2.j0 j0Var = new f2.j0();
        this.f40811c = j0Var;
        j0Var.j1(0);
        qb1Var.setLayoutManager(j0Var);
        addView(qb1Var, k7.c6.c(-1.0f, -1));
    }

    public final void a(int i10, boolean z4) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= peerColors.colors.size()) {
                    break;
                } else if (peerColors.colors.get(i12).f18059id == i10) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (i11 != this.f40812e) {
            this.f40812e = i11;
            if (!z4) {
                this.f40811c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f40810b, (h5.d) new oc(0, this, z4));
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
