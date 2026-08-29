package sf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
public final class p extends FrameLayout {
    public final h5 f47916a;
    public final gh.s f47917b;
    public final h5 f47918c;
    public final c6 d;
    public boolean f47919e;
    public TL_account.TL_businessChatLink f47920f;

    public p(Context context, c6 c6Var) {
        super(context);
        int i10;
        int i11;
        this.d = c6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(g6.K(AndroidUtilities.dp(36.0f), g6.w0(null, g6.Oh, false)));
        imageView.setOnClickListener(new mh.n(this, 24));
        addView(imageView, f6.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.f47916a = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTextColor(g6.w0(null, g6.G6, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h5Var.setGravity(i10);
        addView(h5Var, f6.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        h5 h5Var2 = new h5(context);
        this.f47918c = h5Var2;
        h5Var2.setTextSize(14);
        int i12 = g6.f23450z6;
        h5Var2.setTextColor(g6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        h5Var2.setGravity(i11);
        addView(h5Var2, f6.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        gh.s sVar = new gh.s(context);
        this.f47917b = sVar;
        sVar.setTextSize(1, 13.0f);
        sVar.setMaxLines(1);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        sVar.setTextColor(g6.v0(i12, c6Var));
        sVar.setGravity(LocaleController.isRTL ? 5 : 3);
        sVar.f7459f = false;
        sVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, f6.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        super.onDraw(canvas);
        if (this.f47919e) {
            Paint T0 = g6.T0("paintDivider", this.d);
            if (T0 == null) {
                T0 = g6.f23183k0;
            }
            Paint paint = T0;
            float f10 = 64.0f;
            if (LocaleController.isRTL) {
                f9 = 0.0f;
            } else {
                f9 = 64.0f;
            }
            float dp = AndroidUtilities.dp(f9);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f10 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width - AndroidUtilities.dp(f10), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        h5 h5Var = this.f47918c;
        h5 h5Var2 = this.f47916a;
        if (z11) {
            h5Var2.setPadding(h5Var.getTextWidth(), 0, 0, 0);
        } else {
            h5Var2.setPadding(0, 0, h5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.f47919e ? 1 : 0), 1073741824));
    }
}
