package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class t60 implements org.telegram.messenger.z10 {
    public final int f51390a;
    public final LaunchActivity f51391b;
    public final g50 f51392c;
    public final Long d;

    public t60(LaunchActivity launchActivity, g50 g50Var, Long l10, int i7) {
        this.f51390a = i7;
        this.f51391b = launchActivity;
        this.f51392c = g50Var;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f51390a;
        Long l10 = this.d;
        g50 g50Var = this.f51392c;
        LaunchActivity launchActivity = this.f51391b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.cc X = org.telegram.ui.Components.cc.X();
                    if (X != null) {
                        org.telegram.messenger.k5.n(null, 2131744606, X, 2131624237, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.cc X2 = org.telegram.ui.Components.cc.X();
                    if (X2 != null) {
                        org.telegram.messenger.k5.n(null, 2131744606, X2, 2131624236, 36);
                        return;
                    }
                    return;
                } else if (Q != null) {
                    storyItem.dialogId = l10.longValue();
                    fi.i9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                    createOverlayStoryViewer.B();
                    createOverlayStoryViewer.L(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
            default:
                String str2 = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.cc X3 = org.telegram.ui.Components.cc.X();
                    if (X3 != null) {
                        org.telegram.messenger.k5.n(null, 2131744606, X3, 2131624237, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.cc X4 = org.telegram.ui.Components.cc.X();
                    if (X4 != null) {
                        org.telegram.messenger.k5.n(null, 2131744606, X4, 2131624236, 36);
                        return;
                    }
                    return;
                } else if (Q2 != null) {
                    storyItem.dialogId = l10.longValue();
                    fi.i9 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.B();
                    createOverlayStoryViewer2.L(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
        }
    }
}
