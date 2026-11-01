package vh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.jc;
public final class a7 implements View.OnClickListener {
    public final int f50927a;
    public final o8 f50928b;

    public a7(o8 o8Var, int i10) {
        this.f50927a = i10;
        this.f50928b = o8Var;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        gr grVar;
        boolean z10;
        int i10;
        String L0;
        int i11;
        int i12;
        t tVar;
        int i13 = this.f50927a;
        boolean z11 = false;
        o8 o8Var = this.f50928b;
        switch (i13) {
            case 0:
                o8 o8Var2 = this.f50928b;
                if (o8Var2.K1 != null && o8Var2.C2 == null && o8Var2.f51647i1 != null) {
                    ValueAnimator valueAnimator = o8Var2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = o8Var2.K1.f51578y0;
                        Bitmap createBitmap = Bitmap.createBitmap(o8Var2.f51659n.getWidth(), o8Var2.f51659n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        o8Var2.f51647i1.setAlpha(0.0f);
                        d8 d8Var = o8Var2.X0;
                        if (d8Var != null) {
                            d8Var.f51426g0 = true;
                        }
                        s7 s7Var = o8Var2.f51687v1;
                        if (s7Var != null) {
                            s7Var.f50991r0 = true;
                        }
                        o8Var2.f51659n.draw(canvas);
                        d8 d8Var2 = o8Var2.X0;
                        if (d8Var2 != null) {
                            d8Var2.f51426g0 = false;
                        }
                        s7 s7Var2 = o8Var2.f51687v1;
                        if (s7Var2 != null) {
                            s7Var2.f50991r0 = false;
                        }
                        o8Var2.f51647i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        o8Var2.f51647i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        y7 y7Var = new y7(o8Var2, o8Var2.f51622b, z12, canvas, (o8Var2.f51647i1.getMeasuredWidth() / 2.0f) + f7, (o8Var2.f51647i1.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.f16167n, paint, createBitmap, paint2, f7, f10);
                        o8Var2.C2 = y7Var;
                        y7Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        o8Var2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        o8Var2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new jc(o8Var2, 3));
                        o8Var2.E2.addListener(new q7(o8Var2, 2));
                        o8Var2.E2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = o8Var2.E2;
                        if (z12) {
                            j10 = 320;
                        } else {
                            j10 = 450;
                        }
                        valueAnimator2.setDuration(j10);
                        ValueAnimator valueAnimator3 = o8Var2.E2;
                        if (z12) {
                            grVar = gr.f26525i;
                        } else {
                            grVar = gr.h;
                        }
                        valueAnimator3.setInterpolator(grVar);
                        o8Var2.E2.start();
                        o8Var2.f51659n.addView(o8Var2.C2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new y6(o8Var2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!o8Var.S1) {
                    o8Var.L();
                    return;
                }
                return;
            case 2:
                n5 n5Var = o8Var.K1;
                if (n5Var != null && !o8Var.S1) {
                    n5Var.Y = !n5Var.Y;
                    ArrayList arrayList = n5Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((n5) obj).Y = o8Var.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(o8Var.K1.f51577y);
                    n5 n5Var2 = o8Var.K1;
                    if (n5Var2.f51559o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (o8Var.f51640g0 == -1) {
                        p2 p2Var = o8Var.f51653k1;
                        if (n5Var2.Y) {
                            if (isEmpty && !z10) {
                                i11 = 2131744486;
                            } else {
                                i11 = 2131744611;
                            }
                            L0 = dd.L0(i11, null);
                        } else {
                            if (isEmpty && !z10) {
                                i10 = 2131744485;
                            } else {
                                i10 = 2131744610;
                            }
                            L0 = dd.L0(i10, null);
                        }
                        boolean z13 = o8Var.f51653k1.V;
                        if (p2Var.getMeasuredWidth() < 0) {
                            p2Var.G = L0;
                        } else {
                            org.telegram.ui.Components.e6 e6Var = p2Var.H;
                            if (!dd.X && z13) {
                                z11 = true;
                            }
                            e6Var.t(L0, z11, true);
                        }
                        o8Var.f51653k1.u();
                    }
                    o8Var.e0(o8Var.K1.Y, true);
                    o8Var.X0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = o8Var.X0.k();
                o8Var.X0.x(-9982, k10);
                ((kf0) o8Var.f51650j1.f11065c).a(!k10, true);
                return;
            case 4:
                if (o8Var.B0 != null && !o8Var.S1) {
                    String B = o8Var.B();
                    String E = o8Var.E();
                    if (B != null && !B.equals(E)) {
                        t7 t7Var = o8Var.B0;
                        if (t7Var != null && t7Var.getCameraSession() != null) {
                            if (o8Var.B0.isFrontface() && !o8Var.B0.getCameraSession().hasFlashModes()) {
                                int indexOf = o8Var.f51685u2.indexOf(E);
                                if (indexOf >= 0) {
                                    o8Var.f51682t2 = indexOf;
                                    wp.d1().edit().putInt("frontflash", o8Var.f51682t2).apply();
                                }
                            } else {
                                o8Var.B0.getCameraSession().setCurrentFlashMode(E);
                            }
                        }
                        o8Var.d0(E);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                t7 t7Var2 = o8Var.B0;
                if (t7Var2 != null && o8Var.f51637f0 == 0) {
                    t7Var2.toggleDual();
                    o8Var.F0.setValue(o8Var.B0.isDual());
                    b9 b9Var = o8Var.F0;
                    if (o8Var.B0.isDual()) {
                        i12 = 2131754886;
                    } else {
                        i12 = 2131754887;
                    }
                    b9Var.setContentDescription(dd.L0(i12, null));
                    o8Var.l1.e(true);
                    wp.d1().edit().putInt("storydualhint", 2).apply();
                    if (o8Var.f51657m1.V) {
                        wp.d1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    o8Var.f51657m1.e(true);
                    return;
                }
                return;
            case 6:
                if (o8Var.f51637f0 == 0 && !o8Var.a2) {
                    t7 t7Var3 = o8Var.B0;
                    if (t7Var3 != null && t7Var3.isDual()) {
                        o8Var.B0.toggleDual();
                    }
                    if (!o8Var.I0.e && !o8Var.A0.j()) {
                        o8Var.A0.o(o8Var.f51701z0);
                        o8Var.I0.setSelected(o8Var.f51701z0);
                        o8Var.G0.a(new ob0(o8Var.f51701z0, false), true);
                        o8Var.G0.setSelected(true);
                        t7 t7Var4 = o8Var.B0;
                        if (t7Var4 != null) {
                            t7Var4.recordHevc = !o8Var.A0.j();
                        }
                        m2 m2Var = o8Var.M0;
                        if (m2Var != null) {
                            m2Var.setMultipleOnClick(o8Var.A0.j());
                            o8Var.M0.setMaxCount(Math.min(10, r.b() - o8Var.A0.getFilledCount()));
                        }
                    }
                    o8Var.I0.a(!tVar.e, true);
                    o8Var.l0(true);
                    return;
                }
                return;
            case 7:
                o8Var.A0.o(null);
                o8Var.A0.e();
                o8Var.I0.setSelected((r) null);
                t7 t7Var5 = o8Var.B0;
                if (t7Var5 != null) {
                    t7Var5.recordHevc = !o8Var.A0.j();
                }
                o8Var.I0.a(false, true);
                o8Var.l0(true);
                m2 m2Var2 = o8Var.M0;
                if (m2Var2 != null) {
                    m2Var2.setMultipleOnClick(o8Var.A0.j());
                    o8Var.M0.setMaxCount(Math.min(10, r.b() - o8Var.A0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                o8Var.j0();
                return;
            case 9:
                t7 t7Var6 = o8Var.B0;
                if (t7Var6 != null && !o8Var.S1 && !o8Var.P1 && t7Var6.isInited() && o8Var.f51637f0 == 0) {
                    o8Var.B0.switchCamera();
                    o8Var.O0.d(180.0f);
                    o8.Z(o8Var.B0.isFrontface());
                    if (o8Var.p0()) {
                        o8Var.f51676s.c(null);
                        return;
                    } else {
                        o8Var.f51676s.d();
                        return;
                    }
                }
                return;
            case 10:
                o8Var.j0();
                return;
            case 11:
                n5 n5Var3 = o8Var.K1;
                if (n5Var3 != null) {
                    n5Var3.f51543f0 = true;
                    n5Var3.f51540e0 = o8Var.M1;
                    o8Var.W();
                    n5 n5Var4 = o8Var.K1;
                    if (n5Var4 != null && !n5Var4.f51533b0) {
                        org.telegram.messenger.i0.h3(new y6(o8Var, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (o8Var.f51679s2) {
                    o8Var.Y(true);
                    return;
                }
                return;
            case 13:
                o8Var.k0(-1, false, true);
                return;
            default:
                o8Var.k0(-1, false, true);
                return;
        }
    }
}
