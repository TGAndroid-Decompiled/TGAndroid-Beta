package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class rz0 extends ProfileStoriesView {
    public final Context f37214t0;
    public final ProfileActivity f37215u0;

    public rz0(ProfileActivity profileActivity, Context context, int i10, long j3, boolean z10, j0 j0Var, oz0 oz0Var, org.telegram.ui.ActionBar.e6 e6Var, Context context2) {
        super(context, i10, j3, z10, j0Var, oz0Var, e6Var);
        this.f37215u0 = profileActivity;
        this.f37214t0 = context2;
    }

    @Override
    public final void e(a6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f37215u0;
        long a2 = profileActivity.a();
        ai.l9 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f37214t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f31387v2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f31269e1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f31387v2.stories, iVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f31380u2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f31380u2.stories, iVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, iVar);
    }
}
