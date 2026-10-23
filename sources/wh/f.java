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
import org.telegram.ui.j41;
public final class f {
    public static HashMap f49045n;
    public final double f49046a;
    public final double f49047b;
    public final int f49048c;
    public final j41 d;
    public final i60 e;
    public e f49049f;
    public final int f49050g;
    public final int h;
    public boolean f49051i;
    public final ArrayList f49052j = new ArrayList();
    public final HashMap f49053k = new HashMap();
    public int f49054l = 0;
    public final d f49055m = new d(this, 0);

    public f(int i10, j41 j41Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f49046a = d;
        this.f49047b = d * 4.0d;
        this.f49048c = i10;
        this.f49050g = i11;
        this.h = i12;
        this.d = j41Var;
        i60 i60Var = new i60(this, j41Var.getContext(), 1);
        this.e = i60Var;
        i60Var.setSurfaceTextureListener(new t50(this, 5));
        i60Var.setOpaque(false);
        j41Var.addView(i60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f49045n == null) {
                f49045n = new HashMap();
            }
            f fVar = (f) f49045n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f49045n;
                    Integer valueOf = Integer.valueOf(i10);
                    j41 j41Var = new j41(viewGroup.getContext(), 11);
                    viewGroup.addView(j41Var);
                    f fVar2 = new f(i10, j41Var, min, min);
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
        HashMap hashMap = f49045n;
        if (hashMap != null) {
            for (f fVar : hashMap.values()) {
                if (fVar.f49048c == 0 && (eVar = fVar.f49049f) != null) {
                    eVar.f49036b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f49051i) {
            ArrayList arrayList = this.f49052j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f49054l;
                this.f49054l = i10 + 1;
                this.f49053k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f49052j.remove(view);
        this.f49053k.remove(view);
        if (!this.f49051i) {
            d dVar = this.f49055m;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            AndroidUtilities.runOnUIThread(dVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f49053k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f49050g;
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
