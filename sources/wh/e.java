package wh;

import android.content.Context;
import android.view.TextureView;
public final class e extends TextureView {
    public final g f48619a;

    public e(g gVar, Context context) {
        super(context);
        this.f48619a = gVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        g gVar = this.f48619a;
        setMeasuredDimension(gVar.f48637g, gVar.h);
    }
}
