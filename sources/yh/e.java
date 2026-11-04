package yh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.s30;
import org.telegram.ui.yg0;
public final class e {
    public static HashMap f59495n;
    public final double f59496a;
    public final double f59497b;
    public final int f59498c;
    public final yg0 d;
    public final g40 f59499e;
    public d f59500f;
    public final int f59501g;
    public final int h;
    public boolean f59502i;
    public final ArrayList f59503j = new ArrayList();
    public final HashMap f59504k = new HashMap();
    public int f59505l = 0;
    public final c f59506m = new c(this, 0);

    public e(int i3, yg0 yg0Var, int i10, int i11) {
        double d = 1.0d / ((int) g0.f22609r);
        this.f59496a = d;
        this.f59497b = d * 4.0d;
        this.f59498c = i3;
        this.f59501g = i10;
        this.h = i11;
        this.d = yg0Var;
        g40 g40Var = new g40(2, yg0Var.getContext(), this);
        this.f59499e = g40Var;
        g40Var.setSurfaceTextureListener(new s30(this, 5));
        g40Var.setOpaque(false);
        yg0Var.addView(g40Var);
    }

    public static e d(int i3, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f59495n == null) {
                f59495n = new HashMap();
            }
            e eVar = (e) f59495n.get(Integer.valueOf(i3));
            if (eVar == null) {
                int o10 = az.o();
                if (o10 != 1) {
                    if (o10 != 2) {
                        Point point = g0.f22608q;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = g0.f22608q;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = g0.f22608q;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap = f59495n;
                    Integer valueOf = Integer.valueOf(i3);
                    yg0 yg0Var = new yg0(viewGroup.getContext(), 22);
                    viewGroup.addView(yg0Var);
                    e eVar2 = new e(i3, yg0Var, min, min);
                    hashMap.put(valueOf, eVar2);
                    eVar = eVar2;
                } else {
                    return null;
                }
            }
            eVar.a(view);
            return eVar;
        }
        return null;
    }

    public static e e(View view) {
        Activity W = g0.W(view.getContext());
        ViewGroup viewGroup = null;
        if (W != null) {
            View rootView = W.findViewById(16908290).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            }
        }
        return d(0, view, viewGroup);
    }

    public static void f(boolean z10) {
        d dVar;
        HashMap hashMap = f59495n;
        if (hashMap != null) {
            for (e eVar : hashMap.values()) {
                if (eVar.f59498c == 0 && (dVar = eVar.f59500f) != null) {
                    dVar.f59485b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f59502i) {
            ArrayList arrayList = this.f59503j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i3 = this.f59505l;
                this.f59505l = i3 + 1;
                this.f59504k.put(view, Integer.valueOf(i3));
            }
        }
    }

    public final void b(View view) {
        this.f59503j.remove(view);
        this.f59504k.remove(view);
        if (!this.f59502i) {
            c cVar = this.f59506m;
            g0.r(cVar);
            g0.i3(cVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i3, int i10, float f10, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f59504k.get(view);
            if (num == null) {
                num = 0;
            }
            int i11 = this.f59501g;
            int i12 = this.h;
            if (i3 > i11 || i10 > i12) {
                float max = Math.max(i3 / i11, i10 / i12);
                canvas.scale(max, max);
            }
            if (num.intValue() % 4 == 1) {
                canvas.rotate(180.0f, i11 / 2.0f, i12 / 2.0f);
            }
            if (num.intValue() % 4 == 2) {
                canvas.scale(-1.0f, 1.0f, i11 / 2.0f, i12 / 2.0f);
            }
            if (num.intValue() % 4 == 3) {
                canvas.scale(1.0f, -1.0f, i11 / 2.0f, i12 / 2.0f);
            }
            g40 g40Var = this.f59499e;
            if (z10) {
                Bitmap bitmap = g40Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                g40Var.setAlpha(f10);
                g40Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
