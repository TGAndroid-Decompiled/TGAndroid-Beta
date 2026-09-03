package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f39261a;
    public final e60 f39262b;

    public w40(e60 e60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f39262b = e60Var;
        this.f39261a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        e60 e60Var = this.f39262b;
        e60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        e60Var.f33671n2 = null;
        e60Var.X1.j(this.f39261a);
        AndroidUtilities.updateVisibleRows(e60Var.f33656j2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
