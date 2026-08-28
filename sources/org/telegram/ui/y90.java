package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class y90 implements d5.d {
    public final int f44799a;
    public final LaunchActivity f44800b;
    public final x20 f44801c;
    public final Long d;

    public y90(LaunchActivity launchActivity, x20 x20Var, Long l10, int i9) {
        this.f44799a = i9;
        this.f44800b = launchActivity;
        this.f44801c = x20Var;
        this.d = l10;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.ui.Components.oc X;
        int i9;
        int i10;
        org.telegram.ui.Components.oc X2;
        int i11;
        int i12;
        int i13 = this.f44799a;
        Long l10 = this.d;
        x20 x20Var = this.f44801c;
        LaunchActivity launchActivity = this.f44800b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i13) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
                try {
                    x20Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (storyItem == null) {
                    X = org.telegram.ui.Components.oc.X();
                    if (X != null) {
                        i9 = R.raw.story_bomb2;
                        i10 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X = org.telegram.ui.Components.oc.X();
                    if (X != null) {
                        i9 = R.raw.story_bomb1;
                        i10 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R != null) {
                    storyItem.dialogId = l10.longValue();
                    ih.m9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                    createOverlayStoryViewer.v();
                    createOverlayStoryViewer.F(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.l0.p(i10, X, i9, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.f35493x1;
                try {
                    x20Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (storyItem == null) {
                    X2 = org.telegram.ui.Components.oc.X();
                    if (X2 != null) {
                        i11 = R.raw.story_bomb2;
                        i12 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X2 = org.telegram.ui.Components.oc.X();
                    if (X2 != null) {
                        i11 = R.raw.story_bomb1;
                        i12 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R2 != null) {
                    storyItem.dialogId = l10.longValue();
                    ih.m9 createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.v();
                    createOverlayStoryViewer2.F(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.l0.p(i12, X2, i11, 36);
                return;
        }
    }
}
