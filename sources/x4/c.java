package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f45295a;

    public c(Drawable.ConstantState constantState) {
        this.f45295a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f45295a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f45295a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f45295a.newDrawable();
        dVar.f45300a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f45295a.newDrawable(resources);
        dVar.f45300a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f45295a.newDrawable(resources, theme);
        dVar.f45300a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }
}
