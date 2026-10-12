package yg;

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
import di.aa;
import di.g2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.z30;
import w7.a6;
public abstract class i extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public final c6 f48767a;
    public final g2 f48768b;
    public final int f48769c;
    public final aa d;
    public final ArrayList e;
    public z30 f48770f;
    public boolean h;
    public Utilities.Callback f48771n;
    public final g6 f48772r;
    public final LinearGradient f48773s;
    public final Paint v;
    public final Matrix f48774w;
    public final g6 f48775x;
    public final LinearGradient f48776y;

    public i(Context context, c6 c6Var) {
        super(context);
        int i10;
        this.e = new ArrayList();
        es esVar = es.h;
        this.f48772r = new g6(this, 0L, 300L, esVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f48773s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f48774w = new Matrix();
        this.f48775x = new g6(this, 0L, 300L, esVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f48776y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f48767a = c6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
        aa aaVar = new aa(this, context);
        this.d = aaVar;
        addView(aaVar, a6.d(-2.0f, -1));
        g2 g2Var = new g2(this, context, 11);
        this.f48768b = g2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            g2Var.setRevealOnFocusHint(false);
        }
        g2Var.setTextSize(1, 16.0f);
        g2Var.setHintColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        g2Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.Yh;
        g2Var.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        g2Var.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
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
        aaVar.addView(g2Var);
        g2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f48769c = (int) g2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        g2Var.addTextChangedListener(new f(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.e.contains(view)) {
            return;
        }
        z30 z30Var = (z30) view;
        if (z30Var.f31754y) {
            this.f48770f = null;
            aa aaVar = this.d;
            i iVar = (i) aaVar.f6636n;
            iVar.G = true;
            iVar.e.remove(z30Var);
            z30Var.setOnClickListener(null);
            aaVar.c();
            aaVar.f6634c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            aaVar.f6633b = animatorSet;
            animatorSet.addListener(new ql0(23, aaVar, z30Var));
            ArrayList arrayList = aaVar.h;
            arrayList.clear();
            arrayList.add(z30Var);
            ArrayList arrayList2 = aaVar.d;
            arrayList2.clear();
            aaVar.e.clear();
            arrayList2.add(z30Var);
            ArrayList arrayList3 = aaVar.f6635f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(z30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(z30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(z30Var, View.ALPHA, 1.0f, 0.0f));
            aaVar.requestLayout();
            hashSet.remove(Long.valueOf(z30Var.getUid()));
            runnable.run();
            return;
        }
        z30 z30Var2 = this.f48770f;
        if (z30Var2 != null) {
            z30Var2.a();
            this.f48770f = null;
        }
        this.f48770f = z30Var;
        z30Var.b();
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
            arrayList2 = this.e;
            if (i11 >= arrayList2.size()) {
                break;
            }
            z30 z30Var = (z30) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(z30Var.getUid()))) {
                arrayList4.add(z30Var);
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
                    if (((z30) arrayList2.get(i12)).getUid() == longValue) {
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
                        z30 z30Var2 = new z30(getContext(), tL_help_country, null, true, this.f48767a);
                        z30Var2.setOnClickListener(new e(this, hashSet, runnable, 0));
                        arrayList5.add(z30Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            aa aaVar = this.d;
            ArrayList arrayList6 = aaVar.e;
            ArrayList arrayList7 = aaVar.d;
            ArrayList arrayList8 = aaVar.f6635f;
            i iVar = (i) aaVar.f6636n;
            iVar.G = true;
            ArrayList arrayList9 = iVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = aaVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((z30) arrayList4.get(i14)).setOnClickListener(null);
            }
            aaVar.c();
            if (z10) {
                aaVar.f6634c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                aaVar.f6633b = animatorSet;
                animatorSet.addListener(new h(aaVar, arrayList4, 0));
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
                    z30 z30Var3 = (z30) arrayList4.get(i15);
                    arrayList6.add(z30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var3, property, 1.0f, 0.0f));
                    i15++;
                }
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    z30 z30Var4 = (z30) arrayList5.get(i16);
                    arrayList7.add(z30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var4, property, 0.0f, 1.0f));
                }
                i10 = 0;
            } else {
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    aaVar.removeView((View) arrayList4.get(i17));
                }
                arrayList10.clear();
                aaVar.f6633b = null;
                i10 = 0;
                aaVar.f6634c = false;
                iVar.f48768b.setAllowDrawCursor(true);
            }
            for (int i18 = i10; i18 < arrayList5.size(); i18++) {
                aaVar.addView((View) arrayList5.get(i18));
            }
            aaVar.requestLayout();
        }
        this.f48768b.setOnKeyListener(new g(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f48772r.e(canScrollVertically(-1));
        Matrix matrix = this.f48774w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f48773s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e7 = this.f48775x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f48776y.setLocalMatrix(matrix2);
        Paint paint2 = this.E;
        paint2.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f48768b;
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
        rect.top = yh.c(20.0f, this.H, rect.top);
        rect.bottom = yh.c(50.0f, this.H, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.I = f7;
        aa aaVar = this.d;
        if (aaVar != null) {
            aaVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f48771n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f48768b.setText(charSequence);
        this.h = false;
    }
}
