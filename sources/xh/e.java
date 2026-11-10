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
import org.telegram.messenger.iz;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.w30;
import org.telegram.ui.vq0;
public final class e {
    public static HashMap f58785n;
    public final double f58786a;
    public final double f58787b;
    public final int f58788c;
    public final vq0 d;
    public final k40 f58789e;
    public d f58790f;
    public final int f58791g;
    public final int h;
    public boolean f58792i;
    public final ArrayList f58793j = new ArrayList();
    public final HashMap f58794k = new HashMap();
    public int f58795l = 0;
    public final c f58796m = new c(this, 0);

    public e(int i7, vq0 vq0Var, int i10, int i11) {
        double d = 1.0d / ((int) g0.f22568r);
        this.f58786a = d;
        this.f58787b = d * 4.0d;
        this.f58788c = i7;
        this.f58791g = i10;
        this.h = i11;
        this.d = vq0Var;
        k40 k40Var = new k40(2, vq0Var.getContext(), this);
        this.f58789e = k40Var;
        k40Var.setSurfaceTextureListener(new w30(this, 5));
        k40Var.setOpaque(false);
        vq0Var.addView(k40Var);
    }

    public static e d(int i7, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f58785n == null) {
                f58785n = new HashMap();
            }
            e eVar = (e) f58785n.get(Integer.valueOf(i7));
            if (eVar == null) {
                int o4 = iz.o();
                if (o4 != 1) {
                    if (o4 != 2) {
                        Point point = g0.f22567q;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = g0.f22567q;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = g0.f22567q;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap = f58785n;
                    Integer valueOf = Integer.valueOf(i7);
                    vq0 vq0Var = new vq0(viewGroup.getContext(), 20);
                    viewGroup.addView(vq0Var);
                    e eVar2 = new e(i7, vq0Var, min, min);
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

    public static void f(boolean z9) {
        d dVar;
        HashMap hashMap = f58785n;
        if (hashMap != null) {
            for (e eVar : hashMap.values()) {
                if (eVar.f58788c == 0 && (dVar = eVar.f58790f) != null) {
                    dVar.f58775b = z9;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f58792i) {
            ArrayList arrayList = this.f58793j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i7 = this.f58795l;
                this.f58795l = i7 + 1;
                this.f58794k.put(view, Integer.valueOf(i7));
            }
        }
    }

    public final void b(View view) {
        this.f58793j.remove(view);
        this.f58794k.remove(view);
        if (!this.f58792i) {
            c cVar = this.f58796m;
            g0.r(cVar);
            g0.i3(cVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i7, int i10, float f10, boolean z9) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f58794k.get(view);
            if (num == null) {
                num = 0;
            }
            int i11 = this.f58791g;
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
            k40 k40Var = this.f58789e;
            if (z9) {
                Bitmap bitmap = k40Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                k40Var.setAlpha(f10);
                k40Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
