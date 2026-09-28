package x4;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class b extends Drawable.ConstantState {
    public p f45547a;
    public AnimatorSet f45548b;
    public ArrayList f45549c;
    public a0.f d;

    @Override
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
