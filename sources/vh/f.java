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
import org.telegram.ui.Components.b60;
import org.telegram.ui.n41;
public final class f {
    public static HashMap f48370n;
    public final double f48371a;
    public final double f48372b;
    public final int f48373c;
    public final n41 d;
    public final b60 f48374e;
    public e f48375f;
    public final int f48376g;
    public final int h;
    public boolean f48377i;
    public final ArrayList f48378j = new ArrayList();
    public final HashMap f48379k = new HashMap();
    public int f48380l = 0;
    public final d f48381m = new d(this, 0);

    public f(int i10, n41 n41Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f48371a = d;
        this.f48372b = d * 4.0d;
        this.f48373c = i10;
        this.f48376g = i11;
        this.h = i12;
        this.d = n41Var;
        b60 b60Var = new b60(this, n41Var.getContext(), 1);
        this.f48374e = b60Var;
        b60Var.setSurfaceTextureListener(new ki.d(this, 5));
        b60Var.setOpaque(false);
        n41Var.addView(b60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f48370n == null) {
                f48370n = new HashMap();
            }
            f fVar = (f) f48370n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f48370n;
                    Integer valueOf = Integer.valueOf(i10);
                    n41 n41Var = new n41(viewGroup.getContext(), 12);
                    viewGroup.addView(n41Var);
                    f fVar2 = new f(i10, n41Var, min, min);
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
        HashMap hashMap = f48370n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f48373c == 0 && (eVar = fVar.f48375f) != null) {
                    eVar.f48360b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f48377i) {
            ArrayList arrayList = this.f48378j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f48380l;
                this.f48380l = i10 + 1;
                this.f48379k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f48378j.remove(view);
        this.f48379k.remove(view);
        if (!this.f48377i) {
            d dVar = this.f48381m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f48379k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f48376g;
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
            b60 b60Var = this.f48374e;
            if (z10) {
                Bitmap bitmap = b60Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                b60Var.setAlpha(f7);
                b60Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
