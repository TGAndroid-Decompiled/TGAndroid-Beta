package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class t80 implements Utilities.Callback {
    public final int f43537a;
    public final LaunchActivity f43538b;
    public final kz f43539c;
    public final Long d;

    public t80(LaunchActivity launchActivity, kz kzVar, Long l4, int i10) {
        this.f43537a = i10;
        this.f43538b = launchActivity;
        this.f43539c = kzVar;
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
        int i14 = this.f43537a;
        Long l4 = this.d;
        kz kzVar = this.f43539c;
        LaunchActivity launchActivity = this.f43538b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    kzVar.run();
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
                    createOverlayStoryViewer.w();
                    createOverlayStoryViewer.G(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.t.q(i11, Y, i10, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    kzVar.run();
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
                    createOverlayStoryViewer2.w();
                    createOverlayStoryViewer2.G(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.t.q(i13, Y2, i12, 36);
                return;
        }
    }
}
