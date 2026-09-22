package vh;

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
import org.telegram.ui.t51;
public final class g {
    public static HashMap f44389n;
    public final double f44390a;
    public final double f44391b;
    public final int f44392c;
    public final t51 d;
    public final e e;
    public f f44393f;
    public final int f44394g;
    public final int h;
    public boolean f44395i;
    public final ArrayList f44396j = new ArrayList();
    public final HashMap f44397k = new HashMap();
    public int f44398l = 0;
    public final d f44399m = new d(this, 0);

    public g(int i10, t51 t51Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f44390a = d;
        this.f44391b = d * 4.0d;
        this.f44392c = i10;
        this.f44394g = i11;
        this.h = i12;
        this.d = t51Var;
        e eVar = new e(this, t51Var.getContext());
        this.e = eVar;
        eVar.setSurfaceTextureListener(new j50(this, 4));
        eVar.setOpaque(false);
        t51Var.addView(eVar);
    }

    public static g d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f44389n == null) {
                f44389n = new HashMap();
            }
            g gVar = (g) f44389n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f44389n;
                    Integer valueOf = Integer.valueOf(i10);
                    t51 t51Var = new t51(viewGroup.getContext(), 11);
                    viewGroup.addView(t51Var);
                    g gVar2 = new g(i10, t51Var, min, min);
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
        HashMap hashMap = f44389n;
        if (hashMap != null) {
            for (g gVar : hashMap.values()) {
                if (gVar.f44392c == 0 && (fVar = gVar.f44393f) != null) {
                    fVar.f44380b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f44395i) {
            ArrayList arrayList = this.f44396j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f44398l;
                this.f44398l = i10 + 1;
                this.f44397k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f44396j.remove(view);
        this.f44397k.remove(view);
        if (!this.f44395i) {
            d dVar = this.f44399m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f44397k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f44394g;
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
