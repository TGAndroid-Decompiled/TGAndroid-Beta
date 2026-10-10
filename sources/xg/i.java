package xg;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import ci.ba;
import ci.g2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.vl0;
import w7.x5;
public abstract class i extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public final e6 f51187a;
    public final g2 f51188b;
    public final int f51189c;
    public final ba d;
    public final ArrayList f51190e;
    public e40 f51191f;
    public boolean h;
    public Utilities.Callback f51192n;
    public final g6 f51193r;
    public final LinearGradient f51194s;
    public final Paint v;
    public final Matrix f51195w;
    public final g6 f51196x;
    public final LinearGradient f51197y;

    public i(Context context, e6 e6Var) {
        super(context);
        int i10;
        this.f51190e = new ArrayList();
        is isVar = is.h;
        this.f51193r = new g6(this, 0L, 300L, isVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f51194s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f51195w = new Matrix();
        this.f51196x = new g6(this, 0L, 300L, isVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f51197y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f51187a = e6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, i6.x0(null, i6.f20801d6, false));
        ba baVar = new ba(this, context);
        this.d = baVar;
        addView(baVar, x5.d(-2.0f, -1));
        g2 g2Var = new g2(this, context, 11);
        this.f51188b = g2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            g2Var.setRevealOnFocusHint(false);
        }
        g2Var.setTextSize(1, 16.0f);
        g2Var.setHintColor(i6.w0(i6.Xh, e6Var));
        g2Var.setTextColor(i6.w0(i6.G6, e6Var));
        int i11 = i6.Yh;
        g2Var.setCursorColor(i6.w0(i11, e6Var));
        g2Var.setHandlesColor(i6.w0(i11, e6Var));
        g2Var.setCursorWidth(1.5f);
        g2Var.setInputType(g2Var.getInputType() | 176);
        g2Var.setSingleLine(true);
        g2Var.setBackgroundDrawable(null);
        g2Var.setVerticalScrollBarEnabled(false);
        g2Var.setHorizontalScrollBarEnabled(false);
        g2Var.setTextIsSelectable(false);
        g2Var.setPadding(0, 0, 0, 0);
        g2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        g2Var.setGravity(i10 | 16);
        baVar.addView(g2Var);
        g2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f51189c = (int) g2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        g2Var.addTextChangedListener(new f(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.f51190e.contains(view)) {
            return;
        }
        e40 e40Var = (e40) view;
        if (e40Var.f25904y) {
            this.f51191f = null;
            ba baVar = this.d;
            i iVar = (i) baVar.f4801n;
            iVar.G = true;
            iVar.f51190e.remove(e40Var);
            e40Var.setOnClickListener(null);
            baVar.c();
            baVar.f4798c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            baVar.f4797b = animatorSet;
            animatorSet.addListener(new vl0(23, baVar, e40Var));
            ArrayList arrayList = baVar.h;
            arrayList.clear();
            arrayList.add(e40Var);
            ArrayList arrayList2 = baVar.d;
            arrayList2.clear();
            baVar.f4799e.clear();
            arrayList2.add(e40Var);
            ArrayList arrayList3 = baVar.f4800f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(e40Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(e40Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(e40Var, View.ALPHA, 1.0f, 0.0f));
            baVar.requestLayout();
            hashSet.remove(Long.valueOf(e40Var.getUid()));
            runnable.run();
            return;
        }
        e40 e40Var2 = this.f51191f;
        if (e40Var2 != null) {
            e40Var2.a();
            this.f51191f = null;
        }
        this.f51191f = e40Var;
        e40Var.b();
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i10;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        MessagesController messagesController;
        TLRPC.TL_help_country tL_help_country;
        ArrayList arrayList3 = arrayList;
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList2 = this.f51190e;
            if (i11 >= arrayList2.size()) {
                break;
            }
            e40 e40Var = (e40) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(e40Var.getUid()))) {
                arrayList4.add(e40Var);
            }
            i11++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    if (((e40) arrayList2.get(i12)).getUid() == longValue) {
                        messagesController = messagesController2;
                        break;
                    }
                    i12++;
                } else {
                    if (longValue >= 0) {
                        chat = messagesController2.getUser(l4);
                    } else {
                        chat = messagesController2.getChat(Long.valueOf(-longValue));
                    }
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj;
                            messagesController = messagesController2;
                            if (tL_help_country2.default_name.hashCode() == longValue) {
                                tL_help_country = tL_help_country2;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                messagesController2 = messagesController;
                            }
                        }
                    }
                    messagesController = messagesController2;
                    tL_help_country = chat;
                    if (tL_help_country != null) {
                        e40 e40Var2 = new e40(getContext(), tL_help_country, null, true, this.f51187a);
                        e40Var2.setOnClickListener(new e(this, hashSet, runnable, 0));
                        arrayList5.add(e40Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            ba baVar = this.d;
            ArrayList arrayList6 = baVar.f4799e;
            ArrayList arrayList7 = baVar.d;
            ArrayList arrayList8 = baVar.f4800f;
            i iVar = (i) baVar.f4801n;
            iVar.G = true;
            ArrayList arrayList9 = iVar.f51190e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = baVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((e40) arrayList4.get(i14)).setOnClickListener(null);
            }
            baVar.c();
            if (z10) {
                baVar.f4798c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                baVar.f4797b = animatorSet;
                animatorSet.addListener(new h(baVar, arrayList4, 0));
                arrayList8.clear();
                arrayList7.clear();
                arrayList6.clear();
                int i15 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i15 >= size2) {
                        break;
                    }
                    e40 e40Var3 = (e40) arrayList4.get(i15);
                    arrayList6.add(e40Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(e40Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(e40Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(e40Var3, property, 1.0f, 0.0f));
                    i15++;
                }
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    e40 e40Var4 = (e40) arrayList5.get(i16);
                    arrayList7.add(e40Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(e40Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(e40Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(e40Var4, property, 0.0f, 1.0f));
                }
                i10 = 0;
            } else {
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    baVar.removeView((View) arrayList4.get(i17));
                }
                arrayList10.clear();
                baVar.f4797b = null;
                i10 = 0;
                baVar.f4798c = false;
                iVar.f51188b.setAllowDrawCursor(true);
            }
            for (int i18 = i10; i18 < arrayList5.size(); i18++) {
                baVar.addView((View) arrayList5.get(i18));
            }
            baVar.requestLayout();
        }
        this.f51188b.setOnKeyListener(new g(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e7 = this.f51193r.e(canScrollVertically(-1));
        Matrix matrix = this.f51195w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f51194s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e10 = this.f51196x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f51197y.setLocalMatrix(matrix2);
        Paint paint2 = this.E;
        paint2.setAlpha((int) (e10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f51188b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.G) {
            this.G = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = q.C(20.0f, this.H, rect.top);
        rect.bottom = q.C(50.0f, this.H, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.I = f7;
        ba baVar = this.d;
        if (baVar != null) {
            baVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f51192n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f51188b.setText(charSequence);
        this.h = false;
    }
}
