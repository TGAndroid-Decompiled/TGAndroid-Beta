package pg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
public final class e extends FrameLayout {
    public final rg.f f45867a;

    public e(Context context) {
        super(context);
        ?? view = new View(context);
        this.f45867a = view;
        addView((View) view, e6.g());
    }

    public final void a(ig.a aVar, lg.d dVar) {
        rg.f fVar = this.f45867a;
        fVar.b(aVar, dVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.f45867a);
    }
}
