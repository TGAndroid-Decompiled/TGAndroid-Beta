package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
public final class ua0 implements e2.h {
    public final int f41009a;
    public final int f41010b;
    public final Object f41011c;
    public final Object d;
    public final Object f41012e;

    public ua0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f41009a = i11;
        this.f41011c = obj;
        this.d = obj2;
        this.f41012e = obj3;
        this.f41010b = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        int i10 = this.f41009a;
        Object obj2 = this.f41012e;
        Object obj3 = this.d;
        Object obj4 = this.f41011c;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                r80 r80Var = (r80) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    r80Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.yc X = org.telegram.ui.Components.yc.X();
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
                bundle.putInt("open_story_album_id", this.f41010b);
                launchActivity.p0(new ProfileActivity(bundle, null));
                return;
            default:
                a5.a aVar = (a5.a) obj4;
                ((u2.k0) obj).h(aVar.f285b, (u2.f0) aVar.f286c, (u2.t) obj3, (u2.b0) obj2, this.f41010b);
                return;
        }
    }
}
