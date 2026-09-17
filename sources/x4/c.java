package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f48859a;

    public c(Drawable.ConstantState constantState) {
        this.f48859a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f48859a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f48859a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f48859a.newDrawable();
        dVar.f48864a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f48859a.newDrawable(resources);
        dVar.f48864a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f48859a.newDrawable(resources, theme);
        dVar.f48864a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }
}
