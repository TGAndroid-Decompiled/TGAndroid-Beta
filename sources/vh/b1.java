package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.qw;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.x11;
public final class b1 extends tk0 {
    public vj0 f50937e3;
    public boolean f50938f3;
    public float f50939g3;
    public float f50940h3;
    public boolean f50941i3;
    public final SparseArray f50942j3;
    public final ArrayList f50943k3;
    public final ArrayList f50944l3;
    public final ArrayList f50945m3;
    public final ArrayList f50946n3;
    public final PorterDuffColorFilter f50947o3;

    public b1(Context context) {
        super(context, null);
        this.f50941i3 = false;
        this.f50942j3 = new SparseArray();
        this.f50943k3 = new ArrayList();
        this.f50944l3 = new ArrayList();
        this.f50945m3 = new ArrayList();
        this.f50946n3 = new ArrayList();
        this.f50947o3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void z1(b1 b1Var, int i10, int i11) {
        int i12;
        if (b1Var.f50937e3 != null && (b1Var.getLayoutManager() instanceof s4.r)) {
            s4.r rVar = (s4.r) b1Var.getLayoutManager();
            View m10 = rVar.m(i10);
            int L0 = rVar.L0();
            if ((m10 == null && Math.abs(i10 - L0) > rVar.J * 9.0f) || !tz.c()) {
                vj0 vj0Var = b1Var.f50937e3;
                if (rVar.L0() < i10) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                vj0Var.f31273b = i12;
                b1Var.f50937e3.d(i10, i11, false, false);
                return;
            }
            qw qwVar = new qw(b1Var, b1Var.getContext(), 5);
            qwVar.f48045a = i10;
            qwVar.f4253p = i11;
            rVar.w0(qwVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        z0 z0Var;
        int top;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.f50939g3, getWidth(), this.f50940h3);
        if (!this.f50938f3) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.E1;
        if (!rect.isEmpty()) {
            this.B1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f30623m2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.B1.draw(canvas);
            canvas.restore();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f50942j3;
            int size = sparseArray.size();
            arrayList = this.f50943k3;
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
            if (childAt instanceof a1) {
                a1 a1Var = (a1) childAt;
                if (a1Var.getY() < this.f50940h3 && a1Var.getY() + a1Var.getHeight() > this.f50939g3) {
                    if (this.f50941i3) {
                        top = (int) a1Var.getY();
                    } else {
                        top = a1Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) i0.a.v(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(a1Var);
                }
            }
        }
        ArrayList arrayList5 = this.f50946n3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f50945m3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.f50944l3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            a1 a1Var2 = (a1) arrayList7.get(i10);
            int R = RecyclerView.R(a1Var2);
            while (true) {
                if (i10 < arrayList5.size()) {
                    if (((z0) arrayList5.get(i10)).M == R) {
                        z0Var = (z0) arrayList5.get(i10);
                        arrayList5.remove(i10);
                        break;
                    }
                    i10++;
                } else {
                    z0Var = null;
                    break;
                }
            }
            if (z0Var == null) {
                if (!arrayList2.isEmpty()) {
                    z0Var = (z0) i0.a.v(1, arrayList2);
                } else {
                    z0Var = new z0(this);
                    z0Var.l(7);
                }
                z0Var.M = R;
                z0Var.e();
            }
            arrayList6.add(z0Var);
            z0Var.O = arrayList7;
            canvas.save();
            canvas.translate(a1Var2.getLeft(), a1Var2.getY());
            z0Var.N = a1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (a1Var2.getLeft() * 2);
            int measuredHeight = a1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                z0Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i13++;
            i10 = 0;
        }
        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((z0) arrayList5.get(i14));
                ((z0) arrayList5.get(i14)).O = null;
                ((z0) arrayList5.get(i14)).k();
            } else {
                ((z0) arrayList5.get(i14)).f();
            }
        }
        arrayList5.clear();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2 != null && !(childAt2 instanceof a1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(s4.n0 n0Var) {
        super.setLayoutManager(n0Var);
        this.f50937e3 = null;
        if (n0Var instanceof s4.a0) {
            vj0 vj0Var = new vj0(this, (s4.a0) n0Var);
            this.f50937e3 = vj0Var;
            vj0Var.f31277i = new x11(this, 2);
            vj0Var.h = new rh.d0(this, 24);
        }
    }
}
