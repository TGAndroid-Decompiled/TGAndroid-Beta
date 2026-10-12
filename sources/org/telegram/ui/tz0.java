package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class tz0 extends ProfileStoriesView {
    public final Context f42321t0;
    public final ProfileActivity f42322u0;

    public tz0(ProfileActivity profileActivity, Context context, int i10, long j3, boolean z10, k0 k0Var, qz0 qz0Var, org.telegram.ui.ActionBar.c6 c6Var, Context context2) {
        super(context, i10, j3, z10, k0Var, qz0Var, c6Var);
        this.f42322u0 = profileActivity;
        this.f42321t0 = context2;
    }

    @Override
    public final void e(a6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f42322u0;
        long a2 = profileActivity.a();
        ai.m9 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f42321t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f34200v2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f34082e1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f34200v2.stories, iVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f34193u2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f34193u2.stories, iVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, iVar);
    }
}
