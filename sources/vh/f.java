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
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.s60;
import org.telegram.ui.z51;
public final class f {
    public static HashMap f49896n;
    public final double f49897a;
    public final double f49898b;
    public final int f49899c;
    public final z51 d;
    public final s60 f49900e;
    public e f49901f;
    public final int f49902g;
    public final int h;
    public boolean f49903i;
    public final ArrayList f49904j = new ArrayList();
    public final HashMap f49905k = new HashMap();
    public int f49906l = 0;
    public final d f49907m = new d(this, 0);

    public f(int i10, z51 z51Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f49897a = d;
        this.f49898b = d * 4.0d;
        this.f49899c = i10;
        this.f49902g = i11;
        this.h = i12;
        this.d = z51Var;
        s60 s60Var = new s60(this, z51Var.getContext(), 1);
        this.f49900e = s60Var;
        s60Var.setSurfaceTextureListener(new e60(this, 5));
        s60Var.setOpaque(false);
        z51Var.addView(s60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f49896n == null) {
                f49896n = new HashMap();
            }
            f fVar = (f) f49896n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f49896n;
                    Integer valueOf = Integer.valueOf(i10);
                    z51 z51Var = new z51(viewGroup.getContext(), 11);
                    viewGroup.addView(z51Var);
                    f fVar2 = new f(i10, z51Var, min, min);
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
        HashMap hashMap = f49896n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f49899c == 0 && (eVar = fVar.f49901f) != null) {
                    eVar.f49886b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f49903i) {
            ArrayList arrayList = this.f49904j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f49906l;
                this.f49906l = i10 + 1;
                this.f49905k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f49904j.remove(view);
        this.f49905k.remove(view);
        if (!this.f49903i) {
            d dVar = this.f49907m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f49905k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f49902g;
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
            s60 s60Var = this.f49900e;
            if (z10) {
                Bitmap bitmap = s60Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                s60Var.setAlpha(f7);
                s60Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
