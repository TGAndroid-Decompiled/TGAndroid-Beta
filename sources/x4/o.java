package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class o extends Drawable.ConstantState {
    public final Drawable.ConstantState f48881a;

    public o(Drawable.ConstantState constantState) {
        this.f48881a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f48881a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f48881a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f48835a = (VectorDrawable) this.f48881a.newDrawable();
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f48835a = (VectorDrawable) this.f48881a.newDrawable(resources);
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f48835a = (VectorDrawable) this.f48881a.newDrawable(resources, theme);
        return pVar;
    }
}
