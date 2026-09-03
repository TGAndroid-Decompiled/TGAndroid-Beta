package qh;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p5 extends j1.b {
    public final Rect f45895o;
    public final q5 f45896p;

    public p5(q5 q5Var, q5 q5Var2) {
        super(q5Var2);
        this.f45896p = q5Var;
        this.f45895o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        q5 q5Var = this.f45896p;
        if (Math.abs(f10 - q5Var.f45937h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - q5Var.f45936g0) <= AndroidUtilities.dp(30.0f) && !q5Var.b() && !q5Var.f45948r0) {
            return 0;
        }
        if (Math.abs(f10 - q5Var.f45938i0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - q5Var.f45936g0) <= AndroidUtilities.dp(30.0f) && !q5Var.b() && !q5Var.f45948r0) {
            return 2;
        }
        if (Math.abs(f10 - q5Var.f45935f0) <= AndroidUtilities.dp(60.0f) && Math.abs(f11 - q5Var.f45936g0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        q5 q5Var = this.f45896p;
        if (!q5Var.b() && !q5Var.f45948r0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!q5Var.b() && !q5Var.f45948r0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        q5 q5Var = this.f45896p;
        if (q5Var.f45925a != null && !q5Var.f45948r0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !q5Var.b()) {
                        q5Var.d(180.0f);
                        ((x8) q5Var.f45925a).b();
                        return true;
                    }
                } else if (q5Var.b()) {
                    ((x8) q5Var.f45925a).a();
                    return true;
                } else if (q5Var.f45944o0) {
                    q5Var.f45944o0 = false;
                    q5Var.f45955w0 = false;
                    q5Var.f45950s0 = SystemClock.elapsedRealtime();
                    q5Var.f45948r0 = true;
                    ((x8) q5Var.f45925a).d(false);
                    q5Var.invalidate();
                    return true;
                } else if (q5Var.f45941l0) {
                    if (ba.d(((x8) q5Var.f45925a).f46318a)) {
                        q5Var.O = 0L;
                        q5Var.N = System.currentTimeMillis();
                        q5Var.f45957x0 = false;
                        ((x8) q5Var.f45925a).e(new org.telegram.ui.web.s0(this, 22), false);
                        return true;
                    }
                    return true;
                } else {
                    ((x8) q5Var.f45925a).c();
                    return true;
                }
            } else if (!q5Var.b()) {
                if (q5Var.f45944o0 && q5Var.f45957x0) {
                    q5Var.f45955w0 = false;
                    q5Var.D0.d(1.0f, true);
                    d3 d3Var = ((x8) q5Var.f45925a).f46318a.Q0;
                    d3Var.f45223a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    d3Var.invalidate();
                    q5Var.invalidate();
                    return true;
                }
                ba baVar = ((x8) q5Var.f45925a).f46318a;
                if (baVar.f45048c0 == 0 && !baVar.M1 && !baVar.N1 && ba.b(baVar)) {
                    baVar.f(true);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        String string;
        String string2;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46881a;
        dVar.i("android.widget.Button");
        boolean z4 = false;
        Rect rect = this.f45895o;
        q5 q5Var = this.f45896p;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    rect.set(0, 0, 1, 1);
                    dVar.h(rect);
                    dVar.p(false);
                    dVar.j("");
                    return;
                }
                int dp = AndroidUtilities.dp(22.0f);
                float f10 = q5Var.f45938i0;
                float f11 = dp;
                float f12 = q5Var.f45936g0;
                rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                dVar.h(rect);
                dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!q5Var.f45948r0 && !q5Var.b()) {
                    z4 = true;
                }
                accessibilityNodeInfo.setEnabled(z4);
                if (z4) {
                    dVar.b(s0.c.f46874c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f13 = q5Var.f45935f0;
            float f14 = dp2;
            float f15 = q5Var.f45936g0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            dVar.h(rect);
            if (q5Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (q5Var.f45944o0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (q5Var.f45941l0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            dVar.j(string2);
            accessibilityNodeInfo.setEnabled(!q5Var.f45948r0);
            if (!q5Var.f45948r0) {
                dVar.b(s0.c.f46874c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f16 = q5Var.f45937h0;
        float f17 = dp3;
        float f18 = q5Var.f45936g0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        dVar.h(rect);
        if (q5Var.f45944o0 && q5Var.f45957x0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        dVar.j(string);
        if (!q5Var.f45948r0 && !q5Var.b()) {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (z4) {
            dVar.b(s0.c.f46874c);
        }
    }
}
