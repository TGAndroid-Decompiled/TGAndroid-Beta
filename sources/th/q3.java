package th;

import org.telegram.tgnet.tl.TL_stories;
public final class q3 {
    public final int f49385a;
    public final TL_stories.StoryView f49386b;
    public final TL_stories.StoryReaction f49387c;

    public q3(int i10) {
        this.f49385a = i10;
        this.f49386b = null;
        this.f49387c = null;
    }

    public q3(TL_stories.StoryView storyView) {
        this.f49385a = 1;
        this.f49386b = storyView;
        this.f49387c = null;
    }

    public q3(TL_stories.StoryReaction storyReaction) {
        this.f49385a = 1;
        this.f49386b = null;
        this.f49387c = storyReaction;
    }
}
