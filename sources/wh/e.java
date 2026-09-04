package wh;

import android.content.Context;
import android.view.TextureView;
public final class e extends TextureView {
    public final g f48589a;

    public e(g gVar, Context context) {
        super(context);
        this.f48589a = gVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        g gVar = this.f48589a;
        setMeasuredDimension(gVar.f48607g, gVar.h);
    }
}
