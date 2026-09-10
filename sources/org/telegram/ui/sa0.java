package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class sa0 implements e2.h {
    public final int f36613a;
    public final LaunchActivity f36614b;
    public final h90 f36615c;
    public final Long d;

    public sa0(LaunchActivity launchActivity, h90 h90Var, Long l4, int i10) {
        this.f36613a = i10;
        this.f36614b = launchActivity;
        this.f36615c = h90Var;
        this.d = l4;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.ui.Components.wc X;
        int i10;
        int i11;
        org.telegram.ui.Components.wc X2;
        int i12;
        int i13;
        int i14 = this.f36613a;
        Long l4 = this.d;
        h90 h90Var = this.f36615c;
        LaunchActivity launchActivity = this.f36614b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (storyItem == null) {
                    X = org.telegram.ui.Components.wc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X = org.telegram.ui.Components.wc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb1;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R != null) {
                    storyItem.dialogId = l4.longValue();
                    zh.u7 createOverlayStoryViewer = R.createOverlayStoryViewer();
                    createOverlayStoryViewer.v();
                    createOverlayStoryViewer.G(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.a2.o(i11, X, i10, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (storyItem == null) {
                    X2 = org.telegram.ui.Components.wc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X2 = org.telegram.ui.Components.wc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb1;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R2 != null) {
                    storyItem.dialogId = l4.longValue();
                    zh.u7 createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.v();
                    createOverlayStoryViewer2.G(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.a2.o(i13, X2, i12, 36);
                return;
        }
    }
}
