package xh;

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
import org.telegram.ui.Components.v50;
import org.telegram.ui.r41;
public final class f {
    public static HashMap f51907n;
    public final double f51908a;
    public final double f51909b;
    public final int f51910c;
    public final r41 d;
    public final l60 e;
    public e f51911f;
    public final int f51912g;
    public final int h;
    public boolean f51913i;
    public final ArrayList f51914j = new ArrayList();
    public final HashMap f51915k = new HashMap();
    public int f51916l = 0;
    public final d f51917m = new d(this, 0);

    public f(int i10, r41 r41Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f51908a = d;
        this.f51909b = d * 4.0d;
        this.f51910c = i10;
        this.f51912g = i11;
        this.h = i12;
        this.d = r41Var;
        l60 l60Var = new l60(this, r41Var.getContext(), 1);
        this.e = l60Var;
        l60Var.setSurfaceTextureListener(new v50(this, 5));
        l60Var.setOpaque(false);
        r41Var.addView(l60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f51907n == null) {
                f51907n = new HashMap();
            }
            f fVar = (f) f51907n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f51907n;
                    Integer valueOf = Integer.valueOf(i10);
                    r41 r41Var = new r41(viewGroup.getContext(), 11);
                    viewGroup.addView(r41Var);
                    f fVar2 = new f(i10, r41Var, min, min);
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
        HashMap hashMap = f51907n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f51910c == 0 && (eVar = fVar.f51911f) != null) {
                    eVar.f51898b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f51913i) {
            ArrayList arrayList = this.f51914j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f51916l;
                this.f51916l = i10 + 1;
                this.f51915k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f51914j.remove(view);
        this.f51915k.remove(view);
        if (!this.f51913i) {
            d dVar = this.f51917m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f51915k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f51912g;
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
