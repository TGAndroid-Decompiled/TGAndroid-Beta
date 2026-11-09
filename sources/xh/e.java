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
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.x30;
import org.telegram.ui.uq0;
public final class e {
    public static HashMap f58787n;
    public final double f58788a;
    public final double f58789b;
    public final int f58790c;
    public final uq0 d;
    public final l40 f58791e;
    public d f58792f;
    public final int f58793g;
    public final int h;
    public boolean f58794i;
    public final ArrayList f58795j = new ArrayList();
    public final HashMap f58796k = new HashMap();
    public int f58797l = 0;
    public final c f58798m = new c(this, 0);

    public e(int i7, uq0 uq0Var, int i10, int i11) {
        double d = 1.0d / ((int) g0.f22564r);
        this.f58788a = d;
        this.f58789b = d * 4.0d;
        this.f58790c = i7;
        this.f58793g = i10;
        this.h = i11;
        this.d = uq0Var;
        l40 l40Var = new l40(2, uq0Var.getContext(), this);
        this.f58791e = l40Var;
        l40Var.setSurfaceTextureListener(new x30(this, 5));
        l40Var.setOpaque(false);
        uq0Var.addView(l40Var);
    }

    public static e d(int i7, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f58787n == null) {
                f58787n = new HashMap();
            }
            e eVar = (e) f58787n.get(Integer.valueOf(i7));
            if (eVar == null) {
                int o4 = iz.o();
                if (o4 != 1) {
                    if (o4 != 2) {
                        Point point = g0.f22563q;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = g0.f22563q;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = g0.f22563q;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap = f58787n;
                    Integer valueOf = Integer.valueOf(i7);
                    uq0 uq0Var = new uq0(viewGroup.getContext(), 20);
                    viewGroup.addView(uq0Var);
                    e eVar2 = new e(i7, uq0Var, min, min);
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
        HashMap hashMap = f58787n;
        if (hashMap != null) {
            for (e eVar : hashMap.values()) {
                if (eVar.f58790c == 0 && (dVar = eVar.f58792f) != null) {
                    dVar.f58777b = z9;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f58794i) {
            ArrayList arrayList = this.f58795j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i7 = this.f58797l;
                this.f58797l = i7 + 1;
                this.f58796k.put(view, Integer.valueOf(i7));
            }
        }
    }

    public final void b(View view) {
        this.f58795j.remove(view);
        this.f58796k.remove(view);
        if (!this.f58794i) {
            c cVar = this.f58798m;
            g0.r(cVar);
            g0.i3(cVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i7, int i10, float f10, boolean z9) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f58796k.get(view);
            if (num == null) {
                num = 0;
            }
            int i11 = this.f58793g;
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
            l40 l40Var = this.f58791e;
            if (z9) {
                Bitmap bitmap = l40Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                l40Var.setAlpha(f10);
                l40Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
