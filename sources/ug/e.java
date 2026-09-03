package ug;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
public final class e extends FrameLayout {
    public final wg.f f45581a;

    public e(Context context) {
        super(context);
        ?? view = new View(context);
        this.f45581a = view;
        addView((View) view, b6.g());
    }

    public final void a(ng.a aVar, qg.d dVar) {
        wg.f fVar = this.f45581a;
        fVar.b(aVar, dVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.f45581a);
    }
}
