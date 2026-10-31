package vh;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class j4 {
    public TextureView f51314a;
    public ag.l f51315b;
    public ag.a f51316c;
    public boolean d;
    public int e;
    public int f51317f;
    public boolean f51318g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f51314a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f51314a);
                }
                this.f51314a = null;
            }
            this.d = false;
            this.f51314a = textureView;
            ag.l lVar = this.f51315b;
            if (lVar != null) {
                lVar.a(textureView);
            }
        }
    }
}
