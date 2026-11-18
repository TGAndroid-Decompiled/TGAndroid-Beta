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
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.v40;
import org.telegram.ui.ih0;
public final class e {
    public static HashMap f60535n;
    public final double f60536a;
    public final double f60537b;
    public final int f60538c;
    public final ih0 d;
    public final v40 f60539e;
    public d f60540f;
    public final int f60541g;
    public final int h;
    public boolean f60542i;
    public final ArrayList f60543j = new ArrayList();
    public final HashMap f60544k = new HashMap();
    public int f60545l = 0;
    public final c f60546m = new c(this, 0);

    public e(int i7, ih0 ih0Var, int i10, int i11) {
        double d = 1.0d / ((int) g0.f24119r);
        this.f60536a = d;
        this.f60537b = d * 4.0d;
        this.f60538c = i7;
        this.f60541g = i10;
        this.h = i11;
        this.d = ih0Var;
        v40 v40Var = new v40(2, ih0Var.getContext(), this);
        this.f60539e = v40Var;
        v40Var.setSurfaceTextureListener(new h40(this, 4));
        v40Var.setOpaque(false);
        ih0Var.addView(v40Var);
    }

    public static e d(int i7, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f60535n == null) {
                f60535n = new HashMap();
            }
            e eVar = (e) f60535n.get(Integer.valueOf(i7));
            if (eVar == null) {
                int o4 = bz.o();
                if (o4 != 1) {
                    if (o4 != 2) {
                        Point point = g0.f24118q;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = g0.f24118q;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = g0.f24118q;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap = f60535n;
                    Integer valueOf = Integer.valueOf(i7);
                    ih0 ih0Var = new ih0(viewGroup.getContext(), 22);
                    viewGroup.addView(ih0Var);
                    e eVar2 = new e(i7, ih0Var, min, min);
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
        HashMap hashMap = f60535n;
        if (hashMap != null) {
            for (e eVar : hashMap.values()) {
                if (eVar.f60538c == 0 && (dVar = eVar.f60540f) != null) {
                    dVar.f60525b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f60542i) {
            ArrayList arrayList = this.f60543j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i7 = this.f60545l;
                this.f60545l = i7 + 1;
                this.f60544k.put(view, Integer.valueOf(i7));
            }
        }
    }

    public final void b(View view) {
        this.f60543j.remove(view);
        this.f60544k.remove(view);
        if (!this.f60542i) {
            c cVar = this.f60546m;
            g0.r(cVar);
            g0.h3(cVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i7, int i10, float f10, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f60544k.get(view);
            if (num == null) {
                num = 0;
            }
            int i11 = this.f60541g;
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
            v40 v40Var = this.f60539e;
            if (z10) {
                Bitmap bitmap = v40Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                v40Var.setAlpha(f10);
                v40Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
