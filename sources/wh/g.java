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
    public static HashMap f48601n;
    public final double f48602a;
    public final double f48603b;
    public final int f48604c;
    public final v51 d;
    public final e f48605e;
    public f f48606f;
    public final int f48607g;
    public final int h;
    public boolean f48608i;
    public final ArrayList f48609j = new ArrayList();
    public final HashMap f48610k = new HashMap();
    public int f48611l = 0;
    public final d f48612m = new d(this, 0);

    public g(int i10, v51 v51Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f48602a = d;
        this.f48603b = d * 4.0d;
        this.f48604c = i10;
        this.f48607g = i11;
        this.h = i12;
        this.d = v51Var;
        e eVar = new e(this, v51Var.getContext());
        this.f48605e = eVar;
        eVar.setSurfaceTextureListener(new j50(this, 4));
        eVar.setOpaque(false);
        v51Var.addView(eVar);
    }

    public static g d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f48601n == null) {
                f48601n = new HashMap();
            }
            g gVar = (g) f48601n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f48601n;
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
        HashMap hashMap = f48601n;
        if (hashMap != null) {
            for (g gVar : hashMap.values()) {
                if (gVar.f48604c == 0 && (fVar = gVar.f48606f) != null) {
                    fVar.f48591b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f48608i) {
            ArrayList arrayList = this.f48609j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f48611l;
                this.f48611l = i10 + 1;
                this.f48610k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f48609j.remove(view);
        this.f48610k.remove(view);
        if (!this.f48608i) {
            d dVar = this.f48612m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f48610k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f48607g;
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
            e eVar = this.f48605e;
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
