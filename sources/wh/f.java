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
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.x50;
import org.telegram.ui.d61;
public final class f {
    public static HashMap f47648n;
    public final double f47649a;
    public final double f47650b;
    public final int f47651c;
    public final d61 d;
    public final l60 e;
    public e f47652f;
    public final int f47653g;
    public final int h;
    public boolean f47654i;
    public final ArrayList f47655j = new ArrayList();
    public final HashMap f47656k = new HashMap();
    public int f47657l = 0;
    public final d f47658m = new d(this, 0);

    public f(int i10, d61 d61Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f47649a = d;
        this.f47650b = d * 4.0d;
        this.f47651c = i10;
        this.f47653g = i11;
        this.h = i12;
        this.d = d61Var;
        l60 l60Var = new l60(this, d61Var.getContext(), 1);
        this.e = l60Var;
        l60Var.setSurfaceTextureListener(new x50(this, 5));
        l60Var.setOpaque(false);
        d61Var.addView(l60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f47648n == null) {
                f47648n = new HashMap();
            }
            f fVar = (f) f47648n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f47648n;
                    Integer valueOf = Integer.valueOf(i10);
                    d61 d61Var = new d61(viewGroup.getContext(), 11);
                    viewGroup.addView(d61Var);
                    f fVar2 = new f(i10, d61Var, min, min);
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
        HashMap hashMap = f47648n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f47651c == 0 && (eVar = fVar.f47652f) != null) {
                    eVar.f47639b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f47654i) {
            ArrayList arrayList = this.f47655j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f47657l;
                this.f47657l = i10 + 1;
                this.f47656k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f47655j.remove(view);
        this.f47656k.remove(view);
        if (!this.f47654i) {
            d dVar = this.f47658m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f47656k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f47653g;
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
            l60 l60Var = this.e;
            if (z10) {
                Bitmap bitmap = l60Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                l60Var.setAlpha(f7);
                l60Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
