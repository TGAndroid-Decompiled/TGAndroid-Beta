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
import org.telegram.ui.Components.y50;
import org.telegram.ui.m51;
public final class f {
    public static HashMap f44659n;
    public final double f44660a;
    public final double f44661b;
    public final int f44662c;
    public final m51 d;
    public final y50 e;
    public e f44663f;
    public final int f44664g;
    public final int h;
    public boolean f44665i;
    public final ArrayList f44666j = new ArrayList();
    public final HashMap f44667k = new HashMap();
    public int f44668l = 0;
    public final d f44669m = new d(this, 0);

    public f(int i10, m51 m51Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f44660a = d;
        this.f44661b = d * 4.0d;
        this.f44662c = i10;
        this.f44664g = i11;
        this.h = i12;
        this.d = m51Var;
        y50 y50Var = new y50(this, m51Var.getContext(), 1);
        this.e = y50Var;
        y50Var.setSurfaceTextureListener(new ki.c(this, 5));
        y50Var.setOpaque(false);
        m51Var.addView(y50Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f44659n == null) {
                f44659n = new HashMap();
            }
            f fVar = (f) f44659n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f44659n;
                    Integer valueOf = Integer.valueOf(i10);
                    m51 m51Var = new m51(viewGroup.getContext(), 11);
                    viewGroup.addView(m51Var);
                    f fVar2 = new f(i10, m51Var, min, min);
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
        HashMap hashMap = f44659n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f44662c == 0 && (eVar = fVar.f44663f) != null) {
                    eVar.f44650b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f44665i) {
            ArrayList arrayList = this.f44666j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f44668l;
                this.f44668l = i10 + 1;
                this.f44667k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f44666j.remove(view);
        this.f44667k.remove(view);
        if (!this.f44665i) {
            d dVar = this.f44669m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f44667k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f44664g;
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
            y50 y50Var = this.e;
            if (z10) {
                Bitmap bitmap = y50Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                y50Var.setAlpha(f7);
                y50Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
