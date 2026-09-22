package yh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v9;
public final class i3 extends f3 {
    public final boolean f47576c;
    public final ImageReceiver d;

    public i3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f47429a = stargiftattributemodel.name;
        this.f47430b = stargiftattributemodel.getRarityPermille();
        this.f47576c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        w7.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f47576c) {
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

    public i3(v9 v9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f47429a = stargiftattributemodel.name;
        this.f47430b = stargiftattributemodel.getRarityPermille();
        this.f47576c = false;
        this.d = v9Var.getImageReceiver();
    }
}
