package ph;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s5 extends j1.b {
    public final Rect f42307o;
    public final t5 f42308p;

    public s5(t5 t5Var, t5 t5Var2) {
        super(t5Var2);
        this.f42308p = t5Var;
        this.f42307o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        t5 t5Var = this.f42308p;
        if (Math.abs(f10 - t5Var.f42343h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - t5Var.f42342g0) <= AndroidUtilities.dp(30.0f) && !t5Var.b() && !t5Var.f42354r0) {
            return 0;
        }
        if (Math.abs(f10 - t5Var.f42344i0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - t5Var.f42342g0) <= AndroidUtilities.dp(30.0f) && !t5Var.b() && !t5Var.f42354r0) {
            return 2;
        }
        if (Math.abs(f10 - t5Var.f42341f0) <= AndroidUtilities.dp(60.0f) && Math.abs(f11 - t5Var.f42342g0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        t5 t5Var = this.f42308p;
        if (!t5Var.b() && !t5Var.f42354r0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!t5Var.b() && !t5Var.f42354r0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        t5 t5Var = this.f42308p;
        if (t5Var.f42332a != null && !t5Var.f42354r0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !t5Var.b()) {
                        t5Var.d(180.0f);
                        ((a9) t5Var.f42332a).b();
                        return true;
                    }
                } else if (t5Var.b()) {
                    ((a9) t5Var.f42332a).a();
                    return true;
                } else if (t5Var.f42350o0) {
                    t5Var.f42350o0 = false;
                    t5Var.f42361w0 = false;
                    t5Var.f42356s0 = SystemClock.elapsedRealtime();
                    t5Var.f42354r0 = true;
                    ((a9) t5Var.f42332a).d(false);
                    t5Var.invalidate();
                    return true;
                } else if (t5Var.f42347l0) {
                    if (da.d(((a9) t5Var.f42332a).f41281a)) {
                        t5Var.O = 0L;
                        t5Var.N = System.currentTimeMillis();
                        t5Var.f42363x0 = false;
                        ((a9) t5Var.f42332a).e(new org.telegram.ui.web.o0(this, 21), false);
                        return true;
                    }
                    return true;
                } else {
                    ((a9) t5Var.f42332a).c();
                    return true;
                }
            } else if (!t5Var.b()) {
                if (t5Var.f42350o0 && t5Var.f42363x0) {
                    t5Var.f42361w0 = false;
                    t5Var.D0.d(1.0f, true);
                    e3 e3Var = ((a9) t5Var.f42332a).f41281a.Q0;
                    e3Var.f41564a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    e3Var.invalidate();
                    t5Var.invalidate();
                    return true;
                }
                da daVar = ((a9) t5Var.f42332a).f41281a;
                if (daVar.f41480c0 == 0 && !daVar.M1 && !daVar.N1 && da.b(daVar)) {
                    daVar.f(true);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.e eVar) {
        String string;
        String string2;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f43904a;
        eVar.i("android.widget.Button");
        boolean z4 = false;
        Rect rect = this.f42307o;
        t5 t5Var = this.f42308p;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    rect.set(0, 0, 1, 1);
                    eVar.h(rect);
                    eVar.p(false);
                    eVar.j("");
                    return;
                }
                int dp = AndroidUtilities.dp(22.0f);
                float f10 = t5Var.f42344i0;
                float f11 = dp;
                float f12 = t5Var.f42342g0;
                rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                eVar.h(rect);
                eVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!t5Var.f42354r0 && !t5Var.b()) {
                    z4 = true;
                }
                accessibilityNodeInfo.setEnabled(z4);
                if (z4) {
                    eVar.b(s0.c.f43897c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f13 = t5Var.f42341f0;
            float f14 = dp2;
            float f15 = t5Var.f42342g0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            eVar.h(rect);
            if (t5Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (t5Var.f42350o0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (t5Var.f42347l0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            eVar.j(string2);
            accessibilityNodeInfo.setEnabled(!t5Var.f42354r0);
            if (!t5Var.f42354r0) {
                eVar.b(s0.c.f43897c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f16 = t5Var.f42343h0;
        float f17 = dp3;
        float f18 = t5Var.f42342g0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        eVar.h(rect);
        if (t5Var.f42350o0 && t5Var.f42363x0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        eVar.j(string);
        if (!t5Var.f42354r0 && !t5Var.b()) {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (z4) {
            eVar.b(s0.c.f43897c);
        }
    }
}
