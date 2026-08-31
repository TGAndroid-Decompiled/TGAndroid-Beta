package qh;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class i5 {
    public TextureView f45422a;
    public dg.h0 f45423b;
    public eg.p1 f45424c;
    public boolean d;
    public int f45425e;
    public int f45426f;
    public boolean f45427g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f45422a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f45422a);
                }
                this.f45422a = null;
            }
            this.d = false;
            this.f45422a = textureView;
            dg.h0 h0Var = this.f45423b;
            if (h0Var != null) {
                h0Var.run(textureView);
            }
        }
    }
}
