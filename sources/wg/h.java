package wg;

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
import bi.nb;
import bi.q;
import bi.t2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.wr;
import w7.a6;
public abstract class h extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public final f6 f43998a;
    public final t2 f43999b;
    public final int f44000c;
    public final nb d;
    public final ArrayList e;
    public w30 f44001f;
    public boolean h;
    public Utilities.Callback f44002n;
    public final d6 f44003r;
    public final LinearGradient f44004s;
    public final Paint v;
    public final Matrix f44005w;
    public final d6 f44006x;
    public final LinearGradient f44007y;

    public h(Context context, f6 f6Var) {
        super(context);
        int i10;
        this.e = new ArrayList();
        wr wrVar = wr.h;
        this.f44003r = new d6(this, 0L, 300L, wrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f44004s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f44005w = new Matrix();
        this.f44006x = new d6(this, 0L, 300L, wrVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f44007y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f43998a = f6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, j6.w0(null, j6.f17928d6, false));
        nb nbVar = new nb(this, context);
        this.d = nbVar;
        addView(nbVar, a6.c(-2.0f, -1));
        t2 t2Var = new t2(this, context, 10);
        this.f43999b = t2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            t2Var.setRevealOnFocusHint(false);
        }
        t2Var.setTextSize(1, 16.0f);
        t2Var.setHintColor(j6.v0(j6.Xh, f6Var));
        t2Var.setTextColor(j6.v0(j6.G6, f6Var));
        int i11 = j6.Yh;
        t2Var.setCursorColor(j6.v0(i11, f6Var));
        t2Var.setHandlesColor(j6.v0(i11, f6Var));
        t2Var.setCursorWidth(1.5f);
        t2Var.setInputType(t2Var.getInputType() | 176);
        t2Var.setSingleLine(true);
        t2Var.setBackgroundDrawable(null);
        t2Var.setVerticalScrollBarEnabled(false);
        t2Var.setHorizontalScrollBarEnabled(false);
        t2Var.setTextIsSelectable(false);
        t2Var.setPadding(0, 0, 0, 0);
        t2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        t2Var.setGravity(i10 | 16);
        nbVar.addView(t2Var);
        t2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f44000c = (int) t2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        t2Var.addTextChangedListener(new e(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.e.contains(view)) {
            return;
        }
        w30 w30Var = (w30) view;
        if (w30Var.f28653y) {
            this.f44001f = null;
            nb nbVar = this.d;
            h hVar = (h) nbVar.f3251n;
            hVar.G = true;
            hVar.e.remove(w30Var);
            w30Var.setOnClickListener(null);
            nbVar.c();
            nbVar.f3249c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nbVar.f3248b = animatorSet;
            animatorSet.addListener(new vv0(20, (Object) nbVar, (Object) w30Var));
            ArrayList arrayList = nbVar.h;
            arrayList.clear();
            arrayList.add(w30Var);
            ArrayList arrayList2 = nbVar.d;
            arrayList2.clear();
            nbVar.e.clear();
            arrayList2.add(w30Var);
            ArrayList arrayList3 = nbVar.f3250f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(w30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(w30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(w30Var, View.ALPHA, 1.0f, 0.0f));
            nbVar.requestLayout();
            hashSet.remove(Long.valueOf(w30Var.getUid()));
            runnable.run();
            return;
        }
        w30 w30Var2 = this.f44001f;
        if (w30Var2 != null) {
            w30Var2.a();
            this.f44001f = null;
        }
        this.f44001f = w30Var;
        w30Var.b();
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
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
        int i10 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            w30 w30Var = (w30) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(w30Var.getUid()))) {
                arrayList4.add(w30Var);
            }
            i10++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList2.size()) {
                    if (((w30) arrayList2.get(i11)).getUid() == longValue) {
                        messagesController = messagesController2;
                        break;
                    }
                    i11++;
                } else {
                    if (longValue >= 0) {
                        chat = messagesController2.getUser(l4);
                    } else {
                        chat = messagesController2.getChat(Long.valueOf(-longValue));
                    }
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
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
                        w30 w30Var2 = new w30(getContext(), tL_help_country, null, true, this.f43998a);
                        w30Var2.setOnClickListener(new q(this, hashSet, runnable, 26));
                        arrayList5.add(w30Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            nb nbVar = this.d;
            ArrayList arrayList6 = nbVar.e;
            ArrayList arrayList7 = nbVar.d;
            ArrayList arrayList8 = nbVar.f3250f;
            h hVar = (h) nbVar.f3251n;
            hVar.G = true;
            ArrayList arrayList9 = hVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = nbVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((w30) arrayList4.get(i13)).setOnClickListener(null);
            }
            nbVar.c();
            if (z10) {
                nbVar.f3249c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                nbVar.f3248b = animatorSet;
                animatorSet.addListener(new g(nbVar, arrayList4, 0));
                arrayList8.clear();
                arrayList7.clear();
                arrayList6.clear();
                int i14 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i14 >= size2) {
                        break;
                    }
                    w30 w30Var3 = (w30) arrayList4.get(i14);
                    arrayList6.add(w30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var3, property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    w30 w30Var4 = (w30) arrayList5.get(i15);
                    arrayList7.add(w30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var4, property, 0.0f, 1.0f));
                }
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    nbVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                nbVar.f3248b = null;
                nbVar.f3249c = false;
                hVar.f43999b.setAllowDrawCursor(true);
            }
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                nbVar.addView((View) arrayList5.get(i17));
            }
            nbVar.requestLayout();
        }
        this.f43999b.setOnKeyListener(new f(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f44003r.e(canScrollVertically(-1));
        Matrix matrix = this.f44005w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f44004s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e7 = this.f44006x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f44007y.setLocalMatrix(matrix2);
        Paint paint2 = this.E;
        paint2.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f43999b;
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
        rect.top = a2.C(20.0f, this.H, rect.top);
        rect.bottom = a2.C(50.0f, this.H, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.I = f7;
        nb nbVar = this.d;
        if (nbVar != null) {
            nbVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f44002n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f43999b.setText(charSequence);
        this.h = false;
    }
}
