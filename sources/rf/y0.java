package rf;

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
import i7.f6;
import java.util.ArrayList;
import lh.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g9;
public final class y0 extends FrameLayout {
    public final c6 f47403a;
    public final g9 f47404b;
    public final TextView[] f47405c;
    public final TextView[] d;
    public float f47406e;
    public ValueAnimator f47407f;

    public y0(Context context, c6 c6Var) {
        super(context);
        int i10;
        this.f47405c = new TextView[2];
        this.d = new TextView[2];
        this.f47403a = c6Var;
        setWillNotDraw(false);
        g9 g9Var = new g9(this, false);
        this.f47404b = g9Var;
        g9Var.f28832l = true;
        g9Var.f28836p = AndroidUtilities.dp(75.0f);
        g9Var.f28835o = AndroidUtilities.dp(48.0f);
        g9Var.f28843x = true;
        g9Var.f28839s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f47405c[i11] = new TextView(context);
            this.f47405c[i11].setTextColor(g6.v0(g6.G6, c6Var));
            this.f47405c[i11].setTypeface(AndroidUtilities.bold());
            this.f47405c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f47405c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f47405c[i11], f6.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i11] = new TextView(context);
            this.d[i11].setTextColor(g6.v0(g6.f23450z6, c6Var));
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], f6.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.P5, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, f6.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(e6 e6Var) {
        String str;
        g9 g9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = e6Var.f15838i;
            str = e6Var.D;
            int size = arrayList.size();
            g9Var = this.f47404b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) e6Var.f15838i.get(i10);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            g9Var.l(i11, messageObject.storyItem, e6Var.f15834c);
            i11++;
            i10++;
        }
        g9Var.k(i11);
        g9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f47405c;
        if (!isEmpty) {
            TextView textView = textViewArr[0];
            int i12 = e6Var.J;
            textView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", i12, "@" + str), g6.v0(g6.Oh, this.f47403a), null));
        } else {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", e6Var.J));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, e6Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f47405c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, u3.c.e("@", str2)), g6.v0(g6.Oh, this.f47403a), null));
        } else {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f47406e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f47406e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.f47406e), 0.0f);
        this.f47404b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint T0 = g6.T0("paintDivider", this.f47403a);
        if (T0 == null) {
            T0 = g6.f23183k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
