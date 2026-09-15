package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
public final class ua0 implements e2.h {
    public final int f37921a;
    public final int f37922b;
    public final Object f37923c;
    public final Object d;
    public final Object e;

    public ua0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f37921a = i11;
        this.f37923c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37922b = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        int i10 = this.f37921a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f37923c;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ma0 ma0Var = (ma0) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    ma0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.vc X = org.telegram.ui.Components.vc.X();
                    if (X != null) {
                        org.telegram.messenger.w1.o(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l4.longValue() > 0) {
                    bundle.putLong("user_id", l4.longValue());
                    if (l4.longValue() == UserConfig.getInstance(launchActivity.O).getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bundle.putBoolean("my_profile", z10);
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                bundle.putInt("open_story_album_id", this.f37922b);
                launchActivity.p0(new ProfileActivity(bundle, null));
                return;
            default:
                a5.a aVar = (a5.a) obj4;
                ((u2.k0) obj).h(aVar.f275b, (u2.f0) aVar.f276c, (u2.t) obj3, (u2.b0) obj2, this.f37922b);
                return;
        }
    }
}
