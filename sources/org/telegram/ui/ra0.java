package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ra0 implements Utilities.Callback {
    public final int f37051a;
    public final LaunchActivity f37052b;
    public final ea0 f37053c;
    public final Long d;

    public ra0(LaunchActivity launchActivity, ea0 ea0Var, Long l4, int i10) {
        this.f37051a = i10;
        this.f37052b = launchActivity;
        this.f37053c = ea0Var;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.Components.xc X;
        int i10;
        int i11;
        org.telegram.ui.Components.xc X2;
        int i12;
        int i13;
        int i14 = this.f37051a;
        Long l4 = this.d;
        ea0 ea0Var = this.f37053c;
        LaunchActivity launchActivity = this.f37052b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    ea0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (storyItem == null) {
                    X = org.telegram.ui.Components.xc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X = org.telegram.ui.Components.xc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb1;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R != null) {
                    storyItem.dialogId = l4.longValue();
                    ai.jc createOverlayStoryViewer = R.createOverlayStoryViewer();
                    createOverlayStoryViewer.v();
                    createOverlayStoryViewer.F(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.l0.o(i11, X, i10, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    ea0Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (storyItem == null) {
                    X2 = org.telegram.ui.Components.xc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X2 = org.telegram.ui.Components.xc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb1;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R2 != null) {
                    storyItem.dialogId = l4.longValue();
                    ai.jc createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.v();
                    createOverlayStoryViewer2.F(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.l0.o(i13, X2, i12, 36);
                return;
        }
    }
}
