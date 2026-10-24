package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class l0 extends ViewOutlineProvider {
    public final int f52496a;
    public final n0 f52497b;

    public l0(n0 n0Var, int i10) {
        this.f52496a = i10;
        this.f52497b = n0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f52496a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                n0 n0Var = this.f52497b;
                outline.setRoundRect(Math.round(n0Var.f52518n - translationX), Math.round(n0Var.f52523r - translationY), Math.round(n0Var.f52525s - translationX), Math.round(n0Var.v - translationY), n0Var.f52526w);
                return;
            default:
                int height = view.getHeight();
                n0 n0Var2 = this.f52497b;
                int i10 = n0Var2.f52505b0;
                outline.setRoundRect(n0Var2.f52503a0, i10, view.getWidth() - n0Var2.f52503a0, view.getHeight() - n0Var2.f52507c0, ((height - i10) - n0Var2.f52507c0) / 2.0f);
                return;
        }
    }
}
