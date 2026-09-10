package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f44612a;

    public c(Drawable.ConstantState constantState) {
        this.f44612a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f44612a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f44612a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f44612a.newDrawable();
        dVar.f44617a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f44612a.newDrawable(resources);
        dVar.f44617a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f44612a.newDrawable(resources, theme);
        dVar.f44617a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }
}
