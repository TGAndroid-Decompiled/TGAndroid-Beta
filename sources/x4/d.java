package x4;

import ah.g1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import v7.o8;
public final class d extends g implements Animatable {
    public final Context f48861c;
    public final g1 d = new g1(this, 7);
    public final b f48860b = new Drawable.ConstantState();

    public d(Context context) {
        this.f48861c = context;
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f48860b;
        bVar.f48856a.draw(canvas);
        if (bVar.f48857b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f48860b.f48856a.getAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f48860b.getClass();
        return changingConfigurations;
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f48860b.f48856a.getColorFilter();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f48864a != null && Build.VERSION.SDK_INT >= 24) {
            return new c(this.f48864a.getConstantState());
        }
        return null;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f48860b.f48856a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f48860b.f48856a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f48860b.f48856a.getOpacity();
    }

    @Override
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        throw new UnsupportedOperationException("Method not decompiled: x4.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f48860b.f48856a.isAutoMirrored();
    }

    @Override
    public final boolean isRunning() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f48860b.f48857b.isRunning();
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f48860b.f48856a.isStateful();
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f48860b.f48856a.setBounds(rect);
        }
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f48860b.f48856a.setLevel(i10);
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f48860b.f48856a.setState(iArr);
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f48860b.f48856a.setAlpha(i10);
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f48860b.f48856a.setAutoMirrored(z10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f48860b.f48856a.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            o8.c(i10, drawable);
        } else {
            this.f48860b.f48856a.setTint(i10);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f48860b.f48856a.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f48860b.f48856a.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f48860b.f48856a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override
    public final void start() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f48860b;
        if (bVar.f48857b.isStarted()) {
            return;
        }
        bVar.f48857b.start();
        invalidateSelf();
    }

    @Override
    public final void stop() {
        Drawable drawable = this.f48864a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f48860b.f48857b.end();
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
