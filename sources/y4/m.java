package y4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f52085a;
    public l f52086b;
    public ColorStateList f52087c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f52088f;
    public ColorStateList f52089g;
    public PorterDuff.Mode h;
    public int f52090i;
    public boolean f52091j;
    public boolean f52092k;
    public Paint f52093l;

    @Override
    public int getChangingConfigurations() {
        return this.f52085a;
    }

    @Override
    public final Drawable newDrawable() {
        return new o(this);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        return new o(this);
    }
}
