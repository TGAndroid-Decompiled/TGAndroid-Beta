package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class n extends Drawable.ConstantState {
    public final Drawable.ConstantState f49286a;

    public n(Drawable.ConstantState constantState) {
        this.f49286a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f49286a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f49286a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        o oVar = new o();
        oVar.f25015b = (VectorDrawable) this.f49286a.newDrawable();
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        o oVar = new o();
        oVar.f25015b = (VectorDrawable) this.f49286a.newDrawable(resources);
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        o oVar = new o();
        oVar.f25015b = (VectorDrawable) this.f49286a.newDrawable(resources, theme);
        return oVar;
    }
}
