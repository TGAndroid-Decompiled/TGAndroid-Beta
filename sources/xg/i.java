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
import ci.aa;
import ci.h2;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.tr;
import w7.z5;
public abstract class i extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public final d6 f49859a;
    public final h2 f49860b;
    public final int f49861c;
    public final aa d;
    public final ArrayList f49862e;
    public q30 f49863f;
    public boolean h;
    public Utilities.Callback f49864n;
    public final e6 f49865r;
    public final LinearGradient f49866s;
    public final Paint v;
    public final Matrix f49867w;
    public final e6 f49868x;
    public final LinearGradient f49869y;

    public i(Context context, d6 d6Var) {
        super(context);
        int i10;
        this.f49862e = new ArrayList();
        tr trVar = tr.h;
        this.f49865r = new e6(this, 0L, 300L, trVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f49866s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f49867w = new Matrix();
        this.f49868x = new e6(this, 0L, 300L, trVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f49869y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f49859a = d6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, i6.w0(null, i6.f20822d6, false));
        aa aaVar = new aa(this, context);
        this.d = aaVar;
        addView(aaVar, z5.c(-2.0f, -1));
        h2 h2Var = new h2(this, context, 10);
        this.f49860b = h2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            h2Var.setRevealOnFocusHint(false);
        }
        h2Var.setTextSize(1, 16.0f);
        h2Var.setHintColor(i6.v0(i6.Xh, d6Var));
        h2Var.setTextColor(i6.v0(i6.G6, d6Var));
        int i11 = i6.Yh;
        h2Var.setCursorColor(i6.v0(i11, d6Var));
        h2Var.setHandlesColor(i6.v0(i11, d6Var));
        h2Var.setCursorWidth(1.5f);
        h2Var.setInputType(h2Var.getInputType() | 176);
        h2Var.setSingleLine(true);
        h2Var.setBackgroundDrawable(null);
        h2Var.setVerticalScrollBarEnabled(false);
        h2Var.setHorizontalScrollBarEnabled(false);
        h2Var.setTextIsSelectable(false);
        h2Var.setPadding(0, 0, 0, 0);
        h2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h2Var.setGravity(i10 | 16);
        aaVar.addView(h2Var);
        h2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f49861c = (int) h2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        h2Var.addTextChangedListener(new f(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.f49862e.contains(view)) {
            return;
        }
        q30 q30Var = (q30) view;
        if (q30Var.f29885y) {
            this.f49863f = null;
            aa aaVar = this.d;
            i iVar = (i) aaVar.f4714n;
            iVar.G = true;
            iVar.f49862e.remove(q30Var);
            q30Var.setOnClickListener(null);
            aaVar.c();
            aaVar.f4711c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            aaVar.f4710b = animatorSet;
            animatorSet.addListener(new cl0(22, aaVar, q30Var));
            ArrayList arrayList = aaVar.h;
            arrayList.clear();
            arrayList.add(q30Var);
            ArrayList arrayList2 = aaVar.d;
            arrayList2.clear();
            aaVar.f4712e.clear();
            arrayList2.add(q30Var);
            ArrayList arrayList3 = aaVar.f4713f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(q30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(q30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(q30Var, View.ALPHA, 1.0f, 0.0f));
            aaVar.requestLayout();
            hashSet.remove(Long.valueOf(q30Var.getUid()));
            runnable.run();
            return;
        }
        q30 q30Var2 = this.f49863f;
        if (q30Var2 != null) {
            q30Var2.a();
            this.f49863f = null;
        }
        this.f49863f = q30Var;
        q30Var.b();
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
            arrayList2 = this.f49862e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            q30 q30Var = (q30) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(q30Var.getUid()))) {
                arrayList4.add(q30Var);
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
                    if (((q30) arrayList2.get(i11)).getUid() == longValue) {
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
                        q30 q30Var2 = new q30(getContext(), tL_help_country, null, true, this.f49859a);
                        q30Var2.setOnClickListener(new e(this, hashSet, runnable, 0));
                        arrayList5.add(q30Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            aa aaVar = this.d;
            ArrayList arrayList6 = aaVar.f4712e;
            ArrayList arrayList7 = aaVar.d;
            ArrayList arrayList8 = aaVar.f4713f;
            i iVar = (i) aaVar.f4714n;
            iVar.G = true;
            ArrayList arrayList9 = iVar.f49862e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = aaVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((q30) arrayList4.get(i13)).setOnClickListener(null);
            }
            aaVar.c();
            if (z10) {
                aaVar.f4711c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                aaVar.f4710b = animatorSet;
                animatorSet.addListener(new h(aaVar, arrayList4, 0));
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
                    q30 q30Var3 = (q30) arrayList4.get(i14);
                    arrayList6.add(q30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(q30Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(q30Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(q30Var3, property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    q30 q30Var4 = (q30) arrayList5.get(i15);
                    arrayList7.add(q30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(q30Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(q30Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(q30Var4, property, 0.0f, 1.0f));
                }
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    aaVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                aaVar.f4710b = null;
                aaVar.f4711c = false;
                iVar.f49860b.setAllowDrawCursor(true);
            }
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                aaVar.addView((View) arrayList5.get(i17));
            }
            aaVar.requestLayout();
        }
        this.f49860b.setOnKeyListener(new g(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e7 = this.f49865r.e(canScrollVertically(-1));
        Matrix matrix = this.f49867w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f49866s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e10 = this.f49868x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f49869y.setLocalMatrix(matrix2);
        Paint paint2 = this.E;
        paint2.setAlpha((int) (e10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f49860b;
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
        aa aaVar = this.d;
        if (aaVar != null) {
            aaVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f49864n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f49860b.setText(charSequence);
        this.h = false;
    }
}
