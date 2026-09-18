package yh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w9;
public final class i3 extends f3 {
    public final boolean f47510c;
    public final ImageReceiver d;

    public i3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f47365a = stargiftattributemodel.name;
        this.f47366b = stargiftattributemodel.getRarityPermille();
        this.f47510c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        v7.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f47510c) {
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

    public i3(w9 w9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f47365a = stargiftattributemodel.name;
        this.f47366b = stargiftattributemodel.getRarityPermille();
        this.f47510c = false;
        this.d = w9Var.getImageReceiver();
    }
}
