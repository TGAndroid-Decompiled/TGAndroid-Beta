package rh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g9;
public final class l3 extends i3 {
    public final boolean f47187c;
    public final ImageReceiver d;

    public l3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f47097a = stargiftattributemodel.name;
        this.f47098b = stargiftattributemodel.getRarityPermille();
        this.f47187c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        h8.c1(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override
    public final void a() {
        if (this.f47187c) {
            this.d.R();
        }
    }

    @Override
    public final boolean b() {
        if (this.d.B() != null) {
            return true;
        }
        return false;
    }

    public l3(g9 g9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.f47097a = stargiftattributemodel.name;
        this.f47098b = stargiftattributemodel.getRarityPermille();
        this.f47187c = false;
        this.d = g9Var.getImageReceiver();
    }
}
