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
    public static HashMap f44674n;
    public final double f44675a;
    public final double f44676b;
    public final int f44677c;
    public final m51 d;
    public final y50 e;
    public e f44678f;
    public final int f44679g;
    public final int h;
    public boolean f44680i;
    public final ArrayList f44681j = new ArrayList();
    public final HashMap f44682k = new HashMap();
    public int f44683l = 0;
    public final d f44684m = new d(this, 0);

    public f(int i10, m51 m51Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f44675a = d;
        this.f44676b = d * 4.0d;
        this.f44677c = i10;
        this.f44679g = i11;
        this.h = i12;
        this.d = m51Var;
        y50 y50Var = new y50(this, m51Var.getContext(), 1);
        this.e = y50Var;
        y50Var.setSurfaceTextureListener(new ki.d(this, 5));
        y50Var.setOpaque(false);
        m51Var.addView(y50Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f44674n == null) {
                f44674n = new HashMap();
            }
            f fVar = (f) f44674n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f44674n;
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
        HashMap hashMap = f44674n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f44677c == 0 && (eVar = fVar.f44678f) != null) {
                    eVar.f44665b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f44680i) {
            ArrayList arrayList = this.f44681j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f44683l;
                this.f44683l = i10 + 1;
                this.f44682k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f44681j.remove(view);
        this.f44682k.remove(view);
        if (!this.f44680i) {
            d dVar = this.f44684m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f44682k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f44679g;
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
