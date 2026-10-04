package yh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w9;
public final class h3 extends e3 {
    public final boolean f51378c;
    public final ImageReceiver d;

    public h3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f51223a = stargiftattributemodel.name;
        this.f51224b = stargiftattributemodel.getRarityPermille();
        this.f51378c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        x7.f1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f51378c) {
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

    public h3(w9 w9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f51223a = stargiftattributemodel.name;
        this.f51224b = stargiftattributemodel.getRarityPermille();
        this.f51378c = false;
        this.d = w9Var.getImageReceiver();
    }
}
