package x4;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import v7.c8;
public abstract class a {
    public static final int[] f50680a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] f50681b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] f50682c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};
    public static final int[] f50683e = {16843161};
    public static final int[] f50684f = {16842755, 16843213};
    public static final int[] f50685g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};
    public static final int[] h = {16843490};
    public static final int[] f50686i = {16843486, 16843487, 16843488, 16843489};
    public static final int[] f50687j = {16842788, 16843073, 16843488, 16843992};
    public static final int[] f50688k = {16843489, 16843781, 16843892, 16843893};

    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: x4.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        f fVar;
        int i15;
        int i16;
        int i17;
        float f7;
        PropertyValuesHolder ofFloat;
        float f10;
        float f11;
        TypedValue peekValue = typedArray.peekValue(i11);
        if (peekValue != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i13 = peekValue.type;
        } else {
            i13 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i12);
        if (peekValue2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i14 = peekValue2.type;
        } else {
            i14 = 0;
        }
        if (i10 == 4) {
            if ((z10 && c(i13)) || (z11 && c(i14))) {
                i10 = 3;
            } else {
                i10 = 0;
            }
        }
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            i0.d[] c10 = c8.c(string);
            i0.d[] c11 = c8.c(string2);
            if (c10 != null || c11 != null) {
                if (c10 != null) {
                    ?? obj = new Object();
                    if (c11 != null) {
                        if (c8.a(c10, c11)) {
                            return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c10, c11);
                        }
                        throw new InflateException(e2.j(" Can't morph from ", string, " to ", string2));
                    }
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c10);
                } else if (c11 != null) {
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), c11);
                }
            }
            return null;
        }
        if (i10 == 3) {
            fVar = f.f50696a;
        } else {
            fVar = null;
        }
        if (z12) {
            if (z10) {
                if (i13 == 5) {
                    f10 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i11, 0.0f);
                }
                if (z11) {
                    if (i14 == 5) {
                        f11 = typedArray.getDimension(i12, 0.0f);
                    } else {
                        f11 = typedArray.getFloat(i12, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10, f11);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10);
                }
            } else {
                if (i14 == 5) {
                    f7 = typedArray.getDimension(i12, 0.0f);
                } else {
                    f7 = typedArray.getFloat(i12, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f7);
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            if (i13 == 5) {
                i16 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (c(i13)) {
                i16 = typedArray.getColor(i11, 0);
            } else {
                i16 = typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i14 == 5) {
                    i17 = (int) typedArray.getDimension(i12, 0.0f);
                } else if (c(i14)) {
                    i17 = typedArray.getColor(i12, 0);
                } else {
                    i17 = typedArray.getInt(i12, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16, i17);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16);
            }
        } else if (z11) {
            if (i14 == 5) {
                i15 = (int) typedArray.getDimension(i12, 0.0f);
            } else if (c(i14)) {
                i15 = typedArray.getColor(i12, 0);
            } else {
                i15 = typedArray.getInt(i12, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i10) {
        if (i10 >= 28 && i10 <= 31) {
            return true;
        }
        return false;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i10;
        int i11;
        int i12;
        int i13;
        ValueAnimator valueAnimator2;
        int i14;
        int i15;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z10;
        int i16;
        boolean z11;
        int i17;
        TypedArray f7 = h0.b.f(resources, theme, attributeSet, f50685g);
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, f50688k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        int i18 = 300;
        if (h0.b.c(xmlPullParser, "duration")) {
            i18 = f7.getInt(1, 300);
        }
        long j3 = i18;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) {
            i10 = f7.getInt(2, 0);
        } else {
            i10 = 0;
        }
        long j10 = i10;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) {
            i11 = f7.getInt(7, 4);
        } else {
            i11 = 4;
        }
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i11 == 4) {
                TypedValue peekValue = f7.peekValue(5);
                if (peekValue != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i16 = peekValue.type;
                } else {
                    i16 = 0;
                }
                TypedValue peekValue2 = f7.peekValue(6);
                if (peekValue2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i17 = peekValue2.type;
                } else {
                    i17 = 0;
                }
                if ((z10 && c(i16)) || (z11 && c(i17))) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
            }
            PropertyValuesHolder b10 = b(f7, i11, 5, 6, "");
            if (b10 != null) {
                valueAnimator.setValues(b10);
            }
        }
        valueAnimator.setDuration(j3);
        valueAnimator.setStartDelay(j10);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null) {
            i12 = f7.getInt(3, 0);
        } else {
            i12 = 0;
        }
        valueAnimator.setRepeatCount(i12);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null) {
            i13 = f7.getInt(4, 1);
        } else {
            i13 = 1;
        }
        valueAnimator.setRepeatMode(i13);
        if (f10 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String b11 = h0.b.b(f10, xmlPullParser, "pathData", 1);
            if (b11 != null) {
                String b12 = h0.b.b(f10, xmlPullParser, "propertyXName", 2);
                String b13 = h0.b.b(f10, xmlPullParser, "propertyYName", 3);
                if (i11 != 2) {
                }
                if (b12 == null && b13 == null) {
                    throw new InflateException(f10.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d10 = c8.d(b11);
                PathMeasure pathMeasure = new PathMeasure(d10, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f11 = 0.0f;
                while (true) {
                    f11 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f11));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                }
                PathMeasure pathMeasure2 = new PathMeasure(d10, false);
                int min = Math.min(100, ((int) (f11 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f12 = f11 / (min - 1);
                int i19 = 0;
                valueAnimator2 = valueAnimator;
                float f13 = 0.0f;
                int i20 = 0;
                while (true) {
                    propertyValuesHolder = null;
                    if (i19 >= min) {
                        break;
                    }
                    int i21 = min;
                    pathMeasure2.getPosTan(f13 - ((Float) arrayList.get(i20)).floatValue(), fArr3, null);
                    fArr[i19] = fArr3[0];
                    fArr2[i19] = fArr3[1];
                    int i22 = i20 + 1;
                    f13 += f12;
                    if (i22 < arrayList.size() && f13 > ((Float) arrayList.get(i22)).floatValue()) {
                        pathMeasure2.nextContour();
                        i20 = i22;
                    }
                    i19++;
                    min = i21;
                }
                if (b12 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(b12, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (b13 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(b13, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    objectAnimator2.setValues(propertyValuesHolder);
                } else if (propertyValuesHolder == null) {
                    objectAnimator2.setValues(propertyValuesHolder2);
                } else {
                    objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                }
                i14 = 0;
            } else {
                valueAnimator2 = valueAnimator;
                i14 = 0;
                objectAnimator2.setPropertyName(h0.b.b(f10, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            i14 = 0;
        }
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            i15 = f7.getResourceId(i14, i14);
        } else {
            i15 = i14;
        }
        if (i15 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i15));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        f7.recycle();
        if (f10 != null) {
            f10.recycle();
        }
        return valueAnimator3;
    }
}
