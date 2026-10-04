package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f49319a;

    public c(Drawable.ConstantState constantState) {
        this.f49319a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f49319a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f49319a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f49319a.newDrawable();
        dVar.f49324a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f49319a.newDrawable(resources);
        dVar.f49324a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f49319a.newDrawable(resources, theme);
        dVar.f49324a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }
}
