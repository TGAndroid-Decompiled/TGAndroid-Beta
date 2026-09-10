package xh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w9;
public final class h3 extends e3 {
    public final boolean f45504c;
    public final ImageReceiver d;

    public h3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f45367a = stargiftattributemodel.name;
        this.f45368b = stargiftattributemodel.getRarityPermille();
        this.f45504c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        z7.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f45504c) {
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
        this.f45367a = stargiftattributemodel.name;
        this.f45368b = stargiftattributemodel.getRarityPermille();
        this.f45504c = false;
        this.d = w9Var.getImageReceiver();
    }
}
