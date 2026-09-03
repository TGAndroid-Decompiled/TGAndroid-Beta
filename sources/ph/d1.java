package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.k51;
public final class d1 extends rl0 {
    public c2.z U2;
    public boolean V2;
    public float W2;
    public float X2;
    public boolean Y2;
    public final SparseArray Z2;
    public final ArrayList f41467a3;
    public final ArrayList f41468b3;
    public final ArrayList c3;
    public final ArrayList f41469d3;
    public final PorterDuffColorFilter f41470e3;

    public d1(Context context) {
        super(context, null);
        this.Y2 = false;
        this.Z2 = new SparseArray();
        this.f41467a3 = new ArrayList();
        this.f41468b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.f41469d3 = new ArrayList();
        this.f41470e3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void v1(d1 d1Var, int i10, int i11) {
        int i12;
        if (d1Var.U2 != null && (d1Var.getLayoutManager() instanceof f2.w)) {
            f2.w wVar = (f2.w) d1Var.getLayoutManager();
            View m9 = wVar.m(i10);
            int L0 = wVar.L0();
            if ((m9 == null && Math.abs(i10 - L0) > wVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
                c2.z zVar = d1Var.U2;
                if (wVar.L0() < i10) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                zVar.f2062b = i12;
                d1Var.U2.c(i10, i11, false, false);
                return;
            }
            dx dxVar = new dx(d1Var, d1Var.getContext(), 5);
            dxVar.f5712a = i10;
            dxVar.f46707p = i11;
            wVar.w0(dxVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        b1 b1Var;
        int top;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.W2, getWidth(), this.X2);
        if (!this.V2) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.D1;
        if (!rect.isEmpty()) {
            this.A1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f28509l2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.A1.draw(canvas);
            canvas.restore();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.Z2;
            int size = sparseArray.size();
            arrayList = this.f41467a3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof c1) {
                c1 c1Var = (c1) childAt;
                if (c1Var.getY() < this.X2 && c1Var.getY() + c1Var.getHeight() > this.W2) {
                    if (this.Y2) {
                        top = (int) c1Var.getY();
                    } else {
                        top = c1Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) e2.c.g(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(c1Var);
                }
            }
        }
        ArrayList arrayList5 = this.f41469d3;
        arrayList5.clear();
        ArrayList arrayList6 = this.c3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.f41468b3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            c1 c1Var2 = (c1) arrayList7.get(i10);
            int R = RecyclerView.R(c1Var2);
            while (true) {
                if (i10 < arrayList5.size()) {
                    if (((b1) arrayList5.get(i10)).J == R) {
                        b1Var = (b1) arrayList5.get(i10);
                        arrayList5.remove(i10);
                        break;
                    }
                    i10++;
                } else {
                    b1Var = null;
                    break;
                }
            }
            if (b1Var == null) {
                if (!arrayList2.isEmpty()) {
                    b1Var = (b1) e2.c.g(1, arrayList2);
                } else {
                    b1Var = new b1(this);
                    b1Var.l(7);
                }
                b1Var.J = R;
                b1Var.e();
            }
            arrayList6.add(b1Var);
            b1Var.L = arrayList7;
            canvas.save();
            canvas.translate(c1Var2.getLeft(), c1Var2.getY());
            b1Var.K = c1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (c1Var2.getLeft() * 2);
            int measuredHeight = c1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                b1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i13++;
            i10 = 0;
        }
        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((b1) arrayList5.get(i14));
                ((b1) arrayList5.get(i14)).L = null;
                ((b1) arrayList5.get(i14)).k();
            } else {
                ((b1) arrayList5.get(i14)).f();
            }
        }
        arrayList5.clear();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2 != null && !(childAt2 instanceof c1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
                canvas.save();
                canvas.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
        canvas.restoreToCount(saveCount);
    }

    @Override
    public final void setLayoutManager(f2.v0 v0Var) {
        super.setLayoutManager(v0Var);
        this.U2 = null;
        if (v0Var instanceof f2.i0) {
            c2.z zVar = new c2.z(this, (f2.i0) v0Var);
            this.U2 = zVar;
            zVar.f2066i = new k51(this, 1);
            zVar.h = new lh.m5(this, 25);
        }
    }
}
