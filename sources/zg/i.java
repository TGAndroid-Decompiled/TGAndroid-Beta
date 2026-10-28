package zg;

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
import fi.c2;
import fi.j9;
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
import org.telegram.messenger.t;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x30;
public abstract class i extends ScrollView implements p6 {
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public final u6 f52934a;
    public final c2 f52935b;
    public final int f52936c;
    public final j9 d;
    public final ArrayList e;
    public x30 f52937f;
    public boolean h;
    public Utilities.Callback f52938n;
    public int f52939r;
    public final h6 f52940s;
    public final LinearGradient v;
    public final Paint f52941w;
    public final Matrix f52942x;
    public final h6 f52943y;

    public i(Context context, u6 u6Var) {
        super(context);
        int i10;
        this.e = new ArrayList();
        ds dsVar = ds.h;
        this.f52940s = new h6(this, 0L, 300L, dsVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.v = linearGradient;
        Paint paint = new Paint(1);
        this.f52941w = paint;
        this.f52942x = new Matrix();
        this.f52943y = new h6(this, 0L, 300L, dsVar);
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
        this.f52934a = u6Var;
        setVerticalScrollBarEnabled(false);
        int x02 = y6.x0(null, y6.f23357d6, false);
        this.f52939r = x02;
        AndroidUtilities.setScrollViewEdgeEffectColor(this, x02);
        j9 j9Var = new j9(this, context);
        this.d = j9Var;
        addView(j9Var, kb1.g(-2.0f, -1));
        c2 c2Var = new c2(this, context, 11);
        this.f52935b = c2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            c2Var.setRevealOnFocusHint(false);
        }
        c2Var.setTextSize(1, 16.0f);
        f7.m(c2Var, 34, y6.Xh, u6Var);
        f7.V(c2Var, y6.G6, u6Var);
        int i11 = y6.Yh;
        f7.m(c2Var, 30, i11, u6Var);
        f7.m(c2Var, 36, i11, u6Var);
        c2Var.setCursorWidth(1.5f);
        c2Var.setInputType(c2Var.getInputType() | 176);
        c2Var.setSingleLine(true);
        c2Var.setBackgroundDrawable(null);
        c2Var.setVerticalScrollBarEnabled(false);
        c2Var.setHorizontalScrollBarEnabled(false);
        c2Var.setTextIsSelectable(false);
        c2Var.setPadding(0, 0, 0, 0);
        c2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        c2Var.setGravity(i10 | 16);
        j9Var.addView(c2Var);
        c2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f52936c = (int) c2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        c2Var.addTextChangedListener(new f(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.e.contains(view)) {
            return;
        }
        x30 x30Var = (x30) view;
        if (x30Var.f34655y) {
            this.f52937f = null;
            j9 j9Var = this.d;
            i iVar = (i) j9Var.f11068n;
            iVar.H = true;
            iVar.e.remove(x30Var);
            x30Var.setOnClickListener(null);
            j9Var.c();
            j9Var.f11066c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            j9Var.f11065b = animatorSet;
            animatorSet.addListener(new ml0(22, j9Var, x30Var));
            ArrayList arrayList = j9Var.h;
            arrayList.clear();
            arrayList.add(x30Var);
            ArrayList arrayList2 = j9Var.d;
            arrayList2.clear();
            j9Var.e.clear();
            arrayList2.add(x30Var);
            ArrayList arrayList3 = j9Var.f11067f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(x30Var, View.ALPHA, 1.0f, 0.0f));
            j9Var.requestLayout();
            hashSet.remove(Long.valueOf(x30Var.getUid()));
            runnable.run();
            return;
        }
        x30 x30Var2 = this.f52937f;
        if (x30Var2 != null) {
            x30Var2.a();
            this.f52937f = null;
        }
        this.f52937f = x30Var;
        x30Var.b();
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
            x30 x30Var = (x30) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(x30Var.getUid()))) {
                arrayList4.add(x30Var);
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
                    if (((x30) arrayList2.get(i12)).getUid() == longValue) {
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
                        x30 x30Var2 = new x30(getContext(), tL_help_country, null, true, this.f52934a);
                        x30Var2.setOnClickListener(new b51(this, hashSet, runnable, 3));
                        arrayList5.add(x30Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            j9 j9Var = this.d;
            ArrayList arrayList6 = j9Var.e;
            ArrayList arrayList7 = j9Var.d;
            ArrayList arrayList8 = j9Var.f11067f;
            i iVar = (i) j9Var.f11068n;
            iVar.H = true;
            ArrayList arrayList9 = iVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = j9Var.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((x30) arrayList4.get(i14)).setOnClickListener(null);
            }
            j9Var.c();
            if (z10) {
                j9Var.f11066c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                j9Var.f11065b = animatorSet;
                animatorSet.addListener(new h(j9Var, arrayList4, 0));
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
                    x30 x30Var3 = (x30) arrayList4.get(i15);
                    arrayList6.add(x30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var3, property, 1.0f, 0.0f));
                    i15++;
                }
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    x30 x30Var4 = (x30) arrayList5.get(i16);
                    arrayList7.add(x30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var4, property, 0.0f, 1.0f));
                }
                i10 = 0;
            } else {
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    j9Var.removeView((View) arrayList4.get(i17));
                }
                arrayList10.clear();
                j9Var.f11065b = null;
                i10 = 0;
                j9Var.f11066c = false;
                iVar.f52935b.setAllowDrawCursor(true);
            }
            for (int i18 = i10; i18 < arrayList5.size(); i18++) {
                j9Var.addView((View) arrayList5.get(i18));
            }
            j9Var.requestLayout();
        }
        this.f52935b.setOnKeyListener(new g(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f52940s.e(canScrollVertically(-1));
        Matrix matrix = this.f52942x;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.v.setLocalMatrix(matrix);
        Paint paint = this.f52941w;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e10 = this.f52943y.e(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (e10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f52935b;
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
        rect.top = t.D(20.0f, this.I, rect.top);
        rect.bottom = t.D(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.J = f7;
        j9 j9Var = this.d;
        if (j9Var != null) {
            j9Var.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f52938n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f52935b.setText(charSequence);
        this.h = false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = y6.x0(null, y6.f23357d6, false);
            int i10 = this.f52939r;
            if (i10 != 0 && x02 != i10) {
                this.f52939r = x02;
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
