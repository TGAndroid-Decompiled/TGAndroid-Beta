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
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.t8;
import th.r4;
import w7.b6;
public final class a1 extends FrameLayout {
    public final p6 f55457a;
    public final t8 f55458b;
    public final TextView[] f55459c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f55460f;

    public a1(Context context, p6 p6Var) {
        super(context);
        int i10;
        this.f55459c = new TextView[2];
        this.d = new TextView[2];
        this.f55457a = p6Var;
        setWillNotDraw(false);
        t8 t8Var = new t8(this, false);
        this.f55458b = t8Var;
        t8Var.f30559l = true;
        t8Var.f30563p = org.telegram.messenger.i0.L(75.0f);
        t8Var.f30562o = org.telegram.messenger.i0.L(48.0f);
        t8Var.f30570x = true;
        t8Var.f30566s = org.telegram.messenger.i0.L(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f55459c[i11] = new TextView(context);
            a7.V(this.f55459c[i11], t6.G6, p6Var);
            this.f55459c[i11].setTypeface(org.telegram.messenger.i0.o());
            this.f55459c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f55459c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f55459c[i11], b6.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i11] = new TextView(context);
            a7.V(this.d[i11], t6.f21331z6, p6Var);
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], b6.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView e = a30.e(context, 2131232058);
        a7.t(e, t6.P5, p6Var, PorterDuff.Mode.SRC_IN);
        addView(e, b6.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(r4 r4Var) {
        String str;
        t8 t8Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = r4Var.f49650i;
            str = r4Var.D;
            int size = arrayList.size();
            t8Var = this.f55458b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            kj kjVar = (kj) r4Var.f49650i.get(i10);
            long j10 = kjVar.f16694l.dialogId;
            TextUtils.isEmpty(str);
            t8Var.j(i11, r4Var.f49647c, kjVar.f16694l);
            i11++;
            i10++;
        }
        t8Var.i(i11);
        t8Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f55459c;
        if (!isEmpty) {
            textViewArr[0].setText(c(dd.K("HashtagStoriesFoundChannel", r4Var.J, ' ', sc.e.h("@", str))));
        } else {
            textViewArr[0].setText(dd.H(' ', "HashtagStoriesFound", r4Var.J));
        }
        this.d[0].setText(dd.a0(null, null, 2131749357, r4Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f55459c;
        if (!isEmpty) {
            textViewArr[1].setText(c(dd.K("HashtagMessagesFoundChannel", i10, ' ', sc.e.h("@", str2))));
        } else {
            textViewArr[1].setText(dd.H(' ', "HashtagMessagesFound", i10));
        }
        this.d[1].setText(dd.a0(null, null, 2131749366, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i10 = t6.Ci;
        p6 p6Var = this.f55457a;
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
        this.f55458b.g(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint W0 = t6.W0("paintDivider", this.f55457a);
        if (W0 == null) {
            W0 = t6.f21053k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), W0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }
}
