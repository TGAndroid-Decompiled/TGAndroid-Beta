package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f50841a;

    public c(Drawable.ConstantState constantState) {
        this.f50841a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f50841a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f50841a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f50841a.newDrawable();
        dVar.f27633b = newDrawable;
        newDrawable.setCallback(dVar.f50843e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f50841a.newDrawable(resources);
        dVar.f27633b = newDrawable;
        newDrawable.setCallback(dVar.f50843e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f50841a.newDrawable(resources, theme);
        dVar.f27633b = newDrawable;
        newDrawable.setCallback(dVar.f50843e);
        return dVar;
    }
}
