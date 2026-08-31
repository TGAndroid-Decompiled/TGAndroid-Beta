package qh;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q5 extends j1.b {
    public final Rect f45913o;
    public final r5 f45914p;

    public q5(r5 r5Var, r5 r5Var2) {
        super(r5Var2);
        this.f45914p = r5Var;
        this.f45913o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        r5 r5Var = this.f45914p;
        if (Math.abs(f10 - r5Var.f45958h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - r5Var.f45957g0) <= AndroidUtilities.dp(30.0f) && !r5Var.b() && !r5Var.f45969r0) {
            return 0;
        }
        if (Math.abs(f10 - r5Var.f45959i0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - r5Var.f45957g0) <= AndroidUtilities.dp(30.0f) && !r5Var.b() && !r5Var.f45969r0) {
            return 2;
        }
        if (Math.abs(f10 - r5Var.f45956f0) <= AndroidUtilities.dp(60.0f) && Math.abs(f11 - r5Var.f45957g0) <= AndroidUtilities.dp(60.0f)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        r5 r5Var = this.f45914p;
        if (!r5Var.b() && !r5Var.f45969r0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (!r5Var.b() && !r5Var.f45969r0) {
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        r5 r5Var = this.f45914p;
        if (r5Var.f45946a != null && !r5Var.f45969r0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 && !r5Var.b()) {
                        r5Var.d(180.0f);
                        ((y8) r5Var.f45946a).b();
                        return true;
                    }
                } else if (r5Var.b()) {
                    ((y8) r5Var.f45946a).a();
                    return true;
                } else if (r5Var.f45965o0) {
                    r5Var.f45965o0 = false;
                    r5Var.f45976w0 = false;
                    r5Var.f45971s0 = SystemClock.elapsedRealtime();
                    r5Var.f45969r0 = true;
                    ((y8) r5Var.f45946a).d(false);
                    r5Var.invalidate();
                    return true;
                } else if (r5Var.f45962l0) {
                    if (ca.d(((y8) r5Var.f45946a).f46362a)) {
                        r5Var.O = 0L;
                        r5Var.N = System.currentTimeMillis();
                        r5Var.f45978x0 = false;
                        ((y8) r5Var.f45946a).e(new org.telegram.ui.web.s0(this, 22), false);
                        return true;
                    }
                    return true;
                } else {
                    ((y8) r5Var.f45946a).c();
                    return true;
                }
            } else if (!r5Var.b()) {
                if (r5Var.f45965o0 && r5Var.f45978x0) {
                    r5Var.f45976w0 = false;
                    r5Var.D0.d(1.0f, true);
                    e3 e3Var = ((y8) r5Var.f45946a).f46362a.Q0;
                    e3Var.f45242a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                    e3Var.invalidate();
                    r5Var.invalidate();
                    return true;
                }
                ca caVar = ((y8) r5Var.f45946a).f46362a;
                if (caVar.f45082c0 == 0 && !caVar.M1 && !caVar.N1 && ca.b(caVar)) {
                    caVar.f(true);
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
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46850a;
        dVar.i("android.widget.Button");
        boolean z4 = false;
        Rect rect = this.f45913o;
        r5 r5Var = this.f45914p;
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
                float f10 = r5Var.f45959i0;
                float f11 = dp;
                float f12 = r5Var.f45957g0;
                rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                dVar.h(rect);
                dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!r5Var.f45969r0 && !r5Var.b()) {
                    z4 = true;
                }
                accessibilityNodeInfo.setEnabled(z4);
                if (z4) {
                    dVar.b(s0.c.f46843c);
                    return;
                }
                return;
            }
            int dp2 = AndroidUtilities.dp(40.0f);
            float f13 = r5Var.f45956f0;
            float f14 = dp2;
            float f15 = r5Var.f45957g0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            dVar.h(rect);
            if (r5Var.b()) {
                string2 = LocaleController.getString(R.string.Send);
            } else if (r5Var.f45965o0) {
                string2 = LocaleController.getString(R.string.AccDescrStopRecording);
            } else if (r5Var.f45962l0) {
                string2 = LocaleController.getString(R.string.AccDescrStartRecording);
            } else {
                string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
            }
            dVar.j(string2);
            accessibilityNodeInfo.setEnabled(!r5Var.f45969r0);
            if (!r5Var.f45969r0) {
                dVar.b(s0.c.f46843c);
                return;
            }
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f16 = r5Var.f45958h0;
        float f17 = dp3;
        float f18 = r5Var.f45957g0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        dVar.h(rect);
        if (r5Var.f45965o0 && r5Var.f45978x0) {
            string = LocaleController.getString(R.string.AccDescrLockRecording);
        } else {
            string = LocaleController.getString(R.string.AccDescrCameraGallery);
        }
        dVar.j(string);
        if (!r5Var.f45969r0 && !r5Var.b()) {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (z4) {
            dVar.b(s0.c.f46843c);
        }
    }
}
