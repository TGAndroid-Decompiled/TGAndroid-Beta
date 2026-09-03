package uf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import k7.c6;
import oh.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.c9;
import org.telegram.ui.yh;
public final class x0 extends FrameLayout {
    public final g6 f48770a;
    public final c9 f48771b;
    public final TextView[] f48772c;
    public final TextView[] d;
    public float f48773e;
    public ValueAnimator f48774f;

    public x0(Context context, g6 g6Var) {
        super(context);
        int i10;
        this.f48772c = new TextView[2];
        this.d = new TextView[2];
        this.f48770a = g6Var;
        setWillNotDraw(false);
        c9 c9Var = new c9(this, false);
        this.f48771b = c9Var;
        c9Var.f25849l = true;
        c9Var.f25853p = AndroidUtilities.dp(75.0f);
        c9Var.f25852o = AndroidUtilities.dp(48.0f);
        c9Var.f25860x = true;
        c9Var.f25856s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f48772c[i11] = new TextView(context);
            this.f48772c[i11].setTextColor(k6.v0(k6.G6, g6Var));
            this.f48772c[i11].setTypeface(AndroidUtilities.bold());
            this.f48772c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f48772c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f48772c[i11], c6.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i11] = new TextView(context);
            this.d[i11].setTextColor(k6.v0(k6.f22055z6, g6Var));
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], c6.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.P5, g6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, c6.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(f6 f6Var) {
        String str;
        c9 c9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = f6Var.f17404i;
            str = f6Var.D;
            int size = arrayList.size();
            c9Var = this.f48771b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) f6Var.f17404i.get(i10);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            c9Var.l(i11, messageObject.storyItem, f6Var.f17400c);
            i11++;
            i10++;
        }
        c9Var.k(i11);
        c9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f48772c;
        if (!isEmpty) {
            TextView textView = textViewArr[0];
            int i12 = f6Var.J;
            textView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", i12, "@" + str), k6.v0(k6.Oh, this.f48770a), null));
        } else {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", f6Var.J));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, f6Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f48772c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, yh.k("@", str2)), k6.v0(k6.Oh, this.f48770a), null));
        } else {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48773e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f48773e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.f48773e), 0.0f);
        this.f48771b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint T0 = k6.T0("paintDivider", this.f48770a);
        if (T0 == null) {
            T0 = k6.f21781k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
