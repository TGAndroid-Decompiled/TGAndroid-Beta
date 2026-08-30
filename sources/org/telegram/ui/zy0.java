package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class zy0 extends ProfileStoriesView {
    public final Context f40879q0;
    public final ProfileActivity f40880r0;

    public zy0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z4, l0 l0Var, wy0 wy0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context2) {
        super(context, i10, j10, z4, l0Var, wy0Var, f6Var);
        this.f40880r0 = profileActivity;
        this.f40879q0 = context2;
    }

    @Override
    public final void e(a3.c cVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f40880r0;
        long a2 = profileActivity.a();
        nh.t6 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f40879q0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f32158s2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f32037b1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f32158s2.stories, cVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f32150r2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f32150r2.stories, cVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, cVar);
    }
}
