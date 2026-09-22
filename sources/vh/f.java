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
import org.telegram.ui.u41;
public final class f {
    public static HashMap f44711n;
    public final double f44712a;
    public final double f44713b;
    public final int f44714c;
    public final u41 d;
    public final y50 e;
    public e f44715f;
    public final int f44716g;
    public final int h;
    public boolean f44717i;
    public final ArrayList f44718j = new ArrayList();
    public final HashMap f44719k = new HashMap();
    public int f44720l = 0;
    public final d f44721m = new d(this, 0);

    public f(int i10, u41 u41Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f44712a = d;
        this.f44713b = d * 4.0d;
        this.f44714c = i10;
        this.f44716g = i11;
        this.h = i12;
        this.d = u41Var;
        y50 y50Var = new y50(this, u41Var.getContext(), 1);
        this.e = y50Var;
        y50Var.setSurfaceTextureListener(new ki.c(this, 5));
        y50Var.setOpaque(false);
        u41Var.addView(y50Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f44711n == null) {
                f44711n = new HashMap();
            }
            f fVar = (f) f44711n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f44711n;
                    Integer valueOf = Integer.valueOf(i10);
                    u41 u41Var = new u41(viewGroup.getContext(), 12);
                    viewGroup.addView(u41Var);
                    f fVar2 = new f(i10, u41Var, min, min);
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
        HashMap hashMap = f44711n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f44714c == 0 && (eVar = fVar.f44715f) != null) {
                    eVar.f44702b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f44717i) {
            ArrayList arrayList = this.f44718j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f44720l;
                this.f44720l = i10 + 1;
                this.f44719k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f44718j.remove(view);
        this.f44719k.remove(view);
        if (!this.f44717i) {
            d dVar = this.f44721m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f44719k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f44716g;
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
