package yh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u9;
public final class j3 extends g3 {
    public final boolean f47272c;
    public final ImageReceiver d;

    public j3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f47153a = stargiftattributemodel.name;
        this.f47154b = stargiftattributemodel.getRarityPermille();
        this.f47272c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        x7.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f47272c) {
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

    public j3(u9 u9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f47153a = stargiftattributemodel.name;
        this.f47154b = stargiftattributemodel.getRarityPermille();
        this.f47272c = false;
        this.d = u9Var.getImageReceiver();
    }
}
