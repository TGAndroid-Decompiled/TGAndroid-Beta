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
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Wallet.n5;
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
    public float f47819e;
    public float f47820f;
    public float h;
    public float f47821n;
    public float f47822r;
    public float f47823s;
    public float v;
    public final w f47825x;
    public final ArrayList f47816a = new ArrayList();
    public final float[] f47817b = new float[2];
    public d1 f47818c = null;
    public int f47824w = -1;
    public int f47826y = 0;
    public final ArrayList F = new ArrayList();
    public final n5 I = new n5(this, 6);
    public View M = null;
    public final lm0 P = new lm0(this);

    public z(w wVar) {
        this.f47825x = wVar;
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
        if (this.f47818c != null) {
            float[] fArr = this.f47817b;
            l(fArr);
            float f11 = fArr[0];
            f7 = fArr[1];
            f10 = f11;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        d1 d1Var = this.f47818c;
        int i10 = this.f47826y;
        w wVar = this.f47825x;
        wVar.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            u uVar = (u) arrayList.get(i11);
            d1 d1Var2 = uVar.f47788e;
            float f12 = uVar.f47785a;
            float f13 = uVar.f47787c;
            if (f12 == f13) {
                uVar.f47791r = d1Var2.f47658a.getTranslationX();
            } else {
                uVar.f47791r = e2.y(f13, f12, uVar.f47794x, f12);
            }
            float f14 = uVar.f47786b;
            float f15 = uVar.d;
            if (f14 == f15) {
                uVar.f47792s = d1Var2.f47658a.getTranslationY();
            } else {
                uVar.f47792s = e2.y(f15, f14, uVar.f47794x, f14);
            }
            int save = canvas.save();
            wVar.m(canvas, recyclerView, uVar.f47788e, uVar.f47791r, uVar.f47792s, uVar.f47789f, false);
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
        if (this.f47818c != null) {
            float[] fArr = this.f47817b;
            l(fArr);
            float f7 = fArr[0];
            float f10 = fArr[1];
        }
        d1 d1Var = this.f47818c;
        this.f47825x.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            View view = ((u) arrayList.get(i10)).f47788e.f47658a;
            canvas.restoreToCount(save);
        }
        if (d1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            u uVar = (u) arrayList.get(i11);
            boolean z11 = uVar.f47793w;
            if (z11 && !uVar.f47790n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void e(qm0 qm0Var) {
        RecyclerView recyclerView = this.H;
        if (recyclerView != qm0Var) {
            lm0 lm0Var = this.P;
            if (recyclerView != null) {
                recyclerView.p0(this);
                RecyclerView recyclerView2 = this.H;
                recyclerView2.E.remove(lm0Var);
                if (recyclerView2.F == lm0Var) {
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
                    this.f47825x.a(this.H, ((u) arrayList2.get(0)).f47788e);
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
                    xVar.f47807a = false;
                    this.O = null;
                }
                if (this.N != null) {
                    this.N = null;
                }
            }
            this.H = qm0Var;
            if (qm0Var != null) {
                qm0Var.getResources();
                this.f47820f = AndroidUtilities.dp(120.0f);
                this.h = AndroidUtilities.dp(800.0f);
                this.G = ViewConfiguration.get(this.H.getContext()).getScaledTouchSlop();
                this.H.i(this);
                this.H.E.add(lm0Var);
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
            if (this.f47821n > 0.0f) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.J;
            w wVar = this.f47825x;
            if (velocityTracker != null && this.f47824w > -1) {
                velocityTracker.computeCurrentVelocity(1000, wVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f47824w);
                float yVelocity = this.J.getYVelocity(this.f47824w);
                if (xVelocity > 0.0f) {
                    i12 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= wVar.f(this.f47820f) && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float g10 = wVar.g() * this.H.getWidth();
            if ((i10 & i11) != 0 && Math.abs(this.f47821n) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k10;
        if (this.f47818c == null && i10 == 2 && this.f47826y != 2) {
            w wVar = this.f47825x;
            if (wVar.j() && this.H.getScrollState() != 1) {
                p0 layoutManager = this.H.getLayoutManager();
                int i12 = this.f47824w;
                d1 d1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f47819e);
                    float f7 = this.G;
                    if ((abs >= f7 || abs2 >= f7) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k10 = k(motionEvent)) != null))) {
                        d1Var = this.H.T(k10);
                    }
                }
                if (d1Var != null) {
                    RecyclerView recyclerView = this.H;
                    int e7 = wVar.e(recyclerView, d1Var);
                    WeakHashMap weakHashMap = r0.i0.f46766a;
                    int b10 = (wVar.b(e7, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x10 = motionEvent.getX(i11);
                        float y3 = motionEvent.getY(i11);
                        float f10 = x10 - this.d;
                        float f11 = y3 - this.f47819e;
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
                            this.f47822r = 0.0f;
                            this.f47821n = 0.0f;
                            this.f47824w = motionEvent.getPointerId(0);
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
            if (this.f47822r > 0.0f) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.J;
            w wVar = this.f47825x;
            if (velocityTracker != null && this.f47824w > -1) {
                velocityTracker.computeCurrentVelocity(1000, wVar.h(this.h));
                float xVelocity = this.J.getXVelocity(this.f47824w);
                float yVelocity = this.J.getYVelocity(this.f47824w);
                if (yVelocity > 0.0f) {
                    i12 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= wVar.f(this.f47820f) && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float g10 = wVar.g() * this.H.getHeight();
            if ((i10 & i11) != 0 && Math.abs(this.f47822r) > g10) {
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
            if (uVar.f47788e == d1Var) {
                uVar.v |= z10;
                if (!uVar.f47793w) {
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
        d1 d1Var = this.f47818c;
        if (d1Var != null) {
            View view = d1Var.f47658a;
            if (m(view, x10, y3, this.f47823s + this.f47821n, this.v + this.f47822r)) {
                return view;
            }
        }
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            View view2 = uVar.f47788e.f47658a;
            if (m(view2, x10, y3, uVar.f47791r, uVar.f47792s)) {
                return view2;
            }
        }
        return this.H.E(x10, y3);
    }

    public final void l(float[] fArr) {
        if ((this.E & 12) != 0) {
            fArr[0] = (this.f47823s + this.f47821n) - this.f47818c.f47658a.getLeft();
        } else {
            fArr[0] = this.f47818c.f47658a.getTranslationX();
        }
        if ((this.E & 3) != 0) {
            fArr[1] = (this.v + this.f47822r) - this.f47818c.f47658a.getTop();
        } else {
            fArr[1] = this.f47818c.f47658a.getTranslationY();
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
        if (!this.H.isLayoutRequested() && this.f47826y == 2) {
            w wVar = this.f47825x;
            wVar.getClass();
            int i13 = (int) (this.f47823s + this.f47821n);
            int i14 = (int) (this.v + this.f47822r);
            View view2 = d1Var.f47658a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.K;
                if (arrayList2 == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.L.clear();
                }
                int round = Math.round(this.f47823s + this.f47821n);
                int round2 = Math.round(this.v + this.f47822r);
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
                        if (left2 > 0 && (right = d1Var3.f47658a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (d1Var3.f47658a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                                i23 = abs4;
                                d1Var2 = d1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = d1Var3.f47658a.getLeft() - i22) > 0 && d1Var3.f47658a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                            i23 = abs3;
                            d1Var2 = d1Var3;
                        }
                        if (top2 < 0 && (top = d1Var3.f47658a.getTop() - i14) > 0 && d1Var3.f47658a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                            i23 = abs2;
                            d1Var2 = d1Var3;
                        }
                        if (top2 > 0 && (bottom = d1Var3.f47658a.getBottom() - height2) < 0 && d1Var3.f47658a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
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
                        this.f47825x.o(this.H, d1Var, d1Var2, b10, i22, i14);
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
        w wVar = this.f47825x;
        int e7 = wVar.e(recyclerView, d1Var);
        WeakHashMap weakHashMap = r0.i0.f46766a;
        if ((wVar.b(e7, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (d1Var.f47658a.getParent() != this.H) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.J = VelocityTracker.obtain();
            this.f47822r = 0.0f;
            this.f47821n = 0.0f;
            p(d1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y3 = motionEvent.getY(i11);
        float f7 = x10 - this.d;
        this.f47821n = f7;
        this.f47822r = y3 - this.f47819e;
        if ((i10 & 4) == 0) {
            this.f47821n = Math.max(0.0f, f7);
        }
        if ((i10 & 8) == 0) {
            this.f47821n = Math.min(0.0f, this.f47821n);
        }
        if ((i10 & 1) == 0) {
            this.f47822r = Math.max(0.0f, this.f47822r);
        }
        if ((i10 & 2) == 0) {
            this.f47822r = Math.min(0.0f, this.f47822r);
        }
    }
}
