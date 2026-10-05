package yh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w9;
public final class i3 extends f3 {
    public final boolean f51455c;
    public final ImageReceiver d;

    public i3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f51289a = stargiftattributemodel.name;
        this.f51290b = stargiftattributemodel.getRarityPermille();
        this.f51455c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        z7.f1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f51455c) {
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
        this.f51289a = stargiftattributemodel.name;
        this.f51290b = stargiftattributemodel.getRarityPermille();
        this.f51455c = false;
        this.d = w9Var.getImageReceiver();
    }
}
