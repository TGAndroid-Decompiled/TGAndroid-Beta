package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f48829a;

    public c(Drawable.ConstantState constantState) {
        this.f48829a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f48829a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f48829a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f48829a.newDrawable();
        dVar.f48834a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f48829a.newDrawable(resources);
        dVar.f48834a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f48829a.newDrawable(resources, theme);
        dVar.f48834a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }
}
