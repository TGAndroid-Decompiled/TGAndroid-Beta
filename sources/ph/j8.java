package ph;

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
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.to;
import org.telegram.ui.nc;
public final class j8 implements View.OnClickListener {
    public final int f41821a;
    public final da f41822b;

    public j8(da daVar, int i10) {
        this.f41821a = i10;
        this.f41822b = daVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        mr mrVar;
        boolean z4;
        int i10;
        String string;
        int i11;
        int i12;
        u uVar;
        int i13 = this.f41821a;
        boolean z10 = false;
        da daVar = this.f41822b;
        switch (i13) {
            case 0:
                da daVar2 = this.f41822b;
                if (daVar2.H1 != null && daVar2.f41594z2 == null && daVar2.f41529f1 != null) {
                    ValueAnimator valueAnimator = daVar2.B2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = daVar2.H1.f42448y0;
                        Bitmap createBitmap = Bitmap.createBitmap(daVar2.f41550n.getWidth(), daVar2.f41550n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        daVar2.f41529f1.setAlpha(0.0f);
                        s9 s9Var = daVar2.U0;
                        if (s9Var != null) {
                            s9Var.f41894d0 = true;
                        }
                        h9 h9Var = daVar2.f41569s1;
                        if (h9Var != null) {
                            h9Var.F0 = true;
                        }
                        daVar2.f41550n.draw(canvas);
                        s9 s9Var2 = daVar2.U0;
                        if (s9Var2 != null) {
                            s9Var2.f41894d0 = false;
                        }
                        h9 h9Var2 = daVar2.f41569s1;
                        if (h9Var2 != null) {
                            h9Var2.F0 = false;
                        }
                        daVar2.f41529f1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        daVar2.f41529f1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        to toVar = new to(daVar2, daVar2.f41513b, z11, canvas, (daVar2.f41529f1.getMeasuredWidth() / 2.0f) + f10, (daVar2.f41529f1.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 2);
                        daVar2.f41594z2 = toVar;
                        toVar.setOnTouchListener(new oh.d(2));
                        daVar2.A2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        daVar2.B2 = ofFloat;
                        ofFloat.addUpdateListener(new nc(daVar2, 3));
                        daVar2.B2.addListener(new d9(daVar2, 2));
                        daVar2.B2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = daVar2.B2;
                        if (z11) {
                            j10 = 320;
                        } else {
                            j10 = 450;
                        }
                        valueAnimator2.setDuration(j10);
                        ValueAnimator valueAnimator3 = daVar2.B2;
                        if (z11) {
                            mrVar = mr.f27124i;
                        } else {
                            mrVar = mr.h;
                        }
                        valueAnimator3.setInterpolator(mrVar);
                        daVar2.B2.start();
                        daVar2.f41550n.addView(daVar2.f41594z2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new g8(daVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!daVar.P1) {
                    daVar.M();
                    return;
                }
                return;
            case 2:
                t6 t6Var = daVar.H1;
                if (t6Var != null && !daVar.P1) {
                    t6Var.Y = !t6Var.Y;
                    ArrayList arrayList = t6Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((t6) obj).Y = daVar.H1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(daVar.H1.f42447y);
                    t6 t6Var2 = daVar.H1;
                    if (t6Var2.f42429o0 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (daVar.f41521d0 == -1) {
                        f3 f3Var = daVar.f41535h1;
                        if (t6Var2.Y) {
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
                        boolean z12 = daVar.f41535h1.S;
                        if (f3Var.getMeasuredWidth() < 0) {
                            f3Var.D = string;
                        } else {
                            org.telegram.ui.Components.j6 j6Var = f3Var.E;
                            if (!LocaleController.isRTL && z12) {
                                z10 = true;
                            }
                            j6Var.q(string, z10, true);
                        }
                        daVar.f41535h1.u();
                    }
                    daVar.f0(daVar.H1.Y, true);
                    daVar.U0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = daVar.U0.k();
                daVar.U0.x(-9982, k10);
                ((ng0) daVar.f41532g1.f5291c).a(!k10, true);
                return;
            case 4:
                if (daVar.f41589y0 != null && !daVar.P1) {
                    String C = daVar.C();
                    String F = daVar.F();
                    if (C != null && !C.equals(F)) {
                        i9 i9Var = daVar.f41589y0;
                        if (i9Var != null && i9Var.getCameraSession() != null) {
                            if (daVar.f41589y0.isFrontface() && !daVar.f41589y0.getCameraSession().hasFlashModes()) {
                                int indexOf = daVar.f41566r2.indexOf(F);
                                if (indexOf >= 0) {
                                    daVar.f41562q2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", daVar.f41562q2).apply();
                                }
                            } else {
                                daVar.f41589y0.getCameraSession().setCurrentFlashMode(F);
                            }
                        }
                        daVar.e0(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                i9 i9Var2 = daVar.f41589y0;
                if (i9Var2 != null && daVar.f41518c0 == 0) {
                    i9Var2.toggleDual();
                    daVar.C0.setValue(daVar.f41589y0.isDual());
                    qa qaVar = daVar.C0;
                    if (daVar.f41589y0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    qaVar.setContentDescription(LocaleController.getString(i12));
                    daVar.f41538i1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (daVar.f41541j1.S) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    daVar.f41541j1.e(true);
                    return;
                }
                return;
            case 6:
                if (daVar.f41518c0 == 0 && !daVar.X1) {
                    i9 i9Var3 = daVar.f41589y0;
                    if (i9Var3 != null && i9Var3.isDual()) {
                        daVar.f41589y0.toggleDual();
                    }
                    if (!daVar.F0.e && !daVar.f41585x0.j()) {
                        daVar.f41585x0.o(daVar.f41581w0);
                        daVar.F0.setSelected(daVar.f41581w0);
                        daVar.D0.a(new kc0(daVar.f41581w0, false), true);
                        daVar.D0.setSelected(true);
                        i9 i9Var4 = daVar.f41589y0;
                        if (i9Var4 != null) {
                            i9Var4.recordHevc = !daVar.f41585x0.j();
                        }
                        e9 e9Var = daVar.J0;
                        if (e9Var != null) {
                            e9Var.setMultipleOnClick(daVar.f41585x0.j());
                            daVar.J0.setMaxCount(Math.min(10, r.b() - daVar.f41585x0.getFilledCount()));
                        }
                    }
                    daVar.F0.a(!uVar.e, true);
                    daVar.m0(true);
                    return;
                }
                return;
            case 7:
                daVar.f41585x0.o(null);
                daVar.f41585x0.e();
                daVar.F0.setSelected((r) null);
                i9 i9Var5 = daVar.f41589y0;
                if (i9Var5 != null) {
                    i9Var5.recordHevc = !daVar.f41585x0.j();
                }
                daVar.F0.a(false, true);
                daVar.m0(true);
                e9 e9Var2 = daVar.J0;
                if (e9Var2 != null) {
                    e9Var2.setMultipleOnClick(daVar.f41585x0.j());
                    daVar.J0.setMaxCount(Math.min(10, r.b() - daVar.f41585x0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                daVar.k0();
                return;
            case 9:
                i9 i9Var6 = daVar.f41589y0;
                if (i9Var6 != null && !daVar.P1 && !daVar.M1 && i9Var6.isInited() && daVar.f41518c0 == 0) {
                    daVar.f41589y0.switchCamera();
                    daVar.L0.d(180.0f);
                    da.a0(daVar.f41589y0.isFrontface());
                    if (daVar.q0()) {
                        daVar.f41567s.c(null);
                        return;
                    } else {
                        daVar.f41567s.d();
                        return;
                    }
                }
                return;
            case 10:
                daVar.k0();
                return;
            case 11:
                t6 t6Var3 = daVar.H1;
                if (t6Var3 != null) {
                    t6Var3.f42413f0 = true;
                    t6Var3.f42410e0 = daVar.J1;
                    daVar.X();
                    t6 t6Var4 = daVar.H1;
                    if (t6Var4 != null && !t6Var4.f42403b0) {
                        AndroidUtilities.runOnUIThread(new g8(daVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (daVar.f41559p2) {
                    daVar.Z(true);
                    return;
                }
                return;
            case 13:
                daVar.l0(-1, false, true);
                return;
            default:
                daVar.l0(-1, false, true);
                return;
        }
    }
}
