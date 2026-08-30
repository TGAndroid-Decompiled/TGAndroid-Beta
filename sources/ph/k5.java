package ph;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class k5 {
    public TextureView f41855a;
    public cg.h0 f41856b;
    public dg.r1 f41857c;
    public boolean d;
    public int e;
    public int f41858f;
    public boolean f41859g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f41855a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f41855a);
                }
                this.f41855a = null;
            }
            this.d = false;
            this.f41855a = textureView;
            cg.h0 h0Var = this.f41856b;
            if (h0Var != null) {
                h0Var.run(textureView);
            }
        }
    }
}
