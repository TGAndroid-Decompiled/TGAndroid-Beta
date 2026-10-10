package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class sa0 implements Utilities.Callback {
    public final int f41696a;
    public final LaunchActivity f41697b;
    public final m70 f41698c;
    public final Long d;

    public sa0(LaunchActivity launchActivity, m70 m70Var, Long l4, int i10) {
        this.f41696a = i10;
        this.f41697b = launchActivity;
        this.f41698c = m70Var;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.Components.ad X;
        int i10;
        int i11;
        org.telegram.ui.Components.ad X2;
        int i12;
        int i13;
        int i14 = this.f41696a;
        Long l4 = this.d;
        m70 m70Var = this.f41698c;
        LaunchActivity launchActivity = this.f41697b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    m70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (storyItem == null) {
                    X = org.telegram.ui.Components.ad.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X = org.telegram.ui.Components.ad.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb1;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R != null) {
                    storyItem.dialogId = l4.longValue();
                    ai.kc createOverlayStoryViewer = R.createOverlayStoryViewer();
                    createOverlayStoryViewer.v();
                    createOverlayStoryViewer.F(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.q.q(i11, X, i10, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    m70Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (storyItem == null) {
                    X2 = org.telegram.ui.Components.ad.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X2 = org.telegram.ui.Components.ad.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb1;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R2 != null) {
                    storyItem.dialogId = l4.longValue();
                    ai.kc createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.v();
                    createOverlayStoryViewer2.F(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.q.q(i13, X2, i12, 36);
                return;
        }
    }
}
