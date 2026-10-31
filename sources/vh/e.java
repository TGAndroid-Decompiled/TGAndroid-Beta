package vh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.q20;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oh;
public final class e implements Runnable {
    public final int f51090a;
    public final k f51091b;

    public e(k kVar, int i10) {
        this.f51090a = i10;
        this.f51091b = kVar;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        int i11;
        int i12 = this.f51090a;
        k kVar = this.f51091b;
        switch (i12) {
            case 0:
                kVar.t();
                return;
            default:
                boolean z10 = kVar.f51347l0;
                FrameLayout frameLayout = kVar.J;
                h hVar = kVar.f51353r;
                f fVar = kVar.f51340f;
                if (kVar.f51350o0 != z10) {
                    kVar.f51350o0 = z10;
                    ValueAnimator valueAnimator = kVar.f51351p0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        kVar.f51351p0 = null;
                    }
                    q20 q20Var = kVar.f51345j0;
                    if (q20Var != null) {
                        q20Var.a(Boolean.valueOf(z10));
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
                    float f10 = kVar.f51349n0;
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    kVar.f51351p0 = ofFloat;
                    ofFloat.addUpdateListener(new qh.e0(kVar, 24));
                    if (!z10) {
                        fVar.getEditText().setAllowDrawCursor(false);
                    }
                    kVar.f51351p0.addListener(new sg.y(8, kVar, z10));
                    if (z10) {
                        kVar.f51351p0.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
                        kVar.f51351p0.setDuration(250L);
                    } else {
                        kVar.f51351p0.setInterpolator(new u1.a());
                        kVar.f51351p0.setDuration(420L);
                    }
                    kVar.f51351p0.start();
                    mt editText = fVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = kVar.f51341f0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i10 = fVar.f32239a.length();
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
                        kVar.f51341f0 = ofInt;
                        ofInt.setDuration(360L);
                        kVar.f51341f0.setInterpolator(gr.h);
                        kVar.f51341f0.start();
                    }
                    fVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        fVar.getEditText().j(false, true);
                    }
                    if (z10 && tz.o() >= 1 && !sc.f()) {
                        if (kVar.f51352q0 == null) {
                            kVar.f51352q0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        kVar.f51363x0 = true;
                        kVar.i(kVar.f51352q0);
                        kVar.f51363x0 = false;
                        Bitmap bitmap = kVar.f51352q0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = kVar.f51352q0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            kVar.f51354r0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = kVar.f51356s0;
                            if (matrix == null) {
                                kVar.f51356s0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            kVar.f51354r0.setLocalMatrix(kVar.f51356s0);
                            if (kVar.f51357t0 == null) {
                                Paint paint = new Paint(3);
                                kVar.f51357t0 = paint;
                                paint.setColor(-1);
                            }
                            kVar.f51357t0.setShader(kVar.f51354r0);
                            return;
                        }
                        kVar.f51352q0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
