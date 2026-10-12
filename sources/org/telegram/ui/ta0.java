package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ta0 implements Utilities.Callback {
    public final int f42139a;
    public final LaunchActivity f42140b;
    public final q70 f42141c;
    public final Long d;

    public ta0(LaunchActivity launchActivity, q70 q70Var, Long l4, int i10) {
        this.f42139a = i10;
        this.f42140b = launchActivity;
        this.f42141c = q70Var;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.Components.zc X;
        int i10;
        int i11;
        org.telegram.ui.Components.zc X2;
        int i12;
        int i13;
        int i14 = this.f42139a;
        Long l4 = this.d;
        q70 q70Var = this.f42141c;
        LaunchActivity launchActivity = this.f42140b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    q70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (storyItem == null) {
                    X = org.telegram.ui.Components.zc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X = org.telegram.ui.Components.zc.X();
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
                org.telegram.messenger.v0.q(i11, X, i10, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    q70Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (storyItem == null) {
                    X2 = org.telegram.ui.Components.zc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X2 = org.telegram.ui.Components.zc.X();
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
                org.telegram.messenger.v0.q(i13, X2, i12, 36);
                return;
        }
    }
}
