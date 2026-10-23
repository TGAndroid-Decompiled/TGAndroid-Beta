package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class uy0 extends ProfileStoriesView {
    public final Context f42078t0;
    public final ProfileActivity f42079u0;

    public uy0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, m0 m0Var, ry0 ry0Var, org.telegram.ui.ActionBar.d6 d6Var, Context context2) {
        super(context, i10, j10, z10, m0Var, ry0Var, d6Var);
        this.f42079u0 = profileActivity;
        this.f42078t0 = context2;
    }

    @Override
    public final void e(a4.l lVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f42079u0;
        long a2 = profileActivity.a();
        ci.i7 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f42078t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f33743w2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f33624f1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f33743w2.stories, lVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f33735v2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f33735v2.stories, lVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, lVar);
    }
}
