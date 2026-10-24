package wh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.r50;
import org.telegram.ui.m41;
public final class f {
    public static HashMap f49486n;
    public final double f49487a;
    public final double f49488b;
    public final int f49489c;
    public final m41 d;
    public final h60 e;
    public e f49490f;
    public final int f49491g;
    public final int h;
    public boolean f49492i;
    public final ArrayList f49493j = new ArrayList();
    public final HashMap f49494k = new HashMap();
    public int f49495l = 0;
    public final d f49496m = new d(this, 0);

    public f(int i10, m41 m41Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f49487a = d;
        this.f49488b = d * 4.0d;
        this.f49489c = i10;
        this.f49491g = i11;
        this.h = i12;
        this.d = m41Var;
        h60 h60Var = new h60(this, m41Var.getContext(), 1);
        this.e = h60Var;
        h60Var.setSurfaceTextureListener(new r50(this, 5));
        h60Var.setOpaque(false);
        m41Var.addView(h60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f49486n == null) {
                f49486n = new HashMap();
            }
            f fVar = (f) f49486n.get(Integer.valueOf(i10));
            if (fVar == null) {
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass != 1) {
                    if (devicePerformanceClass != 2) {
                        Point point = AndroidUtilities.displaySize;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = AndroidUtilities.displaySize;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = AndroidUtilities.displaySize;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap = f49486n;
                    Integer valueOf = Integer.valueOf(i10);
                    m41 m41Var = new m41(viewGroup.getContext(), 11);
                    viewGroup.addView(m41Var);
                    f fVar2 = new f(i10, m41Var, min, min);
                    hashMap.put(valueOf, fVar2);
                    fVar = fVar2;
                } else {
                    return null;
                }
            }
            fVar.a(view);
            return fVar;
        }
        return null;
    }

    public static f e(View view) {
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        ViewGroup viewGroup = null;
        if (findActivity != null) {
            View rootView = findActivity.findViewById(16908290).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            }
        }
        return d(0, view, viewGroup);
    }

    public static void f(boolean z10) {
        e eVar;
        HashMap hashMap = f49486n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f49489c == 0 && (eVar = fVar.f49490f) != null) {
                    eVar.f49477b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f49492i) {
            ArrayList arrayList = this.f49493j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f49495l;
                this.f49495l = i10 + 1;
                this.f49494k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f49493j.remove(view);
        this.f49494k.remove(view);
        if (!this.f49492i) {
            d dVar = this.f49496m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f49494k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f49491g;
            int i13 = this.h;
            if (i10 > i12 || i11 > i13) {
                float max = Math.max(i10 / i12, i11 / i13);
                canvas.scale(max, max);
            }
            if (num.intValue() % 4 == 1) {
                canvas.rotate(180.0f, i12 / 2.0f, i13 / 2.0f);
            }
            if (num.intValue() % 4 == 2) {
                canvas.scale(-1.0f, 1.0f, i12 / 2.0f, i13 / 2.0f);
            }
            if (num.intValue() % 4 == 3) {
                canvas.scale(1.0f, -1.0f, i12 / 2.0f, i13 / 2.0f);
            }
            h60 h60Var = this.e;
            if (z10) {
                Bitmap bitmap = h60Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                h60Var.setAlpha(f7);
                h60Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
