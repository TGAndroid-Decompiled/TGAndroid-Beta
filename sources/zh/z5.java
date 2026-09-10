package zh;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class z5 {
    public int f49150a;

    public z5() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, x5 x5Var) {
        int i10 = UserConfig.selectedAccount;
        this.f49150a = i10;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.f49150a).getInputPeer(j3);
        ConnectionsManager.getInstance(this.f49150a).sendRequest(tL_stories_getPeerStories, new org.telegram.messenger.voip.c(this, j3, view, x5Var, messagesController));
    }
}
