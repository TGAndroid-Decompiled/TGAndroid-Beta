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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v7.h8;
import v7.s8;
public final class p extends g {
    public static final PorterDuff.Mode f45598s = PorterDuff.Mode.SRC_IN;
    public n f45599b;
    public PorterDuffColorFilter f45600c;
    public ColorFilter d;
    public boolean e;
    public boolean f45601f;
    public final float[] h;
    public final Matrix f45602n;
    public final Rect f45603r;

    public p() {
        this.f45601f = true;
        this.h = new float[9];
        this.f45602n = new Matrix();
        this.f45603r = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f45590c = null;
        constantState.d = f45598s;
        constantState.f45589b = new m();
        this.f45599b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f45603r;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.d;
            if (colorFilter == null) {
                colorFilter = this.f45600c;
            }
            Matrix matrix = this.f45602n;
            canvas.getMatrix(matrix);
            float[] fArr = this.h;
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
                if (isAutoMirrored() && s8.a(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.f45599b;
                Bitmap bitmap = nVar.f45591f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f45591f.getHeight()) {
                    nVar.f45591f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f45595k = true;
                }
                if (!this.f45601f) {
                    n nVar2 = this.f45599b;
                    nVar2.f45591f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f45591f);
                    m mVar = nVar2.f45589b;
                    mVar.a(mVar.f45580g, m.f45575p, canvas2, min, min2);
                } else {
                    n nVar3 = this.f45599b;
                    if (nVar3.f45595k || nVar3.f45592g != nVar3.f45590c || nVar3.h != nVar3.d || nVar3.f45594j != nVar3.e || nVar3.f45593i != nVar3.f45589b.getRootAlpha()) {
                        n nVar4 = this.f45599b;
                        nVar4.f45591f.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.f45591f);
                        m mVar2 = nVar4.f45589b;
                        mVar2.a(mVar2.f45580g, m.f45575p, canvas3, min, min2);
                        n nVar5 = this.f45599b;
                        nVar5.f45592g = nVar5.f45590c;
                        nVar5.h = nVar5.d;
                        nVar5.f45593i = nVar5.f45589b.getRootAlpha();
                        nVar5.f45594j = nVar5.e;
                        nVar5.f45595k = false;
                    }
                }
                n nVar6 = this.f45599b;
                if (nVar6.f45589b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.f45596l == null) {
                        Paint paint2 = new Paint();
                        nVar6.f45596l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.f45596l.setAlpha(nVar6.f45589b.getRootAlpha());
                    nVar6.f45596l.setColorFilter(colorFilter);
                    paint = nVar6.f45596l;
                }
                canvas.drawBitmap(nVar6.f45591f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f45599b.f45589b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f45599b.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.d;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f45555a != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f45555a.getConstantState());
        }
        this.f45599b.f45588a = getChangingConfigurations();
        return this.f45599b;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f45599b.f45589b.f45581i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f45599b.f45589b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f45599b.e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f45599b;
            if (nVar != null) {
                m mVar = nVar.f45589b;
                if (mVar.f45586n == null) {
                    mVar.f45586n = Boolean.valueOf(mVar.f45580g.a());
                }
                if (!mVar.f45586n.booleanValue()) {
                    ColorStateList colorStateList = this.f45599b.f45590c;
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
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            n nVar = this.f45599b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f45590c = null;
            constantState.d = f45598s;
            if (nVar != null) {
                constantState.f45588a = nVar.f45588a;
                m mVar = new m(nVar.f45589b);
                constantState.f45589b = mVar;
                if (nVar.f45589b.e != null) {
                    mVar.e = new Paint(nVar.f45589b.e);
                }
                if (nVar.f45589b.d != null) {
                    constantState.f45589b.d = new Paint(nVar.f45589b.d);
                }
                constantState.f45590c = nVar.f45590c;
                constantState.d = nVar.d;
                constantState.e = nVar.e;
            }
            this.f45599b = constantState;
            this.e = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f45599b;
        ColorStateList colorStateList = nVar.f45590c;
        if (colorStateList != null && (mode = nVar.d) != null) {
            this.f45600c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        m mVar = nVar.f45589b;
        if (mVar.f45586n == null) {
            mVar.f45586n = Boolean.valueOf(mVar.f45580g.a());
        }
        if (mVar.f45586n.booleanValue()) {
            boolean b10 = nVar.f45589b.f45580g.b(iArr);
            nVar.f45595k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f45599b.f45589b.getRootAlpha() != i10) {
            this.f45599b.f45589b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f45599b.e = z10;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.d = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            s8.c(i10, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f45599b;
        if (nVar.f45590c != colorStateList) {
            nVar.f45590c = colorStateList;
            this.f45600c = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f45599b;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.f45600c = a(nVar.f45590c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f45555a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f45599b;
        nVar.f45589b = new m();
        TypedArray f7 = h0.b.f(resources, theme, attributeSet, a.f45539a);
        n nVar2 = this.f45599b;
        m mVar = nVar2.f45589b;
        int i11 = !h0.b.c(xmlPullParser, "tintMode") ? -1 : f7.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
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
        nVar2.d = mode;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f7.getValue(1, typedValue);
            int i12 = typedValue.type;
            if (i12 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i12 >= 28 && i12 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f7.getResources();
                int resourceId = f7.getResourceId(1, 0);
                ThreadLocal threadLocal = h0.c.f10035a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f45590c = colorStateList2;
        }
        boolean z10 = nVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = f7.getBoolean(5, z10);
        }
        nVar2.e = z10;
        float f10 = mVar.f45582j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = f7.getFloat(7, f10);
        }
        mVar.f45582j = f10;
        float f11 = mVar.f45583k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = f7.getFloat(8, f11);
        }
        mVar.f45583k = f11;
        if (mVar.f45582j <= 0.0f) {
            throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f11 > 0.0f) {
            mVar.h = f7.getDimension(3, mVar.h);
            float dimension = f7.getDimension(2, mVar.f45581i);
            mVar.f45581i = dimension;
            if (mVar.h <= 0.0f) {
                throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f7.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = f7.getString(0);
                if (string != null) {
                    mVar.f45585m = string;
                    mVar.f45587o.put(string, mVar);
                }
                f7.recycle();
                nVar.f45588a = getChangingConfigurations();
                nVar.f45595k = true;
                n nVar3 = this.f45599b;
                m mVar2 = nVar3.f45589b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f45580g;
                a0.f fVar = mVar2.f45587o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                for (int i13 = 1; eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != 3); i13 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i10 = depth;
                        if ("path".equals(name)) {
                            ?? lVar = new l();
                            lVar.e = 0.0f;
                            lVar.f45557g = 1.0f;
                            lVar.h = 1.0f;
                            lVar.f45558i = 0.0f;
                            lVar.f45559j = 1.0f;
                            lVar.f45560k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f45561l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.f45562m = join2;
                            lVar.f45563n = 4.0f;
                            TypedArray f12 = h0.b.f(resources, theme, attributeSet, a.f45541c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f12.getString(0);
                                if (string2 != null) {
                                    lVar.f45573b = string2;
                                }
                                String string3 = f12.getString(2);
                                if (string3 != null) {
                                    lVar.f45572a = h8.c(string3);
                                }
                                lVar.f45556f = h0.b.a(f12, xmlPullParser, theme, "fillColor", 1);
                                float f13 = lVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f13 = f12.getFloat(12, f13);
                                }
                                lVar.h = f13;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f12.getInt(8, -1) : -1;
                                Paint.Cap cap3 = lVar.f45561l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.f45561l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f12.getInt(9, -1) : -1;
                                Paint.Join join3 = lVar.f45562m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.f45562m = join;
                                float f14 = lVar.f45563n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f14 = f12.getFloat(10, f14);
                                }
                                lVar.f45563n = f14;
                                lVar.d = h0.b.a(f12, xmlPullParser, theme, "strokeColor", 3);
                                float f15 = lVar.f45557g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f15 = f12.getFloat(11, f15);
                                }
                                lVar.f45557g = f15;
                                float f16 = lVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f16 = f12.getFloat(4, f16);
                                }
                                lVar.e = f16;
                                float f17 = lVar.f45559j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f17 = f12.getFloat(6, f17);
                                }
                                lVar.f45559j = f17;
                                float f18 = lVar.f45560k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f18 = f12.getFloat(7, f18);
                                }
                                lVar.f45560k = f18;
                                float f19 = lVar.f45558i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f19 = f12.getFloat(5, f19);
                                }
                                lVar.f45558i = f19;
                                int i16 = lVar.f45574c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = f12.getInt(13, i16);
                                }
                                lVar.f45574c = i16;
                            }
                            f12.recycle();
                            jVar2.f45565b.add(lVar);
                            if (lVar.getPathName() != null) {
                                fVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f45588a = nVar3.f45588a;
                            z11 = false;
                        } else if ("clip-path".equals(name)) {
                            l lVar2 = new l();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray f20 = h0.b.f(resources, theme, attributeSet, a.d);
                                String string4 = f20.getString(0);
                                if (string4 != null) {
                                    lVar2.f45573b = string4;
                                }
                                String string5 = f20.getString(1);
                                if (string5 != null) {
                                    lVar2.f45572a = h8.c(string5);
                                }
                                lVar2.f45574c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f20.getInt(2, 0);
                                f20.recycle();
                            }
                            jVar2.f45565b.add(lVar2);
                            if (lVar2.getPathName() != null) {
                                fVar.put(lVar2.getPathName(), lVar2);
                            }
                            nVar3.f45588a = nVar3.f45588a;
                        } else if ("group".equals(name)) {
                            j jVar3 = new j();
                            TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.f45540b);
                            float f22 = jVar3.f45566c;
                            if (h0.b.c(xmlPullParser, "rotation")) {
                                f22 = f21.getFloat(5, f22);
                            }
                            jVar3.f45566c = f22;
                            jVar3.d = f21.getFloat(1, jVar3.d);
                            jVar3.e = f21.getFloat(2, jVar3.e);
                            float f23 = jVar3.f45567f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f23 = f21.getFloat(3, f23);
                            }
                            jVar3.f45567f = f23;
                            float f24 = jVar3.f45568g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f24 = f21.getFloat(4, f24);
                            }
                            jVar3.f45568g = f24;
                            float f25 = jVar3.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f25 = f21.getFloat(6, f25);
                            }
                            jVar3.h = f25;
                            float f26 = jVar3.f45569i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f26 = f21.getFloat(7, f26);
                            }
                            jVar3.f45569i = f26;
                            String string6 = f21.getString(0);
                            if (string6 != null) {
                                jVar3.f45571k = string6;
                            }
                            jVar3.c();
                            f21.recycle();
                            jVar2.f45565b.add(jVar3);
                            arrayDeque.push(jVar3);
                            if (jVar3.getGroupName() != null) {
                                fVar.put(jVar3.getGroupName(), jVar3);
                            }
                            nVar3.f45588a = nVar3.f45588a;
                        }
                    } else {
                        i10 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i10;
                }
                if (!z11) {
                    this.f45600c = a(nVar.f45590c, nVar.d);
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

    public p(n nVar) {
        this.f45601f = true;
        this.h = new float[9];
        this.f45602n = new Matrix();
        this.f45603r = new Rect();
        this.f45599b = nVar;
        this.f45600c = a(nVar.f45590c, nVar.d);
    }
}
