package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class e0 extends ViewOutlineProvider {
    public final int f51677a;
    public final f0 f51678b;

    public e0(f0 f0Var, int i10) {
        this.f51677a = i10;
        this.f51678b = f0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f51677a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                f0 f0Var = this.f51678b;
                outline.setRoundRect(Math.round(f0Var.f51717n - translationX), Math.round(f0Var.f51722r - translationY), Math.round(f0Var.f51724s - translationX), Math.round(f0Var.v - translationY), f0Var.f51725w);
                return;
            default:
                int height = view.getHeight();
                f0 f0Var2 = this.f51678b;
                int i10 = f0Var2.f51704b0;
                outline.setRoundRect(f0Var2.f51702a0, i10, view.getWidth() - f0Var2.f51702a0, view.getHeight() - f0Var2.f51706c0, ((height - i10) - f0Var2.f51706c0) / 2.0f);
                return;
        }
    }
}
