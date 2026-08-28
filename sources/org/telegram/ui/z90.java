package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
public final class z90 implements d5.d {
    public final LaunchActivity f45090a;
    public final x20 f45091b;
    public final Long f45092c;
    public final int d;

    public z90(LaunchActivity launchActivity, x20 x20Var, Long l10, int i9) {
        this.f45090a = launchActivity;
        this.f45091b = x20Var;
        this.f45092c = l10;
        this.d = i9;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        x20 x20Var = this.f45091b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.f35493x1;
        try {
            x20Var.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.oc X = org.telegram.ui.Components.oc.X();
            if (X != null) {
                org.telegram.messenger.l0.p(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        Long l10 = this.f45092c;
        long longValue = l10.longValue();
        LaunchActivity launchActivity = this.f45090a;
        if (longValue > 0) {
            bundle.putLong("user_id", l10.longValue());
            if (l10.longValue() == UserConfig.getInstance(launchActivity.K).getClientUserId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            bundle.putBoolean("my_profile", z10);
        } else {
            bundle.putLong("chat_id", -l10.longValue());
        }
        bundle.putInt("open_story_album_id", this.d);
        launchActivity.p0(new ProfileActivity(bundle, null));
    }
}
