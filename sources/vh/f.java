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
import org.telegram.ui.Components.q60;
import org.telegram.ui.v51;
public final class f {
    public static HashMap f49755n;
    public final double f49756a;
    public final double f49757b;
    public final int f49758c;
    public final v51 d;
    public final q60 f49759e;
    public e f49760f;
    public final int f49761g;
    public final int h;
    public boolean f49762i;
    public final ArrayList f49763j = new ArrayList();
    public final HashMap f49764k = new HashMap();
    public int f49765l = 0;
    public final d f49766m = new d(this, 0);

    public f(int i10, v51 v51Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f49756a = d;
        this.f49757b = d * 4.0d;
        this.f49758c = i10;
        this.f49761g = i11;
        this.h = i12;
        this.d = v51Var;
        q60 q60Var = new q60(this, v51Var.getContext(), 1);
        this.f49759e = q60Var;
        q60Var.setSurfaceTextureListener(new ki.d(this, 5));
        q60Var.setOpaque(false);
        v51Var.addView(q60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f49755n == null) {
                f49755n = new HashMap();
            }
            f fVar = (f) f49755n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f49755n;
                    Integer valueOf = Integer.valueOf(i10);
                    v51 v51Var = new v51(viewGroup.getContext(), 11);
                    viewGroup.addView(v51Var);
                    f fVar2 = new f(i10, v51Var, min, min);
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
        HashMap hashMap = f49755n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f49758c == 0 && (eVar = fVar.f49760f) != null) {
                    eVar.f49745b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f49762i) {
            ArrayList arrayList = this.f49763j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f49765l;
                this.f49765l = i10 + 1;
                this.f49764k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f49763j.remove(view);
        this.f49764k.remove(view);
        if (!this.f49762i) {
            d dVar = this.f49766m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f49764k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f49761g;
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
            q60 q60Var = this.f49759e;
            if (z10) {
                Bitmap bitmap = q60Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                q60Var.setAlpha(f7);
                q60Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
