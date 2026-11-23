package v4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.xj0;
public class z extends o0 implements r0 {
    public int F;
    public int H;
    public RecyclerView I;
    public VelocityTracker K;
    public ArrayList L;
    public ArrayList M;
    public jn O;
    public x P;
    public Rect R;
    public long S;
    public float d;
    public float f59305e;
    public float f59306f;
    public float h;
    public float f59307n;
    public float f59308r;
    public float f59309s;
    public float f59310w;
    public final w f59312y;
    public final ArrayList f59302a = new ArrayList();
    public final float[] f59303b = new float[2];
    public f1 f59304c = null;
    public int f59311x = -1;
    public int E = 0;
    public final ArrayList G = new ArrayList();
    public final s4.s0 J = new s4.s0(this, 7);
    public View N = null;
    public final xj0 Q = new xj0(this);

    public z(w wVar) {
        this.f59312y = wVar;
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
        f1 T = this.I.T(view);
        if (T != null) {
            f1 f1Var = this.f59304c;
            if (f1Var != null && T == f1Var) {
                r(null, 0);
                return;
            }
            l(T, false);
            if (this.f59302a.remove(T.f59165a)) {
                this.f59312y.a(this.I, T);
            }
        }
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, c1 c1Var) {
        rect.setEmpty();
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        if (this.f59304c != null) {
            float[] fArr = this.f59303b;
            n(fArr);
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        f1 f1Var = this.f59304c;
        int i7 = this.E;
        w wVar = this.f59312y;
        wVar.getClass();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = (v) arrayList.get(i10);
            f1 f1Var2 = vVar.f59278e;
            float f13 = vVar.f59275a;
            float f14 = vVar.f59277c;
            if (f13 == f14) {
                vVar.f59281r = f1Var2.f59165a.getTranslationX();
            } else {
                vVar.f59281r = e2.z(f14, f13, vVar.f59285y, f13);
            }
            float f15 = vVar.f59276b;
            float f16 = vVar.d;
            if (f15 == f16) {
                vVar.f59282s = f1Var2.f59165a.getTranslationY();
            } else {
                vVar.f59282s = e2.z(f16, f15, vVar.f59285y, f15);
            }
            int save = canvas.save();
            wVar.m(canvas, recyclerView, vVar.f59278e, vVar.f59281r, vVar.f59282s, vVar.f59279f, false);
            canvas.restoreToCount(save);
        }
        if (f1Var != null) {
            int save2 = canvas.save();
            wVar.m(canvas, recyclerView, f1Var, f11, f10, i7, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f59304c != null) {
            float[] fArr = this.f59303b;
            n(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        f1 f1Var = this.f59304c;
        this.f59312y.getClass();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            int save = canvas.save();
            View view = ((v) arrayList.get(i7)).f59278e.f59165a;
            canvas.restoreToCount(save);
        }
        if (f1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i10 = size - 1; i10 >= 0; i10--) {
            v vVar = (v) arrayList.get(i10);
            boolean z11 = vVar.f59284x;
            if (z11 && !vVar.f59280n) {
                arrayList.remove(i10);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void h(ek0 ek0Var) {
        RecyclerView recyclerView = this.I;
        if (recyclerView != ek0Var) {
            xj0 xj0Var = this.Q;
            if (recyclerView != null) {
                recyclerView.q0(this);
                RecyclerView recyclerView2 = this.I;
                recyclerView2.F.remove(xj0Var);
                if (recyclerView2.G == xj0Var) {
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
                    this.f59312y.a(this.I, ((v) arrayList2.get(0)).f59278e);
                }
                arrayList2.clear();
                this.N = null;
                VelocityTracker velocityTracker = this.K;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.K = null;
                }
                x xVar = this.P;
                if (xVar != null) {
                    xVar.f59294a = false;
                    this.P = null;
                }
                if (this.O != null) {
                    this.O = null;
                }
            }
            this.I = ek0Var;
            if (ek0Var != null) {
                ek0Var.getResources();
                this.f59306f = org.telegram.messenger.g0.L(120.0f);
                this.h = org.telegram.messenger.g0.L(800.0f);
                this.H = ViewConfiguration.get(this.I.getContext()).getScaledTouchSlop();
                this.I.i(this);
                this.I.F.add(xj0Var);
                RecyclerView recyclerView3 = this.I;
                if (recyclerView3.Q == null) {
                    recyclerView3.Q = new ArrayList();
                }
                recyclerView3.Q.add(this);
                this.P = new x(this);
                this.O = new jn(this.I.getContext(), this.P);
            }
        }
    }

    public final int i(f1 f1Var, int i7) {
        int i10;
        if ((i7 & 12) != 0) {
            int i11 = 4;
            if (this.f59307n > 0.0f) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            VelocityTracker velocityTracker = this.K;
            w wVar = this.f59312y;
            if (velocityTracker != null && this.f59311x > -1) {
                velocityTracker.computeCurrentVelocity(1000, wVar.h(this.h));
                float xVelocity = this.K.getXVelocity(this.f59311x);
                float yVelocity = this.K.getYVelocity(this.f59311x);
                if (xVelocity > 0.0f) {
                    i11 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i11 & i7) != 0 && i10 == i11 && abs >= wVar.f(this.f59306f) && abs > Math.abs(yVelocity)) {
                    return i11;
                }
            }
            float g10 = wVar.g() * this.I.getWidth();
            if ((i7 & i10) != 0 && Math.abs(this.f59307n) > g10) {
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public final void j(int i7, int i10, MotionEvent motionEvent) {
        View m10;
        if (this.f59304c == null && i7 == 2 && this.E != 2) {
            w wVar = this.f59312y;
            if (wVar.j() && this.I.getScrollState() != 1) {
                p0 layoutManager = this.I.getLayoutManager();
                int i11 = this.f59311x;
                f1 f1Var = null;
                if (i11 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f59305e);
                    float f10 = this.H;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (m10 = m(motionEvent)) != null))) {
                        f1Var = this.I.T(m10);
                    }
                }
                if (f1Var != null) {
                    RecyclerView recyclerView = this.I;
                    int e10 = wVar.e(recyclerView, f1Var);
                    WeakHashMap weakHashMap = r0.i0.f56289a;
                    int b10 = (wVar.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x10 = motionEvent.getX(i10);
                        float y10 = motionEvent.getY(i10);
                        float f11 = x10 - this.d;
                        float f12 = y10 - this.f59305e;
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
                            this.f59308r = 0.0f;
                            this.f59307n = 0.0f;
                            this.f59311x = motionEvent.getPointerId(0);
                            r(f1Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int k(f1 f1Var, int i7) {
        int i10;
        if ((i7 & 3) != 0) {
            int i11 = 1;
            if (this.f59308r > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            VelocityTracker velocityTracker = this.K;
            w wVar = this.f59312y;
            if (velocityTracker != null && this.f59311x > -1) {
                velocityTracker.computeCurrentVelocity(1000, wVar.h(this.h));
                float xVelocity = this.K.getXVelocity(this.f59311x);
                float yVelocity = this.K.getYVelocity(this.f59311x);
                if (yVelocity > 0.0f) {
                    i11 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i11 & i7) != 0 && i11 == i10 && abs >= wVar.f(this.f59306f) && abs > Math.abs(xVelocity)) {
                    return i11;
                }
            }
            float g10 = wVar.g() * this.I.getHeight();
            if ((i7 & i10) != 0 && Math.abs(this.f59308r) > g10) {
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public final void l(f1 f1Var, boolean z10) {
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v vVar = (v) arrayList.get(size);
            if (vVar.f59278e == f1Var) {
                vVar.f59283w |= z10;
                if (!vVar.f59284x) {
                    vVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        f1 f1Var = this.f59304c;
        if (f1Var != null) {
            View view = f1Var.f59165a;
            if (o(view, x10, y10, this.f59309s + this.f59307n, this.f59310w + this.f59308r)) {
                return view;
            }
        }
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v vVar = (v) arrayList.get(size);
            View view2 = vVar.f59278e.f59165a;
            if (o(view2, x10, y10, vVar.f59281r, vVar.f59282s)) {
                return view2;
            }
        }
        return this.I.E(x10, y10);
    }

    public final void n(float[] fArr) {
        if ((this.F & 12) != 0) {
            fArr[0] = (this.f59309s + this.f59307n) - this.f59304c.f59165a.getLeft();
        } else {
            fArr[0] = this.f59304c.f59165a.getTranslationX();
        }
        if ((this.F & 3) != 0) {
            fArr[1] = (this.f59310w + this.f59308r) - this.f59304c.f59165a.getTop();
        } else {
            fArr[1] = this.f59304c.f59165a.getTranslationY();
        }
    }

    public final void p(f1 f1Var) {
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
        if (!this.I.isLayoutRequested() && this.E == 2) {
            w wVar = this.f59312y;
            wVar.getClass();
            int i12 = (int) (this.f59309s + this.f59307n);
            int i13 = (int) (this.f59310w + this.f59308r);
            View view2 = f1Var.f59165a;
            if (Math.abs(i13 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i12 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.L;
                if (arrayList2 == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.M.clear();
                }
                int round = Math.round(this.f59309s + this.f59307n);
                int round2 = Math.round(this.f59310w + this.f59308r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i14 = (round + width) / 2;
                int i15 = (round2 + height) / 2;
                p0 layoutManager = this.I.getLayoutManager();
                int r10 = layoutManager.r();
                int i16 = 0;
                while (i16 < r10) {
                    View q10 = layoutManager.q(i16);
                    if (q10 == view2) {
                        i7 = i16;
                    } else {
                        i7 = i16;
                        if (q10.getBottom() >= round2 && q10.getTop() <= height && q10.getRight() >= round && q10.getLeft() <= width) {
                            f1 T = this.I.T(q10);
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
                ArrayList arrayList3 = this.L;
                if (arrayList3.size() != 0) {
                    int width2 = view3.getWidth() + i21;
                    int height2 = view3.getHeight() + i13;
                    int left2 = i21 - view3.getLeft();
                    int top2 = i13 - view3.getTop();
                    int size2 = arrayList3.size();
                    f1 f1Var2 = null;
                    int i22 = -1;
                    int i23 = 0;
                    while (i23 < size2) {
                        f1 f1Var3 = (f1) arrayList3.get(i23);
                        if (left2 > 0 && (right = f1Var3.f59165a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (f1Var3.f59165a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i22) {
                                i22 = abs4;
                                f1Var2 = f1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = f1Var3.f59165a.getLeft() - i21) > 0 && f1Var3.f59165a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i22) {
                            i22 = abs3;
                            f1Var2 = f1Var3;
                        }
                        if (top2 < 0 && (top = f1Var3.f59165a.getTop() - i13) > 0 && f1Var3.f59165a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i22) {
                            i22 = abs2;
                            f1Var2 = f1Var3;
                        }
                        if (top2 > 0 && (bottom = f1Var3.f59165a.getBottom() - height2) < 0 && f1Var3.f59165a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i22) {
                            i22 = abs;
                            f1Var2 = f1Var3;
                        }
                        i23++;
                        arrayList3 = arrayList;
                    }
                    if (f1Var2 == null) {
                        this.L.clear();
                        this.M.clear();
                        return;
                    }
                    int b10 = f1Var2.b();
                    f1Var.b();
                    if (wVar.n(this.I, f1Var, f1Var2)) {
                        this.f59312y.o(this.I, f1Var, f1Var2, b10, i21, i13);
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

    public final void r(v4.f1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: v4.z.r(v4.f1, int):void");
    }

    public boolean s() {
        return false;
    }

    public final void t(f1 f1Var) {
        RecyclerView recyclerView = this.I;
        w wVar = this.f59312y;
        int e10 = wVar.e(recyclerView, f1Var);
        WeakHashMap weakHashMap = r0.i0.f56289a;
        if ((wVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (f1Var.f59165a.getParent() != this.I) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.K = VelocityTracker.obtain();
            this.f59308r = 0.0f;
            this.f59307n = 0.0f;
            r(f1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void u(int i7, int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i10);
        float y10 = motionEvent.getY(i10);
        float f10 = x10 - this.d;
        this.f59307n = f10;
        this.f59308r = y10 - this.f59305e;
        if ((i7 & 4) == 0) {
            this.f59307n = Math.max(0.0f, f10);
        }
        if ((i7 & 8) == 0) {
            this.f59307n = Math.min(0.0f, this.f59307n);
        }
        if ((i7 & 1) == 0) {
            this.f59308r = Math.max(0.0f, this.f59308r);
        }
        if ((i7 & 2) == 0) {
            this.f59308r = Math.min(0.0f, this.f59308r);
        }
    }

    @Override
    public final void b() {
    }
}
