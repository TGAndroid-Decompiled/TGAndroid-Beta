package th;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lc;
import org.telegram.tgnet.tl.TL_stories;
public final class t7 extends lc {
    public final ArrayList f49497a;
    public float f49498b;
    public float f49499c;
    public float d;
    public float e;

    public t7(TL_stories.StoryItem storyItem) {
        for (int i10 = 0; i10 < storyItem.media_areas.size(); i10++) {
            if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f49497a == null) {
                    this.f49497a = new ArrayList();
                }
                this.f49497a.add(new q7(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)));
            } else if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f49497a == null) {
                    this.f49497a = new ArrayList();
                }
                this.f49497a.add(new s7(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i10)));
            }
        }
    }

    @Override
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f49497a;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((p7) arrayList.get(i10)).c(imageReceiver.e);
                ((p7) arrayList.get(i10)).b(true);
            }
        }
    }
}
