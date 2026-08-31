package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
public final class e extends FrameLayout {
    public final xg.f f49282a;

    public e(Context context) {
        super(context);
        ?? view = new View(context);
        this.f49282a = view;
        addView((View) view, c6.g());
    }

    public final void a(og.a aVar, rg.d dVar) {
        xg.f fVar = this.f49282a;
        fVar.b(aVar, dVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.f49282a);
    }
}
