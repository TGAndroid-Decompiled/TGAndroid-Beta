package th;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.wb;
public final class y6 implements GestureDetector.OnGestureListener {
    public final o7 f49685a;

    public y6(o7 o7Var) {
        this.f49685a = o7Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        o7 o7Var = this.f49685a;
        o7Var.f49307g1 = false;
        if (o7.u(o7Var, o7Var.f49330s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        o7 o7Var = this.f49685a;
        if (o7Var.Z != 0.0f && o7Var.f49336u1 == null && f10 < -1000.0f && !o7Var.f49291a0) {
            o7Var.f49291a0 = true;
            try {
                o7Var.f49330s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            o7.v(o7Var);
        }
        if (o7Var.f49301e0 != 0.0f) {
            if (f10 < -1000.0f) {
                o7Var.A(true);
            } else if (f10 > 1000.0f) {
                o7Var.A(false);
            } else {
                if (o7Var.f49342x.f48964f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o7Var.A(z10);
            }
        }
        o7Var.f49307g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        wb wbVar;
        o7 o7Var = this.f49685a;
        if (!o7Var.f49312j0) {
            return false;
        }
        if (o7Var.f49316l0) {
            o7Var.Z += f10;
            float L = org.telegram.messenger.i0.L(200.0f);
            if (o7Var.Z > L && !o7Var.f49291a0) {
                o7Var.f49291a0 = true;
                o7.v(o7Var);
                try {
                    o7Var.f49330s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            o7Var.f49299d0 = Utilities.i(o7Var.Z / L, 1.0f, 0.0f);
            if (o7Var.f49319n0.getCurrentPeerView() != null) {
                o7Var.f49319n0.getCurrentPeerView().invalidate();
            }
            if (o7Var.Z < 0.0f) {
                o7Var.Z = 0.0f;
                o7Var.f49316l0 = false;
            }
            return true;
        }
        if (o7Var.f49297c0) {
            float f12 = o7Var.f49301e0;
            if (f12 > o7Var.f49342x.f48963c && f10 > 0.0f) {
                o7Var.f49301e0 = (0.05f * f10) + f12;
            } else {
                o7Var.f49301e0 = f12 + f10;
            }
            c7 c7Var = o7Var.f49330s;
            wb wbVar2 = wb.f32128w;
            if (wbVar2 != null && wbVar2.h == c7Var) {
                wbVar2.b();
            }
            if (o7Var.f49319n0.getCurrentPeerView() != null) {
                o7Var.f49319n0.getCurrentPeerView().invalidate();
            }
            o7Var.f49339w.invalidate();
            if (o7Var.f49301e0 < 0.0f) {
                o7Var.f49301e0 = 0.0f;
                o7Var.f49297c0 = false;
            }
            return true;
        }
        if (o7Var.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && o7Var.W > 0.0f) || (f13 < 0.0f && o7Var.W < 0.0f)) {
                f11 = 0.3f;
                o7Var.W -= f10 * f11;
                c7 c7Var2 = o7Var.f49330s;
                wbVar = wb.f32128w;
                if (wbVar != null && wbVar.h == c7Var2) {
                    wbVar.b();
                }
                o7.w(o7Var);
                return true;
            }
        }
        f11 = 0.6f;
        o7Var.W -= f10 * f11;
        c7 c7Var22 = o7Var.f49330s;
        wbVar = wb.f32128w;
        if (wbVar != null) {
            wbVar.b();
        }
        o7.w(o7Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        z2 currentPeerView;
        boolean z10;
        o7 o7Var = this.f49685a;
        if (o7Var.f49301e0 == 0.0f && o7Var.f49304f0) {
            if (!o7Var.f49344y && !o7Var.L0 && !o7Var.f49317m1 && !o7Var.f49311i1 && !o7Var.f49313j1) {
                z2 H = o7Var.H();
                if (H == null || !H.f49776x1.f49664f) {
                    if (motionEvent.getX() > o7Var.f49339w.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z2 currentPeerView2 = o7Var.f49319n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (!o7Var.f49319n0.E(z10)) {
                            if (z10) {
                                o7Var.D(true);
                                return false;
                            }
                            n7 n7Var = o7Var.f49346z0;
                            if (n7Var != null) {
                                n7Var.loopBack();
                                return false;
                            }
                        } else {
                            e7 e7Var = o7Var.f49319n0;
                            e7Var.L0 = true;
                            e7Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            ew ewVar = e7Var.M0;
                            org.telegram.messenger.i0.r(ewVar);
                            org.telegram.messenger.i0.h3(ewVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                e7 e7Var2 = o7Var.f49319n0;
                if (e7Var2 != null && (currentPeerView = e7Var2.getCurrentPeerView()) != null) {
                    currentPeerView.q0();
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
