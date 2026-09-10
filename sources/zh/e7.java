package zh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pc;
public final class e7 implements GestureDetector.OnGestureListener {
    public final u7 f48387a;

    public e7(u7 u7Var) {
        this.f48387a = u7Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        u7 u7Var = this.f48387a;
        u7Var.f48935g1 = false;
        if (u7.i(u7Var, u7Var.f48958s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        u7 u7Var = this.f48387a;
        if (u7Var.Z != 0.0f && u7Var.f48964u1 == null && f10 < -1000.0f && !u7Var.f48919a0) {
            u7Var.f48919a0 = true;
            try {
                u7Var.f48958s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            u7.j(u7Var);
        }
        if (u7Var.f48929e0 != 0.0f) {
            if (f10 < -1000.0f) {
                u7Var.n(true);
            } else if (f10 > 1000.0f) {
                u7Var.n(false);
            } else {
                if (u7Var.f48967w.f48443f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u7Var.n(z10);
            }
        }
        u7Var.f48935g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        pc pcVar;
        u7 u7Var = this.f48387a;
        if (!u7Var.f48940j0) {
            return false;
        }
        if (u7Var.f48944l0) {
            u7Var.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (u7Var.Z > dp && !u7Var.f48919a0) {
                u7Var.f48919a0 = true;
                u7.j(u7Var);
                try {
                    u7Var.f48958s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            u7Var.f48927d0 = Utilities.clamp(u7Var.Z / dp, 1.0f, 0.0f);
            if (u7Var.f48947n0.getCurrentPeerView() != null) {
                u7Var.f48947n0.getCurrentPeerView().invalidate();
            }
            if (u7Var.Z < 0.0f) {
                u7Var.Z = 0.0f;
                u7Var.f48944l0 = false;
            }
            return true;
        }
        if (u7Var.f48925c0) {
            float f12 = u7Var.f48929e0;
            if (f12 > u7Var.f48967w.f48442c && f10 > 0.0f) {
                u7Var.f48929e0 = (0.05f * f10) + f12;
            } else {
                u7Var.f48929e0 = f12 + f10;
            }
            i7 i7Var = u7Var.f48958s;
            pc pcVar2 = pc.f26074w;
            if (pcVar2 != null && pcVar2.h == i7Var) {
                pcVar2.b();
            }
            if (u7Var.f48947n0.getCurrentPeerView() != null) {
                u7Var.f48947n0.getCurrentPeerView().invalidate();
            }
            u7Var.v.invalidate();
            if (u7Var.f48929e0 < 0.0f) {
                u7Var.f48929e0 = 0.0f;
                u7Var.f48925c0 = false;
            }
            return true;
        }
        if (u7Var.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && u7Var.W > 0.0f) || (f13 < 0.0f && u7Var.W < 0.0f)) {
                f11 = 0.3f;
                u7Var.W -= f10 * f11;
                i7 i7Var2 = u7Var.f48958s;
                pcVar = pc.f26074w;
                if (pcVar != null && pcVar.h == i7Var2) {
                    pcVar.b();
                }
                u7.k(u7Var);
                return true;
            }
        }
        f11 = 0.6f;
        u7Var.W -= f10 * f11;
        i7 i7Var22 = u7Var.f48958s;
        pcVar = pc.f26074w;
        if (pcVar != null) {
            pcVar.b();
        }
        u7.k(u7Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        a3 currentPeerView;
        boolean z10;
        u7 u7Var = this.f48387a;
        if (u7Var.f48929e0 == 0.0f && u7Var.f48932f0) {
            if (!u7Var.f48970x && !u7Var.L0 && !u7Var.f48945m1 && !u7Var.f48939i1 && !u7Var.f48941j1) {
                a3 t10 = u7Var.t();
                if (t10 == null || !t10.O1.f49132f) {
                    if (motionEvent.getX() > u7Var.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a3 currentPeerView2 = u7Var.f48947n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!u7Var.f48947n0.E(z10)) {
                            if (z10) {
                                u7Var.q(true);
                                return false;
                            }
                            t7 t7Var = u7Var.f48974z0;
                            if (t7Var != null) {
                                t7Var.loopBack();
                                return false;
                            }
                        } else {
                            k7 k7Var = u7Var.f48947n0;
                            k7Var.L0 = true;
                            k7Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            sg.a1 a1Var = k7Var.M0;
                            AndroidUtilities.cancelRunOnUIThread(a1Var);
                            AndroidUtilities.runOnUIThread(a1Var, 150L);
                            return false;
                        }
                    }
                }
            } else {
                k7 k7Var2 = u7Var.f48947n0;
                if (k7Var2 != null && (currentPeerView = k7Var2.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            }
        }
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
