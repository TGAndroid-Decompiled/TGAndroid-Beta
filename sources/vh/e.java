package vh;

import android.content.Context;
import android.view.TextureView;
public final class e extends TextureView {
    public final g f44405a;

    public e(g gVar, Context context) {
        super(context);
        this.f44405a = gVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        g gVar = this.f44405a;
        setMeasuredDimension(gVar.f44421g, gVar.h);
    }
}
