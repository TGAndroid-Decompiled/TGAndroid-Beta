package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.s20;
public abstract class t6 extends ScrollView implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.t5 D;
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.p6 f51971a;
    public final org.telegram.ui.ActionBar.n0 f51972b;
    public final int f51973c;
    public final qg.g d;
    public final ArrayList e;
    public s20 f51974f;
    public final i6 h;
    public boolean f51975n;
    public q20 f51976r;
    public final org.telegram.ui.Components.t5 f51977s;
    public final LinearGradient f51978w;
    public final Paint f51979x;
    public final Matrix f51980y;

    public t6(Context context, org.telegram.ui.ActionBar.p6 p6Var, i6 i6Var) {
        super(context);
        int i10;
        this.e = new ArrayList();
        gr grVar = gr.h;
        this.f51977s = new org.telegram.ui.Components.t5(this, 0L, 300L, grVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f51978w = linearGradient;
        Paint paint = new Paint(1);
        this.f51979x = paint;
        this.f51980y = new Matrix();
        this.D = new org.telegram.ui.Components.t5(this, 0L, 300L, grVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.E = linearGradient2;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f51971a = p6Var;
        this.h = i6Var;
        setVerticalScrollBarEnabled(false);
        org.telegram.messenger.i0.y3(this, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
        qg.g gVar = new qg.g(this, context);
        this.d = gVar;
        addView(gVar, w7.b6.c(-2.0f, -1));
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 11);
        this.f51972b = n0Var;
        if (Build.VERSION.SDK_INT >= 25) {
            n0Var.setRevealOnFocusHint(false);
        }
        n0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.m(n0Var, 34, org.telegram.ui.ActionBar.t6.Li, p6Var);
        org.telegram.ui.ActionBar.a7.V(n0Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.Mi;
        org.telegram.ui.ActionBar.a7.m(n0Var, 30, i11, p6Var);
        org.telegram.ui.ActionBar.a7.m(n0Var, 36, i11, p6Var);
        n0Var.setCursorWidth(1.5f);
        n0Var.setInputType(n0Var.getInputType() | 176);
        n0Var.setSingleLine(true);
        n0Var.setBackgroundDrawable(null);
        n0Var.setVerticalScrollBarEnabled(false);
        n0Var.setHorizontalScrollBarEnabled(false);
        n0Var.setTextIsSelectable(false);
        n0Var.setPadding(0, 0, 0, 0);
        n0Var.setImeOptions(268435462);
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n0Var.setGravity(i10 | 16);
        gVar.addView(n0Var);
        n0Var.setHintText(cd.L0(2131745853, null));
        this.f51973c = (int) n0Var.getPaint().measureText(cd.L0(2131745853, null));
        n0Var.addTextChangedListener(new rh.h0(this, 3));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.f51977s.d(canScrollVertically(-1));
        Matrix matrix = this.f51980y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f51978w.setLocalMatrix(matrix);
        Paint paint = this.f51979x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), org.telegram.messenger.i0.L(8.0f) + scrollY, paint);
        float d10 = this.D.d(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - org.telegram.messenger.i0.L(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (d10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - org.telegram.messenger.i0.L(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.H) {
            this.H = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.m5.C(20.0f, this.I, rect.top);
        rect.bottom = org.telegram.messenger.m5.C(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.J = f7;
        qg.g gVar = this.d;
        if (gVar != null) {
            gVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(q20 q20Var) {
        this.f51976r = q20Var;
    }

    public void setText(CharSequence charSequence) {
        this.f51975n = true;
        this.f51972b.setText(charSequence);
        this.f51975n = false;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f51971a;
        org.telegram.ui.ActionBar.n0 n0Var = this.f51972b;
        if (n0Var != null) {
            try {
                n0Var.setHintColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Li, p6Var));
                int i10 = org.telegram.ui.ActionBar.t6.Mi;
                n0Var.setCursorColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
                n0Var.setHandlesColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        org.telegram.messenger.i0.y3(this, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
