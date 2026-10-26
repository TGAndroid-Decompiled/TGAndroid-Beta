package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class r80 implements Utilities.Callback {
    public final int f43051a;
    public final LaunchActivity f43052b;
    public final sz f43053c;
    public final Long d;

    public r80(LaunchActivity launchActivity, sz szVar, Long l4, int i10) {
        this.f43051a = i10;
        this.f43052b = launchActivity;
        this.f43053c = szVar;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.Components.wc Y;
        int i10;
        int i11;
        org.telegram.ui.Components.wc Y2;
        int i12;
        int i13;
        int i14 = this.f43051a;
        Long l4 = this.d;
        sz szVar = this.f43053c;
        LaunchActivity launchActivity = this.f43052b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    szVar.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (storyItem == null) {
                    Y = org.telegram.ui.Components.wc.Y();
                    if (Y != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    Y = org.telegram.ui.Components.wc.Y();
                    if (Y != null) {
                        i10 = R.raw.story_bomb1;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R != null) {
                    storyItem.dialogId = l4.longValue();
                    di.y9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                    createOverlayStoryViewer.v();
                    createOverlayStoryViewer.F(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.t.q(i11, Y, i10, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    szVar.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                if (storyItem == null) {
                    Y2 = org.telegram.ui.Components.wc.Y();
                    if (Y2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    Y2 = org.telegram.ui.Components.wc.Y();
                    if (Y2 != null) {
                        i12 = R.raw.story_bomb1;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R2 != null) {
                    storyItem.dialogId = l4.longValue();
                    di.y9 createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.v();
                    createOverlayStoryViewer2.F(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.t.q(i13, Y2, i12, 36);
                return;
        }
    }
}
