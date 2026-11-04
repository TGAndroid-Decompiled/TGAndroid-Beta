package u4;

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
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.y00;
public class y extends n0 implements q0 {
    public int F;
    public int H;
    public RecyclerView I;
    public VelocityTracker K;
    public ArrayList L;
    public ArrayList M;
    public y00 O;
    public w P;
    public Rect R;
    public long S;
    public float d;
    public float f55680e;
    public float f55681f;
    public float h;
    public float f55682n;
    public float f55683r;
    public float f55684s;
    public float f55685w;
    public final v f55687y;
    public final ArrayList f55677a = new ArrayList();
    public final float[] f55678b = new float[2];
    public d1 f55679c = null;
    public int f55686x = -1;
    public int E = 0;
    public final ArrayList G = new ArrayList();
    public final lt J = new lt(this, 26);
    public View N = null;
    public final mj0 Q = new mj0(this);

    public y(v vVar) {
        this.f55687y = vVar;
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
        d1 T = this.I.T(view);
        if (T != null) {
            d1 d1Var = this.f55679c;
            if (d1Var != null && T == d1Var) {
                r(null, 0);
                return;
            }
            l(T, false);
            if (this.f55677a.remove(T.f55540a)) {
                this.f55687y.a(this.I, T);
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
        if (this.f55679c != null) {
            float[] fArr = this.f55678b;
            n(fArr);
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        d1 d1Var = this.f55679c;
        int i3 = this.E;
        v vVar = this.f55687y;
        vVar.getClass();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) arrayList.get(i10);
            d1 d1Var2 = uVar.f55658e;
            float f13 = uVar.f55655a;
            float f14 = uVar.f55657c;
            if (f13 == f14) {
                uVar.f55661r = d1Var2.f55540a.getTranslationX();
            } else {
                uVar.f55661r = com.google.android.recaptcha.internal.a.y(f14, f13, uVar.f55665y, f13);
            }
            float f15 = uVar.f55656b;
            float f16 = uVar.d;
            if (f15 == f16) {
                uVar.f55662s = d1Var2.f55540a.getTranslationY();
            } else {
                uVar.f55662s = com.google.android.recaptcha.internal.a.y(f16, f15, uVar.f55665y, f15);
            }
            int save = canvas.save();
            vVar.m(canvas, recyclerView, uVar.f55658e, uVar.f55661r, uVar.f55662s, uVar.f55659f, false);
            canvas.restoreToCount(save);
        }
        if (d1Var != null) {
            int save2 = canvas.save();
            vVar.m(canvas, recyclerView, d1Var, f11, f10, i3, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f55679c != null) {
            float[] fArr = this.f55678b;
            n(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        d1 d1Var = this.f55679c;
        this.f55687y.getClass();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            int save = canvas.save();
            View view = ((u) arrayList.get(i3)).f55658e.f55540a;
            canvas.restoreToCount(save);
        }
        if (d1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i10 = size - 1; i10 >= 0; i10--) {
            u uVar = (u) arrayList.get(i10);
            boolean z11 = uVar.f55664x;
            if (z11 && !uVar.f55660n) {
                arrayList.remove(i10);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void h(tj0 tj0Var) {
        RecyclerView recyclerView = this.I;
        if (recyclerView != tj0Var) {
            mj0 mj0Var = this.Q;
            if (recyclerView != null) {
                recyclerView.q0(this);
                RecyclerView recyclerView2 = this.I;
                recyclerView2.F.remove(mj0Var);
                if (recyclerView2.G == mj0Var) {
                    recyclerView2.G = null;
                }
                ArrayList arrayList = this.I.Q;
                if (arrayList != null) {
                    arrayList.remove(this);
                }
                ArrayList arrayList2 = this.G;
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f55687y.a(this.I, ((u) arrayList2.get(0)).f55658e);
                }
                arrayList2.clear();
                this.N = null;
                VelocityTracker velocityTracker = this.K;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.K = null;
                }
                w wVar = this.P;
                if (wVar != null) {
                    wVar.f55674a = false;
                    this.P = null;
                }
                if (this.O != null) {
                    this.O = null;
                }
            }
            this.I = tj0Var;
            if (tj0Var != null) {
                tj0Var.getResources();
                this.f55681f = org.telegram.messenger.g0.L(120.0f);
                this.h = org.telegram.messenger.g0.L(800.0f);
                this.H = ViewConfiguration.get(this.I.getContext()).getScaledTouchSlop();
                this.I.i(this);
                this.I.F.add(mj0Var);
                RecyclerView recyclerView3 = this.I;
                if (recyclerView3.Q == null) {
                    recyclerView3.Q = new ArrayList();
                }
                recyclerView3.Q.add(this);
                this.P = new w(this);
                this.O = new y00(this.I.getContext(), this.P);
            }
        }
    }

    public final int i(d1 d1Var, int i3) {
        int i10;
        if ((i3 & 12) != 0) {
            int i11 = 4;
            if (this.f55682n > 0.0f) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            VelocityTracker velocityTracker = this.K;
            v vVar = this.f55687y;
            if (velocityTracker != null && this.f55686x > -1) {
                velocityTracker.computeCurrentVelocity(1000, vVar.h(this.h));
                float xVelocity = this.K.getXVelocity(this.f55686x);
                float yVelocity = this.K.getYVelocity(this.f55686x);
                if (xVelocity > 0.0f) {
                    i11 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i11 & i3) != 0 && i10 == i11 && abs >= vVar.f(this.f55681f) && abs > Math.abs(yVelocity)) {
                    return i11;
                }
            }
            float g7 = vVar.g() * this.I.getWidth();
            if ((i3 & i10) != 0 && Math.abs(this.f55682n) > g7) {
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public final void j(int i3, int i10, MotionEvent motionEvent) {
        View m10;
        if (this.f55679c == null && i3 == 2 && this.E != 2) {
            v vVar = this.f55687y;
            if (vVar.j() && this.I.getScrollState() != 1) {
                o0 layoutManager = this.I.getLayoutManager();
                int i11 = this.f55686x;
                d1 d1Var = null;
                if (i11 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f55680e);
                    float f10 = this.H;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (m10 = m(motionEvent)) != null))) {
                        d1Var = this.I.T(m10);
                    }
                }
                if (d1Var != null) {
                    RecyclerView recyclerView = this.I;
                    int e10 = vVar.e(recyclerView, d1Var);
                    WeakHashMap weakHashMap = r0.i0.f54015a;
                    int b10 = (vVar.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x10 = motionEvent.getX(i10);
                        float y9 = motionEvent.getY(i10);
                        float f11 = x10 - this.d;
                        float f12 = y9 - this.f55680e;
                        float abs3 = Math.abs(f11);
                        float abs4 = Math.abs(f12);
                        float f13 = this.H;
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
                            this.f55683r = 0.0f;
                            this.f55682n = 0.0f;
                            this.f55686x = motionEvent.getPointerId(0);
                            r(d1Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int k(d1 d1Var, int i3) {
        int i10;
        if ((i3 & 3) != 0) {
            int i11 = 1;
            if (this.f55683r > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            VelocityTracker velocityTracker = this.K;
            v vVar = this.f55687y;
            if (velocityTracker != null && this.f55686x > -1) {
                velocityTracker.computeCurrentVelocity(1000, vVar.h(this.h));
                float xVelocity = this.K.getXVelocity(this.f55686x);
                float yVelocity = this.K.getYVelocity(this.f55686x);
                if (yVelocity > 0.0f) {
                    i11 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i11 & i3) != 0 && i11 == i10 && abs >= vVar.f(this.f55681f) && abs > Math.abs(xVelocity)) {
                    return i11;
                }
            }
            float g7 = vVar.g() * this.I.getHeight();
            if ((i3 & i10) != 0 && Math.abs(this.f55683r) > g7) {
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public final void l(d1 d1Var, boolean z10) {
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar.f55658e == d1Var) {
                uVar.f55663w |= z10;
                if (!uVar.f55664x) {
                    uVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        d1 d1Var = this.f55679c;
        if (d1Var != null) {
            View view = d1Var.f55540a;
            if (o(view, x10, y9, this.f55684s + this.f55682n, this.f55685w + this.f55683r)) {
                return view;
            }
        }
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            View view2 = uVar.f55658e.f55540a;
            if (o(view2, x10, y9, uVar.f55661r, uVar.f55662s)) {
                return view2;
            }
        }
        return this.I.E(x10, y9);
    }

    public final void n(float[] fArr) {
        if ((this.F & 12) != 0) {
            fArr[0] = (this.f55684s + this.f55682n) - this.f55679c.f55540a.getLeft();
        } else {
            fArr[0] = this.f55679c.f55540a.getTranslationX();
        }
        if ((this.F & 3) != 0) {
            fArr[1] = (this.f55685w + this.f55683r) - this.f55679c.f55540a.getTop();
        } else {
            fArr[1] = this.f55679c.f55540a.getTranslationY();
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
        int i3;
        View view;
        int i10;
        int i11;
        if (!this.I.isLayoutRequested() && this.E == 2) {
            v vVar = this.f55687y;
            vVar.getClass();
            int i12 = (int) (this.f55684s + this.f55682n);
            int i13 = (int) (this.f55685w + this.f55683r);
            View view2 = d1Var.f55540a;
            if (Math.abs(i13 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i12 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.L;
                if (arrayList2 == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.M.clear();
                }
                int round = Math.round(this.f55684s + this.f55682n);
                int round2 = Math.round(this.f55685w + this.f55683r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i14 = (round + width) / 2;
                int i15 = (round2 + height) / 2;
                o0 layoutManager = this.I.getLayoutManager();
                int r5 = layoutManager.r();
                int i16 = 0;
                while (i16 < r5) {
                    View q10 = layoutManager.q(i16);
                    if (q10 == view2) {
                        i3 = i16;
                    } else {
                        i3 = i16;
                        if (q10.getBottom() >= round2 && q10.getTop() <= height && q10.getRight() >= round && q10.getLeft() <= width) {
                            d1 T = this.I.T(q10);
                            int abs5 = Math.abs(i14 - ((q10.getRight() + q10.getLeft()) / 2));
                            int abs6 = Math.abs(i15 - ((q10.getBottom() + q10.getTop()) / 2));
                            int i17 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.L.size();
                            i10 = round;
                            i11 = i12;
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < size) {
                                int i20 = size;
                                if (i17 <= ((Integer) this.M.get(i18)).intValue()) {
                                    break;
                                }
                                i19++;
                                i18++;
                                size = i20;
                            }
                            this.L.add(i19, T);
                            this.M.add(i19, Integer.valueOf(i17));
                            i16 = i3 + 1;
                            view2 = view;
                            round = i10;
                            i12 = i11;
                        }
                    }
                    view = view2;
                    i10 = round;
                    i11 = i12;
                    i16 = i3 + 1;
                    view2 = view;
                    round = i10;
                    i12 = i11;
                }
                View view3 = view2;
                int i21 = i12;
                ArrayList arrayList3 = this.L;
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
                        if (left2 > 0 && (right = d1Var3.f55540a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (d1Var3.f55540a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i22) {
                                i22 = abs4;
                                d1Var2 = d1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = d1Var3.f55540a.getLeft() - i21) > 0 && d1Var3.f55540a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i22) {
                            i22 = abs3;
                            d1Var2 = d1Var3;
                        }
                        if (top2 < 0 && (top = d1Var3.f55540a.getTop() - i13) > 0 && d1Var3.f55540a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i22) {
                            i22 = abs2;
                            d1Var2 = d1Var3;
                        }
                        if (top2 > 0 && (bottom = d1Var3.f55540a.getBottom() - height2) < 0 && d1Var3.f55540a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i22) {
                            i22 = abs;
                            d1Var2 = d1Var3;
                        }
                        i23++;
                        arrayList3 = arrayList;
                    }
                    if (d1Var2 == null) {
                        this.L.clear();
                        this.M.clear();
                        return;
                    }
                    int b10 = d1Var2.b();
                    d1Var.b();
                    if (vVar.n(this.I, d1Var, d1Var2)) {
                        this.f55687y.o(this.I, d1Var, d1Var2, b10, i21, i13);
                    }
                }
            }
        }
    }

    public final void q(View view) {
        if (view == this.N) {
            this.N = null;
        }
    }

    public final void r(u4.d1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: u4.y.r(u4.d1, int):void");
    }

    public boolean s() {
        return false;
    }

    public final void t(d1 d1Var) {
        RecyclerView recyclerView = this.I;
        v vVar = this.f55687y;
        int e10 = vVar.e(recyclerView, d1Var);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        if ((vVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (d1Var.f55540a.getParent() != this.I) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.K = VelocityTracker.obtain();
            this.f55683r = 0.0f;
            this.f55682n = 0.0f;
            r(d1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void u(int i3, int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i10);
        float y9 = motionEvent.getY(i10);
        float f10 = x10 - this.d;
        this.f55682n = f10;
        this.f55683r = y9 - this.f55680e;
        if ((i3 & 4) == 0) {
            this.f55682n = Math.max(0.0f, f10);
        }
        if ((i3 & 8) == 0) {
            this.f55682n = Math.min(0.0f, this.f55682n);
        }
        if ((i3 & 1) == 0) {
            this.f55683r = Math.max(0.0f, this.f55683r);
        }
        if ((i3 & 2) == 0) {
            this.f55683r = Math.min(0.0f, this.f55683r);
        }
    }

    @Override
    public final void c() {
    }
}
