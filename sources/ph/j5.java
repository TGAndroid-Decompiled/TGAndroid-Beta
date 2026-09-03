package ph;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class j5 {
    public TextureView f41814a;
    public cg.h0 f41815b;
    public dg.r1 f41816c;
    public boolean d;
    public int e;
    public int f41817f;
    public boolean f41818g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f41814a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f41814a);
                }
                this.f41814a = null;
            }
            this.d = false;
            this.f41814a = textureView;
            cg.h0 h0Var = this.f41815b;
            if (h0Var != null) {
                h0Var.run(textureView);
            }
        }
    }
}
