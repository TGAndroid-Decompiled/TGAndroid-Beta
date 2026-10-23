package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class n extends Drawable.ConstantState {
    public final Drawable.ConstantState f49729a;

    public n(Drawable.ConstantState constantState) {
        this.f49729a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f49729a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f49729a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        o oVar = new o();
        oVar.f24829b = (VectorDrawable) this.f49729a.newDrawable();
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        o oVar = new o();
        oVar.f24829b = (VectorDrawable) this.f49729a.newDrawable(resources);
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        o oVar = new o();
        oVar.f24829b = (VectorDrawable) this.f49729a.newDrawable(resources, theme);
        return oVar;
    }
}
