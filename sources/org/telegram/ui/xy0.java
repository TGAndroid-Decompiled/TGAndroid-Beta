package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class xy0 extends ProfileStoriesView {
    public final Context f43712t0;
    public final ProfileActivity f43713u0;

    public xy0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, l0 l0Var, uy0 uy0Var, org.telegram.ui.ActionBar.g6 g6Var, Context context2) {
        super(context, i10, j10, z10, l0Var, uy0Var, g6Var);
        this.f43713u0 = profileActivity;
        this.f43712t0 = context2;
    }

    @Override
    public final void e(a4.l lVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f43713u0;
        long a2 = profileActivity.a();
        ci.h7 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f43712t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f34042w2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f33923f1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f34042w2.stories, lVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f34034v2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f34034v2.stories, lVar);
                return;
            } else {
                profileActivity.M3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, lVar);
    }
}
