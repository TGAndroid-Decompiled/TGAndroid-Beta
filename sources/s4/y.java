package s4;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.wl0;
public class y extends n0 {
    public int E;
    public int G;
    public RecyclerView H;
    public VelocityTracker J;
    public ArrayList K;
    public ArrayList L;
    public n2.e N;
    public w O;
    public Rect Q;
    public long R;
    public float d;
    public float e;
    public float f43104f;
    public float h;
    public float f43105n;
    public float f43106r;
    public float f43107s;
    public float v;
    public final v f43109x;
    public final ArrayList f43101a = new ArrayList();
    public final float[] f43102b = new float[2];
    public c1 f43103c = null;
    public int f43108w = -1;
    public int f43110y = 0;
    public final ArrayList F = new ArrayList();
    public final pg.c1 I = new pg.c1(this, 3);
    public View M = null;
    public final rl0 P = new rl0(this);

    public y(v vVar) {
        this.f43109x = vVar;
    }

    public static boolean m(View view, float f7, float f10, float f11, float f12) {
        if (f7 >= f11 && f7 <= f11 + view.getWidth() && f10 >= f12 && f10 <= f12 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, z0 z0Var) {
        rect.setEmpty();
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        if (this.f43103c != null) {
            float[] fArr = this.f43102b;
            l(fArr);
            float f11 = fArr[0];
            f7 = fArr[1];
            f10 = f11;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        c1 c1Var = this.f43103c;
        int i10 = this.f43110y;
        v vVar = this.f43109x;
        vVar.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            u uVar = (u) arrayList.get(i11);
            c1 c1Var2 = uVar.e;
            float f12 = uVar.f43078a;
            float f13 = uVar.f43080c;
            if (f12 == f13) {
                uVar.f43083r = c1Var2.f42961a.getTranslationX();
            } else {
                uVar.f43083r = e2.z(f13, f12, uVar.f43086x, f12);
            }
            float f14 = uVar.f43079b;
            float f15 = uVar.d;
            if (f14 == f15) {
                uVar.f43084s = c1Var2.f42961a.getTranslationY();
            } else {
                uVar.f43084s = e2.z(f15, f14, uVar.f43086x, f14);
            }
            int save = canvas.save();
            vVar.m(canvas, recyclerView, uVar.e, uVar.f43083r, uVar.f43084s, uVar.f43081f, false);
            canvas.restoreToCount(save);
        }
        if (c1Var != null) {
            int save2 = canvas.save();
            vVar.m(canvas, recyclerView, c1Var, f10, f7, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f43103c != null) {
            float[] fArr = this.f43102b;
            l(fArr);
            float f7 = fArr[0];
            float f10 = fArr[1];
        }
        c1 c1Var = this.f43103c;
        this.f43109x.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            View view = ((u) arrayList.get(i10)).e.f42961a;
            canvas.restoreToCount(save);
        }
        if (c1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            u uVar = (u) arrayList.get(i11);
            boolean z11 = uVar.f43085w;
            if (z11 && !uVar.f43082n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void e(wl0 wl0Var) {
        RecyclerView recyclerView = this.H;
        if (recyclerView != wl0Var) {
            rl0 rl0Var = this.P;
            if (recyclerView != null) {
                recyclerView.p0(this);
                RecyclerView recyclerView2 = this.H;
                recyclerView2.E.remove(rl0Var);
                if (recyclerView2.F == rl0Var) {
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
                    this.f43109x.a(this.H, ((u) arrayList2.get(0)).e);
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
                    wVar.f43093a = false;
                    this.O = null;
                }
                if (this.N != null) {
                    this.N = null;
                }
            }
            this.H = wl0Var;
            if (wl0Var != null) {
                wl0Var.getResources();
                this.f43104f = AndroidUtilities.dp(120.0f);
                this.h = AndroidUtilities.dp(800.0f);
                this.G = ViewConfiguration.get(this.H.getContext()).getScaledTouchSlop();
                this.H.i(this);
                this.H.E.add(rl0Var);
                RecyclerView recyclerView3 = this.H;
                if (recyclerView3.P == null) {
                    recyclerView3.P = new ArrayList();
                }
                recyclerView3.P.add(this);
                this.O = new w(this);
                this.N = new n2.e(this.H.getContext(), this.O);
            }
        }
    }

    public final int g(c1 c1Var, int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 4;
            if (this.f43105n > 0.0f) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.J;
            v vVar = this.f43109x;
            if (velocityTracker != null && this.f43108w > -1) {
                velocityTracker.computeCurrentVelocity(1000, vVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f43108w);
                float yVelocity = this.J.getYVelocity(this.f43108w);
                if (xVelocity > 0.0f) {
                    i12 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= vVar.f(this.f43104f) && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float g10 = vVar.g() * this.H.getWidth();
            if ((i10 & i11) != 0 && Math.abs(this.f43105n) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k10;
        if (this.f43103c == null && i10 == 2 && this.f43110y != 2) {
            v vVar = this.f43109x;
            if (vVar.j() && this.H.getScrollState() != 1) {
                o0 layoutManager = this.H.getLayoutManager();
                int i12 = this.f43108w;
                c1 c1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.e);
                    float f7 = this.G;
                    if ((abs >= f7 || abs2 >= f7) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k10 = k(motionEvent)) != null))) {
                        c1Var = this.H.T(k10);
                    }
                }
                if (c1Var != null) {
                    RecyclerView recyclerView = this.H;
                    int e = vVar.e(recyclerView, c1Var);
                    WeakHashMap weakHashMap = r0.i0.f42129a;
                    int b10 = (vVar.b(e, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x10 = motionEvent.getX(i11);
                        float y3 = motionEvent.getY(i11);
                        float f10 = x10 - this.d;
                        float f11 = y3 - this.e;
                        float abs3 = Math.abs(f10);
                        float abs4 = Math.abs(f11);
                        float f12 = this.G;
                        if (abs3 >= f12 || abs4 >= f12) {
                            if (abs3 > abs4) {
                                if (f10 >= 0.0f || (b10 & 4) != 0) {
                                    if (f10 > 0.0f && (b10 & 8) == 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else if (f11 >= 0.0f || (b10 & 1) != 0) {
                                if (f11 > 0.0f && (b10 & 2) == 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                            this.f43106r = 0.0f;
                            this.f43105n = 0.0f;
                            this.f43108w = motionEvent.getPointerId(0);
                            p(c1Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int i(c1 c1Var, int i10) {
        int i11;
        if ((i10 & 3) != 0) {
            int i12 = 1;
            if (this.f43106r > 0.0f) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.J;
            v vVar = this.f43109x;
            if (velocityTracker != null && this.f43108w > -1) {
                velocityTracker.computeCurrentVelocity(1000, vVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f43108w);
                float yVelocity = this.J.getYVelocity(this.f43108w);
                if (yVelocity > 0.0f) {
                    i12 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= vVar.f(this.f43104f) && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float g10 = vVar.g() * this.H.getHeight();
            if ((i10 & i11) != 0 && Math.abs(this.f43106r) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void j(c1 c1Var, boolean z10) {
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar.e == c1Var) {
                uVar.v |= z10;
                if (!uVar.f43085w) {
                    uVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        c1 c1Var = this.f43103c;
        if (c1Var != null) {
            View view = c1Var.f42961a;
            if (m(view, x10, y3, this.f43107s + this.f43105n, this.v + this.f43106r)) {
                return view;
            }
        }
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            View view2 = uVar.e.f42961a;
            if (m(view2, x10, y3, uVar.f43083r, uVar.f43084s)) {
                return view2;
            }
        }
        return this.H.E(x10, y3);
    }

    public final void l(float[] fArr) {
        if ((this.E & 12) != 0) {
            fArr[0] = (this.f43107s + this.f43105n) - this.f43103c.f42961a.getLeft();
        } else {
            fArr[0] = this.f43103c.f42961a.getTranslationX();
        }
        if ((this.E & 3) != 0) {
            fArr[1] = (this.v + this.f43106r) - this.f43103c.f42961a.getTop();
        } else {
            fArr[1] = this.f43103c.f42961a.getTranslationY();
        }
    }

    public final void n(c1 c1Var) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i10;
        View view;
        int i11;
        int i12;
        if (!this.H.isLayoutRequested() && this.f43110y == 2) {
            v vVar = this.f43109x;
            vVar.getClass();
            int i13 = (int) (this.f43107s + this.f43105n);
            int i14 = (int) (this.v + this.f43106r);
            View view2 = c1Var.f42961a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.K;
                if (arrayList2 == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.L.clear();
                }
                int round = Math.round(this.f43107s + this.f43105n);
                int round2 = Math.round(this.v + this.f43106r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i15 = (round + width) / 2;
                int i16 = (round2 + height) / 2;
                o0 layoutManager = this.H.getLayoutManager();
                int r10 = layoutManager.r();
                int i17 = 0;
                while (i17 < r10) {
                    View q6 = layoutManager.q(i17);
                    if (q6 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q6.getBottom() >= round2 && q6.getTop() <= height && q6.getRight() >= round && q6.getLeft() <= width) {
                            c1 T = this.H.T(q6);
                            int abs5 = Math.abs(i15 - ((q6.getRight() + q6.getLeft()) / 2));
                            int abs6 = Math.abs(i16 - ((q6.getBottom() + q6.getTop()) / 2));
                            int i18 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.K.size();
                            i11 = round;
                            i12 = i13;
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < size) {
                                int i21 = size;
                                if (i18 <= ((Integer) this.L.get(i19)).intValue()) {
                                    break;
                                }
                                i20++;
                                i19++;
                                size = i21;
                            }
                            this.K.add(i20, T);
                            this.L.add(i20, Integer.valueOf(i18));
                            i17 = i10 + 1;
                            view2 = view;
                            round = i11;
                            i13 = i12;
                        }
                    }
                    view = view2;
                    i11 = round;
                    i12 = i13;
                    i17 = i10 + 1;
                    view2 = view;
                    round = i11;
                    i13 = i12;
                }
                View view3 = view2;
                int i22 = i13;
                ArrayList arrayList3 = this.K;
                if (arrayList3.size() != 0) {
                    int width2 = view3.getWidth() + i22;
                    int height2 = view3.getHeight() + i14;
                    int left2 = i22 - view3.getLeft();
                    int top2 = i14 - view3.getTop();
                    int size2 = arrayList3.size();
                    c1 c1Var2 = null;
                    int i23 = -1;
                    int i24 = 0;
                    while (i24 < size2) {
                        c1 c1Var3 = (c1) arrayList3.get(i24);
                        if (left2 > 0 && (right = c1Var3.f42961a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (c1Var3.f42961a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                                i23 = abs4;
                                c1Var2 = c1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = c1Var3.f42961a.getLeft() - i22) > 0 && c1Var3.f42961a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                            i23 = abs3;
                            c1Var2 = c1Var3;
                        }
                        if (top2 < 0 && (top = c1Var3.f42961a.getTop() - i14) > 0 && c1Var3.f42961a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                            i23 = abs2;
                            c1Var2 = c1Var3;
                        }
                        if (top2 > 0 && (bottom = c1Var3.f42961a.getBottom() - height2) < 0 && c1Var3.f42961a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                            i23 = abs;
                            c1Var2 = c1Var3;
                        }
                        i24++;
                        arrayList3 = arrayList;
                    }
                    if (c1Var2 == null) {
                        this.K.clear();
                        this.L.clear();
                        return;
                    }
                    int b10 = c1Var2.b();
                    c1Var.b();
                    if (vVar.n(this.H, c1Var, c1Var2)) {
                        this.f43109x.o(this.H, c1Var, c1Var2, b10, i22, i14);
                    }
                }
            }
        }
    }

    public final void o(View view) {
        if (view == this.M) {
            this.M = null;
        }
    }

    public final void p(s4.c1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: s4.y.p(s4.c1, int):void");
    }

    public boolean q() {
        return false;
    }

    public final void r(c1 c1Var) {
        RecyclerView recyclerView = this.H;
        v vVar = this.f43109x;
        int e = vVar.e(recyclerView, c1Var);
        WeakHashMap weakHashMap = r0.i0.f42129a;
        if ((vVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (c1Var.f42961a.getParent() != this.H) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.J = VelocityTracker.obtain();
            this.f43106r = 0.0f;
            this.f43105n = 0.0f;
            p(c1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y3 = motionEvent.getY(i11);
        float f7 = x10 - this.d;
        this.f43105n = f7;
        this.f43106r = y3 - this.e;
        if ((i10 & 4) == 0) {
            this.f43105n = Math.max(0.0f, f7);
        }
        if ((i10 & 8) == 0) {
            this.f43105n = Math.min(0.0f, this.f43105n);
        }
        if ((i10 & 1) == 0) {
            this.f43106r = Math.max(0.0f, this.f43106r);
        }
        if ((i10 & 2) == 0) {
            this.f43106r = Math.min(0.0f, this.f43106r);
        }
    }
}
