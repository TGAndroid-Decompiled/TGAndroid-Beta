package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.telegram.ui.Components.hr;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v7.c8;
import v7.q8;
public final class o extends hr {
    public static final PorterDuff.Mode v = PorterDuff.Mode.SRC_IN;
    public m f50699c;
    public PorterDuffColorFilter d;
    public ColorFilter f50700e;
    public boolean f50701f;
    public boolean h;
    public final float[] f50702n;
    public final Matrix f50703r;
    public final Rect f50704s;

    public o() {
        this.h = true;
        this.f50702n = new float[9];
        this.f50703r = new Matrix();
        this.f50704s = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f50690c = null;
        constantState.d = v;
        constantState.f50689b = new l();
        this.f50699c = constantState;
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f50704s;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f50700e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            Matrix matrix = this.f50703r;
            canvas.getMatrix(matrix);
            float[] fArr = this.f50702n;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                m mVar = this.f50699c;
                Bitmap bitmap = mVar.f50692f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != mVar.f50692f.getHeight()) {
                    mVar.f50692f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    mVar.f50696k = true;
                }
                if (!this.h) {
                    m mVar2 = this.f50699c;
                    mVar2.f50692f.eraseColor(0);
                    Canvas canvas2 = new Canvas(mVar2.f50692f);
                    l lVar = mVar2.f50689b;
                    lVar.a(lVar.f50680g, l.f50674p, canvas2, min, min2);
                } else {
                    m mVar3 = this.f50699c;
                    if (mVar3.f50696k || mVar3.f50693g != mVar3.f50690c || mVar3.h != mVar3.d || mVar3.f50695j != mVar3.f50691e || mVar3.f50694i != mVar3.f50689b.getRootAlpha()) {
                        m mVar4 = this.f50699c;
                        mVar4.f50692f.eraseColor(0);
                        Canvas canvas3 = new Canvas(mVar4.f50692f);
                        l lVar2 = mVar4.f50689b;
                        lVar2.a(lVar2.f50680g, l.f50674p, canvas3, min, min2);
                        m mVar5 = this.f50699c;
                        mVar5.f50693g = mVar5.f50690c;
                        mVar5.h = mVar5.d;
                        mVar5.f50694i = mVar5.f50689b.getRootAlpha();
                        mVar5.f50695j = mVar5.f50691e;
                        mVar5.f50696k = false;
                    }
                }
                m mVar6 = this.f50699c;
                if (mVar6.f50689b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (mVar6.f50697l == null) {
                        Paint paint2 = new Paint();
                        mVar6.f50697l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    mVar6.f50697l.setAlpha(mVar6.f50689b.getRootAlpha());
                    mVar6.f50697l.setColorFilter(colorFilter);
                    paint = mVar6.f50697l;
                }
                canvas.drawBitmap(mVar6.f50692f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f50699c.f50689b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f50699c.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f50700e;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.f27132b) != null && Build.VERSION.SDK_INT >= 24) {
            return new n(((Drawable) this.f27132b).getConstantState());
        }
        this.f50699c.f50688a = getChangingConfigurations();
        return this.f50699c;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f50699c.f50689b.f50681i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f50699c.f50689b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f50699c.f50691e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            m mVar = this.f50699c;
            if (mVar != null) {
                l lVar = mVar.f50689b;
                if (lVar.f50686n == null) {
                    lVar.f50686n = Boolean.valueOf(lVar.f50680g.a());
                }
                if (!lVar.f50686n.booleanValue()) {
                    ColorStateList colorStateList = this.f50699c.f50690c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f50701f && super.mutate() == this) {
            m mVar = this.f50699c;
            ?? constantState = new Drawable.ConstantState();
            constantState.f50690c = null;
            constantState.d = v;
            if (mVar != null) {
                constantState.f50688a = mVar.f50688a;
                l lVar = new l(mVar.f50689b);
                constantState.f50689b = lVar;
                if (mVar.f50689b.f50678e != null) {
                    lVar.f50678e = new Paint(mVar.f50689b.f50678e);
                }
                if (mVar.f50689b.d != null) {
                    constantState.f50689b.d = new Paint(mVar.f50689b.d);
                }
                constantState.f50690c = mVar.f50690c;
                constantState.d = mVar.d;
                constantState.f50691e = mVar.f50691e;
            }
            this.f50699c = constantState;
            this.f50701f = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f50699c;
        ColorStateList colorStateList = mVar.f50690c;
        if (colorStateList != null && (mode = mVar.d) != null) {
            this.d = c(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        l lVar = mVar.f50689b;
        if (lVar.f50686n == null) {
            lVar.f50686n = Boolean.valueOf(lVar.f50680g.a());
        }
        if (lVar.f50686n.booleanValue()) {
            boolean b10 = mVar.f50689b.f50680g.b(iArr);
            mVar.f50696k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f50699c.f50689b.getRootAlpha() != i10) {
            this.f50699c.f50689b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f50699c.f50691e = z10;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f50700e = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            q8.a(i10, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        m mVar = this.f50699c;
        if (mVar.f50690c != colorStateList) {
            mVar.f50690c = colorStateList;
            this.d = c(colorStateList, mVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        m mVar = this.f50699c;
        if (mVar.d != mode) {
            mVar.d = mode;
            this.d = c(mVar.f50690c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        char c10;
        int i11;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = (Drawable) this.f27132b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.f50699c;
        mVar.f50689b = new l();
        TypedArray f7 = h0.b.f(resources, theme, attributeSet, a.f50636a);
        m mVar2 = this.f50699c;
        l lVar = mVar2.f50689b;
        int i12 = !h0.b.c(xmlPullParser, "tintMode") ? -1 : f7.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i12 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i12 != 5) {
            if (i12 != 9) {
                switch (i12) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        mVar2.d = mode;
        ColorStateList colorStateList = null;
        int i13 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f7.getValue(1, typedValue);
            int i14 = typedValue.type;
            if (i14 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i14 >= 28 && i14 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f7.getResources();
                int resourceId = f7.getResourceId(1, 0);
                ThreadLocal threadLocal = h0.c.f10937a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e7) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e7);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            mVar2.f50690c = colorStateList2;
        }
        boolean z10 = mVar2.f50691e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = f7.getBoolean(5, z10);
        }
        mVar2.f50691e = z10;
        float f10 = lVar.f50682j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = f7.getFloat(7, f10);
        }
        lVar.f50682j = f10;
        float f11 = lVar.f50683k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = f7.getFloat(8, f11);
        }
        lVar.f50683k = f11;
        if (lVar.f50682j <= 0.0f) {
            throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f11 > 0.0f) {
            lVar.h = f7.getDimension(3, lVar.h);
            float dimension = f7.getDimension(2, lVar.f50681i);
            lVar.f50681i = dimension;
            if (lVar.h <= 0.0f) {
                throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = lVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f7.getFloat(4, alpha);
                }
                lVar.setAlpha(alpha);
                String string = f7.getString(0);
                if (string != null) {
                    lVar.f50685m = string;
                    lVar.f50687o.put(string, lVar);
                }
                f7.recycle();
                mVar.f50688a = getChangingConfigurations();
                mVar.f50696k = true;
                m mVar3 = this.f50699c;
                l lVar2 = mVar3.f50689b;
                ArrayDeque arrayDeque = new ArrayDeque();
                i iVar = lVar2.f50680g;
                a0.f fVar = lVar2.f50687o;
                arrayDeque.push(iVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        i iVar2 = (i) arrayDeque.peek();
                        i10 = depth;
                        if ("path".equals(name)) {
                            ?? kVar = new k();
                            kVar.f50653e = 0.0f;
                            kVar.f50655g = 1.0f;
                            kVar.h = 1.0f;
                            kVar.f50656i = 0.0f;
                            kVar.f50657j = 1.0f;
                            kVar.f50658k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            kVar.f50659l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            kVar.f50660m = join2;
                            kVar.f50661n = 4.0f;
                            TypedArray f12 = h0.b.f(resources, theme, attributeSet, a.f50638c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f12.getString(0);
                                if (string2 != null) {
                                    kVar.f50672b = string2;
                                }
                                String string3 = f12.getString(2);
                                if (string3 != null) {
                                    kVar.f50671a = c8.c(string3);
                                }
                                kVar.f50654f = h0.b.a(f12, xmlPullParser, theme, "fillColor", 1);
                                float f13 = kVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f13 = f12.getFloat(12, f13);
                                }
                                kVar.h = f13;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f12.getInt(8, -1) : -1;
                                Paint.Cap cap3 = kVar.f50659l;
                                if (i15 == 0) {
                                    cap = cap2;
                                } else if (i15 != 1) {
                                    cap = i15 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                kVar.f50659l = cap;
                                int i16 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f12.getInt(9, -1) : -1;
                                Paint.Join join3 = kVar.f50660m;
                                if (i16 == 0) {
                                    join = join2;
                                } else if (i16 != 1) {
                                    join = i16 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                kVar.f50660m = join;
                                float f14 = kVar.f50661n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f14 = f12.getFloat(10, f14);
                                }
                                kVar.f50661n = f14;
                                kVar.d = h0.b.a(f12, xmlPullParser, theme, "strokeColor", 3);
                                float f15 = kVar.f50655g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f15 = f12.getFloat(11, f15);
                                }
                                kVar.f50655g = f15;
                                float f16 = kVar.f50653e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f16 = f12.getFloat(4, f16);
                                }
                                kVar.f50653e = f16;
                                float f17 = kVar.f50657j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f17 = f12.getFloat(6, f17);
                                }
                                kVar.f50657j = f17;
                                float f18 = kVar.f50658k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f18 = f12.getFloat(7, f18);
                                }
                                kVar.f50658k = f18;
                                float f19 = kVar.f50656i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f19 = f12.getFloat(5, f19);
                                }
                                kVar.f50656i = f19;
                                int i17 = kVar.f50673c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i17 = f12.getInt(13, i17);
                                }
                                kVar.f50673c = i17;
                            }
                            f12.recycle();
                            iVar2.f50663b.add(kVar);
                            if (kVar.getPathName() != null) {
                                fVar.put(kVar.getPathName(), kVar);
                            }
                            mVar3.f50688a = mVar3.f50688a;
                            z11 = false;
                            c10 = '\b';
                        } else {
                            c10 = '\b';
                            if ("clip-path".equals(name)) {
                                k kVar2 = new k();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f20 = h0.b.f(resources, theme, attributeSet, a.d);
                                    String string4 = f20.getString(0);
                                    if (string4 != null) {
                                        kVar2.f50672b = string4;
                                    }
                                    String string5 = f20.getString(1);
                                    if (string5 != null) {
                                        kVar2.f50671a = c8.c(string5);
                                    }
                                    kVar2.f50673c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f20.getInt(2, 0);
                                    f20.recycle();
                                }
                                iVar2.f50663b.add(kVar2);
                                if (kVar2.getPathName() != null) {
                                    fVar.put(kVar2.getPathName(), kVar2);
                                }
                                mVar3.f50688a = mVar3.f50688a;
                            } else if ("group".equals(name)) {
                                i iVar3 = new i();
                                TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.f50637b);
                                float f22 = iVar3.f50664c;
                                if (h0.b.c(xmlPullParser, "rotation")) {
                                    f22 = f21.getFloat(5, f22);
                                }
                                iVar3.f50664c = f22;
                                iVar3.d = f21.getFloat(1, iVar3.d);
                                iVar3.f50665e = f21.getFloat(2, iVar3.f50665e);
                                float f23 = iVar3.f50666f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f23 = f21.getFloat(3, f23);
                                }
                                iVar3.f50666f = f23;
                                float f24 = iVar3.f50667g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f24 = f21.getFloat(4, f24);
                                }
                                iVar3.f50667g = f24;
                                float f25 = iVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f25 = f21.getFloat(6, f25);
                                }
                                iVar3.h = f25;
                                float f26 = iVar3.f50668i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f26 = f21.getFloat(7, f26);
                                }
                                iVar3.f50668i = f26;
                                String string6 = f21.getString(0);
                                if (string6 != null) {
                                    iVar3.f50670k = string6;
                                }
                                iVar3.c();
                                f21.recycle();
                                iVar2.f50663b.add(iVar3);
                                arrayDeque.push(iVar3);
                                if (iVar3.getGroupName() != null) {
                                    fVar.put(iVar3.getGroupName(), iVar3);
                                }
                                mVar3.f50688a = mVar3.f50688a;
                            }
                        }
                        i11 = 1;
                    } else {
                        i10 = depth;
                        c10 = '\b';
                        i11 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i13 = i11;
                    depth = i10;
                }
                if (!z11) {
                    this.d = c(mVar.f50690c, mVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public o(m mVar) {
        this.h = true;
        this.f50702n = new float[9];
        this.f50703r = new Matrix();
        this.f50704s = new Rect();
        this.f50699c = mVar;
        this.d = c(mVar.f50690c, mVar.d);
    }
}
