package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class w60 implements org.telegram.messenger.y10 {
    public final int f52989a;
    public final LaunchActivity f52990b;
    public final h60 f52991c;
    public final Long d;

    public w60(LaunchActivity launchActivity, h60 h60Var, Long l10, int i7) {
        this.f52989a = i7;
        this.f52990b = launchActivity;
        this.f52991c = h60Var;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f52989a;
        Long l10 = this.d;
        h60 h60Var = this.f52991c;
        LaunchActivity launchActivity = this.f52990b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    h60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.lc Y = org.telegram.ui.Components.lc.Y();
                    if (Y != null) {
                        org.telegram.messenger.f3.n(null, 2131744363, Y, 2131624237, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.lc Y2 = org.telegram.ui.Components.lc.Y();
                    if (Y2 != null) {
                        org.telegram.messenger.f3.n(null, 2131744363, Y2, 2131624236, 36);
                        return;
                    }
                    return;
                } else if (Q != null) {
                    storyItem.dialogId = l10.longValue();
                    fi.f9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                    createOverlayStoryViewer.B();
                    createOverlayStoryViewer.L(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
            default:
                String str2 = LaunchActivity.C1;
                try {
                    h60Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.lc Y3 = org.telegram.ui.Components.lc.Y();
                    if (Y3 != null) {
                        org.telegram.messenger.f3.n(null, 2131744363, Y3, 2131624237, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.lc Y4 = org.telegram.ui.Components.lc.Y();
                    if (Y4 != null) {
                        org.telegram.messenger.f3.n(null, 2131744363, Y4, 2131624236, 36);
                        return;
                    }
                    return;
                } else if (Q2 != null) {
                    storyItem.dialogId = l10.longValue();
                    fi.f9 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.B();
                    createOverlayStoryViewer2.L(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
        }
    }
}
