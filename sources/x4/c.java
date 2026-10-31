package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f53011a;

    public c(Drawable.ConstantState constantState) {
        this.f53011a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f53011a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f53011a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f53011a.newDrawable();
        dVar.f26491b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f53011a.newDrawable(resources);
        dVar.f26491b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f53011a.newDrawable(resources, theme);
        dVar.f26491b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }
}
