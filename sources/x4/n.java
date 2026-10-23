package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class n extends Drawable.ConstantState {
    public final Drawable.ConstantState f49287a;

    public n(Drawable.ConstantState constantState) {
        this.f49287a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f49287a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f49287a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        o oVar = new o();
        oVar.f25016b = (VectorDrawable) this.f49287a.newDrawable();
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        o oVar = new o();
        oVar.f25016b = (VectorDrawable) this.f49287a.newDrawable(resources);
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        o oVar = new o();
        oVar.f25016b = (VectorDrawable) this.f49287a.newDrawable(resources, theme);
        return oVar;
    }
}
