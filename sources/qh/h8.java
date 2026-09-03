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
import org.telegram.ui.kc;
public final class h8 implements View.OnClickListener {
    public final int f45412a;
    public final ba f45413b;

    public h8(ba baVar, int i10) {
        this.f45412a = i10;
        this.f45413b = baVar;
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
        int i13 = this.f45412a;
        boolean z10 = false;
        ba baVar = this.f45413b;
        switch (i13) {
            case 0:
                ba baVar2 = this.f45413b;
                if (baVar2.H1 != null && baVar2.f45125z2 == null && baVar2.f45060f1 != null) {
                    ValueAnimator valueAnimator = baVar2.B2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = baVar2.H1.f46042y0;
                        Bitmap createBitmap = Bitmap.createBitmap(baVar2.f45081n.getWidth(), baVar2.f45081n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        baVar2.f45060f1.setAlpha(0.0f);
                        p9 p9Var = baVar2.U0;
                        if (p9Var != null) {
                            p9Var.f45438d0 = true;
                        }
                        e9 e9Var = baVar2.f45100s1;
                        if (e9Var != null) {
                            e9Var.F0 = true;
                        }
                        baVar2.f45081n.draw(canvas);
                        p9 p9Var2 = baVar2.U0;
                        if (p9Var2 != null) {
                            p9Var2.f45438d0 = false;
                        }
                        e9 e9Var2 = baVar2.f45100s1;
                        if (e9Var2 != null) {
                            e9Var2.F0 = false;
                        }
                        baVar2.f45060f1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        baVar2.f45060f1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        wo woVar = new wo(baVar2, baVar2.f45043b, z11, canvas, (baVar2.f45060f1.getMeasuredWidth() / 2.0f) + f10, (baVar2.f45060f1.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 2);
                        baVar2.f45125z2 = woVar;
                        woVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        baVar2.A2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        baVar2.B2 = ofFloat;
                        ofFloat.addUpdateListener(new kc(baVar2, 3));
                        baVar2.B2.addListener(new a9(baVar2, 2));
                        baVar2.B2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = baVar2.B2;
                        if (z11) {
                            j10 = 320;
                        } else {
                            j10 = 450;
                        }
                        valueAnimator2.setDuration(j10);
                        ValueAnimator valueAnimator3 = baVar2.B2;
                        if (z11) {
                            prVar = pr.f30170i;
                        } else {
                            prVar = pr.h;
                        }
                        valueAnimator3.setInterpolator(prVar);
                        baVar2.B2.start();
                        baVar2.f45081n.addView(baVar2.f45125z2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new f8(baVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!baVar.P1) {
                    baVar.M();
                    return;
                }
                return;
            case 2:
                r6 r6Var = baVar.H1;
                if (r6Var != null && !baVar.P1) {
                    r6Var.Y = !r6Var.Y;
                    ArrayList arrayList = r6Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((r6) obj).Y = baVar.H1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(baVar.H1.f46041y);
                    r6 r6Var2 = baVar.H1;
                    if (r6Var2.f46023o0 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (baVar.f45051d0 == -1) {
                        e3 e3Var = baVar.f45066h1;
                        if (r6Var2.Y) {
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
                        boolean z12 = baVar.f45066h1.S;
                        if (e3Var.getMeasuredWidth() < 0) {
                            e3Var.D = string;
                        } else {
                            org.telegram.ui.Components.j6 j6Var = e3Var.E;
                            if (!LocaleController.isRTL && z12) {
                                z10 = true;
                            }
                            j6Var.q(string, z10, true);
                        }
                        baVar.f45066h1.u();
                    }
                    baVar.f0(baVar.H1.Y, true);
                    baVar.U0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = baVar.U0.k();
                baVar.U0.x(-9982, k10);
                ((og0) baVar.f45063g1.f6337c).a(!k10, true);
                return;
            case 4:
                if (baVar.f45120y0 != null && !baVar.P1) {
                    String C = baVar.C();
                    String F = baVar.F();
                    if (C != null && !C.equals(F)) {
                        f9 f9Var = baVar.f45120y0;
                        if (f9Var != null && f9Var.getCameraSession() != null) {
                            if (baVar.f45120y0.isFrontface() && !baVar.f45120y0.getCameraSession().hasFlashModes()) {
                                int indexOf = baVar.f45097r2.indexOf(F);
                                if (indexOf >= 0) {
                                    baVar.f45093q2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", baVar.f45093q2).apply();
                                }
                            } else {
                                baVar.f45120y0.getCameraSession().setCurrentFlashMode(F);
                            }
                        }
                        baVar.e0(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                f9 f9Var2 = baVar.f45120y0;
                if (f9Var2 != null && baVar.f45048c0 == 0) {
                    f9Var2.toggleDual();
                    baVar.C0.setValue(baVar.f45120y0.isDual());
                    na naVar = baVar.C0;
                    if (baVar.f45120y0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    naVar.setContentDescription(LocaleController.getString(i12));
                    baVar.f45069i1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (baVar.f45072j1.S) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    baVar.f45072j1.e(true);
                    return;
                }
                return;
            case 6:
                if (baVar.f45048c0 == 0 && !baVar.X1) {
                    f9 f9Var3 = baVar.f45120y0;
                    if (f9Var3 != null && f9Var3.isDual()) {
                        baVar.f45120y0.toggleDual();
                    }
                    if (!baVar.F0.f46152e && !baVar.f45116x0.j()) {
                        baVar.f45116x0.o(baVar.f45112w0);
                        baVar.F0.setSelected(baVar.f45112w0);
                        baVar.D0.a(new lc0(baVar.f45112w0, false), true);
                        baVar.D0.setSelected(true);
                        f9 f9Var4 = baVar.f45120y0;
                        if (f9Var4 != null) {
                            f9Var4.recordHevc = !baVar.f45116x0.j();
                        }
                        b9 b9Var = baVar.J0;
                        if (b9Var != null) {
                            b9Var.setMultipleOnClick(baVar.f45116x0.j());
                            baVar.J0.setMaxCount(Math.min(10, r.b() - baVar.f45116x0.getFilledCount()));
                        }
                    }
                    baVar.F0.a(!uVar.f46152e, true);
                    baVar.m0(true);
                    return;
                }
                return;
            case 7:
                baVar.f45116x0.o(null);
                baVar.f45116x0.e();
                baVar.F0.setSelected((r) null);
                f9 f9Var5 = baVar.f45120y0;
                if (f9Var5 != null) {
                    f9Var5.recordHevc = !baVar.f45116x0.j();
                }
                baVar.F0.a(false, true);
                baVar.m0(true);
                b9 b9Var2 = baVar.J0;
                if (b9Var2 != null) {
                    b9Var2.setMultipleOnClick(baVar.f45116x0.j());
                    baVar.J0.setMaxCount(Math.min(10, r.b() - baVar.f45116x0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                baVar.k0();
                return;
            case 9:
                f9 f9Var6 = baVar.f45120y0;
                if (f9Var6 != null && !baVar.P1 && !baVar.M1 && f9Var6.isInited() && baVar.f45048c0 == 0) {
                    baVar.f45120y0.switchCamera();
                    baVar.L0.d(180.0f);
                    ba.a0(baVar.f45120y0.isFrontface());
                    if (baVar.q0()) {
                        baVar.f45098s.c(null);
                        return;
                    } else {
                        baVar.f45098s.d();
                        return;
                    }
                }
                return;
            case 10:
                baVar.k0();
                return;
            case 11:
                r6 r6Var3 = baVar.H1;
                if (r6Var3 != null) {
                    r6Var3.f46007f0 = true;
                    r6Var3.f46004e0 = baVar.J1;
                    baVar.X();
                    r6 r6Var4 = baVar.H1;
                    if (r6Var4 != null && !r6Var4.f45996b0) {
                        AndroidUtilities.runOnUIThread(new f8(baVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (baVar.f45090p2) {
                    baVar.Z(true);
                    return;
                }
                return;
            case 13:
                baVar.l0(-1, false, true);
                return;
            default:
                baVar.l0(-1, false, true);
                return;
        }
    }
}
