package ph;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r5 extends j1.b {
    public final Rect f42286o;
    public final s5 f42287p;

    public r5(s5 s5Var, s5 s5Var2) {
        super(s5Var2);
        this.f42287p = s5Var;
        this.f42286o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        s5 s5Var = this.f42287p;
        if (Math.abs(f10 - s5Var.f42349h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - s5Var.f42348g0) <= AndroidUtilities.dp(30.0f) && !s5Var.b() && !s5Var.f42360r0) {
            return 0;
        }
        if (Math.abs(f10 - s5Var.f42350i0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - s5Var.f42348g0) <= AndroidUtilities.dp(30.0f) && !s5Var.b() && !s5Var.f42360r0) {
            return 2;
        }
        if (Math.abs(f10 - s5Var.f42347f0) <= AndroidUtilities.dp(60.0f) && Math.abs(f11 - s5Var.f42348g0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        s5 s5Var = this.f42287p;
        if (!s5Var.b() && !s5Var.f42360r0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!s5Var.b() && !s5Var.f42360r0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        s5 s5Var = this.f42287p;
        if (s5Var.f42338a != null && !s5Var.f42360r0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !s5Var.b()) {
                        s5Var.d(180.0f);
                        ((a9) s5Var.f42338a).b();
                        return true;
                    }
                } else if (s5Var.b()) {
                    ((a9) s5Var.f42338a).a();
                    return true;
                } else if (s5Var.f42356o0) {
                    s5Var.f42356o0 = false;
                    s5Var.f42367w0 = false;
                    s5Var.f42362s0 = SystemClock.elapsedRealtime();
                    s5Var.f42360r0 = true;
                    ((a9) s5Var.f42338a).d(false);
                    s5Var.invalidate();
                    return true;
                } else if (s5Var.f42353l0) {
                    if (da.d(((a9) s5Var.f42338a).f41310a)) {
                        s5Var.O = 0L;
                        s5Var.N = System.currentTimeMillis();
                        s5Var.f42369x0 = false;
                        ((a9) s5Var.f42338a).e(new org.telegram.ui.web.q0(this, 21), false);
                        return true;
                    }
                    return true;
                } else {
                    ((a9) s5Var.f42338a).c();
                    return true;
                }
            } else if (!s5Var.b()) {
                if (s5Var.f42356o0 && s5Var.f42369x0) {
                    s5Var.f42367w0 = false;
                    s5Var.D0.d(1.0f, true);
                    e3 e3Var = ((a9) s5Var.f42338a).f41310a.Q0;
                    e3Var.f41602a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    e3Var.invalidate();
                    s5Var.invalidate();
                    return true;
                }
                da daVar = ((a9) s5Var.f42338a).f41310a;
                if (daVar.f41518c0 == 0 && !daVar.M1 && !daVar.N1 && da.b(daVar)) {
                    daVar.f(true);
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
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f43969a;
        dVar.i("android.widget.Button");
        boolean z4 = false;
        Rect rect = this.f42286o;
        s5 s5Var = this.f42287p;
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
                float f10 = s5Var.f42350i0;
                float f11 = dp;
                float f12 = s5Var.f42348g0;
                rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                dVar.h(rect);
                dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!s5Var.f42360r0 && !s5Var.b()) {
                    z4 = true;
                }
                accessibilityNodeInfo.setEnabled(z4);
                if (z4) {
                    dVar.b(s0.c.f43963c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f13 = s5Var.f42347f0;
            float f14 = dp2;
            float f15 = s5Var.f42348g0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            dVar.h(rect);
            if (s5Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (s5Var.f42356o0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (s5Var.f42353l0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            dVar.j(string2);
            accessibilityNodeInfo.setEnabled(!s5Var.f42360r0);
            if (!s5Var.f42360r0) {
                dVar.b(s0.c.f43963c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f16 = s5Var.f42349h0;
        float f17 = dp3;
        float f18 = s5Var.f42348g0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        dVar.h(rect);
        if (s5Var.f42356o0 && s5Var.f42369x0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        dVar.j(string);
        if (!s5Var.f42360r0 && !s5Var.b()) {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (z4) {
            dVar.b(s0.c.f43963c);
        }
    }
}
