package qh;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class h5 {
    public TextureView f45404a;
    public dg.h0 f45405b;
    public eg.p1 f45406c;
    public boolean d;
    public int f45407e;
    public int f45408f;
    public boolean f45409g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f45404a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f45404a);
                }
                this.f45404a = null;
            }
            this.d = false;
            this.f45404a = textureView;
            dg.h0 h0Var = this.f45405b;
            if (h0Var != null) {
                h0Var.run(textureView);
            }
        }
    }
}
