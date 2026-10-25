package s4;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.mm0;
public class z extends n0 implements r0 {
    public int E;
    public int G;
    public RecyclerView H;
    public VelocityTracker J;
    public ArrayList K;
    public ArrayList L;
    public jg.s0 N;
    public x O;
    public Rect Q;
    public long R;
    public float d;
    public float e;
    public float f47861f;
    public float h;
    public float f47862n;
    public float f47863r;
    public float f47864s;
    public float v;
    public final w f47866x;
    public final ArrayList f47858a = new ArrayList();
    public final float[] f47859b = new float[2];
    public e1 f47860c = null;
    public int f47865w = -1;
    public int f47867y = 0;
    public final ArrayList F = new ArrayList();
    public final cy0 I = new cy0(this, 11);
    public View M = null;
    public final gm0 P = new gm0(this);

    public z(w wVar) {
        this.f47866x = wVar;
    }

    public static boolean o(View view, float f7, float f10, float f11, float f12) {
        if (f7 >= f11 && f7 <= f11 + view.getWidth() && f10 >= f12 && f10 <= f12 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(View view) {
        q(view);
        e1 T = this.H.T(view);
        if (T != null) {
            e1 e1Var = this.f47860c;
            if (e1Var != null && T == e1Var) {
                r(null, 0);
                return;
            }
            l(T, false);
            if (this.f47858a.remove(T.f47735a)) {
                this.f47866x.a(this.H, T);
            }
        }
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, b1 b1Var) {
        rect.setEmpty();
    }

    @Override
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        if (this.f47860c != null) {
            float[] fArr = this.f47859b;
            n(fArr);
            float f11 = fArr[0];
            f7 = fArr[1];
            f10 = f11;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        e1 e1Var = this.f47860c;
        int i10 = this.f47867y;
        w wVar = this.f47866x;
        wVar.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            v vVar = (v) arrayList.get(i11);
            e1 e1Var2 = vVar.e;
            float f12 = vVar.f47837a;
            float f13 = vVar.f47839c;
            if (f12 == f13) {
                vVar.f47842r = e1Var2.f47735a.getTranslationX();
            } else {
                vVar.f47842r = c3.h0.z(f13, f12, vVar.f47845x, f12);
            }
            float f14 = vVar.f47838b;
            float f15 = vVar.d;
            if (f14 == f15) {
                vVar.f47843s = e1Var2.f47735a.getTranslationY();
            } else {
                vVar.f47843s = c3.h0.z(f15, f14, vVar.f47845x, f14);
            }
            int save = canvas.save();
            wVar.m(canvas, recyclerView, vVar.e, vVar.f47842r, vVar.f47843s, vVar.f47840f, false);
            canvas.restoreToCount(save);
        }
        if (e1Var != null) {
            int save2 = canvas.save();
            wVar.m(canvas, recyclerView, e1Var, f10, f7, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f47860c != null) {
            float[] fArr = this.f47859b;
            n(fArr);
            float f7 = fArr[0];
            float f10 = fArr[1];
        }
        e1 e1Var = this.f47860c;
        this.f47866x.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            View view = ((v) arrayList.get(i10)).e.f47735a;
            canvas.restoreToCount(save);
        }
        if (e1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            v vVar = (v) arrayList.get(i11);
            boolean z11 = vVar.f47844w;
            if (z11 && !vVar.f47841n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void h(mm0 mm0Var) {
        RecyclerView recyclerView = this.H;
        if (recyclerView != mm0Var) {
            gm0 gm0Var = this.P;
            if (recyclerView != null) {
                recyclerView.q0(this);
                RecyclerView recyclerView2 = this.H;
                recyclerView2.E.remove(gm0Var);
                if (recyclerView2.F == gm0Var) {
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
                    this.f47866x.a(this.H, ((v) arrayList2.get(0)).e);
                }
                arrayList2.clear();
                this.M = null;
                VelocityTracker velocityTracker = this.J;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.J = null;
                }
                x xVar = this.O;
                if (xVar != null) {
                    xVar.f47855a = false;
                    this.O = null;
                }
                if (this.N != null) {
                    this.N = null;
                }
            }
            this.H = mm0Var;
            if (mm0Var != null) {
                mm0Var.getResources();
                this.f47861f = AndroidUtilities.dp(120.0f);
                this.h = AndroidUtilities.dp(800.0f);
                this.G = ViewConfiguration.get(this.H.getContext()).getScaledTouchSlop();
                this.H.i(this);
                this.H.E.add(gm0Var);
                RecyclerView recyclerView3 = this.H;
                if (recyclerView3.P == null) {
                    recyclerView3.P = new ArrayList();
                }
                recyclerView3.P.add(this);
                this.O = new x(this);
                this.N = new jg.s0(this.H.getContext(), this.O);
            }
        }
    }

    public final int i(e1 e1Var, int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 4;
            if (this.f47862n > 0.0f) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.J;
            w wVar = this.f47866x;
            if (velocityTracker != null && this.f47865w > -1) {
                velocityTracker.computeCurrentVelocity(1000, wVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f47865w);
                float yVelocity = this.J.getYVelocity(this.f47865w);
                if (xVelocity > 0.0f) {
                    i12 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= wVar.f(this.f47861f) && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float g7 = wVar.g() * this.H.getWidth();
            if ((i10 & i11) != 0 && Math.abs(this.f47862n) > g7) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void j(int i10, int i11, MotionEvent motionEvent) {
        View m10;
        if (this.f47860c == null && i10 == 2 && this.f47867y != 2) {
            w wVar = this.f47866x;
            if (wVar.j() && this.H.getScrollState() != 1) {
                p0 layoutManager = this.H.getLayoutManager();
                int i12 = this.f47865w;
                e1 e1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.e);
                    float f7 = this.G;
                    if ((abs >= f7 || abs2 >= f7) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (m10 = m(motionEvent)) != null))) {
                        e1Var = this.H.T(m10);
                    }
                }
                if (e1Var != null) {
                    RecyclerView recyclerView = this.H;
                    int e = wVar.e(recyclerView, e1Var);
                    WeakHashMap weakHashMap = r0.i0.f47105a;
                    int b10 = (wVar.b(e, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x9 = motionEvent.getX(i11);
                        float y3 = motionEvent.getY(i11);
                        float f10 = x9 - this.d;
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
                            this.f47863r = 0.0f;
                            this.f47862n = 0.0f;
                            this.f47865w = motionEvent.getPointerId(0);
                            r(e1Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int k(e1 e1Var, int i10) {
        int i11;
        if ((i10 & 3) != 0) {
            int i12 = 1;
            if (this.f47863r > 0.0f) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.J;
            w wVar = this.f47866x;
            if (velocityTracker != null && this.f47865w > -1) {
                velocityTracker.computeCurrentVelocity(1000, wVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f47865w);
                float yVelocity = this.J.getYVelocity(this.f47865w);
                if (yVelocity > 0.0f) {
                    i12 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= wVar.f(this.f47861f) && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float g7 = wVar.g() * this.H.getHeight();
            if ((i10 & i11) != 0 && Math.abs(this.f47863r) > g7) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void l(e1 e1Var, boolean z10) {
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v vVar = (v) arrayList.get(size);
            if (vVar.e == e1Var) {
                vVar.v |= z10;
                if (!vVar.f47844w) {
                    vVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        e1 e1Var = this.f47860c;
        if (e1Var != null) {
            View view = e1Var.f47735a;
            if (o(view, x9, y3, this.f47864s + this.f47862n, this.v + this.f47863r)) {
                return view;
            }
        }
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v vVar = (v) arrayList.get(size);
            View view2 = vVar.e.f47735a;
            if (o(view2, x9, y3, vVar.f47842r, vVar.f47843s)) {
                return view2;
            }
        }
        return this.H.E(x9, y3);
    }

    public final void n(float[] fArr) {
        if ((this.E & 12) != 0) {
            fArr[0] = (this.f47864s + this.f47862n) - this.f47860c.f47735a.getLeft();
        } else {
            fArr[0] = this.f47860c.f47735a.getTranslationX();
        }
        if ((this.E & 3) != 0) {
            fArr[1] = (this.v + this.f47863r) - this.f47860c.f47735a.getTop();
        } else {
            fArr[1] = this.f47860c.f47735a.getTranslationY();
        }
    }

    public final void p(e1 e1Var) {
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
        if (!this.H.isLayoutRequested() && this.f47867y == 2) {
            w wVar = this.f47866x;
            wVar.getClass();
            int i13 = (int) (this.f47864s + this.f47862n);
            int i14 = (int) (this.v + this.f47863r);
            View view2 = e1Var.f47735a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.K;
                if (arrayList2 == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.L.clear();
                }
                int round = Math.round(this.f47864s + this.f47862n);
                int round2 = Math.round(this.v + this.f47863r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i15 = (round + width) / 2;
                int i16 = (round2 + height) / 2;
                p0 layoutManager = this.H.getLayoutManager();
                int r6 = layoutManager.r();
                int i17 = 0;
                while (i17 < r6) {
                    View q5 = layoutManager.q(i17);
                    if (q5 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q5.getBottom() >= round2 && q5.getTop() <= height && q5.getRight() >= round && q5.getLeft() <= width) {
                            e1 T = this.H.T(q5);
                            int abs5 = Math.abs(i15 - ((q5.getRight() + q5.getLeft()) / 2));
                            int abs6 = Math.abs(i16 - ((q5.getBottom() + q5.getTop()) / 2));
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
                    e1 e1Var2 = null;
                    int i23 = -1;
                    int i24 = 0;
                    while (i24 < size2) {
                        e1 e1Var3 = (e1) arrayList3.get(i24);
                        if (left2 > 0 && (right = e1Var3.f47735a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (e1Var3.f47735a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                                i23 = abs4;
                                e1Var2 = e1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = e1Var3.f47735a.getLeft() - i22) > 0 && e1Var3.f47735a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                            i23 = abs3;
                            e1Var2 = e1Var3;
                        }
                        if (top2 < 0 && (top = e1Var3.f47735a.getTop() - i14) > 0 && e1Var3.f47735a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                            i23 = abs2;
                            e1Var2 = e1Var3;
                        }
                        if (top2 > 0 && (bottom = e1Var3.f47735a.getBottom() - height2) < 0 && e1Var3.f47735a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                            i23 = abs;
                            e1Var2 = e1Var3;
                        }
                        i24++;
                        arrayList3 = arrayList;
                    }
                    if (e1Var2 == null) {
                        this.K.clear();
                        this.L.clear();
                        return;
                    }
                    int b10 = e1Var2.b();
                    e1Var.b();
                    if (wVar.n(this.H, e1Var, e1Var2)) {
                        this.f47866x.o(this.H, e1Var, e1Var2, b10, i22, i14);
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

    public final void r(s4.e1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: s4.z.r(s4.e1, int):void");
    }

    public boolean s() {
        return false;
    }

    public final void t(e1 e1Var) {
        RecyclerView recyclerView = this.H;
        w wVar = this.f47866x;
        int e = wVar.e(recyclerView, e1Var);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        if ((wVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (e1Var.f47735a.getParent() != this.H) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.J = VelocityTracker.obtain();
            this.f47863r = 0.0f;
            this.f47862n = 0.0f;
            r(e1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void u(int i10, int i11, MotionEvent motionEvent) {
        float x9 = motionEvent.getX(i11);
        float y3 = motionEvent.getY(i11);
        float f7 = x9 - this.d;
        this.f47862n = f7;
        this.f47863r = y3 - this.e;
        if ((i10 & 4) == 0) {
            this.f47862n = Math.max(0.0f, f7);
        }
        if ((i10 & 8) == 0) {
            this.f47862n = Math.min(0.0f, this.f47862n);
        }
        if ((i10 & 1) == 0) {
            this.f47863r = Math.max(0.0f, this.f47863r);
        }
        if ((i10 & 2) == 0) {
            this.f47863r = Math.min(0.0f, this.f47863r);
        }
    }

    @Override
    public final void c() {
    }
}
