package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class vz0 extends ProfileStoriesView {
    public final Context f37658t0;
    public final ProfileActivity f37659u0;

    public vz0(ProfileActivity profileActivity, Context context, int i10, long j3, boolean z10, k0 k0Var, sz0 sz0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context2) {
        super(context, i10, j3, z10, k0Var, sz0Var, f6Var);
        this.f37659u0 = profileActivity;
        this.f37658t0 = context2;
    }

    @Override
    public final void e(zh.d3 d3Var) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f37659u0;
        long a2 = profileActivity.a();
        zh.i5 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f37658t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f30499v2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f30381e1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f30499v2.stories, d3Var);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f30492u2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f30492u2.stories, d3Var);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, d3Var);
    }
}
