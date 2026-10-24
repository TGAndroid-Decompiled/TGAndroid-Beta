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
import ei.e2;
import ei.n9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.zr;
import w7.z5;
public abstract class h extends ScrollView implements b6 {
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public final g6 f50595a;
    public final e2 f50596b;
    public final int f50597c;
    public final n9 d;
    public final ArrayList e;
    public t30 f50598f;
    public boolean h;
    public Utilities.Callback f50599n;
    public int f50600r;
    public final d6 f50601s;
    public final LinearGradient v;
    public final Paint f50602w;
    public final Matrix f50603x;
    public final d6 f50604y;

    public h(Context context, g6 g6Var) {
        super(context);
        int i10;
        this.e = new ArrayList();
        zr zrVar = zr.h;
        this.f50601s = new d6(this, 0L, 300L, zrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.v = linearGradient;
        Paint paint = new Paint(1);
        this.f50602w = paint;
        this.f50603x = new Matrix();
        this.f50604y = new d6(this, 0L, 300L, zrVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.E = linearGradient2;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f50595a = g6Var;
        setVerticalScrollBarEnabled(false);
        int x02 = k6.x0(null, k6.f21184d6, false);
        this.f50600r = x02;
        AndroidUtilities.setScrollViewEdgeEffectColor(this, x02);
        n9 n9Var = new n9(this, context);
        this.d = n9Var;
        addView(n9Var, z5.c(-2.0f, -1));
        e2 e2Var = new e2(this, context, 11);
        this.f50596b = e2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            e2Var.setRevealOnFocusHint(false);
        }
        e2Var.setTextSize(1, 16.0f);
        r6.m(e2Var, 34, k6.Xh, g6Var);
        r6.W(e2Var, k6.G6, g6Var);
        int i11 = k6.Yh;
        r6.m(e2Var, 30, i11, g6Var);
        r6.m(e2Var, 36, i11, g6Var);
        e2Var.setCursorWidth(1.5f);
        e2Var.setInputType(e2Var.getInputType() | 176);
        e2Var.setSingleLine(true);
        e2Var.setBackgroundDrawable(null);
        e2Var.setVerticalScrollBarEnabled(false);
        e2Var.setHorizontalScrollBarEnabled(false);
        e2Var.setTextIsSelectable(false);
        e2Var.setPadding(0, 0, 0, 0);
        e2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e2Var.setGravity(i10 | 16);
        n9Var.addView(e2Var);
        e2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f50597c = (int) e2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        e2Var.addTextChangedListener(new e(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.e.contains(view)) {
            return;
        }
        t30 t30Var = (t30) view;
        if (t30Var.f30711y) {
            this.f50598f = null;
            n9 n9Var = this.d;
            h hVar = (h) n9Var.f9538n;
            hVar.H = true;
            hVar.e.remove(t30Var);
            t30Var.setOnClickListener(null);
            n9Var.c();
            n9Var.f9536c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            n9Var.f9535b = animatorSet;
            animatorSet.addListener(new pl0(23, n9Var, t30Var));
            ArrayList arrayList = n9Var.h;
            arrayList.clear();
            arrayList.add(t30Var);
            ArrayList arrayList2 = n9Var.d;
            arrayList2.clear();
            n9Var.e.clear();
            arrayList2.add(t30Var);
            ArrayList arrayList3 = n9Var.f9537f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(t30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(t30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(t30Var, View.ALPHA, 1.0f, 0.0f));
            n9Var.requestLayout();
            hashSet.remove(Long.valueOf(t30Var.getUid()));
            runnable.run();
            return;
        }
        t30 t30Var2 = this.f50598f;
        if (t30Var2 != null) {
            t30Var2.a();
            this.f50598f = null;
        }
        this.f50598f = t30Var;
        t30Var.b();
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
            t30 t30Var = (t30) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(t30Var.getUid()))) {
                arrayList4.add(t30Var);
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
                    if (((t30) arrayList2.get(i12)).getUid() == longValue) {
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
                        t30 t30Var2 = new t30(getContext(), tL_help_country, null, true, this.f50595a);
                        t30Var2.setOnClickListener(new s41(this, hashSet, runnable, 3));
                        arrayList5.add(t30Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            n9 n9Var = this.d;
            ArrayList arrayList6 = n9Var.e;
            ArrayList arrayList7 = n9Var.d;
            ArrayList arrayList8 = n9Var.f9537f;
            h hVar = (h) n9Var.f9538n;
            hVar.H = true;
            ArrayList arrayList9 = hVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = n9Var.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((t30) arrayList4.get(i14)).setOnClickListener(null);
            }
            n9Var.c();
            if (z10) {
                n9Var.f9536c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                n9Var.f9535b = animatorSet;
                animatorSet.addListener(new g(n9Var, arrayList4, 0));
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
                    t30 t30Var3 = (t30) arrayList4.get(i15);
                    arrayList6.add(t30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(t30Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(t30Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(t30Var3, property, 1.0f, 0.0f));
                    i15++;
                }
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    t30 t30Var4 = (t30) arrayList5.get(i16);
                    arrayList7.add(t30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(t30Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(t30Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(t30Var4, property, 0.0f, 1.0f));
                }
                i10 = 0;
            } else {
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    n9Var.removeView((View) arrayList4.get(i17));
                }
                arrayList10.clear();
                n9Var.f9535b = null;
                i10 = 0;
                n9Var.f9536c = false;
                hVar.f50596b.setAllowDrawCursor(true);
            }
            for (int i18 = i10; i18 < arrayList5.size(); i18++) {
                n9Var.addView((View) arrayList5.get(i18));
            }
            n9Var.requestLayout();
        }
        this.f50596b.setOnKeyListener(new f(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f50601s.e(canScrollVertically(-1));
        Matrix matrix = this.f50603x;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.v.setLocalMatrix(matrix);
        Paint paint = this.f50602w;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e7 = this.f50604y.e(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f50596b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.H) {
            this.H = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = v0.C(20.0f, this.I, rect.top);
        rect.bottom = v0.C(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.J = f7;
        n9 n9Var = this.d;
        if (n9Var != null) {
            n9Var.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f50599n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f50596b.setText(charSequence);
        this.h = false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = k6.x0(null, k6.f21184d6, false);
            int i10 = this.f50600r;
            if (i10 != 0 && x02 != i10) {
                this.f50600r = x02;
                AndroidUtilities.setScrollViewEdgeEffectColor(this, x02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
