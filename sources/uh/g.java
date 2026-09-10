package uh;

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
import org.telegram.ui.Components.t50;
import org.telegram.ui.m91;
public final class g {
    public static HashMap f42761n;
    public final double f42762a;
    public final double f42763b;
    public final int f42764c;
    public final m91 d;
    public final e e;
    public f f42765f;
    public final int f42766g;
    public final int h;
    public boolean f42767i;
    public final ArrayList f42768j = new ArrayList();
    public final HashMap f42769k = new HashMap();
    public int f42770l = 0;
    public final d f42771m = new d(this, 0);

    public g(int i10, m91 m91Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f42762a = d;
        this.f42763b = d * 4.0d;
        this.f42764c = i10;
        this.f42766g = i11;
        this.h = i12;
        this.d = m91Var;
        e eVar = new e(this, m91Var.getContext());
        this.e = eVar;
        eVar.setSurfaceTextureListener(new t50(this, 4));
        eVar.setOpaque(false);
        m91Var.addView(eVar);
    }

    public static g d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f42761n == null) {
                f42761n = new HashMap();
            }
            g gVar = (g) f42761n.get(Integer.valueOf(i10));
            if (gVar == null) {
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
                    HashMap hashMap = f42761n;
                    Integer valueOf = Integer.valueOf(i10);
                    m91 m91Var = new m91(viewGroup.getContext(), 10);
                    viewGroup.addView(m91Var);
                    g gVar2 = new g(i10, m91Var, min, min);
                    hashMap.put(valueOf, gVar2);
                    gVar = gVar2;
                } else {
                    return null;
                }
            }
            gVar.a(view);
            return gVar;
        }
        return null;
    }

    public static g e(View view) {
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
        f fVar;
        HashMap hashMap = f42761n;
        if (hashMap != null) {
            for (g gVar : hashMap.values()) {
                if (gVar.f42764c == 0 && (fVar = gVar.f42765f) != null) {
                    fVar.f42752b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f42767i) {
            ArrayList arrayList = this.f42768j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f42770l;
                this.f42770l = i10 + 1;
                this.f42769k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f42768j.remove(view);
        this.f42769k.remove(view);
        if (!this.f42767i) {
            d dVar = this.f42771m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f42769k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f42766g;
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
            e eVar = this.e;
            if (z10) {
                Bitmap bitmap = eVar.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                eVar.setAlpha(f7);
                eVar.draw(canvas);
            }
            canvas.restore();
        }
    }
}
