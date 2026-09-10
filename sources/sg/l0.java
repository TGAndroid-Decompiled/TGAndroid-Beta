package sg;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import zh.j2;
import zh.j6;
import zh.l2;
import zh.u7;
public final class l0 implements e2.h {
    public final int f41949a;
    public final KeyEvent.Callback f41950b;
    public final Object f41951c;
    public final Object d;
    public final Object e;

    public l0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f41949a = i10;
        this.f41950b = callback;
        this.f41951c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f41949a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f41951c;
        KeyEvent.Callback callback = this.f41950b;
        switch (i10) {
            case 0:
                ((u0) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                return;
            default:
                l2 l2Var = (l2) callback;
                j6 j6Var = (j6) obj4;
                u7 u7Var = (u7) obj3;
                f6 f6Var = (f6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem != null) {
                    p2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = j6Var.f48544b.longValue();
                        u7 createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.G(l2Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.f48950o1 = new j2(u7Var, 0);
                        u7Var.P();
                        return;
                    }
                    return;
                }
                pc Q = new wc(l2Var.f48639z0.f48160c1, f6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                Q.f26075a = 3;
                Q.k(true);
                return;
        }
    }
}
