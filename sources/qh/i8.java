package qh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.wo;
import org.telegram.ui.lc;
public final class i8 implements View.OnClickListener {
    public final int f45430a;
    public final ca f45431b;

    public i8(ca caVar, int i10) {
        this.f45430a = i10;
        this.f45431b = caVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        pr prVar;
        boolean z4;
        int i10;
        String string;
        int i11;
        int i12;
        u uVar;
        int i13 = this.f45430a;
        boolean z10 = false;
        ca caVar = this.f45431b;
        switch (i13) {
            case 0:
                ca caVar2 = this.f45431b;
                if (caVar2.H1 != null && caVar2.f45159z2 == null && caVar2.f45094f1 != null) {
                    ValueAnimator valueAnimator = caVar2.B2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = caVar2.H1.f46091y0;
                        Bitmap createBitmap = Bitmap.createBitmap(caVar2.f45115n.getWidth(), caVar2.f45115n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        caVar2.f45094f1.setAlpha(0.0f);
                        q9 q9Var = caVar2.U0;
                        if (q9Var != null) {
                            q9Var.f45468d0 = true;
                        }
                        f9 f9Var = caVar2.f45134s1;
                        if (f9Var != null) {
                            f9Var.F0 = true;
                        }
                        caVar2.f45115n.draw(canvas);
                        q9 q9Var2 = caVar2.U0;
                        if (q9Var2 != null) {
                            q9Var2.f45468d0 = false;
                        }
                        f9 f9Var2 = caVar2.f45134s1;
                        if (f9Var2 != null) {
                            f9Var2.F0 = false;
                        }
                        caVar2.f45094f1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        caVar2.f45094f1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        wo woVar = new wo(caVar2, caVar2.f45077b, z11, canvas, (caVar2.f45094f1.getMeasuredWidth() / 2.0f) + f10, (caVar2.f45094f1.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 2);
                        caVar2.f45159z2 = woVar;
                        woVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        caVar2.A2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        caVar2.B2 = ofFloat;
                        ofFloat.addUpdateListener(new lc(caVar2, 3));
                        caVar2.B2.addListener(new b9(caVar2, 2));
                        caVar2.B2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = caVar2.B2;
                        if (z11) {
                            j10 = 320;
                        } else {
                            j10 = 450;
                        }
                        valueAnimator2.setDuration(j10);
                        ValueAnimator valueAnimator3 = caVar2.B2;
                        if (z11) {
                            prVar = pr.f30185i;
                        } else {
                            prVar = pr.h;
                        }
                        valueAnimator3.setInterpolator(prVar);
                        caVar2.B2.start();
                        caVar2.f45115n.addView(caVar2.f45159z2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new g8(caVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!caVar.P1) {
                    caVar.M();
                    return;
                }
                return;
            case 2:
                s6 s6Var = caVar.H1;
                if (s6Var != null && !caVar.P1) {
                    s6Var.Y = !s6Var.Y;
                    ArrayList arrayList = s6Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((s6) obj).Y = caVar.H1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(caVar.H1.f46090y);
                    s6 s6Var2 = caVar.H1;
                    if (s6Var2.f46072o0 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (caVar.f45085d0 == -1) {
                        f3 f3Var = caVar.f45100h1;
                        if (s6Var2.Y) {
                            if (isEmpty && !z4) {
                                i11 = R.string.StorySoundMuted;
                            } else {
                                i11 = R.string.StoryOriginalSoundMuted;
                            }
                            string = LocaleController.getString(i11);
                        } else {
                            if (isEmpty && !z4) {
                                i10 = R.string.StorySoundNotMuted;
                            } else {
                                i10 = R.string.StoryOriginalSoundNotMuted;
                            }
                            string = LocaleController.getString(i10);
                        }
                        boolean z12 = caVar.f45100h1.S;
                        if (f3Var.getMeasuredWidth() < 0) {
                            f3Var.D = string;
                        } else {
                            org.telegram.ui.Components.j6 j6Var = f3Var.E;
                            if (!LocaleController.isRTL && z12) {
                                z10 = true;
                            }
                            j6Var.q(string, z10, true);
                        }
                        caVar.f45100h1.v();
                    }
                    caVar.f0(caVar.H1.Y, true);
                    caVar.U0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = caVar.U0.k();
                caVar.U0.x(-9982, k10);
                ((og0) caVar.f45097g1.f6337c).a(!k10, true);
                return;
            case 4:
                if (caVar.f45154y0 != null && !caVar.P1) {
                    String C = caVar.C();
                    String F = caVar.F();
                    if (C != null && !C.equals(F)) {
                        g9 g9Var = caVar.f45154y0;
                        if (g9Var != null && g9Var.getCameraSession() != null) {
                            if (caVar.f45154y0.isFrontface() && !caVar.f45154y0.getCameraSession().hasFlashModes()) {
                                int indexOf = caVar.f45131r2.indexOf(F);
                                if (indexOf >= 0) {
                                    caVar.f45127q2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", caVar.f45127q2).apply();
                                }
                            } else {
                                caVar.f45154y0.getCameraSession().setCurrentFlashMode(F);
                            }
                        }
                        caVar.e0(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                g9 g9Var2 = caVar.f45154y0;
                if (g9Var2 != null && caVar.f45082c0 == 0) {
                    g9Var2.toggleDual();
                    caVar.C0.setValue(caVar.f45154y0.isDual());
                    oa oaVar = caVar.C0;
                    if (caVar.f45154y0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    oaVar.setContentDescription(LocaleController.getString(i12));
                    caVar.f45103i1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (caVar.f45106j1.S) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    caVar.f45106j1.e(true);
                    return;
                }
                return;
            case 6:
                if (caVar.f45082c0 == 0 && !caVar.X1) {
                    g9 g9Var3 = caVar.f45154y0;
                    if (g9Var3 != null && g9Var3.isDual()) {
                        caVar.f45154y0.toggleDual();
                    }
                    if (!caVar.F0.f46137e && !caVar.f45150x0.j()) {
                        caVar.f45150x0.o(caVar.f45146w0);
                        caVar.F0.setSelected(caVar.f45146w0);
                        caVar.D0.a(new lc0(caVar.f45146w0, false), true);
                        caVar.D0.setSelected(true);
                        g9 g9Var4 = caVar.f45154y0;
                        if (g9Var4 != null) {
                            g9Var4.recordHevc = !caVar.f45150x0.j();
                        }
                        c9 c9Var = caVar.J0;
                        if (c9Var != null) {
                            c9Var.setMultipleOnClick(caVar.f45150x0.j());
                            caVar.J0.setMaxCount(Math.min(10, r.b() - caVar.f45150x0.getFilledCount()));
                        }
                    }
                    caVar.F0.a(!uVar.f46137e, true);
                    caVar.m0(true);
                    return;
                }
                return;
            case 7:
                caVar.f45150x0.o(null);
                caVar.f45150x0.e();
                caVar.F0.setSelected((r) null);
                g9 g9Var5 = caVar.f45154y0;
                if (g9Var5 != null) {
                    g9Var5.recordHevc = !caVar.f45150x0.j();
                }
                caVar.F0.a(false, true);
                caVar.m0(true);
                c9 c9Var2 = caVar.J0;
                if (c9Var2 != null) {
                    c9Var2.setMultipleOnClick(caVar.f45150x0.j());
                    caVar.J0.setMaxCount(Math.min(10, r.b() - caVar.f45150x0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                caVar.k0();
                return;
            case 9:
                g9 g9Var6 = caVar.f45154y0;
                if (g9Var6 != null && !caVar.P1 && !caVar.M1 && g9Var6.isInited() && caVar.f45082c0 == 0) {
                    caVar.f45154y0.switchCamera();
                    caVar.L0.d(180.0f);
                    ca.a0(caVar.f45154y0.isFrontface());
                    if (caVar.q0()) {
                        caVar.f45132s.c(null);
                        return;
                    } else {
                        caVar.f45132s.d();
                        return;
                    }
                }
                return;
            case 10:
                caVar.k0();
                return;
            case 11:
                s6 s6Var3 = caVar.H1;
                if (s6Var3 != null) {
                    s6Var3.f46056f0 = true;
                    s6Var3.f46053e0 = caVar.J1;
                    caVar.X();
                    s6 s6Var4 = caVar.H1;
                    if (s6Var4 != null && !s6Var4.f46045b0) {
                        AndroidUtilities.runOnUIThread(new g8(caVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (caVar.f45124p2) {
                    caVar.Z(true);
                    return;
                }
                return;
            case 13:
                caVar.l0(-1, false, true);
                return;
            default:
                caVar.l0(-1, false, true);
                return;
        }
    }
}
