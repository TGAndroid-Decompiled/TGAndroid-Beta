package zf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.t8;
import th.r4;
import w7.b6;
public final class a1 extends FrameLayout {
    public final p6 f55439a;
    public final t8 f55440b;
    public final TextView[] f55441c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f55442f;

    public a1(Context context, p6 p6Var) {
        super(context);
        int i10;
        this.f55441c = new TextView[2];
        this.d = new TextView[2];
        this.f55439a = p6Var;
        setWillNotDraw(false);
        t8 t8Var = new t8(this, false);
        this.f55440b = t8Var;
        t8Var.f30487l = true;
        t8Var.f30491p = org.telegram.messenger.i0.L(75.0f);
        t8Var.f30490o = org.telegram.messenger.i0.L(48.0f);
        t8Var.f30498x = true;
        t8Var.f30494s = org.telegram.messenger.i0.L(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f55441c[i11] = new TextView(context);
            a7.V(this.f55441c[i11], t6.G6, p6Var);
            this.f55441c[i11].setTypeface(org.telegram.messenger.i0.o());
            this.f55441c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f55441c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f55441c[i11], b6.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i11] = new TextView(context);
            a7.V(this.d[i11], t6.f21330z6, p6Var);
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], b6.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView e = z20.e(context, 2131232058);
        a7.t(e, t6.P5, p6Var, PorterDuff.Mode.SRC_IN);
        addView(e, b6.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(r4 r4Var) {
        String str;
        t8 t8Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = r4Var.f49636i;
            str = r4Var.D;
            int size = arrayList.size();
            t8Var = this.f55440b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            jj jjVar = (jj) r4Var.f49636i.get(i10);
            long j10 = jjVar.f16341l.dialogId;
            TextUtils.isEmpty(str);
            t8Var.j(i11, r4Var.f49633c, jjVar.f16341l);
            i11++;
            i10++;
        }
        t8Var.i(i11);
        t8Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f55441c;
        if (!isEmpty) {
            textViewArr[0].setText(c(cd.K("HashtagStoriesFoundChannel", r4Var.J, ' ', sc.e.h("@", str))));
        } else {
            textViewArr[0].setText(cd.H(' ', "HashtagStoriesFound", r4Var.J));
        }
        this.d[0].setText(cd.a0(null, null, 2131749357, r4Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f55441c;
        if (!isEmpty) {
            textViewArr[1].setText(c(cd.K("HashtagMessagesFoundChannel", i10, ' ', sc.e.h("@", str2))));
        } else {
            textViewArr[1].setText(cd.H(' ', "HashtagMessagesFound", i10));
        }
        this.d[1].setText(cd.a0(null, null, 2131749366, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i10 = t6.Ci;
        p6 p6Var = this.f55439a;
        SpannableStringBuilder P2 = org.telegram.messenger.i0.P2(str, i10, p6Var, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) P2.getSpans(0, P2.length(), CharacterStyle.class);
            for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                int spanStart = P2.getSpanStart(characterStyleArr[i11]);
                int spanEnd = P2.getSpanEnd(characterStyleArr[i11]);
                P2.removeSpan(characterStyleArr[i11]);
                P2.setSpan(new l00(t6.Ci, p6Var), spanStart, spanEnd, 0);
            }
            return P2;
        } catch (Exception e) {
            f8.g(e, true);
            return P2;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(org.telegram.messenger.i0.W1(this.e, 0, -org.telegram.messenger.i0.L(62.0f)), 0.0f);
        this.f55440b.g(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint W0 = t6.W0("paintDivider", this.f55439a);
        if (W0 == null) {
            W0 = t6.f21052k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), W0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }
}
