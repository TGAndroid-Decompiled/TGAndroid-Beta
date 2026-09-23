package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class o extends Drawable.ConstantState {
    public final Drawable.ConstantState f45269a;

    public o(Drawable.ConstantState constantState) {
        this.f45269a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f45269a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f45269a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f45227a = (VectorDrawable) this.f45269a.newDrawable();
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f45227a = (VectorDrawable) this.f45269a.newDrawable(resources);
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f45227a = (VectorDrawable) this.f45269a.newDrawable(resources, theme);
        return pVar;
    }
}
