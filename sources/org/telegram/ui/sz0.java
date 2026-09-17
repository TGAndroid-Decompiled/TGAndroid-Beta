package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class sz0 extends ProfileStoriesView {
    public final Context f40576t0;
    public final ProfileActivity f40577u0;

    public sz0(ProfileActivity profileActivity, Context context, int i10, long j3, boolean z10, j0 j0Var, pz0 pz0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context2) {
        super(context, i10, j3, z10, j0Var, pz0Var, f6Var);
        this.f40577u0 = profileActivity;
        this.f40576t0 = context2;
    }

    @Override
    public final void e(a6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f40577u0;
        long a2 = profileActivity.a();
        bi.u8 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f40576t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f34007v2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f33889e1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f34007v2.stories, iVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f34000u2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f34000u2.stories, iVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, iVar);
    }
}
