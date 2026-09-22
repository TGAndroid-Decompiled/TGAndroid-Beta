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
import ci.ea;
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
import org.telegram.messenger.y0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qr;
import w7.x5;
public abstract class i extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public final e6 f45768a;
    public final h2 f45769b;
    public final int f45770c;
    public final ea d;
    public final ArrayList e;
    public m30 f45771f;
    public boolean h;
    public Utilities.Callback f45772n;
    public final c6 f45773r;
    public final LinearGradient f45774s;
    public final Paint v;
    public final Matrix f45775w;
    public final c6 f45776x;
    public final LinearGradient f45777y;

    public i(Context context, e6 e6Var) {
        super(context);
        int i10;
        this.e = new ArrayList();
        qr qrVar = qr.h;
        this.f45773r = new c6(this, 0L, 300L, qrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f45774s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f45775w = new Matrix();
        this.f45776x = new c6(this, 0L, 300L, qrVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f45777y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f45768a = e6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, i6.w0(null, i6.f18834d6, false));
        ea eaVar = new ea(this, context);
        this.d = eaVar;
        addView(eaVar, x5.c(-2.0f, -1));
        h2 h2Var = new h2(this, context, 10);
        this.f45769b = h2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            h2Var.setRevealOnFocusHint(false);
        }
        h2Var.setTextSize(1, 16.0f);
        h2Var.setHintColor(i6.v0(i6.Xh, e6Var));
        h2Var.setTextColor(i6.v0(i6.G6, e6Var));
        int i11 = i6.Yh;
        h2Var.setCursorColor(i6.v0(i11, e6Var));
        h2Var.setHandlesColor(i6.v0(i11, e6Var));
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
        eaVar.addView(h2Var);
        h2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f45770c = (int) h2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        h2Var.addTextChangedListener(new f(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.e.contains(view)) {
            return;
        }
        m30 m30Var = (m30) view;
        if (m30Var.f26054y) {
            this.f45771f = null;
            ea eaVar = this.d;
            i iVar = (i) eaVar.f4608n;
            iVar.G = true;
            iVar.e.remove(m30Var);
            m30Var.setOnClickListener(null);
            eaVar.c();
            eaVar.f4606c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            eaVar.f4605b = animatorSet;
            animatorSet.addListener(new pk0(22, eaVar, m30Var));
            ArrayList arrayList = eaVar.h;
            arrayList.clear();
            arrayList.add(m30Var);
            ArrayList arrayList2 = eaVar.d;
            arrayList2.clear();
            eaVar.e.clear();
            arrayList2.add(m30Var);
            ArrayList arrayList3 = eaVar.f4607f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(m30Var, View.ALPHA, 1.0f, 0.0f));
            eaVar.requestLayout();
            hashSet.remove(Long.valueOf(m30Var.getUid()));
            runnable.run();
            return;
        }
        m30 m30Var2 = this.f45771f;
        if (m30Var2 != null) {
            m30Var2.a();
            this.f45771f = null;
        }
        this.f45771f = m30Var;
        m30Var.b();
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
            m30 m30Var = (m30) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(m30Var.getUid()))) {
                arrayList4.add(m30Var);
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
                    if (((m30) arrayList2.get(i11)).getUid() == longValue) {
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
                        m30 m30Var2 = new m30(getContext(), tL_help_country, null, true, this.f45768a);
                        m30Var2.setOnClickListener(new e(this, hashSet, runnable, 0));
                        arrayList5.add(m30Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            ea eaVar = this.d;
            ArrayList arrayList6 = eaVar.e;
            ArrayList arrayList7 = eaVar.d;
            ArrayList arrayList8 = eaVar.f4607f;
            i iVar = (i) eaVar.f4608n;
            iVar.G = true;
            ArrayList arrayList9 = iVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = eaVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((m30) arrayList4.get(i13)).setOnClickListener(null);
            }
            eaVar.c();
            if (z10) {
                eaVar.f4606c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                eaVar.f4605b = animatorSet;
                animatorSet.addListener(new h(eaVar, arrayList4, 0));
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
                    m30 m30Var3 = (m30) arrayList4.get(i14);
                    arrayList6.add(m30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(m30Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(m30Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(m30Var3, property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    m30 m30Var4 = (m30) arrayList5.get(i15);
                    arrayList7.add(m30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(m30Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(m30Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(m30Var4, property, 0.0f, 1.0f));
                }
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    eaVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                eaVar.f4605b = null;
                eaVar.f4606c = false;
                iVar.f45769b.setAllowDrawCursor(true);
            }
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                eaVar.addView((View) arrayList5.get(i17));
            }
            eaVar.requestLayout();
        }
        this.f45769b.setOnKeyListener(new g(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f45773r.e(canScrollVertically(-1));
        Matrix matrix = this.f45775w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f45774s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e7 = this.f45776x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f45777y.setLocalMatrix(matrix2);
        Paint paint2 = this.E;
        paint2.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f45769b;
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
        rect.top = y0.C(20.0f, this.H, rect.top);
        rect.bottom = y0.C(50.0f, this.H, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.I = f7;
        ea eaVar = this.d;
        if (eaVar != null) {
            eaVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f45772n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f45769b.setText(charSequence);
        this.h = false;
    }
}
