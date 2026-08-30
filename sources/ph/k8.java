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
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.uo;
import org.telegram.ui.lc;
public final class k8 implements View.OnClickListener {
    public final int f41862a;
    public final da f41863b;

    public k8(da daVar, int i10) {
        this.f41862a = i10;
        this.f41863b = daVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        nr nrVar;
        boolean z4;
        int i10;
        String string;
        int i11;
        int i12;
        u uVar;
        int i13 = this.f41862a;
        boolean z10 = false;
        da daVar = this.f41863b;
        switch (i13) {
            case 0:
                da daVar2 = this.f41863b;
                if (daVar2.H1 != null && daVar2.f41556z2 == null && daVar2.f41491f1 != null) {
                    ValueAnimator valueAnimator = daVar2.B2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = daVar2.H1.f42447y0;
                        Bitmap createBitmap = Bitmap.createBitmap(daVar2.f41512n.getWidth(), daVar2.f41512n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        daVar2.f41491f1.setAlpha(0.0f);
                        s9 s9Var = daVar2.U0;
                        if (s9Var != null) {
                            s9Var.f41884d0 = true;
                        }
                        h9 h9Var = daVar2.f41531s1;
                        if (h9Var != null) {
                            h9Var.F0 = true;
                        }
                        daVar2.f41512n.draw(canvas);
                        s9 s9Var2 = daVar2.U0;
                        if (s9Var2 != null) {
                            s9Var2.f41884d0 = false;
                        }
                        h9 h9Var2 = daVar2.f41531s1;
                        if (h9Var2 != null) {
                            h9Var2.F0 = false;
                        }
                        daVar2.f41491f1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        daVar2.f41491f1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        uo uoVar = new uo(daVar2, daVar2.f41475b, z11, canvas, (daVar2.f41491f1.getMeasuredWidth() / 2.0f) + f10, (daVar2.f41491f1.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 2);
                        daVar2.f41556z2 = uoVar;
                        uoVar.setOnTouchListener(new oh.d(2));
                        daVar2.A2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        daVar2.B2 = ofFloat;
                        ofFloat.addUpdateListener(new lc(daVar2, 3));
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
                            nrVar = nr.f27348i;
                        } else {
                            nrVar = nr.h;
                        }
                        valueAnimator3.setInterpolator(nrVar);
                        daVar2.B2.start();
                        daVar2.f41512n.addView(daVar2.f41556z2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new h8(daVar2, 4));
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
                u6 u6Var = daVar.H1;
                if (u6Var != null && !daVar.P1) {
                    u6Var.Y = !u6Var.Y;
                    ArrayList arrayList = u6Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((u6) obj).Y = daVar.H1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(daVar.H1.f42446y);
                    u6 u6Var2 = daVar.H1;
                    if (u6Var2.f42428o0 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (daVar.f41483d0 == -1) {
                        f3 f3Var = daVar.f41497h1;
                        if (u6Var2.Y) {
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
                        boolean z12 = daVar.f41497h1.S;
                        if (f3Var.getMeasuredWidth() < 0) {
                            f3Var.D = string;
                        } else {
                            org.telegram.ui.Components.j6 j6Var = f3Var.E;
                            if (!LocaleController.isRTL && z12) {
                                z10 = true;
                            }
                            j6Var.q(string, z10, true);
                        }
                        daVar.f41497h1.v();
                    }
                    daVar.f0(daVar.H1.Y, true);
                    daVar.U0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = daVar.U0.k();
                daVar.U0.x(-9982, k10);
                ((mg0) daVar.f41494g1.f5302c).a(!k10, true);
                return;
            case 4:
                if (daVar.f41551y0 != null && !daVar.P1) {
                    String C = daVar.C();
                    String F = daVar.F();
                    if (C != null && !C.equals(F)) {
                        i9 i9Var = daVar.f41551y0;
                        if (i9Var != null && i9Var.getCameraSession() != null) {
                            if (daVar.f41551y0.isFrontface() && !daVar.f41551y0.getCameraSession().hasFlashModes()) {
                                int indexOf = daVar.f41528r2.indexOf(F);
                                if (indexOf >= 0) {
                                    daVar.f41524q2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", daVar.f41524q2).apply();
                                }
                            } else {
                                daVar.f41551y0.getCameraSession().setCurrentFlashMode(F);
                            }
                        }
                        daVar.e0(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                i9 i9Var2 = daVar.f41551y0;
                if (i9Var2 != null && daVar.f41480c0 == 0) {
                    i9Var2.toggleDual();
                    daVar.C0.setValue(daVar.f41551y0.isDual());
                    qa qaVar = daVar.C0;
                    if (daVar.f41551y0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    qaVar.setContentDescription(LocaleController.getString(i12));
                    daVar.f41500i1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (daVar.f41503j1.S) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    daVar.f41503j1.e(true);
                    return;
                }
                return;
            case 6:
                if (daVar.f41480c0 == 0 && !daVar.X1) {
                    i9 i9Var3 = daVar.f41551y0;
                    if (i9Var3 != null && i9Var3.isDual()) {
                        daVar.f41551y0.toggleDual();
                    }
                    if (!daVar.F0.e && !daVar.f41547x0.j()) {
                        daVar.f41547x0.o(daVar.f41543w0);
                        daVar.F0.setSelected(daVar.f41543w0);
                        daVar.D0.a(new jc0(daVar.f41543w0, false), true);
                        daVar.D0.setSelected(true);
                        i9 i9Var4 = daVar.f41551y0;
                        if (i9Var4 != null) {
                            i9Var4.recordHevc = !daVar.f41547x0.j();
                        }
                        e9 e9Var = daVar.J0;
                        if (e9Var != null) {
                            e9Var.setMultipleOnClick(daVar.f41547x0.j());
                            daVar.J0.setMaxCount(Math.min(10, r.b() - daVar.f41547x0.getFilledCount()));
                        }
                    }
                    daVar.F0.a(!uVar.e, true);
                    daVar.m0(true);
                    return;
                }
                return;
            case 7:
                daVar.f41547x0.o(null);
                daVar.f41547x0.e();
                daVar.F0.setSelected((r) null);
                i9 i9Var5 = daVar.f41551y0;
                if (i9Var5 != null) {
                    i9Var5.recordHevc = !daVar.f41547x0.j();
                }
                daVar.F0.a(false, true);
                daVar.m0(true);
                e9 e9Var2 = daVar.J0;
                if (e9Var2 != null) {
                    e9Var2.setMultipleOnClick(daVar.f41547x0.j());
                    daVar.J0.setMaxCount(Math.min(10, r.b() - daVar.f41547x0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                daVar.k0();
                return;
            case 9:
                i9 i9Var6 = daVar.f41551y0;
                if (i9Var6 != null && !daVar.P1 && !daVar.M1 && i9Var6.isInited() && daVar.f41480c0 == 0) {
                    daVar.f41551y0.switchCamera();
                    daVar.L0.d(180.0f);
                    da.a0(daVar.f41551y0.isFrontface());
                    if (daVar.q0()) {
                        daVar.f41529s.c(null);
                        return;
                    } else {
                        daVar.f41529s.d();
                        return;
                    }
                }
                return;
            case 10:
                daVar.k0();
                return;
            case 11:
                u6 u6Var3 = daVar.H1;
                if (u6Var3 != null) {
                    u6Var3.f42412f0 = true;
                    u6Var3.f42409e0 = daVar.J1;
                    daVar.X();
                    u6 u6Var4 = daVar.H1;
                    if (u6Var4 != null && !u6Var4.f42402b0) {
                        AndroidUtilities.runOnUIThread(new h8(daVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (daVar.f41521p2) {
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
