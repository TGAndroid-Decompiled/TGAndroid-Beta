package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class o extends Drawable.ConstantState {
    public final Drawable.ConstantState f45636a;

    public o(Drawable.ConstantState constantState) {
        this.f45636a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f45636a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f45636a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f45594a = (VectorDrawable) this.f45636a.newDrawable();
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f45594a = (VectorDrawable) this.f45636a.newDrawable(resources);
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f45594a = (VectorDrawable) this.f45636a.newDrawable(resources, theme);
        return pVar;
    }
}
