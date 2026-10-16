package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class xz0 extends ProfileStoriesView {
    public final Context f41692t0;
    public final ProfileActivity f41693u0;

    public xz0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, l0 l0Var, uz0 uz0Var, org.telegram.ui.ActionBar.c6 c6Var, Context context2) {
        super(context, i10, j10, z10, l0Var, uz0Var, c6Var);
        this.f41693u0 = profileActivity;
        this.f41692t0 = context2;
    }

    @Override
    public final void e(ya.c cVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f41693u0;
        long a2 = profileActivity.a();
        bi.x8 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f41692t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f32380v2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f32261e1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f32380v2.stories, cVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f32373u2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f32373u2.stories, cVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, cVar);
    }
}
