package zh;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class t5 implements Runnable {
    public final int f48901a;
    public final v5 f48902b;
    public final TL_stories.PeerStories f48903c;

    public t5(v5 v5Var, TL_stories.PeerStories peerStories, int i10) {
        this.f48901a = i10;
        this.f48902b = v5Var;
        this.f48903c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f48901a) {
            case 0:
                v5 v5Var = this.f48902b;
                v5Var.getClass();
                TL_stories.PeerStories peerStories = this.f48903c;
                v5Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                v5 v5Var2 = this.f48902b;
                v5Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f48903c;
                    if (i10 < peerStories2.stories.size()) {
                        v5Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
