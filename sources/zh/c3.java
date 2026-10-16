package zh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.z9;
public final class c3 extends z2 {
    public final boolean f50342c;
    public final ImageReceiver d;

    public c3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f51369a = stargiftattributemodel.name;
        this.f51370b = stargiftattributemodel.getRarityPermille();
        this.f50342c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        p7.a1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f50342c) {
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

    public c3(z9 z9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f51369a = stargiftattributemodel.name;
        this.f51370b = stargiftattributemodel.getRarityPermille();
        this.f50342c = false;
        this.d = z9Var.getImageReceiver();
    }
}
