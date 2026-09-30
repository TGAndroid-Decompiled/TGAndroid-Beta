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
import org.telegram.ui.m51;
public final class f {
    public static HashMap f44781n;
    public final double f44782a;
    public final double f44783b;
    public final int f44784c;
    public final m51 d;
    public final b60 e;
    public e f44785f;
    public final int f44786g;
    public final int h;
    public boolean f44787i;
    public final ArrayList f44788j = new ArrayList();
    public final HashMap f44789k = new HashMap();
    public int f44790l = 0;
    public final d f44791m = new d(this, 0);

    public f(int i10, m51 m51Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f44782a = d;
        this.f44783b = d * 4.0d;
        this.f44784c = i10;
        this.f44786g = i11;
        this.h = i12;
        this.d = m51Var;
        b60 b60Var = new b60(this, m51Var.getContext(), 1);
        this.e = b60Var;
        b60Var.setSurfaceTextureListener(new ki.d(this, 5));
        b60Var.setOpaque(false);
        m51Var.addView(b60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f44781n == null) {
                f44781n = new HashMap();
            }
            f fVar = (f) f44781n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f44781n;
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
        HashMap hashMap = f44781n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f44784c == 0 && (eVar = fVar.f44785f) != null) {
                    eVar.f44772b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f44787i) {
            ArrayList arrayList = this.f44788j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f44790l;
                this.f44790l = i10 + 1;
                this.f44789k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f44788j.remove(view);
        this.f44789k.remove(view);
        if (!this.f44787i) {
            d dVar = this.f44791m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f44789k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f44786g;
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
            b60 b60Var = this.e;
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
