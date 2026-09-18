package vh;

import android.content.Context;
import android.view.TextureView;
public final class e extends TextureView {
    public final g f44410a;

    public e(g gVar, Context context) {
        super(context);
        this.f44410a = gVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        g gVar = this.f44410a;
        setMeasuredDimension(gVar.f44426g, gVar.h);
    }
}
