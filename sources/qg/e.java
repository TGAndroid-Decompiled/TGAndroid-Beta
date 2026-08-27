package qg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;

public final class e extends FrameLayout {

    public final sg.f f46535a;

    public e(Context context) {
        super(context);
        sg.f fVar = new sg.f(context);
        this.f46535a = fVar;
        addView(fVar, z5.g());
    }

    public final void a(jg.a aVar, mg.d dVar) {
        sg.f fVar = this.f46535a;
        fVar.b(aVar, dVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.f46535a);
    }
}
