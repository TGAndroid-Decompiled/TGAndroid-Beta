package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class tu0 extends ProfileStoriesView {
    public final Context f49890u0;
    public final ProfileActivity f49891v0;

    public tu0(ProfileActivity profileActivity, Context context, int i3, long j10, boolean z10, l0 l0Var, qu0 qu0Var, org.telegram.ui.ActionBar.e6 e6Var, Context context2) {
        super(context, i3, j10, z10, l0Var, qu0Var, e6Var);
        this.f49891v0 = profileActivity;
        this.f49890u0 = context2;
    }

    @Override
    public final void e(c6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f49891v0;
        long a10 = profileActivity.a();
        ei.z6 P1 = profileActivity.getMessagesController().P1();
        boolean K = P1.K(a10);
        Context context = this.f49890u0;
        if (!K && !P1.M(a10) && !P1.Q(a10)) {
            TLRPC.UserFull userFull = profileActivity.f41868v2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f41751e1 != profileActivity.getUserConfig().f22848n) {
                profileActivity.getOrCreateStoryViewer().S(context, profileActivity.f41868v2.stories, iVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f41861u2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().S(context, profileActivity.f41861u2.stories, iVar);
                return;
            } else {
                profileActivity.a4();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().R(context, a10, iVar);
    }
}
