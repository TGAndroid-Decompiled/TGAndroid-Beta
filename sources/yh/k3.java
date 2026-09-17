package yh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u9;
public final class k3 extends h3 {
    public final boolean f47389c;
    public final ImageReceiver d;

    public k3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f47269a = stargiftattributemodel.name;
        this.f47270b = stargiftattributemodel.getRarityPermille();
        this.f47389c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        y7.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f47389c) {
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

    public k3(u9 u9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f47269a = stargiftattributemodel.name;
        this.f47270b = stargiftattributemodel.getRarityPermille();
        this.f47389c = false;
        this.d = u9Var.getImageReceiver();
    }
}
