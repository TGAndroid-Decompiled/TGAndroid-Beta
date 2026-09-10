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
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.vl0;
public class y extends n0 {
    public int E;
    public int G;
    public RecyclerView H;
    public VelocityTracker J;
    public ArrayList K;
    public ArrayList L;
    public l2.h N;
    public w O;
    public Rect Q;
    public long R;
    public float d;
    public float e;
    public float f41753f;
    public float h;
    public float f41754n;
    public float f41755r;
    public float f41756s;
    public float v;
    public final v f41758x;
    public final ArrayList f41750a = new ArrayList();
    public final float[] f41751b = new float[2];
    public c1 f41752c = null;
    public int f41757w = -1;
    public int f41759y = 0;
    public final ArrayList F = new ArrayList();
    public final l9 I = new l9(this, 29);
    public View M = null;
    public final ql0 P = new ql0(this);

    public y(v vVar) {
        this.f41758x = vVar;
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
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        if (this.f41752c != null) {
            float[] fArr = this.f41751b;
            l(fArr);
            float f11 = fArr[0];
            f7 = fArr[1];
            f10 = f11;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        c1 c1Var = this.f41752c;
        int i10 = this.f41759y;
        v vVar = this.f41758x;
        vVar.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            u uVar = (u) arrayList.get(i11);
            c1 c1Var2 = uVar.e;
            float f12 = uVar.f41727a;
            float f13 = uVar.f41729c;
            if (f12 == f13) {
                uVar.f41732r = c1Var2.f41610a.getTranslationX();
            } else {
                uVar.f41732r = e2.z(f13, f12, uVar.f41735x, f12);
            }
            float f14 = uVar.f41728b;
            float f15 = uVar.d;
            if (f14 == f15) {
                uVar.f41733s = c1Var2.f41610a.getTranslationY();
            } else {
                uVar.f41733s = e2.z(f15, f14, uVar.f41735x, f14);
            }
            int save = canvas.save();
            vVar.m(canvas, recyclerView, uVar.e, uVar.f41732r, uVar.f41733s, uVar.f41730f, false);
            canvas.restoreToCount(save);
        }
        if (c1Var != null) {
            int save2 = canvas.save();
            vVar.m(canvas, recyclerView, c1Var, f10, f7, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f41752c != null) {
            float[] fArr = this.f41751b;
            l(fArr);
            float f7 = fArr[0];
            float f10 = fArr[1];
        }
        c1 c1Var = this.f41752c;
        this.f41758x.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            View view = ((u) arrayList.get(i10)).e.f41610a;
            canvas.restoreToCount(save);
        }
        if (c1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            u uVar = (u) arrayList.get(i11);
            boolean z11 = uVar.f41734w;
            if (z11 && !uVar.f41731n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void d(vl0 vl0Var) {
        RecyclerView recyclerView = this.H;
        if (recyclerView != vl0Var) {
            ql0 ql0Var = this.P;
            if (recyclerView != null) {
                recyclerView.p0(this);
                RecyclerView recyclerView2 = this.H;
                recyclerView2.E.remove(ql0Var);
                if (recyclerView2.F == ql0Var) {
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
                    this.f41758x.a(this.H, ((u) arrayList2.get(0)).e);
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
                    wVar.f41742a = false;
                    this.O = null;
                }
                if (this.N != null) {
                    this.N = null;
                }
            }
            this.H = vl0Var;
            if (vl0Var != null) {
                vl0Var.getResources();
                this.f41753f = AndroidUtilities.dp(120.0f);
                this.h = AndroidUtilities.dp(800.0f);
                this.G = ViewConfiguration.get(this.H.getContext()).getScaledTouchSlop();
                this.H.i(this);
                this.H.E.add(ql0Var);
                RecyclerView recyclerView3 = this.H;
                if (recyclerView3.P == null) {
                    recyclerView3.P = new ArrayList();
                }
                recyclerView3.P.add(this);
                this.O = new w(this);
                this.N = new l2.h(this.H.getContext(), this.O);
            }
        }
    }

    public final int f(c1 c1Var, int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 4;
            if (this.f41754n > 0.0f) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.J;
            v vVar = this.f41758x;
            if (velocityTracker != null && this.f41757w > -1) {
                velocityTracker.computeCurrentVelocity(1000, vVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f41757w);
                float yVelocity = this.J.getYVelocity(this.f41757w);
                if (xVelocity > 0.0f) {
                    i12 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= vVar.f(this.f41753f) && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float g10 = vVar.g() * this.H.getWidth();
            if ((i10 & i11) != 0 && Math.abs(this.f41754n) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k10;
        if (this.f41752c == null && i10 == 2 && this.f41759y != 2) {
            v vVar = this.f41758x;
            if (vVar.j() && this.H.getScrollState() != 1) {
                o0 layoutManager = this.H.getLayoutManager();
                int i12 = this.f41757w;
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
                    WeakHashMap weakHashMap = r0.i0.f41062a;
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
                            this.f41755r = 0.0f;
                            this.f41754n = 0.0f;
                            this.f41757w = motionEvent.getPointerId(0);
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
            if (this.f41755r > 0.0f) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.J;
            v vVar = this.f41758x;
            if (velocityTracker != null && this.f41757w > -1) {
                velocityTracker.computeCurrentVelocity(1000, vVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f41757w);
                float yVelocity = this.J.getYVelocity(this.f41757w);
                if (yVelocity > 0.0f) {
                    i12 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= vVar.f(this.f41753f) && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float g10 = vVar.g() * this.H.getHeight();
            if ((i10 & i11) != 0 && Math.abs(this.f41755r) > g10) {
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
                if (!uVar.f41734w) {
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
        c1 c1Var = this.f41752c;
        if (c1Var != null) {
            View view = c1Var.f41610a;
            if (m(view, x10, y3, this.f41756s + this.f41754n, this.v + this.f41755r)) {
                return view;
            }
        }
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            View view2 = uVar.e.f41610a;
            if (m(view2, x10, y3, uVar.f41732r, uVar.f41733s)) {
                return view2;
            }
        }
        return this.H.E(x10, y3);
    }

    public final void l(float[] fArr) {
        if ((this.E & 12) != 0) {
            fArr[0] = (this.f41756s + this.f41754n) - this.f41752c.f41610a.getLeft();
        } else {
            fArr[0] = this.f41752c.f41610a.getTranslationX();
        }
        if ((this.E & 3) != 0) {
            fArr[1] = (this.v + this.f41755r) - this.f41752c.f41610a.getTop();
        } else {
            fArr[1] = this.f41752c.f41610a.getTranslationY();
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
        if (!this.H.isLayoutRequested() && this.f41759y == 2) {
            v vVar = this.f41758x;
            vVar.getClass();
            int i13 = (int) (this.f41756s + this.f41754n);
            int i14 = (int) (this.v + this.f41755r);
            View view2 = c1Var.f41610a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.K;
                if (arrayList2 == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.L.clear();
                }
                int round = Math.round(this.f41756s + this.f41754n);
                int round2 = Math.round(this.v + this.f41755r);
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
                        if (left2 > 0 && (right = c1Var3.f41610a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (c1Var3.f41610a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                                i23 = abs4;
                                c1Var2 = c1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = c1Var3.f41610a.getLeft() - i22) > 0 && c1Var3.f41610a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                            i23 = abs3;
                            c1Var2 = c1Var3;
                        }
                        if (top2 < 0 && (top = c1Var3.f41610a.getTop() - i14) > 0 && c1Var3.f41610a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                            i23 = abs2;
                            c1Var2 = c1Var3;
                        }
                        if (top2 > 0 && (bottom = c1Var3.f41610a.getBottom() - height2) < 0 && c1Var3.f41610a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
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
                        this.f41758x.o(this.H, c1Var, c1Var2, b10, i22, i14);
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
        v vVar = this.f41758x;
        int e = vVar.e(recyclerView, c1Var);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        if ((vVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (c1Var.f41610a.getParent() != this.H) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.J = VelocityTracker.obtain();
            this.f41755r = 0.0f;
            this.f41754n = 0.0f;
            p(c1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y3 = motionEvent.getY(i11);
        float f7 = x10 - this.d;
        this.f41754n = f7;
        this.f41755r = y3 - this.e;
        if ((i10 & 4) == 0) {
            this.f41754n = Math.max(0.0f, f7);
        }
        if ((i10 & 8) == 0) {
            this.f41754n = Math.min(0.0f, this.f41754n);
        }
        if ((i10 & 1) == 0) {
            this.f41755r = Math.max(0.0f, this.f41755r);
        }
        if ((i10 & 2) == 0) {
            this.f41755r = Math.min(0.0f, this.f41755r);
        }
    }
}
