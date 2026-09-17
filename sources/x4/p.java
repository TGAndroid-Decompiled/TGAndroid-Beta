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
import v7.g8;
import v7.r8;
public final class p extends g {
    public static final PorterDuff.Mode f45343s = PorterDuff.Mode.SRC_IN;
    public n f45344b;
    public PorterDuffColorFilter f45345c;
    public ColorFilter d;
    public boolean e;
    public boolean f45346f;
    public final float[] h;
    public final Matrix f45347n;
    public final Rect f45348r;

    public p() {
        this.f45346f = true;
        this.h = new float[9];
        this.f45347n = new Matrix();
        this.f45348r = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f45335c = null;
        constantState.d = f45343s;
        constantState.f45334b = new m();
        this.f45344b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f45348r;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.d;
            if (colorFilter == null) {
                colorFilter = this.f45345c;
            }
            Matrix matrix = this.f45347n;
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
                if (isAutoMirrored() && r8.a(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.f45344b;
                Bitmap bitmap = nVar.f45336f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f45336f.getHeight()) {
                    nVar.f45336f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f45340k = true;
                }
                if (!this.f45346f) {
                    n nVar2 = this.f45344b;
                    nVar2.f45336f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f45336f);
                    m mVar = nVar2.f45334b;
                    mVar.a(mVar.f45325g, m.f45320p, canvas2, min, min2);
                } else {
                    n nVar3 = this.f45344b;
                    if (nVar3.f45340k || nVar3.f45337g != nVar3.f45335c || nVar3.h != nVar3.d || nVar3.f45339j != nVar3.e || nVar3.f45338i != nVar3.f45334b.getRootAlpha()) {
                        n nVar4 = this.f45344b;
                        nVar4.f45336f.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.f45336f);
                        m mVar2 = nVar4.f45334b;
                        mVar2.a(mVar2.f45325g, m.f45320p, canvas3, min, min2);
                        n nVar5 = this.f45344b;
                        nVar5.f45337g = nVar5.f45335c;
                        nVar5.h = nVar5.d;
                        nVar5.f45338i = nVar5.f45334b.getRootAlpha();
                        nVar5.f45339j = nVar5.e;
                        nVar5.f45340k = false;
                    }
                }
                n nVar6 = this.f45344b;
                if (nVar6.f45334b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.f45341l == null) {
                        Paint paint2 = new Paint();
                        nVar6.f45341l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.f45341l.setAlpha(nVar6.f45334b.getRootAlpha());
                    nVar6.f45341l.setColorFilter(colorFilter);
                    paint = nVar6.f45341l;
                }
                canvas.drawBitmap(nVar6.f45336f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f45344b.f45334b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f45344b.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.d;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f45300a != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f45300a.getConstantState());
        }
        this.f45344b.f45333a = getChangingConfigurations();
        return this.f45344b;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f45344b.f45334b.f45326i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f45344b.f45334b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f45344b.e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f45344b;
            if (nVar != null) {
                m mVar = nVar.f45334b;
                if (mVar.f45331n == null) {
                    mVar.f45331n = Boolean.valueOf(mVar.f45325g.a());
                }
                if (!mVar.f45331n.booleanValue()) {
                    ColorStateList colorStateList = this.f45344b.f45335c;
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
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            n nVar = this.f45344b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f45335c = null;
            constantState.d = f45343s;
            if (nVar != null) {
                constantState.f45333a = nVar.f45333a;
                m mVar = new m(nVar.f45334b);
                constantState.f45334b = mVar;
                if (nVar.f45334b.e != null) {
                    mVar.e = new Paint(nVar.f45334b.e);
                }
                if (nVar.f45334b.d != null) {
                    constantState.f45334b.d = new Paint(nVar.f45334b.d);
                }
                constantState.f45335c = nVar.f45335c;
                constantState.d = nVar.d;
                constantState.e = nVar.e;
            }
            this.f45344b = constantState;
            this.e = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f45344b;
        ColorStateList colorStateList = nVar.f45335c;
        if (colorStateList != null && (mode = nVar.d) != null) {
            this.f45345c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        m mVar = nVar.f45334b;
        if (mVar.f45331n == null) {
            mVar.f45331n = Boolean.valueOf(mVar.f45325g.a());
        }
        if (mVar.f45331n.booleanValue()) {
            boolean b10 = nVar.f45334b.f45325g.b(iArr);
            nVar.f45340k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f45344b.f45334b.getRootAlpha() != i10) {
            this.f45344b.f45334b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f45344b.e = z10;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.d = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            r8.c(i10, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f45344b;
        if (nVar.f45335c != colorStateList) {
            nVar.f45335c = colorStateList;
            this.f45345c = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f45344b;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.f45345c = a(nVar.f45335c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f45300a;
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
        Drawable drawable = this.f45300a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f45344b;
        nVar.f45334b = new m();
        TypedArray f7 = h0.b.f(resources, theme, attributeSet, a.f45284a);
        n nVar2 = this.f45344b;
        m mVar = nVar2.f45334b;
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
                ThreadLocal threadLocal = h0.c.f10054a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f45335c = colorStateList2;
        }
        boolean z10 = nVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = f7.getBoolean(5, z10);
        }
        nVar2.e = z10;
        float f10 = mVar.f45327j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = f7.getFloat(7, f10);
        }
        mVar.f45327j = f10;
        float f11 = mVar.f45328k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = f7.getFloat(8, f11);
        }
        mVar.f45328k = f11;
        if (mVar.f45327j <= 0.0f) {
            throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f11 > 0.0f) {
            mVar.h = f7.getDimension(3, mVar.h);
            float dimension = f7.getDimension(2, mVar.f45326i);
            mVar.f45326i = dimension;
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
                    mVar.f45330m = string;
                    mVar.f45332o.put(string, mVar);
                }
                f7.recycle();
                nVar.f45333a = getChangingConfigurations();
                nVar.f45340k = true;
                n nVar3 = this.f45344b;
                m mVar2 = nVar3.f45334b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f45325g;
                a0.f fVar = mVar2.f45332o;
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
                            lVar.f45302g = 1.0f;
                            lVar.h = 1.0f;
                            lVar.f45303i = 0.0f;
                            lVar.f45304j = 1.0f;
                            lVar.f45305k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f45306l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.f45307m = join2;
                            lVar.f45308n = 4.0f;
                            TypedArray f12 = h0.b.f(resources, theme, attributeSet, a.f45286c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f12.getString(0);
                                if (string2 != null) {
                                    lVar.f45318b = string2;
                                }
                                String string3 = f12.getString(2);
                                if (string3 != null) {
                                    lVar.f45317a = g8.c(string3);
                                }
                                lVar.f45301f = h0.b.a(f12, xmlPullParser, theme, "fillColor", 1);
                                float f13 = lVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f13 = f12.getFloat(12, f13);
                                }
                                lVar.h = f13;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f12.getInt(8, -1) : -1;
                                Paint.Cap cap3 = lVar.f45306l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.f45306l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f12.getInt(9, -1) : -1;
                                Paint.Join join3 = lVar.f45307m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.f45307m = join;
                                float f14 = lVar.f45308n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f14 = f12.getFloat(10, f14);
                                }
                                lVar.f45308n = f14;
                                lVar.d = h0.b.a(f12, xmlPullParser, theme, "strokeColor", 3);
                                float f15 = lVar.f45302g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f15 = f12.getFloat(11, f15);
                                }
                                lVar.f45302g = f15;
                                float f16 = lVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f16 = f12.getFloat(4, f16);
                                }
                                lVar.e = f16;
                                float f17 = lVar.f45304j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f17 = f12.getFloat(6, f17);
                                }
                                lVar.f45304j = f17;
                                float f18 = lVar.f45305k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f18 = f12.getFloat(7, f18);
                                }
                                lVar.f45305k = f18;
                                float f19 = lVar.f45303i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f19 = f12.getFloat(5, f19);
                                }
                                lVar.f45303i = f19;
                                int i16 = lVar.f45319c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = f12.getInt(13, i16);
                                }
                                lVar.f45319c = i16;
                            }
                            f12.recycle();
                            jVar2.f45310b.add(lVar);
                            if (lVar.getPathName() != null) {
                                fVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f45333a = nVar3.f45333a;
                            z11 = false;
                        } else if ("clip-path".equals(name)) {
                            l lVar2 = new l();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray f20 = h0.b.f(resources, theme, attributeSet, a.d);
                                String string4 = f20.getString(0);
                                if (string4 != null) {
                                    lVar2.f45318b = string4;
                                }
                                String string5 = f20.getString(1);
                                if (string5 != null) {
                                    lVar2.f45317a = g8.c(string5);
                                }
                                lVar2.f45319c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f20.getInt(2, 0);
                                f20.recycle();
                            }
                            jVar2.f45310b.add(lVar2);
                            if (lVar2.getPathName() != null) {
                                fVar.put(lVar2.getPathName(), lVar2);
                            }
                            nVar3.f45333a = nVar3.f45333a;
                        } else if ("group".equals(name)) {
                            j jVar3 = new j();
                            TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.f45285b);
                            float f22 = jVar3.f45311c;
                            if (h0.b.c(xmlPullParser, "rotation")) {
                                f22 = f21.getFloat(5, f22);
                            }
                            jVar3.f45311c = f22;
                            jVar3.d = f21.getFloat(1, jVar3.d);
                            jVar3.e = f21.getFloat(2, jVar3.e);
                            float f23 = jVar3.f45312f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f23 = f21.getFloat(3, f23);
                            }
                            jVar3.f45312f = f23;
                            float f24 = jVar3.f45313g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f24 = f21.getFloat(4, f24);
                            }
                            jVar3.f45313g = f24;
                            float f25 = jVar3.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f25 = f21.getFloat(6, f25);
                            }
                            jVar3.h = f25;
                            float f26 = jVar3.f45314i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f26 = f21.getFloat(7, f26);
                            }
                            jVar3.f45314i = f26;
                            String string6 = f21.getString(0);
                            if (string6 != null) {
                                jVar3.f45316k = string6;
                            }
                            jVar3.c();
                            f21.recycle();
                            jVar2.f45310b.add(jVar3);
                            arrayDeque.push(jVar3);
                            if (jVar3.getGroupName() != null) {
                                fVar.put(jVar3.getGroupName(), jVar3);
                            }
                            nVar3.f45333a = nVar3.f45333a;
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
                    this.f45345c = a(nVar.f45335c, nVar.d);
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
        this.f45346f = true;
        this.h = new float[9];
        this.f45347n = new Matrix();
        this.f45348r = new Rect();
        this.f45344b = nVar;
        this.f45345c = a(nVar.f45335c, nVar.d);
    }
}
