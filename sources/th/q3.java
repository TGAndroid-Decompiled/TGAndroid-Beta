package th;

import org.telegram.tgnet.tl.TL_stories;
public final class q3 {
    public final int f49399a;
    public final TL_stories.StoryView f49400b;
    public final TL_stories.StoryReaction f49401c;

    public q3(int i10) {
        this.f49399a = i10;
        this.f49400b = null;
        this.f49401c = null;
    }

    public q3(TL_stories.StoryView storyView) {
        this.f49399a = 1;
        this.f49400b = storyView;
        this.f49401c = null;
    }

    public q3(TL_stories.StoryReaction storyReaction) {
        this.f49399a = 1;
        this.f49400b = null;
        this.f49401c = storyReaction;
    }
}
