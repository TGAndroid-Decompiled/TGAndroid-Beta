package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
public final class wa0 implements e2.h {
    public final int f38628a;
    public final int f38629b;
    public final Object f38630c;
    public final Object d;
    public final Object e;

    public wa0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f38628a = i11;
        this.f38630c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f38629b = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        int i10 = this.f38628a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f38630c;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                oa0 oa0Var = (oa0) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    oa0Var.run();
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
                bundle.putInt("open_story_album_id", this.f38629b);
                launchActivity.p0(new ProfileActivity(bundle, null));
                return;
            default:
                a5.a aVar = (a5.a) obj4;
                ((u2.k0) obj).h(aVar.f277b, (u2.f0) aVar.f278c, (u2.t) obj3, (u2.b0) obj2, this.f38629b);
                return;
        }
    }
}
