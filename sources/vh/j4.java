package vh;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class j4 {
    public TextureView f51329a;
    public ag.l f51330b;
    public ag.a f51331c;
    public boolean d;
    public int e;
    public int f51332f;
    public boolean f51333g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f51329a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f51329a);
                }
                this.f51329a = null;
            }
            this.d = false;
            this.f51329a = textureView;
            ag.l lVar = this.f51330b;
            if (lVar != null) {
                lVar.a(textureView);
            }
        }
    }
}
