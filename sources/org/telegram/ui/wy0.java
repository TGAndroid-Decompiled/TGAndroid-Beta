package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class wy0 extends ProfileStoriesView {
    public final Context f42976t0;
    public final ProfileActivity f42977u0;

    public wy0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, m0 m0Var, ty0 ty0Var, org.telegram.ui.ActionBar.d6 d6Var, Context context2) {
        super(context, i10, j10, z10, m0Var, ty0Var, d6Var);
        this.f42977u0 = profileActivity;
        this.f42976t0 = context2;
    }

    @Override
    public final void e(ag.b bVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f42977u0;
        long a2 = profileActivity.a();
        ci.i7 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f42976t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f33733w2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f33614f1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f33733w2.stories, bVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f33725v2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f33725v2.stories, bVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, bVar);
    }
}
