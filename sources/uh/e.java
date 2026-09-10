package uh;

import android.content.Context;
import android.view.TextureView;
public final class e extends TextureView {
    public final g f42750a;

    public e(g gVar, Context context) {
        super(context);
        this.f42750a = gVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        g gVar = this.f42750a;
        setMeasuredDimension(gVar.f42766g, gVar.h);
    }
}
