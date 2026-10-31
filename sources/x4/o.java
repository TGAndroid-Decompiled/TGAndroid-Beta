package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
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
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.telegram.ui.Components.gq;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v7.i8;
import v7.w7;
public final class o extends gq {
    public static final PorterDuff.Mode f53057w = PorterDuff.Mode.SRC_IN;
    public m f53058c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f53059f;
    public boolean h;
    public final float[] f53060n;
    public final Matrix f53061r;
    public final Rect f53062s;

    public o() {
        this.h = true;
        this.f53060n = new float[9];
        this.f53061r = new Matrix();
        this.f53062s = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f53049c = null;
        constantState.d = f53057w;
        constantState.f53048b = new l();
        this.f53058c = constantState;
    }

    public static o c(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            o oVar = new o();
            ThreadLocal threadLocal = h0.j.f7557a;
            oVar.f26491b = resources.getDrawable(i10, theme);
            new n(((Drawable) oVar.f26491b).getConstantState());
            return oVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                o oVar2 = new o();
                oVar2.inflate(resources, xml, asAttributeSet, theme);
                return oVar2;
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e7) {
            Log.e("VectorDrawableCompat", "parser error", e7);
            return null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f53062s;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            Matrix matrix = this.f53061r;
            canvas.getMatrix(matrix);
            float[] fArr = this.f53060n;
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
                m mVar = this.f53058c;
                Bitmap bitmap = mVar.f53050f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != mVar.f53050f.getHeight()) {
                    mVar.f53050f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    mVar.f53054k = true;
                }
                if (!this.h) {
                    m mVar2 = this.f53058c;
                    mVar2.f53050f.eraseColor(0);
                    Canvas canvas2 = new Canvas(mVar2.f53050f);
                    l lVar = mVar2.f53048b;
                    lVar.a(lVar.f53039g, l.f53034p, canvas2, min, min2);
                } else {
                    m mVar3 = this.f53058c;
                    if (mVar3.f53054k || mVar3.f53051g != mVar3.f53049c || mVar3.h != mVar3.d || mVar3.f53053j != mVar3.e || mVar3.f53052i != mVar3.f53048b.getRootAlpha()) {
                        m mVar4 = this.f53058c;
                        mVar4.f53050f.eraseColor(0);
                        Canvas canvas3 = new Canvas(mVar4.f53050f);
                        l lVar2 = mVar4.f53048b;
                        lVar2.a(lVar2.f53039g, l.f53034p, canvas3, min, min2);
                        m mVar5 = this.f53058c;
                        mVar5.f53051g = mVar5.f53049c;
                        mVar5.h = mVar5.d;
                        mVar5.f53052i = mVar5.f53048b.getRootAlpha();
                        mVar5.f53053j = mVar5.e;
                        mVar5.f53054k = false;
                    }
                }
                m mVar6 = this.f53058c;
                if (mVar6.f53048b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (mVar6.f53055l == null) {
                        Paint paint2 = new Paint();
                        mVar6.f53055l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    mVar6.f53055l.setAlpha(mVar6.f53048b.getRootAlpha());
                    mVar6.f53055l.setColorFilter(colorFilter);
                    paint = mVar6.f53055l;
                }
                canvas.drawBitmap(mVar6.f53050f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f53058c.f53048b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f53058c.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.e;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.f26491b) != null && Build.VERSION.SDK_INT >= 24) {
            return new n(((Drawable) this.f26491b).getConstantState());
        }
        this.f53058c.f53047a = getChangingConfigurations();
        return this.f53058c;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f53058c.f53048b.f53040i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f53058c.f53048b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f53058c.e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            m mVar = this.f53058c;
            if (mVar != null) {
                l lVar = mVar.f53048b;
                if (lVar.f53045n == null) {
                    lVar.f53045n = Boolean.valueOf(lVar.f53039g.a());
                }
                if (!lVar.f53045n.booleanValue()) {
                    ColorStateList colorStateList = this.f53058c.f53049c;
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
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f53059f && super.mutate() == this) {
            m mVar = this.f53058c;
            ?? constantState = new Drawable.ConstantState();
            constantState.f53049c = null;
            constantState.d = f53057w;
            if (mVar != null) {
                constantState.f53047a = mVar.f53047a;
                l lVar = new l(mVar.f53048b);
                constantState.f53048b = lVar;
                if (mVar.f53048b.e != null) {
                    lVar.e = new Paint(mVar.f53048b.e);
                }
                if (mVar.f53048b.d != null) {
                    constantState.f53048b.d = new Paint(mVar.f53048b.d);
                }
                constantState.f53049c = mVar.f53049c;
                constantState.d = mVar.d;
                constantState.e = mVar.e;
            }
            this.f53058c = constantState;
            this.f53059f = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f53058c;
        ColorStateList colorStateList = mVar.f53049c;
        if (colorStateList != null && (mode = mVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        l lVar = mVar.f53048b;
        if (lVar.f53045n == null) {
            lVar.f53045n = Boolean.valueOf(lVar.f53039g.a());
        }
        if (lVar.f53045n.booleanValue()) {
            boolean b10 = mVar.f53048b.f53039g.b(iArr);
            mVar.f53054k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f53058c.f53048b.getRootAlpha() != i10) {
            this.f53058c.f53048b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f53058c.e = z10;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            i8.a(i10, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        m mVar = this.f53058c;
        if (mVar.f53049c != colorStateList) {
            mVar.f53049c = colorStateList;
            this.d = d(colorStateList, mVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        m mVar = this.f53058c;
        if (mVar.d != mode) {
            mVar.d = mode;
            this.d = d(mVar.f53049c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = (Drawable) this.f26491b;
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
        Drawable drawable = (Drawable) this.f26491b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.f53058c;
        mVar.f53048b = new l();
        TypedArray f7 = h0.b.f(resources, theme, attributeSet, a.f53000a);
        m mVar2 = this.f53058c;
        l lVar = mVar2.f53048b;
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
                ThreadLocal threadLocal = h0.c.f7543a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            mVar2.f53049c = colorStateList2;
        }
        boolean z10 = mVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = f7.getBoolean(5, z10);
        }
        mVar2.e = z10;
        float f10 = lVar.f53041j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = f7.getFloat(7, f10);
        }
        lVar.f53041j = f10;
        float f11 = lVar.f53042k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = f7.getFloat(8, f11);
        }
        lVar.f53042k = f11;
        if (lVar.f53041j <= 0.0f) {
            throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f11 > 0.0f) {
            lVar.h = f7.getDimension(3, lVar.h);
            float dimension = f7.getDimension(2, lVar.f53040i);
            lVar.f53040i = dimension;
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
                    lVar.f53044m = string;
                    lVar.f53046o.put(string, lVar);
                }
                f7.recycle();
                mVar.f53047a = getChangingConfigurations();
                mVar.f53054k = true;
                m mVar3 = this.f53058c;
                l lVar2 = mVar3.f53048b;
                ArrayDeque arrayDeque = new ArrayDeque();
                i iVar = lVar2.f53039g;
                a0.f fVar = lVar2.f53046o;
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
                            kVar.e = 0.0f;
                            kVar.f53016g = 1.0f;
                            kVar.h = 1.0f;
                            kVar.f53017i = 0.0f;
                            kVar.f53018j = 1.0f;
                            kVar.f53019k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            kVar.f53020l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            kVar.f53021m = join2;
                            kVar.f53022n = 4.0f;
                            TypedArray f12 = h0.b.f(resources, theme, attributeSet, a.f53002c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f12.getString(0);
                                if (string2 != null) {
                                    kVar.f53032b = string2;
                                }
                                String string3 = f12.getString(2);
                                if (string3 != null) {
                                    kVar.f53031a = w7.c(string3);
                                }
                                kVar.f53015f = h0.b.a(f12, xmlPullParser, theme, "fillColor", 1);
                                float f13 = kVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f13 = f12.getFloat(12, f13);
                                }
                                kVar.h = f13;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f12.getInt(8, -1) : -1;
                                Paint.Cap cap3 = kVar.f53020l;
                                if (i15 == 0) {
                                    cap = cap2;
                                } else if (i15 != 1) {
                                    cap = i15 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                kVar.f53020l = cap;
                                int i16 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f12.getInt(9, -1) : -1;
                                Paint.Join join3 = kVar.f53021m;
                                if (i16 == 0) {
                                    join = join2;
                                } else if (i16 != 1) {
                                    join = i16 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                kVar.f53021m = join;
                                float f14 = kVar.f53022n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f14 = f12.getFloat(10, f14);
                                }
                                kVar.f53022n = f14;
                                kVar.d = h0.b.a(f12, xmlPullParser, theme, "strokeColor", 3);
                                float f15 = kVar.f53016g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f15 = f12.getFloat(11, f15);
                                }
                                kVar.f53016g = f15;
                                float f16 = kVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f16 = f12.getFloat(4, f16);
                                }
                                kVar.e = f16;
                                float f17 = kVar.f53018j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f17 = f12.getFloat(6, f17);
                                }
                                kVar.f53018j = f17;
                                float f18 = kVar.f53019k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f18 = f12.getFloat(7, f18);
                                }
                                kVar.f53019k = f18;
                                float f19 = kVar.f53017i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f19 = f12.getFloat(5, f19);
                                }
                                kVar.f53017i = f19;
                                int i17 = kVar.f53033c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i17 = f12.getInt(13, i17);
                                }
                                kVar.f53033c = i17;
                            }
                            f12.recycle();
                            iVar2.f53024b.add(kVar);
                            if (kVar.getPathName() != null) {
                                fVar.put(kVar.getPathName(), kVar);
                            }
                            mVar3.f53047a = mVar3.f53047a;
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
                                        kVar2.f53032b = string4;
                                    }
                                    String string5 = f20.getString(1);
                                    if (string5 != null) {
                                        kVar2.f53031a = w7.c(string5);
                                    }
                                    kVar2.f53033c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f20.getInt(2, 0);
                                    f20.recycle();
                                }
                                iVar2.f53024b.add(kVar2);
                                if (kVar2.getPathName() != null) {
                                    fVar.put(kVar2.getPathName(), kVar2);
                                }
                                mVar3.f53047a = mVar3.f53047a;
                            } else if ("group".equals(name)) {
                                i iVar3 = new i();
                                TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.f53001b);
                                float f22 = iVar3.f53025c;
                                if (h0.b.c(xmlPullParser, "rotation")) {
                                    f22 = f21.getFloat(5, f22);
                                }
                                iVar3.f53025c = f22;
                                iVar3.d = f21.getFloat(1, iVar3.d);
                                iVar3.e = f21.getFloat(2, iVar3.e);
                                float f23 = iVar3.f53026f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f23 = f21.getFloat(3, f23);
                                }
                                iVar3.f53026f = f23;
                                float f24 = iVar3.f53027g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f24 = f21.getFloat(4, f24);
                                }
                                iVar3.f53027g = f24;
                                float f25 = iVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f25 = f21.getFloat(6, f25);
                                }
                                iVar3.h = f25;
                                float f26 = iVar3.f53028i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f26 = f21.getFloat(7, f26);
                                }
                                iVar3.f53028i = f26;
                                String string6 = f21.getString(0);
                                if (string6 != null) {
                                    iVar3.f53030k = string6;
                                }
                                iVar3.c();
                                f21.recycle();
                                iVar2.f53024b.add(iVar3);
                                arrayDeque.push(iVar3);
                                if (iVar3.getGroupName() != null) {
                                    fVar.put(iVar3.getGroupName(), iVar3);
                                }
                                mVar3.f53047a = mVar3.f53047a;
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
                    this.d = d(mVar.f53049c, mVar.d);
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
        this.f53060n = new float[9];
        this.f53061r = new Matrix();
        this.f53062s = new Rect();
        this.f53058c = mVar;
        this.d = d(mVar.f53049c, mVar.d);
    }
}
