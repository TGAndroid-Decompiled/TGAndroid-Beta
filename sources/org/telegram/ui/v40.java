package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class v40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f42123a;
    public final d60 f42124b;

    public v40(d60 d60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f42124b = d60Var;
        this.f42123a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.f42124b;
        d60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.f36066n2 = null;
        d60Var.X1.j(this.f42123a);
        AndroidUtilities.updateVisibleRows(d60Var.f36051j2);
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
