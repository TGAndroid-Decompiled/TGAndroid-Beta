package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class yz0 extends ProfileStoriesView {
    public final Context f42438t0;
    public final ProfileActivity f42439u0;

    public yz0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, l0 l0Var, vz0 vz0Var, org.telegram.ui.ActionBar.c6 c6Var, Context context2) {
        super(context, i10, j10, z10, l0Var, vz0Var, c6Var);
        this.f42439u0 = profileActivity;
        this.f42438t0 = context2;
    }

    @Override
    public final void e(ya.c cVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f42439u0;
        long a2 = profileActivity.a();
        bi.x8 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f42438t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f32678v2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f32559e1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f32678v2.stories, cVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f32671u2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f32671u2.stories, cVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, cVar);
    }
}
