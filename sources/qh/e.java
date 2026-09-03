package qh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.zh;
import org.telegram.ui.vd1;
public final class e implements Runnable {
    public final int f45252a;
    public final k f45253b;

    public e(k kVar, int i10) {
        this.f45252a = i10;
        this.f45253b = kVar;
    }

    @Override
    public final void run() {
        float f10;
        int i10;
        int i11;
        int i12 = this.f45252a;
        k kVar = this.f45253b;
        switch (i12) {
            case 0:
                kVar.t();
                return;
            default:
                boolean z4 = kVar.f45579j0;
                FrameLayout frameLayout = kVar.G;
                h hVar = kVar.f45587r;
                f fVar = kVar.f45574f;
                if (kVar.m0 != z4) {
                    kVar.m0 = z4;
                    ValueAnimator valueAnimator = kVar.f45583n0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        kVar.f45583n0 = null;
                    }
                    Utilities.Callback callback = kVar.f45577h0;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z4));
                    }
                    kVar.d(z4);
                    if (z4) {
                        zh zhVar = kVar.J;
                        if (zhVar != null) {
                            zhVar.setVisibility(0);
                        }
                        hVar.setVisibility(0);
                    } else {
                        fVar.getEditText().scrollBy(0, -fVar.getEditText().getScrollY());
                    }
                    float f11 = kVar.f45581l0;
                    if (z4) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    kVar.f45583n0 = ofFloat;
                    ofFloat.addUpdateListener(new oh.f5(kVar, 12));
                    if (!z4) {
                        fVar.getEditText().setAllowDrawCursor(false);
                    }
                    kVar.f45583n0.addListener(new vd1(7, kVar, z4));
                    if (z4) {
                        kVar.f45583n0.setInterpolator(org.telegram.ui.ActionBar.r1.f22251w);
                        kVar.f45583n0.setDuration(250L);
                    } else {
                        kVar.f45583n0.setInterpolator(new u1.a());
                        kVar.f45583n0.setDuration(420L);
                    }
                    kVar.f45583n0.start();
                    xt editText = fVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = kVar.f45571d0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z4) {
                            i10 = fVar.f26997a.length();
                        } else {
                            i10 = 0;
                        }
                        fVar.setSelection(i10);
                        fVar.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z4) {
                            i11 = lineTop - height;
                        } else {
                            i11 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i11);
                        kVar.f45571d0 = ofInt;
                        ofInt.setDuration(360L);
                        kVar.f45571d0.setInterpolator(pr.h);
                        kVar.f45571d0.start();
                    }
                    fVar.setSuggestionsEnabled(z4);
                    if (!z4) {
                        fVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z4 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (kVar.f45584o0 == null) {
                            kVar.f45584o0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        kVar.f45593v0 = true;
                        kVar.i(kVar.f45584o0);
                        kVar.f45593v0 = false;
                        Bitmap bitmap = kVar.f45584o0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = kVar.f45584o0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            kVar.f45585p0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = kVar.f45586q0;
                            if (matrix == null) {
                                kVar.f45586q0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            kVar.f45585p0.setLocalMatrix(kVar.f45586q0);
                            if (kVar.f45588r0 == null) {
                                Paint paint = new Paint(3);
                                kVar.f45588r0 = paint;
                                paint.setColor(-1);
                            }
                            kVar.f45588r0.setShader(kVar.f45585p0);
                            return;
                        }
                        kVar.f45584o0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
