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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v30;
import w7.z5;
public abstract class h extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public final d6 f50193a;
    public final e2 f50194b;
    public final int f50195c;
    public final n9 d;
    public final ArrayList e;
    public v30 f50196f;
    public boolean h;
    public Utilities.Callback f50197n;
    public final f6 f50198r;
    public final LinearGradient f50199s;
    public final Paint v;
    public final Matrix f50200w;
    public final f6 f50201x;
    public final LinearGradient f50202y;

    public h(Context context, d6 d6Var) {
        super(context);
        int i10;
        this.e = new ArrayList();
        bs bsVar = bs.h;
        this.f50198r = new f6(this, 0L, 300L, bsVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f50199s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f50200w = new Matrix();
        this.f50201x = new f6(this, 0L, 300L, bsVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f50202y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f50193a = d6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, h6.x0(null, h6.f20993d6, false));
        n9 n9Var = new n9(this, context);
        this.d = n9Var;
        addView(n9Var, z5.d(-2.0f, -1));
        e2 e2Var = new e2(this, context, 11);
        this.f50194b = e2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            e2Var.setRevealOnFocusHint(false);
        }
        e2Var.setTextSize(1, 16.0f);
        e2Var.setHintColor(h6.w0(h6.Xh, d6Var));
        e2Var.setTextColor(h6.w0(h6.G6, d6Var));
        int i11 = h6.Yh;
        e2Var.setCursorColor(h6.w0(i11, d6Var));
        e2Var.setHandlesColor(h6.w0(i11, d6Var));
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
        this.f50195c = (int) e2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        e2Var.addTextChangedListener(new e(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.e.contains(view)) {
            return;
        }
        v30 v30Var = (v30) view;
        if (v30Var.f31168y) {
            this.f50196f = null;
            n9 n9Var = this.d;
            h hVar = (h) n9Var.f9530n;
            hVar.G = true;
            hVar.e.remove(v30Var);
            v30Var.setOnClickListener(null);
            n9Var.c();
            n9Var.f9528c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            n9Var.f9527b = animatorSet;
            animatorSet.addListener(new ml0(23, n9Var, v30Var));
            ArrayList arrayList = n9Var.h;
            arrayList.clear();
            arrayList.add(v30Var);
            ArrayList arrayList2 = n9Var.d;
            arrayList2.clear();
            n9Var.e.clear();
            arrayList2.add(v30Var);
            ArrayList arrayList3 = n9Var.f9529f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(v30Var, View.ALPHA, 1.0f, 0.0f));
            n9Var.requestLayout();
            hashSet.remove(Long.valueOf(v30Var.getUid()));
            runnable.run();
            return;
        }
        v30 v30Var2 = this.f50196f;
        if (v30Var2 != null) {
            v30Var2.a();
            this.f50196f = null;
        }
        this.f50196f = v30Var;
        v30Var.b();
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
            v30 v30Var = (v30) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(v30Var.getUid()))) {
                arrayList4.add(v30Var);
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
                    if (((v30) arrayList2.get(i12)).getUid() == longValue) {
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
                        v30 v30Var2 = new v30(getContext(), tL_help_country, null, true, this.f50193a);
                        v30Var2.setOnClickListener(new m41(this, hashSet, runnable, 3));
                        arrayList5.add(v30Var2);
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
            ArrayList arrayList8 = n9Var.f9529f;
            h hVar = (h) n9Var.f9530n;
            hVar.G = true;
            ArrayList arrayList9 = hVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = n9Var.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((v30) arrayList4.get(i14)).setOnClickListener(null);
            }
            n9Var.c();
            if (z10) {
                n9Var.f9528c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                n9Var.f9527b = animatorSet;
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
                    v30 v30Var3 = (v30) arrayList4.get(i15);
                    arrayList6.add(v30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(v30Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(v30Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(v30Var3, property, 1.0f, 0.0f));
                    i15++;
                }
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    v30 v30Var4 = (v30) arrayList5.get(i16);
                    arrayList7.add(v30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(v30Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(v30Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(v30Var4, property, 0.0f, 1.0f));
                }
                i10 = 0;
            } else {
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    n9Var.removeView((View) arrayList4.get(i17));
                }
                arrayList10.clear();
                n9Var.f9527b = null;
                i10 = 0;
                n9Var.f9528c = false;
                hVar.f50194b.setAllowDrawCursor(true);
            }
            for (int i18 = i10; i18 < arrayList5.size(); i18++) {
                n9Var.addView((View) arrayList5.get(i18));
            }
            n9Var.requestLayout();
        }
        this.f50194b.setOnKeyListener(new f(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f50198r.e(canScrollVertically(-1));
        Matrix matrix = this.f50200w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f50199s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e7 = this.f50201x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f50202y.setLocalMatrix(matrix2);
        Paint paint2 = this.E;
        paint2.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f50194b;
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
        rect.top = g0.C(20.0f, this.H, rect.top);
        rect.bottom = g0.C(50.0f, this.H, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.I = f7;
        n9 n9Var = this.d;
        if (n9Var != null) {
            n9Var.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f50197n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f50194b.setText(charSequence);
        this.h = false;
    }
}
