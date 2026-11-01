package vh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.r20;
import org.telegram.messenger.tc;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oh;
public final class e implements Runnable {
    public final int f51105a;
    public final k f51106b;

    public e(k kVar, int i10) {
        this.f51105a = i10;
        this.f51106b = kVar;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        int i11;
        int i12 = this.f51105a;
        k kVar = this.f51106b;
        switch (i12) {
            case 0:
                kVar.t();
                return;
            default:
                boolean z10 = kVar.f51362l0;
                FrameLayout frameLayout = kVar.J;
                h hVar = kVar.f51368r;
                f fVar = kVar.f51355f;
                if (kVar.f51365o0 != z10) {
                    kVar.f51365o0 = z10;
                    ValueAnimator valueAnimator = kVar.f51366p0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        kVar.f51366p0 = null;
                    }
                    r20 r20Var = kVar.f51360j0;
                    if (r20Var != null) {
                        r20Var.a(Boolean.valueOf(z10));
                    }
                    kVar.d(z10);
                    if (z10) {
                        oh ohVar = kVar.M;
                        if (ohVar != null) {
                            ohVar.setVisibility(0);
                        }
                        hVar.setVisibility(0);
                    } else {
                        fVar.getEditText().scrollBy(0, -fVar.getEditText().getScrollY());
                    }
                    float f10 = kVar.f51364n0;
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    kVar.f51366p0 = ofFloat;
                    ofFloat.addUpdateListener(new qh.e0(kVar, 24));
                    if (!z10) {
                        fVar.getEditText().setAllowDrawCursor(false);
                    }
                    kVar.f51366p0.addListener(new sg.y(8, kVar, z10));
                    if (z10) {
                        kVar.f51366p0.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                        kVar.f51366p0.setDuration(250L);
                    } else {
                        kVar.f51366p0.setInterpolator(new u1.a());
                        kVar.f51366p0.setDuration(420L);
                    }
                    kVar.f51366p0.start();
                    mt editText = fVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = kVar.f51356f0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i10 = fVar.f32308a.length();
                        } else {
                            i10 = 0;
                        }
                        fVar.setSelection(i10);
                        fVar.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z10) {
                            i11 = lineTop - height;
                        } else {
                            i11 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i11);
                        kVar.f51356f0 = ofInt;
                        ofInt.setDuration(360L);
                        kVar.f51356f0.setInterpolator(gr.h);
                        kVar.f51356f0.start();
                    }
                    fVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        fVar.getEditText().j(false, true);
                    }
                    if (z10 && uz.o() >= 1 && !tc.f()) {
                        if (kVar.f51367q0 == null) {
                            kVar.f51367q0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        kVar.f51378x0 = true;
                        kVar.i(kVar.f51367q0);
                        kVar.f51378x0 = false;
                        Bitmap bitmap = kVar.f51367q0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = kVar.f51367q0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            kVar.f51369r0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = kVar.f51371s0;
                            if (matrix == null) {
                                kVar.f51371s0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            kVar.f51369r0.setLocalMatrix(kVar.f51371s0);
                            if (kVar.f51372t0 == null) {
                                Paint paint = new Paint(3);
                                kVar.f51372t0 = paint;
                                paint.setColor(-1);
                            }
                            kVar.f51372t0.setShader(kVar.f51369r0);
                            return;
                        }
                        kVar.f51367q0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
