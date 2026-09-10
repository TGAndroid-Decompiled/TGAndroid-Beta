package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
public final class ta0 implements e2.h {
    public final int f36889a;
    public final int f36890b;
    public final Object f36891c;
    public final Object d;
    public final Object e;

    public ta0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f36889a = i11;
        this.f36891c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f36890b = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        int i10 = this.f36889a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f36891c;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                h90 h90Var = (h90) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.wc X = org.telegram.ui.Components.wc.X();
                    if (X != null) {
                        org.telegram.messenger.a2.o(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
                bundle.putInt("open_story_album_id", this.f36890b);
                launchActivity.p0(new ProfileActivity(bundle, null));
                return;
            default:
                a5.a aVar = (a5.a) obj4;
                ((u2.m0) obj).h(aVar.f275b, (u2.g0) aVar.f276c, (u2.u) obj3, (u2.c0) obj2, this.f36890b);
                return;
        }
    }
}
