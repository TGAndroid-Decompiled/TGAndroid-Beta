package th;

import org.telegram.tgnet.tl.TL_stories;
public final class q5 implements Runnable {
    public final int f49402a;
    public final r5 f49403b;
    public final TL_stories.PeerStories f49404c;

    public q5(r5 r5Var, TL_stories.PeerStories peerStories, int i10) {
        this.f49402a = i10;
        this.f49403b = r5Var;
        this.f49404c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f49402a) {
            case 0:
                r5 r5Var = this.f49403b;
                r5Var.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.f49404c;
                    if (i10 < peerStories.stories.size()) {
                        r5Var.l(org.telegram.messenger.o5.o(peerStories.peer), peerStories.stories.get(i10));
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                r5 r5Var2 = this.f49403b;
                r5Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.f49404c;
                r5Var2.g(org.telegram.messenger.o5.o(peerStories2.peer), peerStories2);
                return;
        }
    }
}
