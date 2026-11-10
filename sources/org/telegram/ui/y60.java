package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class y60 implements org.telegram.messenger.c20 {
    public final int f51927a;
    public final LaunchActivity f51928b;
    public final f10 f51929c;
    public final Long d;

    public y60(LaunchActivity launchActivity, f10 f10Var, Long l10, int i7) {
        this.f51927a = i7;
        this.f51928b = launchActivity;
        this.f51929c = f10Var;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f51927a;
        Long l10 = this.d;
        f10 f10Var = this.f51929c;
        LaunchActivity launchActivity = this.f51928b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                try {
                    f10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.gc X = org.telegram.ui.Components.gc.X();
                    if (X != null) {
                        org.telegram.messenger.k5.o(null, 2131744606, X, 2131624236, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.gc X2 = org.telegram.ui.Components.gc.X();
                    if (X2 != null) {
                        org.telegram.messenger.k5.o(null, 2131744606, X2, 2131624235, 36);
                        return;
                    }
                    return;
                } else if (Q != null) {
                    storyItem.dialogId = l10.longValue();
                    di.q9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                    createOverlayStoryViewer.B();
                    createOverlayStoryViewer.L(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
            default:
                String str2 = LaunchActivity.B1;
                try {
                    f10Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.gc X3 = org.telegram.ui.Components.gc.X();
                    if (X3 != null) {
                        org.telegram.messenger.k5.o(null, 2131744606, X3, 2131624236, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.gc X4 = org.telegram.ui.Components.gc.X();
                    if (X4 != null) {
                        org.telegram.messenger.k5.o(null, 2131744606, X4, 2131624235, 36);
                        return;
                    }
                    return;
                } else if (Q2 != null) {
                    storyItem.dialogId = l10.longValue();
                    di.q9 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.B();
                    createOverlayStoryViewer2.L(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
        }
    }
}
