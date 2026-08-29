package sg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
public final class e extends FrameLayout {
    public final ug.f f48047a;

    public e(Context context) {
        super(context);
        ?? view = new View(context);
        this.f48047a = view;
        addView((View) view, f6.g());
    }

    public final void a(lg.a aVar, og.d dVar) {
        ug.f fVar = this.f48047a;
        fVar.b(aVar, dVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.f48047a);
    }
}
