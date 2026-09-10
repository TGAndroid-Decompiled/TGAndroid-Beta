package zh;

import org.telegram.tgnet.tl.TL_stories;
public final class r3 {
    public final int f48827a;
    public final TL_stories.StoryView f48828b;
    public final TL_stories.StoryReaction f48829c;

    public r3(int i10) {
        this.f48827a = i10;
        this.f48828b = null;
        this.f48829c = null;
    }

    public r3(TL_stories.StoryView storyView) {
        this.f48827a = 1;
        this.f48828b = storyView;
        this.f48829c = null;
    }

    public r3(TL_stories.StoryReaction storyReaction) {
        this.f48827a = 1;
        this.f48828b = null;
        this.f48829c = storyReaction;
    }
}
