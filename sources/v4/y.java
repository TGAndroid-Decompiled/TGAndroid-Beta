package v4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.uy;
public class y extends m0 implements p0 {
    public int E;
    public int G;
    public RecyclerView H;
    public VelocityTracker J;
    public ArrayList K;
    public ArrayList L;
    public uy N;
    public w O;
    public Rect Q;
    public long R;
    public float d;
    public float f57197e;
    public float f57198f;
    public float h;
    public float f57199n;
    public float f57200r;
    public float f57201s;
    public float f57202w;
    public final v f57204y;
    public final ArrayList f57194a = new ArrayList();
    public final float[] f57195b = new float[2];
    public d1 f57196c = null;
    public int f57203x = -1;
    public int D = 0;
    public final ArrayList F = new ArrayList();
    public final tg.y I = new tg.y(this, 4);
    public View M = null;
    public final ij0 P = new ij0(this);

    public y(v vVar) {
        this.f57204y = vVar;
    }

    public static boolean o(View view, float f10, float f11, float f12, float f13) {
        if (f10 >= f12 && f10 <= f12 + view.getWidth() && f11 >= f13 && f11 <= f13 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(View view) {
        q(view);
        d1 T = this.H.T(view);
        if (T != null) {
            d1 d1Var = this.f57196c;
            if (d1Var != null && T == d1Var) {
                r(null, 0);
                return;
            }
            l(T, false);
            if (this.f57194a.remove(T.f57052a)) {
                this.f57204y.a(this.H, T);
            }
        }
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, a1 a1Var) {
        rect.setEmpty();
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        if (this.f57196c != null) {
            float[] fArr = this.f57195b;
            n(fArr);
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        d1 d1Var = this.f57196c;
        int i7 = this.D;
        v vVar = this.f57204y;
        vVar.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) arrayList.get(i10);
            d1 d1Var2 = uVar.f57172e;
            float f13 = uVar.f57169a;
            float f14 = uVar.f57171c;
            if (f13 == f14) {
                uVar.f57175r = d1Var2.f57052a.getTranslationX();
            } else {
                uVar.f57175r = com.google.android.recaptcha.internal.a.z(f14, f13, uVar.f57179y, f13);
            }
            float f15 = uVar.f57170b;
            float f16 = uVar.d;
            if (f15 == f16) {
                uVar.f57176s = d1Var2.f57052a.getTranslationY();
            } else {
                uVar.f57176s = com.google.android.recaptcha.internal.a.z(f16, f15, uVar.f57179y, f15);
            }
            int save = canvas.save();
            vVar.m(canvas, recyclerView, uVar.f57172e, uVar.f57175r, uVar.f57176s, uVar.f57173f, false);
            canvas.restoreToCount(save);
        }
        if (d1Var != null) {
            int save2 = canvas.save();
            vVar.m(canvas, recyclerView, d1Var, f11, f10, i7, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        boolean z9 = false;
        if (this.f57196c != null) {
            float[] fArr = this.f57195b;
            n(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        d1 d1Var = this.f57196c;
        this.f57204y.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            int save = canvas.save();
            View view = ((u) arrayList.get(i7)).f57172e.f57052a;
            canvas.restoreToCount(save);
        }
        if (d1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i10 = size - 1; i10 >= 0; i10--) {
            u uVar = (u) arrayList.get(i10);
            boolean z10 = uVar.f57178x;
            if (z10 && !uVar.f57174n) {
                arrayList.remove(i10);
            } else if (!z10) {
                z9 = true;
            }
        }
        if (z9) {
            recyclerView.invalidate();
        }
    }

    public final void h(pj0 pj0Var) {
        RecyclerView recyclerView = this.H;
        if (recyclerView != pj0Var) {
            ij0 ij0Var = this.P;
            if (recyclerView != null) {
                recyclerView.q0(this);
                RecyclerView recyclerView2 = this.H;
                recyclerView2.E.remove(ij0Var);
                if (recyclerView2.F == ij0Var) {
                    recyclerView2.F = null;
                }
                ArrayList arrayList = this.H.P;
                if (arrayList != null) {
                    arrayList.remove(this);
                }
                ArrayList arrayList2 = this.F;
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f57204y.a(this.H, ((u) arrayList2.get(0)).f57172e);
                }
                arrayList2.clear();
                this.M = null;
                VelocityTracker velocityTracker = this.J;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.J = null;
                }
                w wVar = this.O;
                if (wVar != null) {
                    wVar.f57191a = false;
                    this.O = null;
                }
                if (this.N != null) {
                    this.N = null;
                }
            }
            this.H = pj0Var;
            if (pj0Var != null) {
                pj0Var.getResources();
                this.f57198f = org.telegram.messenger.g0.L(120.0f);
                this.h = org.telegram.messenger.g0.L(800.0f);
                this.G = ViewConfiguration.get(this.H.getContext()).getScaledTouchSlop();
                this.H.i(this);
                this.H.E.add(ij0Var);
                RecyclerView recyclerView3 = this.H;
                if (recyclerView3.P == null) {
                    recyclerView3.P = new ArrayList();
                }
                recyclerView3.P.add(this);
                this.O = new w(this);
                this.N = new uy(this.H.getContext(), this.O);
            }
        }
    }

    public final int i(d1 d1Var, int i7) {
        int i10;
        if ((i7 & 12) != 0) {
            int i11 = 4;
            if (this.f57199n > 0.0f) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            VelocityTracker velocityTracker = this.J;
            v vVar = this.f57204y;
            if (velocityTracker != null && this.f57203x > -1) {
                velocityTracker.computeCurrentVelocity(1000, vVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f57203x);
                float yVelocity = this.J.getYVelocity(this.f57203x);
                if (xVelocity > 0.0f) {
                    i11 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i11 & i7) != 0 && i10 == i11 && abs >= vVar.f(this.f57198f) && abs > Math.abs(yVelocity)) {
                    return i11;
                }
            }
            float g10 = vVar.g() * this.H.getWidth();
            if ((i7 & i10) != 0 && Math.abs(this.f57199n) > g10) {
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public final void j(int i7, int i10, MotionEvent motionEvent) {
        View m10;
        if (this.f57196c == null && i7 == 2 && this.D != 2) {
            v vVar = this.f57204y;
            if (vVar.j() && this.H.getScrollState() != 1) {
                n0 layoutManager = this.H.getLayoutManager();
                int i11 = this.f57203x;
                d1 d1Var = null;
                if (i11 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f57197e);
                    float f10 = this.G;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (m10 = m(motionEvent)) != null))) {
                        d1Var = this.H.T(m10);
                    }
                }
                if (d1Var != null) {
                    RecyclerView recyclerView = this.H;
                    int e10 = vVar.e(recyclerView, d1Var);
                    WeakHashMap weakHashMap = r0.i0.f54202a;
                    int b10 = (vVar.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x10 = motionEvent.getX(i10);
                        float y10 = motionEvent.getY(i10);
                        float f11 = x10 - this.d;
                        float f12 = y10 - this.f57197e;
                        float abs3 = Math.abs(f11);
                        float abs4 = Math.abs(f12);
                        float f13 = this.G;
                        if (abs3 >= f13 || abs4 >= f13) {
                            if (abs3 > abs4) {
                                if (f11 >= 0.0f || (b10 & 4) != 0) {
                                    if (f11 > 0.0f && (b10 & 8) == 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else if (f12 >= 0.0f || (b10 & 1) != 0) {
                                if (f12 > 0.0f && (b10 & 2) == 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                            this.f57200r = 0.0f;
                            this.f57199n = 0.0f;
                            this.f57203x = motionEvent.getPointerId(0);
                            r(d1Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int k(d1 d1Var, int i7) {
        int i10;
        if ((i7 & 3) != 0) {
            int i11 = 1;
            if (this.f57200r > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            VelocityTracker velocityTracker = this.J;
            v vVar = this.f57204y;
            if (velocityTracker != null && this.f57203x > -1) {
                velocityTracker.computeCurrentVelocity(1000, vVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f57203x);
                float yVelocity = this.J.getYVelocity(this.f57203x);
                if (yVelocity > 0.0f) {
                    i11 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i11 & i7) != 0 && i11 == i10 && abs >= vVar.f(this.f57198f) && abs > Math.abs(xVelocity)) {
                    return i11;
                }
            }
            float g10 = vVar.g() * this.H.getHeight();
            if ((i7 & i10) != 0 && Math.abs(this.f57200r) > g10) {
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public final void l(d1 d1Var, boolean z9) {
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar.f57172e == d1Var) {
                uVar.f57177w |= z9;
                if (!uVar.f57178x) {
                    uVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        d1 d1Var = this.f57196c;
        if (d1Var != null) {
            View view = d1Var.f57052a;
            if (o(view, x10, y10, this.f57201s + this.f57199n, this.f57202w + this.f57200r)) {
                return view;
            }
        }
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            View view2 = uVar.f57172e.f57052a;
            if (o(view2, x10, y10, uVar.f57175r, uVar.f57176s)) {
                return view2;
            }
        }
        return this.H.E(x10, y10);
    }

    public final void n(float[] fArr) {
        if ((this.E & 12) != 0) {
            fArr[0] = (this.f57201s + this.f57199n) - this.f57196c.f57052a.getLeft();
        } else {
            fArr[0] = this.f57196c.f57052a.getTranslationX();
        }
        if ((this.E & 3) != 0) {
            fArr[1] = (this.f57202w + this.f57200r) - this.f57196c.f57052a.getTop();
        } else {
            fArr[1] = this.f57196c.f57052a.getTranslationY();
        }
    }

    public final void p(d1 d1Var) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i7;
        View view;
        int i10;
        int i11;
        if (!this.H.isLayoutRequested() && this.D == 2) {
            v vVar = this.f57204y;
            vVar.getClass();
            int i12 = (int) (this.f57201s + this.f57199n);
            int i13 = (int) (this.f57202w + this.f57200r);
            View view2 = d1Var.f57052a;
            if (Math.abs(i13 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i12 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.K;
                if (arrayList2 == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.L.clear();
                }
                int round = Math.round(this.f57201s + this.f57199n);
                int round2 = Math.round(this.f57202w + this.f57200r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i14 = (round + width) / 2;
                int i15 = (round2 + height) / 2;
                n0 layoutManager = this.H.getLayoutManager();
                int r10 = layoutManager.r();
                int i16 = 0;
                while (i16 < r10) {
                    View q10 = layoutManager.q(i16);
                    if (q10 == view2) {
                        i7 = i16;
                    } else {
                        i7 = i16;
                        if (q10.getBottom() >= round2 && q10.getTop() <= height && q10.getRight() >= round && q10.getLeft() <= width) {
                            d1 T = this.H.T(q10);
                            int abs5 = Math.abs(i14 - ((q10.getRight() + q10.getLeft()) / 2));
                            int abs6 = Math.abs(i15 - ((q10.getBottom() + q10.getTop()) / 2));
                            int i17 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.K.size();
                            i10 = round;
                            i11 = i12;
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < size) {
                                int i20 = size;
                                if (i17 <= ((Integer) this.L.get(i18)).intValue()) {
                                    break;
                                }
                                i19++;
                                i18++;
                                size = i20;
                            }
                            this.K.add(i19, T);
                            this.L.add(i19, Integer.valueOf(i17));
                            i16 = i7 + 1;
                            view2 = view;
                            round = i10;
                            i12 = i11;
                        }
                    }
                    view = view2;
                    i10 = round;
                    i11 = i12;
                    i16 = i7 + 1;
                    view2 = view;
                    round = i10;
                    i12 = i11;
                }
                View view3 = view2;
                int i21 = i12;
                ArrayList arrayList3 = this.K;
                if (arrayList3.size() != 0) {
                    int width2 = view3.getWidth() + i21;
                    int height2 = view3.getHeight() + i13;
                    int left2 = i21 - view3.getLeft();
                    int top2 = i13 - view3.getTop();
                    int size2 = arrayList3.size();
                    d1 d1Var2 = null;
                    int i22 = -1;
                    int i23 = 0;
                    while (i23 < size2) {
                        d1 d1Var3 = (d1) arrayList3.get(i23);
                        if (left2 > 0 && (right = d1Var3.f57052a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (d1Var3.f57052a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i22) {
                                i22 = abs4;
                                d1Var2 = d1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = d1Var3.f57052a.getLeft() - i21) > 0 && d1Var3.f57052a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i22) {
                            i22 = abs3;
                            d1Var2 = d1Var3;
                        }
                        if (top2 < 0 && (top = d1Var3.f57052a.getTop() - i13) > 0 && d1Var3.f57052a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i22) {
                            i22 = abs2;
                            d1Var2 = d1Var3;
                        }
                        if (top2 > 0 && (bottom = d1Var3.f57052a.getBottom() - height2) < 0 && d1Var3.f57052a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i22) {
                            i22 = abs;
                            d1Var2 = d1Var3;
                        }
                        i23++;
                        arrayList3 = arrayList;
                    }
                    if (d1Var2 == null) {
                        this.K.clear();
                        this.L.clear();
                        return;
                    }
                    int b10 = d1Var2.b();
                    d1Var.b();
                    if (vVar.n(this.H, d1Var, d1Var2)) {
                        this.f57204y.o(this.H, d1Var, d1Var2, b10, i21, i13);
                    }
                }
            }
        }
    }

    public final void q(View view) {
        if (view == this.M) {
            this.M = null;
        }
    }

    public final void r(v4.d1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: v4.y.r(v4.d1, int):void");
    }

    public boolean s() {
        return false;
    }

    public final void t(d1 d1Var) {
        RecyclerView recyclerView = this.H;
        v vVar = this.f57204y;
        int e10 = vVar.e(recyclerView, d1Var);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        if ((vVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (d1Var.f57052a.getParent() != this.H) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.J = VelocityTracker.obtain();
            this.f57200r = 0.0f;
            this.f57199n = 0.0f;
            r(d1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void u(int i7, int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i10);
        float y10 = motionEvent.getY(i10);
        float f10 = x10 - this.d;
        this.f57199n = f10;
        this.f57200r = y10 - this.f57197e;
        if ((i7 & 4) == 0) {
            this.f57199n = Math.max(0.0f, f10);
        }
        if ((i7 & 8) == 0) {
            this.f57199n = Math.min(0.0f, this.f57199n);
        }
        if ((i7 & 1) == 0) {
            this.f57200r = Math.max(0.0f, this.f57200r);
        }
        if ((i7 & 2) == 0) {
            this.f57200r = Math.min(0.0f, this.f57200r);
        }
    }

    @Override
    public final void b() {
    }
}
