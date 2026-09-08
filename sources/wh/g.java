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
import org.telegram.ui.Components.j50;
import org.telegram.ui.v51;
public final class g {
    public static HashMap f48630n;
    public final double f48631a;
    public final double f48632b;
    public final int f48633c;
    public final v51 d;
    public final e f48634e;
    public f f48635f;
    public final int f48636g;
    public final int h;
    public boolean f48637i;
    public final ArrayList f48638j = new ArrayList();
    public final HashMap f48639k = new HashMap();
    public int f48640l = 0;
    public final d f48641m = new d(this, 0);

    public g(int i10, v51 v51Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f48631a = d;
        this.f48632b = d * 4.0d;
        this.f48633c = i10;
        this.f48636g = i11;
        this.h = i12;
        this.d = v51Var;
        e eVar = new e(this, v51Var.getContext());
        this.f48634e = eVar;
        eVar.setSurfaceTextureListener(new j50(this, 4));
        eVar.setOpaque(false);
        v51Var.addView(eVar);
    }

    public static g d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f48630n == null) {
                f48630n = new HashMap();
            }
            g gVar = (g) f48630n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f48630n;
                    Integer valueOf = Integer.valueOf(i10);
                    v51 v51Var = new v51(viewGroup.getContext(), 11);
                    viewGroup.addView(v51Var);
                    g gVar2 = new g(i10, v51Var, min, min);
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
        HashMap hashMap = f48630n;
        if (hashMap != null) {
            for (g gVar : hashMap.values()) {
                if (gVar.f48633c == 0 && (fVar = gVar.f48635f) != null) {
                    fVar.f48620b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f48637i) {
            ArrayList arrayList = this.f48638j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f48640l;
                this.f48640l = i10 + 1;
                this.f48639k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f48638j.remove(view);
        this.f48639k.remove(view);
        if (!this.f48637i) {
            d dVar = this.f48641m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f48639k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f48636g;
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
            e eVar = this.f48634e;
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
