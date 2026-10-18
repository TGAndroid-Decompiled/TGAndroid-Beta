package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class e0 extends ViewOutlineProvider {
    public final int f51724a;
    public final f0 f51725b;

    public e0(f0 f0Var, int i10) {
        this.f51724a = i10;
        this.f51725b = f0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f51724a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                f0 f0Var = this.f51725b;
                outline.setRoundRect(Math.round(f0Var.f51764n - translationX), Math.round(f0Var.f51768r - translationY), Math.round(f0Var.f51769s - translationX), Math.round(f0Var.v - translationY), f0Var.f51770w);
                return;
            default:
                int height = view.getHeight();
                f0 f0Var2 = this.f51725b;
                int i10 = f0Var2.Z;
                outline.setRoundRect(f0Var2.Y, i10, view.getWidth() - f0Var2.Y, view.getHeight() - f0Var2.f51749a0, ((height - i10) - f0Var2.f51749a0) / 2.0f);
                return;
        }
    }
}
