package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class v60 implements org.telegram.messenger.w10 {
    public final int f52826a;
    public final LaunchActivity f52827b;
    public final i50 f52828c;
    public final Long d;

    public v60(LaunchActivity launchActivity, i50 i50Var, Long l10, int i7) {
        this.f52826a = i7;
        this.f52827b = launchActivity;
        this.f52828c = i50Var;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f52826a;
        Long l10 = this.d;
        i50 i50Var = this.f52828c;
        LaunchActivity launchActivity = this.f52827b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    i50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.kc Y = org.telegram.ui.Components.kc.Y();
                    if (Y != null) {
                        org.telegram.messenger.f3.n(null, 2131744362, Y, 2131624237, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.kc Y2 = org.telegram.ui.Components.kc.Y();
                    if (Y2 != null) {
                        org.telegram.messenger.f3.n(null, 2131744362, Y2, 2131624236, 36);
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
                    i50Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.kc Y3 = org.telegram.ui.Components.kc.Y();
                    if (Y3 != null) {
                        org.telegram.messenger.f3.n(null, 2131744362, Y3, 2131624237, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.kc Y4 = org.telegram.ui.Components.kc.Y();
                    if (Y4 != null) {
                        org.telegram.messenger.f3.n(null, 2131744362, Y4, 2131624236, 36);
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
