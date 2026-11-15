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
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.z30;
import org.telegram.ui.eh0;
public final class e {
    public static HashMap f59969n;
    public final double f59970a;
    public final double f59971b;
    public final int f59972c;
    public final eh0 d;
    public final n40 f59973e;
    public d f59974f;
    public final int f59975g;
    public final int h;
    public boolean f59976i;
    public final ArrayList f59977j = new ArrayList();
    public final HashMap f59978k = new HashMap();
    public int f59979l = 0;
    public final c f59980m = new c(this, 0);

    public e(int i7, eh0 eh0Var, int i10, int i11) {
        double d = 1.0d / ((int) g0.f23610r);
        this.f59970a = d;
        this.f59971b = d * 4.0d;
        this.f59972c = i7;
        this.f59975g = i10;
        this.h = i11;
        this.d = eh0Var;
        n40 n40Var = new n40(2, eh0Var.getContext(), this);
        this.f59973e = n40Var;
        n40Var.setSurfaceTextureListener(new z30(this, 4));
        n40Var.setOpaque(false);
        eh0Var.addView(n40Var);
    }

    public static e d(int i7, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f59969n == null) {
                f59969n = new HashMap();
            }
            e eVar = (e) f59969n.get(Integer.valueOf(i7));
            if (eVar == null) {
                int o4 = gz.o();
                if (o4 != 1) {
                    if (o4 != 2) {
                        Point point = g0.f23609q;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = g0.f23609q;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = g0.f23609q;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap = f59969n;
                    Integer valueOf = Integer.valueOf(i7);
                    eh0 eh0Var = new eh0(viewGroup.getContext(), 22);
                    viewGroup.addView(eh0Var);
                    e eVar2 = new e(i7, eh0Var, min, min);
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
        HashMap hashMap = f59969n;
        if (hashMap != null) {
            for (e eVar : hashMap.values()) {
                if (eVar.f59972c == 0 && (dVar = eVar.f59974f) != null) {
                    dVar.f59959b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f59976i) {
            ArrayList arrayList = this.f59977j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i7 = this.f59979l;
                this.f59979l = i7 + 1;
                this.f59978k.put(view, Integer.valueOf(i7));
            }
        }
    }

    public final void b(View view) {
        this.f59977j.remove(view);
        this.f59978k.remove(view);
        if (!this.f59976i) {
            c cVar = this.f59980m;
            g0.r(cVar);
            g0.i3(cVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i7, int i10, float f10, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f59978k.get(view);
            if (num == null) {
                num = 0;
            }
            int i11 = this.f59975g;
            int i12 = this.h;
            if (i7 > i11 || i10 > i12) {
                float max = Math.max(i7 / i11, i10 / i12);
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
            n40 n40Var = this.f59973e;
            if (z10) {
                Bitmap bitmap = n40Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                n40Var.setAlpha(f10);
                n40Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
