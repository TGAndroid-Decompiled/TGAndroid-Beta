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
import org.telegram.ui.Components.p60;
import org.telegram.ui.w51;
public final class f {
    public static HashMap f49668n;
    public final double f49669a;
    public final double f49670b;
    public final int f49671c;
    public final w51 d;
    public final p60 f49672e;
    public e f49673f;
    public final int f49674g;
    public final int h;
    public boolean f49675i;
    public final ArrayList f49676j = new ArrayList();
    public final HashMap f49677k = new HashMap();
    public int f49678l = 0;
    public final d f49679m = new d(this, 0);

    public f(int i10, w51 w51Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f49669a = d;
        this.f49670b = d * 4.0d;
        this.f49671c = i10;
        this.f49674g = i11;
        this.h = i12;
        this.d = w51Var;
        p60 p60Var = new p60(this, w51Var.getContext(), 1);
        this.f49672e = p60Var;
        p60Var.setSurfaceTextureListener(new ki.d(this, 5));
        p60Var.setOpaque(false);
        w51Var.addView(p60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f49668n == null) {
                f49668n = new HashMap();
            }
            f fVar = (f) f49668n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f49668n;
                    Integer valueOf = Integer.valueOf(i10);
                    w51 w51Var = new w51(viewGroup.getContext(), 11);
                    viewGroup.addView(w51Var);
                    f fVar2 = new f(i10, w51Var, min, min);
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
        HashMap hashMap = f49668n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f49671c == 0 && (eVar = fVar.f49673f) != null) {
                    eVar.f49658b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f49675i) {
            ArrayList arrayList = this.f49676j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f49678l;
                this.f49678l = i10 + 1;
                this.f49677k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f49676j.remove(view);
        this.f49677k.remove(view);
        if (!this.f49675i) {
            d dVar = this.f49679m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f49677k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f49674g;
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
            p60 p60Var = this.f49672e;
            if (z10) {
                Bitmap bitmap = p60Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                p60Var.setAlpha(f7);
                p60Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
