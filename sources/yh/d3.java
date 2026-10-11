package yh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.y9;
public final class d3 extends a3 {
    public final boolean f52502c;
    public final ImageReceiver d;

    public d3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f52363a = stargiftattributemodel.name;
        this.f52364b = stargiftattributemodel.getRarityPermille();
        this.f52502c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        p7.a1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f52502c) {
            this.d.onDetachedFromWindow();
        }
    }

    @Override
    public final boolean b() {
        if (this.d.getLottieAnimation() != null) {
            return true;
        }
        return false;
    }

    public d3(y9 y9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f52363a = stargiftattributemodel.name;
        this.f52364b = stargiftattributemodel.getRarityPermille();
        this.f52502c = false;
        this.d = y9Var.getImageReceiver();
    }
}
