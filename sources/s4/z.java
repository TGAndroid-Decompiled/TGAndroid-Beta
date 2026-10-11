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
import m.f3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Wallet.p5;
public class z extends o0 {
    public int E;
    public int G;
    public RecyclerView H;
    public VelocityTracker J;
    public ArrayList K;
    public ArrayList L;
    public f3 N;
    public x O;
    public Rect Q;
    public long R;
    public float d;
    public float f47909e;
    public float f47910f;
    public float h;
    public float f47911n;
    public float f47912r;
    public float f47913s;
    public float v;
    public final w f47915x;
    public final ArrayList f47906a = new ArrayList();
    public final float[] f47907b = new float[2];
    public d1 f47908c = null;
    public int f47914w = -1;
    public int f47916y = 0;
    public final ArrayList F = new ArrayList();
    public final p5 I = new p5(this, 6);
    public View M = null;
    public final nm0 P = new nm0(this);

    public z(w wVar) {
        this.f47915x = wVar;
    }

    public static boolean m(View view, float f7, float f10, float f11, float f12) {
        if (f7 >= f11 && f7 <= f11 + view.getWidth() && f10 >= f12 && f10 <= f12 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, a1 a1Var) {
        rect.setEmpty();
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        if (this.f47908c != null) {
            float[] fArr = this.f47907b;
            l(fArr);
            float f11 = fArr[0];
            f7 = fArr[1];
            f10 = f11;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        d1 d1Var = this.f47908c;
        int i10 = this.f47916y;
        w wVar = this.f47915x;
        wVar.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            u uVar = (u) arrayList.get(i11);
            d1 d1Var2 = uVar.f47878e;
            float f12 = uVar.f47875a;
            float f13 = uVar.f47877c;
            if (f12 == f13) {
                uVar.f47881r = d1Var2.f47748a.getTranslationX();
            } else {
                uVar.f47881r = e2.y(f13, f12, uVar.f47884x, f12);
            }
            float f14 = uVar.f47876b;
            float f15 = uVar.d;
            if (f14 == f15) {
                uVar.f47882s = d1Var2.f47748a.getTranslationY();
            } else {
                uVar.f47882s = e2.y(f15, f14, uVar.f47884x, f14);
            }
            int save = canvas.save();
            wVar.m(canvas, recyclerView, uVar.f47878e, uVar.f47881r, uVar.f47882s, uVar.f47879f, false);
            canvas.restoreToCount(save);
        }
        if (d1Var != null) {
            int save2 = canvas.save();
            wVar.m(canvas, recyclerView, d1Var, f10, f7, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f47908c != null) {
            float[] fArr = this.f47907b;
            l(fArr);
            float f7 = fArr[0];
            float f10 = fArr[1];
        }
        d1 d1Var = this.f47908c;
        this.f47915x.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            View view = ((u) arrayList.get(i10)).f47878e.f47748a;
            canvas.restoreToCount(save);
        }
        if (d1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            u uVar = (u) arrayList.get(i11);
            boolean z11 = uVar.f47883w;
            if (z11 && !uVar.f47880n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void e(sm0 sm0Var) {
        RecyclerView recyclerView = this.H;
        if (recyclerView != sm0Var) {
            nm0 nm0Var = this.P;
            if (recyclerView != null) {
                recyclerView.p0(this);
                RecyclerView recyclerView2 = this.H;
                recyclerView2.E.remove(nm0Var);
                if (recyclerView2.F == nm0Var) {
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
                    this.f47915x.a(this.H, ((u) arrayList2.get(0)).f47878e);
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
                    xVar.f47897a = false;
                    this.O = null;
                }
                if (this.N != null) {
                    this.N = null;
                }
            }
            this.H = sm0Var;
            if (sm0Var != null) {
                sm0Var.getResources();
                this.f47910f = AndroidUtilities.dp(120.0f);
                this.h = AndroidUtilities.dp(800.0f);
                this.G = ViewConfiguration.get(this.H.getContext()).getScaledTouchSlop();
                this.H.i(this);
                this.H.E.add(nm0Var);
                RecyclerView recyclerView3 = this.H;
                if (recyclerView3.P == null) {
                    recyclerView3.P = new ArrayList();
                }
                recyclerView3.P.add(this);
                this.O = new x(this);
                this.N = new f3(this.H.getContext(), this.O);
            }
        }
    }

    public final int g(d1 d1Var, int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 4;
            if (this.f47911n > 0.0f) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.J;
            w wVar = this.f47915x;
            if (velocityTracker != null && this.f47914w > -1) {
                velocityTracker.computeCurrentVelocity(1000, wVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f47914w);
                float yVelocity = this.J.getYVelocity(this.f47914w);
                if (xVelocity > 0.0f) {
                    i12 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= wVar.f(this.f47910f) && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float g10 = wVar.g() * this.H.getWidth();
            if ((i10 & i11) != 0 && Math.abs(this.f47911n) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k10;
        if (this.f47908c == null && i10 == 2 && this.f47916y != 2) {
            w wVar = this.f47915x;
            if (wVar.j() && this.H.getScrollState() != 1) {
                p0 layoutManager = this.H.getLayoutManager();
                int i12 = this.f47914w;
                d1 d1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f47909e);
                    float f7 = this.G;
                    if ((abs >= f7 || abs2 >= f7) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k10 = k(motionEvent)) != null))) {
                        d1Var = this.H.T(k10);
                    }
                }
                if (d1Var != null) {
                    RecyclerView recyclerView = this.H;
                    int e7 = wVar.e(recyclerView, d1Var);
                    WeakHashMap weakHashMap = r0.i0.f46856a;
                    int b10 = (wVar.b(e7, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x10 = motionEvent.getX(i11);
                        float y3 = motionEvent.getY(i11);
                        float f10 = x10 - this.d;
                        float f11 = y3 - this.f47909e;
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
                            this.f47912r = 0.0f;
                            this.f47911n = 0.0f;
                            this.f47914w = motionEvent.getPointerId(0);
                            p(d1Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int i(d1 d1Var, int i10) {
        int i11;
        if ((i10 & 3) != 0) {
            int i12 = 1;
            if (this.f47912r > 0.0f) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.J;
            w wVar = this.f47915x;
            if (velocityTracker != null && this.f47914w > -1) {
                velocityTracker.computeCurrentVelocity(1000, wVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f47914w);
                float yVelocity = this.J.getYVelocity(this.f47914w);
                if (yVelocity > 0.0f) {
                    i12 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= wVar.f(this.f47910f) && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float g10 = wVar.g() * this.H.getHeight();
            if ((i10 & i11) != 0 && Math.abs(this.f47912r) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void j(d1 d1Var, boolean z10) {
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar.f47878e == d1Var) {
                uVar.v |= z10;
                if (!uVar.f47883w) {
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
        d1 d1Var = this.f47908c;
        if (d1Var != null) {
            View view = d1Var.f47748a;
            if (m(view, x10, y3, this.f47913s + this.f47911n, this.v + this.f47912r)) {
                return view;
            }
        }
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            View view2 = uVar.f47878e.f47748a;
            if (m(view2, x10, y3, uVar.f47881r, uVar.f47882s)) {
                return view2;
            }
        }
        return this.H.E(x10, y3);
    }

    public final void l(float[] fArr) {
        if ((this.E & 12) != 0) {
            fArr[0] = (this.f47913s + this.f47911n) - this.f47908c.f47748a.getLeft();
        } else {
            fArr[0] = this.f47908c.f47748a.getTranslationX();
        }
        if ((this.E & 3) != 0) {
            fArr[1] = (this.v + this.f47912r) - this.f47908c.f47748a.getTop();
        } else {
            fArr[1] = this.f47908c.f47748a.getTranslationY();
        }
    }

    public final void n(d1 d1Var) {
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
        if (!this.H.isLayoutRequested() && this.f47916y == 2) {
            w wVar = this.f47915x;
            wVar.getClass();
            int i13 = (int) (this.f47913s + this.f47911n);
            int i14 = (int) (this.v + this.f47912r);
            View view2 = d1Var.f47748a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.K;
                if (arrayList2 == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.L.clear();
                }
                int round = Math.round(this.f47913s + this.f47911n);
                int round2 = Math.round(this.v + this.f47912r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i15 = (round + width) / 2;
                int i16 = (round2 + height) / 2;
                p0 layoutManager = this.H.getLayoutManager();
                int r10 = layoutManager.r();
                int i17 = 0;
                while (i17 < r10) {
                    View q6 = layoutManager.q(i17);
                    if (q6 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q6.getBottom() >= round2 && q6.getTop() <= height && q6.getRight() >= round && q6.getLeft() <= width) {
                            d1 T = this.H.T(q6);
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
                    d1 d1Var2 = null;
                    int i23 = -1;
                    int i24 = 0;
                    while (i24 < size2) {
                        d1 d1Var3 = (d1) arrayList3.get(i24);
                        if (left2 > 0 && (right = d1Var3.f47748a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (d1Var3.f47748a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                                i23 = abs4;
                                d1Var2 = d1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = d1Var3.f47748a.getLeft() - i22) > 0 && d1Var3.f47748a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                            i23 = abs3;
                            d1Var2 = d1Var3;
                        }
                        if (top2 < 0 && (top = d1Var3.f47748a.getTop() - i14) > 0 && d1Var3.f47748a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                            i23 = abs2;
                            d1Var2 = d1Var3;
                        }
                        if (top2 > 0 && (bottom = d1Var3.f47748a.getBottom() - height2) < 0 && d1Var3.f47748a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                            i23 = abs;
                            d1Var2 = d1Var3;
                        }
                        i24++;
                        arrayList3 = arrayList;
                    }
                    if (d1Var2 == null) {
                        this.K.clear();
                        this.L.clear();
                        return;
                    }
                    int b10 = d1Var2.b();
                    d1Var.b();
                    if (wVar.n(this.H, d1Var, d1Var2)) {
                        this.f47915x.o(this.H, d1Var, d1Var2, b10, i22, i14);
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

    public final void p(s4.d1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: s4.z.p(s4.d1, int):void");
    }

    public boolean q() {
        return false;
    }

    public final void r(d1 d1Var) {
        RecyclerView recyclerView = this.H;
        w wVar = this.f47915x;
        int e7 = wVar.e(recyclerView, d1Var);
        WeakHashMap weakHashMap = r0.i0.f46856a;
        if ((wVar.b(e7, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (d1Var.f47748a.getParent() != this.H) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.J = VelocityTracker.obtain();
            this.f47912r = 0.0f;
            this.f47911n = 0.0f;
            p(d1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y3 = motionEvent.getY(i11);
        float f7 = x10 - this.d;
        this.f47911n = f7;
        this.f47912r = y3 - this.f47909e;
        if ((i10 & 4) == 0) {
            this.f47911n = Math.max(0.0f, f7);
        }
        if ((i10 & 8) == 0) {
            this.f47911n = Math.min(0.0f, this.f47911n);
        }
        if ((i10 & 1) == 0) {
            this.f47912r = Math.max(0.0f, this.f47912r);
        }
        if ((i10 & 2) == 0) {
            this.f47912r = Math.min(0.0f, this.f47912r);
        }
    }
}
