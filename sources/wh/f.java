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
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.t50;
import org.telegram.ui.l41;
public final class f {
    public static HashMap f49057n;
    public final double f49058a;
    public final double f49059b;
    public final int f49060c;
    public final l41 d;
    public final i60 e;
    public e f49061f;
    public final int f49062g;
    public final int h;
    public boolean f49063i;
    public final ArrayList f49064j = new ArrayList();
    public final HashMap f49065k = new HashMap();
    public int f49066l = 0;
    public final d f49067m = new d(this, 0);

    public f(int i10, l41 l41Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f49058a = d;
        this.f49059b = d * 4.0d;
        this.f49060c = i10;
        this.f49062g = i11;
        this.h = i12;
        this.d = l41Var;
        i60 i60Var = new i60(this, l41Var.getContext(), 1);
        this.e = i60Var;
        i60Var.setSurfaceTextureListener(new t50(this, 5));
        i60Var.setOpaque(false);
        l41Var.addView(i60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f49057n == null) {
                f49057n = new HashMap();
            }
            f fVar = (f) f49057n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f49057n;
                    Integer valueOf = Integer.valueOf(i10);
                    l41 l41Var = new l41(viewGroup.getContext(), 11);
                    viewGroup.addView(l41Var);
                    f fVar2 = new f(i10, l41Var, min, min);
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
        HashMap hashMap = f49057n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f49060c == 0 && (eVar = fVar.f49061f) != null) {
                    eVar.f49048b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f49063i) {
            ArrayList arrayList = this.f49064j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f49066l;
                this.f49066l = i10 + 1;
                this.f49065k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f49064j.remove(view);
        this.f49065k.remove(view);
        if (!this.f49063i) {
            d dVar = this.f49067m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f49065k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f49062g;
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
            i60 i60Var = this.e;
            if (z10) {
                Bitmap bitmap = i60Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                i60Var.setAlpha(f7);
                i60Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
