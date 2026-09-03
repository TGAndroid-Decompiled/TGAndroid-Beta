package tf;

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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c9;
import vh.w2;
public final class x0 extends FrameLayout {
    public final f6 f44938a;
    public final c9 f44939b;
    public final TextView[] f44940c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f44941f;

    public x0(Context context, f6 f6Var) {
        super(context);
        int i10;
        this.f44940c = new TextView[2];
        this.d = new TextView[2];
        this.f44938a = f6Var;
        setWillNotDraw(false);
        c9 c9Var = new c9(this, false);
        this.f44939b = c9Var;
        c9Var.f23883l = true;
        c9Var.f23887p = AndroidUtilities.dp(75.0f);
        c9Var.f23886o = AndroidUtilities.dp(48.0f);
        c9Var.f23894x = true;
        c9Var.f23890s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f44940c[i11] = new TextView(context);
            this.f44940c[i11].setTextColor(j6.v0(j6.G6, f6Var));
            this.f44940c[i11].setTypeface(AndroidUtilities.bold());
            this.f44940c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f44940c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f44940c[i11], b6.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i11] = new TextView(context);
            this.d[i11].setTextColor(j6.v0(j6.f20273z6, f6Var));
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], b6.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.P5, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, b6.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(nh.f6 f6Var) {
        String str;
        c9 c9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = f6Var.f15560i;
            str = f6Var.D;
            int size = arrayList.size();
            c9Var = this.f44939b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) f6Var.f15560i.get(i10);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            c9Var.l(i11, messageObject.storyItem, f6Var.f15557c);
            i11++;
            i10++;
        }
        c9Var.k(i11);
        c9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f44940c;
        if (!isEmpty) {
            TextView textView = textViewArr[0];
            int i12 = f6Var.J;
            textView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", i12, "@" + str), j6.v0(j6.Oh, this.f44938a), null));
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
        TextView[] textViewArr = this.f44940c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, w2.e("@", str2)), j6.v0(j6.Oh, this.f44938a), null));
        } else {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.e), 0.0f);
        this.f44939b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.f44938a);
        if (T0 == null) {
            T0 = j6.f20000k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
