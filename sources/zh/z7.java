package zh;

import android.graphics.Canvas;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class z7 extends ImageReceiver.Decorator {
    public final ArrayList f49160a;
    public float f49161b;
    public float f49162c;
    public float d;
    public float e;

    public z7(TL_stories.StoryItem storyItem) {
        for (int i10 = 0; i10 < storyItem.media_areas.size(); i10++) {
            if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f49160a == null) {
                    this.f49160a = new ArrayList();
                }
                this.f49160a.add(new w7(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)));
            } else if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f49160a == null) {
                    this.f49160a = new ArrayList();
                }
                this.f49160a.add(new y7(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i10)));
            }
        }
    }

    @Override
    public final void onAttachedToWindow(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f49160a;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((v7) arrayList.get(i10)).c(imageReceiver.getParentView());
                ((v7) arrayList.get(i10)).b(true);
            }
        }
    }

    @Override
    public final void onDetachedFromWidnow() {
        ArrayList arrayList = this.f49160a;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((v7) arrayList.get(i10)).b(false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas, ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f49160a;
        if (arrayList == null) {
            return;
        }
        float alpha = imageReceiver.getAlpha();
        float centerX = imageReceiver.getCenterX();
        float centerY = imageReceiver.getCenterY();
        float imageWidth = imageReceiver.getImageWidth();
        this.d = imageWidth;
        float f7 = (16.0f * imageWidth) / 9.0f;
        this.e = f7;
        this.f49161b = centerX - (imageWidth / 2.0f);
        this.f49162c = centerY - (f7 / 2.0f);
        canvas.save();
        canvas.clipRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((v7) arrayList.get(i10)).a(canvas, alpha);
        }
        canvas.restore();
    }
}
