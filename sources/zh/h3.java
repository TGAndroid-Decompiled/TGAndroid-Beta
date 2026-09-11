package zh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.x9;
public final class h3 extends e3 {
    public final boolean f51979c;
    public final ImageReceiver d;

    public h3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f51821a = stargiftattributemodel.name;
        this.f51822b = stargiftattributemodel.getRarityPermille();
        this.f51979c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        v7.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f51979c) {
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

    public h3(x9 x9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f51821a = stargiftattributemodel.name;
        this.f51822b = stargiftattributemodel.getRarityPermille();
        this.f51979c = false;
        this.d = x9Var.getImageReceiver();
    }
}
