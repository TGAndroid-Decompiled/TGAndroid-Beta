package ph;

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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.zh;
import org.telegram.ui.l61;
public final class e implements Runnable {
    public final int f41557a;
    public final k f41558b;

    public e(k kVar, int i10) {
        this.f41557a = i10;
        this.f41558b = kVar;
    }

    @Override
    public final void run() {
        float f10;
        int i10;
        int i11;
        int i12 = this.f41557a;
        k kVar = this.f41558b;
        switch (i12) {
            case 0:
                kVar.t();
                return;
            default:
                boolean z4 = kVar.f41814j0;
                FrameLayout frameLayout = kVar.G;
                h hVar = kVar.f41822r;
                f fVar = kVar.f41809f;
                if (kVar.m0 != z4) {
                    kVar.m0 = z4;
                    ValueAnimator valueAnimator = kVar.f41818n0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        kVar.f41818n0 = null;
                    }
                    Utilities.Callback callback = kVar.f41812h0;
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
                    float f11 = kVar.f41816l0;
                    if (z4) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    kVar.f41818n0 = ofFloat;
                    ofFloat.addUpdateListener(new nh.e5(kVar, 12));
                    if (!z4) {
                        fVar.getEditText().setAllowDrawCursor(false);
                    }
                    kVar.f41818n0.addListener(new l61(7, kVar, z4));
                    if (z4) {
                        kVar.f41818n0.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
                        kVar.f41818n0.setDuration(250L);
                    } else {
                        kVar.f41818n0.setInterpolator(new u1.a());
                        kVar.f41818n0.setDuration(420L);
                    }
                    kVar.f41818n0.start();
                    vt editText = fVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = kVar.f41807d0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z4) {
                            i10 = fVar.f24367a.length();
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
                        kVar.f41807d0 = ofInt;
                        ofInt.setDuration(360L);
                        kVar.f41807d0.setInterpolator(nr.h);
                        kVar.f41807d0.start();
                    }
                    fVar.setSuggestionsEnabled(z4);
                    if (!z4) {
                        fVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z4 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (kVar.f41819o0 == null) {
                            kVar.f41819o0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        kVar.f41828v0 = true;
                        kVar.i(kVar.f41819o0);
                        kVar.f41828v0 = false;
                        Bitmap bitmap = kVar.f41819o0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = kVar.f41819o0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            kVar.f41820p0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = kVar.f41821q0;
                            if (matrix == null) {
                                kVar.f41821q0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            kVar.f41820p0.setLocalMatrix(kVar.f41821q0);
                            if (kVar.f41823r0 == null) {
                                Paint paint = new Paint(3);
                                kVar.f41823r0 = paint;
                                paint.setColor(-1);
                            }
                            kVar.f41823r0.setShader(kVar.f41820p0);
                            return;
                        }
                        kVar.f41819o0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
