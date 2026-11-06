package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class v60 implements org.telegram.messenger.c20 {
    public final int f50581a;
    public final LaunchActivity f50582b;
    public final q10 f50583c;
    public final Long d;

    public v60(LaunchActivity launchActivity, q10 q10Var, Long l10, int i7) {
        this.f50581a = i7;
        this.f50582b = launchActivity;
        this.f50583c = q10Var;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f50581a;
        Long l10 = this.d;
        q10 q10Var = this.f50583c;
        LaunchActivity launchActivity = this.f50582b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                try {
                    q10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.hc X = org.telegram.ui.Components.hc.X();
                    if (X != null) {
                        org.telegram.messenger.k5.o(null, 2131744607, X, 2131624236, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.hc X2 = org.telegram.ui.Components.hc.X();
                    if (X2 != null) {
                        org.telegram.messenger.k5.o(null, 2131744607, X2, 2131624235, 36);
                        return;
                    }
                    return;
                } else if (Q != null) {
                    storyItem.dialogId = l10.longValue();
                    di.p9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                    createOverlayStoryViewer.B();
                    createOverlayStoryViewer.L(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
            default:
                String str2 = LaunchActivity.B1;
                try {
                    q10Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.hc X3 = org.telegram.ui.Components.hc.X();
                    if (X3 != null) {
                        org.telegram.messenger.k5.o(null, 2131744607, X3, 2131624236, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.hc X4 = org.telegram.ui.Components.hc.X();
                    if (X4 != null) {
                        org.telegram.messenger.k5.o(null, 2131744607, X4, 2131624235, 36);
                        return;
                    }
                    return;
                } else if (Q2 != null) {
                    storyItem.dialogId = l10.longValue();
                    di.p9 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.B();
                    createOverlayStoryViewer2.L(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
        }
    }
}
