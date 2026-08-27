package pf;

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
import h7.z5;
import java.util.ArrayList;
import jh.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a9;

public final class x0 extends FrameLayout {

    public final c6 f45962a;

    public final a9 f45963b;

    public final TextView[] f45964c;
    public final TextView[] d;

    public float f45965e;

    public ValueAnimator f45966f;

    public x0(Context context, c6 c6Var) {
        super(context);
        this.f45964c = new TextView[2];
        this.d = new TextView[2];
        this.f45962a = c6Var;
        setWillNotDraw(false);
        a9 a9Var = new a9(this, false);
        this.f45963b = a9Var;
        a9Var.f26671l = true;
        a9Var.f26675p = AndroidUtilities.dp(75.0f);
        a9Var.f26674o = AndroidUtilities.dp(48.0f);
        a9Var.f26682x = true;
        a9Var.f26678s = AndroidUtilities.dp(22.0f);
        int i10 = 0;
        while (i10 < 2) {
            this.f45964c[i10] = new TextView(context);
            this.f45964c[i10].setTextColor(g6.v0(g6.G6, c6Var));
            this.f45964c[i10].setTypeface(AndroidUtilities.bold());
            this.f45964c[i10].setTextSize(1, 14.0f);
            int i11 = 8;
            this.f45964c[i10].setVisibility(i10 == 0 ? 0 : 8);
            addView(this.f45964c[i10], z5.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i10] = new TextView(context);
            this.d[i10].setTextColor(g6.v0(g6.f23441z6, c6Var));
            this.d[i10].setTextSize(1, 12.0f);
            TextView textView = this.d[i10];
            if (i10 == 0) {
                i11 = 0;
            }
            textView.setVisibility(i11);
            addView(this.d[i10], z5.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i10++;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.P5, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, z5.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(d6 d6Var) {
        String str;
        a9 a9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = d6Var.f13540i;
            str = d6Var.D;
            int size = arrayList.size();
            a9Var = this.f45963b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) d6Var.f13540i.get(i10);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            a9Var.l(i11, messageObject.storyItem, d6Var.f13536c);
            i11++;
            i10++;
        }
        a9Var.k(i11);
        a9Var.b(false, true);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f45964c;
        if (zIsEmpty) {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", d6Var.J));
        } else {
            textViewArr[0].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", d6Var.J, "@" + str), g6.v0(g6.Oh, this.f45962a), null));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, d6Var.C));
        return i11 > 0;
    }

    public final void b(int i10, String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f45964c;
        if (zIsEmpty) {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        } else {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, s3.c.e("@", str2)), g6.v0(g6.Oh, this.f45962a), null));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f45965e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f45965e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.f45965e), 0.0f);
        this.f45963b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint paintT0 = g6.T0("paintDivider", this.f45962a);
        if (paintT0 == null) {
            paintT0 = g6.f23175k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), paintT0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
