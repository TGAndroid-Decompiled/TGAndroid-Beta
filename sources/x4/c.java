package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f50726a;

    public c(Drawable.ConstantState constantState) {
        this.f50726a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f50726a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f50726a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f50726a.newDrawable();
        dVar.f27222b = newDrawable;
        newDrawable.setCallback(dVar.f50728e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f50726a.newDrawable(resources);
        dVar.f27222b = newDrawable;
        newDrawable.setCallback(dVar.f50728e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f50726a.newDrawable(resources, theme);
        dVar.f27222b = newDrawable;
        newDrawable.setCallback(dVar.f50728e);
        return dVar;
    }
}
