package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.tl.TL_stories;
public final class u70 implements org.telegram.messenger.q20 {
    public final int f42060a;
    public final LaunchActivity f42061b;
    public final f70 f42062c;
    public final Long d;

    public u70(LaunchActivity launchActivity, f70 f70Var, Long l4, int i10) {
        this.f42060a = i10;
        this.f42061b = launchActivity;
        this.f42062c = f70Var;
        this.d = l4;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f42060a;
        Long l4 = this.d;
        f70 f70Var = this.f42062c;
        LaunchActivity launchActivity = this.f42061b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    f70Var.run();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.cc X = org.telegram.ui.Components.cc.X();
                    if (X != null) {
                        org.telegram.messenger.m5.n(null, 2131744625, X, 2131624234, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.cc X2 = org.telegram.ui.Components.cc.X();
                    if (X2 != null) {
                        org.telegram.messenger.m5.n(null, 2131744625, X2, 2131624233, 36);
                        return;
                    }
                    return;
                } else if (Q != null) {
                    storyItem.dialogId = l4.longValue();
                    th.o7 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                    createOverlayStoryViewer.J();
                    createOverlayStoryViewer.U(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    f70Var.run();
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.cc X3 = org.telegram.ui.Components.cc.X();
                    if (X3 != null) {
                        org.telegram.messenger.m5.n(null, 2131744625, X3, 2131624234, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.cc X4 = org.telegram.ui.Components.cc.X();
                    if (X4 != null) {
                        org.telegram.messenger.m5.n(null, 2131744625, X4, 2131624233, 36);
                        return;
                    }
                    return;
                } else if (Q2 != null) {
                    storyItem.dialogId = l4.longValue();
                    th.o7 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.J();
                    createOverlayStoryViewer2.U(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
        }
    }
}
