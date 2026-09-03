package qh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.pr;
public abstract class z7 extends ScrollView {
    public final Paint B;
    public final Matrix C;
    public boolean D;
    public int E;
    public float F;
    public int G;
    public boolean H;
    public final lg.f f46412a;
    public final int f46413b;
    public final lg.j f46414c;
    public final ArrayList d;
    public p30 f46415e;
    public final o7 f46416f;
    public boolean h;
    public Utilities.Callback f46417n;
    public final org.telegram.ui.Components.z5 f46418r;
    public final LinearGradient f46419s;
    public final Paint v;
    public final Matrix f46420w;
    public final org.telegram.ui.Components.z5 f46421x;
    public final LinearGradient f46422y;

    public z7(Context context, org.telegram.ui.ActionBar.g6 g6Var, o7 o7Var) {
        super(context);
        int i10;
        this.d = new ArrayList();
        pr prVar = pr.h;
        this.f46418r = new org.telegram.ui.Components.z5(this, 0L, 300L, prVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f46419s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f46420w = new Matrix();
        this.f46421x = new org.telegram.ui.Components.z5(this, 0L, 300L, prVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f46422y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.B = paint2;
        this.C = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f46416f = o7Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        lg.j jVar = new lg.j(this, context);
        this.f46414c = jVar;
        addView(jVar, k7.c6.c(-2.0f, -1));
        lg.f fVar = new lg.f(this, context, 10);
        this.f46412a = fVar;
        if (Build.VERSION.SDK_INT >= 25) {
            fVar.setRevealOnFocusHint(false);
        }
        fVar.setTextSize(1, 16.0f);
        fVar.setHintColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xh, g6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.Yh;
        fVar.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        fVar.setHandlesColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        fVar.setCursorWidth(1.5f);
        fVar.setInputType(fVar.getInputType() | 176);
        fVar.setSingleLine(true);
        fVar.setBackgroundDrawable(null);
        fVar.setVerticalScrollBarEnabled(false);
        fVar.setHorizontalScrollBarEnabled(false);
        fVar.setTextIsSelectable(false);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        fVar.setGravity(i10 | 16);
        jVar.addView(fVar);
        fVar.setHintText(LocaleController.getString(R.string.Search));
        this.f46413b = (int) fVar.getPaint().measureText(LocaleController.getString(R.string.Search));
        fVar.addTextChangedListener(new x7(this));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e6 = this.f46418r.e(canScrollVertically(-1));
        Matrix matrix = this.f46420w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f46419s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e6 * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e10 = this.f46421x.e(canScrollVertically(1));
        Matrix matrix2 = this.C;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f46422y.setLocalMatrix(matrix2);
        Paint paint2 = this.B;
        paint2.setAlpha((int) (e10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        if (this.D) {
            this.D = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.y3.C(20.0f, this.E, rect.top);
        rect.bottom = org.telegram.messenger.y3.C(50.0f, this.E, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    public void setContainerHeight(float f10) {
        this.F = f10;
        lg.j jVar = this.f46414c;
        if (jVar != null) {
            jVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f46417n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f46412a.setText(charSequence);
        this.h = false;
    }
}
